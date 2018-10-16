<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/13 0013
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>简历展示</title>
    <script src="/js/jquery-1.10.2.min.js"></script>
    <script>
    </script>
</head>
<body>
<jsp:include page="manage.jsp"></jsp:include>
<hr>
    <form action="send_Interview">
        <input type="hidden" name="id" value="${requestScope.employId}">
        <table>
            <tr>
                <td colspan="4" align="center">${requestScope.re.name}的简历</td>
            </tr>
            <tr>
                <td>真实姓名：</td>
                <td>${requestScope.re.name}</td>
                <td>性别</td>
                <td>${requestScope.re.sex}</td>
            </tr>
            <tr>
                <td>年龄：</td>
                <td>${requestScope.re.age}</td>
                <td>学历：</td>
                <td>
                    ${requestScope.re.academic}
                </td>
            </tr>
            <tr>
                <td>联系方式：</td>
                <td>${requestScope.re.tal}</td>
                <td>email:</td>
                <td>${requestScope.re.email}</td>
            </tr>
            <tr>
                <td>应聘岗位：</td>
                <td>
                    ${requestScope.re.departmentName}&nbsp;&nbsp;
                    ${requestScope.re.positionName}
                </td>
                <td>政治面貌：</td>
                <td>
                    ${requestScope.re.status}
                </td>
            </tr>

            <tr>
                <td>上份工作</td>
                <td>${requestScope.re.oldJob}</td>
                <td>工作经验：</td>
                <td>
                    ${requestScope.re.experience}
                </td>
            </tr>
            <tr>
                <td>期望薪资：</td>
                <td>
                    ${requestScope.re.salary}
                </td>
                <td>兴趣爱好：</td>
                <td>${requestScope.re.hobby}</td>
            </tr>
            <tr>
                <td>面试时间：</td>
                <td><input type="date" name="interviewTime"></td>
            </tr>
            <tr>
                <td colspan="2"><button>发送面试通知</button></td>
                <td colspan="2"><button onclick="window.open('to_employ')">返回</button></td>
            </tr>
        </table>
    </form>
</body>
</html>
