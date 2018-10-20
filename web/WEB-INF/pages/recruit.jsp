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
    <script src="/js/jquery-1.10.2.min.js"></script>
    <script>

    </script>
</head>
<body>
<jsp:include page="tourist.jsp"></jsp:include>
<hr>
    <div class="d1">
        <form action="input_Resume" method="post">
            <input type="hidden" name="userId" value="${sessionScope.user.id}">
        <table cellspacing="0" style="background: lightblue;width: 600px" border="1">
            <tr>
                <td>招聘部门</td>
                <td>招聘岗位</td>
                <td>职责</td>
                <td>薪资</td>
                <td>地址</td>
                <td>操作</td>
            </tr>
            <c:if test="${!empty requestScope.recruit}">
                <c:forEach items="${requestScope.recruit}" var="recruit">
                    <tr>
                        <td>${recruit.dept}</td>
                        <td>${recruit.post}</td>
                        <td>${recruit.function}</td>
                        <td>${recruit.price}</td>
                        <td>${recruit.site}</td>
                        <td><button type="submit" class="bu1">投简</button></td>
                    </tr>
                </c:forEach>
            </c:if>
            <c:if test="${empty requestScope.recruit}">
                <tr>
                    <td colspan="3">目前没有招聘信息</td>
                </tr>
            </c:if>

        </table>
        </form>
    </div>
</body>
</html>
