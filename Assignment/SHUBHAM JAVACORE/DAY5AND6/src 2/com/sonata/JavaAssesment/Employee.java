package com.sonata.JavaAssesment;


public abstract class Employee {
	
	public String EmpName;
	public double BasicPay;
	public Address obj;	
	public int EmpId;
	
	//abstract class calculateSalary to be overridden
	//abstract methods do not have the body
	
	public abstract void calculateSalary();

	
	//Creating getters and setters
	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public double getBasicPay() {
		return BasicPay;
	}

	public void setBasicPay(double basicPay) {
		BasicPay = basicPay;
	}

	public Address getObj() {
		return obj;
	}

	public void setObj(Address obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", BasicPay=" + BasicPay + ", obj=" + obj + "]";
	}

}
