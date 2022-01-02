package com.demo.simplynote.adapters;

import com.demo.simplynote.entities.User;
import com.demo.simplynote.usecases.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public String addUser(@RequestBody User user) {
        userService.saveUser(user);
        return "Welcome!";
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
