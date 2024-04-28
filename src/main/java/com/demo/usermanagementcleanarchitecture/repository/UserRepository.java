package com.demo.usermanagementcleanarchitecture.repository;

import com.demo.usermanagementcleanarchitecture.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
