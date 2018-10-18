package com.pivaiot.starter.project.common.http;


import com.pivaiot.starter.project.common.exception.DefaultException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseJson<T> {
    private T data;
    private String code;
    private String message;
    private Object meta;

    public ResponseJson(T data) {
        this.data = data;
    }

    public static <T> ResponseJson<T> ok(T data) {
        return new ResponseJson<>(data);
    }

    public static ResponseJson ok() {
        return new ResponseJson();
    }

    @SuppressWarnings("unchecked")
    public static ResponseJson err(String name, DefaultException e) {
        return new ResponseJson(null, name + "-" + e.getErrorCode(), e.getMessage(), null);
    }

    public static ResponseJson err(String name) {
        return err(name, new DefaultException());
    }
}
