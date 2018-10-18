package com.pivaiot.starter.project.common.exception;

public class DefaultException extends RuntimeException {

    private ErrorCode errorCode;

    public DefaultException() {
        super();
    }

    public DefaultException(ErrorCode errorCode) {
        super(errorCode.getErrorCode());
        this.errorCode = errorCode;
    }

    public DefaultException(String message, ErrorCode errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public DefaultException(String message, Throwable cause, ErrorCode errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public DefaultException(Throwable cause, ErrorCode errorCode) {
        super(cause);
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

}
