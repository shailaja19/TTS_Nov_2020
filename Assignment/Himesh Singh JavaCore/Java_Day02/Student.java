




//Question2

public class Student {
	int stdID;
	String stdName;
	String stdClass;
	Student(int id,String name,String cl ){
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
		Student s1= new Student(123,"xcc","a");
		s1.display();
		Student s2= new Student(234,"vcc","b");
		s2.display();
	}
}