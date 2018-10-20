<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/19 0019
  Time: 13:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改奖赏页面</title>
</head>
<body>
    <jsp:include page="manage.jsp"></jsp:include>
    <hr>
    <form action="update_reward_staff">
        <input type="hidden" name="id" value="${requestScope.reward.id}">
        <table border="1" cellspacing="0" align="center">
            <tr>
                <td colspan="5" align="center">修改奖赏</td>
            </tr>
            <tr>
                <td>编号</td>
                <td>奖赏人员</td>
                <td>奖赏理由</td>
                <td>奖赏时间</td>
                <td>奖赏金额</td>
            </tr>
            <tr>
                <td>${requestScope.reward.id}</td>
                <td>${requestScope.reward.sName}</td>
                <td><input name="name" type="text" value="${requestScope.reward.name}"></td>
                <td><f:formatDate value="${requestScope.reward.dateTime}" pattern="yyyy-MM-dd"></f:formatDate></td>
                <td><input type="number" name="bonus" value="${requestScope.reward.bonus}"></td>
            </tr>
            <tr>
                <td colspan="5" align="center"><button>确定修改</button></td>
            </tr>
        </table>
    </form>
</body>
</html>
