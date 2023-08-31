package com.lguplus.hong.job.repository;

import com.lguplus.hong.job.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<Job, String> {

    List<Job> findByHongId(String hongId);
    List<Job> findByStatusIn(List<String> status);

}
