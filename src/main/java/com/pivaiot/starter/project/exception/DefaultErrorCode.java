package com.pivaiot.starter.project.exception;


import com.pivaiot.common.exception.ErrorCode;

public enum DefaultErrorCode implements ErrorCode {
    UNKNOWN(100001),
    NOT_FOUND(100404);

    private Integer id;

    DefaultErrorCode(Integer id) {
        this.id = id;
    }

    @Override
    public String getErrorCode() {
        return toString();
    }

    public Integer getId() {
        return id;
    }
}
