package com.pivaiot.starter.project.data.hello;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Greeting {

    private String says;

}
