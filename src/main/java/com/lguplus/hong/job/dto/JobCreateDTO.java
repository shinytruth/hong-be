package com.lguplus.hong.job.dto;

import com.lguplus.hong.job.constant.JobStatus;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class JobCreateDTO {

    private String categoryId;
    private String content;
    private Timestamp timestamp;
    private String memberId;
    private String silverId;
    private String requestAddress;

}
