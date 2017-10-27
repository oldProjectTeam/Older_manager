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

<title>欢迎登录...</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!-- 引入jquery -->
<script type="text/javascript" src="${APP_PATH}/static/js/jquery.js"></script>
<!-- 引入样式 -->
<link href="${APP_PATH}/static/css/login_style.css" rel="stylesheet">
<script src="${APP_PATH}/static/js/public.js"></script>
<script src="${APP_PATH}/static/js/customScrollbar.min.js"></script>
<script src="${APP_PATH}/static/js/login.js"></script>
</head>

<body class="login-page">
	<section class="login-contain"> <header>
	<h1>老人后台管理系统</h1>
	<p>management system</p>
	</header>
	<div class="form-content">
		<ul>
			<li>
				<div class="form-group">
					<label class="control-label">管理员账号：</label> <input type="text"
						placeholder="管理员账号..." class="form-control form-underlined"
						id="adminName" />
				</div>
			</li>
			<li>
				<div class="form-group">
					<label class="control-label">管理员密码：</label> <input type="password"
						placeholder="管理员密码..." class="form-control form-underlined"
						id="adminPwd" />
				</div>
			</li>
			<li>
				<button class="btn btn-lg btn-block" id="entry">立即登录</button>
			</li>
			<li>
				<p class="btm-info">
					©Copyright<a href="#" target="_blank" title="孝和集团"
						style="font-size: 16px;">&nbsp;&nbsp;孝和集团</a>
				</p>
				<address class="btm-info" style="font-size: 12px;">贵州省贵阳市</address>
			</li>
		</ul>
	</div>
	</section>
</body>
</html>
