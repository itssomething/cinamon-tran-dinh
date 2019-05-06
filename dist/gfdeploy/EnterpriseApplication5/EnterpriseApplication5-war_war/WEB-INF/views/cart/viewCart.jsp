<%-- 
    Document   : viewCart
    Created on : May 6, 2019, 10:01:04 AM
    Author     : Manh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Cart</title>
    </head>
    <body>
        <c:forEach items="${products}" var="product">
            <div class="card" style="width: 13rem;">
                <img class="card-img-top" src="https://hanoicomputercdn.com/media/product/44324_dell_latitude_5490_001.jpg" alt="Card image cap">
                <div class="card-body">
                    <h5 class="card-title">${product.name}</h5>
                    
                </div>
            </div>
        </c:forEach>F
    </body>
</html>
