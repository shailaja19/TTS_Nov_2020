package com.Main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DaoImpl.EmpDAOImpl;
import com.Model.Employee;




@WebServlet("/InsertEmployee")
public class InsertEmployee extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		String id=request.getParameter("t1");
		String name=request.getParameter("t2");
		String sal=request.getParameter("t3");
		
		int id1=Integer.parseInt(id);
		double sal1=Double.parseDouble(sal);
		
		Employee e= new Employee();
		e.setEmpId(id1);
		e.setEmpName(name);
		e.setEmpSal(sal1);
		
		EmpDAOImpl imp=new EmpDAOImpl();
		int e2=imp.save(e);
		out.println("One row is inserted "+e2);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
