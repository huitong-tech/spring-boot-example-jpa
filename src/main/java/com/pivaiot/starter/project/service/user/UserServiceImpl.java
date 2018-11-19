package com.pivaiot.starter.project.service.user;

import com.pivaiot.common.util.BeanUtil;
import com.pivaiot.starter.project.service.data.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).map(UserEntity::toModel).orElse(null);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll().stream().map(UserEntity::toModel).collect(Collectors.toList());
    }

    @Override
    public User save(User user) {
        UserEntity userEntity = user.getId() == null ? new UserEntity() : userRepository.findById(user.getId()).orElse(new UserEntity());
        BeanUtil.copyProperties(user, userEntity);
        userEntity = userRepository.save(userEntity);
        return userEntity.toModel();
    }
}
