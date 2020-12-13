package com.sonata.CompletEmp;
import java.util.*;
import java.lang.*;
public class TestEmployeeCollection {
   public static void main(String[] args) {
	Employee e1 = new Employee();
	e1.setEmpId(123);
	e1.setEmpName("Shailaja");
	e1.setEmpSal(23456);
	
	Employee e2 = new Employee();
	e2.setEmpId(124);
	e2.setEmpName("Sahil");
	e2.setEmpSal(22333);
	
	EmployeeImpl n1=new EmployeeImpl();
	n1.addEmployee(e1);
	n1.addEmployee(e2);
	

    	System.out.println(n1);
   
    
}
}

