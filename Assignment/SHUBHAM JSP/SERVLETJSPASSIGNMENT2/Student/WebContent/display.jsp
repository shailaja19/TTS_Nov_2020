<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="green">
<%
	int java=Integer.parseInt(request.getParameter("java"));
	int dbms=Integer.parseInt(request.getParameter("dbms"));
	int c=java+dbms;
	double avg=c/2;
	if(avg>80)
	{
	out.println("Excellent!!" +"<br>"+"Student Name: ");
	out.println(request.getParameter("stuname"));
	out.println("<br>"+"Student Marks: ");
	out.println(request.getParameter("rollno"));
	out.println("<br>");
	out.println("Marks: "+avg);
	}
	else 
	{
	out.println("Work Hard");
	}
%>
 <br>
</body>
</html>
