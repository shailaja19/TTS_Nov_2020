<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>	
<div align="center">
		<h2>User Login</h2>
		<form:form action="login" method="post" modelAttribute="user">
			<form:label path="id">Emp Id:</form:label>
			<form:input path="id"/><br/>
						
			<form:label path="password">Password:</form:label>
			<form:password path="password"/><br/>		
			
			<form:button>Login</form:button>
		</form:form>
	</div>
</body>
</html>