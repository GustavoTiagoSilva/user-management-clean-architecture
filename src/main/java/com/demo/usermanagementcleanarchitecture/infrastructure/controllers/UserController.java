package com.demo.usermanagementcleanarchitecture.infrastructure.controllers;

import com.demo.usermanagementcleanarchitecture.application.usercases.CreateUserUseCase;
import com.demo.usermanagementcleanarchitecture.domain.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private final CreateUserUseCase createUserUseCase;

    public UserController(CreateUserUseCase createUserUseCase) {
        this.createUserUseCase = createUserUseCase;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreateUserResponse save(@RequestBody CreateUserRequest createUserRequest) {
        User user = new User(createUserRequest.username(), createUserRequest.password(), createUserRequest.email());
        var createdUser = createUserUseCase.createUser(user);
        return new CreateUserResponse(createdUser.email(), createUserRequest.username());
    }
}
