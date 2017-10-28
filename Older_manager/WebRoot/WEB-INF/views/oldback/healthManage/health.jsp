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

<title>My JSP 'health.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
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
	<!--导航  -->
	<div>
		<div class="row">
			<div class="col-md-12">
				<ol class="breadcrumb">
					<li><b>位置：健康管理</b>
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
						src="${APP_PATH}/static/images/healthdate.png" alt="..." class="img-rounded">
						<br> <br>健康数据 </a>
				</div>
			</div>
			<div class="col-md-3">
				<div class="list-group">
					<a href="addvedio.jsp" class="list-group-item text-center"><img
						src="${APP_PATH}/static/images/jiangkang.png" alt="..." class="img-rounded">
						<br> <br>基本健康信息 </a>
				</div>
			</div>
			<div class="col-md-3">
				<div class="list-group">
					<a href="coursemanager.jsp" class="list-group-item text-center"><img
						src="${APP_PATH}/static/images/lvli.png" alt="..." class="img-rounded"> <br>
						<br>健康履历 </a>
				</div>
			</div>
			<div class="col-md-3">
				<div class="list-group">
					<a href="addcourse.jsp" class="list-group-item text-center"><img
						src="${APP_PATH}/static/images/yao.png" alt="..." class="img-rounded"> <br>
						<br>用药记录 </a>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-3">
				<div class="list-group">
					<a href="videoManager.jsp" class="list-group-item text-center"><img
						src="${APP_PATH}/static/images/tice.png" alt="..." class="img-rounded"> <br>
						<br>体检记录 </a>
				</div>
			</div>
			<div class="col-md-3">
				<div class="list-group">
					<a href="addvedio.jsp" class="list-group-item text-center"><img
						src="${APP_PATH}/static/images/jiuzhen.png" alt="..." class="img-rounded">
						<br> <br>就诊记录 </a>
				</div>
			</div>
			<div class="col-md-3">
				<div class="list-group">
					<a href="coursemanager.jsp" class="list-group-item text-center"><img
						src="${APP_PATH}/static/images/suifang.png" alt="..." class="img-rounded">
						<br> <br>随访记录 </a>
				</div>
			</div>
			<div class="col-md-3">
				<div class="list-group">
					<a href="addcourse.jsp" class="list-group-item text-center"><img
						src="${APP_PATH}/static/images/pinggu.png" alt="..." class="img-rounded">
						<br> <br>评估报告 </a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
