package com.my.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.my.app.repository.UserRepository;

@RestController
@EnableAutoConfiguration
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<?> listUsers() {
        return userRepository.getAll();
    }
}
