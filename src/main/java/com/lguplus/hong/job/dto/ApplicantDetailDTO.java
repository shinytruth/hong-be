package com.lguplus.hong.job.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApplicantDetailDTO {

    private String jobId;
    private String hongId;
    private String hongName;
    private String hongRate;

}
