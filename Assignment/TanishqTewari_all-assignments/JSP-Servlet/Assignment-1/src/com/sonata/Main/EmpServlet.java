package com.sonata.Main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sonata.DaoImpl.EmpDaoImpl;
import com.sonata.Model.Employee;

@WebServlet("/EmpServlet")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public EmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
	
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String sal=request.getParameter("sal");
		
		int id1 = Integer.parseInt(id);
		double sal1= Double.parseDouble(sal);
		
	Employee e1 = new Employee();
	e1.setEmpId(id1);
	e1.setEmpName(name);
	e1.setEmpSal(sal1);
	
	EmpDaoImpl dao= new EmpDaoImpl();
	int row=dao.save(e1);
	out.println("One row inserted "+row);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
