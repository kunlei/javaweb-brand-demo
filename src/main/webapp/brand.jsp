<%--
  Created by IntelliJ IDEA.
  User: klian
  Date: 5/21/22
  Time: 10:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Title</title>
</head>
<body>

<input type="button" value="Add" id="add"> <br>

<table border="1" cellspacing="0" width="80%">
    <tr>
        <th>Id</th>
        <th>Brand Name</th>
        <th>Company Name</th>
        <th>Ordered</th>
        <th>Description</th>
        <th>Status</th>
        <th>Operations</th>
    </tr>
    <c:forEach items="${brands}" var="brand">
        <tr align="center">
            <td>${brand.id}</td>
            <td>${brand.brandName}</td>
            <td>${brand.companyName}</td>
            <td>${brand.ordered}</td>
            <td>${brand.description}</td>A
            <c:if test="${brand.status == 1}">
                <td>on</td>
            </c:if>
            <c:if test="${brand.status == 0}">
                <td>off</td>
            </c:if>

            <td><a href="/javaweb-brand-demo/selectByIdServlet?id=${brand.id}">Update</a> <a href="#">Delete</a> </td>
            <br>
        </tr>
    </c:forEach>
</table>

<script>
    document.getElementById("add").onclick = function () {
      location.href = "/javaweb-brand-demo/addBrand.jsp";
    }
</script>

</body>
</html>
