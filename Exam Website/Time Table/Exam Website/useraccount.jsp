<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"  href="login.css">
<title>Insert title here</title>
<style type="text/css">
</style>
</head>
<div class="header">
<h1 >Finance Manager DashBoard</h1>
</div>
<body>
	<table style="margin-top: 200px; margin-left:auto; margin-right: auto; ">
	<c:forEach var="cus" items="${cusDetails}" >
	
	<c:set var="id" value="${cus.id }"/>
	<c:set var="name" value="${cus.name}"/>
	<c:set var="email" value="${cus.email}"/>
	<c:set var="phone" value="${cus.phone}"/>
	<c:set var="username" value="${cus.userName}"/>
	<c:set var="password" value="${cus.password}"/>
	
	<tr>
	   <td>Customer ID</td>
	   <td>${cus.id}</td>
	</tr>
	<tr>
	   <td>Customer Name</td>
	   <td>${cus.name}</td>
	</tr>
	<tr>
	   <td>Customer Email</td>
	   <td>${cus.email}</td>
	</tr>
	<tr>
	  <td>Customer Phone</td>
	  <td>${cus.phone}</td>
	</tr>
	<tr>
	  <td>Customer User Name</td>
	  <td>${cus.userName}</td>
	</tr>
	<tr>
	  <td>Customer Password</td>
	  <td>${cus.password}</td>
	</tr>
	
    </c:forEach>
    
   </table>
   <c:url value="updatecustomer.jsp" var="cusupdate">
      <c:param name="id" value="${id}"/>
      <c:param name="name" value="${name}"/>
      <c:param name="email" value="${email}"/>
      <c:param name="phone" value="${phone}"/>
      <c:param name="username" value="${username}"/>
      <c:param name="pass" value="${password}"/>
   </c:url>
   

   <c:url value="deleteManager.jsp" var="cusdelete">
     <c:param name="id" value="${id}"/>
     <c:param name="name" value="${name}"/>
      <c:param name="email" value="${email}"/>
      <c:param name="phone" value="${phone}"/>
      <c:param name="username" value="${username}"/>
      <c:param name="pass" value="${password}"/>
   </c:url>
   <ul>
   <li><a href="${cusupdate}">Update Account</a></li>
   <li><a href="${cusdelete}">Delete Account</a></li>
   <li><a href="payment.jsp">Generate Payment Report</a></li>
   <li><a href="paymentissues.jsp">Paymentissues Report</a></li>
   <li><a href="login.jsp">Logout</a></li>
   </ul>
   
   
  
 
</body>
</html>