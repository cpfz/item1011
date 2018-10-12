<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/27 0027
  Time: 13:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>人力资源-注册界面</title>
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css">
    <script src="../../js/jquery-1.10.2.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
    <style>
      body {
        background:url(/img/c.jpg);
      }
      .mycenter{
        margin-top: 100px;
        margin-left: 200px;
        padding: 5%;
      }
    </style>
    <script>
        $(function () {
            var falg=true
            var falg1=true
            $("#ip1").blur(function () {
                var name=$(this).val()
                $.ajax({
                    url:"verify_name",
                    data:{"name":name},
                    dataType:"TEXT",
                    type:"post",
                    success:function (data) {
                        if(data==1){
                            $("#s1").text("用户名已存在")
                            $("#bu1").attr('disabled',true);
                            falg=false
                        }else{
                            falg=true
                            $("#s1").text("")
                            if(falg==true&&falg1==true){
                                $("#bu1").attr('disabled',false);
                            }else{
                                $("#bu1").attr('disabled',true);
                            }
                        }
                    }
                })

            })
            $("#ip3").blur(function () {
                var pass1=$("#ip2").val()
                var pass2=$(this).val()
                if(pass1!=pass2){
                    $("#s2").text("两次密码不一样")
                    $("#bu1").attr('disabled',true);
                    falg1=false
                }else if(pass1==pass2){
                    falg1=true
                    $("#s2").text("")
                    $("#bu1").attr('disabled',false);
                    if(falg==true&&falg1==true){
                        $("#bu1").attr('disabled',false);
                    }else{
                        $("#bu1").attr('disabled',true);
                    }
                }
            })
        })
    </script>
  </head>
  <body>

  <form action="${pageContext.request.contextPath}/add" method="post">
      <input type="hidden" name="genre" value="2">
    <div class="mycenter">
        <table>
            <tr>
                <td colspan="3">
                    <h2>注册</h2>
                </td>
            </tr>
            <tr>
                <td>
                    用户名：
                </td>
                <td>
                    <div class="form-group">
                        <input type="text" class="form-control" id="ip1" name="name" style="width: 300px">
                    </div>
                </td>
                <td><span id="s1" style="color: red"></span></td>
            </tr>
            <tr>
                <td>
                    密码：
                </td>
                <td colspan="2">
                    <div class="form-group">
                        <input type="password" class="form-control" id="ip2" name="password" style="width: 300px">
                    </div>
                </td>
            </tr>

            <tr>
                <td>
                    确定密码：
                </td>
                <td>
                    <div class="form-group">
                        <input type="password" class="form-control" id="ip3" name="password1" style="width: 300px">
                    </div>
                </td>
                <td><span id="s2" style="color: red"></span></td>
            </tr>

            <tr>
                <td colspan="3">
                    <button type="submit" class="btn btn-default" id="bu1" style="background: rgb(255,165,0)">注册</button>
                </td>
            </tr>
        </table>
    </div>
  </form>

  </body>
</html>
