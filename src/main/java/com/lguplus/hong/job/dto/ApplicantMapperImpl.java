package com.lguplus.hong.job.dto;

import com.lguplus.hong.job.entity.Applicant;
import com.lguplus.hong.user.entity.Staff;
import com.lguplus.hong.user.repository.StaffRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ApplicantMapperImpl implements ApplicantMapper {

    private final StaffRepository staffRepository;

    public ApplicantDetailDTO mapToApplicantDetail(Applicant applicant) {
        Staff hong = staffRepository.findById(applicant.getHongId()).get();
        String hongName = hong.getName();
        String hongRate = hong.getRate();

        return ApplicantDetailDTO.builder()
                .jobId(applicant.getJobId())
                .hongId(applicant.getHongId())
                .hongName(hongName)
                .hongRate(hongRate)
                .build();
    }

}
