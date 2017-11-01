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

<title>My JSP 'healthattend.jsp' starting page</title>

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
					<li><b>位置：数据统计</b>>回访计划
				</ol>

			</div>
		</div>

		<!-- 新增按钮 -->

		<div class="row">
			<div class="col-md-4">
				<button type="button" class="btn btn-primary" id="addvedio_btn">
					<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
					新增
				</button>
				<button type="button" class="btn btn-danger">
					<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
					批量删除
				</button>
			</div>
		</div>

		<!--条件查询  -->

		<div class="row form-inline" align="left" style="margin-top:10px;">
			<div class="col-md-12">
				老人姓名： <input type="text" class="form-control" id=""
					placeholder="请输入老人姓名"> 老人ID： <input type="text"
					class="form-control" id="" placeholder="请输入老人ID"> 
					


				<button class="btn btn-default">
					<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
					查询
				</button>
			</div>
		</div>


		<!-- 表格开始 -->
		<DIV class="row" style="margin-top:10px;">
			<div class="col-md-12">
				<table class="table  table-bordered table-hover text-center"
					id="emps_table">
					<thead>
						<tr>

							<th><input type="checkbox" id='check_item_all' /></th>
							<th>#</th>
							<th>老人姓名</th>
							<th>老人id</th>
							<th>计划回访时间</th>
							<th>计划回访事务</th>
							<th>状态</th>
							<th>提醒回访时间</th>
							<th>待提醒事务</th>
							<th>实际回访时间</th>
							<th>实际回访事务</th>
							
							<th>回访记录</th>
							<th>创建时间</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<th><input type="checkbox" class="item_check" /></th>
							<th>1</th>
							<th>罗先生</th>
							<th>111111</th>
							<th>2017-05-05</th>
							<th>推销保健品</th>
							<th>未回访</th>
							<th>2017-05-06</th>
							<th>去访问</th>
							<th>2017-05-05</th>
							<th>问候送礼</th>
							<th>老人很开心</th>
							<th>2017-05-06</th>

							<th>
								<button type="button" class="btn btn-success btn-sm update-btn">
									<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
									修改
								</button>
								<button type="button" class="btn btn-info btn-sm vedioview-btn">
									<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
									查看
								</button>
								<button type="button" class="btn btn-danger btn-sm">
									<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
									删除
								</button>
							</th>

						</tr>
						<tr>
							<th><input type="checkbox" class="item_check" /></th>
							<th>1</th>
							<th>罗先生</th>
							<th>111111</th>
							<th>2017-05-05</th>
							<th>推销保健品</th>
							<th>未回访</th>
							<th>2017-05-06</th>
							<th>去访问</th>
							<th>2017-05-05</th>
							<th>问候送礼</th>
							<th>老人很开心</th>
							<th>2017-05-06</th>
							
						

							<th>
								<button type="button" class="btn btn-success btn-sm update-btn">
									<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
									修改
								</button>
								<button type="button" class="btn btn-info btn-sm vedioview-btn">
									<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
									查看
								</button>
								<button type="button" class="btn btn-danger btn-sm">
									<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
									删除
								</button>
							</th>

						</tr>
						<tr>
							<th><input type="checkbox" class="item_check" /></th>
							<th>1</th>
							<th>罗先生</th>
							<th>111111</th>
							<th>2017-05-05</th>
							<th>推销保健品</th>
							<th>未回访</th>
							<th>2017-05-06</th>
							<th>去访问</th>
							<th>2017-05-05</th>
							<th>问候送礼</th>
							<th>老人很开心</th>
							<th>2017-05-06</th>
							<th>
								<button type="button" class="btn btn-success btn-sm update-btn">
									<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
									修改
								</button>
								<button type="button" class="btn btn-info btn-sm vedioview-btn">
									<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
									查看
								</button>
								<button type="button" class="btn btn-danger btn-sm">
									<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
									删除
								</button>
							</th>

						</tr>
						<tr>
							<th><input type="checkbox" class="item_check" /></th>
							<th>1</th>
							<th>罗先生</th>
							<th>111111</th>
							<th>2017-05-05</th>
							<th>推销保健品</th>
							<th>未回访</th>
							<th>2017-05-06</th>
							<th>去访问</th>
							<th>2017-05-05</th>
							<th>问候送礼</th>
							<th>老人很开心</th>
							<th>2017-05-06</th>

							<th>
								<button type="button" class="btn btn-success btn-sm update-btn">
									<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
									修改
								</button>
								<button type="button" class="btn btn-info btn-sm vedioview-btn">
									<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
									查看
								</button>
								<button type="button" class="btn btn-danger btn-sm">
									<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
									删除
								</button>
							</th>

						</tr>
						<tr>
							<th><input type="checkbox" class="item_check" /></th>
							<th>1</th>
							<th>罗先生</th>
							<th>111111</th>
							<th>2017-05-05</th>
							<th>推销保健品</th>
							<th>未回访</th>
							<th>2017-05-06</th>
							<th>去访问</th>
							<th>2017-05-05</th>
							<th>问候送礼</th>
							<th>老人很开心</th>
							<th>2017-05-06</th>

							<th>

								<button type="button" class="btn btn-success btn-sm update-btn">
									<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
									修改
								</button>
								<button type="button" class="btn btn-info btn-sm vedioview-btn">
									<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
									查看
								</button>
								<button type="button" class="btn btn-danger btn-sm">
									<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
									删除
								</button>
							</th>

						</tr>


					</tbody>
				</table>
			</div>
		</div>
	</div>
	<!-- 尾部 -->
	<div class="col-sm-12">
		<LABEL class="floatlast"> 显示1到5，共10000条记录 </LABEL>
	</div>
	<!-- 分页条 -->
	<div class="col-md-offset-4 col-md-4">
		<nav aria-label="Page navigation">
		<ul class="pagination pagination-lg">
			<li><a href="#" aria-label="Previous"> <span
					aria-hidden="true">&laquo;</span>
			</a></li>
			<li><a href="#">1</a></li>
			<li><a href="#">2</a></li>
			<li><a href="#">3</a></li>
			<li><a href="#">4</a></li>
			<li><a href="#">5</a></li>
			<li><a href="#" aria-label="Next"> <span aria-hidden="true">&raquo;</span>
			</a></li>
		</ul>
		</nav>
	</div>
	<SCRIPT type="text/javascript">
		//全选
		$("#check_item_all").click(function() {
			$(".item_check").prop("checked", $(this).prop("checked"));
		});

		//新增按钮
		$("#addvedio_btn").click(function() {
			window.location.href = "addAttend.html";
		});
		//修改按钮
		$(".update-btn").click(function() {
			window.location.href = "updateAttend.html";
		});
		//查看按钮
		$(".vedioview-btn").click(function() {
			window.location.href = "selectAttend.html";
		});
	</SCRIPT>
</body>
</html>
