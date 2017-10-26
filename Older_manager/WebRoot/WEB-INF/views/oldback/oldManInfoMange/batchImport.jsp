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

<title>My JSP 'batchImport.jsp' starting page</title>

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

<body>
	<!--路劲导航  -->
	<div class="row">
		<div class="col-md-12">
			<ol class="breadcrumb">
				<li><b>位置：<a
						href="static/oldback/oldManInfoMange/index.html">老人档案管理</a></b></li>
				<li class="active">批量导入</li>
			</ol>
		</div>
	</div>

	<div class="container">
		<form action="old/addOldManBatch" method="post"
			enctype="multipart/form-data" id="importBatchForm">
			<div class="row">
				<div class="col-md-4 col-md-offset-4">
					<input type="file" name="file" id="excel" class="form-control">
				</div>
				<br> <br>
				<div class="col-md-4 col-md-offset-5">
					<button type="button" class="btn btn-success" id="importBatch">批量导入</button>
					<br /> <br /> <font color="blue" id="msg">${msg}</font> <span></span>
				</div>
			</div>
		</form>
	</div>

	<script type="text/javascript">
		$("#importBatch").click(function() {
			$("#msg").empty();
			var file = $("#excel").val();
			if (file == '') {
				$("#msg").append("请先选择文件");
			} else {
				$("#importBatchForm").submit();
			}
		});
	</script>
</body>
</html>
