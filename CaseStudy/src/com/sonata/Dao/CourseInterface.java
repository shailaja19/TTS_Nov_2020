package com.sonata.Dao;
import java.util.List;
import com.sonata.Model.*;

public interface CourseInterface {
	public String addCourse(Course e);
	public void deleteCourse(Course e); //will call showMyCourses and iterate through that to find the course
	public void updateCourse();
	public List<Course> showCourses();
	public List<Course> showCourses(String courseName);
	public List<Course> showCourses(Employee trainer);
	public List<Course> showMyCourses();
}

