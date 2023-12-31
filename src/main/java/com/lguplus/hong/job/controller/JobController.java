package com.lguplus.hong.job.controller;

import com.lguplus.hong.common.dto.CommonResponse;
import com.lguplus.hong.common.dto.DataResponse;
import com.lguplus.hong.job.dto.JobCreateDTO;
import com.lguplus.hong.job.dto.JobDetailDTO;
import com.lguplus.hong.job.entity.Job;
import com.lguplus.hong.job.service.JobService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jobs")
@RequiredArgsConstructor
public class JobController {

    private final JobService jobService;

    @GetMapping()
    public DataResponse getAll() {
        return new DataResponse(jobService.getAll());
    }


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
    public CommonResponse createJob(@RequestBody JobCreateDTO jobCreateDTO) {
        jobService.createJob(jobCreateDTO);
        return CommonResponse.ok();
    }

    @PostMapping("/assign")
    public Job assignJobToHong(@RequestParam String jobId, @RequestParam String hongId) {
        return jobService.assignJobToHong(Long.parseLong(jobId), Long.parseLong(hongId));
    }


}
