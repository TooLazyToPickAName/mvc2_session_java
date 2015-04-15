<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                    <a href="getDetailProduct.action?pid=${product.id}">
                        <img class="img-product" src="/iloveshopping/upload/img/chocolate-house.jpg" />
                    </a>
                    <a class="product-name" href="getDetailProduct.action?pid=${product.id}">${product.name}</a>
                    <span class="product-price">${product.price}</span>
                    <span class="product-energy">${product.energy}kcal</span>
                    <a href="addCart.action?pid=${product.id}" class="product-cart"></a>
                </div>
            </c:forEach>


        </div>
        <div class="paginator">
            <ul>
                <c:forEach varStatus="i" begin="1" end="${totalPages}" >
                    <li><a href="?numberPage=${i.index}">${i.index}</a></li>
                </c:forEach>
            </ul>
        </div>

    </div>
    <!--End content-right-showproduct-->
</div>
<!--End Content-right-->