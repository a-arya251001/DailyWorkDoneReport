package com.example.dailyworkdonereport.backend.dtos;

import com.example.dailyworkdonereport.backend.models.Department;

public class DepartmentDTO {
    private Long id;

    private String name;

    private String createdBy;

    public DepartmentDTO(Department department) {
        this.id = department.getId();
        this.name = department.getName();
        this.createdBy = department.getCreatedBy() != null ? department.getCreatedBy().getUsername() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

}