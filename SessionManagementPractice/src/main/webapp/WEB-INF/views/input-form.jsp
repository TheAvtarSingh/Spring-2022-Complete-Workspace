<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Aadhar Verification Registration Form</title>

<style>
	.error{
		color:red
	}
</style>
</head>
<body>
Your Unique Session Id : ${UserID}
<form:form action="process" method="post" modelAttribute="user">
<label for="name">User Name(*)</label>
	<form:input type="text" path="userName" /> 
	<form:errors path="userName" cssClass="error"/><br><br>
	
	<label for="id">Aadhar ID(*)</label>
	<form:input type="text" path="aadharId" /> 
	<form:errors path="aadharId" cssClass="error"/><br><br>
	
	<label for="mail">Email id(*)</label>
	<form:input type="email" path="email" /> 
	<form:errors path="email" cssClass="error"/><br><br>
	
		
	<label for="num">Phone Number</label>
	<form:input type="number" path="number" /> 
	<form:errors path="number" cssClass="error"/><br><br>
	
		
	<label for="date">Date of Birth(*)</label>
	<form:input type="date" path="dob" placeholder="dd/MM/yyyy"/> 
	<form:errors path="dob" cssClass="error"/><br><br>
	
		
	<label for="state">State(*)</label>
	Enter State
	<form:select path="state">
<form:options items="${user.stateOptions}"/>
	</form:select> 
	<form:errors path="state" cssClass="error"/><br><br>
	
	<label>Gender: </label>
	<form:radiobuttons path="gender" items="${user.genderOptions}"/> 
	
	<br><br>
		<label>Category(*) : </label> 
	<form:checkboxes path = "category" items="${user.categoryOptions}" /> 
	<form:errors path="category" cssClass="error"/><br><br>
	
	
	<br><br>
		<label>Age(*) : </label> 
		<form:input type="number" path="age" /> 
	<form:errors path="age" cssClass="error"/><br><br>
	
		
	
<label>Address(*) : </label>
<form:textarea rows="4" cols="50" path="address" placeholder="Enter your Address "/>
<form:errors path="address" cssClass="error"/><br><br>
	


<label for="pass">Password:</label>
<form:input type="password" path="pass" placeholder="Enter Your Password Here "/><br><br>
<form:errors path="pass" cssClass="error"></form:errors>



<%-- <label for="age">Age:</label>
<form:select id="age" path="age">
<option value="1yearold">less than 1 year old</option>
<option value="below18">Below 18</option>
<option value="above18">Above 18</option>
</form:select>

<form:errors path="age" cssClass="error"></form:errors> --%>

<%-- <br><br>
	<label>Languages Known : </label> 
	<form:checkboxes path = "language" items="${user.languageOptions}" /> <br> <br>
 --%>
<%-- 
<form:errors path="instruction" cssClass="error"></form:errors>  --%>
<br><br>
<input type="submit" value="Send">
<input type="reset" value="Clear">
</form:form>
</body>
</html>