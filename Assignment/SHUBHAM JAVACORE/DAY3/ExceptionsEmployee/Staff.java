package com.sonata.assignmentday3.ExceptionsEmployee;

public class Staff extends Employee {
	String title;
	public void calculateSalary() {
		
		
		double HRA=BasicPay*0.18;
		double salary;
		salary=HRA+BasicPay;
		System.out.println("The salary of Staff is: "+salary);
		//System.out.println();
		
	}

}
