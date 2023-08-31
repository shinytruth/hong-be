package com.lguplus.hong.job.controller;

import com.lguplus.hong.job.dto.ApplicantDetailDTO;
import com.lguplus.hong.job.service.ApplicantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/apply")
public class ApplicantController {

    private final ApplicantService applicantService;

    @GetMapping("/{jobId}")
    public List<ApplicantDetailDTO> getApplicant(@PathVariable String jobId) {
        return applicantService.getApplicant(jobId);
    }

}
