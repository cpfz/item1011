<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/16 0016
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加部门岗位信息</title>
    <style>
        body{
            background: url("/img/c.jpg");
        }
    </style>
</head>
<body>
<p style="color: red">当前用户：${sessionScope.user.name}</p>
<form action="add_position">
    <input type="hidden" name="departmentId" value="${requestScope.dept.id}">
    <table>
        <tr><td colspan="2" align="center">添加${requestScope.dept.name}部门岗位</td></tr>
        <tr>
            <td>岗位名称：</td>
            <td><input type="text" name="name"></td>
        </tr>
    </table>
    <button type="submit">确定添加</button>
</form>
</body>
</html>
