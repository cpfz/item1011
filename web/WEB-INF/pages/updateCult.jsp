<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/17 0017
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改培训信息</title>
</head>
<body>
<jsp:include page="manage.jsp"></jsp:include>
<hr>

    <form action="alter_cult">
        <input type="hidden" name="id" value="${requestScope.cult.id}">
    <table style="background: lightblue" border="1" cellspacing="0">
        <tr>
            <td align="center" colspan="4">修改培训信息</td>
        </tr>
        <tr>
            <td>培训名称</td>
            <td>培训时间</td>
            <td>培训部门</td>
            <td>操作</td>
        </tr>
        <tr>
            <td><input type="text" name="name" value="${requestScope.cult.name}"></td>
            <td><input type="date" name="time" value='<f:formatDate value="${requestScope.cult.dateTime }" pattern="yyyy-MM-dd" />'></td>
            <td>
                <select name="departmentName">
                    <c:forEach items="${requestScope.department}" var="dept">
                        <option <c:if test="${dept.name==requestScope.cult.departmentName}">selected</c:if>>${dept.name}</option>
                    </c:forEach>
                </select>
            </td>
            <td>
                <button type="submit">确定修改</button>
                <button onclick="window.open('cultivate_admin')">返回</button>
            </td>
        </tr>
    </table>
    </form>

</body>
</html>
