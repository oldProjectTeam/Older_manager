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

<title>My JSP 'sendnotice.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta name="viewport" content="width=device-width,initial-scale=1">
<!-- 引入jquery -->
<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery-1.7.2.min.js"></script>
<!-- 引入样式 -->
<link
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>

<body style="margin: 15px;">
	<div style="width:98%;margin-left:12px">


		<div class="page-header">
			<h4>发布公告</h4>
		</div>

		<form class="form-inline">
			<div class="form-group">
				<label for="exampleInputEmail2">公告标题:</label> <input type="text"
					class="form-control" placeholder="公告标题">
			</div>
			<div class="form-group">
				<label for="exampleInputEmail2">发布人:</label> <input type="text"
					class="form-control" placeholder="发布人姓名">
			</div>
			<br /> <br /> <br /> <label>发布内容:</label><br />
			<div class="form-group">
				<textarea class="form-control" placeholder="发布内容" rows="10"
					cols="128"></textarea>
			</div>
			<br /> <br />
			<button type="button" class="col-sm-offset-8 btn btn-info">发送</button>
		</form>
	</div>
</body>
</html>
