<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>数据展示</title>
</head>
<body>
        <table border="1">
            <tr>
                <th>账户id</th>
                <th>账户姓名</th>
                <th>账号余额</th>
            </tr>
            <c:forEach items="${accountList}" var="account">
                <tr>
                    <td>${account.id}</td>
                    <td>${account.name}</td>
                    <td>${account.money}</td>
                </tr>
            </c:forEach>

        </table>
</body>
</html>
