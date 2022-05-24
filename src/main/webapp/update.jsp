<%--
  Created by IntelliJ IDEA.
  User: klian
  Date: 5/23/22
  Time: 8:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Update Brand</title>
</head>
<body>
<h3>Update brand</h3>

<form action="/javaweb-brand-demo/updateServlet" method="post">
<%--    hidden field--%>
    <input type="hidden" name="id" value="${brand.id}">

    Brand name: <input name="brandName" value="${brand.brandName}"> <br>
    Company name: <input name="companyName" value="${brand.companyName}"> <br>
    Ordered: <input name="ordered" value="${brand.ordered}"><br>
    Description: <textarea rows="5" cols="20" name="description">${brand.description} </textarea><br>
    Status:
    <c:if test="${brand.status == 0}">
        <input type="radio" name="status" value="0" checked="checked">Off
        <input type="radio" name="status" value="1">On <br>
    </c:if>
    <c:if test="${brand.status == 1}">
        <input type="radio" name="status" value="0">Off
        <input type="radio" name="status" value="1" checked>On <br>
    </c:if>

    <input type="submit" value="submit">
</form>

</body>
</html>
