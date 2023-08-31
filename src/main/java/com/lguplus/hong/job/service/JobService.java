package com.lguplus.hong.job.service;

import com.lguplus.hong.job.dto.JobCreateDTO;
import com.lguplus.hong.job.dto.JobDetailDTO;
import com.lguplus.hong.job.dto.JobMapper;
import com.lguplus.hong.job.entity.Job;
import com.lguplus.hong.job.repository.JobRepository;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.lguplus.hong.user.entity.Silver;
import com.lguplus.hong.user.repository.SilverRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;


@Service
@RequiredArgsConstructor
public class JobService {

    private final JobRepository jobRepository;
    private final SilverRepository silverRepository;

    private final JobMapper jobMapper;

    public List<JobDetailDTO> getAll() {
        List<Job> jobList = jobRepository.findAll();
        return jobList.stream()
            .map(o -> jobMapper.mapToJobDetail(o))
            .collect(Collectors.toList());
    }


    public List<JobDetailDTO> getIncompleteJobList() {
        List<Job> jobList = jobRepository.findByStatusIn(Arrays.asList("R", "P"));
        return jobList.stream()
            .map(o -> jobMapper.mapToJobDetail(o))
            .collect(Collectors.toList());
    }

    public List<JobDetailDTO> getRequestingJobList() {
        List<Job> jobList = jobRepository.findByStatusIn(Arrays.asList("R")); //R:요청
        return jobList.stream()
            .map(o -> jobMapper.mapToJobDetail(o))
            .collect(Collectors.toList());
    }

    public List<JobDetailDTO> getJobListByHongId(Long hongId) {
        List<Job> jobList = jobRepository.findByHongIdAndStatus(hongId, "P"); //P:진행중
        return jobList.stream()
            .map(o -> jobMapper.mapToJobDetail(o))
            .collect(Collectors.toList());
    }

    public JobDetailDTO getJobDetail(@PathVariable Long jobId) {
        Optional<Job> job = jobRepository.findById(jobId);
        if (job.isEmpty()) {
            return null;
        }

        return jobMapper.mapToJobDetail(job.get());
    }

    @Transactional
    public void createJob(JobCreateDTO dto) {

        System.out.println(dto);
        Silver silver = silverRepository.findByPhoneNumber(dto.getSilverPhoneNumber());

        jobRepository.save(Job.builder()
            .categoryId(dto.getCategoryId())
            .content(dto.getContent())
            .requestAddress(dto.getRequestAddress())
            .silverId(silver.getId())
            .memberId(dto.getMemberId())
            .status("R")
            .build());
    }

    public Job assignJobToHong(Long jobId, Long hongId) {
        Job job = jobRepository.findById(jobId).get();
        job.modifyStatusAndHongId("P", hongId); //P:진행중
        return jobRepository.save(job);
    }

}
