<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="content-left">
    <div class="box-content">
        <div class="box-content-header">
            <span class="title">Sign In</span>
        </div>
        <div class="box-content-content">
            <%
                if (session.getAttribute("username") != null) {
                    out.println("Welcome " + session.getAttribute("username").toString());
                    out.println("<a href='logout.action'>Logout</a>");
                } else {%>

            <form action="login.action" method="post">
                <table class="tbl-login">
                    <tbody>
                        <tr>
                            <td class="td-label">
                                <label for="txtUsername">Username</label>
                            </td>
                            <td class="td-input">
                                <input type="text" name="txtUsername" value="" />
                            </td>
                        </tr>
                        <tr>
                            <td class="td-label">
                                <label for="txtPassword">Password</label>
                            </td>
                            <td class="td-input">
                                <input type="password" name="txtPassword" value="" />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2" class="td-label">
                                <a href="#">Forgot your password?</a>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2" class="td-label center">
                                <input class="btn" type="submit" value="Sign In" name="btnSignIn" />
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2" class="td-label center">
                                <a href="#">Sign up</a>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </form>

            <%}%>
        </div>
    </div>
    <!--End Box Login-->
    <div class="space20"></div>
    <div class="box-content">
        <div class="box-content-header">
            <span class="title">Categories</span>
        </div>
        <div class="box-content-content">
            <ul class="list-category">
                <c:forEach var="category" items="${categories}">
                    <li><a href="getProductsByCategory.action?cid=${category.id}" alt="${category.description}">${category.name}</a>
                </c:forEach>
            </ul>
        </div>
    </div>
    <!--End box categories-->
    <div class="space20"></div>
    <div class="box-content">
        <div class="box-content-header">
            <span class="title">Shopping carts</span>
        </div>
        <div class="box-content-content">
            <a href="cart.jsp">Show Cart</a>
        </div>
    </div>
</div>
<!--End Content-left-->