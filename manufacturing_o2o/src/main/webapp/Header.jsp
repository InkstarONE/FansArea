<%--
  Created by IntelliJ IDEA.
  User: zhanghao
  Date: 2018/7/1
  Time: 下午7:26
  To change this template use File | Settings | File Templates.
--%>
<%@page pageEncoding="UTF-8"%>
<meta charset="utf-8">
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

