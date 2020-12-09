package java_day_03;

public class Emp_main {

	public static void main(String args[])
	{
		Developer d=new Developer(12345, "Tan",50000);
		Manager m=new Manager(123, "Max",35000);
		Tester t=new Tester(1234, "Sam",20000);
		
		System.out.println(d);
		System.out.println(m);
		System.out.println(t);
		
	}
}
