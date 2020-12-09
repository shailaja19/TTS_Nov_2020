package java_day_02;

public class Student {

	int stdID;
	String stdName;
	int stdClass;

public static void main(String args[])
{
	Student s=new Student();
	s.stdID = 1;
	s.stdName = "Tanishq";
	s.stdClass = 11;
	
	System.out.println("Student ID is "+s.stdID+" and name is "+s.stdName+" and class is "+s.stdClass);
		
}
}