package com.sonata.assignmentday3;

abstract class Employee {
		int empId;
		String empName;
		double empSal;
		public void display() {
			System.out.println("Employee ID is: "+empId);
			System.out.println("Employee Name is: "+empName);
		}
		
		//SalCal method is abstract
		//It must be overridden to get the salaries
		abstract void SalCal();

}



class empInfo{
	 public static void main(String[] args) {
		 Employee e1 = new Manager();
		 e1.empId= 123;
		 e1.empName= "Babu Bhaiya";
		 // e1.empSal= 9999;
		 e1.display();
	     e1.SalCal();
	     
	     Employee e2 = new Developer();
	     e2.empId= 234;
		 e2.empName= "Raju";
		// e2.empSal=20099;
		 e2.display();
		 e2.SalCal();
		
		 Employee e3 = new Tester();
		 e3.empId= 676;
		 e3.empName= "Shyam";
		 //e3.empSal=25999;
		 e3.display();
		 e3.SalCal();	 
	 }

 }
 