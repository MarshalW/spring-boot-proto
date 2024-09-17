package com.my.app.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/users")
    public List<?> listUsers() {
        return Collections.emptyList();
    }
}
