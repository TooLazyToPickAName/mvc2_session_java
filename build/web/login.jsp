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
        <style>
            div{
                margin: 0px 0px 10px 10px;
            }
            label{
                float:left;
                height:30px;
                width:100px;
            }
        </style>
    </head>
    <body>
        
            <form action="login" method="post">
                <fieldset>
                    <div>
                        <label>UserName</label>
                        <input type="text" name="name"/>
                    </div>
                    <div>
                        <label>Password</label>
                        <input type="password" name="password"/>
                    </div>
                        <label></label>
                        <div><input type="submit" name="submit" value="Login"/></div>
                </fieldset>
            </form> 
    </body>
</html>
