
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/14 0014
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>游客—反馈页面</title>
    <script src="/js/jquery-1.10.2.min.js"></script>
    <script>
        $(function () {
            <c:if test="${requestScope.str1!=null}">
                alert("${requestScope.str1}")
            </c:if>
        })
    </script>
</head>
<body>
    <jsp:include page="tourist.jsp"></jsp:include>
    <hr>
        <table>
            <tr>
                <td>应聘部门</td>
                <td>应聘岗位</td>
                <td>投递时间</td>
                <td>面试时间</td>
                <td colspan="2">操作</td>
            </tr>
            <c:forEach items="${requestScope.emp}" var="employ">
                <tr>
                    <td>${employ.departmentName}</td>
                    <td>${employ.positionName}</td>
                    <td><f:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${employ.deliverTime}"></f:formatDate></td>
                    <td><f:formatDate pattern="yyyy-MM-dd" value="${employ.interviewTime}"></f:formatDate></td>
                    <td><a href="accept_interview?id=${employ.id}">接受面试</a></td>
                    <td><a href="refuse_interview?id=${employ.id}">拒绝面试</a></td>
                </tr>
            </c:forEach>
        </table>

</body>
</html>
