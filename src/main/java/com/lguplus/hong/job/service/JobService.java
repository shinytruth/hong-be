package com.lguplus.hong.job.service;

import com.lguplus.hong.job.dto.*;
import com.lguplus.hong.job.entity.Job;
import com.lguplus.hong.job.repository.JobRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class JobService {

    private final JobRepository jobRepository;

    private final JobMapper jobMapper;

    public List<JobDetailDTO> getIncompleteJobList() {
        List<Job> jobList = jobRepository.findByStatusIn(Arrays.asList("R", "P"));
        return jobList.stream()
                .map(o -> jobMapper.mapToJobDetail(o))
                .collect(Collectors.toList());
    }

    public List<JobDetailDTO> getRequestingJobList() {
        List<Job> jobList = jobRepository.findByStatusIn(Arrays.asList("R"));
        return jobList.stream()
                .map(o -> jobMapper.mapToJobDetail(o))
                .collect(Collectors.toList());
    }

    public List<JobDetailDTO> getJobListByHongId(Long hongId) {
        List<Job> jobList = jobRepository.findByHongId(hongId);
        return jobList.stream()
                .map(o -> jobMapper.mapToJobDetail(o))
                .collect(Collectors.toList());
    }

    public JobDetailDTO getJobDetail(@PathVariable Long jobId) {
        Optional<Job> job = jobRepository.findById(jobId);
        if (job.isEmpty()) return null;

        return jobMapper.mapToJobDetail(job.get());
    }

    public void createJob(@RequestBody JobCreateDTO jobCreateDTO) {

    }

}
