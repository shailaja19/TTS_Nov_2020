package HW_Day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentList {
	public static void main(String args[])
	{
		ArrayList<Student> n1 = new ArrayList<>();
		n1.add(new Student(105,"Ravi",35,96));
		n1.add(new Student(106,"Rajesh",15,78));
		n1.add(new Student(107,"Ram",25,89));
		
		Comparator<Student> comparator= Comparator.comparing(e->e.getStdMarks());
		n1.sort(comparator.reversed());
		System.out.println(n1);
		
	}

}
