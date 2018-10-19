package com.pivaiot.starter.project.data.hello;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Greeting {

    private String says;

    private String lang = "zh-CN";

    private Date createdTime;

    private Date updatedTime;

}
