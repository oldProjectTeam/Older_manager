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

<title>体检信息</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1" />
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
	href="${APP_PATH}/static/oldfront/css/logincss.css" />
<link rel="stylesheet"
	href="${APP_PATH}/static/oldfront/css/peinfoview.css" />	
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300'
	rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Lobster'
	rel='stylesheet' type='text/css' />
</head>
<body>
	<!--头部导航  -->
    <jsp:include page="head.jsp"></jsp:include>
	<div class="below-slideshow">
		<div class="container">
			<div class="row">
				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
					<div class="txt-block">
						<h1 class="head-line">体检基本信息</h1>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- BELOW SLIDESHOW SECTION END-->
	<div class="neirong">
		<!--左侧导航栏  -->
		<jsp:include page="left.jsp"></jsp:include>
		<div class="right1" style="background-image: url(${APP_PATH}/static/oldfront/img/right1.png)">
			<!--基本信息部分 -->
			<jsp:include page="olderInfo.jsp"></jsp:include>
			<hr />
			<h3>&nbsp; &nbsp; 欢迎您查看体检基本信息：</h3>
			<hr />
			<div class="ziliao">
				<div class="ziliao1">
					<p style="color: #000000;">
						<span>用户名：</span>罗先生
					</p>
					<p style="color: #000000;">
						<span>id：</span>女
					</p>
					<p style="color: #000000;">
						<span>体检医院：</span>45岁
					</p>
				</div>
				<hr />
				<div class="ziliao2">
					<p style="color: #000000;">
						<span>体检时间：</span>罗先生
					</p>
					<p style="color: #000000;">
						<span>下次体检时间：</span>女
					</p>
					<p style="color: #000000;">
						<span>备注：</span>45岁
					</p>
				</div>
				<div class="ziliao2">
					<p style="color: #000000;">
						<span>报告图片：</span>
					</p>
					<div class="text1">
						<img src="${APP_PATH}/static/oldfront/assets/img/par.jpg" />
						<img src="${APP_PATH}/static/oldfront/assets/img/par.jpg" />
						<img src="${APP_PATH}/static/oldfront/assets/img/par.jpg" />
						<hr />
					</div>
				</div>
			</div>
		</div>
		<div class="clear"></div>
	</div>
	<hr />
	<br />
	<jsp:include page="../footer.jsp"></jsp:include>
	 <!-- WE PUT SCRIPTS AT THE END TO LOAD PAGE FASTER-->
<!--CORE SCRIPTS PLUGIN-->
    <script src="${APP_PATH}/static/oldfront/assets/js/jquery-1.11.1.min.js"></script>
     <!--BOOTSTRAP SCRIPTS PLUGIN-->
<script src="${APP_PATH}/static/oldfront/assets/js/bootstrap.js"></script>
     <!--WOW SCRIPTS PLUGIN-->
    <script src="${APP_PATH}/static/oldfront/assets/js/wow.js"></script>
     <!--FLEXSLIDER SCRIPTS PLUGIN-->
    <script src="${APP_PATH}/static/oldfront/assets/js/jquery.flexslider.js"></script>
     <!--CUSTOM SCRIPTS -->
    <script src="${APP_PATH}/static/oldfront/assets/js/custom.js"></script>
</body>
</html>
