package HW_DAY2;

public class TestStudent2 {
	
	public static void main(String args[])
	{
		Student2 s1= new Student2();
		s1.setStdID(123);
		s1.setStdName("Ravi");
		s1.setStdClass("XII");
		
		Student2 s2= new Student2();
		s2.setStdID(456);
		s2.setStdName("Rajesh");
		s2.setStdClass("X");
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
