package com.demo.usermanagementcleanarchitecture.application.gateways;

import com.demo.usermanagementcleanarchitecture.domain.entity.User;

// This class will have the responsibility to stabilish a port to some layers in my architecture and through this, the layers will be able to communicate with other parts o the application
// UserGateway will be a generic structure that will allow us to create a user. Here, we are abstracting implementation details, which means we can create a user through a Repository, WebService, a file, etc
public interface UserGateway {
    User createUser(User user);
}
