package com.sonata.Main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProdErrServlet")
public class ProdErrServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ProdErrServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String productID = request.getParameter("prodid");
		String Name = request.getParameter("pname");
		String productPrice = request.getParameter("price");
		int productID1 = Integer.parseInt(productID);
		double price= Double.parseDouble(productPrice);
		if(price > 100.00) {
			response.sendError(599, "Price should be less than 100");
		}
		else {
			out.println("<HTML><BODY>\n"
					+ "<h2>Product Details Entered : </h2> <br>"
					+ "Product ID : " + productID1 + "<br>"
					+ "Product Name : " + Name +"<br>"
					+ "Product Price : " + price + "</BODY></HTML>");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
