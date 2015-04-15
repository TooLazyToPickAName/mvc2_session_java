<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<div class="space20"></div>
 <div id="footer">
     <c:forEach var="u" items="${users}">
         ${u.username}
     </c:forEach>
     <img src="img/footer.png" />
 </div>