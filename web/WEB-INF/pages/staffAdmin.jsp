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
            $("#ta1").show()
            $("#ta2").hide()
            $("select").change(function () {
                var staffType=$("select").val()
                if (staffType=="在职员工"){
                    $("#ta1").show()
                    $("#ta2").hide()
                }else {
                    $("#ta1").hide()
                    $("#ta2").show()
                }
            })
            $(".a4").click(function () {
                var $td=$(this).parent().parent().children().children()
                var name=$td[0].innerHTML
                var flag=confirm("你确定要开除"+name+"这名员工吗？")
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
                <td><a href="show_staff?id=${staff.id}">${staff.name}</a></td>
                <td><a href="update_staff?id=${staff.id}" id="a2">人事变动</a></td>
                <td><a href="staff_attend?id=${staff.id}">考勤</a></td>
                <td><a>工资发放</a></td>
                <td><a href="delete_staff?id=${staff.id}" class="a4">开除</a></td>
            </tr>
        </c:forEach>
    </table>
    <table border="1" cellspacing="0" cellpadding="10" id="ta2">
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>联系电话</td>
            <td>邮箱</td>
        </tr>
        <c:if test="${!empty requestScope.leave}">
            <c:forEach items="${requestScope.leave}" var="leave">
                <tr>
                    <td>${leave.id}</td>
                    <td>${leave.name}</td>
                    <td>${leave.tal}</td>
                    <td>${leave.email}</td>
                </tr>
            </c:forEach>
        </c:if>
        <c:if test="${empty requestScope.leave}">
            <tr>
                <td colspan="4">暂时没有离职员工</td>
            </tr>
        </c:if>
    </table>

</body>
</html>
