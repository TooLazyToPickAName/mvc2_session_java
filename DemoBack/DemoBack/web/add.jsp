

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ADD</title>
    </head>
    <body>
        
        <jsp:useBean class="useJavaBean.ShoppingCart" id="shoppingCart" scope="session"/>
        <jsp:setProperty name="shoppingCart" property="product" param="name"/>
        <h1>giỏ hàng của bạn</h1>
        <jsp:getProperty name="shoppingCart" property="products"/>
        <a href="something.jsp">ấn vào để tiếp tục mua hàng</a>
        
        
        
    </body>
</html>
