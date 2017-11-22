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
							我的课程
							<button type="button" class="btn back fr"
								onclick="javascript:history.go(-1)">返回</button>
						</div>
						<form class="form-inline" role="form">
							<div class="form-group col-md-5">
								<label for="" class="control-label">课程开始时间：</label> <input
									class="easyui-datebox datebox-f combo-f textbox-f"
									editable="false" id="h_Time1"
									style="width: 180px; height: 30px; display: none;">
							</div>
							<div class="form-group col-md-5">
								<label for="" class="control-label">课程结束时间：</label> <input
									class="easyui-datebox datebox-f combo-f textbox-f"
									editable="false" id="h_Time2"
									style="width: 180px; height: 30px; display: none;">
							</div>
							<button id="chaxun" class="btn btn-success col-md-2">查询</button>
						</form>

						 
						<!-- 弹出框结束 -->

						<!--我的课程详细模态框开始-->
						<div class="modal fade bs-example-modal-lg" tabindex="-1"
							role="dialog" id="courseenrol_view_modal">
							<div class="modal-dialog modal-lg" role="document">
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal"
											aria-label="Close">
											<span aria-hidden="true">&times;</span>
										</button>
										<h4 class="modal-title">我的课程详细信息</h4>
									</div>
									<div class="modal-body">
										<form class="form-horizontal">
											<table id="courseenrol_view_table"
												class="table table-striped table-bordered text-center">
												<tr>
													<td>课程名称</td>
													<td id="courseTitle1"></td>
													<td>老人姓名</td>
													<td id="oldManName1"></td>
													<td>联系电话</td>
													<td id="oldManphone1"></td>
												</tr>
												<tr>
													<td>课程完成情况</td>
													<td id="coursecompletion1"></td>
													<td>成绩</td>
													<td id="grade1"></td>
													<td colspan="2">上课风采</td>
												</tr>
												<tr>
													<td>评价等级</td>
													<td id="rating1"></td>
													<td>正常上课</td>
													<td id="isnormalclass1"></td>
													<td colspan="2" rowspan="3"><img class="img-rounded"
														id="img1" width="150" height="150"></td>
												</tr>
												<tr>
													<td>报名时间</td>
													<td id="timeStr1"></td>
													<td>报名状态</td>
													<td id="enrolstate1"></td>
												</tr>
												<tr>
													<td>备注</td>
													<td colspan="3" id="remark1"></td>
												</tr>
											</table>
										</form>
									</div>
									<div class="modal-footer">
										<button type="button" class="btn btn-default"
											data-dismiss="modal">关闭</button>
									</div>
								</div>
								<!-- /.modal-content -->
							</div>
							<!-- /.modal-dialog -->
						</div>

						<!--我的课程详细模态框结束-->

						<!-- 添加数据按钮结束 -->
						<!-- 列表开始 -->
						<table
							class="table table-striped table-bordered table-hover text-center yyjl-table">
							<thead>
								<tr class="xy-head">
									<th class="col-md-2">课程名称</th>
									<th class="col-md-2">讲师</th>
									<th class="col-md-2">开课时间</th>
									<th class="col-md-2">报名时间</th>
									<th class="col-md-2">报名状态</th>
									<th class="col-md-2">操作</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td><a href="${APP_PATH}/older/course_detail"> <font color="green">java后端开发</font></a>
									</td>
									<td>罗先生</td>
									<td>2017-10-20</td>
									<td>2017-11-1</td>
									<td>报名成功</td>
									<td>
										<div class="jjda-btn" data-toggle="modal"
											data-target="#courseenrol_view_modal">
											
											<i class="jjda-btn-view"></i>课程详细
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
