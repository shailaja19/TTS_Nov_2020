package com.Product;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ProductValidate")
public class ProductValidate extends HttpServlet {
	
    public ProductValidate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   response.setContentType("text/html");
		   PrintWriter pw=response.getWriter();
		   String n1=request.getParameter("p1");
		   String n2=request.getParameter("p2");
		   String st=request.getParameter("p3");
		   
		   int id=Integer.parseInt(n1);
		   double pr=Double.parseDouble(st);
		  
		   
		 
	

	if(pr > 100.00) {
		response.sendError(408, "Price cannot be more than 100");
	}
	else {
		pw.println("Product is valid");
	}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
