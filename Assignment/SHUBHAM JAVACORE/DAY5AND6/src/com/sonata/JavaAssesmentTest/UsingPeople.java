package com.sonata.JavaAssesmentTest;

import com.sonata.JavaAssesment.Address;
import com.sonata.JavaAssesment.Employee;
import com.sonata.JavaAssesment.Staff;
import com.sonata.JavaAssesment.TechnicalEmployee;

public class UsingPeople {
	public static void main(String args[]) {
		
		
		//creating object e1 for the staff employee and setting values to it
		Employee e1=new Staff();
		e1.setBasicPay(10000);
		e1.setEmpId(7777);
		e1.setEmpName("SAM");
		
		Staff s1=new Staff();
		s1.title="Housing";
		
		Address a1=new Address();
		a1.setCity("CHENNAI");
		a1.setDoorNo(404);
		a1.setPinCode(100007);
		a1.setStreet("LIGHT HOUSE");		
		e1.setObj(a1);
		System.out.println(e1);
		e1.calculateSalary();
		System.out.println("Title is: "+s1.title);
		System.out.println();
		
		
		
		Employee e2=new TechnicalEmployee();
		e2.setBasicPay(10000);
		e2.setEmpId(7779);
		e2.setEmpName("JACKSON");
		
		TechnicalEmployee t1=new TechnicalEmployee();
		t1.skill="JAVA";
		
		Address a2=new Address();
		a2.setCity("Banglore");
		a2.setDoorNo(404);
		a2.setPinCode(100007);
		a2.setStreet("SEZ");		
		e2.setObj(a2);
		System.out.println(e2);
		e2.calculateSalary();
		System.out.println("Skill is: "+t1.skill);
		System.out.println();
		
}
}
