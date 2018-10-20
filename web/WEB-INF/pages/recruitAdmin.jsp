<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/20 0020
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>招聘管理</title>
    <script src="/js/jquery-1.10.2.min.js"></script>
    <script>
        $(function () {
            $("#a1").click(function () {
                var flag=confirm("你确定要删除吗？")
                if(!flag){
                    return false
                }
            })
        })
    </script>
</head>
<body>
<jsp:include page="manage.jsp"></jsp:include>
<hr>
    <table border="1" cellspacing="0" style="background: lightblue">
        <tr>
            <td colspan="6" align="center">招聘管理</td>
        </tr>
        <tr>
            <td>招聘部门</td>
            <td>招聘岗位</td>
            <td>工作职责</td>
            <td>薪资</td>
            <td>地点</td>
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
                    <td>
                        <a href="update_recruit?id=${recruit.id}">修改</a>
                        <a href="delete_recruit?id=${recruit.id}" id="a1">删除</a>
                        <a href="save_recruit">增加</a>
                    </td>
                </tr>
            </c:forEach>
        </c:if>
        <c:if test="${empty requestScope.recruit}">
            <tr>
                <td>没有招聘信息</td>
            </tr>
        </c:if>

    </table>
</body>
</html>
