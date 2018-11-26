<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1">
        <tr>
            <td width="100">账号</td>
            <td width="100">姓名</td>
        </tr>
    <c:forEach items="${list}" var="x">
        <tr>
            <td width="100">${x.getId()}</td>
            <td width="100">${x.getName()}</td>
        </tr>
    </c:forEach>
    </table>
</body>
</html>
