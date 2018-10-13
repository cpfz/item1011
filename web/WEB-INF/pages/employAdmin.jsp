<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/13 0013
  Time: 12:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>应聘管理</title>
    <style>
    </style>
</head>
<body>
<jsp:include page="manage.jsp"></jsp:include>
<hr>
    <form>
        <table border="1" style="background: lightblue">
            <tr>
                <td colspan="9">应聘信息</td>
            </tr>
            <tr>
                <td>序号：</td>
                <td>应聘者：</td>
                <td>投递时间：</td>
                <td>应聘部门：</td>
                <td>应聘岗位：</td>
                <td>查看状态：</td>
                <td>面试状态：</td>
                <td colspan="2">操作：</td>
            </tr>
            <c:if test="${empty requestScope.em}">
                <tr>
                    <td colspan="9" align="center">没有未查看的应聘信息</td>
                </tr>
            </c:if>
            <c:if test="${!empty requestScope.em}">
                <c:forEach items="${requestScope.em}" var="employ">
                    <tr>
                        <td>${employ.id}</td>
                        <td>${employ.applicantName}</td>
                        <td><f:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${employ.deliverTime}" /></td>
                        <td>${employ.departmentName}</td>
                        <td>${employ.positionName}</td>
                        <td>${employ.status}</td>
                        <td>${employ.interview}</td>
                        <td><a href="seeResume?userId=${employ.userId}&id=${employ.id}">查看</a></td>
                        <td><a href="deleteEmploy?id=${employ.id}">删除</a></td>
                    </tr>
                </c:forEach>

            </c:if>
        </table>
    </form>
</body>
</html>
