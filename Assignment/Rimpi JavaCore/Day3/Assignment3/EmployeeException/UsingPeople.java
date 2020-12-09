package Assignment3.EmployeeException;

public class UsingPeople {
	public static void main(String args[]) {
		
		
		
		Employee e1=new Staff();
		e1.BasicPay=5000;
		e1.EmpId=1234;
		e1.EmpName="Ram";
		e1.NoofLeave=15;
		Staff s1=new Staff();
		s1.title="Security";
		
		Address a2=new Address();
		a2.setCity("Haryana");
		a2.setDoorNo(4172);
		a2.setPinCode(136027);
		a2.setStreet("Model town");		
		e1.setObj(a2);
		System.out.println(e1);
		e1.calculateSalary();
		System.out.println("Title of Employee is: "+s1.title);
		System.out.println();
		
		
		
		
		Employee e2=new TechnicalEmployee();
		e2.BasicPay=9000;
		e2.EmpId=6578;
		e2.EmpName="Jack";
		e2.NoofLeave=15;
		TechnicalEmployee t1=new TechnicalEmployee();
		t1.skill="C";
		
	
		Address a3=new Address();
		a3.setCity("Punjab");
		a3.setDoorNo(767);
		a3.setPinCode(136026);
		a3.setStreet("Jind Road");		
		e2.setObj(a3);
		System.out.println(e2);
		e2.calculateSalary();
		System.out.println("Skill of Employee is: "+t1.skill);
		System.out.println();
		
}
}
