<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Input Form</title>
</head>
<body>
<h2>User input Form</h2>
<form action="processForm" method = "get">
<input type ="text" name = userName placeholder = "Enter your Name"/>

<input type ="text" name = userRoll placeholder = "Enter your Roll Number"/>

<input type ="password" name = password placeholder = "Enter your Password"/>
<input type = "submit"/> 

</form>
</body>
</html>