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
					<li><b>位置：数据统计>回访记录</b>>修改记录
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
						
						<th>计划回访事务：</th>
						<th colspan="1"><textarea class="form-control" rows="1"></textarea></th>
						<th>计划回访时间：</th>
						<th><INPUT type="date" class="form-control"></th>
					</tr>
					<tr>
						<th>老人ID：</th>
						<th><select>
								<OPTION class="form-control">22222</OPTION>
						</select></th>
						<th>实际回访事务：</th>
						<th colspan="1"><textarea class="form-control" rows="1"></textarea></th>
						<th>实际回访时间：</th>
						<th><INPUT type="date" class="form-control"></th>
					</tr>
					<tr class="active">
						<th>提醒人员：</th>
						<th><select>
								<OPTION class="form-control">罗先生</OPTION>
						</select></th>
						
						<th>回访状态：</th>
						<th colspan="1"><textarea class="form-control" rows="1"></textarea></th>
						<th>提醒回访时间：</th>
						<th><INPUT type="date" class="form-control"></th>
					</tr>
					<tr class="active">
						<th></th>
						<th></th>
						
						<th></th>
						<th colspan="1"></th>
						<th>创建时间</th>
						<th><INPUT type="date" class="form-control"></th>
					</tr>
					<tr>
						<th>待提醒事务：</th>
						<th colspan="2"><textarea class="form-control" rows="3"></textarea></th>
						<th>回访记录：</th>
						<th colspan="2"><textarea class="form-control" rows="3"></textarea></th>
					</tr>
					<tr class="active">
						<td rowspan="1" class="active">视频 </td>
								<td rowspan="1" class="col-xs-3"><input type="hidden"
									id="videopath" name="path" /> <input class="form-control"
									type="file" id="video" onchange="showPic()"></td>
						
						<td rowspan="1" class="active">图片</td>
								<td rowspan="1" class="col-xs-3"><input type="hidden"
									id="videopath" name="path" /> <input class="form-control"
									type="file" id="video" onchange="showPic()"></td>
						
						<td rowspan="1" class="active">录音 </td>
								<td rowspan="1" class="col-xs-3"><input type="hidden"
									id="videopath" name="path" /> <input class="form-control"
									type="file" id="video" onchange="showPic()"></td>						
						
					</tr>
					
					<tr>
						<td colspan="2"><input class="btn btn-success"
									type="button" value="上传视频" name="addvideo"
									onclick="uploadFile()">
									<div id="progress" style=" margin-top: 20 " class="progress-bar"></td>
						<td colspan="2"><input class="btn btn-success"
									type="button" value="上传图片" name="addvideo"
									onclick="uploadFile()">
									<div id="progress" style=" margin-top: 20 " class="progress-bar"></td>
						<td colspan="2"><input class="btn btn-success"
									type="button" value="上传录音" name="addvideo"
									onclick="uploadFile()">
									<div id="progress" style=" margin-top: 20 " class="progress-bar"></td>			
					</tr>
					<tr>
						
						<th colspan="6" ></th>
						
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
