<%--
  Created by IntelliJ IDEA.
  User: zhanghao
  Date: 2018/8/15
  Time: 上午1:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员</title>
    <script src="./layui/layui.js"></script>
    <script type="text/javascript" src="./js/jquery-1.8.3.js" ></script>
    <!--validate.js是建立在jquery之上的，所以得先导入jquery的类库-->
    <script type="text/javascript" src="./js/jquery.validate.min.js" ></script>
    <!--引入国际化js文件-->
    <script type="text/javascript" src="./js/messages_zh.js" ></script>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="./layui/css/layui.css">
</head>
<body>

<form action="adminAjax.html" class="layui-form" method="post"> <!-- 提示：如果你不想用form，你可以换成div等任何一个普通元素 -->
    <div class="layui-form-item">
        <label class="layui-form-label">输入框</label>
        <div class="layui-input-block">
            <input type="text" name="" placeholder="请输入" autocomplete="off" class="layui-input">
        </div>
    </div>

</form>

</body>
</html>
