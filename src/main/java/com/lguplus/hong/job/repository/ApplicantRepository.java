package com.lguplus.hong.job.repository;

import com.lguplus.hong.job.entity.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApplicantRepository extends JpaRepository<Applicant, String> {

    List<Applicant> findByJobId(String jobId);

}
