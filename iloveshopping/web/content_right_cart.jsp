<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="content-right">
    <table border="1px" width="100%">
        <thead>
            <tr>
                <th>Product ID</th>
                <th>Product Name</th>
                <th>Product Price</th>
                <th>Quantity</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="pCart" items="${sessionScope.cart.products}">
                <tr>
                    <td>${pCart.id}</td>
                    <td>${pCart.name}</td>
                    <td>${pCart.price}</td>
                    <td><input type="number" min="1" max="50" value="${pCart.quanity}" /></td>
                    <td><a href="delete.action?pid=${pCart.id}">Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <button>Update</button>
</div>
<!--End Content-right-->