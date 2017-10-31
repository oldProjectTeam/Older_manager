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

<title>电商后台登录...</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<link href="${APP_PATH}/static/shop/assets/css/bootstrap.min.css"
	rel="stylesheet" />
<link rel="stylesheet"
	href="${APP_PATH}/static/shop/assets/css/font-awesome.min.css" />
<!--[if IE 7]>
		  <link rel="stylesheet" href="${APP_PATH}/static/shop/assets/css/font-awesome-ie7.min.css" />
		<![endif]-->
<link rel="stylesheet"
	href="${APP_PATH}/static/shop/assets/css/ace.min.css" />
<link rel="stylesheet"
	href="${APP_PATH}/static/shop/assets/css/ace-rtl.min.css" />
<link rel="stylesheet"
	href="${APP_PATH}/static/shop/assets/css/ace-skins.min.css" />
<link rel="stylesheet" href="${APP_PATH}/static/shop/css/style.css" />
<link rel="stylesheet"
	href="${APP_PATH}/static/shop/assets/css/ace-ie.min.css" />
<script src="${APP_PATH}/static/shop/assets/js/ace-extra.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/html5shiv.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/respond.min.js"></script>
<script src="${APP_PATH}/static/shop/js/jquery-1.9.1.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>

</head>
<body class="login-layout">
	<div class="logintop">
		<span>欢迎来到后台管理界面平台</span>
		<ul>
			<li><a href="#">返回首页</a></li>
			<li><a href="#">帮助</a></li>
			<li><a href="#">关于</a></li>
		</ul>
	</div>
	<div class="loginbody">
		<div class="login-container">
			<div class="center">
				<h1>
					<span class="white">后台管理系统</span>
				</h1>
				<h4 class="white">Background Management System</h4>
			</div>

			<div class="space-6"></div>

			<div class="position-relative">
				<div class="no-border visible" style="height: 500px;">
					<div class="widget-body">
						<div class="widget-main">
							<h4 class="header blue lighter bigger">
								<i class="icon-coffee green"></i> 管理员登陆
							</h4>

							<div class="login_icon">
								<img src="${APP_PATH}/static/shop/images/login.png" />
							</div>

							<form class="">
								<fieldset>
									<label class="block clearfix"> <span
										class="block input-icon input-icon-right"> <input
											type="text" class="form-control" placeholder="登录名" name="登录名">
											<i class="icon-user"></i>
									</span>
									</label> <label class="block clearfix"> <span
										class="block input-icon input-icon-right"> <input
											type="password" class="form-control" placeholder="密码"
											name="密码"> <i class="icon-lock"></i>
									</span>
									</label>
									<div class="space"></div>
									<div class="clearfix">
										<label class="inline"> <input type="checkbox"
											class="ace"> <span class="lbl">保存密码</span>
										</label>

										<button type="button"
											class="width-35 pull-right btn btn-sm btn-primary"
											id="login_btn">
											<i class="icon-key"></i> 登陆
										</button>
									</div>

									<div class="space-4"></div>
								</fieldset>
							</form>
						</div>
						<!-- /widget-main -->

						<div class="toolbar clearfix"></div>
					</div>
					<!-- /widget-body -->
				</div>
				<!-- /login-box -->
			</div>
			<!-- /position-relative -->
		</div>
	</div>
	<div class="loginbm">
		版权所有 2017 <a href="">孝和集团</a>
	</div>
	<strong></strong>
</body>

<script>
	$('#login_btn').on('click', function() {
		var num = 0;
		var str = "";
		$("input[type$='text']").each(function(n) {
			if ($(this).val() == "") {

				layer.alert(str += "" + $(this).attr("name") + "不能为空！\r\n", {
					title : '提示框',
					icon : 0,
				});
				num++;
				return false;
			}
		});
		if (num > 0) {
			return false;
		} else {
			layer.alert('登陆成功！', {
				title : '提示框',
				icon : 1,
			});
			location.href = "shopping_main";
			layer.close(index);
		}

	})
</script>
</html>