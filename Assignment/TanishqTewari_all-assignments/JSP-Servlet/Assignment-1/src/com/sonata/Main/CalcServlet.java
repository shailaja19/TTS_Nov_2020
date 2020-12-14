package com.sonata.Main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CalcServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String op = request.getParameter("operation");
		int num1 = Integer.parseInt(request.getParameter("FirstNumber"));
		int num2 = Integer.parseInt(request.getParameter("SecondNumber"));
		int res = 0;
		
		switch (op) {
		case "add":
			res = num1 + num2;
			break;
		case "sub":
			res = num1 - num2;
			break;
		case "mul":
			res = num1 * num2;
			break;		
		case "div":
			res = num1/num2;
			break;
		default :
			res=0;
			break;
		}
		out.println("Output : " + res);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
