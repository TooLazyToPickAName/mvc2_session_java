<%-- 
    Document   : detail_product
    Created on : May 14, 2014, 9:39:35 AM
    Author     : windluffy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${product.name} - I Love Shopping!</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link href="css/detail_product.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        <div id="content">
            <jsp:directive.include file="content_left.jsp" />
            <jsp:directive.include file="content_right_detail_product.jsp" />
        </div>
            <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
