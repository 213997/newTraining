package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	void deleteById(String id);

}
