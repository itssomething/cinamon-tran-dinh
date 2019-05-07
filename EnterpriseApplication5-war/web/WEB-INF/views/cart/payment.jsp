<%-- 
    Document   : payment
    Created on : May 7, 2019, 12:05:12 AM
    Author     : Manh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Payment</title>
    </head>
    <body>
        <h1>${total}</h1>
        <a href="<%=request.getContextPath()%>/PlaceOrder"
           <form method="POST" action="/PlaceOrder">
             <input type="submit" value="Submit">
          </form>
    </body>
</html>
