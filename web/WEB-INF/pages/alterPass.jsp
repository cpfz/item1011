<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/13 0013
  Time: 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改密码</title>
    <style>
        body{
            background: url("/img/c.jpg");
        }
    </style>
    <script src="/js/jquery-1.10.2.min.js"></script>
    <script>
        $(function () {
            var falg=true
            var falg1=true
            $("#in1").blur(function () {
                var pass=$(this).val()
                if(pass!=${sessionScope.user.password}){
                    falg=false
                    $("#sp1").text("原密码不匹配")
                    $("#but1").attr('disabled',true);
                }else {
                    falg=true
                    $("#sp1").text("")
                    if(falg==true&&falg1==true){
                        $("#but1").attr('disabled',false);
                    }else{
                        $("#but1").attr('disabled',true);
                    }
                }
            })
            $("#in2").blur(function () {
                var pass1=$("#in3").val()
                var pass2=$("#in2").val()
                if(pass1!=pass2){
                    falg1=false
                    $("#sp2").text("两次密码不一样")
                    $("#but1").attr('disabled',true);
                }else {
                    falg1=true
                    $("#sp2").text("")
                    if(falg==true&&falg1==true){
                        $("#but1").attr('disabled',false);
                    }else{
                        $("#but1").attr('disabled',true);
                    }
                }
            })

        })
    </script>
</head>
<body>
    <p style="color: red">当前用户：${sessionScope.user.name}</p>
    <form action="update_password">
        <input type="hidden" name="id" value="${sessionScope.user.id}">
        <table style="background: lightblue">
            <tr>
                <td colspan="3">修改密码</td>
            </tr>
            <tr>
                <td>原密码：</td>
                <td><input type="text" id="in1"></td>
                <td><span style="color: red" id="sp1"></span></td>
            </tr>
            <tr>
                <td>新密码：</td>
                <td><input type="text" id="in3"></td>
            </tr>
            <ty>
                <td>密码确定：</td>
                <td><input type="text" name="password" id="in2"></td>
                <td><span style="color: red" id="sp2"></span></td>
            </ty>
            <tr>
                <td><button type="submit" id="but1">确定修改</button></td>
                <td><button onclick="window.open('query_recruit')">返回</button></td>
            </tr>
        </table>
    </form>
</body>
</html>
