package com.lguplus.hong.job.dto;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Builder
public class JobDTO {

    private String jobId;
    private String memberName;
    private String categoryName;
    private String hongName;
    private String status;

    private String content;
    private Timestamp requestTime;

}
