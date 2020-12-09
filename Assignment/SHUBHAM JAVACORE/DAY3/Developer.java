package com.sonata.assignmentday3;

public class Developer extends Employee {
	
		double grossPay=2000;
		double HRA= 6000.12;
		


		public void SalCal() {
		this.empSal=grossPay+HRA;
		System.out.println("Developer Salary: " +empSal);
		System.out.println();
		}
}
