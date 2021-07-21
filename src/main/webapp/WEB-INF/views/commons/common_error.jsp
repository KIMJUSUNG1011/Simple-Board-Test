<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kjs
  Date: 2021/07/21
  Time: 11:59 오전
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error Page</title>
</head>
<body>
<section class="content container-fluid">
    <h3><i class="fa fa-warning text-red"></i>${exception.getMessage()}</h3>
    <ul>
        <c:forEach items="${exception.getStackTrace()}" var="stack">
            <li>${stack.toString()}</li>
        </c:forEach>
    </ul>
</section>
</body>
</html>
