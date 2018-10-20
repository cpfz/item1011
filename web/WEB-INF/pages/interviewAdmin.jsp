
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/14 0014
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>面试管理页面</title>
</head>
<body>
<jsp:include page="manage.jsp"></jsp:include>
<hr>
    <table border="1" cellspacing="0" style="background: lightblue" align="center">
        <tr>
            <td colspan="8" align="center">面试信息</td>
        </tr>
        <tr>
            <td>序号</td>
            <td>面试者</td>
            <td>面试部门</td>
            <td>面试岗位</td>
            <td>投递时间</td>
            <td>面试时间</td>
            <td colspan="2">操作</td>
        </tr>
        <c:if test="${!empty requestScope.employ}">
            <c:forEach items="${requestScope.employ}" var="employ">
                <tr>
                    <td>${employ.id}</td>
                    <td>${employ.applicantName}</td>
                    <td>${employ.departmentName}</td>
                    <td>${employ.positionName}</td>
                    <td>${employ.deliverTime}</td>
                    <td>${employ.interviewTime}</td>
                    <td><a href="hire?id=${employ.id}&uId=${employ.userId}">录用</a></td>
                    <td><a href="no_hire?id=${employ.id}&uId=${employ.userId}">不录用</a></td>
                </tr>
            </c:forEach>
        </c:if>

        <c:if test="${empty requestScope.employ}">
            <tr>
                <td colspan="8">暂时没有面试</td>
            </tr>
        </c:if>
    </table>
</body>
</html>
