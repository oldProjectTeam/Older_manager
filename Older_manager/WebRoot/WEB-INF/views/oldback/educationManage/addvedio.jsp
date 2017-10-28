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
	<!--路劲导航  -->
	<div class="row">
		<div class="col-md-12">
			<ol class="breadcrumb">
				<li><b>位置：<a
						href="static/oldback/educationManage/educationIndex.html">教育管理</a></b></li>
				<li class="active">新增视频</li>
			</ol>
		</div>
	</div>
	<!--主体  -->
	<div class="row">
		<div class="col-md-12">
			<form class="form-horizontal">
				<div class="table-responsive">
					<table class="table table-bordered table-striped text-center">
						<tbody>
							<tr>
								<td>标题</td>
								<td class="col-xs-2"><input type="text"
									class="form-control" required="required"></td>
								<td>副标题</td>
								<td class="col-xs-2"><input type="text"
									class="form-control" required="required"></td>
								<td>创作人</td>
								<td class="col-xs-2"><input type="text"
									class="form-control"></td>
								<td rowspan="3" class="active" style="padding-top:50px">图片:</td>
								<td rowspan="3" class="col-xs-2"><input
									class="btn btn-default" type="button" value="图片管理"></td>
							</tr>
							<tr>
								<td>视频描述</td>
								<td><textarea class="form-control" rows="3"></textarea></td>
								<td>导演</td>
								<td><input type="text" class="form-control"></td>
								<td>制作者</td>
								<td><input type="text" class="form-control"></td>
							</tr>
							<tr>
								<td>版权</td>
								<td><input type="text" class="form-control"></td>
								<td>内容提供商</td>
								<td><input type="text" class="form-control"></td>
								<td>发布年份</td>
								<td><input type="date" class="form-control"></td>
							</tr>
							<tr>
								<td>备注</td>
								<td><textarea class="form-control" rows="3"></textarea></td>
								<td>长度</td>
								<td><input type="text" class="form-control"
									required="required"></td>
								<td>帧高度</td>
								<td><input type="text" class="form-control"></td>
								<td colspan="2"><input type="file" class="form-control"
									required="required"> <input class="btn btn-success"
									type="button" value="上传视频"></td>
							</tr>
							<tr>
								<td>标记</td>
								<td><input type="text" class="form-control"></td>
								<td>数据速率</td>
								<td>
									<div class="form-group">
										<div class="col-sm-8">
											<input type="text" class="form-control">
										</div>
										<label class="col-sm-1 control-label">kbps</label>
									</div>
								</td>
								<td>总比特率</td>
								<td>
									<div class="form-group">
										<div class="col-sm-8">
											<input type="text" class="form-control">
										</div>
										<label class="col-sm-1 control-label">kbps</label>
									</div>
								</td>
								<td>帧速率</td>
								<td>
									<div class="form-group">
										<div class="col-sm-7">
											<input type="text" class="form-control">
										</div>
										<label class="col-sm-4 control-label">帧/秒</label>
									</div>
								</td>
							</tr>

							<tr>
								<td>频道</td>
								<td><input type="text" class="form-control"></td>
								<td>音频采样频率</td>
								<td>
									<div class="form-group">
										<div class="col-sm-8">
											<input type="text" class="form-control">
										</div>
										<label class="col-sm-1 control-label">kHz</label>
									</div>
								</td>
								<td>比特率</td>
								<td>
									<div class="form-group">
										<div class="col-sm-8">
											<input type="text" class="form-control">
										</div>
										<label class="col-sm-1 control-label">kbps</label>
									</div>
								</td>
								<td>帧宽度</td>
								<td><input type="text" class="form-control"></td>
							</tr>
							<tr>
								<td colspan="8"><input type="hidden" class="form-control"
									name="promulgator">
									<button type="button" class="btn btn-primary">保存</button>
									<button type="button" class="btn btn-info"
										onClick="javascript :history.back(-1);">返回</button></td>
							</tr>
						</tbody>

					</table>
				</div>
			</form>
		</div>
	</div>
</body>
</html>
