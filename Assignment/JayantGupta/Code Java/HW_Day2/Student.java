package HW_DAY2;

public class Student {
	int stdID;
	String stdName;
	String stdClass;
	Student(int id,String name, String cl){
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
		Student s1= new Student(123,"Ravi","XII");
		s1.display();
		
		Student s2= new Student(456,"Rajesh","X");
		s2.display();
	}
}
