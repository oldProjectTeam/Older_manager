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
							我的活动
							<button type="button" class="btn back fr" id="btnclose">返回</button>
						</div>
						<form class="form-inline" role="form">
							<div class="form-group col-md-5">
								<label for="" class="control-label">活动开始时间：</label> <input
									class="easyui-datebox datebox-f combo-f textbox-f"
									editable="false" id="h_Time1"
									style="width: 180px; height: 30px; display: none;">
							</div>
							<div class="form-group col-md-5">
								<label for="" class="control-label">活动结束时间：</label> <input
									class="easyui-datebox datebox-f combo-f textbox-f"
									editable="false" id="h_Time2"
									style="width: 180px; height: 30px; display: none;">
							</div>
							<button id="chaxun" class="btn btn-success col-md-2">查询</button>
						</form>



						<!-- 查看活动详细弹出框开始 -->
						<div id="jkda" class="modal fade bs-example-modal-lg"
							tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel"
							aria-hidden="true" style="display: none;">
							<div class="modal-dialog modal-lg">
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal">
											<span aria-hidden="true">×</span> <span class="sr-only">Close</span>
										</button>
										<h4 class="modal-title">查看活动详细</h4>
									</div>
									<div class="modal-body">
										<div class="row">
											<div class="col-md-10 col-md-offset-1">
												<div class="panel panel-default">
													<!-- Table -->
													<table class="table table-bordered">
														<tr>
															<td>活动标题</td>
															<td id="title">老人故宫一日游</td>
														</tr>
														<tr>
															<td>活动时间</td>
															<td id="activitytime">2017-10-20</td>
														</tr>
														<tr>
															<td>活动地点</td>
															<td id="place">故宫</td>
														</tr>
														<tr>
															<td>活动状态</td>
															<td id="state">结束</td>
														</tr>
														<tr>
															<td>发布时间</td>
															<td id="releasetime">2017-10-20</td>
														</tr>
														<tr>
															<td>发布人</td>
															<td id="releasepeople">孝和集团</td>
														</tr>

													</table>
													<div class="panel-heading">活动简介</div>
													<div class="panel-body">
														<p id="content">胶东在线11月20日讯(通讯员 赵中妹)
															农历九月初九是我国古老的传统节日之一，古人把“九九相重”叫重阳节，我国把农历九月初九定为“老人节”，将传统与现代巧妙地结合，成为尊老、爱老、助老的“老人节”。长岛县第一实验学校家委会利用周末组织策划了“情浓重阳，礼敬老人”的主题活动。
															让孩子们走进情感世界，感受长辈对自己的爱，并把长辈的爱“迁移”身边每一位老人和敬老院的老人，感受与老人一起的快乐，同时让老人们享受到被关怀的快乐，让老人为孩子的成长感到欣慰与骄傲。
															通过开展礼敬老人的活动，激发孩子们关爱老人、孝敬老人的情感，培养孩子们关心老人、敬重老人的良好品质，弘扬了中华民族尊老敬老的优良传统。
														</p>
													</div>
													<img id="img" src="images/bmfw.png" width="200"
														height="150">
												</div>
											</div>
										</div>
									</div>
									<div class="modal-footer">

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
									<th class="col-md-2">活动名称</th>
									<th class="col-md-2">发部人</th>
									<th class="col-md-2">报名时间</th>
									<th class="col-md-2">活动时间</th>
									<th class="col-md-2">是否到场</th>
									<th class="col-md-2">操作</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>老人故宫一日游</td>
									<td>孝和集团</td>
									<td>2017-10-20</td>
									<td>2017-11-1</td>
									<td>是</td>
									<td>
										<div class="jjda-btn" data-toggle="modal" data-target="#jkda">
											 
											<i class="jjda-btn-view"></i>活动详细
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
