package com.sonata.assignmentday3;


public class Tester extends Employee {
		double grossPay=3000;
		double HRA= 6000.12;
		


		public void SalCal() 
		{
			this.empSal=grossPay+HRA;
			System.out.println("Tester Salary: " +empSal);
			System.out.println();
			
		}
}
