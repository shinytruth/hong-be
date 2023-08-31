package com.lguplus.hong.job.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.sql.Timestamp;
import lombok.Builder;
import lombok.Getter;

@Entity
@Getter
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long categoryId;

    private String content;

    private Timestamp requestTime;

    private String status;

    private Long memberId;

    private Long silverId;

    private String requestAddress;

    private Long hongId;

    private Long agentId;

    @Builder
    public Job(Long categoryId, String content, Timestamp requestTime, String status, Long memberId,
        Long silverId, String requestAddress, Long hongId, Long agentId) {
        this.categoryId = categoryId;
        this.content = content;
        this.requestTime = requestTime;
        this.status = status;
        this.memberId = memberId;
        this.silverId = silverId;
        this.requestAddress = requestAddress;
        this.hongId = hongId;
        this.agentId = agentId;
    }
}
