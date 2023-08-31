package com.lguplus.hong.job.repository;

import com.lguplus.hong.job.entity.Applicant;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantRepository extends JpaRepository<Applicant, Long> {

    List<Applicant> findByJobId(Long jobId);

}
