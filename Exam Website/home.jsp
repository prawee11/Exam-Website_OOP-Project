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
<c:url value="deleteManager.jsp" var="cusdelete">
     <c:param name="id" value="${id}"/>
     <c:param name="name" value="${name}"/>
      <c:param name="email" value="${email}"/>
      <c:param name="phone" value="${phone}"/>
      <c:param name="username" value="${username}"/>
      <c:param name="pass" value="${password}"/>
   </c:url>
 <ul>
   <li><a href="${cusdelete}">Delete Account</a></li>
   <li><a href="payment.jsp">Generate Payment Report</a></li>
   </ul>

</body>
</html>