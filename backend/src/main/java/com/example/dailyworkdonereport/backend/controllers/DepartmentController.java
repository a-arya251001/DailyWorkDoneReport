package com.example.dailyworkdonereport.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dailyworkdonereport.backend.dtos.DepartmentDTO;
import com.example.dailyworkdonereport.backend.models.Department;
import com.example.dailyworkdonereport.backend.services.DepartmentService;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public ResponseEntity<Department> createDepartment(@RequestBody Department department) {
        return ResponseEntity.ok(departmentService.createDepartment(department));
    }

    @GetMapping
    public ResponseEntity<List<DepartmentDTO>> getAllDepartments() {
        return ResponseEntity.ok(departmentService.getAllDepartments().stream().map(DepartmentDTO::new).toList());
    }
}
