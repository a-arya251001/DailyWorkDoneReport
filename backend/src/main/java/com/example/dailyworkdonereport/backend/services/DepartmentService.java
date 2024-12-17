package com.example.dailyworkdonereport.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dailyworkdonereport.backend.models.Department;
import com.example.dailyworkdonereport.backend.repositories.DepartmentRepository;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Optional<Department> findByName(String name) {
        return departmentRepository.findByName(name);
    }

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

}
