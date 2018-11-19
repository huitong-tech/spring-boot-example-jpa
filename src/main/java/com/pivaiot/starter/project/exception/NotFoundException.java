package com.pivaiot.starter.project.exception;


import com.pivaiot.common.exception.DefaultException;

public class NotFoundException extends DefaultException {
    public NotFoundException() {
        super(ErrorCodeEnum.NOT_FOUND);
    }

    public NotFoundException(String message) {
        super(message, ErrorCodeEnum.NOT_FOUND);
    }
}
