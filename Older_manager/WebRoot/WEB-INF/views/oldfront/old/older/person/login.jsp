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
</head>
<body>
	<jsp:include page="../header.jsp"></jsp:include>
	<a>
		<div class="login">
			<div class="bgimg">
				<img src="${APP_PATH}/static/oldfront/img/bggg1.png" />
			</div>
			<form>
				<div class="login1">
					<p style="color: #31B0D5;">智慧老人系统登录</p>
					<div class="login2">
						<img src="${APP_PATH}/static/oldfront/img/zhanghao.png" /> <input
							type="text" placeholder="请输入账号" />
					</div>
					<div class="login2">
						<img src="${APP_PATH}/static/oldfront/img/mima.png" /> <input
							type="password" placeholder="请输入密码" />
					</div>
					<div class="login3">
						<input type="radio" /><span>记住密码</span> <a
							href="${APP_PATH}/older/register">没有账号？</a>
					</div>
					<div class="btn1">
						<input type="button" class="btn2" value="登 录" />
					</div>
				</div>
			</form>
			<div class="clear"></div>
		</div>
	</a>
	<br />
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>
