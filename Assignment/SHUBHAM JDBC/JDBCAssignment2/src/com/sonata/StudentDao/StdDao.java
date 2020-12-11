package com.sonata.StudentDao;
import java.util.List;
import com.sonata.StudentModel.Student;

public interface StdDao {
	public int addStudent(Object object);
	public List<Student> getAllStudent();
	public int deleteStudent(Object object);
	public int updateStudent(Object object);
	
}
