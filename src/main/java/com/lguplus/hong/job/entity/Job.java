package com.lguplus.hong.job.entity;

import com.lguplus.hong.job.constant.JobStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.sql.Timestamp;
import lombok.Getter;

@Entity
@Getter
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
