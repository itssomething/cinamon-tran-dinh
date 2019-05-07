<%-- 
    Document   : header
    Created on : May 6, 2019, 12:36:15 AM
    Author     : Manh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="<%=request.getContextPath()%>/computerIndex">Navbar</a>

  <div class="mr-2">
    ${sessionScope.username}
  </div>
  <div class="nav-item mr-2">
    <a href="<%=request.getContextPath()%>/CustomerInfo"> My account</a>
  </div>
  <div class="nav-item mr-2">
    <a href="<%=request.getContextPath()%>/ViewCart"> View cart</a>
  </div>
  <div class="nav-item mr-2">
    <a href="<%=request.getContextPath()%>/Logout"> Log out</a>
  </div>
  <form method="POST" action="${pageContext.request.contextPath}/SearchProductByName" class="form-inline my-2 my-lg-0">
    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" name="productName" id="productName">
    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
  </form>

</nav>

