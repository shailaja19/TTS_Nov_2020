<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.io.*,java.util.*, javax.servlet.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
                      <h1 align="center" style="color:blue">
                      
                             ${GoodAfternoon}
                      
                       </h1>
                       <br><br>
                      
     <%  
         out.print( "<h2 align = \"center\">" +"The Current Date and Time is"+"</h2>");
        
         Date date = new Date();
         out.print( "<h2 align = \"center\">" +date.toString()+"</h2>");
      %>
</body>
</html>