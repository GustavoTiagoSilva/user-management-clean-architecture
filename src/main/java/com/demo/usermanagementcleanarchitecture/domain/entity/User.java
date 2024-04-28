package com.demo.usermanagementcleanarchitecture.domain.entity;


// This entity will be totaly decoupled from the database entity, which means it will not have JPA dependency and things like that
public record User(String username, String password, String email) {
}
