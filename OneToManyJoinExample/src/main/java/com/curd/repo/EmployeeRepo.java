package com.curd.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curd.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	

}
