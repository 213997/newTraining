package com.curd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curd.entity.Employee;
import com.curd.repo.EmployeeRepo;
@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	public List<Employee> getAllEmployee(){
		
		return employeeRepo.findAll();
	}
	public Employee updateEmployee(Employee employee) {
		
		Employee newEmployee=new Employee();
		Optional<Employee> updateEmployee=employeeRepo.findById(employee.getEid());
		if(updateEmployee.isPresent()) {
			newEmployee.setEname(employee.getEname());
			newEmployee.setLocation(employee.getLocation());
			newEmployee.setPhone(employee.getPhone());
			newEmployee.setSalary(employee.getSalary());
			employeeRepo.save(newEmployee);
		}else {
			return null;
		}
		return employee;
	}
	
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepo.save(employee);
	}
	
	
	public void deleteEmployee(int id) {
		  employeeRepo.deleteById(id);
	}

}
