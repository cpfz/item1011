<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/16 0016
  Time: 14:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加部门</title>
</head>
<body>
<p style="color: red">当前用户：${sessionScope.user.name}</p>
    <form action="add_dept">
        <table>
            <tr><td colspan="2" align="center">添加部门</td></tr>
            <tr>
                <td>部门名称：</td>
                <td><input type="text" name="name"></td>
            </tr>
        </table>
        <button type="submit">确定添加</button>
    </form>
</body>
</html>
