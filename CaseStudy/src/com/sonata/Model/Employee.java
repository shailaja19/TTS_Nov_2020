package com.sonata.Model;

public class Employee {
	private int employeeID;
	private String employeeName;
	boolean isAdmin;
	
	public Employee() {}
	public Employee(int employeeID, String employeeName, boolean isAdmin) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.isAdmin = isAdmin;
	}
	
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
}

