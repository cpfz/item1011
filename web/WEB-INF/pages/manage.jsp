<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/12 0012
  Time: 20:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>管理员界面</title>
    <script src="/js/jquery-1.10.2.min.js"></script>
    <script>
        $(function () {
            <c:if test="${!empty requestScope.employ}">
                alert("你有${requestScope.employ.size()}份未查看的应聘信息，详情请在应聘管理里查看")
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
<button onclick="window.open()">应聘管理</button>
<button>部门管理</button>
<button>培训管理</button>
<button>员工管理</button>
<button>奖惩管理</button>
<button>薪资管理</button>
<button>工资异议</button>
<button>退出</button>
</body>
</html>
