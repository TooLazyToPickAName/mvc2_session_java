<%-- 
    Document   : ShoppingCart
    Created on : Apr 10, 2015, 1:38:44 PM
    Author     : Shine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to shopping online</title>
    </head>
    <body>
        <jsp:useBean class="com.model.ShoppingCart" id="Cart" scope="session"/>
        <jsp:setProperty name="Cart" property="product" param="name"/>
        <h2>giỏ hàng của bạn</h2>
        <ul><li>
        <jsp:getProperty name="Cart" property="products"/></li></ul>
        <p><a href="login-success.jsp">click để tiêp tục mua hàng</a></p>
    </body>
</html>
