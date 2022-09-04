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


   <h1 class="h1">Insert Data Into TimeTable</h1>

	<form action="insert" method="post">
   <div class="container">
	
   
		<h2>Please fill in this form.</h2><br>
		<fieldset><p>USE THIS FORAMT PLEASE<br> <br>Exam Id:Insert Id number Head of Examiner given <br>Exam Type:Mid/Final/Lab Test/Other<br>Year:Y1/Y2/Y3/Y4<br>Semester:S1/S2</p></fieldset>
		<b> <hr>
		Exam Id :<input type = "text" name = "Eid" >
       <br><br>
		Exam Type :<input type = "text" name = "ExamType" >
       <br><br>
		Year :<input type = "text" name = "Year" >
		<br><br>
		Semester :<input type = "text" name = "Semester" >
		<br><br>
		Module :<input type = "text" name = "Module">
		<br><br>
		Date :<input type = "text" name = "Date">
		<br><br>
		Time :<input type = "text" name = "Time" >
		<br><br></b>
		
		<hr>
	
		
		<input type = "submit" name = "submit" value = "Insert Data" class="list"> 	
	</form>
</body>

</html>
