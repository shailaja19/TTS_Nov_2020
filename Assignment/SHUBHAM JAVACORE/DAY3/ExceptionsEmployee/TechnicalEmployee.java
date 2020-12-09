package com.sonata.assignmentday3.ExceptionsEmployee;

public class TechnicalEmployee extends Employee {
	String skill;
	public void calculateSalary() 
	{
		double HRA=BasicPay*0.12;
		double salary;
		salary=HRA+BasicPay;
		System.out.println("The salary of Technical Emplyee is: "+salary);
		//System.out.println();
		
	}

}
