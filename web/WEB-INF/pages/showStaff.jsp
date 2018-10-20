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
            $("#ta2").hide()
            $("#bu1").click(function () {
                $("#ta2").hide()
                $("#ta1").show()
            })
            $("#bu2").click(function () {
                $("#ta1").hide()
                $("#ta2").show()
            })

            $("#bu3").click(function () {
                alert("操作成功，可在赏惩管理里查看")
            })
            $("#bu4").click(function () {
                alert("操作成功，可在赏惩管理里查看")
            })
        })

    </script>
    <style>

        body{
            background: url("/img/c.jpg");
        }
    </style>
</head>
<body>
<jsp:include page="manage.jsp"></jsp:include>
<hr>

    <table border="1" cellspacing="0" cellpadding="10" style="background: lightblue" align="center">
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
                <button id="bu2">罚</button>
            </td>
        </tr>
    </table>
    <form action="reward_staff">
        <input type="hidden" name="sName" value="${requestScope.staff.name}">
        <table cellspacing="0" cellpadding="10" id="ta1" style="background: lightblue" align="center">
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
                <td><input type="date" name="dateTime1"></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><button type="submit" id="bu3">确定</button></td>
            </tr>
        </table>
    </form>
    <form action="punish_staff">
        <input type="hidden" name="sName" value="${requestScope.staff.name}">
        <table cellspacing="0" cellpadding="10" id="ta2" style="background: lightblue" align="center">
            <tr>
                <td>罚</td>
            </tr>
            <tr>
                <td>惩罚理由：</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>罚金：</td>
                <td>
                    <select name="forfeit">
                        <option>100</option>
                        <option>200</option>
                        <option>300</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>时间：</td>
                <td><input type="date" name="dateTime1"></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><button type="submit" id="bu4">确定</button></td>
            </tr>
        </table>
    </form>

</body>
</html>
