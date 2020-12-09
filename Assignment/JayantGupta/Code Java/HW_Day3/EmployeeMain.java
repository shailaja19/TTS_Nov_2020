package HW_Day3;

public class EmployeeMain {
	public static void main(String args[])
	{
		Employee e1= new Employee(1,"AB",10000);
//		e1.salCal();
//		e1.display();
		Manager m1 = new Manager(2,"CD",10000);
//		m1.salCal();
//		m1.display();
		Tester t1 = new Tester(3,"EF",10000);
//		t1.salCal();
//		t1.display();
		Developer d1 = new Developer(4,"GH",10000);
//		d1.salCal();
//		d1.display();	
		System.out.println(e1);
		System.out.println(m1);
		System.out.println(t1);
		System.out.println(d1);	
	}
}
