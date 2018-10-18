package com.pivaiot.starter.project.common.data;

/**
 * Entity to DTO interface.
 *
 * @param <T> dto type
 */
public interface ToData<T> {
    T toData();
}
