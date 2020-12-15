package com.sonata.JavaAssesment;


public class Staff extends Employee {
	
	public String title;		//title to be shown as House keeping, Security
	
	
	//Salary  has to be overridden
	//Because salary of Staff and TechnicalEmployee is different
	
	public void calculateSalary() {
		double HRA=BasicPay*0.18;
		double salary;
		salary=HRA+BasicPay;
		System.out.println("The salary of Staff is: "+salary);		
	}

}