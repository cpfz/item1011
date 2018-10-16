<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/14 0014
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <script src="/js/jquery-1.10.2.min.js">
    </script>
    <script>
        $(function () {
            <c:if test="${!empty requestScope.list}">
            alert("你有${requestScope.list.size()}份面试通知，请在反馈里查看")
            </c:if>
        })
    </script>
    <title>游客界面</title>
    <style>
        body{
            background: url("/img/c.jpg");
        }
    </style>
</head>
<body>
<p style="color: red">当前用户：${sessionScope.user.name}</p>
<button onclick="window.open('query_recruit')">查看招聘信息</button>
<button onclick="window.open('feed_back')">反馈</button>
<button onclick="window.open('see_resume')">查看简历</button>
<button onclick="window.open('update_pass')">修改密码</button>
<button onclick="window.open('login.jsp')">退出</button>
</body>
</html>
