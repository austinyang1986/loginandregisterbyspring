package com.austinhaoliangyang.auth.repository;

import com.austinhaoliangyang.auth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
