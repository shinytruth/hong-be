package com.lguplus.hong.user.repository;

import com.lguplus.hong.user.entity.Silver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SilverRepository extends JpaRepository<Silver, Long> {

}
