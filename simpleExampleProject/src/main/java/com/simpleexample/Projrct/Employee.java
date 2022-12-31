package com.simpleexample.Projrct;

public class Employee {
	String empId;
	String Ename;
	String Location;
	public Employee(String empId, String ename, String location) {
		super();
		this.empId = empId;
		Ename = ename;
		Location = location;
	}
	
//	public void setEmpId(String empId) {
//		this.empId = empId;
//	}
//	
//	public void setEname(String ename) {
//		Ename = ename;
//	}
//	
//	public void setLocation(String location) {
//		Location = location;
//	}
//	
	public void display() {
	System.out.println("Display() calling");
		
		System.out.println("name :"+Ename+" id :"+empId+" Location :"+Location);	
}
	
	

}
