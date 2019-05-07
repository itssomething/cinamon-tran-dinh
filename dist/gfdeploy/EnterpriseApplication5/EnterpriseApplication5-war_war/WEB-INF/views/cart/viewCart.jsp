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
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/cart.css" type="text/css"> 
    <link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap/bootstrap.css" type="text/css"> 
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css" type="text/css"> 
  </head>
  <body style="font-size: 18px">
    <jsp:include page="/WEB-INF/views/layouts/header.jsp" />
    <br>
    <div class="col-xs-8 cart-col-1">
      <c:forEach items="${products}" var="product">


        <div class="row shopping-cart-item">
          <div class="col-xs-3 img-thumnail-custom">
            <p class="image">

              <img class="img-responsive" src="https://hanoicomputercdn.com/media/product/44324_dell_latitude_5490_001.jpg">
            </p>
          </div>
          <div class="col-right">
            <div class="box-info-product">
              
              <div class="badge-tikinow-a">
                <p class="name">${product.name}</p>
              </div>
              <div class="badge-tikinow-b">
                <p class="name">${product.name}</p>
              </div>
              <!-- <button type="button" class="btn btn-default btn-custom1 add-to-wishlist" data-product-id="107557">Đưa vào wishlist</button> -->
              </p>
            </div>
            <div class="badge-tikinow-a">
              <div class="box-price">
                <p class="price"></p>

              </div>
            </div>
            <div class="badge-tikinow-b">
              <div class="box-price">
                <p class="price">${product.price}</p>
              </div>
            </div>

            <div class="quantity-block">

            </div>
            <!-- <div class="box-info-discount"></div> -->
          </div>
        </div>
      </c:forEach>
    </div>
  </body>
</html>
