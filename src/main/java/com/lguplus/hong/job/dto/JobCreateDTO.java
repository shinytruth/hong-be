package com.lguplus.hong.job.dto;

import com.lguplus.hong.job.constant.JobStatus;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class JobCreateDTO {

    private Long categoryId;
    private String content;
    private Timestamp timestamp;
    private Long memberId;
    private String silverPhoneNumber;
    private String requestAddress;

}
