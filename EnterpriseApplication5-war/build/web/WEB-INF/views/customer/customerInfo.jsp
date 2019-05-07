<%-- 
    Document   : customerInfor
    Created on : May 3, 2019, 11:49:05 AM
    Author     : Manh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer info</title>
    </head>
    <body>
        <h1>Customer info</h1>
        <div><b>Username: </b>${account.username}</div>
        <div><b>Password: </b>${account.password}</div>
        <div><b>Point </b>${customer.point}</div>
        <div><b>Level </b>${customer.level}</div>
        <div><b>First name </b>${fullName.firstName}</div>
        <div><b>Middle name </b>${fullName.middleName}</div>
        <div><b>Last name </b>${fullName.lastname}</div>
        <div><b>City </b>${address.city}</div>
        <div><b>District </b>${address.district}</div>
        <div><b>Country </b>${address.country}</div>
        <div><b>Phone </b>${phone.phonenumber}</div>
        
        <a href="${pageContext.request.contextPath}/CustomerInfoEdit?userID=${userID}">Edit</a>
    </body>
</html>
