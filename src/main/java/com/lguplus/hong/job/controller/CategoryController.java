package com.lguplus.hong.job.controller;

import com.lguplus.hong.common.dto.DataResponse;
import com.lguplus.hong.job.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/category")
public class CategoryController {

    private final CategoryRepository categoryRepository;

    @GetMapping("")
    public DataResponse getApplicant(@PathVariable String jobId) {
        return new DataResponse(categoryRepository.findAll());
    }

}
