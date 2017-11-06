<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta name="keywords" content="keyword1,keyword2,keyword3">
<meta name="description" content="this is my page">
<meta name="content-type" content="text/html; charset=UTF-8">

<!--<link rel="stylesheet" type="text/css" href="./styles.css">-->
<script type="text/javascript"
	src="${APP_PATH }/static/js/jquery-3.2.1.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script type="text/javascript"
	src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>
</head>

<body style="margin-left:15px">
	<!--路劲导航  -->
	<div>
		<div class="row">
			<div class="col-md-12">
				<ol class="breadcrumb">
					<li><b>位置：<a href="officemanage/officemanageIndex">办公管理</a></b></li>
					<li class="active">活动管理</li>
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
				<button type="button" class="btn btn-danger" id="batchDel_btn">
					<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
					批量删除
				</button>
			</div>
		</div>
		<!--条件查询  -->
		<div class="row" style="margin-top:5px">
			<div class="col-md-12">
				<form class="form-inline"
					action="${APP_PATH}/activity/queryActivity.action">
					<div class="form-group">
						&nbsp;&nbsp;<label for="exampleInputName2">活动标题</label> <input
							type="text" class="form-control" placeholder="活动标题" name="title">
					</div>
					<div class="form-group">
						<label for="exampleInputEmail2">活动地点</label> <input type="text"
							class="form-control" placeholder="活动地点" name="place">
					</div>
					<div class="form-group">
						<label for="exampleInputEmail2">活动时间（早于）</label> <input
							type="date" class="form-control" placeholder="活动地点"
							name="activitytime">
					</div>
					<button type="submit" class="btn btn-default">
						<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
						查询
					</button>
					<button type="Reset" class="btn btn-default">
						<span class="glyphicon glyphicon-repeat" aria-hidden="true"></span>
						重置
					</button>
				</form>
			</div>
		</div>
		<br>
		<!--活动信息列表  -->
		<div class="row">
			<div class="col-md-12">
				<div class="table-responsive">
					<table class="table table-hover table-bordered text-center">
						<thead>
							<tr>
								<td><input type="checkbox" id='check_item_all'></td>
								<td>#</td>
								<td>活动标题</td>
								<td>活动时间</td>
								<td>活动地点</td>
								<td>活动状态</td>
								<td>发布时间</v>
								<td>发布人</td>
								<td>操作</td>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${pageInfo.list}" var="a">
								<tr>
									<td class="text-center"><input type="checkbox"
										class="item_check"></td>
									<td>${a.id}</td>
									<td>${a.title}</td>

									<td><fmt:formatDate value="${a.activitytime}"
											pattern='yyyy-MM-dd HH:mm:ss' /></td>
									<td>${a.place }</td>
									<td>${a.state}</td>
									<td><fmt:formatDate value="${a.releasetime}"
											pattern='yyyy-MM-dd HH:mm:ss' /></td>
									<td>${a.releasepeople}</td>
									<td>
										<button type="button" class="btn btn-info btn-sm view_btn">
											<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
											查看
										</button>
										<button type="button" class="btn btn-info btn-sm edit_btn">
											<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
											编辑
										</button>
										<button type="button" class="btn btn-danger btn-sm del_btn">
											<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
											删除
										</button>
									</td>
								</tr>
							</c:forEach>
						</tbody>
						<thead>
					</table>
				</div>
			</div>
		</div>
		<!--分页信息  -->
		<div class="row">
			<div class="col-md-7">
				&nbsp;&nbsp;当前第${pageInfo.pageNum}页，共${pageInfo.pages}页，总计${pageInfo.total}条记录
			</div>
			<div class="col-md-5">
				<nav aria-label="Page navigation">
					<ul class="pagination">
						<c:if test="${pageInfo.hasPreviousPage==false}">
							<li class="disabled"><a>首页</a></li>
							<li class="disabled"><span aria-hidden="true">&laquo;</span>
							</li>
						</c:if>
						<c:if test="${pageInfo.hasPreviousPage==true}">
							<li><a
								href="${APP_PATH}/activity/queryActivity.action?pn=${1}">首页</a>
							</li>
							<li><a
								href="${APP_PATH}/activity/queryActivity.action?pn=${pageInfo.pageNum-1}">
									<span aria-hidden="true">&laquo;</span>
							</a></li>
						</c:if>
						<c:forEach items="${pageInfo.navigatepageNums}" var="p">
							<c:if test="${p==pageInfo.pageNum}">
								<li class="active"><a
									href="${APP_PATH}/activity/queryActivity.action?pn=${pageInfo.pageNum}">${p}</a></li>
							</c:if>
							<c:if test="${p!=pageInfo.pageNum}">
								<li><a
									href="${APP_PATH}/activity/queryActivity.action?pn=${p}">${p}</a></li>
							</c:if>
						</c:forEach>
						<c:if test="${pageInfo.hasNextPage==false}">
							<li class="disabled"><span aria-hidden="true">&raquo;</span>
							</li>
							<li class="disabled"><a>末页</a></li>
						</c:if>
						<c:if test="${pageInfo.hasNextPage!=false}">
							<li><a
								href="${APP_PATH}/activity/queryActivity.action?pn=${pageInfo.pageNum+1}"
								aria-label="Next"> <span aria-hidden="true">&raquo;</span></a></li>
							<li><a
								href="${APP_PATH}/activity/queryActivity.action?pn=${pageInfo.pages}">末页</a>
							</li>
						</c:if>
					</ul>
				</nav>
			</div>
		</div>
	</div>



	<!--查看模态框  -->
	<div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog"
		id="activity_view_modal">
		<div class="modal-dialog modal-lg" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">查看活动信息</h4>
				</div>
				<div class="modal-body">
					<div class="row">
						<div class="col-md-10 col-md-offset-1">
							<div class="panel panel-default">
								<!-- Table -->
								<table class="table table-bordered">
									<tr>
										<td>活动标题</td>
										<td id="title"></td>
									</tr>
									<tr>
										<td>活动时间</td>
										<td id="activitytime"></td>
									</tr>
									<tr>
										<td>活动地点</td>
										<td id="place"></td>
									</tr>
									<tr>
										<td>活动状态</td>
										<td id="state"></td>
									</tr>
									<tr>
										<td>发布时间</td>
										<td id="releasetime"></td>
									</tr>
									<tr>
										<td>发布人</td>
										<td id="releasepeople"></td>
									</tr>

								</table>
								<div class="panel-heading">活动简介</div>
								<div class="panel-body">
									<p id="content"></p>
								</div>
							</div>

						</div>

					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<!-- /.modal -->

	<!--编辑模态框  -->
	<div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog"
		id="activity_edit_modal">
		<div class="modal-dialog modal-lg" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">编辑活动信息</h4>
				</div>
				<div class="modal-body">
					<form id="activity_data_form">
						<div class="row">
							<div class="col-md-10 col-md-offset-1">

								<div class="panel panel-default">
									<!-- Table -->
									<table class="table table-bordered">
										<tr>
											<td>活动标题</td>
											<td><input type="text" class="form-control" id="title1"
												name="title"></td>
										</tr>
										<tr>
											<td>活动时间</td>
											<td>
												<div class="form-group">
													<label class="col-sm-5 control-label" id="activitytime1"></label>
													<div class="col-sm-4">
														<input type="date" class="form-control"
															name="activitytime">
													</div>
												</div>

											</td>
										</tr>
										<tr>
											<td>活动地点</td>
											<td><input type="text" class="form-control" id="place1"
												name="place"></td>
										</tr>
										<tr>
											<td>活动状态</td>
											<td><select id="state" name="state">
													<option value="未进行">未进行</option>
													<option value="进行中">进行中</option>
													<option value="已结束">已结束</option>
											</select></td>
										</tr>
										<tr>
											<td>发布时间</td>
											<td id="releasetime1"></td>
										</tr>
										<tr>
											<td>发布人</td>
											<td><input type="text" class="form-control"
												id="releasepeople1" name="releasepeople"></td>
										</tr>

									</table>
									<div class="panel-heading">活动简介</div>
									<div class="panel-body">
										<textarea class="form-control" rows="3" id="content1"
											name="content"></textarea>
									</div>
								</div>
								<input type="hidden" id="id1" name="id">
							</div>

						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" id="save_btn">保存</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<!-- /.modal -->
	<script type="text/javascript">
		//当前页
		var currentPage = ${pageInfo.pageNum};

		//去哪页
		function go(pn) {
			window.location.href = "${APP_PATH}/activity/queryActivity.action?pn="
					+ pn;
		}

		//全选
		$("#check_item_all").click(function() {
			$(".item_check").prop("checked", $(this).prop("checked"));
		});
		//如果复选框全部选中，全选复选框应该也要选中
		$(document)
				.on(
						"click",
						".item_check",
						function() {
							var flag = $(".item_check:checked").length == $(".item_check").length;
							$("#check_item_all").prop("checked", flag);
						});

		//查看按钮，弹出模态框，加载数据
		$(document).on("click", ".view_btn", function() {
			var id = $(this).parents("tr").find("td:eq(1)").text();
			$("#activity_view_modal").modal();
			$.ajax({
				url : "${APP_PATH}/activity/findActivityById?id=" + id,
				type : "post",
				success : function(result) {
					if (result.code == 100) {
						var ac = result.extend.activity;
						$("#title").html(ac.title);
						$("#place").html(ac.place);
						$("#activitytime").html(ac.activitytimeStr);
						$("#state").html(ac.state);
						$("#releasetime").html(ac.releasetimeStr);
						$("#releasepeople").html(ac.releasepeople);
						$("#content").html(ac.content);
					} else {
						layer.msg("获取失败，请重试！");
					}
				}
			});
		});

		//点击编辑，加载数据，弹出模态框

		$(document).on("click", ".edit_btn", function() {
			var id = $(this).parents("tr").find("td:eq(1)").text();
			$("#activity_edit_modal").modal();
			$.ajax({
				url : "${APP_PATH}/activity/findActivityById?id=" + id,
				type : "post",
				success : function(result) {
					if (result.code == 100) {
						var ac = result.extend.activity;
						$("#id1").val(ac.id);
						$("#title1").val(ac.title);
						$("#place1").val(ac.place);
						$("#activitytime1").html(ac.activitytimeStr);
						$("#state1").val([ ac.state ]);
						$("#releasetime1").html(ac.releasetimeStr);
						$("#releasepeople1").val(ac.releasepeople);
						$("#content1").val(ac.content);
					} else {
						layer.msg("获取失败，请重试");
					}
				}
			});
		});

		//点击保存按钮，修改报名信息
		$("#save_btn").click(function() {
			$.ajax({
				url : "${APP_PATH}/activity/updateActivity",
				type : "post",
				data : $("#activity_data_form").serialize(),
				success : function(result) {
					if (result.code == 100) {
						layer.msg("修改成功！");
						//1.关闭模态框
						$("#activity_edit_modal").modal('hide');
						//2.重新加载当页
						go(currentPage);
					} else {
						layer.msg("修改失败，请再重试一遍吧！");
						$("#activity_edit_modal").modal('hide');
					}
				}
			});
		});

		//单选删除按钮
		$(document).on("click", ".del_btn", function() {
			var id = $(this).parents("tr").find("td:eq(1)").text();
			var name = $(this).parents("tr").find("td:eq(2)").text();
			layer.confirm("您确定要删除活动名称为【" + name + "】的信息吗？", function(index) {
				$.ajax({
					url : "${APP_PATH}/activity/deleteActivity/" + id,
					type : "delete",
					success : function(result) {
						if (result.code == 100) {
							layer.msg("删除成功！");
							go(currentPage);
						} else {
							layer.msg("删除失败，请再重试一遍吧！");
						}
					}
				});
			});
		});

		//批量删除按钮
		$("#batchDel_btn")
				.click(
						function() {
							var title_str = "";
							var Ids_str = "";
							$.each($(".item_check:checked"), function() {
								title_str += $(this).parents("tr").find(
										"td:eq(2)").text()
										+ ",";
								Ids_str += $(this).parents("tr").find(
										"td:eq(1)").text()
										+ "-";
							});
							title_str = title_str.substring(0,
									title_str.length - 1);
							Ids_str = Ids_str.substring(0, Ids_str.length - 1);
							if (Ids_str.length < 1) {
								layer.msg("您还没选中要删除的记录！");
								return false;
							}
							layer
									.confirm(
											"您确定要删除活动名称为【" + title_str
													+ "】的信息吗？",
											function(index) {
												$
														.ajax({
															url : "${APP_PATH}/activity/deleteActivity/"
																	+ Ids_str,
															type : "delete",
															success : function(
																	result) {
																if (result.code == 100) {
																	layer
																			.msg("删除成功！");
																	go(currentPage);
																} else {
																	layer
																			.msg("删除失败，请再重试一遍吧！");
																}
															}
														});
											});
						});
	</script>

</body>
</html>
