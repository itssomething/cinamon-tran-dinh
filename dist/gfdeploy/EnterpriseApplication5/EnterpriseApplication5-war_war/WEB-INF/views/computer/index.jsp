<%-- 
    Document   : index
    Created on : May 5, 2019, 6:07:23 AM
    Author     : Manh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Computer list</title>
        <link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap/bootstrap.css" type="text/css"> 
        <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" type="text/css"> 
    </head>
    <body>
        <jsp:include page="/WEB-INF/views/layouts/header.jsp" />
        <div class="container">
            <div class="grid-container">

                <c:forEach items="${computers}" var="computer">
                    <div class="card" style="width: 13rem;">
                        <img class="card-img-top" src="https://hanoicomputercdn.com/media/product/44324_dell_latitude_5490_001.jpg" alt="Card image cap">
                        <div class="card-body">
                            <h5 class="card-title">${computer.name}</h5>
                            <p class="card-text">${computer.price} VND</p>
                            <a href="<%=request.getContextPath()%>/AddToCart?productID=${computer.productID}" class="btn btn-primary float-right">Add to cart</a>
                        </div>
                    </div>
                </c:forEach>


            </div>
        </div
    </body>
</html>
