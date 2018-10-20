<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/15 0015
  Time: 13:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>员工页面</title>
    <script src="/js/jquery-1.10.2.min.js"></script>

    <script>
        $(function () {
            <c:if test="${!empty requestScope.cultivate}">
                alert("你有${requestScope.cultivate.size()}份培训通知，请在培训通知里查看")
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
<p style="color: red">当前用户：${sessionScope.user.name}</p>
<button onclick="window.open('personal_staff')">个人信息</button>
<button onclick="window.open('cult_inform')">培训通知</button>
<button onclick="window.open('my_attendance')">我的考勤</button>
<button onclick="window.open('password_update')">修改密码</button>
<button onclick="window.open('my_reward_punish')">我的奖惩</button>
<button onclick="window.open('dept_position')">部门职位</button>
<button>我的薪资</button>
<button onclick="window.open('login.jsp')">退出</button>
<div style="float:right;">
    <button onclick="window.open('clock_in')">上班打卡</button>
    <button onclick="window.open('clock_out')">下班打卡</button>
</div>

</body>
</html>
