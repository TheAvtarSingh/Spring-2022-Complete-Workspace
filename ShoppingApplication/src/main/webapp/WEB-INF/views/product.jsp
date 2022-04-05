<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product detail Page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<h1>Product Detail</h1>
<form action="#" th:action="@{/addToCart}" method="post">
    <p>Product Code: <input type="text" name="productCode"/></p>
    <p>Description: This is really an awesome page </p>
    <p><input type="submit" value="Add To Cart" />
        <a href="CartPageController/cart" name="Cart Page">Go To cart Page</a>
</form>
</body>
</html>