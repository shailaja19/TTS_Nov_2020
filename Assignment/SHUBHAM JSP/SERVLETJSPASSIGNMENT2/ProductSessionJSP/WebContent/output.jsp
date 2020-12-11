<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Output page: Fetching the value from session</title>
</head>
<body>
<% 
String productname=(String)session.getAttribute("sessionname"); 
String productprice=(String)session.getAttribute("sessionprice"); 

out.print("Hello User:" + "<br>"+ "You have entered<br>"+ "ProductName: "+productname+" <br>"+"ProductPrice: "+productprice); 
%> 
</body>
</html>