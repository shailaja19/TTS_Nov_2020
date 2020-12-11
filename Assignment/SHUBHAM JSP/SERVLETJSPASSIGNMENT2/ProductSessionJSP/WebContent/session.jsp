<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Passing value to a session variable</title>
</head>
<body>
<% 
String pname=request.getParameter("pname"); 
String pprice=request.getParameter("pprice"); 

session.setAttribute("sessionname",pname); 
session.setAttribute("sessionprice",pprice); 

%> <br>
<a href="output.jsp">Check Output Page Here </a>
</body>
</html>