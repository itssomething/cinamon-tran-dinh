<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap/bootstrap.css" type="text/css"> 
    <link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap/form.css" type="text/css"> 
    <link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap/checkout.css" type="text/css"> 
    <link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap/etalage.css" type="text/css"> 
    <link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap/megamenu.css" type="text/css"> 
    <link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap/style.css" type="text/css"> 

  </head>
  <body>

    <jsp:include page="/WEB-INF/views/layouts/header.jsp" />
    <!--<h3>Sign Up Page</h3>-->
    <p style="color: red;">${errorString}</p>
    <p style="color: red;">${username}</p>

    <div class="login">
      <div class="wrap">
<!--        <div class="col_1_of_login span_1_of_login">

        </div>-->
        <div class="col_1_of_login span_1_of_login">
          <form method="POST" action="${pageContext.request.contextPath}/CustomerLogin">

            <div class="login-title">
              <h4 class="title">Login</h4>
              <div class="comments-area">
                <form>
                  <p>
                    <label>Name</label>
                    <span>*</span>
                    <input type="text" name="username" id="username">
                  </p>
                  <p>
                    <label>Password</label>
                    <span>*</span>
                    <input type="password" name="password" id="password">
                  </p>

                  <p>
                    <input type="submit" value="Login">
                  </p>
                </form>
              </div>
            </div>

          </form>
        </div>


        </body>
        </html>