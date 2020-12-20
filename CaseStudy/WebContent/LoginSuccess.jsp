<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.sonata.*"%>
<%@page import="java.sql.*"%>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Course Catalog</title>
</head>
<body>
    <h3>Login successful!!!</h3>
    <h4>
        <%
        String id=request.getParameter("id");
        session.setAttribute("sessionid",id); 
        String idname=(String)session.getAttribute("sessionid"); 
        %>
        
        <%
        
        Connection con;
        Statement st;
        ResultSet rs;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/casestudy","root","root");
            st=con.createStatement();
           
            if(idname!=null)
            {
                String query="select employeename from employee where employeeid='"+idname+"'";
                rs=st.executeQuery(query);
                if(rs.next())
                {
                    String empname=rs.getString("employeename");
                    %>
                    <div><p>Welcome  <%=empname +" "+ idname%></p></div>
                    <%    
                }
            }
            
        }
        catch(Exception e)
            {
                out.println("Error="+e);
            }
        %>
        
     </h4>
    <h4> <a href="course.jsp">Go to Course</a></h4>


</body>
</html>