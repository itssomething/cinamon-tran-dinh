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
        <title>Customer info edit</title>
        <link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap/bootstrap.css" type="text/css"> 
    </head>
    <body>
        <div class="container">
            <form method="POST" action="${pageContext.request.contextPath}/CustomerInfoEdit">
                <input type="hidden" id="userID" name="userID" value="${userID}">
                <div class="form-group">
                    <label for="username">Username</label>
                    <input class="form-control" type="text" name="username" id="username" value="${account.username}">
                </div>

                <div class="form-group">
                    <label for="username">Password</label>
                    <input class="form-control" type="text" name="password" id="password" value="${account.password}">
                </div>

                <div class="form-group">
                    <label for="username">First name</label>
                    <input class="form-control" type="text" name="firstName" id="firstName" value="${fullName.firstName}">
                </div>

                <div class="form-group">
                    <label for="username">Middle name</label>
                    <input class="form-control" type="text" name="middleName" id="middleName" value="${fullName.middleName}">
                </div>

                <div class="form-group">
                    <label for="username">City</label>
                    <input class="form-control" type="text" name="city" id="city" value="${fullName.city}">
                </div>

                <div class="form-group">
                    <label for="username">District</label>
                    <input class="form-control" type="text" name="distric" id="distric" value="${address.distric}">
                </div>

                <div class="form-group">
                    <label for="username">Country</label>
                    <input class="form-control" type="text" name="country" id="country" value="${address.country}">
                </div>

                <div class="form-group">
                    <label for="username">Phone number</label>
                    <input class="form-control" type="number" name="phoneNumber" id="phoneNumber" value="${phone.phoneNumber}">
                </div>
                <button class="btn btn-primary" type="submit">Save</button>
            </form>
        </div>
    </body>
</html>
