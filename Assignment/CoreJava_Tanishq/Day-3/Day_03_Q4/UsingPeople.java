package Day_03_Q4;

public class UsingPeople {

	public static void main()
	{
		Employee e1= new Staff();
		e1.basic=12345;
		e1.empID=123;
		e1.empName="Tan";
		e1.leave_rem=15;
		
		Staff s1=new Staff();
		s1.title="akjsb";
		
		Address a2=new Address();
		a2.setCity("Bangalore");
		a2.setDoor_no(123);
		a2.setPincode(263139);
		a2.setStreet("Bull temple");
		
		e1.setObj(a2);
		System.out.println(e1);
		e1.calculateSalary();
		System.out.println("Title is:" +s1.title);
		
	// Technical Employee
		
		Employee e2= new TechnicalEmployee();
		e2.basic=50000;
		e2.empID=111;
		e2.empName="max";
		e2.leave_rem=17;
		
		TechnicalEmployee t1=new TechnicalEmployee();
		t1.tech_skill="java";
		
		Address a3=new Address();
		a3.setCity("Bangalore");
		a3.setDoor_no(123);
		a3.setPincode(263139);
		a3.setStreet("Bull temple");
		
		e2.setObj(a3);
		System.out.println(e2);
		e2.calculateSalary();
		System.out.println("Skill is:" +t1.tech_skill);
		
	}
}
