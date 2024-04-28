package com.demo.usermanagementcleanarchitecture.infrastructure.controllers;

public record CreateUserRequest(String username, String password, String email) {
}
