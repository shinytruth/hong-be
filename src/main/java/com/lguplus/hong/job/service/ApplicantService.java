package com.lguplus.hong.job.service;

import com.lguplus.hong.job.dto.ApplicantDetailDTO;
import com.lguplus.hong.job.dto.ApplicantMapper;
import com.lguplus.hong.job.entity.Applicant;
import com.lguplus.hong.job.repository.ApplicantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ApplicantService {

    private final ApplicantRepository applicantRepository;

    private final ApplicantMapper applicantMapper;

    public List<ApplicantDetailDTO> getApplicant(Long jobId) {
        List<Applicant> applicantList = applicantRepository.findByJobId(jobId);

        return applicantList.stream()
                .map(o -> applicantMapper.mapToApplicantDetail(o))
                .collect(Collectors.toList());
    }

}
