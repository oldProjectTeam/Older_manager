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
							就诊记录
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
											<div class="col-md-12">
												<form id="formid">
													<table class="table table-bordered table-hover text-center">
														<tr class="active">
															<td class="col-sm-2"><font color="red">*</font>老人姓名:</td>
															<td class="col-sm-2">张三</td>
															<td class="col-sm-2"><font color="red">*</font>就诊医院:</td>
															<td class="col-sm-2"><input type="text"
																class="form-control" name="hospital" id="hospital"></td>
															<td class="col-sm-2"><font color="red">*</font>就诊科室:</td>
															<td class="col-sm-2"><input type="text"
																class="form-control" name="department" id="department"></td>
														</tr>
														<tr>
															<td><font color="red">*</font>医生姓名:</td>
															<td class="col-sm-2"><input type="text"
																class="form-control" id="doctor" name="doctor"></td>
															<td><font color="red">*</font>就诊时间:</td>
															<td class="col-sm-2"><input
																class="easyui-datebox datebox-f combo-f textbox-f"
																editable="false" id="h_kaishi"
																style="width:150px; height: 30px; display: none;"></td>
															<td><font color="red">*</font>复诊时间:</td>
															<td class="col-sm-2"><input
																class="easyui-datebox datebox-f combo-f textbox-f"
																editable="false" id="h_kaishi"
																style="width: 150px; height: 30px; display: none;"></td>
														</tr>
														<tr class="active">
															<td class=""><font color="red">*</font>主诉内容:</td>
															<td colspan="2"><textarea class="form-control"
																	rows="2" name="medicalrecord1" id="medicalrecord1"></textarea></td>
															<td><font color="red">*</font>体格检查内容:</td>
															<td colspan="2"><textarea class="form-control"
																	rows="2" name="chekcontent" id="chekcontent"></textarea></td>
														</tr>
														<tr>
															<td>辅助检查内容:</td>
															<td colspan="2"><textarea class="form-control"
																	rows="2" name="ancillarycheckcontent"></textarea></td>
															<td><font color="red">*</font>实际检查内容:</td>
															<td colspan="2"><textarea class="form-control"
																	rows="2" name="realcheckcontent" id="realcheckcontent"></textarea></td>
														</tr>
														<tr class="active">
															<td><font color="red">*</font>正常使用药物:</td>
															<td colspan="2"><textarea class="form-control"
																	rows="2" name="normalusedrug" id="normalusedrug"></textarea></td>
															<td><font color="red">*</font>本次诊断结果:</td>
															<td colspan="2"><textarea class="form-control"
																	rows="2" name="diagnosis" id="diagnosis"></textarea></td>
														</tr>
														<tr>
															<td width="180"><font color="red">*</font>治疗处方和保健处方:</td>
															<td colspan="2"><textarea class="form-control"
																	rows="2" name="treatmentcareprescription"
																	id="treatmentcareprescription"></textarea></td>
															<td>相关禁忌事项:</td>
															<td colspan="2"><textarea class="form-control"
																	rows="2" name="tabooltems"></textarea></td>
														</tr>
													</table>
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
									<th class="col-md-2">就诊时间</th>
									<th class="col-md-3">就诊医院</th>
									<th class="col-md-2">就诊科室</th>
									<th class="col-md-2">医生名称</th>
									<th class="col-md-3">操作</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>2017-11-06</td>
									<td>华夏医院</td>
									<td>B超</td>
									<td>12222</td>
									<td>
										<div class="jjda-btn" data-toggle="modal" data-target="#jkda">											>
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
							<li class="disabled"><a href="#">&lt;</a></li>
							<li><a href="#">1</a></li>
							<li><a href="#">&gt;</a></li>
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
