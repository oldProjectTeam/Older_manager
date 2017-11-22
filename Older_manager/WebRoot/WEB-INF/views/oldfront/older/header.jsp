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

<title>My JSP 'header.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="${APP_PATH}/static/oldfront/assets/css/bootstrap.css"
	rel="stylesheet" />
<link href="${APP_PATH}/static/oldfront/assets/css/font-awesome.css"
	rel="stylesheet" />
<link href="${APP_PATH}/static/oldfront/assets/css/animate.css"
	rel="stylesheet" />
<link href="${APP_PATH}/static/oldfront/assets/css/flexslider.css"
	rel="stylesheet" />
<link href="${APP_PATH}/static/oldfront/assets/css/style.css"
	rel="stylesheet" />
<link rel="stylesheet"
	href="${APP_PATH}/static/oldfront/assets/css/zhuye.css" />
<script language="JavaScript"
	src="${APP_PATH}/static/js/jquery-3.2.1.min.js"></script>
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300'
	rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Lobster'
	rel='stylesheet' type='text/css' />
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>
</head>

<body>
	<section class="menu-section">
	<div class="container">
		<div class="row ">
			<div class="col-md-12">
				<div class="navbar-collapse collapse">
					<ul id="menu-top"
						class="nav navbar-nav navbar-fixed-top navbar-inverse">
						<li
							style="padding-left: 15px;padding-top: 6px;padding-bottom: 6px;"><img
							src="${APP_PATH}/static/images/oldback/images/logo.png"
							width="200px" style="margin-right: 240px;" /></li>
						<li><a href="${APP_PATH}/older/index"
							class="menu-top-active check">主页</a></li>
						<li><a href="${APP_PATH}/older/" class="check">课程专区</a></li>
						<li><a href="${APP_PATH}/older/" class="check">视频专区</a></li>
						<li><a href="${APP_PATH}/older/activity" class="check">社区活动</a></li>
						<li><a href="${APP_PATH}/shop/oldfronthome" class="check">电子商务</a></li>
						<li>
							<!-- 用户头像 --> <img src="${APP_PATH}/static/images/old.png"
							height="30" width="30"
							style="margin-left: 240px;margin-top: 20px;display: none;"
							class="img-circle"> <a href="${APP_PATH}/older/login"
							style="margin-left: 240px;">登录</a>
						</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	</section>
</body>
</html>
