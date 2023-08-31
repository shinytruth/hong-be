package com.lguplus.hong.job.controller;

import com.lguplus.hong.job.dto.ApplicantDetailDTO;
import com.lguplus.hong.job.entity.Applicant;
import com.lguplus.hong.job.service.ApplicantService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/apply")
public class ApplicantController {

    private final ApplicantService applicantService;

    @GetMapping("/{jobId}")
    public List<ApplicantDetailDTO> getApplicant(@PathVariable String jobId) {
        return applicantService.getApplicant(Long.parseLong(jobId));
    }

    @PostMapping()
    public Applicant applyJob(@RequestParam String jobId, @RequestParam String hongId) {
        return applicantService.applyJob(Long.parseLong(jobId), Long.parseLong(hongId));
    }

}
