<%--
  Created by IntelliJ IDEA.
  User: Icarus
  Date: 2021/6/2
  Time: 22:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" isELIgnored="false" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>客户信息</title>
</head>
<body>
    <div class="container">
        <table border="1">
            <tr>
                <td>编号</td>
                <td>名称</td>
                <td>职业</td>
                <td>电话</td>
            </tr>
            <tr>
                <td>${customer.id}</td>
                <td>${customer.username}</td>
                <td>${customer.job}</td>
                <td>${customer.phone}</td>
            </tr>
        </table>
    </div>
</body>
</html>
