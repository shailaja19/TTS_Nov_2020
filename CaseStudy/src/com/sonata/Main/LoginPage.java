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
import javax.servlet.http.HttpSession;

import com.sonata.DaoImpl.LoginImplementation;
import com.sonata.Model.Employee;

/**
 * Servlet implementation class LoginPage
 */
@WebServlet("/LoginPage")
public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
        PrintWriter out = response.getWriter(); 
		int n=Integer.parseInt(request.getParameter("id"));  
        String p=request.getParameter("pass"); 
    
        HttpSession session = request.getSession(false);
        if(session!=null)
        session.setAttribute("id", n);
        LoginImplementation b1 = new LoginImplementation();
        
        if(b1.validate(n, p)){  
        	
            RequestDispatcher rd=request.getRequestDispatcher("LoginSuccess.jsp");  
            rd.forward(request,response);  
            
        }  
        else{  
            out.print("<p style=\"color:red\">Sorry username or password invalid</p>");  
            RequestDispatcher rd=request.getRequestDispatcher("index.html");  
            rd.include(request,response);  
        }  
        out.close();  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
