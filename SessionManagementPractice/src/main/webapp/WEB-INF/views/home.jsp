<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
    Your Unique Session Id : ${UserID}
        <h1>Hello World!</h1>
        <p>This is the homepage!</p>
         <h2>Click here to go to input- Form Page</h2>
         <!-- Mapped Controller - ADO  -->
        <a href="UserController/display">Click here to go to input Page</a>
    </body>
</html>
