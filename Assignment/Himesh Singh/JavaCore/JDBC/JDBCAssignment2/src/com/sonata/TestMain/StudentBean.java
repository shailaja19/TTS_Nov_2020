package com.sonata.TestMain;

import java.sql.SQLException;
import java.util.List;

import com.sonata.DaoImpl.StdDAOImpl;
import com.sonata.Exception.DuplicateRecord;
import com.sonata.Model.Student;



public class StudentBean {
	      public static void main(String[] args) throws SQLException,DuplicateRecord {
			Student st=new Student();
		    st.setStdId(123);
		    st.setStdName("Aryan");
		    st.setMarks(24);
			
		    Student st1=new Student();
		    st1.setStdId(124);
		    st1.setStdName("Arya");
		    st1.setMarks(30);
		    
		    Student st2=new Student();
		    st2.setStdId(125);
		    st2.setStdName("Aya");
		    st2.setMarks(35);
		    
		    Student st3=new Student();
		    st3.setStdId(126);
		    st3.setStdName("Aryaman");
		    st3.setMarks(40);
		    
		    Student st4=new Student();
		    st4.setStdId(127);
		    st4.setStdName("Sheela");
		    st4.setMarks(45);
		    
		    Student st5=new Student();
		    st5.setStdId(128);
		    st5.setStdName("Sita");
		    st5.setMarks(50);
		    
		    Student st6=new Student();
		    st6.setStdId(129);
		    st6.setStdName("Ram");
		    st6.setMarks(55);
		    
		    Student st7=new Student();
		    st7.setStdId(130);
		    st7.setStdName("Laxman");
		    st7.setMarks(60);
		    
		    Student st8=new Student();
		    st8.setStdId(131);
		    st8.setStdName("Kush");
		    st8.setMarks(65);
		    
		    Student st9=new Student();
		    st9.setStdId(132);
		    st9.setStdName("Kushal");
		    st9.setMarks(70);
		    
		    
		    StdDAOImpl dao=new StdDAOImpl();
		    int row=dao.addStudent(st);
			int row1=dao.addStudent(st1);
			int row2=dao.addStudent(st2);
			int row3=dao.addStudent(st3);
			int row4=dao.addStudent(st4);
			int row5=dao.addStudent(st5);
			int row6=dao.addStudent(st6);
			int row7=dao.addStudent(st7);
			int row8=dao.addStudent(st8);
			int row9=dao.addStudent(st9);
		    System.out.println(row);
		     int del=dao.deleteStudent(st);
			 System.out.println(del);
			
			
			int upd=dao.updateStudent(st);
			System.out.println(upd);
			
			
			
			List<Student> list=dao.getAllStudent();
			for(Student s:list) {
				System.out.println(s.getStdId());
				System.out.println(s.getStdName());
				System.out.println(s.getMarks());
			}
		     
			System.out.println("Student List After Sorting with respect to marks");
			int row10= dao.getStudent();	
			
		}
	}

