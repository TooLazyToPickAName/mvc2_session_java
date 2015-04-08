<%-- 
    Document   : login.jsp
    Created on : Apr 8, 2015, 5:46:41 PM
    Author     : phongtq <phongtq at vnext.vn>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>JSP Page</title>
    </head>
    <body>
        <form action="ControllerServlet" method="post">  
            Name:<input type="text" name="name"><br>  
            Password:<input type="password" name="password"><br>  
            <input type="submit" value="login">  
        </form> 
    </body>
</html>
