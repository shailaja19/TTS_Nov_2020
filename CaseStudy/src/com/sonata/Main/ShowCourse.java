package com.sonata.Main;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sonata.DaoImpl.CourseImplementation;
import com.sonata.Model.Course;
import com.sonata.Dao.*;

/**
 * Servlet implementation class ShowCourse
 */
@WebServlet("/ShowCourse")
public class ShowCourse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowCourse() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		CourseImplementation dao=new CourseImplementation();

		List<Course> list = dao.showCourses();
		  for(Course c : list){
		  out.println("<br>"+"CourseId: ");
		  out.println(c.getCourseID());
		  out.println("<br>" +"CourseName: ");
		  out.println(c.getCourseName());
		  out.println("<br>" );
		  }
		  out.println("<br>" );
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
