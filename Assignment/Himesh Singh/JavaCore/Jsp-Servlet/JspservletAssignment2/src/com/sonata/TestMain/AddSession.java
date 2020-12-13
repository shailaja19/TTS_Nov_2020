package com.sonata.TestMain;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AddSession")
public class AddSession extends HttpServlet {
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		int Id = Integer.parseInt(request.getParameter("t1"));
		String name = request.getParameter("t2");
		double price = Double.parseDouble(request.getParameter("t3"));
		
		HttpSession session = request.getSession();
		
		session.setAttribute("t1",Id);
		session.setAttribute("t2",name);
		session.setAttribute("t3",price);
		
		RequestDispatcher rd = request.getRequestDispatcher("DisplaySession");
		rd.forward(request,response);
			
	}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
