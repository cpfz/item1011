<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/18 0018
  Time: 9:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工查看自己的信息</title>
</head>
<body>
    <jsp:include page="staff.jsp"></jsp:include>
    <hr>
    <form action="staff_update">
        <input type="hidden" name="id" value="${requestScope.staff.id}">
        <table style="background: lightgray" align="center" border="1" cellspacing="0">
            <tr>
                <td colspan="4" align="center">个人信息</td>
            </tr>
            <tr>
                <td>姓名：</td>
                <td><input type="text" name="name" value="${requestScope.staff.name}"></td>
                <td>性别</td>
                <td>${requestScope.staff.sex}</td>
            </tr>
            <tr>
                <td>年龄：</td>
                <td><input type="text" name="age" value="${requestScope.staff.age}"></td>
                <td>学历</td>
                <td><input type="text" name="academic" value="${requestScope.staff.academic}"></td>
            </tr>
            <tr>
                <td>联系方式：</td>
                <td><input type="text" name="tal" value="${requestScope.staff.tal}"></td>
                <td>email：</td>
                <td><input type="text" name="email" value="${requestScope.staff.email}"></td>
            </tr>
            <tr>
                <td>部门岗位：</td>
                <td>${requestScope.staff.departmentName}&nbsp;${requestScope.staff.positionName}</td>
                <td>入职时间：</td>
                <td><f:formatDate value="${requestScope.staff.dateTime}" pattern="yyyy-MM-dd HH:mm:ss"></f:formatDate></td>
            </tr>
            <tr>
                <td colspan="4" align="center"><button type="submit">确定</button></td>
            </tr>
        </table>
    </form>

</body>
</html>
