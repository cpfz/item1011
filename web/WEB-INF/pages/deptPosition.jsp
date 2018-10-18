<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/18 0018
  Time: 13:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工查看部门岗位</title>
    <script src="/js/jquery-1.10.2.min.js"></script>
    <script>
        $(function () {
            $("#t2").hide()
            $(".b1").click(function () {
                $("#tr1").empty()
                $("#t2").show()
                var name=$(this).val()
                $.ajax({
                    url:"queryPosition",
                    dataType:"JSON",
                    type:"post",
                    data:{"name":name},
                    success:function (data) {
                        for (var i = 0; i < data.length; i++) {
                            var post=data[i].name
                            $("#tr1").append("<td>"+post+"</td>");
                        }
                    }
                })
            })
        })
    </script>
</head>
<body>
<jsp:include page="staff.jsp"></jsp:include>
<hr>
    <table style="display:inline" id="t1">
        <tr>
            <td align="center">部门</td>
        </tr>
        <c:forEach items="${requestScope.dept}" var="dept">
            <tr>
                <td><button class="b1" value="${dept.name}">${dept.name}</button></td>
            </tr>
        </c:forEach>
    </table>
    <table style="display:inline" id="t2">
        <tr>
           <td align="center">岗位</td>
        </tr>
        <tr id="tr1">

        </tr>
    </table>
</body>
</html>
