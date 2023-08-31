package com.lguplus.hong.job.controller;

import com.lguplus.hong.job.dto.JobCreateDTO;
import com.lguplus.hong.job.dto.JobDetailDTO;
import com.lguplus.hong.job.service.JobService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jobs")
@RequiredArgsConstructor
public class JobController {

    private final JobService jobService;

    @GetMapping("/agent")
    public List<JobDetailDTO> getIncompleteJobList() {
        return jobService.getIncompleteJobList();
    }

    @GetMapping("/hong")
    public List<JobDetailDTO> getRequestingJobList() {
        return jobService.getRequestingJobList();
    }

    @GetMapping("/hong/{hongId}")
    public List<JobDetailDTO> getJobListByHongId(@PathVariable String hongId) {
        return jobService.getJobListByHongId(Long.parseLong(hongId));
    }

    @GetMapping("/{jobId}")
    public JobDetailDTO getJobDetail(@PathVariable String jobId) {
        return jobService.getJobDetail(Long.parseLong(jobId));
    }

    @PostMapping()
    public void createJob(@RequestBody JobCreateDTO jobCreateDTO) {
        jobService.createJob(jobCreateDTO);
    }

    public void modifyJobStatus() {

    }


}
