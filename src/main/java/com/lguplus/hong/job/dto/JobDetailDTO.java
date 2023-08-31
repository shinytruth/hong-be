package com.lguplus.hong.job.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Builder
public class JobDetailDTO {

    private String jobId;
    private String memberName;
    private String categoryName;
    private String hongName;
    private String content;
    private String requestAddress;
    private Timestamp requestTime;
    private String silverPhoneNumber;
    private String memberPhoneNumber;

}
