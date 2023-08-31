package com.lguplus.hong.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Member {

    @Id
    private String id;

    private String name;

    private String phoneNumber;

    private String address;

}
