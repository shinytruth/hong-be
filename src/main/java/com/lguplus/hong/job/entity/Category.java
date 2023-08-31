package com.lguplus.hong.job.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Category {

    @Id
    private String id;

    private String name;

    private String description;

    private String image;

}
