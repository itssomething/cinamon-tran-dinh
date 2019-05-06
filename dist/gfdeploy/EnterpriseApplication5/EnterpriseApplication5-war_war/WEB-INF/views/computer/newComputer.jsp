<%-- 
    Document   : newComputer
    Created on : May 4, 2019, 4:58:09 PM
    Author     : Manh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>computer create</title>
        <link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap/bootstrap.css" type="text/css"> 
    </head>
    <body>
        <h1>computer create</h1>
        
        <div class="container">
            <form method="POST" action="${pageContext.request.contextPath}/ComputerCreate">
                <!--<input type="hidden" id="userID" name="userID" value="${userID}">-->
                <div class="form-group">
                    <label for="name">Name</label>
                    <input class="form-control" type="text" name="name" id="name">
                </div>

                <div class="form-group">
                    <label for="price">Price</label>
                    <input class="form-control" type="text" name="price" id="price">
                </div>

                <div class="form-group">
                    <label for="stock">Stock</label>
                    <input class="form-control" type="text" name="stock" id="stock">
                </div>

                <div class="form-group">
                    <label for="brand">Brand</label>
                    <input class="form-control" type="text" name="brand" id="brand">
                </div>

                <div class="form-group">
                    <label for="ram">Ram</label>
                    <input class="form-control" type="text" name="ram" id="ram">
                </div>
                
                <div class="form-group">
                    <label for="processor">Processor</label>
                    <input class="form-control" type="text" name="processor" id="processor">
                </div>
                
                <div class="form-group">
                    <label for="hardDrive">Hard Drive</label>
                    <input class="form-control" type="text" name="hardDrive" id="hardDrive">
                </div>
                
                <div class="form-group">
                    <label for="os">OS</label>
                    <input class="form-control" type="text" name="os" id="os">
                </div>
                
                <div class="form-group">
                    <label for="color">Color</label>
                    <input class="form-control" type="text" name="color" id="color">
                </div>
                
                <div class="form-group">
                    <label for="screenSize">Screen size</label>
                    <input class="form-control" type="text" name="screenSize" id="screenSize">
                </div>
                
                <button class="btn btn-primary" type="submit">Save</button>
            </form>
        </div>
    </body>
</html>
