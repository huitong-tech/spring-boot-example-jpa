package com.pivaiot.starter.project.common.data;


import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
public abstract class BaseIdAndTimeData extends BaseIdData {
    private Date createdTime;
    private Date updatedTime;
}
