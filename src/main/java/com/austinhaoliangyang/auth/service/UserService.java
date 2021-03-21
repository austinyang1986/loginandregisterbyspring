package com.austinhaoliangyang.auth.service;

import com.austinhaoliangyang.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
