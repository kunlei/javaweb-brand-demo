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
    <title>Add Brand</title>
</head>
<body>
<h3>Add brand</h3>

<form action="/javaweb-brand-demo/addServlet" method="post">
    Brand name: <input name="brandName"> <br>
    Company name: <input name="companyName"> <br>
    Ordered: <input name="ordered"><br>
    Description: <textarea rows="5" cols="20" name="description"> </textarea><br>
    Status:
    <input type="radio" name="status" value="0">Off
    <input type="radio" name="status" value="1">On <br>

    <input type="submit" value="submit">
</form>

</body>
</html>
