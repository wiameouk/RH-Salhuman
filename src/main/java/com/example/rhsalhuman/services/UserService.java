package com.example.rhsalhuman.services;

import com.example.rhsalhuman.entities.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    User updateUser(Long id, User user);

    void deleteUserById(Long id);
    User getUserById(Long id);
    List<User> getAllUser();
}
