package com.lguplus.hong.job.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
public class JobDetailDTO {

    private String jobId;
    private String categoryName;
    private String content;
    private String requestAddress;
    private Timestamp requestTime;
    private String silverPhoneNumber;
    private String memberPhoneNumber;

}
