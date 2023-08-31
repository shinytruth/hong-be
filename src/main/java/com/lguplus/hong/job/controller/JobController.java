package com.lguplus.hong.job.controller;

import com.lguplus.hong.job.dto.*;
import com.lguplus.hong.job.service.JobService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
        return jobService.getJobListByHongId(hongId);
    }

    @GetMapping("/{jobId}")
    public JobDetailDTO getJobDetail(@PathVariable String jobId) {
        return jobService.getJobDetail(jobId);
    }

    @PostMapping()
    public void createJob(@RequestBody JobCreateDTO jobCreateDTO) {
        jobService.createJob(jobCreateDTO);
    }

    public void modifyJobStatus() {

    }


}
