package com.pivaiot.example.jpa.web.converter;

import com.pivaiot.common.lang.util.BeanUtil;
import com.pivaiot.example.jpa.service.data.User;
import com.pivaiot.example.jpa.web.model.UserModel;

import java.util.List;
import java.util.stream.Collectors;

public class UserConverter {

    public static UserModel toData(User user) {
        UserModel userModel = new UserModel();
        BeanUtil.copyProperties(user, userModel);
        return userModel;
    }

    public static List<UserModel> toDataList(List<User> userList) {
        return userList.stream()
            .map(UserConverter::toData)
            .collect(Collectors.toList());
    }

    public static User toData(UserModel userModel) {
        User user = new User();
        BeanUtil.copyProperties(userModel, user);
        return user;
    }
}
