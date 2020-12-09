package com.sonata.assignmentday3;

public class Manager extends Employee {
	double grossPay=1000;
	double HRA= 6000.12;


public void SalCal() {
		this.empSal=grossPay+HRA;
		System.out.println("Manager Salary: " +empSal);
		System.out.println();
		
	}
}
