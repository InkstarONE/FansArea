<%--
  Created by IntelliJ IDEA.
  User: zhanghao
  Date: 2018/6/29
  Time: 下午3:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%=request.getContextPath()%>
<form class="layui-form" action="<%=request.getContextPath()%>/CookieTest.do" method="post" id = "checkFormtel">
    <div class="layui-form-item">
        <label class="layui-form-label">name</label>
        <div class="layui-input-inline">
            <input type="text" name="name" required lay-verify="required" placeholder="请输入密" autocomplete="off" class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="formDemo">立即修改</button>
        </div>
    </div>
</form>
</body>
</html>
