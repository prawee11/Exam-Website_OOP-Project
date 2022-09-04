<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>redirect</title>
</head>
<body>

<c:forEach var="tt" items="${TTDetail}"  > 
<!-- Call TimeTable,java file get methods -->
<c:set var="id" value="${tt.EID}"/>

<!--  ${tt.Year}
${tt.Semester}
${tt.Module}
${tt.Date}
${tt.Time}-->
 </c:forEach>


</body>
</html>