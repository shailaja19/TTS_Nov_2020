package com.sonata.TestMain;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sonata.DaoImpl.ProdDAOImpl;
import com.sonata.Model.Product;


@WebServlet("/ProductData")
public class ProductData extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		   PrintWriter pw=response.getWriter();
		
		    String s1=request.getParameter("t1");
		   int productId=Integer.parseInt(s1);
		   String s2=request.getParameter("t2");
		   String s3=request.getParameter("t3");
		   double productPrice=Double.parseDouble(s3);
		   
		   Product p1= new Product();
		   p1.setProductID(productId);
		   p1.setProductName(s2);
		   p1.setProductPrice(productPrice);
		   
		   ProdDAOImpl p2=new ProdDAOImpl();
		   int row=p2.insert(p1);
		   pw.println("The no. of inserted rows: "+ row);
		   List<Product> list=p2.getData();
			for(Product s:list) {
				pw.println(s.getProductID());
				pw.println(s.getProductName());
				pw.println(s.getProductPrice());
			}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
