<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/20 0020
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改招聘信息</title>
</head>
<body>
<jsp:include page="manage.jsp"></jsp:include>
<hr>
<form action="update">
    <input type="hidden" name="id" value="${requestScope.recruit.id}">
    <table border="1" cellspacing="0" style="background: lightblue">
        <tr>
            <td colspan="6">添加招聘</td>
        </tr>
        <tr>
            <td>招聘部门</td>
            <td>招聘岗位</td>
            <td>职责</td>
            <td>薪资</td>
            <td>地址</td>
            <td>操作</td>
        </tr>
        <tr>
            <td><input type="text" name="dept" value="${requestScope.recruit.dept}"></td>
            <td><input type="text" name="post" value="${requestScope.recruit.post}"></td>
            <td><input type="text" name="function" value="${requestScope.recruit.function}"></td>
            <td>
                <select name="price">
                    <option>4000-6000</option>
                    <option>6000-7000</option>
                    <option>7000-8000</option>
                    <option>8000-10000</option>
                    <option>10000以上</option>
                </select>
            </td>
            <td><input type="text" name="site" value="${requestScope.recruit.site}"></td>
            <td><button>确定</button></td>
        </tr>
    </table>
</form>
</body>
</html>
