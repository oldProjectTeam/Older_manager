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

<title>My JSP 'healthInfo.jsp' starting page</title>

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
					<li><b>位置：健康管理</b>>基本健康信息
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
					placeholder="请输入老人姓名"> 症状： <input type="text"
					class="form-control" id="" placeholder="请输入症状">



				<button class="btn btn-default">
					<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
					查询
				</button>
			</div>
		</div>

		<!-- 表格 -->
		<div class="row" style="margin-top:10px">
			<div class="col-md-12">
				<table class="table table-bordered table-hover">
					<tr>

						<th><input type="checkbox" id='check_item_all' /></th>
						<th>#</th>
						<th>老人姓名</th>
						<th>体温</th>
						<th>症状</th>
						<th>脉率</th>
						<th>呼吸频率</th>
						<th>体质指数</th>
						<th>操作</th>
					</tr>
					<tr>

						<th><input type="checkbox" id='check_item_all' /></th>
						<th>1</th>
						<th>罗先生</th>
						<th>200</th>
						<th>高烧</th>
						<th>500</th>
						<th>500</th>
						<th>500</th>
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

						<th><input type="checkbox" id='check_item_all' /></th>
						<th>2</th>
						<th>罗先生</th>
						<th>200</th>
						<th>高烧</th>
						<th>500</th>
						<th>500</th>
						<th>500</th>
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

						<th><input type="checkbox" id='check_item_all' /></th>
						<th>3</th>
						<th>罗先生</th>
						<th>200</th>
						<th>高烧</th>
						<th>500</th>
						<th>500</th>
						<th>500</th>
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

						<th><input type="checkbox" id='check_item_all' /></th>
						<th>4</th>
						<th>罗先生</th>
						<th>200</th>
						<th>高烧</th>
						<th>500</th>
						<th>500</th>
						<th>500</th>
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

						<th><input type="checkbox" id='check_item_all' /></th>
						<th>5</th>
						<th>罗先生</th>
						<th>200</th>
						<th>高烧</th>
						<th>500</th>
						<th>500</th>
						<th>500</th>
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


				</table>
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
	</div>
	<SCRIPT type="text/javascript">
		//全选
		$("#check_item_all").click(function() {
			$(".item_check").prop("checked", $(this).prop("checked"));
		});

		//新增按钮
		$("#addvedio_btn").click(function() {
			window.location.href = "health/addhealthInfo";
		});
		//修改按钮
		$(".update-btn").click(function() {
			window.location.href = "health/updateAttend";
		});
		//查看按钮
		$(".vedioview-btn").click(function() {
			window.location.href = "health/selectAttend";
		});
	</SCRIPT>
</body>
</html>
