package com.example.dailyworkdonereport.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.dailyworkdonereport.backend.models.Role;
import com.example.dailyworkdonereport.backend.models.User;
import com.example.dailyworkdonereport.backend.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User registerUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public List<User> findByRole(Role role) {
        return userRepository.findByRole(role);
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
}
