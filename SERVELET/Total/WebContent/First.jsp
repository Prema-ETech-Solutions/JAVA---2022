<%@page import="java.util.Random"%>

<!-- DIRECTIVE TAG -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First JSP PAGE</title>
</head>
<body>
	<h1>HELLO WORLD</h1>
	<p>
		<%!/* DECLARATIVE TAG   */
	int a = 1100, b = 10000;
	String N1 = "A";

	public int add() {
		return a + b;
	}

	public String value() {
		return N1;
	}%>
	</p>
	<h1>
		<%
			/* SCRIPTLET TAG  */
		out.println(add());
		out.println("<br>");
		out.println(value());
		%>
	</h1>

	<h1>
		SUM OF A + B :
		<%=a + b%></h1>
	<!-- EXPRESSIVE TAG -->
	<%@ include file="DatePage.jsp"%>

	<!--  JAVA SOME SIMPLE PROGRAMS -->
	<%!Random num = new Random();%>
	<h2>
		Printing RANDOM NUMBER
		<%=num.nextInt(10)%>
	</h2>
	<br>
	<hr>
	<hr>
	<form action="Second.jsp">
		<h1>GO TO SECOND PAGE</h1>
		<input type="text" name="Value">
		<button type="submit">GO</button>
	</form>
	<br>
	<hr>
	<hr>
	<footer>
		<!-- PRINTING FOOTER FOR A JSP PAGE -->
		<%@ include file="Foot.jsp"%>
	</footer>
 
</body>
</html>