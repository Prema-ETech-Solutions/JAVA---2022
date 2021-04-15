<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Second PAGE</title>
</head>
<body>
	<h1>SECOND PAGE</h1>
	<%
		String a = request.getParameter("Value");
	%>
	<h1>
		VALUE
		<%=a%>
	</h1>

	<c:set var="name" value="LOL"></c:set>

	<c:out value="${name}"></c:out>
	
</body>
</html>