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

<title></title>

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

</head>

<body style="margin: 15px;">
	<!--菜单列表  -->
	<div>
		<div class="row">
			<div class="col-md-3">
				<div class="list-group">
					<a href="${APP_PATH }/old/insertnewolder"
						class="list-group-item text-center"><img
						src="${APP_PATH}/static/images/oldback/images/info.png" alt="档案管理"
						class="img-rounded"> <br> <br>档案管理 </a>
				</div>
			</div>
			<div class="col-md-3">
				<div class="list-group">
					<a href="${APP_PATH}/health/health"
						class="list-group-item text-center"><img
						src="${APP_PATH}/static/images/oldback/images/health.png"
						alt="健康管理" class="img-rounded"> <br> <br>健康管理 </a>
				</div>
			</div>
			<div class="col-md-3">
				<div class="list-group">
					<a href="coursemanager.jsp" class="list-group-item text-center"><img
						src="${APP_PATH}/static/images/oldback/images/relative.png"
						alt="客户关系管理" class="img-rounded"> <br> <br>客户关系管理
					</a>
				</div>
			</div>
			<div class="col-md-3">
				<div class="list-group">
					<a href="education/educationIndex"
						class="list-group-item text-center"><img
						src="${APP_PATH}/static/images/oldback/images/education.png"
						alt="教育管理" class="img-rounded"> <br> <br>教育管理 </a>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-3">
				<div class="list-group">
					<a href="courseenrol/searchCourseenrol"
						class="list-group-item text-center"><img
						src="${APP_PATH}/static/images/oldback/images/count.png"
						alt="数据统计" class="img-rounded"> <br> <br>数据统计 </a>
				</div>
			</div>
			<div class="col-md-3">
				<div class="list-group">
					<a href="officemanage/officemanageIndex"
						class="list-group-item text-center"><img
						src="${APP_PATH}/static/images/oldback/images/office.png"
						alt="办公管理" class="img-rounded"> <br> <br>办公管理 </a>
				</div>
			</div>
			<div class="col-md-3">
				<div class="list-group">
					<a href="accountmanage"
						class="list-group-item text-center"><img
						src="${APP_PATH}/static/images/oldback/images/old.png"
						alt="老人账户管理" class="img-rounded"> <br> <br>老人账户管理 </a>
				</div>
			</div>
			<div class="col-md-3">
				<div class="list-group">
					<a href="systemManageindex"
						class="list-group-item text-center"><img
						src="${APP_PATH}/static/images/oldback/images/system.png"
						alt="系统管理" class="img-rounded"> <br> <br>系统管理 </a>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-3">
				<div class="list-group">
					<a href="courseenrol/searchCourseenrol"
						class="list-group-item text-center"><img
						src="${APP_PATH}/static/images/oldback/images/location.png" width="100" height="75"
						alt="定位管理" class="img-rounded"> <br> <br>定位管理</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
