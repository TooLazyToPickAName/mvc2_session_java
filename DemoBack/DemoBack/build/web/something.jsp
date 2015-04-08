

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Protected page</title>
    </head>
    <body>
        <jsp:include page="logout.jsp"/>
        <h1>Shopping Cart sử dụng javaBean</h1>
        <ul>
            <li><a href = "add.jsp?name=Tivi">Tivi</a></li>
            <li><a href = "add.jsp?name=Tủ Lạnh">Tủ Lạnh</a></li>
            <li><a href = "add.jsp?name=Máy giặt">Máy giặt</a></li>
            <li><a href = "add.jsp?name=Điều Hòa">Điều Hòa</a></li>
            <li><a href = "add.jsp?name=Máy Tính">Máy Tính</a></li>
            <li><a href = "add.jsp?name=Điện thoại">Điện thoại</a></li>
            
        </ul>
    </body>
</html>
