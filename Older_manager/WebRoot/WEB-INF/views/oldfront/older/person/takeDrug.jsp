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



					<!-- 健康数据开始 -->
					<div class="jksj" style="margin-top:15px;">
						<div class="xy-title">
							用药记录
							<button type="button" class="btn back fr" id="btnclose">返回</button>
						</div>
						<form class="form-inline" role="form">
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
						</form>

						<!-- 添加数据按钮开始 -->
						<button type="button" class="tjsj" data-toggle="modal"
							data-target="#jkda">+添加数据录入</button>
						<!-- 弹出框开始 -->
						<div id="jkda" class="modal fade bs-example-modal-lg"
							tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel"
							aria-hidden="true" style="display: none;">
							<div class="modal-dialog modal-lg">
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal">
											<span aria-hidden="true">×</span> <span class="sr-only">Close</span>
										</button>
										<h4 class="modal-title">添加新数据</h4>
									</div>
									<div class="modal-body">
										<div class="row">
											<div class="col-md-6 col-md-offset-2">
												<form class="form-horizontal " role="form">
													<div class="form-group">
														<label for="" class="col-md-4 control-label">药名：</label>
														<div class="col-md-8" style="padding:0;">
															<input type="text" class="form-control" id="yaoname"
																placeholder="">
														</div>
													</div>
													<div class="form-group">
														<label for="" class="col-md-4 control-label">作用：</label>
														<div class="col-md-8" style="padding:0;">
															<input type="text" class="form-control" id="zuoyong"
																placeholder="">
														</div>
													</div>
													<div class="form-group">
														<label for="" class="col-md-4 control-label">开始日期：</label>
														<input class="easyui-datebox datebox-f combo-f textbox-f"
															editable="false" id="h_kaishi"
															style="width: 280px; height: 30px; display: none;">
													</div>
													<div class="form-group">
														<label for="" class="col-md-4 control-label">结束日期：</label>
														<input class="easyui-datebox datebox-f combo-f textbox-f"
															editable="false" id="h_jieshu"
															style="width: 280px; height: 30px; display: none;"><span
															class="textbox combo datebox"
															style="width: 280px; height: 30px;">
													</div>
													<div class="form-group">
														<label for="" class="col-md-4 control-label">用药剂量：</label>
														<div class="col-md-8" style="padding:0;">
															<input type="text" class="form-control" id="jiliang"
																placeholder="">
														</div>
													</div>
													<div class="form-group ">
														<label for="" class="col-md-4 control-label">使用方法：</label>
														<div class="col-md-3 " style="padding:0;">
															<select class="form-control" id="fangfa">
																<option value="0">口服</option>
																<option value="1">外用</option>

															</select>
														</div>

														<div class="col-md-3 " style="padding:0;">
															<select class="form-control" id="danwei">
																<option value="0">次/天</option>
																<option value="1">次/周</option>
																<option value="2">次/月</option>
															</select>
														</div>
													</div>
													<div class="form-group ">
														<label for="" class="col-md-4 control-label">服用疗程：</label>
														<div class="col-md-8 " style="padding:0;">
															<select class="form-control" id="liaocheng" value="-请选择-">

																<option value="405">两个月</option>
																<option value="404">一个月</option>
																<option value="403">半个月</option>
																<option value="402">一周</option>
															</select>
														</div>
													</div>

												</form>
											</div>
										</div>
									</div>
									<div class="modal-footer">
										<button type="button" class="btn btn-primary" id="save">保存</button>
										<button type="button" class="btn btn-default"
											data-dismiss="modal">关闭</button>

									</div>
								</div>
							</div>
						</div>
						<!-- 弹出框结束 -->
						<!-- 添加数据按钮结束 -->
						<!-- 列表开始 -->
						<table
							class="table table-striped table-bordered table-hover text-center yyjl-table">
							<thead>
								<tr class="xy-head">
									<th class="col-md-3">药名</th>
									<th class="col-md-3">作用</th>
									<th class="col-md-3">时间</th>
									<th class="col-md-3">操作</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>降压0号</td>
									<td>聒血压</td>
									<td>2017-11-06至2017-11-20</td>
									<td>
										<div class="jjda-btn " data-toggle="modal" data-target="#jkda">
											
											<i class="jjda-btn-editer"></i>编辑
										</div>
										<div class="jjda-btn ">
											 
											<i class="jjda-btn-del"></i>删除
										</div>
									</td>
								</tr>
							</tbody>
						</table>
						<nav>
						<ul class="pagination" id="page_list">


							<li class="disabled"><a
								href="http://demo.shecuntong.cn/DynaForm/174/821#">&lt;</a></li>
							<li><a href="http://demo.shecuntong.cn/DynaForm/174/821#">
								 1</a></li>
							<li><a href="http://demo.shecuntong.cn/DynaForm/174/821#">&gt;</a></li>
						</ul>
						</nav>
						<!-- 列表结束 -->
					</div>
					<!-- 健康数据结束 -->


					<!-- 右侧内容区结束 -->
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
