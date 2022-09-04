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
<h1><center>Finance Manager Register</center></h1>
<center>
<div class="login-block">

	<form action="insert" method="post">
		<b>Enter Name</b></br><input type="text" class=d name="name"><br>
		<b>Enter Email</b></br><input type="text" class=d name="email"><br>
		<b>Enter Phone number</b></br><input type="text" class=d name="phone"><br>
		<b>Enter User Name</b></br><input type="text"  class=d name="uid"><br>
		<b>Enter Your Password</b></br><input type="password" class=d name="psw"><br>
		
		<input type="submit" class=butt name="submit" value="Create Finance Manager Account">
	
	</form>
</center>

</body>
</html>