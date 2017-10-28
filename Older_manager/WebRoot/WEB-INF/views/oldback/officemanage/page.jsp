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

<title>My JSP 'page.jsp' starting page</title>

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

	<!--菜单列表  -->
	<div>
		<div class="row">
			<div class="col-md-3">
				<div class="list-group">
					<a href="sendsms" class="list-group-item text-center"><img
						src="static/images/sendsms.png" alt="..." class="img-rounded">
						<br> <br>发送短信 </a>
				</div>
			</div>
			<div class="col-md-3">
				<div class="list-group">
					<a href="sendrecord" class="list-group-item text-center"><img
						src="static/images/sendrecord.png" alt="..." class="img-rounded">
						<br> <br>短信记录 </a>
				</div>
			</div>
			<div class="col-md-3">
				<div class="list-group">
					<a href="informnotice" class="list-group-item text-center"><img
						src="static/images/tzgg.png" alt="..." class="img-rounded">
						<br> <br>通知公告 </a>
				</div>
			</div>
			<div class="col-md-3">
				<div class="list-group">
					<a href="sendnotice" class="list-group-item text-center"><img
						src="static/images/sendgg.png" alt="..." class="img-rounded">
						<br> <br>发布公告 </a>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-3">
				<div class="list-group">
					<a href="addressbookmanager" class="list-group-item text-center"><img
						src="static/images/txlrecord.png" alt="..." class="img-rounded">
						<br> <br>通讯录管理 </a>
				</div>
			</div>
			<div class="col-md-3">
				<div class="list-group">
					<a href="activitymanager" class="list-group-item text-center"><img
						src="static/images/hdmanage.png" alt="..." class="img-rounded">
						<br> <br>活动管理 </a>
				</div>
			</div>
			<div class="col-md-3">
				<div class="list-group">
					<a href="sendactivity" class="list-group-item text-center"><img
						src="static/images/sendhd.png" alt="..." class="img-rounded">
						<br> <br>发布活动 </a>
				</div>
			</div>

		</div>
	</div>
</body>
</html>
