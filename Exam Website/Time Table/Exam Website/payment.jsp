<%@ page language="java"
      contentType="text/html; charset=windows-1256"
      pageEncoding="windows-1256"
   %>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>


       <%

String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "hotel";
String userid = "root";
String password = "lakshan0112657741";


try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}


Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>

<!DOCTYPE html>
<html>

<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"  href="login.css">
</head>
<div class="header">
<h1><center>Payment Report</center></h1></div>
<body>
<table class=tabledecor >
  <tr class="header">
<tr>

<td>Userid</td>
<td>payment type</td>
<td>Amount</td>

</tr>
<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from payment";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>

<td><%=resultSet.getString("Userid") %></td>
<td><%=resultSet.getString("Payment type") %></td>
<td><%=resultSet.getString("Amount") %></td>

</tr>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>

</table> 
<center><input type="submit" name="submit" class=button value="update Payment"></center><br>


</body>
</html>