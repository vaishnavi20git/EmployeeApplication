package com.example.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employee.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity , Long>{
}
