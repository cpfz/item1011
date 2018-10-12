<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/11 0011
  Time: 20:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>招聘信息展示</title>
    <style>
        body{
            background: url("/img/c.jpg");
        }
        .d1{
            margin-top: 150px;
            margin-left: 200px;
        }
    </style>
</head>
<body>
    <p style="color: red">当前用户：${requestScope.user.name}</p>
    <div class="d1">
        <table cellspacing="20" cellpadding="">
            <tr>
                <td>招聘岗位</td>
                <td>职责</td>
                <td>薪资</td>
            </tr>
            <c:if test="${!empty requestScope.recruit}">
                <c:forEach items="${requestScope.recruit}" var="recruit">
                    <tr>
                        <td>${recruit.dept}</td>
                        <td>${recruit.function}</td>
                        <td>${recruit.price}</td>
                    </tr>
                </c:forEach>
            </c:if>
            <c:if test="${empty requestScope.recruit}">
                <tr>
                    <td colspan="3">目前没有招聘信息</td>
                </tr>
            </c:if>
            <tr>
                <td><button onclick="window.open('Resume')">投简</button></td>
                <td><button onclick="window.open('see_resume')">查看简历</button></td>
                <td>修改密码</td>
            </tr>
        </table>
    </div>
</body>
</html>
