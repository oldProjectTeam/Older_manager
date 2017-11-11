<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; charset=utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
	src="${APP_PATH}/static/js/jquery-3.2.1.min.js"></script>
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
				<li><b>位置：教育管理</b></li>
				<li><b>视频管理</b></li>
				<li class="active">查看视频</li>
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
								<td class="col-xs-2">${video.title}</td>
								<td>副标题</td>
								<td class="col-xs-2">${video.subtitle}</td>
								<td>创作人</td>
								<td class="col-xs-2">${video.creators}</td>
								<td rowspan="3" class="active">视频</td>
								<td rowspan="3" class="col-xs-3"><video src="${video.path}" controls="controls"
										class="img-responsive" /> 您的浏览器不支持 video 标签。</td>
							</tr>
							<tr>
								<td>视频描述</td>
								<td><!-- <textarea class="form-control" rows="3"></textarea> --></td>
								<td>导演</td>
								<td>${video.director}</td>
								<td>制作者</td>
								<td>${video.producer}</td>
							</tr>
							<tr>
								<td>版权</td>
								<td>${video.copyright}</td>
								<td>内容提供商</td>
								<td>${video.contentprovider}</td>
								<td>发布时间</td>
								
								<td><fmt:formatDate value="${Course.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/> </td>
							</tr>
							<tr>
								<td>备注</td>
								<td>${video.remark}</td>
								<td>长度</td>
								<td>${video.lenght}</td>
								<td>帧高度</td>
								<td>${video.frameheight}</td>
								<td colspan="2">视频路径：<br> ${video.path}
								</td>
							</tr>
							<tr>
								<td>标记</td>
								<td>${video.marking}</td>
								<td>数据速率</td>
								<td>
									<div class="form-group">
										<div class="col-sm-8">
											${video.daterate}
										</div>
										<label class="col-sm-1 control-label">kbps</label>
									</div>
								</td>
								<td>总比特率</td>
								<td>
									<div class="form-group">
										<div class="col-sm-8">
											${video.totalbitrate}
										</div>
										<label class="col-sm-1 control-label">kbps</label>
									</div>
								</td>
								<td>帧速率</td>
								<td>
									<div class="form-group">
										<div class="col-sm-7">
											${video.framerate}
										</div>
										<label class="col-sm-4 control-label">帧/秒</label>
									</div>
								</td>
							</tr>

							<tr>
								<td>频道</td>
								<td>${video.channel}</td>
								<td>音频采样频率</td>
								<td>
									<div class="form-group">
										<div class="col-sm-8">
											${video.afsf}
										</div>
										<label class="col-sm-1 control-label">kHz</label>
									</div>
								</td>
								<td>比特率</td>
								<td>
									<div class="form-group">
										<div class="col-sm-8">
											${video.bitrate}
										</div>
										<label class="col-sm-1 control-label">kbps</label>
									</div>
								</td>
								<td>帧宽度</td>
								<td>${video.framewidth}</td>
							</tr>
							<tr>
								<td colspan="8">
									<button type="button" class="btn btn-info"
										onClick="javascript :history.back(-1);">返回</button>
								</td>
							</tr>
						</tbody>

					</table>
				</div>
			</form>
		</div>
	</div>
</body>
</html>
