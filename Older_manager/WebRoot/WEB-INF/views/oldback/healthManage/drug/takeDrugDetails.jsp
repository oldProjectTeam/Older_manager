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
					<li><b>位置：健康管理</b>>用药记录
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
					placeholder="请输入老人姓名"> 药品名称： <input type="text"
					class="form-control" id="" placeholder="请输入药品名称"> 药品ID： <input
					type="text" class="form-control" id="" placeholder="请输入药品ID">


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
							<th>药品id</th>
							<th>药品名称</th>
							<th>使用方法</th>
							<th>药品作用</th>
							<th>使用剂量</th>
							<th>开始服用时间</th>
							<th>结束服用时间</th>
							<th class="col-md-3">操作</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><input type="checkbox" class="item_check" /></td>
							<td>1</td>
							<td>罗先生</td>
							<td>111111</td>
							<td>111111</td>
							<td>砒霜</td>
							<td>下雨天吃更配哦</td>
							<td>了却因果早登极乐</td>
							<td>一麻袋</td>
							<td>2017-05-05</td>
							<td>2017-05-06</td>
							<td>
								<button type="button" class="btn btn-sm btn-success update-btn">
									<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
									修改
								</button>
								<button type="button" class="btn btn-sm btn-info vedioview-btn">
									<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
									查看
								</button>
								<button type="button" class="btn btn-sm btn-danger">
									<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
									删除
								</button>
							</td>

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
			window.location.href = "drug/addtakeDrugDetails";
		});
		//修改按钮
		$(".update-btn").click(function() {
			window.location.href = "drug/altertakeDrug";
		});
		//查看按钮
		$(".vedioview-btn").click(function() {
			window.location.href = "drug/selecttakeDrug";
		});
	</SCRIPT>
</body>
</html>
