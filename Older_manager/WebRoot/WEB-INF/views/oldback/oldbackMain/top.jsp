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

<title>无标题文档</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="${APP_PATH}/static/css/oldbackstyle.css" rel="stylesheet"
	type="text/css" />
<script language="JavaScript" src="${APP_PATH}/static/js/jquery.js"></script>
<script type="text/javascript">
	$(function() {
		//顶部导航切换
		$(".nav li a").click(function() {
			$(".nav li a.selected").removeClass("selected")
			$(this).addClass("selected");
		});
	});
</script>
</head>
<body
	style="background:url(${APP_PATH}/static/images/oldback/images/topbg.gif) repeat-x;">
	<div class="topleft" style="margin-top:-10px">
		<a href="main.jsp" target="_parent"><img
			src="${APP_PATH}/static/images/oldback/images/logo.jpg" width="200px"
			height="80px" title="系统首页" /></a>
	</div>
	<div class="topright">
		<ul>
			<li><span><img
					src="${APP_PATH}/static/images/oldback/images/help.png" title="帮助"
					class="helpimg" /></span><a href="#">帮助</a></li>
			<li><a href="#">关于</a></li>
			<li><a href="login.jsp" target="_parent">退出</a></li>
		</ul>

		<div class="user">
			<span>admin</span> <i>消息</i> <b>5</b>
		</div>
	</div>
</body>
</html>
