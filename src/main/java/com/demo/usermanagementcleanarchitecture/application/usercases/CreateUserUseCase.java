package com.demo.usermanagementcleanarchitecture.application.usercases;

import com.demo.usermanagementcleanarchitecture.domain.entity.User;

public interface CreateUserUseCase {
    User createUser(User user);
}
