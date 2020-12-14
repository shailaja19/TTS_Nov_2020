package com.sonata.Main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ProdReturnSession")
public class ProdReturnSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		
		int id = (int) session.getAttribute("PID");
		String name = (String) session.getAttribute("PName");
		double price=(double) session.getAttribute("PPrice");
		
		PrintWriter out = response.getWriter();
		out.println( "Product ID "+ id); 
		out.println( "Product Name "+ name);
		out.println( "Product Price "+ price);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
