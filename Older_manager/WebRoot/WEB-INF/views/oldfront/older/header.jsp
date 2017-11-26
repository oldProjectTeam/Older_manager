<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	pageContext.setAttribute("APP_PATH", request.getContextPath());
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>官网头部</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
 
<link href="${APP_PATH}/static/oldfront/css/style.css"
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
	<section class="menu-section" style="border-bottom:solid 2px blue;">
	<div class="container">
		<div class="row ">
			<div class="col-md-12">
				<div class="navbar-collapse collapse">
					<ul id="menu-top"
						class="nav navbar-nav navbar-fixed-top navbar-inverse">
						<li
							style="padding-left: 15px;padding-top: 6px;padding-bottom: 6px;"><img
							src="${APP_PATH}/static/images/oldback/images/logo.png"
							width="200px" style="margin-right:150px;" /></li>
						<li><a href="${APP_PATH}/older/index"
							class="menu-top-active check">首页</a></li>
						<li><a href="${APP_PATH}/course/course_list" class="check">课程专区</a></li>
						<li><a href="${APP_PATH}/older/video_list" class="check">视频专区</a></li>
						<li><a href="${APP_PATH}/older/activity" class="check">社区活动</a></li>
						<li><a href="${APP_PATH}/older/about" class="check">关于我们</a></li>
						<li><a href="email:18037093@qq.com" class="check">联系我们</a></li>
						<li><a href="${APP_PATH}/shop/oldfronthome" class="check">购物商城</a></li>
						<li>
						<!-- 没有登录-->
						 <c:if test="${empty older}">
						 	<a href="${APP_PATH}/older/login" style="margin-left:300px;">登录</a>
						 </c:if>
						 <!--已登录  -->
						 <c:if test="${!empty older}">
						 	<dropdown>
							  <input id="toggle2" type="checkbox">
							  <label for="toggle2" class="animate">
							  <img src="${APP_PATH}/static/images/old.png" 
								style="height:30px;width:30px" class="img-circle">
							  <i class="fa fa-bars float-right" style="margin-top:10px"></i>
							  </label>
							  <ul class="animate">
							    <li class="animate" onClick="go_center()">管理中心<i class="fa fa-cog float-right"></i></li>
							    <li class="animate" onClick="exit()">推出系统<i class="fa fa-arrows-alt float-right"></i></li>
							     
							  </ul>
						 </dropdown>
						 </c:if>
						</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	</section>
	
	<script type="text/javascript">
		//去管理中心
		function go_center(){
			window.location.href="${APP_PATH}/older/older";
		}
		//推出系统
		function exit(){
			window.location.href="${APP_PATH}/oldmanaccount/loginOut";
		}
	</script>
</body>
</html>
