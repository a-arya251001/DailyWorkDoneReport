package com.example.dailyworkdonereport.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dailyworkdonereport.backend.dtos.UserDTO;
import com.example.dailyworkdonereport.backend.models.Role;
import com.example.dailyworkdonereport.backend.models.User;
import com.example.dailyworkdonereport.backend.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        System.out.println(user.toString());
        return ResponseEntity.ok(userService.registerUser(user));
    }

    @GetMapping("/{role}")
    public ResponseEntity<List<UserDTO>> getUsersByRole(@PathVariable Role role) {
        return ResponseEntity.ok(userService.findByRole(role).stream().map(UserDTO::new).toList());
    }

    @GetMapping("/all")
    public ResponseEntity<List<UserDTO>> getAllUser() {
        return ResponseEntity.ok(userService.findAllUsers().stream().map(UserDTO::new).toList());
    }
}
