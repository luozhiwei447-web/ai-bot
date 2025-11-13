package com.ray.crypto.common.exception;

import com.ray.crypto.common.constants.ResultCode;
import lombok.Getter;

/**
 * 通用异常
 * 
 * @author ray
 * @date 2024-11-13
 */
@Getter
public class CommonException extends Exception {

    private final ResultCode code;

    public CommonException(ResultCode code) {
        super(code.getMessage());
        this.code = code;
    }

    public CommonException(ResultCode code, String message) {
        super(message);
        this.code = code;
    }

    public CommonException(String message) {
        super(message);
        this.code = ResultCode.SYSTEM_ERROR;
    }
}