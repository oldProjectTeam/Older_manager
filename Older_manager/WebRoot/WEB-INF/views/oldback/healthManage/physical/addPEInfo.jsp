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

<title>My JSP 'addAttend.jsp' starting page</title>

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
					<li><b>位置：健康管理>体检记录</b>>新增记录
				</ol>
			</div>
		</div>
		<!-- 表格 -->
		<div class="row">
			<div class="col-md-12">
				<table class="table table-bordered">
					<tr class="active">
						<th>老人姓名：</th>
						<th><select>
								<OPTION class="form-control">罗先生</OPTION>
						</select></th>
						<th>体检医院：</th>
						<th><select>
								<OPTION class="form-control">人民武装医院</OPTION>
						</select></th>
						<th>老人ID：</th>
						<th><select>
								<OPTION class="form-control">554545</OPTION>
						</select></th>
					</tr>
					<tr>
						<th>医生姓名：</th>
						<th><select>
								<OPTION class="form-control">罗先生</OPTION>
						</select></th>
						<th>体检时间：</th>
						<th><INPUT type="date" class="form-control"></th>
						<th>下次体检时间：</th>
						<th><INPUT type="date" class="form-control"></th>
					</tr>
					<tr class="active">
						<th class="">体检项目：</th>
						<th colspan="2"><textarea class="form-control" rows="3"></textarea>
						</th>
						<th>体检值：</th>
						<th colspan="2"><textarea class="form-control" rows="3"></textarea></th>
					</tr>
					<tr>
						<th>体检结果：</th>
						<th colspan="2"><textarea class="form-control" rows="3"></textarea></th>
						<th>结果分析：</th>
						<th colspan="2"><textarea class="form-control" rows="3"></textarea></th>
					</tr>
					<tr class="active">
						<th>报告图片：</th>
						<th colspan="2"><textarea class="form-control" rows="3"></textarea></th>
						<th>备注：</th>
						<th colspan="2"><textarea class="form-control" rows="3"></textarea></th>
					</tr>
					
					<tr>
						<th>健康状况：</th>
						<th colspan="2"><textarea class="form-control" rows="3"></textarea></th>
						<th>健康数据评估：</th>
						<th colspan="2"><textarea class="form-control" rows="3"></textarea></th>
					</tr>
					<tr>
						<th>医生建议：</th>
						<th colspan="5"><textarea class="form-control" rows="3"></textarea></th>
						
					</tr>
				</table>
			</div>
		</div>
		<!-- 按钮 -->
		<div class="row">
			<div align="center">
				<BUTTON class="btn btn-success">保存</BUTTON>
				<BUTTON class="btn btn-defualt">返回</BUTTON>
			</div>
		</div>
	</div>
</body>
</html>