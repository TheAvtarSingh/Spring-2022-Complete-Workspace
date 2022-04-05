<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Processed Form</title>
</head>
<body>
<h1>Processed Data</h1><br><hr><br>

<!-- 
For fetching Original Data
<h2>Student Name :</h2> ${param.userName}
<h2>Student Roll No. :</h2> ${param.userRoll}
<h2>Student Password :</h2> ${param.password}
 -->
<!-- 
For fetching changed Data
 -->
<h2>Name :</h2> ${error}

<h2>Password :</h2> ${param.userPass}
<h2> Gender. :</h2> ${gender}
<h2> Age :</h2> ${param.age}
<h2>Instructions  :</h2> ${inst}



</body>
</html>