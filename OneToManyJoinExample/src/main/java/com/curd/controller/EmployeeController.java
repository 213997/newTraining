package com.curd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curd.entity.Employee;
import com.curd.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/getEmp")
	public List<Employee> getAllEmployee(){
		
		return employeeService.getAllEmployee();
	}
	@PutMapping("/empUpdate{emp}")
	public Employee updateEmployee(Employee id) {
		
		return employeeService.updateEmployee(id);
	}
	@PostMapping("/cretEmp")
	public Employee createEmployee(Employee Emp) {
		
		
		return employeeService.saveEmployee(Emp);
	}
	
	public void deleteEmp(int id) {
		
		employeeService.deleteEmployee(id);
	}
	

}
