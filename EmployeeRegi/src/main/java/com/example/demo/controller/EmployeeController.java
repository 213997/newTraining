package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/api/Employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/register")
	public Employee addEmployee(@RequestBody Employee emp) {
		
		
		return employeeService.createEmployee(emp);
	}
	

}
