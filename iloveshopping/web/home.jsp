<%-- 
    Document   : home
    Created on : May 13, 2014, 7:00:36 AM
    Author     : windluffy
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home - ILoveShopping</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>

        <jsp:include page="header.jsp" />
        
        <div id="content">
            <jsp:directive.include file="content_left.jsp" />
            <jsp:directive.include file="content_right.jsp" />
        </div>
            
        
        <jsp:include page="footer.jsp" />
    </body>
</html>
