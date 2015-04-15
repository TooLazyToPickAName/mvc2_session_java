<%-- 
    Document   : error404.jsp
    Created on : May 12, 2014, 4:35:19 PM
    Author     : windluffy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error 404</title>
    </head>
    <body>
        <h1>404 Page Not Found!</h1>
        <%
            if (request.getAttribute("errorMsg") != null) {
                out.println("Error detected: " + request.getAttribute("errorMsg"));
            }
        %>
    </body>
</html>
