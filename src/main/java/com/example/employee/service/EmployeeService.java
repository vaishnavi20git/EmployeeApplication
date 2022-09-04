package com.example.employee.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.EmployeeEntity;
import com.example.employee.repository.EmployeeRepository;

import antlr.collections.List;

@Service
public class EmployeeService {
	
	@Autowired
    private EmployeeRepository repo;
	
	public ArrayList getAllEmployees(){
		ArrayList emps = (ArrayList)repo.findAll(); 
		return emps;
	}
	
	public void addEmployee(EmployeeEntity e) {
		repo.save(e);
	}

}

