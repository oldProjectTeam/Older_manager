<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	pageContext.setAttribute("APP_PATH", request.getContextPath());
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'left.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
</head>

<body>
	<aside class="menu">
	<ul>
		<li class="person active"><a href="${APP_PATH}/address/index">个人中心</a></li>
		<li class="person">个人资料
			<ul>
				<li><a href="${APP_PATH}/safety/skipinformation1">个人信息</a></li>
				<li><a href="${APP_PATH}/safety/skipsafety">安全设置</a></li>
				<li><a
					href="${APP_PATH}/address/selectallshoppingaddress/${users.id}">收货地址</a></li>
			</ul>
		</li>
		<li class="person"><a>我的交易</a>
			<ul>
				<li><a href="${APP_PATH}/shop/order">订单管理</a></li>
				<li><a href="${APP_PATH}/shop/change">退款售后</a></li>
			</ul></li>
		<li class="person"><a>我的资产</a>
			<ul>
				<li><a href="coupon.html">优惠券 </a></li>
				<li><a href="bonus.html">红包</a></li>
				<li><a href="bill.html">账单明细</a></li>
			</ul></li>

		<li class="person"><a>我的小窝</a>
			<ul>
				<li><a href="${APP_PATH}/shop/collection">收藏</a></li>
				<li><a href="${APP_PATH}/shop/foot">足迹</a></li>
				<li><a href="${APP_PATH}/shop/comment">评价</a></li>
			</ul></li>
	</ul>
	</aside>
</body>
</html>
