package com.sonata.TestMain;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/DisplaySession")
public class DisplaySession extends HttpServlet {
	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
           HttpSession session = request.getSession();
		
		int id = (int) session.getAttribute("t1");
		String name = (String) session.getAttribute("t2");
		double price=(double) session.getAttribute("t3");
		
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
