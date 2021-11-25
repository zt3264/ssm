<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>信息保存</title>
</head>
<body>
        <form action="${pageContext.request.contextPath}/account/save" method="post">
            账号姓名：<input type="text" name="name"><br>
            账号金额：<input type="text" name="money"><br>
                     <input type="submit" value="提交">
        </form>
</body>
</html>
