<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<h2>Personal Particular</h2>
<form action="processForm" method="get">
<label for="name">Name:</label>
<input type="text" id="name" name="userName"><br><br>
<label for="pass">Password:</label>
<input type="password" id="pass" name="userPass"><br>

<h3>Gender : </h3>


<input type="radio" name="gender" value="male">Male</input>
 <input type="radio" name="gender" value="female">Female</input>

<br><br>

<label for="age">Age:</label>
<select id="age" name="age">
<option value="1yearold">1 year old</option>
<option value="below18">Below 18</option>
<option value="above18">Above 18</option>
</select>

<h3>Languages : </h3>
<input type="checkbox" id="java" name="java" value="JAVA">
<label for="java"> Java</label>
<input type="checkbox" id="C/C++" name="C/C++" value="C/C++">
<label for="C/C++"> C/C++</label>
<input type="checkbox" id="C#" name="C#" value="C#">
<label for="C#"> C#</label>
<input type="checkbox" id="Python" name="Python" value="Python">
<label for="Python"> Python</label>
<input type="checkbox" id="Javascript" name="Javascript" value="Javascript">
<label for="Javascript"> Javascript</label><br>

<h3>Instruction</h3>
<textarea rows="4" cols="50" name="instruction">Enter your instruction here...</textarea><br><br>

<input type="submit" value="Send">
<input type="reset" value="Clear">
</form>
</body>
</html>