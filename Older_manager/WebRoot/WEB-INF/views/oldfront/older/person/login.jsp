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

<title>欢迎登录智慧老人系统</title>

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
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300'
	rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Lobster'
	rel='stylesheet' type='text/css' />
<script src="${APP_PATH}/static/oldfront/older/js/jquery.js"></script>
</head>
<body>
	<jsp:include page="../header.jsp"></jsp:include>
	<a>
		<div class="login">
			<div class="bgimg">
				<img src="${APP_PATH}/static/oldfront/img/bggg1.png" />
			</div>
			<form action="${APP_PATH}/oldmanaccount/olderLogin" method="POST"
				id="loginForm">
				<div class="login1">
					<p style="color: #31B0D5;">智慧老人系统登录</p>
					<div class="login2">
						<img src="${APP_PATH}/static/oldfront/img/zhanghao.png" /> <input
							name="account" type="text" placeholder="手机号码" id="account" /> <font
							color="red"></font>
					</div>
					<div class="login2">
						<img src="${APP_PATH}/static/oldfront/img/mima.png" /> <input
							name="password" type="password" placeholder="请输入密码" id="password" />
						<font color="red"></font>
					</div>
					<div class="btn1" style="margin-top: 15px;">
						<input type="button" class="btn2" value="登 录" id="login" /> <img
							src="${APP_PATH}/static/images/loading.gif" id="loading"
							style="margin-left: 180px;display: none;">
					</div>
					<center>
						<font color="red" style="font-size:0.6em" id="msg">${msg}</font>
					</center>
				</div>
			</form>
			<div class="clear"></div>
		</div>
	</a>
	<br />
	<jsp:include page="../footer.jsp"></jsp:include>

	<script type="text/javascript">
		$("#login").click(function() {
			var regx = /^[1][3,4,5,7,8][0-9]{9}$/;
			if ($("#account").val() == '') {
				$("#msg").html("请输入账号!");
				return false;
			}
			if (!regx.test($("#account").val())) {
				$("#msg").html("请输入正确的手机号码!");
				return false;
			}
			var pass = /^[a-zA-Z0-9_\.-]{6,30}$/;
			var password = $("#password").val();
			if (password == '') {
				$("#msg").html("请输入密码!");
				return false;
			}
			if (password.length < 6) {
				$("#msg").html("密码至少为六位!");
				return false;
			}
			if (!pass.test(password)) {
				$("#msg").html("密码可以是6-30为[a-zA-Z0-9_.-]");
				return false;
			} else {
				$("#msg").html("");
				$("#login").val("正在登录...");
				$("#loading").css("display", "block");
				$("#loginForm").submit();
			}
		});
	</script>
</body>
</html>
