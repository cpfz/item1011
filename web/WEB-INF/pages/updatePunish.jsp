<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/19 0019
  Time: 13:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改惩罚页面</title>
</head>
<body>
<jsp:include page="manage.jsp"></jsp:include>
<hr>
<form action="update_punish_staff">
    <input type="hidden" name="id" value="${requestScope.punish.id}">
    <table border="1" cellspacing="0" align="center">
        <tr>
            <td colspan="5" align="center">修改惩罚</td>
        </tr>
        <tr>
            <td>编号</td>
            <td>惩罚人员</td>
            <td>惩罚理由</td>
            <td>惩罚时间</td>
            <td>惩罚金额</td>
        </tr>
        <tr>
            <td>${requestScope.punish.id}</td>
            <td>${requestScope.punish.sName}</td>
            <td><input name="name" type="text" value="${requestScope.punish.name}"></td>
            <td><f:formatDate value="${requestScope.punish.dateTime}" pattern="yyyy-MM-dd"></f:formatDate></td>
            <td><input type="number" name="forfeit" value="${requestScope.punish.forfeit}"></td>
        </tr>
        <tr>
            <td colspan="5" align="center"><button>确定修改</button></td>
        </tr>
    </table>
</form>
</body>
</html>
