package com.sonata.Main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ProdAddSession")
public class ProdAddSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		int prodId = Integer.parseInt(request.getParameter("ID"));
		String prodName = request.getParameter("Name");
		double prodPrice = Double.parseDouble(request.getParameter("Price"));
		
		HttpSession session = request.getSession();
		
		session.setAttribute("PID",prodId);
		session.setAttribute("PName",prodName);
		session.setAttribute("PPrice",prodPrice);
		
		RequestDispatcher rd = request.getRequestDispatcher("ProdReturnSession");
		rd.forward(request,response);
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}