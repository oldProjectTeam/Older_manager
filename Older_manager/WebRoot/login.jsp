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

<title>欢迎登录...</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link href="${APP_PATH}/static/h-ui/css/H-ui.min.css" rel="stylesheet"
	type="text/css" />
<link href="${APP_PATH}/static/h-ui.admin/css/H-ui.login.css"
	rel="stylesheet" type="text/css" />
<link href="${APP_PATH}/static/h-ui.admin/css/style.css"
	rel="stylesheet" type="text/css" />
<link href="${APP_PATH}/lib/Hui-iconfont/1.0.8/iconfont.css"
	rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${APP_PATH}/static/js/jquery.js"></script>
<script type="text/javascript"
	src="${APP_PATH}/static/h-ui/js/H-ui.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>
</head>
<body>
	<div class="header"></div>
	<div class="loginWraper">
		<div class="loginBox">
			<span><font color="red" id="msg" size="3"
				style="margin-left: 300px;">${message}</font></span>
			<form class="form form-horizontal" action="SysUserLogin"
				id="loginForm" method="post">
				<div class="row cl">
					<label class="form-label col-xs-3"><img
						src="static/images/user.png" width="40" height="40"></label>
					<div class="formControls col-xs-8">
						<input name="usercode" id="username" type="text" placeholder="账户"
							class="input-text size-L">
					</div>
				</div>
				<div class="row cl">
					<label class="form-label col-xs-3"><img
						src="static/images/pwd.png" width="40" height="40"></label>
					<div class="formControls col-xs-8">
						<input name="password" id="password" type="password"
							placeholder="密码" class="input-text size-L">
					</div>
				</div>
				<div class="row cl">
					<label class="form-label col-xs-3"><img
						src="static/images/code.png" width="40" height="40"></label>
					<div class="formControls col-xs-8" style="margin-top: 8px;">
						<input id="code" name="randomcode" class="input-text size-L"
							placeholder="验证码"
							style="width: 100px !important;height: 30px !important;" /> <img
							id="randomcode_img" src="validatecode.jsp" width="60" height="30"
							align='absMiddle' /> <a href="codeRefresh">刷新</a>
					</div>
				</div>
				<div class="row cl">
					<!-- 类型,1表示登录老人后台,2表示登录电商后台 -->
					<label class="form-label col-xs-3"></label>
					<div class="formControls col-xs-8">
						<input type="radio" name="loginType" class="type" value="1"
							checked="checked" style="margin-top: 2px;" /><font color="black"
							size="3">老人后台管理员</font> <input type="radio" name="loginType"
							class="type" value="0" style="margin-top: 2px;" /><font
							color="black" size="3">电商后台管理员</font>
					</div>
				</div>
				<div class="row cl">
					<div class="formControls col-xs-8 col-xs-offset-3">
						<input id="login" type="button"
							style="background-color: #1296db;border-color: #1296db;"
							class="btn btn-success radius size-L"
							value="&nbsp;登&nbsp;&nbsp;&nbsp;&nbsp;录&nbsp;"> <input
							type="reset" class="btn btn-default radius size-L"
							value="&nbsp;取&nbsp;&nbsp;&nbsp;&nbsp;消&nbsp;">
					</div>
				</div>
			</form>
		</div>
	</div>
	<div class="footer">Copyright 孝和集团</div>
	<script type="text/javascript">
		$("#login").click(function() {
			var user = $("#username").val();
			var pwd = $("#password").val();
			var code = $("#code").val();
			var type = $(".type").attr("checked");
			if (user == '' || pwd == '') {
				$("#msg").empty();
				$("#msg").append("请先输入信息");
			}else if(code == ''){
				$("#msg").empty();
				$("#msg").append("请先输入验证码");
			}else if(type == ''){
				$("#msg").empty();
				$("#msg").append("请选择登录类型");
			}else {
				$("#msg").empty();
				$("#loginForm").submit();
				layer.load();
			}
		});
	</script>
</body>
</html>
