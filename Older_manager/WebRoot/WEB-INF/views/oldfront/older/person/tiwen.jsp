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

<title>老人管理平台-用户自助中心</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="${APP_PATH}/static/oldfront/older/css/easyui.css"
	rel="stylesheet" type="text/css">
<link href="${APP_PATH}/static/oldfront/older/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${APP_PATH}/static/oldfront/older/css/layout.css"
	rel="stylesheet">
<link href="${APP_PATH}/static/oldfront/older/css/default.css"
	rel="stylesheet">
<link href="${APP_PATH}/static/oldfront/older/css/icon.css"
	rel="stylesheet">

<script src="${APP_PATH}/static/oldfront/older/js/jquery.js"></script>
<script src="${APP_PATH}/static/oldfront/older/js/json2.js"></script>
<script src="${APP_PATH}/static/oldfront/older/js/jquery.cookie.js"></script>
<script src="${APP_PATH}/static/oldfront/older/js/jquery.easyui.js"></script>
<script src="${APP_PATH}/static/oldfront/older/js/easyui-lang-zh_CN.js"></script>
<script src="${APP_PATH}/static/oldfront/older/js/KingonUI.js"></script>
</head>
<body style="overflow:auto;" class="layout panel-noscroll">
	<!--头部开始  -->
	<jsp:include page="header.jsp"></jsp:include>
	<!-- 主体部分开始 -->
	<div style="padding:111px 0 0;margin-bottom:15px;">
		<div class="container">
			<div class="row">
				<!-- 左侧导航菜单开始 -->
				<jsp:include page="left.jsp"></jsp:include>
				<!-- 左侧导航菜单结束 -->

				<!-- 右侧内容区开始 -->
				<div class="col-md-9" style="background:#fff;min-height:647px;">


					<div style="padding-top: 10px;">
						<!-- 健康数据开始 -->
						<div class="jksj">
							<div class="xy-title">
								<span id="PersonName"></span> 体温
								<button type="button" class="btn back fr" id="btnclose">返回</button>
							</div>
							<div>
								<div class="form-group col-md-5">
									<label for="" class="control-label">开始时间：</label> <input
										class="easyui-datebox datebox-f combo-f textbox-f"
										editable="false" id="h_Time1"
										style="width: 180px; height: 30px; display: none;">
								</div>
								<div class="form-group col-md-5">
									<label for="" class="control-label">结束时间：</label> <input
										class="easyui-datebox datebox-f combo-f textbox-f"
										editable="false" id="h_Time2"
										style="width: 180px; height: 30px; display: none;">
								</div>

								<button id="chaxun" class="btn btn-success col-md-2">查询</button>

							</div>

							<!-- 图表开始 -->
							<div class="row" style="margin-top:30px;">
								<div class="col-md-12">
									<div style="width:100%;height:450px;">
										<div id="main"
											style="height: 450px; -webkit-tap-highlight-color: transparent; user-select: none; background-color: rgba(0, 0, 0, 0); cursor: default;"
											_echarts_instance_="1511232649999">
											<div
												style="position: relative; overflow: hidden; width: 848px; height: 450px;">

											</div>
										</div>
										<!-- 引入图表-->
									</div>
								</div>
								<!--<div class="col-md-6"><div style="width:100%;height:300px;background:#13c0ab">图表</div></div>-->
							</div>
							<!-- 图表结束 -->
							<!-- 添加数据按钮开始 -->
							<!-- <button type="button" class="tjsj" id="add">+添加数据录入</button>-->


							<!-- 添加数据按钮结束 -->
							<!-- 列表开始 -->
							<table
								class="table table-striped table-bordered table-hover text-center"
								id="tablecontent">
								<thead>
									<tr class="xy-head firstRow">
										<th style="width:20%">日期</th>
										<th style="width:20%">体温</th>

										<th style="width:20%">测试状况</th>
									</tr>
								</thead>
								<tbody id="shuju">
									<tr style="height:40px">
										<td>2017-11-14 17:31</td>
										<td>39</td>
										<td>中等度热</td>
									</tr>
								</tbody>
							</table>
							<!-- 列表结束 -->
						</div>
						<!-- 健康数据结束 -->
					</div>
				</div>
			</div>
<!--底部开始  -->
<jsp:include page="footer.jsp"></jsp:include>
<!-- 底部结束 -->
<script src="${APP_PATH}/static/oldfront/older/js/bootstrap.js"></script>
<script src="${APP_PATH}/static/oldfront/older/js/bootstrap.min.js"></script>
<script src="${APP_PATH}/static/oldfront/older/js/TableJS.js"
	type="text/javascript"></script>
<script src="${APP_PATH}/static/oldfront/older/js/md5.js"></script>
</body>
</html>
