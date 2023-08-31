package com.lguplus.hong.job.dto;

import com.lguplus.hong.job.entity.Job;

public interface JobMapper {

    JobDetailDTO mapToJobDetail(Job job);

}
