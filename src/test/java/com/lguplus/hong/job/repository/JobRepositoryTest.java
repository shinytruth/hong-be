package com.lguplus.hong.job.repository;

import com.lguplus.hong.job.entity.Job;
import java.sql.Timestamp;
import java.time.Instant;
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
            .content("인증서 도와주세요")
            .requestTime(Timestamp.from(Instant.now()))
            .requestAddress("서울 양천구")
            .silverId(1L)
            .memberId(1L)
            .status("진행중")
            .build());

        jobRepository.save(Job.builder()
            .categoryId(1L)
            .content("인증서 도와주세요")
            .requestTime(Timestamp.from(Instant.now()))
            .requestAddress("서울 양천구")
            .silverId(2L)
            .memberId(2L)
            .status("진행중")
            .build());

        jobRepository.save(Job.builder()
            .categoryId(2L)
            .content("인증서 도와주세요")
            .requestTime(Timestamp.from(Instant.now()))
            .requestAddress("서울 양천구")
            .silverId(3L)
            .memberId(3L)
            .status("진행중")
            .build());

        jobRepository.save(Job.builder()
            .categoryId(3L)
            .content("인증서 도와주세요")
            .requestTime(Timestamp.from(Instant.now()))
            .requestAddress("서울 양천구")
            .silverId(4L)
            .memberId(4L)
            .status("진행중")
            .build());

    }
}