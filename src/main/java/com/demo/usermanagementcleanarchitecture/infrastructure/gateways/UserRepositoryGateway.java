package com.demo.usermanagementcleanarchitecture.infrastructure.gateways;

import com.demo.usermanagementcleanarchitecture.application.gateways.UserGateway;
import com.demo.usermanagementcleanarchitecture.domain.entity.User;
import com.demo.usermanagementcleanarchitecture.infrastructure.persistence.UserEntity;
import com.demo.usermanagementcleanarchitecture.infrastructure.persistence.UserRepository;

public class UserRepositoryGateway implements UserGateway {

    private final UserRepository userRepository;

    public UserRepositoryGateway(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setPassword(user.password());
        userEntity.setUsername(user.username());
        userEntity.setEmail(user.email());
        userRepository.save(userEntity);
        return new User(user.username(), user.password(), user.email());
    }
}
