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

<title>My JSP 'bindphone.jsp' starting page</title>

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
<link href="${APP_PATH}/static/css/stepstyle.css" rel="stylesheet"
	type="text/css">

<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery-1.7.2.min.js"></script>
<script src="${APP_PATH}/static/js/amazeui.js"></script>

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

				<div class="am-cf am-padding">
					<div class="am-fl am-cf">
						<strong class="am-text-danger am-text-lg">绑定手机</strong> / <small>Bind&nbsp;Phone</small>
					</div>
				</div>
				<hr />
				<!--进度条-->
				<div class="m-progress">
					<div class="m-progress-list">
						<span class="step-1 step"> <em class="u-progress-stage-bg"></em>
							<i class="u-stage-icon-inner">1<em class="bg"></em></i>
							<p class="stage-name">绑定手机</p>
						</span> <span class="step-2 step"> <em class="u-progress-stage-bg"></em>
							<i class="u-stage-icon-inner">2<em class="bg"></em></i>
							<p class="stage-name">完成</p>
						</span> <span class="u-progress-placeholder"></span>
					</div>
					<div class="u-progress-bar total-steps-2">
						<div class="u-progress-bar-inner"></div>
					</div>
				</div>
				<form class="am-form am-form-horizontal">
					<div class="am-form-group bind">
						<label for="user-phone" class="am-form-label">验证手机</label>
						<div class="am-form-content">
							<span id="user-phone">186XXXX0531</span>
						</div>
					</div>
					<div class="am-form-group code">
						<label for="user-code" class="am-form-label">验证码</label>
						<div class="am-form-content">
							<input type="tel" id="user-code" placeholder="短信验证码">
						</div>
						<a class="btn" href="javascript:void(0);"
							onclick="sendMobileCode();" id="sendMobileCode">
							<div class="am-btn am-btn-danger">验证码</div>
						</a>
					</div>
					<div class="am-form-group">
						<label for="user-new-phone" class="am-form-label">验证手机</label>
						<div class="am-form-content">
							<input type="tel" id="user-new-phone" placeholder="绑定新手机号">
						</div>
					</div>
					<div class="am-form-group code">
						<label for="user-new-code" class="am-form-label">验证码</label>
						<div class="am-form-content">
							<input type="tel" id="user-new-code" placeholder="短信验证码">
						</div>
						<a class="btn" href="javascript:void(0);"
							onclick="sendMobileCode();" id="sendMobileCode">
							<div class="am-btn am-btn-danger">验证码</div>
						</a>
					</div>
					<div class="info-btn">
						<div class="am-btn am-btn-danger">保存修改</div>
					</div>
				</form>
			</div>
			<!--底部-->
			<jsp:include page="footer.jsp"></jsp:include>
		</div>
		<jsp:include page="left.jsp"></jsp:include>
	</div>
</body>
</html>