package com.pivaiot.starter.project.common.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface Limit {

    String name() default "limit";

    boolean required() default false;

    String defaultValue() default "10";
}
