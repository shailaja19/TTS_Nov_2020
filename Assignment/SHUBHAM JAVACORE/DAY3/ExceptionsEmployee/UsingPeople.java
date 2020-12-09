package com.sonata.assignmentday3.ExceptionsEmployee;

public class UsingPeople {
	public static void main(String args[]) {
		
		
		
		Employee e1=new Staff();
		e1.BasicPay=10000;
		e1.EmpId=7777;
		e1.EmpName="Sam";
		e1.NoofLeave=26;
	//	System.out.println(e1);
		Staff s1=new Staff();
		s1.title="Housing";
		
		Address a2=new Address();
		a2.setCity("CHENNAI");
		a2.setDoorNo(404);
		a2.setPinCode(100007);
		a2.setStreet("LIGHT HOUSE");		
		e1.setObj(a2);
		System.out.println(e1);
		e1.calculateSalary();
		System.out.println("Title is: "+s1.title);
		System.out.println();
		
		
		
		
		Employee e2=new TechnicalEmployee();
		e2.BasicPay=10000;
		e2.EmpId=7799;
		e2.EmpName="Daniel";
		e2.NoofLeave=26;
		TechnicalEmployee t1=new TechnicalEmployee();
		t1.skill="JAVA";
		
		//System.out.println(e2);
		Address a3=new Address();
		a3.setCity("Banglore");
		a3.setDoorNo(404);
		a3.setPinCode(100007);
		a3.setStreet("SEZ");		
		e2.setObj(a3);
		System.out.println(e2);
		e2.calculateSalary();
		System.out.println("Skill is: "+t1.skill);
		System.out.println();
		
}
}
