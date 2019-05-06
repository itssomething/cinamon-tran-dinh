<%-- 
    Document   : header
    Created on : May 6, 2019, 12:36:15 AM
    Author     : Manh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="#">Navbar</a>

    <div class="form-inline my-2 my-lg-0">
        ${sessionScope.username}
    </div>

</nav>
