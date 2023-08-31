package com.lguplus.hong.job.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategorylDTO {

    private Long jobId;
    private Long hongId;
    private String hongName;
    private String hongRate;

}
