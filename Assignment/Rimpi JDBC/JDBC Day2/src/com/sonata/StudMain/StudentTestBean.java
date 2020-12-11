package com.sonata.StudMain;

import java.sql.SQLException;
import java.util.List;

import com.sonata.StudDaoImpl.StdntDaoImpl;
import com.sonata.StudModel.Student;

public class StudentTestBean {


public static void main(String args[]) throws SQLException{
	Student s1=new Student();
	Student s2=new Student();
	Student s3=new Student();
	Student s4=new Student();

	
	//s1.setStdId(200);
	//s1.setStdName("Ross");
	//s1.setMarks(80);
	
	s2.setStdName("Monika");
	s2.setStdId(201);
	s2.setMarks(40);
	
	s3.setStdId(105);
	s3.setMarks(99);
	
	s4.setStdId(104);
	
	
	
	StdntDaoImpl dao=new StdntDaoImpl();
	//int row1=dao.addStudent(s1);
	int row1=dao.addStudent(s2);
	
	System.out.println("no of row added");
	System.out.println("row1: " +row1);
	System.out.println();
	
	int row2=dao.deleteStudent(s4);
	System.out.println("no of row deleled: " + row2);
	System.out.println();
	
	int row3=dao.updateStudent(s3);
	System.out.println("no of row updated: " + row3);
	System.out.println();
	
	List<Student> list = dao.getAllStudent();
	List<Student> row4=dao.getStudents();
	
	for(Student p:list) {
		System.out.println(p.getStdId());
		System.out.println(p.getStdName());	
		System.out.println(p.getMarks());
		System.out.println();
		
 	}
}
}