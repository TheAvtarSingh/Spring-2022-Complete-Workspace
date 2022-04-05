<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cart</title>
</head>
<body>
<h1>Product Detail</h1>
<h1>Product list</h1>

<table>
    <tr>
        <th>Product Code Code</th>
    </tr>
    <tr th:each="prod : ${cart.products}">
        <td th:text="${prod}">Onions</td>
    </tr>
</table>
</body>
</html>