package com.lguplus.hong.job.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum JobStatus {

    R("요청"),
    P("진행중"),
    C("완료");

    private String detail;

}
