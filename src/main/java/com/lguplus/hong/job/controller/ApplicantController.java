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

    @GetMapping("/{applyId}")
    public List<ApplicantDetailDTO> getApplicant(@PathVariable String applyId) {
        return applicantService.getApplicant(Long.parseLong(applyId));
    }

    @PostMapping()
    public Applicant applyJob(@RequestParam String jobId, @RequestParam String hongId) {
        return applicantService.applyJob(Long.parseLong(jobId), Long.parseLong(hongId));
    }

}
