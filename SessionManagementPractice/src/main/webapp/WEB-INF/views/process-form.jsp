<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Processed Data</title>
</head>
<body>
Your Unique Session Id : ${UserID}
<hr>
<h1>User Details are : </h1>

<hr>
Name : ${user.userName }<br>
Aadhar id : ${user.aadharId }<br>
Email Address : ${user.email }<br>
Phone Number : ${user.number }<br>
Date of Birth : ${user.dob }<br>
State : ${user.state }<br>
Gender : ${user.gender}<br>
Age : ${user.age}<br>
Category : ${user.category}<br>
Address : ${user.address }<br>
Password : ${user.pass}<br>

<hr><br>

<a href="mail">Click here to mail Your Data || Session Will Expire After Clicking on This</a>
<a href="PrintController/print">Click here to Print Your Data || Session Will Not Expire After Clicking on This</a>
</body>
</html>