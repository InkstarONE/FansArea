<%@ page import="beans.StudentList" %><%--
  Created by IntelliJ IDEA.
  User: zhanghao
  Date: 2018/4/24
  Time: 下午11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除学生</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="./layui/css/layui.css">
    <script type="text/javascript" src="./js/jquery-1.8.3.js" ></script>
    <!--validate.js是建立在jquery之上的，所以得先导入jquery的类库-->
    <script type="text/javascript" src="./js/jquery.validate.min.js" ></script>
    <!--引入国际化js文件-->
    <script type="text/javascript" src="./js/messages_zh.js" ></script>
    <script src="./layui/layui.js"></script>
</head>
<body>
<blockquote class="layui-elem-quote">学籍管理系统</blockquote>
<%
    String id = request.getParameter("id");
    for (int i = 0; i < StudentList.stuList.size(); i++) {
        if (id.equals(StudentList.stuList.get(i).getId())){
        StudentList.stuList.remove(i);
        }
    }
%>
<hr>删除成功</hr>
<a href="showStudent.jsp">删除成功点击并返回</a>

</body>
</html>
