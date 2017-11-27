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

<title>我的地址</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css"
	href="${APP_PATH}/static/css/amazeui.css" />
<link href="${APP_PATH}/static/css/admin.css" rel="stylesheet"
	type="text/css">
<link href="${APP_PATH}/static/css/demo.css" rel="stylesheet"
	type="text/css" />

<link href="${APP_PATH}/static/css/sustyle.css" rel="stylesheet"
	type="text/css" />
<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery-3.2.1.min.js"></script>

</head>

<body>
	<jsp:include page="shopheader.jsp"></jsp:include>
	<div class="take-delivery">
		<div class="status">
			<h2>您已成功付款</h2>
			<div class="successInfo">
				<ul>
					<li>付款金额<em>¥${order.cost}</em></li>
					<div class="user-info">
						<p>收货人：${order.shippingaddress.name}</p>
						<p>联系电话：${order.shippingaddress.phone}</p>
						<p>收货地址：${order.shippingaddress.location}
							${order.shippingaddress.detailaddress}</p>
					</div>
					请认真核对您的收货信息，如有错误请联系客服
				</ul>
				<div class="option">
					<span class="info">您可以</span> <a href="../person/order.html"
						class="J_MakePoint">查看<span>已买到的宝贝</span></a> <a
						href="../person/orderinfo.html" class="J_MakePoint">查看<span>交易详情</span></a>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="../person/footer.jsp"></jsp:include>
</body>
</html>
