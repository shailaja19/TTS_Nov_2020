package com.Sonata.Dao;

import java.util.List;

//import com.Sonata.Exception.CustumException;
import com.Sonata.Model.Student;

public interface StudDao {
	
			   public int addStudent(Object object);
			   public int updateStudent(Object object);
			   public int deleteStudent(Object object);
			   public List<Student> getAllStudent();
			   public void getStudent();
			   public void removeDulplicate();
			   
}