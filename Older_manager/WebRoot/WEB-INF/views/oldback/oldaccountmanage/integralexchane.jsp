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
							href="static/oldback/oldaccountmanage/accountManageindex.html">老人账户管理</a></b></li>
					<li class="active">积分管理</li>
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
						<label>&nbsp;&nbsp;老人姓名</label> <input type="text"
							class="form-control" placeholder="请输入老人姓名">
					</div>
					<div class="form-group">
						<label>变动时间</label> <input type="date" class="form-control">
					</div>
					<div class="form-group">
						<label>到</label> <input type="date" class="form-control">
					</div>
					<button type="submit" class="btn btn-default">
						<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
						查询
					</button>
				</form>
			</div>
		</div>
		<br>
		<!--礼品兑换信息列表  -->
		<div class="row">
			<div class="col-md-12">
				<div class="table-responsive">
					<table class="table table-hover table-bordered text-center">
						<thead>
							<tr class="text-center">
								<td><input type="checkbox" id='integral_all_check'></td>
								<td>#</td>
								<td>老人姓名</td>
								<td>所属服务点</td>
								<td>联系地址</td>
								<td>变动前积分</td>
								<td>当前积分</td>
								<td>变动积分</td>
								<td>操作详情</td>
								<td>变动时间</td>
								<td>操作</td>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td class="text-center"><input type="checkbox"
									class="integral_item_check"></td>
								<td>1</td>
								<td>张三</td>
								<td>孝和集团</td>
								<td>北京王府井</td>
								<td>100</td>
								<td>80</td>
								<td>20</td>
								<td>兑换新大米 数量：2</td>
								<td>2017-10-20</td>
								<td>
									<button type="button" class="btn btn-danger btn-sm">
										<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
										删除
									</button>
								</td>
							</tr>
							<tr>
								<td class="text-center"><input type="checkbox"
									class="integral_item_check"></td>
								<td>2</td>
								<td>张三</td>
								<td>孝和集团</td>
								<td>北京王府井</td>
								<td>100</td>
								<td>80</td>
								<td>20</td>
								<td>兑换新大米 数量：2</td>
								<td>2017-10-20</td>
								<td>
									<button type="button" class="btn btn-danger btn-sm">
										<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
										删除
									</button>
								</td>
							</tr>
							<tr>
								<td class="text-center"><input type="checkbox"
									class="integral_item_check"></td>
								<td>3</td>
								<td>张三</td>
								<td>孝和集团</td>
								<td>北京王府井</td>
								<td>100</td>
								<td>80</td>
								<td>20</td>
								<td>兑换新大米 数量：2</td>
								<td>2017-10-20</td>
								<td>
									<button type="button" class="btn btn-danger btn-sm">
										<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
										删除
									</button>
								</td>
							</tr>
							<tr>
								<td class="text-center"><input type="checkbox"
									class="integral_item_check"></td>
								<td>4</td>
								<td>张三</td>
								<td>孝和集团</td>
								<td>北京王府井</td>
								<td>100</td>
								<td>80</td>
								<td>20</td>
								<td>兑换新大米 数量：2</td>
								<td>2017-10-20</td>
								<td>
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
		//显示信息全选
		$("#integral_all_check").click(function() {
			$(".integral_item_check").prop("checked", $(this).prop("checked"));
		});
	</script>
</body>
</html>
