package com.demo.usermanagementcleanarchitecture.application.usercases;

import com.demo.usermanagementcleanarchitecture.application.gateways.UserGateway;
import com.demo.usermanagementcleanarchitecture.domain.entity.User;

public class CreateUserInteractor implements CreateUserUseCase {
    private final UserGateway userGateway;

    public CreateUserInteractor(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public User createUser(User user) {
        return userGateway.createUser(user);
    }
}
