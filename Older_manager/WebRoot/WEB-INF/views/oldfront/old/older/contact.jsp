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
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>智慧老人系统</title>
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
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300'
	rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Lobster'
	rel='stylesheet' type='text/css' />
</head>
<body>
	<section class="menu-section">
	<div class="container">
		<div class="row ">
			<div class="col-md-12">
				<div class="navbar-collapse collapse">
					<ul id="menu-top"
						class="nav navbar-nav navbar-right navbar-fixed-top navbar-inverse">
						<li
							style="padding-left: 15px;padding-top: 6px;padding-bottom: 6px;"><img
							src="${APP_PATH}/static/images/oldback/images/logo.png"
							width="200px" style="margin-right: 240px;" /></li>
						<li><a href="${APP_PATH}/older/index">主页</a></li>
						<li><a href="${APP_PATH}/older/about">关于我们</a></li>
						<li><a href="${APP_PATH}/older/contact"
							class="menu-top-active">联系我们</a></li>
						<li><a href="${APP_PATH}/older/activity">社区活动</a></li>
						<li><a href="${APP_PATH}/older/download">客户端下载</a></li>
						<li><a href="${APP_PATH}/older/">会员登陆</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	</section>
	<div class="container">
		<div class="row">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
				<h1 class="tag-home">
					孝和集团目标成为最符合社会需要的养老综合服务运营商，所以我们欢迎您的意见或者建议。</h1>
				<hr />
			</div>
		</div>
	</div>
	<div class="just-sec">
		<div class="container">
			<div class="row">
				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
					<div class="just-txt-div">
						<h2>联系地址:</h2>
						<p>贵州省贵阳市</p>
						<p>
							<strong> 电话: </strong> +09-890-789-00-900
						</p>
						<p>
							<strong> 邮箱: </strong> info@yourdomain.com
						</p>
						<p>孝和集团目标成为最符合社会需要的养老综合服务运营商，</p>
						<p>所以我们欢迎您的意见或者建议。.</p>
					</div>
				</div>
				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
					<div class="just-txt-div">
						<div class="form-group">
							<label>输入您的邮箱</label> <input class="form-control" type="text" />
						</div>
						<div class="form-group">
							<label>你的意见标题 </label> <input class="form-control" type="text" />
						</div>
						<div class="form-group">
							<label>您的意见或者建议</label>
							<textarea class="form-control" rows="5"></textarea>
						</div>
						<button type="submit" class="btn btn-success btn-lg">点击提交
						</button>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
	<script
		src="${APP_PATH}/static/oldfront/assets/js/jquery-1.11.1.min.js"></script>
	<script src="${APP_PATH}/static/oldfront/assets/js/bootstrap.js"></script>
	<script src="${APP_PATH}/static/oldfront/assets/js/wow.js"></script>
	<script
		src="${APP_PATH}/static/oldfront/assets/js/jquery.flexslider.js"></script>
	<script src="${APP_PATH}/static/oldfront/assets/js/custom.js"></script>
</body>
</html>
