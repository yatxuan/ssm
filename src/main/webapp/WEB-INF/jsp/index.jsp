<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2018/9/11
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table class="tableA"></table>
</body>

<script src="${ctx}/static/js/jquery-1.8.2.min.js"></script>
<script>

    function sel() {
        $.post("${ctx}/person/getPersonList", function (data) {
            var bool = data.bool;
            var html = "<tr>" +
                "<td>id</td>" +
                "<td>名称</td>" +
                "<td>性别</td>" +
                "<td>图片地址</td>" +
                "<td>职位</td>" +
                "<td>操作</td>" +
                "</tr>";
            if (bool == true) {
                var result = data.object;
                for (var i = 0; i < result.length; i++) {
                    html += "<tr>" +
                        "<td>" + result[i].id + "</td>" +
                        "<td>" + result[i].name + "</td>" +
                        "<td>" + result[i].sex + "</td>" +
                        "<td>" + result[i].headurl + "</td>" +
                        "<td>" + result[i].profession + "</td>" +
                        "<td>" +
                        "<a href='${ctx}/person/insert'>新增</a>" +
                        "<a href=''>删除</a>" +
                        "</td>" +
                        "</tr>";
                }
            } else {
                var describe = data.describe;
                html += "<tr><td colspan='5'>没有查到数据,具体原因:" + describe + "</td></tr>"
            }

            $(".tableA").html(html);
        })
    }
</script>
</html>
