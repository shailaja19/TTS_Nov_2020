package com.sonata.StudDao;

import java.util.List;

import com.sonata.StudModel.Student;

public interface StdntDao {
	public int addStudent(Object object);
	public List<Student> getAllStudent();
	public int deleteStudent(Object object);
	public int updateStudent(Object object);

}
