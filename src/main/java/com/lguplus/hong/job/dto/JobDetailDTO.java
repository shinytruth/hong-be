package com.lguplus.hong.job.dto;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Builder
public class JobDetailDTO {

    private Long jobId;
    private String memberName;
    private String categoryName;
    private String hongName;
    private String content;
    private String requestAddress;
    private Timestamp requestTime;
    private String silverPhoneNumber;
    private String memberPhoneNumber;
    private String status;

}
