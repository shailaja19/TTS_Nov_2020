<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Success</title>
<style type="text/css">
	span {
		display: inline-block;
		width: 200px;
		text-align: left;
	}
</style>
</head>
<body>
	<div align="center">
		<h2>login Succeeded!</h2>
		<span>Full name:</span><span>${user.name}</span><br/>
		
		<span>Password:</span><span>${user.password}</span><br/>		
		
	</div>
</body>
</html>