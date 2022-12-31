package com.employee;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//@Entity
@Entity
//@Table(name="ustEmployee")
public class Employee {
	@Id
	
	private int empid;
	
	private String empName;
	
	private String location;
	private String domain;
	private String emailId;
	
	private int experiance;

	public Employee(int empid, String empName, String location, String domain, String emailId, int experiance) {
		
		this.empid = empid;
		this.empName = empName;
		this.location = location;
		this.domain = domain;
		this.emailId = emailId;
		this.experiance = experiance;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getExperiance() {
		return experiance;
	}

	public void setExperiance(int experiance) {
		this.experiance = experiance;
	}
	
	
	
	
	
	
	
	

}
