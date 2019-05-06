<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Login</title>
    </head>
    <body>


        <h3>Sign Up Page</h3>
        <p style="color: red;">${errorString}</p>
        <p style="color: red;">${username}</p>


        <form method="POST" action="${pageContext.request.contextPath}/CustomerLogin">
            <table border="0">
                <tr>
                    <td>User Name</td>
                    <td><input type="text" name="username" value="${customer.username}" />
                    </td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="text" name="password" value="${customer.password}" />
                    </td>
                </tr>
                <tr>
                    <td>Remember me</td>
                    <td><input type="checkbox" name="rememberMe" value="Y" /></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="Submit" /> <a
                            href="${pageContext.request.contextPath}/">Cancel</a></td>
                </tr>
            </table>
        </form>



    </body>
</html>