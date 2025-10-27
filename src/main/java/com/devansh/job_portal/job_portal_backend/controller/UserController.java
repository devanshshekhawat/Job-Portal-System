package com.devansh.job_portal.job_portal_backend.controller;


import com.devansh.job_portal.job_portal_backend.Model.user;
import com.devansh.job_portal.job_portal_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public user registerUser(@RequestBody user user) {
        return userService.saveUser(user);
    }

    @GetMapping("/{username}")
    public user getUserByUsername(@PathVariable String username) {
        return userService.getUserByUsername(username);
    }

    @GetMapping("/all")
    public List<user> getAllUsers() {
        return userService.getAllUsers();
    }
}

