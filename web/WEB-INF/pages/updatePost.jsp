<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/16 0016
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改岗位信息</title>
</head>
<body>
<p style="color: red">当前用户：${sessionScope.user.name}</p>
<form action="alter_position">
    <input type="hidden" name="positionName" value="${requestScope.posit.name}">
    <input type="hidden" name="id" value="${requestScope.posit.id}">
    <input type="hidden" name="departmentId" value="${requestScope.dept.id}">
    <table border="2">
        <tr>
            <td colspan="2" align="center">修改${requestScope.dept.name}部门岗位信息</td>
        </tr>
        <tr>
            <td>原岗位名称：${requestScope.posit.name}</td>
            <td>修改为：<input type="text" name="name"></td>
        </tr>
    </table>
    <button type="submit">确定修改</button>
    <button onclick="window.open('')">返回上一页</button>
</form>
</body>
</html>
