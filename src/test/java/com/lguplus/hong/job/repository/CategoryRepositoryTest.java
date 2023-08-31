package com.lguplus.hong.job.repository;

import com.lguplus.hong.job.entity.Category;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;


@SpringBootTest
@Transactional
class CategoryRepositoryTest {


    @Autowired
    CategoryRepository categoryRepository;

    @Test
    @Rollback(false)
    void createCategory() {
        categoryRepository.save(new Category(UUID.randomUUID(), "공인인증서 발급", "공인인증서 발급을 도와드려요!",
            "https://mbti-hong-bucket.s3.ap-southeast-2.amazonaws.com/cate-01.png"));
        categoryRepository.save(new Category("울산페이", "울산페이 등록을 도와드려요!",
            "https://mbti-hong-bucket.s3.ap-southeast-2.amazonaws.com/cate-02.png"));
        categoryRepository.save(new Category("프린트", "프린트 하시는 것을 도와드려요!!",
            "https://mbti-hong-bucket.s3.ap-southeast-2.amazonaws.com/cate-03.png"));
    }
}