<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/15 0015
  Time: 13:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>部门管理页面</title>
    <script src="/js/jquery-1.10.2.min.js"></script>
    <script>
        $(function () {
            $(".a1").click(function () {
                var $td=$(this).parent().parent().children().children()
                var name=$td[0].innerHTML
                var falg=confirm("你确定要删除"+name+"这个部门吗？")
                if (!falg){
                    return false
                }
            })
            <c:if test="${requestScope.str!=null}">
                alert("${requestScope.str}")
            </c:if>
        })
    </script>

    <style>
        body{
            background: url("/img/c.jpg");
        }
    </style>
</head>
<body>
<p style="color: red">当前用户：${sessionScope.user.name}</p>
    <table>
        <tr>
            <td>部门</td>
            <td colspan="2">操作</td>
        </tr>
        <c:forEach items="${requestScope.dept}" var="dept">
            <tr>
                <td><a href="query_post?dId=${dept.id}">${dept.name}</a></td>
                <td><a href="delete_dept?dId=${dept.id}" class="a1">删除</a></td>
                <td><a href="update_dept?dId=${dept.id}">修改</a></td>
            </tr>
        </c:forEach>

    </table>
    <a href="save_dept">增加</a>
    <button onclick="window.open('manage1')">返回上一页</button>
</body>
</html>
