<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"  href="login.css">
<title>Login</title>
</head>
<body>
<h1>
<div class="logins">
Finance Manager Login</h1>
</div>
<center>
<div class="login-block">
	<form action="login" method="post">
	     <label for="uname"><b>User name</br></label>
		<input type="text" class=d name="username" placeholder="Enter Username"><br>
		<label for="psw">Password</br></label>
	     <input type="password" class=d name="password" placeholder="Enter Password"><br>
	    <input type="submit" class=button name="submit" value="Login">
	    
	    <a href="Fminsert.jsp">
   <input type="button" name="submit" class=button value="New Manager Register">
   </a>
	    
	
	</form>
</div>
</center>

</body>
</html>