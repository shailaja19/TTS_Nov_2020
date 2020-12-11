package com.sonata.Main;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sonata.DaoImpl.ProductDAOImpl;
import com.sonata.Model.Product;

/**
 * Servlet implementation class InsertProduct
 */
@WebServlet("/InsertProduct")
public class InsertProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String price=request.getParameter("price");
		
		Product p1= new Product();
		p1.setName(name);
		p1.setPrice(price);
	
		
		ProductDAOImpl dao=new ProductDAOImpl();
		int s1=dao.save(p1);
		out.println("One row is inserted"+s1+"<br>");
			
			
		
			List<Product> list = dao.getData();
			  for(Product e : list){
			  out.println("<br>"+"ProductName: ");
			  out.println(e.getName());
			  out.println("<br>" +"ProductPrice: ");
			  out.println(e.getPrice());
			  out.println("<br>" );
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
