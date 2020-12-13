package com.sonata.TestMain;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Studentmarks")
public class Studentmarks extends HttpServlet {
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String s1=request.getParameter("t1");
		int id=Integer.parseInt(s1);
		String s2=request.getParameter("t2");
		String s3=request.getParameter("t3");
		int m1=Integer.parseInt(s3);
		String s4=request.getParameter("t4");
		int m2=Integer.parseInt(s4);
		String s5=request.getParameter("t5");
		int m3=Integer.parseInt(s5);
		
		double m4=m1+m2+m3;
		if(m4/300>0.80) {
			RequestDispatcher rd = request.getRequestDispatcher("Studentdetails.jsp");
			    rd.forward(request, response);
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
