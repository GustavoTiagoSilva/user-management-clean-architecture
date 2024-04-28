package com.demo.usermanagementcleanarchitecture.main;

import com.demo.usermanagementcleanarchitecture.application.gateways.UserGateway;
import com.demo.usermanagementcleanarchitecture.application.usercases.CreateUserInteractor;
import com.demo.usermanagementcleanarchitecture.application.usercases.CreateUserUseCase;
import com.demo.usermanagementcleanarchitecture.infrastructure.gateways.UserRepositoryGateway;
import com.demo.usermanagementcleanarchitecture.infrastructure.persistence.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    CreateUserUseCase createUserUseCase(UserGateway userGateway) {
        return new CreateUserInteractor(userGateway);
    }

    @Bean
    UserGateway userGateway(UserRepository userRepository) {
        return new UserRepositoryGateway(userRepository);
    }
}
