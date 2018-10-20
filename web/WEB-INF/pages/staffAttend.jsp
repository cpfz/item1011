<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/20 0020
  Time: 13:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员查看员工考勤</title>
    <script src="/js/jquery-1.10.2.min.js"></script>
    <script>
        $(function () {
            $("#button1").click(function () {
                $(".tr1").remove()
                var year=$("#s1").val()
                var month=$("#s2").val()
                $.ajax({
                    url:"see_attend",
                    data:{"year":year,"month":month},
                    dataType:"JSON",
                    type:"post",
                    success:function (data) {
                        if(data==""){
                            var tr="<tr class='tr1'><td>没有记录</td></tr>";
                            $("table").append(tr);
                        }else {
                            for (var i=0;i<data.length;i++){
                                var date = new Date(data[i].officeTime);
                                var date1=new Date(data[i].closingTime);
                                var y = date.getFullYear();
                                var M=date.getMonth()+1;
                                var d= date.getDate();
                                var H=date.getHours();
                                var m=date.getMinutes();
                                var s=date.getSeconds();

                                var y1=date1.getFullYear()
                                var M1=date1.getMonth()
                                var d1=date1.getDay()
                                var H1=date1.getHours()
                                var m1=date1.getMinutes()
                                var s1=date1.getSeconds()
                                if (data[i].closingTime!=null){
                                    var a="<tr class='tr1'><td>"+data[i].id+"</td><td>"+data[i].sName+"</td><td>"+
                                        y+"-"+M+"-"+d+" "+H+":"+m+":"+s+"</td><td>"+y1+"-"+M1+"-"+d1+" "+H1+":"+m1+":"+s1+"</td></tr>"
                                }else {
                                    var a="<tr class='tr1'><td>"+data[i].id+"</td><td>"+data[i].sName+"</td><td>"+
                                        y+"-"+M+"-"+d+" "+H+":"+m+":"+s+"</td><td>"+""+"</td></tr>"
                                }

                                $("table").append(a)
                            }
                        }
                    }
                })
            })


        })
    </script>
</head>
<body>
    <jsp:include page="manage.jsp"></jsp:include>
    <hr>
    <div align="center">
        <table border="1" cellspacing="0">
            <tr>
                <td colspan="4">
                    <select id="s1">
                        <option>2017</option>
                        <option>2018</option>
                        <option>2019</option>
                    </select>
                    <select id="s2">
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                        <option>5</option>
                        <option>6</option>
                        <option>7</option>
                        <option>8</option>
                        <option>9</option>
                        <option>10</option>
                        <option>11</option>
                        <option>12</option>
                    </select>
                    <button id="button1">确定</button>&nbsp;&nbsp;
                    该月已工作${requestScope.attendance.size()}天
                </td>
            </tr>
            <tr>
                <td>序号</td>
                <td>姓名</td>
                <td>上班时间</td>
                <td>下班时间</td>
            </tr>
            <c:if test="${!empty requestScope.attend}">
                <c:forEach items="${requestScope.attend}" var="attend">
                    <tr class="tr1">
                        <td>${attend.id}</td>
                        <td>${attend.sName}</td>
                        <td><f:formatDate value="${attend.officeTime}" pattern="yyyy-MM-dd HH:mm:ss"></f:formatDate></td>
                        <td><f:formatDate value="${attend.closingTime}" pattern="yyyy-MM-dd HH:mm:ss"></f:formatDate></td>
                    </tr>
                </c:forEach>
            </c:if>
        </table>
    </div>
</body>
</html>
