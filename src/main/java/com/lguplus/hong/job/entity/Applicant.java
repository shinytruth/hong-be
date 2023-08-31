package com.lguplus.hong.job.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Applicant {

    @Id
    private String id;

    private String jobId;

    private String hongId;

}
