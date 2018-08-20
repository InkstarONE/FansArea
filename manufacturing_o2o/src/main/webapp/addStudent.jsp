<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="jdbc.C3P0Utils" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="beans.Student" %>
<%@ page import="java.util.LinkedList" %>
<%@ page import="java.lang.String" %>
<%@ page import="beans.StudentList" %><%--
  Created by IntelliJ IDEA.
  User: zhanghao
  Date: 2018/4/24
  Time: 下午9:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page  language="java" import="java.lang.String" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ page import="sun.nio.cs.ext.GBK" %>
<html>
<head>
    <title>添加学生</title>
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
    request.setCharacterEncoding("UTF-8");
    String id = request.getParameter("id");
    String name = request.getParameter("name");
    String age = request.getParameter("age");
    String sex = request.getParameter("sex");
    String score = request.getParameter("score");
    String rank = request.getParameter("rank");
    String context = new String(id.getBytes("iso-8859-1"),"UTF-8");
    Student s = new Student(id,name,age,sex,score,rank);
   // StudentList studentList = new StudentList();
   StudentList.stuList.add(s);

%>
<hr>添加成功</hr>
<a href="showStudent.jsp">添加成功点击并返回</a>
</body>
</html>
