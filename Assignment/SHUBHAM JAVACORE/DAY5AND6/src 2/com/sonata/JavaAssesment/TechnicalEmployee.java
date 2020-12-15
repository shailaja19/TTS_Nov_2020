package com.sonata.JavaAssesment;


public class TechnicalEmployee extends Employee {
	
	public String skill; 		//Skill has to be shown as C++,jAVA
	
	
	//Salary  has to be overridden
	//Because salary of Staff and TechnicalEmployee is different
	public void calculateSalary() 
	{
		double HRA=BasicPay*0.12;
		double salary;
		salary=HRA+BasicPay;
		System.out.println("The salary of Technical Emplyee is: "+salary);
		
	}

}
