package com.sonata.assignmentday3.ExceptionsEmployee;


public abstract class Employee {
	int EmpId;
	String EmpName;
	double BasicPay;
	int NoofLeave;
	//object of address
	Address obj;
	
	//abstract class calculateSalary to be overridden
	abstract void calculateSalary();

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

	public int getNoofLeave() {
		return NoofLeave;
	}

	public void setNoofLeave(int noofLeave) {
		NoofLeave = noofLeave;
	}

	public Address getObj() {
		return obj;
	}

	public void setObj(Address obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", BasicPay=" + BasicPay + ", NoofLeave="
				+ NoofLeave + ", obj=" + obj + ", getObj()=" + getObj() + "]";
	}

	
	
	

}


//class EmpInfo
//{
//	public static void main(String args[]) {
//		Employee e1=new Staff();
//		e1.BasicPay=1000;
//		e1.EmpId=7777;
//		e1.EmpName="Sam";
//		e1.NoofLeave=26;
//		System.out.println(e1);
//		e1.calculateSalary();
//		
//		Employee e2=new TechnicalEmployee();
//		e2.BasicPay=10000;
//		e2.calculateSalary();
//		
//		
//		
//		
//	}
//}