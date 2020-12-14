package PracticalTest;
import PracticalEmployee.*;

public class UsingPeople {
	public static void main(String args[]) {
		
		//creating staff class object using employee class
		Employee e1=new Staff();
		e1.BasicPay=4500;
		e1.EmpId=4536;
		e1.EmpName="Ross";
		Staff s1=new Staff();
		s1.title="Security";
		
		Address a2=new Address();
		a2.setCity("Haryana");
		a2.setDoorNo(4172);
		a2.setPinCode(136027);
		a2.setStreet("Jind Road");		
		e1.setObj(a2);
		System.out.println(e1);
		e1.calculateSalary();
		System.out.println("Title of Employee is: "+s1.title);
		System.out.println();
		
		
		
		
		Employee e2=new TechnicalEmployee();
		e2.BasicPay=7000;
		e2.EmpId=7698;
		e2.EmpName="Monika";
		TechnicalEmployee t1=new TechnicalEmployee();
		t1.skill="C";
		
	
		Address a3=new Address();
		a3.setCity("Karnal");
		a3.setDoorNo(767);
		a3.setPinCode(136026);
		a3.setStreet("Ambala Road");		
		e2.setObj(a3);
		System.out.println(e2);
		e2.calculateSalary();
		System.out.println("Skill of Employee is: "+t1.skill);
		System.out.println();
		
}
}
