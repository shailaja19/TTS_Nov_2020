package com.Sonata.CompletEmp;

public class TestEmployeeCollection {
	public static void main(String[] args) {

		Employee e1 = new Employee(123,"Ravi",23445);
		Employee e2 = new Employee(234,"Rajesh",32343);
		Employee e3 = new Employee(345,"Ram",54422);
		Employee e4 = new Employee(456,"Ramesh",42343);
		
		EmployeeImp l1 = new EmployeeImp();
		
		l1.addEmployee(e1);
		l1.addEmployee(e2);
		l1.addEmployee(e3);
		l1.addEmployee(e4);
		l1.removeEmployee(e2);
		l1.yearSalary(e1);
		l1.appSalary(e2);
		
		System.out.println(l1);	
	}
}
