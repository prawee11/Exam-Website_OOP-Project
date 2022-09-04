<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="tt.dbConnect.*"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

	<style type="text/css">
		table, th, td {
  			border: 1px solid black;
		}
		
	</style>
	
</head>
<body>
<h1>TimeTable Details</h1>
	
	<form action="" method="post">
	
		<table>
		  <tr>
                <th>EID</th>
                <th>Type</th>   
                <th>Year</th>
                <th>Semester</th>
                <th>Module</th>           
                <th>Date</th>
                <th>Time</th>
                      
		</tr>
	<%
	try
	{
		Connection connect = dbConnect.getConnection();
    	Statement state = connect.createStatement();
		String sql = "select * from timetable";
		ResultSet rs = state.executeQuery(sql);
	
	while(rs.next())
	{
	%>
	<tr>
		<td><%=rs.getString(1) %></td>
		<td><%=rs.getString(2) %></td>
		<td><%=rs.getString(3) %></td>
		<td><%=rs.getString(4) %></td>
		<td><%=rs.getString(5) %></td>
		<td><%=rs.getString(6) %></td>
		<td><%=rs.getString(7) %></td>
	
		
	<td><a href="UpdateTT.jsp?u=<%=rs.getString(1) %>" name="update"> Update TimeTable</a> </td>
	<td><a href="deleteTT.jsp?d=<%=rs.getString(1) %>" name="delete"> Delete</a><td>
	
	 </td>

	<% 
	
}
%>
	</tr>
		</table>
	</form>
    <%

    }
	catch(Exception e)
	{
    e.printStackTrace();
    }


%>
	
</body>
</html>