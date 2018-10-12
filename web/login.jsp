<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/11 0011
  Time: 19:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>人力资源-注册界面</title>
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css">
    <script src="js/jquery-1.10.2.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
    <style>
        body {
            background:url(/img/c.jpg);
        }
        .mycenter{
            margin-top: 100px;
            margin-left: 200px;
            padding: 5%;
        }
    </style>
    <script>
        $(function () {
            $("#ip1").blur(function () {
                var name=$(this).val()
                $.ajax({
                    url: "verify_name",
                    data: {"name": name},
                    dataType: "TEXT",
                    type: "post",
                    success: function (data) {
                        if (data == 1) {
                            $("#s1").text("")
                            $("#bu1").attr('disabled', false);
                        } else {
                            $("#s1").text("没有该用户")
                            $("#bu1").attr('disabled', true);
                        }
                    }
                })
            })
        })
    </script>
</head>
<body>
<form action="${pageContext.request.contextPath}/login_User" method="post">
    <div class="mycenter">
        <table>
            <tr>
                <td colspan="2">
                    <h2>登录</h2>
                </td>
            </tr>
            <tr>
                <td>
                    用户名：
                </td>
                <td>
                    <div class="form-group">
                        <input type="text" class="form-control" id="ip1" name="name" style="width: 300px">
                    </div>
                </td>
                <td><span id="s1" style="color: red"></span></td>
            </tr>
            <tr>
                <td>
                    密码：
                </td>
                <td>
                    <div class="form-group">
                        <input type="password" class="form-control" id="ip2" name="password" style="width: 300px">
                    </div>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <c:if test="${!empty requestScope.str}">
                        <p style="color: red">${requestScope.str}</p>
                    </c:if>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <button type="submit" class="btn btn-default" id="bu1" style="background: rgb(255,165,0)">登录</button>
                    <button onclick="window.open('regist')" class="btn btn-default" id="bu2" style="background: rgb(255,165,0)">注册</button>
                </td>
            </tr>
        </table>
    </div>
</form>
</body>
</html>
