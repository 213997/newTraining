package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.Employee;
import com.service.EmployeeService;

@RestController
@RequestMapping("api/Employee")
public class EmployeeController {
	
	@Autowired
	 private EmployeeService employeeService;
	
	@PostMapping("/register")
	public Employee addEmployee(@RequestBody Employee emp) {
		
		
		return employeeService.createEmployee(emp);
	}
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployee(){
		return employeeService.getEmployee();
		
		
		
	}
	@DeleteMapping("/ust/employee{id}")
	public String deleteEmployee(String id) {
		
		return employeeService.deleteEmployeeId(id);
		
		
	}
	

}
