<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/17 0017
  Time: 13:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>员工人事变动</title>
    <script src="/js/jquery-1.10.2.min.js"></script>
    <script>
        $(function () {
            $("#s1").change(function () {
                $("#s2").empty()
                var name=$(this).val()
                $.ajax({
                    url:"queryPosition",
                    data:{"name":name},
                    dataType:"JSON",
                    type:"post",
                    success:function (data) {
                        for (var i = 0; i < data.length; i++) {
                            $("#s2").append("<option>" + data[i].name + "</option>");
                        }
                    }
                })
            })
        })
    </script>
</head>
<body>
<jsp:include page="manage.jsp"></jsp:include>
<hr>
<form action="update_sta">
    <input type="hidden" name="id" value="${requestScope.employee.id}">
    <table>
        <tr>
            <td>员工${requestScope.employee.name}的人事变动</td>
        </tr>
        <tr>
            <td>原部门岗位：</td>
            <td>${requestScope.employee.departmentName}&nbsp;${requestScope.employee.positionName}</td>
        </tr>
        <tr>
            <td>请选择调动的部门岗位</td>
            <td>
                <select name="departmentName" id="s1">
                    <option>--请选择--</option>
                    <c:forEach items="${requestScope.depart}" var="dept">
                        <option>${dept.name}</option>
                    </c:forEach>
                </select>
                <select name="positionName" id="s2">
                    <option>--请选择--</option>
                </select>
                <button type="submit">确定修改</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
