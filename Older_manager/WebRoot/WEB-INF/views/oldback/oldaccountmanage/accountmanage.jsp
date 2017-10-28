<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta name="keywords" content="keyword1,keyword2,keyword3">
<meta name="description" content="this is my page">
<meta name="content-type" content="text/html; charset=UTF-8">

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
	<div>
		<div class="row">
			<div class="col-md-12">
				<ol class="breadcrumb">
					<li><b>位置：<a
							href="static/oldback/oldaccountmanage/accountManageindex.html">老人账户管理</a></b></li>
					<li class="active">老人账户列表</li>
				</ol>
			</div>
		</div>
	</div>
	<!--内容 -->
	<div>
		<!--操作按钮  -->
		<div class="row">
			<div class="col-md-6">
				&nbsp;
				<button type="button" class="btn btn-primary"
					id="add_old_account_btn">
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
		<div class="row" style="margin-top:5px">
			<div class="col-md-12">
				<form class="form-inline">
					<div class="form-group">
						&nbsp;&nbsp;<label for="exampleInputName2">老人名字</label> <input
							type="text" class="form-control" id="exampleInputName2"
							placeholder="请输入老人名字">
					</div>
					<div class="form-group">
						<label for="exampleInputEmail2">登录账户</label> <input type="text"
							class="form-control" id="exampleInputEmail2"
							placeholder="请输入登录账户">
					</div>
					<button type="submit" class="btn btn-default">
						<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
						查询
					</button>
				</form>
			</div>
		</div>
		<br>
		<!--账户信息列表  -->
		<div class="row">
			<div class="col-md-12">
				<div class="table-responsive">
					<table class="table table-hover table-bordered text-center">
						<thead>
							<tr class="text-center">
								<td><input type="checkbox" id='check_item_all'></td>
								<td>#</td>
								<td>老人姓名</td>
								<td>登录账户</td>
								<td>最近登录时间</td>
								<td>最近登录IP</td>
								<td>服务状态</td>
								<td>登录次数</td>
								<td>操作</td>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td class="text-center"><input type="checkbox"
									class="item_check"></td>
								<td>1</td>
								<td>李大伟</td>
								<td>18208546963</td>
								<td>2017-10-21 12:22 33</td>
								<td>192.168.0.1</td>
								<td>正在服务</td>
								<td>100</td>
								<td>
									<button type="button" class="btn btn-success btn-sm">
										<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
										密码重置
									</button>
									<button type="button" class="btn btn-danger btn-sm">
										<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
										删除
									</button>
								</td>
							</tr>
							<tr>
								<td class="text-center"><input type="checkbox"
									class="item_check"></td>
								<td>2</td>
								<td>李大伟</td>
								<td>18208546963</td>
								<td>2017-10-21 12:22 33</td>
								<td>192.168.0.1</td>
								<td>正在服务</td>
								<td>100</td>
								<td>
									<button type="button" class="btn btn-success btn-sm">
										<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
										密码重置
									</button>
									<button type="button" class="btn btn-danger btn-sm">
										<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
										删除
									</button>
								</td>
							</tr>
							<tr>
								<td class="text-center"><input type="checkbox"
									class="item_check"></td>
								<td>3</td>
								<td>李大伟</td>
								<td>18208546963</td>
								<td>2017-10-21 12:22 33</td>
								<td>192.168.0.1</td>
								<td>正在服务</td>
								<td>100</td>
								<td>
									<button type="button" class="btn btn-success btn-sm">
										<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
										密码重置
									</button>
									<button type="button" class="btn btn-danger btn-sm">
										<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
										删除
									</button>
								</td>
							</tr>
							<tr>
								<td class="text-center"><input type="checkbox"
									class="item_check"></td>
								<td>4</td>
								<td>李大伟</td>
								<td>18208546963</td>
								<td>2017-10-21 12:22 33</td>
								<td>192.168.0.1</td>
								<td>正在服务</td>
								<td>100</td>
								<td>
									<button type="button" class="btn btn-success btn-sm">
										<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
										密码重置
									</button>
									<button type="button" class="btn btn-danger btn-sm">
										<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
										删除
									</button>
								</td>
							</tr>
						</tbody>
						<thead>
					</table>
				</div>
			</div>
		</div>
		<!--分页信息  -->
		<div class="row">
			<div class="col-md-7">&nbsp;&nbsp;当前第1页，共20页，总计100条记录</div>
			<div class="col-md-4 col-md-offset-1">
				<nav aria-label="Page navigation">
					<ul class="pagination">
						<li><a href="#">首页 </a></li>
						<li><a href="#" aria-label="Previous"> <span
								aria-hidden="true">&laquo;</span>
						</a></li>
						<li class="active"><a href="#">1</a></li>
						<li><a href="#">2</a></li>
						<li><a href="#">3</a></li>
						<li><a href="#">4</a></li>
						<li><a href="#">5</a></li>
						<li><a href="#" aria-label="Next"> <span
								aria-hidden="true">&raquo;</span>
						</a></li>
						<li><a href="#">末页 </a></li>
					</ul>
				</nav>
			</div>
		</div>
	</div>

	<!--新增账户模态框  -->
	<div class="modal fade" tabindex="-1" role="dialog"
		id="add_old_account_modal">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">新增老人账户</h4>
				</div>
				<div class="modal-body">
					<table class="table table-striped table-bordered text-center">
						<tr>
							<td colspan="4">
								<form class="form-inline">
									<div class="form-group">
										&nbsp;&nbsp;<label for="exampleInputName2">老人姓名</label> <input
											type="text" class="form-control" placeholder="请输入老人姓名">
									</div>
									<button type="submit" class="btn btn-default">
										<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
										查询
									</button>
								</form>
							</td>
						</tr>
						<tr>
							<td><input type="checkbox" id="add_all_check"></td>
							<td>老人姓名</td>
							<td>联系电话</td>
							<td>默认密码</td>
						</tr>
						<tr>
							<td><input type="checkbox" class="add_item_check"></td>
							<td>张三</td>
							<td>18258956213</td>
							<td>123456</td>
						</tr>
						<tr>
							<td><input type="checkbox" class="add_item_check"></td>
							<td>张三</td>
							<td>18258956213</td>
							<td>123456</td>
						</tr>
						<tr>
							<td><input type="checkbox" class="add_item_check"></td>
							<td>张三</td>
							<td>18258956213</td>
							<td>123456</td>
						</tr>
						<tr>
							<td><input type="checkbox" class="add_item_check"></td>
							<td>张三</td>
							<td>18258956213</td>
							<td>123456</td>
						</tr>
					</table>
					<nav aria-label="Page navigation">
						<ul class="pager">
							<li class="previous"><a href="#"><span
									aria-hidden="true">&larr;</span>上一页</a></li>
							<li class="next"><a href="#">下一页<span aria-hidden="true">&rarr;</span></a></li>
						</ul>
					</nav>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary">确定</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<!-- /.modal -->
	<script type="text/javascript">
		//显示信息全选
		$("#check_item_all").click(function() {
			$(".item_check").prop("checked", $(this).prop("checked"));
		});

		//新增账户全选
		$("#add_all_check").click(function() {
			$(".add_item_check").prop("checked", $(this).prop("checked"));
		});

		//新增账户按钮
		$("#add_old_account_btn").click(function() {
			$("#add_old_account_modal").modal({
				backdrop : "static"
			});
		});
	</script>
</body>
</html>
