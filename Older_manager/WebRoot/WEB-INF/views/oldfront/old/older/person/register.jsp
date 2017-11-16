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
	href="${APP_PATH}/static/oldfront/css/reg.css" />
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300'
	rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Lobster'
	rel='stylesheet' type='text/css' />
</head>

<body>
	<jsp:include page="../header.jsp"></jsp:include>
	<a>
		<div class="reg1">
			<div class="reg2">
				<h2>欢迎注册智慧老人账号</h2>
				<form>
					<div class="reg3">
						<span>手机号码：</span> <input type="text" placeholder="请输入中国大陆手机号码" />
						<label>*</label>
					</div>
					<br />
					<div class="reg4">
						<div class="reg5" id="reg5">
							<span>短信验证码：</span> <input type="text" placeholder="请输入短信验证码" />
							<input type="button" value="获取短信验证码" /> <label>*</label>
						</div>
						<div class="reg5">
							<span>密码：</span> <input type="password" placeholder="6-12位数字或字母" />
							<label>*</label>
						</div>
						<div class="reg5">
							<span>确认密码：</span> <input type="password" placeholder="和密码保持一致" />
							<label>*</label>
						</div>
						<div class="reg5">
							<span>用户名：</span> <input type="text" placeholder="取个好听的名字吧" /> <label>*</label>
						</div>
						<div class="reg5">
							<span>邮箱：</span> <input type="text" placeholder="请输入正确的邮箱地址" />
							<label>*</label>
						</div>
						<div class="reg5">
							<button>立即注册</button>
							<label>*</label>
						</div>
						<div class="clear"></div>
					</div>
				</form>
			</div>
		</div>
	</a>
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>
