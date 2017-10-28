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

<title>My JSP 'selectAttend.jsp' starting page</title>

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
<STYLE type="text/css">
.table th,.table td {
	text-align: center;
	vertical-align: middle !important;
}
</STYLE>
</head>

<body style="margin: 15px;">
	<!-- 头部 -->
	<div class="col-md-12">
		<div>
			<div class="row">

				<ol class="breadcrumb">
					<li><b>位置：健康管理>就诊记录</b>>查看记录
				</ol>

			</div>
		</div>

		<!-- 表格 -->
		<div class="row">
			<div class="col-md-12">
				<table class="table table-bordered">
					<tr class="active">
						<th>老人姓名：</th>
						<th>罗先生</th>
						<th>就诊医院：</th>
						<th>花溪人民武装医院</th>
						<th>就诊科室：</th>
						<th>心血管外科</th>
					</tr>
					<tr>
						<th>医生姓名：</th>
						<th>罗先生</th>
						<th>就诊时间：</th>
						<th>2017-05-05 23:00:00</th>
						<th>复诊时间：</th>
						<th>2017-05-05 23:00:00</th>
					</tr>
					<tr class="active">
						<th class="">主诉内容：</th>
						<th colspan="2">sdfdafsdfsdf</th>
						<th>体格检查内容：</th>
						<th colspan="2">sdfdafsdfsdf</th>
					</tr>
					<tr>
						<th>辅助检查内容：</th>
						<th colspan="2">sdfdafsdfsdf</th>
						<th>实际检查内容：</th>
						<th colspan="2">sdfdafsdfsdf</th>
					</tr>
					<tr class="active">
						<th>正常使用药物：</th>
						<th colspan="2">sdfdafsdfsdf</th>
						<th>本次诊断结果：</th>
						<th colspan="2">sdfdafsdfsdf</th>
					</tr>
					<tr>
						<th>治疗处方和保健处方：</th>
						<th colspan="2">sdfdafsdfsdf</th>
						<th>相关禁忌事项：</th>
						<th colspan="2">sdfdafsdfsdf</th>
					</tr>
				</table>
			</div>
		</div>
	</div>
</body>
</html>
