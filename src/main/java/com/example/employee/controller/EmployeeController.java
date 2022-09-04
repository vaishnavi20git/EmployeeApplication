package com.example.employee.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.EmployeeEntity;
import com.example.employee.service.EmployeeService;

import antlr.collections.List;

@CrossOrigin(origins = "*", allowedHeaders ="*")
@RestController
public class EmployeeController {
	
	@Autowired EmployeeService employeeService;
	
	@PostMapping("/Addemployees")
	public void addEmployees(@RequestBody EmployeeEntity employee){
		employeeService.addEmployee(employee);
	}
	
	
	@GetMapping("/Getemployees")
	public ArrayList getAllEmployee(){
		return employeeService.getAllEmployees();
	}

}
