package com.lab2.firstmvc.services;

import com.lab2.firstmvc.domain.User;
import com.lab2.firstmvc.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepo;

    public UserServiceImpl(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public Iterable<User> findAllUsers() {
        return userRepo.findAll();
    }



    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }
}

