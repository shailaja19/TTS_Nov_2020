package Day4Assignment2;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;




public class StudentList {
	public static void main(String args[]) {
		
		//Creating a list of the students
		List<Student> s1=new LinkedList<Student>();
		s1.add(new Student(101,"Sam",100));
		s1.add(new Student(102,"Keni",98));
		s1.add(new Student(103,"Nik",99));
		s1.add(new Student(104,"Ram",95));
		s1.add(new Student(105,"Amar",96));
		
		//Sorting in decreasing order
		//Comparator comp= MyComparators.stringComparator();
		Collections.sort(s1, Collections.reverseOrder());
		//Collections.sort(s1,(stdMarks,stdMarks2)->(stdMarks>stdMarks2)?-1:(stdMarks<stdMarks2)?1:0);
		
		//Each element of s1 is assigning to the s2
	    for(Student s2:s1) 
	    {
	    	System.out.println(s2.stdId+" "+s2.stdName+" "+s2.stdMarks);
		}
	    
	   // Student x1=()->{System.out.println("My functional Interface");};

	

	}
}
