<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/16 0016
  Time: 12:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>岗位信息页面</title>
    <script src="/js/jquery-1.10.2.min.js"></script>
    <script>
        $(function () {
            <c:if test="${requestScope.str!=null}">
                alert("${requestScope.str}")
            </c:if>
        })
    </script>
    <style>
        body{
            background: url("/img/c.jpg");
        }
    </style>
</head>
<body>
<jsp:include page="manage.jsp"></jsp:include>
<hr>
    <table border="1" cellspacing="0" style="width: 200px;background: lightblue">
        <tr>
            <td colspan="3" align="center">${requestScope.dept.name}部门岗位</td>
        </tr>
        <tr>
            <td>岗位</td>
            <td colspan="2">操作</td>
        </tr>
        <c:if test="${!empty requestScope.position}">
            <c:forEach items="${requestScope.position}" var="position">
                <tr>
                    <td>${position.name}</td>
                    <td><a href="delete_post?pId=${position.id}&dId=${requestScope.dept.id}">删除</a></td>
                    <td><a href="update_post?pId=${position.id}&dId=${requestScope.dept.id}">修改</a></td>
                </tr>
            </c:forEach>
        </c:if>
        <c:if test="${empty requestScope.position}">
            <tr>
                <td>${requestScope.dept.name}还没有岗位，你可以点增加进行添加</td>
            </tr>
        </c:if>
    </table>
    <button><a href="save_post?dId=${requestScope.dept.id}">增加</a></button>
    <button onclick="window.open('dept_admin')">返回上一页</button>
</body>
</html>
