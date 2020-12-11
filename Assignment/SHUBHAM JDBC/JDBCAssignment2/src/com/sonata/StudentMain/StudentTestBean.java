package com.sonata.StudentMain;

import java.sql.SQLException;
import java.util.List;

import com.sonata.StudentDaoImpl.StdDAOImpl;
import com.sonata.StudentModel.Student;
 class StudentTestMain{
	public static void main(String args[]) throws SQLException{
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		Student s5=new Student();
		Student s6=new Student();
		
		s1.setStdId(102);
		s1.setStdName("SAM");
		s1.setStdMarks(88);
		
		s2.setStdName("JOHN");
		s2.setStdId(423);
		s2.setStdMarks(54);
		
		s3.setStdId(423);

		s4.setStdId(102);
		s4.setStdMarks(100);
		
		s5.setStdId(777);
		s5.setStdName("BHEEM");
		s5.setStdMarks(96);
		
		s6.setStdId(778);
		s6.setStdName("RAJU");
		s6.setStdMarks(90);
		
		
		StdDAOImpl dao=new StdDAOImpl();
		int row1=dao.addStudent(s1);
		int row2=dao.addStudent(s2);
		int row6=dao.addStudent(s5);
		int row7=dao.addStudent(s6);
		System.out.println("no of row added");
		System.out.println(row1);
		System.out.println(row2);
		System.out.println(row6);
		System.out.println(row7);
		System.out.println();
		
		int row3=dao.deleteStudent(s3);
		System.out.println("no of row deleled ");
		System.out.println(row3);
		System.out.println();
		
		int row4=dao.updateStudent(s4);
		System.out.println("no of row updated: ");
		System.out.println(row4);
		System.out.println();
		
		//After doing the addition,deletion and updating details of the student
		List<Student> list 	= dao.getAllStudent();
		for(Student p:list) {
			System.out.println(p.getStdId());
			System.out.println(p.getStdName());	
			System.out.println(p.getStdMarks());			
			System.out.println();
		 }
		System.out.println();
		System.out.println("Student List After Sorting According to The Marks");
		int row5=dao.getStudents();	
	}
	
}
