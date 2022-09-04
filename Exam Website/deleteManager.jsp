<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"  href="login.css">
<title>Insert title here</title>
</head>
<body>
	<% 
	  String id=request.getParameter("id");
	  String name=request.getParameter("name");
	  String email=request.getParameter("email");
	  String phone=request.getParameter("phone");
	  String username=request.getParameter("username");
	  String password=request.getParameter("pass");
	  
	%>
	<div class="header">
	<h1><center>Finance Manager Account Delete</center></h1></div>
	<div class="login-block">
	<center>
	<form action="delete" method="post">
	<table>
	<tr>
	<td>Customer ID</td>
	<td><input type="text" name="cusid" value="<%= id %>" readonly></td>
	</tr>
	
	<tr>
	<td>Name</td>
	<td><input type="text" name="name" value="<%= name %>"></td>
	</tr>
	
	<tr>
	<td>Email</td>
	<td><input type="text" name="email" value="<%= email %>"></td>
	</tr>
	
	<tr>
	<td>Phone number</td>
	<td><input type="text" name="phone" value="<%= phone %>"></td>
	</tr>
	
	<tr>
	<td>User name</td>
	<td><input type="text" name="uname" value="<%= username %>"></td>
	</tr>
	
	<tr>
	<td>password</td>
	<td><input type="password" name="pass" value="<%= password %>"></td>
	</tr>
	</table>
	<input type="submit" name="submit" class=del value="Delete my data"><br>
	</form>
	</center>
	</div>
</body>
</html>