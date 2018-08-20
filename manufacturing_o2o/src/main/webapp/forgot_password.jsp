<%--
  Created by IntelliJ IDEA.
  User: zhanghao
  Date: 2017/12/4
  Time: 下午7:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>忘记密码</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="./layui/css/layui.css">
    <script src="./layui/layui.js"></script>
</head>
<body>


<ul class="layui-nav" lay-filter="">
    <li class="layui-nav-item"><a href="purchase_InformationOrderMsg.jsp">采购信息</a></li>
    <li class="layui-nav-item layui-this"><a href="supply_InformationOrderMsg.jsp">供应信息</a></li>

    <li class="layui-nav-item">
        <a href="javascript:;">发布订单</a>
        <dl class="layui-nav-child">
            <dd><a href="release_purchaseOrder.jsp">要采购</a></dd>
            <dd><a href="release_supplyOrder.jsp">发供应</a></dd>
        </dl>
    </li>


    <li class="layui-nav-item">
        <a href="javascript:;">推荐好文</a>
        <dl class="layui-nav-child"> <!-- 二级菜单 -->
            <dd><a href="https://mp.weixin.qq.com/s/jyjJSho3wKw1_8TOWiF_8g">毛主席的八大成就</a></dd>
            <dd><a href="https://mp.weixin.qq.com/s/OxCu_8-bUw1eP_KHcwPIfw">国防巨星</a></dd>
            <dd><a href="https://mp.weixin.qq.com/s/bG5imwpKz9ng804Mqq0Duw">互联网大会</a></dd>
        </dl>
    </li>
    <li class="layui-nav-item"><a href=""></a></li>
    <li class="layui-nav-item"><a href=""></a></li>
    <li class="layui-nav-item"><a href=""></a></li>
    <li class="layui-nav-item"><a href=""></a></li>
    <li class="layui-nav-item"><a href=""></a></li>
    <li class="layui-nav-item"><a href=""></a></li>
    <li class="layui-nav-item"><a href=""></a></li>
    <li class="layui-nav-item"><a href=""></a></li>
    <li class="layui-nav-item"><a href=""></a></li>

    <li class="layui-nav-item"><a href="search.jsp">搜索🔍</a></li>
    <li class="layui-nav-item"><a href="my_details.jsp">我的个人主页</a></li>

    <i class="layui-icon" style="font-size: 20px";>&#xe612;</i>
    <li class="layui-nav-item"><a href="login_register.jsp">登入</a></li>
    <li class="layui-nav-item"><a href="login_register.jsp">注册</a></li>
    <li class="layui-nav-item"><a href="esc.jsp">退出</a></li>
</ul>


<div class="layui-progress layui-progress-big">
    <div class="layui-progress-bar" lay-percent="100%"></div>
    <span>忘记密码</span>
    <div class="layui-progress-bar" lay-percent="100%"></div>
</div>
<form class="layui-form" action="" method="post">
    <div class="layui-form-item layui-col-md5"><!--调大小-->
        <label class="layui-form-label">账号</label>
        <div class="layui-input-block" >
            <input type="text" name="username" required  lay-verify="required" placeholder="请输入账号"
                   autocomplete="off" class="layui-input" >
        </div>

    </div>
    <div class="layui-form-item" >
        <label class="layui-form-label">手机号</label>
        <div class="layui-input-inline">
            <input type="password" name="password" required lay-verify="required" placeholder="请输入手机号" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="formDemo">提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>
</div>

</body>
</html>
