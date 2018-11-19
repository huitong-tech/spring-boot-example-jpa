package com.pivaiot.starter.project.service.data;

import com.pivaiot.common.model.BaseIdAndTimeModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseIdAndTimeModel {

    private String username;

    private String intro;

    private Date createdTime;

    private Date updatedTime;

}
