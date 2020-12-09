package HW_Day3_Part2;

public class UsingPeople {
	public static void main(String args[])
	{
		Employee e1= new Staff();
		e1.basicpay=10000;
		e1.empId=10;
		e1.empName="Ram";
		e1.leaves=(float) 22.5;
		
		Staff s1 = new Staff();
		s1.title="Security";
		Address a1= new Address();
		a1.setDoorNo(519);
		a1.setStreet("Mayur Vihar");
		a1.setCity("Delhi");
		a1.setPin(110091);
		
		e1.setObj(a1);
		
		Employee e2= new TechnicalEmployee();
		e2.basicpay=20000;
		e2.empId=15;
		e2.empName="Rajesh";
		e2.leaves=(float) 10;

		TechnicalEmployee t1 = new TechnicalEmployee();
		t1.skill="Java ";
		Address a2= new Address();
		a2.setDoorNo(434);
		a2.setStreet("Crossing");
		a2.setCity("Delhi");
		a2.setPin(110094);
		
		e2.setObj(a2);
		
		System.out.println(e1);
		System.out.println(e2);
	}

}
