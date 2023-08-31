package com.lguplus.hong.common.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DataResponse extends CommonResponse {

    private Object data;

    public DataResponse(Object data) {
        super(ResponseCode.OK);
        this.data = data;
    }

}
