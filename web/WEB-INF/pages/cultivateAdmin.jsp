<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/17 0017
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>培训管理页面</title>
    <style>
        .dowebok { position: absolute; left: 50%; top: 70%; width: 1000px; height: 400px; margin: -300px 0 0 -500px; border: 1px solid #fff; border-radius: 20px; }

    </style>
</head>
<body>
<jsp:include page="manage.jsp"></jsp:include>
<hr>
<div class="dowebok" style="background: lightblue">
    <table cellspacing="0" cellpadding="10">
        <tr>
            <td colspan="4" style="width: 1000px;" align="center">培训管理</td>
        </tr>
        <tr>
            <td>培训名称</td>
            <td>培训时间</td>
            <td>培训部门</td>
            <td>操作</td>
        </tr>
        <c:if test="${!empty requestScope.cult}">
            <c:forEach items="${requestScope.cult}" var="cult">
                <tr>
                    <td>${cult.name}</td>
                    <td><f:formatDate value="${cult.dateTime}" pattern="yyyy-MM-dd"></f:formatDate> </td>
                    <td>${cult.departmentName}</td>
                    <td>
                        <a href="update_cult?id=${cult.id}">修改</a>
                        <a href="delete_cult?id=${cult.id}">删除</a>
                    </td>
                </tr>
            </c:forEach>
        </c:if>
        <c:if test="${empty requestScope.cult}">
            <tr>
                <td>暂时没有培训</td>
            </tr>
        </c:if>
        <tr>
            <td><a href="add_cult">添加</a></td>
        </tr>
    </table>
</div>
</body>
</html>
