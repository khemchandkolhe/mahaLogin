package com.hellokoding.account.service;

import com.hellokoding.account.model.User;

public interface UserService {
    void save(User user);
System.out.println();

    User findByUsername(String username);
}
