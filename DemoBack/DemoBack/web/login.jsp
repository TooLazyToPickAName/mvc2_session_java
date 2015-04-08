

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>trang này đã được bảo vệ, bạn cần đăng nhập vs tài khoản và mật khẩu là (admin, admin)</h1>
        <form action="login">
            <input type="hidden" name="url" value="${param.url}"/>
            <input type="text" name="username" value="" /><br/>
            <input type="password" name="password" value="" /><br/>
            <input type="submit" />
        </form>
    </body>
</html>
