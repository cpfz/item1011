<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/17 0017
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员查看员工信息</title>
    <script src="/js/jquery-1.10.2.min.js"></script>
    <script>
        $(function () {
            $("#ta1").hide()
            $("#bu1").click(function () {
                $("#ta1").show()
            })
        })

    </script>
    <style>
        .mycenter{

            margin-top: 100px;
            margin-left: 200px;
            padding: 5%;
        }
        body{
            background: url("/img/c.jpg");
        }
    </style>
</head>
<body>
<jsp:include page="manage.jsp"></jsp:include>
<hr>
<div class="mycenter">
    <table border="1" cellspacing="0" cellpadding="10" style="background: lightblue">
        <tr>
            <td colspan="4" align="center">员工信息</td>
        </tr>
        <tr>
            <td>姓名</td>
            <td>${requestScope.staff.name}</td>
            <td>性别</td>
            <td>${requestScope.staff.sex}</td>
        </tr>
        <tr>
            <td>年龄</td>
            <td>${requestScope.staff.age}</td>
            <td>学历</td>
            <td>${requestScope.staff.academic}</td>
        </tr>
        <tr>
            <td>联系方式</td>
            <td>${requestScope.staff.tal}</td>
            <td>邮箱</td>
            <td>${requestScope.staff.email}</td>
        </tr>
        <tr>
            <td>入职时间</td>
            <td>${requestScope.staff.dateTime}</td>
            <td>职位</td>
            <td>${requestScope.staff.departmentName}&nbsp;${requestScope.staff.positionName}</td>
        </tr>
        <tr>
            <td colspan="4" align="center">
                <button id="bu1">赏</button>
                <button onclick="window.open('staff_admin')">返回</button>
            </td>
        </tr>
    </table>
    <form>
        <input type="hidden" name="sId" value="${requestScope.staff.id}">
        <table cellspacing="0" cellpadding="10" id="ta1" style="background: lightblue">
            <tr>
                <td>赏</td>
            </tr>
            <tr>
                <td>奖励理由：</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>奖金：</td>
                <td>
                    <select name="bonus">
                        <option>100</option>
                        <option>200</option>
                        <option>300</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>时间：</td>
                <td><input type="date" name="dateTime"></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><button type="submit">确定</button></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
