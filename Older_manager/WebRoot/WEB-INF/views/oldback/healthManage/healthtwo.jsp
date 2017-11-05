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
					<li><b>位置：健康管理</b></li>
					<li>健康履历</li>
				</ol>
			</div>
		</div>
	</div>
	<!--菜单列表  -->
	<div>
		<div class="row">
			<div class="col-md-3">
				<div class="list-group">
					<a href="disease/skipdisease" class="list-group-item text-center"><img
						src="${APP_PATH}/static/images/jibing.png" alt="..."
						class="img-rounded"> <br> <br>疾病列表 </a>
				</div>
			</div>
			<div class="col-md-3">
				<div class="list-group">
					<a href="disease/skipsurgery" class="list-group-item text-center"><img
						src="${APP_PATH}/static/images/shoushu.png" alt="..."
						class="img-rounded"> <br> <br>手术列表 </a>
				</div>
			</div>
			<div class="col-md-3">
				<div class="list-group">
					<a href="disease/skiptrauma" class="list-group-item text-center"><img
						src="${APP_PATH}/static/images/shoushang.png" alt="..."
						class="img-rounded"> <br> <br>外伤列表 </a>
				</div>
			</div>
			<div class="col-md-3">
				<div class="list-group">
					<a href="disease/skipbloodtransfusion" class="list-group-item text-center"><img
						src="${APP_PATH}/static/images/shuye.png" alt="..."
						class="img-rounded"> <br> <br>输液列表</a>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-3">
				<div class="list-group">
					<a href="disease/skipgenetichistory" class="list-group-item text-center"><img
						src="${APP_PATH}/static/images/yichuan.png" alt="..."
						class="img-rounded"> <br> <br>遗传病史</a>
				</div>
			</div>
			
		</div>
	</div>
</body>
</html>
