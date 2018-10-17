<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/16 0016
  Time: 13:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改部门</title>
</head>
<body>
<p style="color: red">当前用户：${sessionScope.user.name}</p>
<form action="alter_dept">
    <input type="hidden" name="deptName" value="${requestScope.dept.name}">
    <input type="hidden" name="id" value="${requestScope.dept.id}">
    <table border="2">
        <tr>
            <td colspan="2" align="center">修改部门信息</td>
        </tr>
        <tr>
            <td>原部门名称：${requestScope.dept.name}</td>
            <td>修改为：<input type="text" name="name"></td>
        </tr>
    </table>
    <button type="submit">确定修改</button>
    <button onclick="window.open('dept_admin')">返回上一页</button>
</form>
</body>
</html>
