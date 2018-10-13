<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/12 0012
  Time: 12:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
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

            $("#s3").change(function () {
                $("#s4").empty()
                var name=$(this).val()
                $.ajax({
                    url:"queryPosition",
                    data:{"name":name},
                    dataType:"JSON",
                    type:"post",
                    success:function (data) {
                        for (var i = 0; i < data.length; i++) {
                            var id=data[i].id
                            $("#s4").append("<option>" + data[i].name + "</option>");

                        }
                    }
                })
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
<p style="color: red">当前用户：${sessionScope.user.name}</p>
    <c:if test="${!empty requestScope.resume}">

        <form action="update_resume" method="post">
            <input type="hidden" name="userId" value="${sessionScope.user.id}">
            <table>
                <tr>
                    <td colspan="4" align="center">简历</td>
                </tr>
                <tr>
                    <td>真实姓名：</td>
                    <td><input name="name" value="${requestScope.resume.name}"></td>
                    <td>性别</td>
                    <td><input name="sex" value="${requestScope.resume.sex}"></td>
                </tr>
                <tr>
                    <td>年龄：</td>
                    <td><input name="age" value="${requestScope.resume.age}"></td>
                    <td>学历：</td>
                    <td>
                        <select name="academic">
                            <option>大专</option>
                            <option>本科</option>
                            <option>硕士</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>联系方式：</td>
                    <td><input name="tal" value="${requestScope.resume.tal}"></td>
                    <td>email:</td>
                    <td><input name="email" value="${requestScope.resume.email}"></td>
                </tr>
                <tr>
                    <td>应聘岗位：</td>
                    <td>
                        <select name="departmentName" id="s1">
                            <c:forEach items="${requestScope.dept}" var="dept">
                                <option>${dept.name}</option>
                            </c:forEach>
                        </select>
                        <select name="positionName" id="s2">

                        </select>
                    </td>
                    <td>政治面貌：</td>
                    <td>
                        <select name="status">
                            <option>群众</option>
                            <option>团员</option>
                            <option>党员</option>
                        </select>
                    </td>
                </tr>

                <tr>
                    <td>上份工作</td>
                    <td><input name="oldJob" value="${requestScope.resume.oldJob}"></td>
                    <td>工作经验：</td>
                    <td>
                        <input name="experience" value="${requestScope.resume.experience}">
                    </td>
                </tr>
                <tr>
                    <td>期望薪资：</td>
                    <td>
                        <select name="salary">
                            <option>3000-5000</option>
                            <option>5000-7000</option>
                            <option>7000-9000</option>
                            <option>9000-10000</option>
                            <option>10000以上</option>
                        </select>
                    </td>
                    <td>兴趣爱好：</td>
                    <td><input name="hobby" value="${requestScope.resume.hobby}"></td>
                </tr>
                <tr>
                    <td colspan="2"><button type="submit">保存</button></td>
                    <td colspan="2"><button onclick="window.open('query_recruit')">取消</button></td>
                </tr>
            </table>
        </form>
    </c:if>
<c:if test="${empty requestScope.resume}">

    <form action="save_resume" method="post">
        <input type="hidden" name="userId" value="${sessionScope.user.id}">
        <table>
            <tr>
                <td colspan="4" align="center">简历</td>
            </tr>
            <tr>
                <td>真实姓名：</td>
                <td><input name="name" placeholder="请输入真实姓名"></td>
                <td>性别</td>
                <td><input name="sex" placeholder="请输入"></td>
            </tr>
            <tr>
                <td>年龄：</td>
                <td><input name="age" } placeholder="请输入"></td>
                <td>学历：</td>
                <td>
                    <select name="academic">
                        <option>大专</option>
                        <option>本科</option>
                        <option>硕士</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>联系方式：</td>
                <td><input name="tal" placeholder="请输入电话"></td>
                <td>email:</td>
                <td><input name="email" placeholder="请输入邮箱"></td>
            </tr>
            <tr>
                <td>应聘岗位：</td>
                <td>
                    <select name="departmentName" id="s3">
                        <c:forEach items="${requestScope.dept}" var="dept">
                            <option>${dept.name}</option>
                        </c:forEach>
                    </select>
                    <select name="positionName" id="s4">

                    </select>
                </td>
                <td>政治面貌：</td>
                <td>
                    <select name="status">
                        <option>群众</option>
                        <option>团员</option>
                        <option>党员</option>
                    </select>
                </td>
            </tr>

            <tr>
                <td>上份工作</td>
                <td><input name="oldJob" placeholder="请输入上一份工作的公司"></td>
                <td>工作经验：</td>
                <td>
                    <input name="experience" placeholder="请输入工作经验">
                </td>
            </tr>
            <tr>
                <td>期望薪资：</td>
                <td>
                    <select name="salary">
                        <option>3000-5000</option>
                        <option>5000-7000</option>
                        <option>7000-9000</option>
                        <option>9000-10000</option>
                        <option>10000以上</option>
                    </select>
                </td>
                <td>兴趣爱好：</td>
                <td><input name="hobby" placeholder="请输入你的爱好"></td>
            </tr>
            <tr>
                <td colspan="2"><button type="submit">保存</button></td>
                <td colspan="2"><button onclick="window.open('query_recruit')">取消</button></td>
            </tr>
        </table>
    </form>
</c:if>
</body>
</html>
