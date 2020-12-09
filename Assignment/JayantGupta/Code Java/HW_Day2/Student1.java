package HW_DAY2;

public class Student1 {
	int stdID;
	String stdName;
	String stdClass;
	Student1(int id,String name, String cl)
	{
		this.stdID=id;
		this.stdName=name;
		this.stdClass=cl;
	}
	void display()
	{
		System.out.println(stdID);
		System.out.println(stdName);
		System.out.println(stdClass);
	}
	
	public static void main(String args[])
	{
		Student1 s1= new Student1(123,"Ravi","XII");
		s1.display();
		Student1 s2= new Student1(456,"Rajesh","X");
		s2.display();
	}
}
