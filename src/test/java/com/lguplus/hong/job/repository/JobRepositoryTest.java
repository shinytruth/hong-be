package com.lguplus.hong.job.repository;

import static org.junit.jupiter.api.Assertions.*;

import com.lguplus.hong.job.entity.Job;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@Disabled
class JobRepositoryTest {

    @Autowired
    JobRepository jobRepository;


    @Test
    @Rollback(false)
    void createJob() {
        jobRepository.save(Job.builder()
                .categoryId(1L)

            .build());

    }
}