
<div class="space20"></div>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="content">
    <div id="content-left">
        <div class="box-content">
            <div class="box-content-header">
                <span class="title">Sign In</span>
            </div>
            <%
                if (session.getAttribute("username") != null) {
                    out.println("Hello " + session.getAttribute("username").toString());
                    out.println("<a href='logout.action'>Logout</a>");
                } else {%>
            <div class="box-content-content">
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
            </div>
            <%}%>
        </div>
        <!--End Box Login-->
        <div class="space20"></div>
        <div class="box-content">
            <div class="box-content-header">
                <span class="title">Categories</span>
            </div>
            <div class="box-content-content">
                <ul class="list-category">
                    <li><a href="#">Plain</a></li>
                    <li><a href="#">Chocolate</a></li>
                    <li><a href="#">Cream</a></li>
                    <li><a href="#">Plain</a></li>
                    <li><a href="#">Plain</a></li>
                    <li><a href="#">Plain</a></li>
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
                <span>Undercontructor :v</span>
            </div>
        </div>
    </div>
    <!--End Content-left-->

    <div id="content-right">
        <div id="content-right-slide">
            <img src="img/slide.png" />
        </div>
        <!--End Slide-->
        <div class="space20"></div>
        <div id="content-right-showproduct">
            <div class="showproduct-header">
                <ul>
                    <li><a href="#" class="active">New!</a></li>
                    <li><a href="#">Ranking</a></li>
                    <li><a href="#">Recommend</a></li>
                </ul>
            </div>
            <div class="showproduct-content">
                <c:forEach var="product" items="${products}">
                    <div class="box-product">
                    <a href="getDetailProduct.action?pid='${product.id}'">
                        <img class="img-product" src="/iloveshopping/upload/img/chocolate-house.jpg" />
                    </a>
                    <a class="product-name" href="#">${product.name}</a>
                    <span class="product-price">${product.price}</span>
                    <span class="product-energy">${product.energy}kcal</span>
                    <a href="#" class="product-cart"></a>
                </div>
                </c:forEach>
                
                
            </div>

        </div>
        <!--End content-right-showproduct-->
    </div>
    <!--End Content-right-->
    <c:forEach var="p" items="${products}">
        ${p.name} - 
    </c:forEach>
</div>
<!--End Main-content-->