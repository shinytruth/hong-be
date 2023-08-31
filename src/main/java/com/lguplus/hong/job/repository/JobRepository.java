package com.lguplus.hong.job.repository;

import com.lguplus.hong.job.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {

    List<Job> findByHongId(Long hongId);
    List<Job> findByHongIdAndStatus(Long hongId, String status);
    List<Job> findByStatusIn(List<String> statusList);

}
