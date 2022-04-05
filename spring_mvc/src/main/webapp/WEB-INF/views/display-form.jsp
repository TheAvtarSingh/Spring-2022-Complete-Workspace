<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="process" method="get" modelAttribute = "user">
		<form:input type="text" path="name" placeholder="Enter your name" />
		<form:input type="text" path = "rollNo" placeholder="Enter your RollNumber" />
		<form:input type="password" path = "password" placeholder="Enter your password" />
		<input type="submit" />
	</form:form>

</body>
</html>