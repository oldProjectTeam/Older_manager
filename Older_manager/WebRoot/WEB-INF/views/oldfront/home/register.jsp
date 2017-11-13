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

<title>注册</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" href="${APP_PATH}/static/css/amazeui.min.css" />
<link href="${APP_PATH}/static/css/dlstyle.css" rel="stylesheet"
	type="text/css">
<script src="${APP_PATH}/static/js/jquery-3.2.1.min.js"></script>
<script src="${APP_PATH}/static/js/amazeui.min.js"></script>

</head>

<body>

	<div class="login-boxtitle">
		<a href="home/demo.html"><img alt=""
			src="${APP_PATH}/static/images/logobig.png" /></a>
	</div>

	<div class="res-banner">
		<div class="res-main">
			<div class="login-banner-bg">
				<span></span><img src="${APP_PATH}/static/images/big.jpg" />
			</div>
			<div class="login-box">

				<div class="am-tabs" id="doc-my-tabs">
					<ul class="am-tabs-nav am-nav am-nav-tabs am-nav-justify">
						<li class="am-active"><a href="">邮箱注册</a></li>
						<li><a href="">手机号注册</a></li>
					</ul>

					<div class="am-tabs-bd">
						<div class="am-tab-panel am-active">
							<form method="post">

								<div class="user-email">
									<label for="email"><i class="am-icon-envelope-o"
										style="margin-top: 12px;"></i></label> <input type="email" name=""
										id="email" placeholder="请输入邮箱账号">
								</div>
								<div class="user-pass">
									<label for="password"><i class="am-icon-lock"
										style="margin-top: 12px;"></i></label> <input type="password" name=""
										id="password" placeholder="设置密码">
								</div>
								<div class="user-pass">
									<label for="passwordRepeat"><i class="am-icon-lock"
										style="margin-top: 12px;"></i></label> <input type="password" name=""
										id="passwordRepeat" placeholder="确认密码">
								</div>

							</form>

							<div class="login-links">
								<label for="reader-me"> <input id="reader-me"
									type="checkbox"> 点击表示您同意商城《服务协议》
								</label>
							</div>
							<div class="am-cf">
								<input type="submit" name="" value="注册"
									class="am-btn am-btn-primary am-btn-sm am-fl">
							</div>

						</div>

						<div class="am-tab-panel">
							<form method="post">
								<div class="user-phone">
									<label for="phone"><i
										class="am-icon-mobile-phone am-icon-md"
										style="margin-top: 12px;"></i></label> <input type="tel" name=""
										id="phone" placeholder="请输入手机号">
								</div>
								<div class="verification">
									<label for="code"><i class="am-icon-code-fork"
										style="margin-top: 12px;"></i></label> <input type="tel" name=""
										id="code" placeholder="请输入验证码"> <a class="btn"
										href="javascript:void(0);" onclick="sendMobileCode();"
										id="sendMobileCode"> <span id="dyMobileButton">获取</span></a>
								</div>
								<div class="user-pass">
									<label for="password"><i class="am-icon-lock"
										style="margin-top: 12px;"></i></label> <input type="password" name=""
										id="password" placeholder="设置密码">
								</div>
								<div class="user-pass">
									<label for="passwordRepeat"><i class="am-icon-lock"
										style="margin-top: 12px;"></i></label> <input type="password" name=""
										id="passwordRepeat" placeholder="确认密码">
								</div>
							</form>
							<div class="login-links">
								<label for="reader-me"> <input id="reader-me"
									type="checkbox"> 点击表示您同意商城《服务协议》
								</label>
							</div>
							<div class="am-cf">
								<input type="submit" name="" value="注册"
									class="am-btn am-btn-primary am-btn-sm am-fl">
							</div>

							<hr>
						</div>

						<script>
							$(function() {
								$('#doc-my-tabs').tabs();
							})
						</script>

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
</body>

</html>