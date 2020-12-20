package com.sonata.DaoImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.sonata.Dao.CourseInterface;
import com.sonata.Model.Course;
import com.sonata.Model.Employee;

public class CourseImplementation implements CourseInterface {
	DbConnection db=new DbConnection();
	@Override
	public String addCourse(Course e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCourse(Course e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCourse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Course> showCourses() {
		// TODO Auto-generated method stub
		List<Course> List=new ArrayList<>();
		try {
			PreparedStatement cs1 =db.getConnection().prepareStatement("select * from course");
			ResultSet rs=cs1.executeQuery();
			//A table of data representing a database result set, which is usually generated b
			//By executing a statement that queries the database.
			while(rs.next()) {
				Course course=new Course();
				int id=rs.getInt(1);
				String cname=rs.getString(2);

				course.setCourseID(id);
				course.setCourseName(cname);
				List.add(course);
			}
		}catch(SQLException se) {
			se.printStackTrace();
		}
		return List;
	}

	@Override
	public List<Course> showCourses(String courseName) {
		return null;
	}

	@Override
	public List<Course> showCourses(Employee trainer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> showMyCourses() {
		// TODO Auto-generated method stub
		return null;
	}

}
