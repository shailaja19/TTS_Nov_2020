package com.sonata.Dao;
import java.util.List;

import com.sonata.Model.Student;

import java.sql.SQLException;

public interface StdDao {
	
			   public int addStudent(Object object);
			   public int updateStudent(Object object);
			   public int deleteStudent(Object object);
			   public List<Student> getAllStudent();
			   

}
