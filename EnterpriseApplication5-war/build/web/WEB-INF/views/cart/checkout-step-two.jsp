<%-- 
    Document   : checkout
    Created on : May 6, 2019, 11:25:38 PM
    Author     : Manh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Checkout page Step 2</title>
    </head>
    <body>
        <h1>Address confirmation</h1>
        
        <div>${fullName.lastname} ${fullName.middleName} ${fullName.firstName}</div>
        <div>${address.district}, ${address.city}, ${address.country}</div>
        <div>${phone.phonenumber}</div>
        <div></div>
        
        <a href="<%=request.getContextPath()%>/Payment">Proceed</a>
    </body>
</html>
