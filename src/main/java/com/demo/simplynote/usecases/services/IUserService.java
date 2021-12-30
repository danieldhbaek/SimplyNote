package com.demo.simplynote.usecases.services;

import com.demo.simplynote.entities.User;

import java.util.List;

public interface IUserService {

    public User saveUser(User user);
    public List<User> getAllUsers();
}
