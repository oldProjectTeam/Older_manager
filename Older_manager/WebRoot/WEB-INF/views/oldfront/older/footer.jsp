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

<title>My JSP 'footer.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
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
	href="${APP_PATH}/static/oldfront/assets/css/zhuye.css" />
<script language="JavaScript"
	src="${APP_PATH}/static/js/jquery-3.2.1.min.js"></script>
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300'
	rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Lobster'
	rel='stylesheet' type='text/css' />
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>

</head>

<body>
	<div
		style="color: #F0F0EE;background: #01A2A6;font:16px Tahoma; margin:0px auto; text-align:center;">
		<div>
			<hr />
			<p>关于我们 | 联系我们 | 使用帮助 | 用户协议 | iPhone/iPad Android</p>

			<p>地址：贵州省贵阳市花溪区贵州大学北校区野猪林 | 联系电话：0851-7474740</p>

			Copyright &copy;2017 孝和集团<a href="#" style="color:#00A4AC;">七剑下通州有限公司</a>
			ALL RIGHT RESERVED<br /> 联系方式：qijianxiatongzhou@gmail.com<br />
			<hr />
		</div>
	</div>
</body>
</html>
