package com.pivaiot.starter.project.service.user;

import com.pivaiot.starter.project.service.data.User;

import java.util.List;

public interface UserService {

    User getUserById(Long id);

    List<User> findAllUsers();

    User save(User user);

}
