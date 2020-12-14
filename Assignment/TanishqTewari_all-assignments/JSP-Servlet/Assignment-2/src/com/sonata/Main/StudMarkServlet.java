package com.sonata.Main;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/studmark")
public class StudMarkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		double marksc=Double.parseDouble(request.getParameter("marks"));
		String name=request.getParameter("name");
		int id1=Integer.parseInt(request.getParameter("id"));
		
		request.setAttribute("marks", marksc);
		request.setAttribute("name", name);
		request.setAttribute("id", id1);
		
		if(marksc>=80 && marksc<=100)
		{
			RequestDispatcher rd = request.getRequestDispatcher("goodMarks.jsp");
			rd.forward(request,response);
		}
		else
		{
			response.sendError(544, "Marks not in 80-100 range");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
