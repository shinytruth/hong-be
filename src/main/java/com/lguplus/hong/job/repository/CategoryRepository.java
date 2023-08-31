package com.lguplus.hong.job.repository;

import com.lguplus.hong.job.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
