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

<title>登录</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
<meta name="format-detection" content="telephone=no">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />

<link rel="stylesheet" href="${APP_PATH}/static/css/amazeui.css" />
<link href="${APP_PATH}/static/css/dlstyle.css" rel="stylesheet"
	type="text/css">
<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery-3.2.1.min.js"></script>
<script
	src="${APP_PATH}/lib/jquery.validation/1.14.0/validate-methods.js"></script>
<script
	src="${APP_PATH}/lib/jquery.validation/1.14.0/jquery.validate.js"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>
<link
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<style>
.error {
	color: red;
}
</style>
</head>

<body>

	<div class="login-boxtitle">
		<a href="${APP_PATH}/shop/oldfronthome"><img
			src="${APP_PATH}/static/images/oldback/images/logo.png"
			height="65px;" /> </a>
	</div>

	<div class="login-banner">
		<div class="login-main">
			<div class="login-banner-bg">
				<span></span><img src="${APP_PATH}/static/images/big.jpg" />
			</div>
			<div class="login-box">

				<h3 class="title">登录商城</h3>

				<div class="clear"></div>

				<div class="login-form">
					<form id="login_form_data" action="Shop/UserLogin" id="loginForm"
						method="post">
						<div class="user-name">
							<label for="user"> <i class="am-icon-user"
								style="margin-top: 12px;"></i>
							</label> <input type="text" name="useraccount" id="useraccount"
								placeholder="邮箱/手机">
						</div>
						<div class="user-pass" style="margin-top: 10px;">
							<label for="password"> <i class="am-icon-lock"
								style="margin-top: 12px;"></i>
							</label> <input type="password" name="password" id="password"
								placeholder="请输入密码">
						</div>
						<div class="user-pass">
							<label class="password"> <img
								src="static/images/code.png" width="20" height="20"
								style="margin-top: 10px;">
							</label> <input id="code" name="randomcode" class="input-text size-L"
								placeholder="验证码"
								style="width: 200px !important; margin-left: 0px;" /> <img
								id="randomcode_img" src="validatecode.jsp" width="60"
								height="30" style="margin-top: 0px" /> <a
								href="Shop/codeRefresh">刷新</a>
						</div>
					</form>
				</div>
				<center>
					<font color="red" id="msg" size="3" style="margin-left: 20px">${message}</font>
				</center>
				<div>
					<input id="remember-me" type="radio"><span> 记住密码</span> <a
						href="#" class="am-fr">忘记密码</a> <a
						href="${APP_PATH}/shop/register"
						class="zcnext am-fr am-btn-default">注册</a> <br />
				</div>
				<div class="am-cf">
					<input type="button" id="shopLogin" value="登 录"
						class="am-btn am-btn-primary am-btn-sm">
				</div>
			</div>
		</div>
	</div>


	<div class="footer ">
		<div class="footer-hd ">
			<p>
				<a href="# ">恒望科技</a> <b>|</b> <a href="# ">商城首页</a> <b>|</b> <a
					href="# ">支付宝</a> <b>|</b> <a href="# ">物流</a>
			</p>
		</div>
		<div class="footer-bd ">
			<p>
				<a href="# ">关于恒望</a> <a href="# ">合作伙伴</a> <a href="# ">联系我们</a> <a
					href="# ">网站地图</a> <em>© 2015-2025 Hengwang.com 版权所有</em>
			</p>
		</div>
	</div>
	<script type="text/javascript">
		$("#shopLogin").click(function() {
			var user = $("#useraccount").val();
			var pwd = $("#password").val();
			var code = $("#code").val();
			if (user == '' || pwd == '') {
				$("#msg").empty();
				$("#msg").append("请先输入信息");
			} else if (code == '') {
				$("#msg").empty();
				$("#msg").append("请先输入验证码");
			} else {
				$("#msg").empty();
				$("#login_form_data").submit();
				layer.load();
			}
		});
	</script>
</body>


</html>