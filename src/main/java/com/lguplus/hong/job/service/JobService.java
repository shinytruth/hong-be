package com.lguplus.hong.job.service;

import com.lguplus.hong.job.dto.*;
import com.lguplus.hong.job.entity.Job;
import com.lguplus.hong.job.repository.CategoryRepository;
import com.lguplus.hong.job.repository.JobRepository;
import com.lguplus.hong.user.repository.MemberRepository;
import com.lguplus.hong.user.repository.StaffRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class JobService {

    private final JobRepository jobRepository;
    private final CategoryRepository categoryRepository;
    private final MemberRepository memberRepository;
    private final StaffRepository staffRepository;

    public List<JobDTO> getIncompleteJobList() {
        return null;
    }

    public List<JobDTO> getRequestingJobList() {
        return null;
    }

    public List<JobDTO> getJobListByHongId(@RequestParam String hongId) {
        List<Job> jobList = jobRepository.findByHongId(hongId);
        return jobList.stream()
                .map(o -> mapJobToJobDto(o))
                .collect(Collectors.toList());
    }

    private JobDTO mapJobToJobDto(Job job) {
        return null;
    }

    public JobDetailDTO getJobDetail(@PathVariable String jobId) {
        return null;
    }

    public void createJob(@RequestBody JobCreateDTO jobCreateDTO) {

    }

}
