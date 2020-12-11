package com.sonata.Product;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ProductServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int productID = Integer.parseInt(request.getParameter("pid"));
		String productName = request.getParameter("pname");
		double productPrice = Double.parseDouble(request.getParameter("pprice"));
		
		if(productPrice > 100.00) {
			response.sendError(406, "Price cannot be more than 100");
		}
		else {
			out.println("<HTML><BODY BFCOLOR = \"grey\">\n"
					+ "<h2>You have entered the following details : </h2>\n"
					+ "Product ID : " + productID + "\n"
					+ "Product Name : " + productName +"\n"
					+ "Product Price : " + productPrice + "</BODY></HTML>");
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
