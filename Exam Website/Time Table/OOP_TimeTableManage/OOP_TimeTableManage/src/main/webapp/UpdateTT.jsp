<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="tt.dbConnect.*"%>
<%@page import="tt.model.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<link rel = "stylesheet"
   type = "text/css"
   href = "Insert.css" />
   
<meta charset="ISO-8859-1">
<title>Insert Time Table</title>

<div align="center">
</head>
<body class="body">
<%
	Connection connect = dbConnect.getConnection();

		PreparedStatement stat = null;
		Statement stmt = null;
		ResultSet rs = null;
	%>
	
	
	<form action="update" method="post">
		
		<%
		String Eid = request.getParameter("u");
		int eid = Integer.parseInt(Eid);
		
		stmt= connect.createStatement();
		String sql="select * from timetable where Eid='"+eid+"'";
		rs = stmt.executeQuery(sql);
		//PreparedStatement stmt = null;

			while(rs.next())
			{
				
			%>
			
			
		
		
		<table>
		<tr>
			<td> EID</td>
			<td><%=rs.getString(1)%></td>
		</tr>
		<tr>
		
			<td>Type</td>
			<td><input type="text" name="Type" value="<%= rs.getString(2) %>"></td>
		</tr>
		<tr>
		<td>Year</td>
		<td><input type="text" name="Year" value="<%=rs.getString(3) %>"></td>
	</tr>
	<tr>
		<td>Semester</td>
		<td><input type="text" name="Semester" value="<%= rs.getString(4) %>"></td>
	</tr>
	<tr>
		<td>Module</td>
		<td><input type="text" name="Module" value="<%= rs.getString(5) %>"></td>
	</tr>
	<tr>
		<td>Date</td>
		<td><input type="text" name="Date" value="<%= rs.getString(6) %>"></td>
	</tr>
	<tr>
		<td>Time</td>
		<td><input type="text" name="Time" value="<%=rs.getString(7) %>"></td>
	</tr>
		
		
	  </table>
	  <%
	} 
	
	%>



	<br>
	<button type="submit" name="submit" value="Update timetable Data"> Update </button>
	
	</form>
	</body>
</html>


	<%
	String Eid1 = request.getParameter("Eid");
	String Type = request.getParameter("name");
	String Year = request.getParameter("email");
	String Semester = request.getParameter("phone");
	String Module = request.getParameter("address");
	String Date = request.getParameter("designation");
	String Time = request.getParameter("department");
	

		if ( Eid1 != null )
		{
			 			
	String updateQuery="update timetable set  Type=?, Year=?, Semester=?, Module=?, Date=?, Time=?, where Eid='"+Eid1+"'";
	stat.setString(1, Type);
    stat.setString(2, Year);
    stat.setString(3, Semester);
    stat.setString(4, Module);
    stat.setString(5, Date);
    stat.setString(6, Time);

    
    stat=connect.prepareStatement(updateQuery);

	 stat.executeUpdate();
	 RequestDispatcher disp2 = request.getRequestDispatcher("TimeTable.jsp");
		disp2.forward(request, response);
	}
	%>
	



	


