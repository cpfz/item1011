<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/16 0016
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>员工管理</title>
    <script src="/js/jquery-1.10.2.min.js"></script>
    <script>
        $(function () {
            $("select").change(function () {
                var staffType=$("select").val()
                if (staffType=="在职员工"){
                    $("#ta1").show()
                }else {
                    $("#ta1").hide()
                }
            })

        })
    </script>
</head>
<body>
    <jsp:include page="manage.jsp"></jsp:include>
    <hr>

    <select name="staffType">
        <option>在职员工</option>
        <option>离职员工</option>
    </select>

    <table border="1" cellspacing="0" cellpadding="10" id="ta1">
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td colspan="4">操作</td>
        </tr>
        <c:forEach items="${requestScope.staff}" var="staff">
            <tr>
                <td>${staff.id}</td>
                <td><a>${staff.name}</a></td>
                <td><a>人事变动</a></td>
                <td><a>考勤</a></td>
                <td><a>工资发放</a></td>
                <td><a>开除</a></td>
            </tr>
        </c:forEach>
    </table>


</body>
</html>
