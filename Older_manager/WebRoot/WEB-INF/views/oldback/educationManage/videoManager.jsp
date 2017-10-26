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

<body>
	<!--路劲导航  -->
	<div>
		<div class="row">
			<div class="col-md-12">
				<ol class="breadcrumb">
					<li><b>位置：<a
							href="static/oldback/educationManage/educationIndex.html">教育管理</a></b></li>
					<li class="active">视频管理</li>
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
		<div class="row" style="margin-top:5px">
			<div class="col-md-12">
				<form class="form-inline">
					<div class="form-group">
						&nbsp;&nbsp;<label for="exampleInputName2">视频名称</label> <input
							type="text" class="form-control" id="exampleInputName2"
							placeholder="请输入视频名称">
					</div>
					<div class="form-group">
						<label for="exampleInputEmail2">发布者</label> <input type="text"
							class="form-control" id="exampleInputEmail2" placeholder="请输入发布者">
					</div>
					<div class="form-group ">
						<label for="exampleInputEmail2">播放量大于</label> <select
							class="form-control">
							<c:forEach begin="1" end="200" var="s">
								<option value="${s}">${s}</option>
							</c:forEach>
						</select>
					</div>
					<button type="submit" class="btn btn-default">
						<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
						查询
					</button>
				</form>
			</div>
		</div>
		<br>
		<!--视频信息列表  -->
		<div class="row">
			<div class="col-md-12">
				<div class="table-responsive">
					<table class="table table-hover table-bordered text-center">
						<thead>
							<tr class="text-center">
								<td>全选<input type="checkbox" id='check_item_all'></td>
								<td>#</td>
								<td>标题</td>
								<td>副标题</td>
								<td>播放量</td>
								<td>发布人</td>
								<td>发布时间</td>
								<td>操作</td>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td class="text-center"><input type="checkbox"
									class="item_check"></td>
								<td>1</td>
								<td>杀破狼(贪狼) 2017</td>
								<td>别名： 杀破狼·贪狼</td>
								<td>100万</td>
								<td>孝和集团</td>
								<td>2017-10-20 20:22 36</td>
								<td>
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
								</td>
							</tr>
							<tr>
								<td class="text-center"><input type="checkbox"
									class="item_check"></td>
								<td>2</td>
								<td>杀破狼(贪狼) 2017</td>
								<td>别名： 杀破狼·贪狼</td>
								<td>100万</td>
								<td>孝和集团</td>
								<td>2017-10-20 20:22 36</td>
								<td>
									<button type="button" class="btn btn-success btn-sm">
										<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
										修改
									</button>
									<button type="button" class="btn btn-info btn-sm">
										<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
										查看
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
								<td>杀破狼(贪狼) 2017</td>
								<td>别名： 杀破狼·贪狼</td>
								<td>100万</td>
								<td>孝和集团</td>
								<td>2017-10-20 20:22 36</td>
								<td>
									<button type="button" class="btn btn-success btn-sm">
										<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
										修改
									</button>
									<button type="button" class="btn btn-info btn-sm">
										<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
										查看
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
								<td>杀破狼(贪狼) 2017</td>
								<td>别名： 杀破狼·贪狼</td>
								<td>100万</td>
								<td>孝和集团</td>
								<td>2017-10-20 20:22 36</td>
								<td>
									<button type="button" class="btn btn-success btn-sm">
										<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
										修改
									</button>
									<button type="button" class="btn btn-info btn-sm">
										<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
										查看
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

	<script type="text/javascript">
		//全选
		$("#check_item_all").click(function() {
			$(".item_check").prop("checked", $(this).prop("checked"));
		});

		//新增按钮
		$("#addvedio_btn")
				.click(
						function() {
							window.location.href = "static/oldback/educationManage/addvedio.jsp";
						});
		//修改按钮
		$(".update-btn")
				.click(
						function() {
							window.location.href = "static/oldback/educationManage/updatevedio.jsp";
						});
		//查看按钮
		$(".vedioview-btn")
				.click(
						function() {
							window.location.href = "static/oldback/educationManage/vedioview.jsp";
						});
	</script>
</body>
</html>
