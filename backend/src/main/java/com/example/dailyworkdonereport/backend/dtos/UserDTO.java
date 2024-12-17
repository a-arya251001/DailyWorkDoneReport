package com.example.dailyworkdonereport.backend.dtos;

import com.example.dailyworkdonereport.backend.models.Role;
import com.example.dailyworkdonereport.backend.models.User;

public class UserDTO {

    private Long id;

    private String username;

    // @Column(nullable = false, unique = true)
    // private String email;

    private Role role;

    private String departmentName;

    public UserDTO(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.role = user.getRole();
        this.departmentName = user.getDepartment() != null ? user.getDepartment().getName() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

}
