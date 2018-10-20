<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/18 0018
  Time: 18:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>培训通知</title>
</head>
<body>
    <jsp:include page="staff.jsp"></jsp:include>
    <hr>
    <table border="1" cellspacing="0" style="background: lightblue" align="center">
        <tr>
            <td colspan="3" align="center">培训通知</td>
        </tr>
        <tr>
            <td>培训名称</td>
            <td>培训时间</td>
            <td>培训部门</td>
        </tr>
        <c:forEach items="${requestScope.cult}" var="cult">
            <tr>
                <td>${cult.name}</td>
                <td>${cult.dateTime}</td>
                <td>${cult.departmentName}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
