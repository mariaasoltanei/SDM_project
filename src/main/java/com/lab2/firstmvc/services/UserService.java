package com.lab2.firstmvc.services;

import com.lab2.firstmvc.domain.User;

public interface UserService {
    Iterable<User> findAllUsers();

   User saveUser(User user);
}
