package com.lguplus.hong.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Silver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String phoneNumber;

    private String address;

    private Long memberId;

    public Silver(String name, String phoneNumber, String address, Long memberId) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.memberId = memberId;
    }
}
