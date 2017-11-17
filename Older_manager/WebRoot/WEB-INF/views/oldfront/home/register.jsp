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
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>
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
							<form method="post" id="registerFormEmail">
								<div class="user-email">
									<label for="email"><i class="am-icon-envelope-o"
										style="margin-top: 12px;"></i></label> <input type="email"
										name="email" id="email" placeholder="请输入邮箱账号"> <input
										type="hidden" name="account" id="accountEmail"> <input
										type="hidden" name="nickname" value="">
								</div>
								<div class="user-pass">
									<label for="password"><i class="am-icon-lock"
										style="margin-top: 12px;"></i></label> <input type="password"
										name="password" id="passwordEmail" placeholder="设置密码">
								</div>
								<div class="user-pass">
									<label for="passwordRepeat"><i class="am-icon-lock"
										style="margin-top: 12px;"></i></label> <input type="password"
										id="passwordRepeatEmail" placeholder="确认密码">
								</div>
							</form>
							<div class="login-links">
								<label for="reader-me"> <input id="reader-me-Email"
									type="checkbox"> 点击表示您同意商城《服务协议》
								</label>
							</div>
							<div class="am-cf">
								<input type="button" id="registerEmail" value="注册"
									class="am-btn am-btn-primary am-btn-sm am-fl">
							</div>
						</div>
						<div class="am-tab-panel">
							<form method="post" id="registerFormPhone">
								<div class="user-phone">
									<label for="phone"><i
										class="am-icon-mobile-phone am-icon-md"
										style="margin-top: 4px;"></i></label> <input type="text" name="phone"
										id="phone" placeholder="请输入手机号"> <input type="hidden"
										name="account" id="accountPhone"> <input type="hidden"
										name="nickname" value="">
								</div>
								<div class="verification">
									<label for="code"><i class="am-icon-code-fork"
										style="margin-top: 12px;"></i></label> <input type="text" name="code"
										id="code" placeholder="请输入验证码"> <a class="btn"
										href="javascript:void(0);" id="sendMobileCode"> <span
										id="dyMobileButton" onclick="getCode()">获取</span></a>
								</div>
								<div class="user-pass">
									<label for="password"><i class="am-icon-lock"
										style="margin-top: 12px;"></i></label> <input type="password"
										name="password" id="passwordPhone" placeholder="设置密码">
								</div>
								<div class="user-pass">
									<label for="passwordRepeat"><i class="am-icon-lock"
										style="margin-top: 12px;"></i></label> <input type="password"
										id="passwordRepeatPhone" placeholder="确认密码">
								</div>
							</form>
							<div class="login-links">
								<label for="reader-me"> <input id="reader-me-Phone"
									type="checkbox"> 点击表示您同意商城《服务协议》
								</label>
							</div>
							<div class="am-cf">
								<input type="button" id="registerPhone" value="注册"
									class="am-btn am-btn-primary am-btn-sm am-fl">
							</div>
							<hr>
						</div>
						<script>
							$(function() {
								$('#doc-my-tabs').tabs();
							});
						</script>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="footer ">
		<div class="footer-hd ">
			<p>
				<a href="# ">孝和集团</a> <b>|</b> <a href="# ">商城首页</a> <b>|</b> <a
					href="# ">支付宝</a> <b>|</b> <a href="# ">物流</a>
			</p>
		</div>
		<div class="footer-bd ">
			<p>
				<a href="# ">关于我们</a> <a href="# ">合作伙伴</a> <a href="# ">联系我们</a> <a
					href="# ">网站地图</a> <em>© 2017孝和集团 版权所有</em>
			</p>
		</div>
	</div>
	<script type="text/javascript">
		//倒计时60秒
		var wait = 60;
		function time() {
			$("#dyMobileButton").empty();
			if (wait == 0) {
				$("#dyMobileButton").attr("onclick", "getCode()");
				$("#dyMobileButton").append("获取");
				wait = 60;
			} else {
				$("#dyMobileButton").append(wait + "s");
				$("#dyMobileButton").removeAttr("onclick");
				wait--;
				setTimeout(function() {
					time();
				}, 1000);
			}
		}

		//验证码
		var code;
		function getCode() {
			if ($("#phone").val() == '') {
				layer.msg("请输入手机号");
			} else if (!$("#phone").val().match(phone)) {
				layer.msg("手机号码格式不正确");
			} else {
				$.ajax({
					url : "getCode",
					data : {
						"phone" : $("#phone").val()
					},
					type : "GET",
					success : function(result) {
						console.log(result);
						if (result.code == 100) {
							layer.msg("短信已经下发到手机");
							code = result.extend.msg;
							time();
						} else {
							layer.msg(result.extend.error);
						}
					}
				});
			}
		}

		var email = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+/;
		var phone = /^[+]{0,1}(\d){1,3}[ ]?([-]?((\d)|[ ]){1,12})+$/;
		var pwd = /^(\w){6,20}$/;
		//邮箱注册
		$("#registerEmail")
				.click(
						function() {
							if ($("#email").val() == ''
									|| $("#passwordEmail").val() == ''
									|| $("#passwordRepeatEmail").val() == '') {
								layer.msg("请填写信息");
							} else if ($("#passwordEmail").val() != $(
									"#passwordRepeatEmail").val()) {
								layer.msg("两次密码输入不一致");
							} else {
								if ($("#reader-me-Email").is(":checked")) {
									if (!$("#email").val().match(email)) {
										layer.msg("邮箱格式不正确");
									} else if (!$("#passwordEmail").val()
											.match(pwd)) {
										layer.msg("密码可以是6-20个字母、数字、下划线 ");
									} else {
										$("#accountEmail").val(
												$("#email").val());
										var index=layer.load();
										$
												.ajax({
													url : "registerOfEmail",
													data : $(
															"#registerFormEmail")
															.serialize(),
													type : "POST",
													success : function(result) {
														if (result.code == 100) {
															layer.msg("注册成功");
															window.location.href = "shop/login";
														} else {
															layer
																	.msg(result.extend.error);
															layer.close(index);
														}
													}
												});
									}
								} else {
									layer.msg("你还没用同意协议");
								}
							}
						});

		//手机号注册
		$("#registerPhone")
				.click(
						function() {
							if ($("#phone").val() == ''
									|| $("#passwordPhone").val() == ''
									|| $("#passwordRepeatPhone").val() == '') {
								layer.msg("请填写信息");
							} else if ($("#passwordPhone").val() != $(
									"#passwordRepeatPhone").val()) {
								layer.msg("两次密码输入不一致");
							} else {
								if ($("#reader-me-Phone").is(":checked")) {
									if (!$("#phone").val().match(phone)) {
										layer.msg("手机号码格式不正确");
									} else if (!$("#passwordPhone").val()
											.match(pwd)) {
										layer.msg("密码可以是6-20个字母、数字、下划线 ");
									} else {
										$("#accountPhone").val(
												$("#phone").val());
										if ($("#code").val() != code) {
											layer.msg("验证码不正确 ");
										} else {
											var index=layer.load();
											$
													.ajax({
														url : "registerOfPhone",
														data : $(
																"#registerFormPhone")
																.serialize(),
														type : "POST",
														success : function(
																result) {
															if (result.code == 100) {
																layer
																		.msg("注册成功");
																window.location.href = "shop/login";
															} else {
																layer
																		.msg(result.extend.error);
																layer.close(index);
															}
														}
													});
										}
									}
								} else {
									layer.msg("你还没用同意协议");
								}
							}
						});
	</script>
</body>
</html>