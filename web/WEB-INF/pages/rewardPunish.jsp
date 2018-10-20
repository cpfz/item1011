<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/19 0019
  Time: 9:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>奖惩管理页面</title>
    <script src="/js/jquery-1.10.2.min.js"></script>
    <script>
        $(function () {
            $("#t2").hide()
            $(".tr1").hide()
            $("select").change(function () {
                var d=$("select").val()
                if(d=="奖赏"){
                    $("#t2").hide()
                    $("#t1").show()
                } else {
                    $("#t1").hide()
                    $("#t2").show()
                }
            })

            $(".a1").click(function () {
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
<select>
    <option>奖赏</option>
    <option>惩罚</option>
</select>
    <table border="1" cellspacing="0" id="t1" style="background: lightblue">
        <tr>
            <td colspan="6" align="center">奖赏</td>
        </tr>
        <tr>
            <td>编号</td>
            <td>奖赏人员</td>
            <td>奖赏理由</td>
            <td>奖赏时间</td>
            <td>奖赏金额</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${requestScope.reward}" var="reward">
            <tr>
                <td>${reward.id}</td>
                <td>${reward.sName}</td>
                <td>${reward.name}</td>
                <td><f:formatDate value="${reward.dateTime}" pattern="yyyy-MM-dd"></f:formatDate></td>
                <td>${reward.bonus}</td>
                <td>
                    <a href="delete_reward?id=${reward.id}" class="a1">删除</a>
                    <a href="update_reward?id=${reward.id}" id="a2">修改</a>
                </td>
            </tr>

        </c:forEach>
    </table>
    <table border="1" cellspacing="0" id="t2" style="background: lightblue">
        <tr>
            <td colspan="6" align="center">惩罚</td>
        </tr>
        <tr>
            <td>编号</td>
            <td>惩罚人员</td>
            <td>惩罚理由</td>
            <td>惩罚时间</td>
            <td>惩罚金额</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${requestScope.punish}" var="punish">
            <tr>
                <td>${punish.id}</td>
                <td>${punish.sName}</td>
                <td>${punish.name}</td>
                <td><f:formatDate value="${punish.dateTime}" pattern="yyyy-MM-dd"></f:formatDate></td>
                <td>${punish.forfeit}</td>
                <td>
                    <a href="delete_punish?id=${punish.id}" class="a1">删除</a>
                    <a href="update_punish?id=${punish.id}" id="a3">修改</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
