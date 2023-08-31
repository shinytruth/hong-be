package com.lguplus.hong.job.entity;

import com.lguplus.hong.job.constant.JobStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

import java.sql.Timestamp;

@Entity
@Getter
public class Job {

    @Id
    private String id;

    private String categoryId;

    private String content;

    private Timestamp timestamp;

    private JobStatus status;

    private String memberId;

    private String silverId;

    private String requestAddress;

    private String hongId;

    private String agentId;

}
