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
<style>
#uioo {
	background-color: #269ABC;
	color: white;
	box-shadow: rgba(0, 0, 0, 0.117647) 0px 2px 6px, rgba(0, 0, 0, 0.239216)
		0px 1px 2px;
	height: 50px;
	width: 150px;
	text-align: center;
	border-radius: 5px;
	line-height: 50px
}

#op {
	height: 300px;
	width: 500px;
	background-color: #C4E3F3;
	margin-top: 50px;
	margin-left: auto;
	margin-right: auto;
	box-shadow: rgba(0, 0, 0, 0.117647) 0px 2px 6px, rgba(0, 0, 0, 0.239216)
		0px 1px 2px;
}

#rh {
	margin-left: 180px;
	position: absolute;
	margin-top: 100px;
}

#rh a:active,a:link,a:visited,a:hover {
	color: white;
}
</style>
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
						<li><a href="${APP_PATH}/older/contact">联系我们</a></li>
						<li><a href="${APP_PATH}/older/activity">社区活动</a></li>
						<li><a href="${APP_PATH}/older/download"
							class="menu-top-active">客户端下载</a></li>
						<li><a href="${APP_PATH}/older/">会员登陆</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	</section>
	<div class="container">
		<div id="op">
			<div id="rh">
				<p id="uioo">
					<a href="download/logo.png" download="kehuduan.com"></a>点击下载客户端
				</p>
			</div>
		</div>
	</div>
	<div class="just-sec">
		<div class="container">
			<div class="row">
				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12"
					style="min-height:500px;">
					<div class="alert alert-info">
						This is an blank page which you can customize easily and for more
						free templates keep looking<a href="http://www.cssmoban.com/"
							target="_blank"> binarytheme.com</a>.
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="parallax-like">
		<div class="overlay">
			<div class="container">
				<div class="row">
					<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
						<div class="just-txt-div">
							<strong> 300+</strong>
							<p>Clients</p>
						</div>
					</div>
					<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
						<div class="just-txt-div">
							<strong> 100+</strong>
							<p>Offices</p>
						</div>
					</div>
					<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
						<div class="just-txt-div">
							<strong> 50000+</strong>
							<p>Employees</p>
						</div>
					</div>
					<div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
						<div class="just-txt-div">
							<strong> 500+</strong>
							<p>Projects</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="container ">
		<div class="row ">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
				<h1 class="head-line">Our Clients</h1>
				<br />
			</div>
		</div>
		<div class="row ">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
				<hr />
				<div class="flexslider carousel">
					<ul class="slides">
						<li><img
							src="${APP_PATH}/static/oldfront/assets/img/client.jpg" /></li>
						<li><img
							src="${APP_PATH}/static/oldfront/assets/img/client.jpg" /></li>
						<li><img
							src="${APP_PATH}/static/oldfront/assets/img/client.jpg" /></li>
						<li><img
							src="${APP_PATH}/static/oldfront/assets/img/client.jpg" /></li>
						<li><img
							src="${APP_PATH}/static/oldfront/assets/img/client.jpg" /></li>
						<li><img
							src="${APP_PATH}/static/oldfront/assets/img/client.jpg" /></li>
						<li><img
							src="${APP_PATH}/static/oldfront/assets/img/client.jpg" /></li>
						<li><img
							src="${APP_PATH}/static/oldfront/assets/img/client.jpg" /></li>
						<li><img
							src="${APP_PATH}/static/oldfront/assets/img/client.jpg" /></li>
						<li><img
							src="${APP_PATH}/static/oldfront/assets/img/client.jpg" /></li>
						<li><img
							src="${APP_PATH}/static/oldfront/assets/img/client.jpg" /></li>
						<li><img
							src="${APP_PATH}/static/oldfront/assets/img/client.jpg" /></li>
						<li><img
							src="${APP_PATH}/static/oldfront/assets/img/client.jpg" /></li>
						<li><img
							src="${APP_PATH}/static/oldfront/assets/img/client.jpg" /></li>
						<li><img
							src="${APP_PATH}/static/oldfront/assets/img/client.jpg" /></li>
						<li><img
							src="${APP_PATH}/static/oldfront/assets/img/client.jpg" /></li>
						<li><img
							src="${APP_PATH}/static/oldfront/assets/img/client.jpg" /></li>
						<li><img
							src="${APP_PATH}/static/oldfront/assets/img/client.jpg" /></li>
						<li><img
							src="${APP_PATH}/static/oldfront/assets/img/client.jpg" /></li>
						<li><img
							src="${APP_PATH}/static/oldfront/assets/img/client.jpg" /></li>
					</ul>
				</div>
				<hr />
				<br />
			</div>
		</div>
	</div>
	<div class="container ">
		<div class="row">
			<div
				class="col-lg-10 col-md-10 col-sm-10 col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-12 set-div">
				<div class="just-txt-div text-center">
					<h3>
						<strong>-- Lorem ipsum dolor sit --</strong>
					</h3>
					<p>
						Lorem Lorem ipsum dolor sit amet <strong> Lorem ipsum
							dolor sit ametLorem </strong> ipsum dolor sit ametLorem ipsum dolor sit
						ametLorem ipsum dolor <br /> <br />
					</p>
					<a class="btn btn-info btn-lg" href="#">Read More Here</a>
					&nbsp;&nbsp; <a class="btn btn-success btn-lg" href="#">Download
						Now </a>
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
