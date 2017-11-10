<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
<script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.7.2.min.js"></script>
<!-- 引入样式 -->
<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
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
					<li>
						<b>位置：数据统计>回访记录</b>>查看记录
				</ol>
			</div>
		</div>
		<!-- 表格 -->
		<div class="row">
			<div class="col-md-12">
				<table class="table table-bordered">
					<tbody>
						<tr class="active">
							<th>老人姓名:</th>
							<td>${visitplan.oldman.name}</td>
							<th>老人身份证号码:</th>
							<td>${visitplan.oldman.idcar}</td>
							<th>回访状态:</th>
							<td>${visitplan.state}</td>
						</tr>
						<tr>
							<th>提醒人员:</th>
							<td>${visitplan.remindpeople}</td>
							<th>待提醒事务:</th>
							<td>${visitplan.pendingevent}</td>
							<th>提醒回访时间:</th>
							<td><fmt:formatDate value="${visitplan.remindvistitplantime}" pattern="yyyy-MM-dd HH:mm" /></td>
						</tr>
						<tr>
							<th>回访记录:</th>
							<td>${visitplan.visitrecord}</td>
							<th>计划回访事务:</th>
							<td>${visitplan.plannedvisits}</td>
							<th>计划回访时间:</th>
							<td><fmt:formatDate value="${visitplan.visiplantime}" pattern="yyyy-MM-dd HH:mm" /></td>
						</tr>
						<tr>
							<th>创建时间:</th>
							<td><fmt:formatDate value="${visitplan.createtime}" pattern="yyyy-MM-dd HH:mm" /></td>
							<th>实际回访事务:</th>
							<td>${visitplan.actualplannedvisits}</td>
							<th>实际回访时间:</th>
							<td><fmt:formatDate value="${visitplan.actualtime}" pattern="yyyy-MM-dd HH:mm" /></td>
						</tr>
						<tr>
							<th colspan="6"></th>
						</tr>
						<tr>
							<td rowspan="3" class="active" style="padding-top:50px">回访图片</td>
							<td rowspan="3" class="col-xs-2"><img
								src="${pageContext.request.contextPath}/${visitplan.images==null?'failure.png':visitplan.images}" id="imgShow"
								class="img-responsive"></td>
							<td rowspan="3" class="active" style="padding-top:50px">回访视频</td>
							<td rowspan="3" class="col-xs-2"><video src="${visitplan.video}" controls="controls" class="img-responsive" />
								您的浏览器不支持 video 标签。</td>
							<td rowspan="3" class="active" style="padding-top:50px">回访录音</td>
							<td rowspan="3" class="col-xs-2"><video src="${visitplan.recording}" controls="controls"
									class="img-responsive" /> 您的浏览器不支持 video 标签。</td>
						</tr>
						<tr>
							<td colspan="6" rowspan="3"  class="col-xs-2" >
								<button type="button" class="btn btn-info" onClick="javascript :history.back(-1);">返回</button>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>
