package com.demo.usermanagementcleanarchitecture.service;

import com.demo.usermanagementcleanarchitecture.model.User;
import com.demo.usermanagementcleanarchitecture.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    public User save(User user) {
        return this.userRepository.save(user);
    }
    @Transactional(readOnly = true)
    public User findById(Integer id) {
        return this.userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("User with id: " + id + " not found"));
    }
}
