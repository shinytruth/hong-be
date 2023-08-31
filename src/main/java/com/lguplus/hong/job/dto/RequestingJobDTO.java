package com.lguplus.hong.job.dto;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Builder
public class RequestingJobDTO {

    private String jobId;
    private String content;
    private Timestamp requestTime;

}
