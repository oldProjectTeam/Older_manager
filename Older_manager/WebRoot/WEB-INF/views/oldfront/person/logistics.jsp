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

<title>购物商城-我的物流</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="${APP_PATH}/static/css/admin.css" rel="stylesheet"
	type="text/css">
<link href="${APP_PATH}/static/css/amazeui.css" rel="stylesheet"
	type="text/css">
<link href="${APP_PATH}/static/css/personal.css" rel="stylesheet"
	type="text/css">
<link href="${APP_PATH}/static/css/lostyle.css" rel="stylesheet"
	type="text/css">
<link href="${APP_PATH}/static/css/KDNWidget.css" rel="stylesheet"
	type="text/css" />
<script type="text/javascript" src="${APP_PATH}/static/js/KDNWidget.js"></script>
<script src="${APP_PATH}/lib/layer/2.4/layer.js"></script>
<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery-1.7.2.min.js"></script>
</head>
<body>
	<jsp:include page="../home/shopheader.jsp"></jsp:include>
	<div class="nav-table">
		<div class="long-title">
			<span class="all-goods">全部分类</span>
		</div>
		<div class="nav-cont">
			<ul>
				<li class="index"><a href="${APP_PATH}/shop/oldfronthome">首页</a></li>
			</ul>
		</div>
	</div>
	<b class="line"></b>
	<div class="center">
		<div class="col-main">
			<div class="main-wrap">
				<div class="user-logistics">
					<!--标题 -->
					<div class="am-cf am-padding">
						<div class="am-fl am-cf">
							<strong class="am-text-danger am-text-lg">物流跟踪</strong> / <small>Logistics&nbsp;History</small>
						</div>
					</div>
					<hr />
					<div class="package-title">
						<div class="m-item">
							<div class="item-pic">
								<img
									src="http://gyadmin-1252357563.file.myqcloud.com/images/logistic.png"
									class="itempic J_ItemImg" style="margin-right: 25px;">
							</div>
							<div class="item-info">
								<p class="log-status">
									物流状态:<span>${orders.state=='待评价'?'已签收':'运输中'}</span>
								</p>
								<p>承运公司:${orders.formulaway}</p>
								<p>快递单号:${orders.orders4}</p>
							</div>
						</div>
						<div class="clear"></div>
					</div>
					<div id="logistics"></div>
				</div>
			</div>
			<!--底部-->
			<jsp:include page="footer.jsp"></jsp:include>
		</div>
		<jsp:include page="left.jsp"></jsp:include>
	</div>

	<script type="text/javascript">
		$(function() {
			updateNum();
		});
		window.onload = function() {
			KDNWidget.run({
				serviceType : "B",//服务类型：此功能的服务类型值为"B"
				expCode : "${orders.orders3}",//快递公司编号,例如:申通（编号：ZTO）
				expNo : "${orders.orders4}",//快递公司运单号453173031799
				showType : "normal",//呈现方式：normal-直接把结果显示在您定义的容器中，pop-将结果显示在您定义的容器中并以弹窗的形式呈现。
				container : "logistics"//您自定义的容器ID（一般是定义一个div,注意值不要加#）
			});
		};
	</script>
</body>
</html>