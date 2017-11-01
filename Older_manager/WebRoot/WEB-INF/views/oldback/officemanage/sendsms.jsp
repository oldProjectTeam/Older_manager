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

<title>My JSP 'sendsms.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta content="width=device-width,initial-scale=1">
<!-- 引入jquery -->
<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery-3.2.1.min.js"></script>
<!-- 引入样式 -->
<link
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body style="margin: 15px;">

	<!--路径导航  -->
	<div>
		<div class="row">
			<div class="col-md-12">
				<ol class="breadcrumb">
					<li><b>位置：<a href="page">办公管理</a></b></li>
					<li class="active">发送短信</li>
				</ol>
			</div>
		</div>
	</div>
	<div style="width:98%;margin-left:10px">
		<form class="form-inline">
			<div class="form-group">
				<label for="exampleInputEmail2" >收信人:</label> <input type="text"
					class="form-control" value="${phone}">
			</div>
			<button type="button" class="btn btn-info">从通讯录中选择</button>
			<br /> <br /> <br /> <label>发送内容:</label><br />
			<div class="form-group">
				<textarea class="form-control" placeholder="发送内容" rows="10"
					cols="128"></textarea>
			</div>
			<br />
			<br />
			<button type="button" class="col-sm-offset-8 btn btn-info">发送</button>
		</form>
	</div>
</body>
</html>
