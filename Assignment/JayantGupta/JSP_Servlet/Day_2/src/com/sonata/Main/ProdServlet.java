package com.sonata.Main;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.sonata.DaoImpl.ProdDaoImpl;
import com.sonata.Model.product;

@WebServlet("/ProdServlet")
public class ProdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ProdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
	
		String pid=request.getParameter("id");
		String pname=request.getParameter("name");
		String pprice=request.getParameter("price");
		
		int id1 = Integer.parseInt(pid);
		double price1= Double.parseDouble(pprice);
		
	product p1= new product();
	p1.setProdId(id1);
	p1.setProdName(pname);
	p1.setPrice(price1);
	
	ProdDaoImpl dao= new ProdDaoImpl();
	int row=dao.add(p1);
		
	List<product> list=dao.getAllProduct();
	request.setAttribute("products", list);

//	RequestDispatcher rd =request.getRequestDispatcher("AllProductDisplay.jsp");
//	
//	rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
