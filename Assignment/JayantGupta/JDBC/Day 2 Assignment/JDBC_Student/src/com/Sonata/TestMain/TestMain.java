package com.Sonata.TestMain;

import java.sql.SQLException;
//import java.util.List;

import com.Sonata.DaoImpl.StudDAOImpl;
//import com.Sonata.Exception.CustumException;
import com.Sonata.Model.Student;

public class TestMain {
    public static void main(String[] args) throws SQLException {
		Student s1=new Student();
	    s1.setStdId(3);
	    s1.setStdName("Ravi");
	    s1.setStdMarks(98);
		
		Student s2=new Student();
	    s2.setStdId(2);
	    s2.setStdName("Ram");
	    s2.setStdMarks(87);
	    
		Student s3=new Student();
	    s3.setStdId(1);
	    s3.setStdName("Ramesh");
	    s3.setStdMarks(67);
		
		Student s4=new Student();
	    s4.setStdId(4);
	    s4.setStdName("Rajeev");
	    s4.setStdMarks(32);
	    
		Student s5=new Student();
	    s5.setStdId(6);
	    s5.setStdName("Rajesh");
	    s5.setStdMarks(87);
		
		Student s6=new Student();
	    s6.setStdId(5);
	    s6.setStdName("Rao");
	    s6.setStdMarks(54);
		
	    StudDAOImpl dao=new StudDAOImpl();
	    int row1=dao.addStudent(s1);
	    int row5=dao.addStudent(s2);
	    int row4=dao.addStudent(s3);
	    int row6=dao.addStudent(s4);
	    int row7=dao.addStudent(s5);
	    int row8=dao.addStudent(s6);
	    
	    System.out.println(row1);
		System.out.println(row5);
		System.out.println(row4);
		System.out.println(row6);
		System.out.println(row7);
		System.out.println(row8);
		
		int row2=dao.deleteStudent(s2);
		System.out.println(row2);
		
		int row3=dao.updateStudent(s1);
		System.out.println(row3);
		
//		List<Student> list=dao.getAllStudent();
//			for(Student s:list) {
//			System.out.println(s.getStdId());
//			System.out.println(s.getStdName());
//			System.out.println(s.getStdMarks());
//		}
		dao.getStudent();
		dao.removeDulplicate();
		
    }
}
