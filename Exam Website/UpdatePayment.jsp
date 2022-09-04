<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% 
	  String id=request.getParameter("Userid");
	  String name=request.getParameter("Payment type");
	  String email=request.getParameter("Amount");
	  
	%>
	<form action="updatep" method="post">
	<table>
	<tr>
	<td>user ID</td>
	<td><input type="text" name="Userid" value="<%= Userid %>" readonly></td>
	</tr>
	
	<tr>
	<td>Name</td>
	<td><input type="text" name="Payment type" value="<%= Payment type %>"></td>
	</tr>
	
	<tr>
	<td>Email</td>
	<td><input type="text" name="Amount" value="<%= Amount %>"></td>
	</tr>
	<input type="submit" class=button name="submit" value="update my data"><br>
	</form>
</body>
</html>