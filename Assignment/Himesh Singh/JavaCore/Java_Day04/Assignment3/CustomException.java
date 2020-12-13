package com.sonata;

public class CustomException {
	    
          public static void main(String[] args) throws SalaryException {
        	 double salary=20000;
		  if(salary<100000) {
			  throw new SalaryException("Salary is less");
		  }
		  else {
			  System.out.println("Salary alright");
		  }
		}
}
