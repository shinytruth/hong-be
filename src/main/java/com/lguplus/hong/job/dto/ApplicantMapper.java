package com.lguplus.hong.job.dto;

import com.lguplus.hong.job.entity.Applicant;

public interface ApplicantMapper {

    ApplicantDetailDTO mapToApplicantDetail(Applicant applicant);

}
