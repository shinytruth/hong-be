package com.lguplus.hong.job.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class IncompleteJobDTO {

    private String jobId;
    private String memberName;
    private String categoryName;
    private String hongName;
    private String status;

}
