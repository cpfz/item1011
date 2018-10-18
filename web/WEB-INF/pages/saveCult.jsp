<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/17 0017
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>添加培训</title>
</head>
<body>
<jsp:include page="manage.jsp"></jsp:include>
<hr>
<form action="save_cult">
    <table style="background: lightblue" border="1" cellspacing="0">
        <tr>
            <td align="center" colspan="4">添加培训信息</td>
        </tr>
        <tr>
            <td>培训名称</td>
            <td>培训时间</td>
            <td>培训部门</td>
            <td>操作</td>
        </tr>
        <tr>
            <td><input type="text" name="name"></td>
            <td><input type="date" name="time"></td>
            <td>
                <select name="departmentName">
                    <c:forEach items="${requestScope.department}" var="dept">
                        <option>${dept.name}</option>
                    </c:forEach>
                </select>
            </td>
            <td>
                <button type="submit">确定添加</button>
                <button onclick="window.open('cultivate_admin')">返回</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
