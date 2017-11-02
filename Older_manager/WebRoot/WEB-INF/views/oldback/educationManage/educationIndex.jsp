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

<title>educationIndex</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
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
	<!--导航  -->
	<div>
		<div class="row">
			<div class="col-md-12">
				<ol class="breadcrumb">
					<li><b>位置：教育管理</b></li>
				</ol>
			</div>
		</div>
	</div>
	<!--菜单列表  -->
	<div>
		<div class="row">
			<div class="col-md-3">
				<div class="list-group">
					<a href="videoManager.jsp" class="list-group-item text-center"><img
						src="static/images/oldback/images/vedio.png" alt="..." class="img-rounded"> <br>
						<br>视频管理 </a>
				</div>
			</div>
			<div class="col-md-3">
				<div class="list-group">
					<a href="addvedio.jsp" class="list-group-item text-center"><img
						src="static/images/oldback/images/addvedio.png" alt="..." class="img-rounded">
						<br> <br>添加视频 </a>
				</div>
			</div>
			<div class="col-md-3">
				<div class="list-group">
					<a href="coursemanager.jsp" class="list-group-item text-center"><img
						src="static/images/oldback/images/course.png" alt="..." class="img-rounded"> <br>
						<br>课程管理 </a>
				</div>
			</div>
			<div class="col-md-3">
				<div class="list-group">
					<a href="addcourse.jsp" class="list-group-item text-center"><img
						src="static/images/oldback/images/addcourse.png" alt="..." class="img-rounded">
						<br> <br>添加课程 </a>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-3">
				<div class="list-group">
					<a href="courseenrol/searchCourseenrol" class="list-group-item text-center"><img
						src="static/images/oldback/images/takecourse.png" alt="..." class="img-rounded">
						<br> <br>课程报名 </a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
