package com.devansh.job_portal.job_portal_backend.service;

import com.devansh.job_portal.job_portal_backend.Model.user;
import com.devansh.job_portal.job_portal_backend.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Save a new user
    public user saveUser(user user) {
        return userRepository.save(user);
    }

    // Find user by email
    public user getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    // Get all users
    public List<user> getAllUsers() {
        return userRepository.findAll();
    }
}

