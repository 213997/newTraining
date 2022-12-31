package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.Employee;
import com.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	public Employee createEmployee(Employee emp) {
		
		return employeeRepo.save(emp);
	}
	
	public List<Employee> getEmployee() {
		
		return employeeRepo.findAll();
	}

	//public getEMployeeById(String id) {
		// TODO Auto-generated method stub
	//	return employeeRepo.getById(id).orElse(null);
	//}
	
	//public Employee updateEmployee(Employee emp) {
	//	Employee employee=null;
	//Optional<Employee> updateEmployee=employeeRepo.findById(emp.getEmpId());
		
	
	//}
	public String deleteEmployeeId(String id) {
		employeeRepo.deleteById(id);
		
		return "Employee Deleted Successfully";
	}

}
