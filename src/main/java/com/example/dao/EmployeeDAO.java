package com.example.dao;

import com.example.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
