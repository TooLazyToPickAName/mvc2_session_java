<%--
    Document   : header
    Created on : May 9, 2014, 9:36:07 AM
    Author     : windluffy
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <title>Header</title>
    </head>
    <body>
        <div id="header">
            <div id="header-top">
                <a id="header-logo" href="#"></a>
                <div id="header-search">
                    <form id="frmSearch" action="search.action" method="post">
                        <input type="text" name="txtSearch" value="" placeholder="Search..." />
                        <input type="submit" name="btnSearch" value="" />
                    </form>
                </div>
            </div>
            <!--End header-top-->

            <div id="header-nav">
                <ul>
                    <li><a href="#" class="first">About</a></li>
                    <li><a href="#">Shop</a></li>
                    <li><a href="#">News</a></li>
                    <li><a href="#">FAQs</a></li>
                    <li><a href="#">Help</a></li>
                </ul>
            </div>
        </div>
        <!--End Header-->

        <div id="content">
            <div id="content-left">
                <div class="box-content">
                    <div class="box-content-header">
                        <span class="title">Sign In</span>
                    </div>
                    <div class="box-content-content">
                        <form action="login.action" method="post">
                            <table class="tbl-login">
                                <tbody>
                                    <tr>
                                        <td class="label">
                                            <label for="txtUsername">Username</label>
                                        </td>
                                        <td class="input">
                                            <input type="text" name="txtUsername" value="" />
                                        </td>
                                    </tr>
                                    <tr>
                                        <td class="label">
                                            <label for="txtPassword">Password</label>
                                        </td>
                                        <td class="input">
                                            <input type="password" name="txtPassword" value="" />
                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="2" class="label">
                                            <a href="#">Forgot your password?</a>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="2" class="label center">
                                            <input class="btn" type="submit" value="Sign In" name="btnSignIn" />
                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="2" class="label center">
                                            <a href="#">Sign up</a>
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                        </form>
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
                        <div class="box-product">
                            <a href="#">
                                <img class="img-product" src="upload/img/chocolate-house.jpg" />
                            </a>
                            <a href="#">Fuck u</a>
                            <span class="product-price">$1.12</span>
                            <span class="class-energy">227kcal</span>
                        </div>
                    </div>

                </div>
                <!--End content-right-showproduct-->
            </div>
            <!--End Content-right-->
        </div>
        <!--End Main-content-->

    </body>
</html>
