package com.lguplus.hong.user.entity;

import com.lguplus.hong.user.constant.StaffRole;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Staff {

    @Id
    private String id;

    private String name;

    private StaffRole role;

}
