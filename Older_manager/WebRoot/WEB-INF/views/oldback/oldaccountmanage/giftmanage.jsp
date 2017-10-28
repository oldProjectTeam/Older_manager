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
					<li class="active">老人礼品管理</li>
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
				<button type="button" class="btn btn-primary" id="add_gift_btn">
					<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
					新增礼品
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
						&nbsp;&nbsp;<label>礼品名称</label> <input type="text"
							class="form-control" placeholder="请输入礼品名称">
					</div>
					<div class="form-group">
						<label>礼品编号</label> <input type="text" class="form-control"
							placeholder="请输入礼品编号">
					</div>
					<div class="form-group">
						<label>礼品状态</label> <select class="form-control">
							<option>上架</option>
							<option>下架</option>
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
		<!--礼品信息列表  -->
		<div class="row">
			<div class="col-md-12">
				<div class="table-responsive">
					<table class="table table-hover table-bordered text-center">
						<thead>
							<tr class="text-center">
								<td><input type="checkbox" id='gift_all_check'></td>
								<td>#</td>
								<td>礼品名称</td>
								<td>礼品编号</td>
								<td>礼品类型</td>
								<td>礼品状态</td>
								<td>礼品单位</td>
								<td>礼品单价</td>
								<td>所需积分</td>
								<td>库存数量</td>
								<td>兑换数量</td>
								<td>操作</td>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td class="text-center"><input type="checkbox"
									class="gift_item_check"></td>
								<td>1</td>
								<td>新大米</td>
								<td>001</td>
								<td>粮油</td>
								<td>上架</td>
								<td>斤</td>
								<td>100.00</td>
								<td>10</td>
								<td>1000</td>
								<td>100</td>
								<td>
									<button type="button"
										class="btn btn-success btn-sm gift_update_btn">
										<span class="glyphicon glyphicon-pencil " aria-hidden="true"></span>
										修改
									</button>
									<button type="button" class="btn btn-danger btn-sm">
										<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
										删除
									</button>
								</td>
							</tr>
							<tr>
								<td class="text-center"><input type="checkbox"
									class="gift_item_check"></td>
								<td>2</td>
								<td>新大米</td>
								<td>001</td>
								<td>粮油</td>
								<td>上架</td>
								<td>斤</td>
								<td>100.00</td>
								<td>10</td>
								<td>1000</td>
								<td>100</td>
								<td>
									<button type="button" class="btn btn-success btn-sm">
										<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
										修改
									</button>
									<button type="button" class="btn btn-danger btn-sm">
										<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
										删除
									</button>
								</td>
							</tr>
							<tr>
								<td class="text-center"><input type="checkbox"
									class="gift_item_check"></td>
								<td>3</td>
								<td>新大米</td>
								<td>001</td>
								<td>粮油</td>
								<td>上架</td>
								<td>斤</td>
								<td>100.00</td>
								<td>10</td>
								<td>1000</td>
								<td>100</td>
								<td>
									<button type="button" class="btn btn-success btn-sm">
										<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
										修改
									</button>
									<button type="button" class="btn btn-danger btn-sm">
										<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
										删除
									</button>
								</td>
							</tr>
							<tr>
								<td class="text-center"><input type="checkbox"
									class="gift_item_check"></td>
								<td>4</td>
								<td>新大米</td>
								<td>001</td>
								<td>粮油</td>
								<td>上架</td>
								<td>斤</td>
								<td>100.00</td>
								<td>10</td>
								<td>1000</td>
								<td>100</td>
								<td>
									<button type="button" class="btn btn-success btn-sm">
										<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
										修改
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

	<!--新增礼品模态框  -->
	<div class="modal fade" tabindex="-1" role="dialog" id="add_gift_modal">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">新增礼品信息</h4>
				</div>
				<div class="modal-body">
					<table class="table-striped table-bordered text-center">
						<tr>
							<td class="col-xs-2">礼品名称</td>
							<td><input type="text" class="form-control"
								required="required"></td>
							<td rowspan="9" class="col-xs-7"><input
								class="btn btn-default" type="file"> <input
								class="btn btn-primary" type="button" value="上传图片"></td>
						</tr>
						<tr>
							<td>礼品编号</td>
							<td><input type="text" class="form-control"
								required="required"></td>
						</tr>
						<tr>
							<td>礼品类型</td>
							<td><input type="text" class="form-control"
								required="required"></td>
						</tr>
						<tr>
							<td>礼品状态</td>
							<td><select class="form-control">
									<option>下架</option>
									<option>上架架</option>
							</select></td>
						</tr>
						<tr>
							<td>礼品单位</td>
							<td><input type="text" class="form-control"
								required="required"></td>
						</tr>
						<tr>
							<td>礼品单价</td>
							<td><input type="text" class="form-control"
								required="required"></td>
						</tr>
						<tr>
							<td>所需积分</td>
							<td><input type="number" class="form-control"
								required="required"></td>
						</tr>
						<tr>
							<td>库存数量</td>
							<td><input type="number" class="form-control"
								required="required"></td>
						</tr>
						<tr>
							<td>下限数量</td>
							<td><input type="text" class="form-control"
								required="required"></td>
						</tr>
						<tr>
							<td>备注</td>
							<td colspan="2"><textarea class="form-control" rows="2"
									required="required"></textarea></td>
						</tr>
					</table>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary">保存</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<!-- /.modal -->

	<!--修改礼品模态框  -->
	<div class="modal fade" tabindex="-1" role="dialog"
		id="update_gift_modal">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">修改礼品信息</h4>
				</div>
				<div class="modal-body">
					<table class="table-striped table-bordered text-center">
						<tr>
							<td class="col-xs-2">礼品名称</td>
							<td><input type="text" class="form-control"
								required="required"></td>
							<td rowspan="9" class="col-xs-7"><img
								src="static/oldback/images/vedioview.png" alt="..."
								class="img-rounded"> <input class="btn btn-default"
								type="file"> <input class="btn btn-primary"
								type="button" value="上传图片"></td>
						</tr>
						<tr>
							<td>礼品编号</td>
							<td><input type="text" class="form-control"
								required="required"></td>
						</tr>
						<tr>
							<td>礼品类型</td>
							<td><input type="text" class="form-control"
								required="required"></td>
						</tr>
						<tr>
							<td>礼品状态</td>
							<td><select class="form-control">
									<option>下架</option>
									<option>上架架</option>
							</select></td>
						</tr>
						<tr>
							<td>礼品单位</td>
							<td><input type="text" class="form-control"
								required="required"></td>
						</tr>
						<tr>
							<td>礼品单价</td>
							<td><input type="text" class="form-control"
								required="required"></td>
						</tr>
						<tr>
							<td>所需积分</td>
							<td><input type="number" class="form-control"
								required="required"></td>
						</tr>
						<tr>
							<td>库存数量</td>
							<td><input type="number" class="form-control"
								required="required"></td>
						</tr>
						<tr>
							<td>下限数量</td>
							<td><input type="text" class="form-control"
								required="required"></td>
						</tr>
						<tr>
							<td>备注</td>
							<td colspan="2"><textarea class="form-control" rows="2"
									required="required"></textarea></td>
						</tr>
					</table>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary">修改</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<!-- /.modal -->
	<script type="text/javascript">
		//显示信息全选
		$("#gift_all_check").click(function() {
			$(".gift_item_check").prop("checked", $(this).prop("checked"));
		});

		//新增按钮
		$("#add_gift_btn").click(function() {
			$("#add_gift_modal").modal({
				backdrop : "static"
			});
		});
		//修改按钮
		$(".gift_update_btn").click(function() {
			$("#update_gift_modal").modal({
				backdrop : "static"
			});
		});
	</script>
</body>
</html>
