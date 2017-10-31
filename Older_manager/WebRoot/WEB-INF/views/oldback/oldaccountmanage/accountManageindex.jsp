<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'accountManageindex.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!-- 引入jquery -->
<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery-1.7.2.min.js"></script>
<!-- 引入样式 -->

<link
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>


</head>

<body style="margin: 15px;">
	<!--导航  -->
	<div>
		<div class="row">
			<div class="col-md-12">
				<ol class="breadcrumb">
					<li><b>位置：老人账户管理</b></li>
				</ol>
			</div>
		</div>
	</div>
	<!--菜单列表  -->
	<div class="row">
		<div class="col-md-3">
			<div class="list-group">
				<a href="oldmanaccount/queryAllAccount" class="list-group-item text-center"><img
					src="../images/accountmanage.png" alt="..." class="img-rounded">
					<br> <br>老人账户列表 </a>
			</div>
		</div>
		<div class="col-md-3">
			<div class="list-group">
				<a href="giftmanagement/queryAllGift" class="list-group-item text-center"><img
					src="../images/gift.png" alt="..." class="img-rounded"> <br>
					<br>老人礼品管理 </a>
			</div>
		</div>
		<div class="col-md-3">
			<div class="list-group">
				<a href="giftexchange.jsp" class="list-group-item text-center"><img
					src="../images/exchange.png" alt="..." class="img-rounded"> <br>
					<br>礼品兑换记录 </a>
			</div>
		</div>
		<div class="col-md-3">
			<div class="list-group">
				<a href="integral/integralexchane.action" class="list-group-item text-center"><img
					src="../images/integral.png" alt="..." class="img-rounded"> <br>
					<br>积分变动记录 </a>
			</div>
		</div>
	</div>
</body>
</html>
