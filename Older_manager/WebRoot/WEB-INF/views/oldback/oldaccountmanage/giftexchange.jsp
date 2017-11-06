<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>
</head>
<body style="margin: 15px;">
	<!--路劲导航  -->
	<div>
		<div class="row">
			<div class="col-md-12">
				<ol class="breadcrumb">
					<li><b>位置：<a
							href="${APP_PATH}/oldmanaccount/accountManageindex">老人账户管理</a></b></li>
					<li class="active">礼品兑换记录</li>
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
				<button type="button" class="btn btn-danger" id="batch_del_btn">
					<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
					批量删除
				</button>
			</div>
		</div>
		<!--条件查询  -->
		<div class="row" style="margin-top:5px">
			<div class="col-md-12">
				<form class="form-inline"
					action="${APP_PATH}/giftexchange/findAllGiftexchange.action"
					method="post">
					<div class="form-group">
						&nbsp;&nbsp;<label>礼品名称</label> <input type="text"
							name="giftmanagement.giftname" class="form-control"
							placeholder="请输入礼品名称">
					</div>
					<div class="form-group">
						<label>兑换单号</label> <input type="text" class="form-control"
							name="exchangeno" placeholder="请输入兑换单号">
					</div>
					<div class="form-group">
						<label>老人姓名</label> <input type="text" class="form-control"
							name="oldmanaccount.oldman.name" placeholder="请输入老人姓名">
					</div>
					<div class="form-group">
						<label>礼品类型</label> <input type="text" class="form-control"
							name="giftmanagement.gifttype" placeholder="请输入礼品类型">
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
								<td><input type="checkbox" id='giftexchange_all_check'></td>
								<td>#</td>
								<td>兑换单号</td>
								<td>老人姓名</td>
								<td>联系电话</td>
								<td>收货地址</td>
								<td>礼品名称</td>
								<td>礼品类型</td>
								<td>兑换数量</td>
								<td>消费积分</td>
								<td>兑换时间</td>
								<td>兑换状态</td>
								<td>操作</td>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${pageInfo.list }" var="gex">
								<tr>
									<td class="text-center"><input type="checkbox"
										class="gift_item_check"></td>
									<td>${gex.id }</td>
									<td>${gex.exchangeno}</td>
									<td>${gex.oldmanaccount.oldman.name}</td>
									<td>${gex.oldmanaccount.oldman.phone}</td>
									<td>${gex.oldmanaccount.oldman.address}</td>
									<td>${gex.giftmanagement.giftname}</td>
									<td>${gex.giftmanagement.gifttype}</td>
									<td>${gex.exchangenum}</td>
									<td>${gex.exchangeintegral}</td>
									<td><fmt:formatDate value="${gex.exchangetime}"
											pattern='yyyy-MM-dd HH:mm:ss' /></td>
									<td>${gex.giftexchange1}</td>
									<td>
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
			<div class="col-md-7">&nbsp;&nbsp;当前第${pageInfo.pageNum }页，共${pageInfo.pages}页，总计${pageInfo.total}条记录</div>
			<div class="col-md-4 col-md-offset-1">
				<nav aria-label="Page navigation">
					<ul class="pagination">
						<c:if test="${pageInfo.hasPreviousPage==false}">
							<li class="disabled"><a>首页</a></li>
							<li class="disabled"><span aria-hidden="true">&laquo;</span>
							</li>
						</c:if>
						<c:if test="${pageInfo.hasPreviousPage==true}">
							<li><a
								href="${APP_PATH}/giftexchange/findAllGiftexchange.action?pn=${1}">首页</a>
							</li>
							<li><a
								href="${APP_PATH}/giftexchange/findAllGiftexchange.action?pn=${pageInfo.pageNum-1}">
									<span aria-hidden="true">&laquo;</span>
							</a></li>
						</c:if>
						<c:forEach items="${pageInfo.navigatepageNums}" var="p">
							<c:if test="${p==pageInfo.pageNum}">
								<li class="active"><a
									href="${APP_PATH}/giftexchange/findAllGiftexchange.action?pn=${pageInfo.pageNum}">${p}</a></li>
							</c:if>
							<c:if test="${p!=pageInfo.pageNum}">
								<li><a
									href="${APP_PATH}/giftexchange/findAllGiftexchange.action?pn=${p}">${p}</a></li>
							</c:if>
						</c:forEach>
						<c:if test="${pageInfo.hasNextPage==false}">
							<li class="disabled"><span aria-hidden="true">&raquo;</span>
							</li>
							<li class="disabled"><a>末页</a></li>
						</c:if>
						<c:if test="${pageInfo.hasNextPage!=false}">
							<li><a
								href="${APP_PATH}/giftexchange/findAllGiftexchange.action?pn=${pageInfo.pageNum+1}"
								aria-label="Next"> <span aria-hidden="true">&raquo;</span></a></li>
							<li><a
								href="${APP_PATH}/giftexchange/findAllGiftexchange.action?pn=${pageInfo.pages}">末页</a>
							</li>
						</c:if>
					</ul>
				</nav>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		//显示信息全选
		$("#giftexchange_all_check").click(function() {
			$(".gift_item_check").prop("checked", $(this).prop("checked"));
		});
		$(document)
				.on(
						"click",
						".gift_item_check",
						function() {
							var flag = $(".gift_item_check:checked").length == $(".gift_item_check").length;
							$("#giftexchange_all_check").prop("checked", flag);
						});

		//单选删除按钮
		$(document)
				.on(
						"click",
						".del_btn",
						function() {
							var id = $(this).parents("tr").find("td:eq(1)")
									.text();
							var name = $(this).parents("tr").find("td:eq(3)")
									.text();
							layer
									.confirm(
											"您确定要删除老人【" + name + "】的礼品兑换记录吗？",
											function(index) {
												$
														.ajax({
															url : "${APP_PATH}/giftexchange/deleteGIftexchange/"
																	+ id,
															type : "delete",
															success : function(
																	result) {
																if (result.code == 100) {
																	layer
																			.msg("删除成功！");
																	window.location.href = "${APP_PATH}/giftexchange/findAllGiftexchange.action?pn=1";
																} else {
																	layer
																			.msg("删除失败，请再重试一遍吧！");
																}
															}

														});
											});
						});

		//批量删除按钮
		$("#batch_del_btn")
				.click(
						function() {
							var oldManStr = "";
							var Ids_str = "";
							$.each($(".gift_item_check:checked"), function() {
								oldManStr += $(this).parents("tr").find(
										"td:eq(3)").text()
										+ ",";
								Ids_str += $(this).parents("tr").find(
										"td:eq(1)").text()
										+ "-";
							});
							oldManStr = oldManStr.substring(0,
									oldManStr.length - 1);
							Ids_str = Ids_str.substring(0, Ids_str.length - 1);
							if (Ids_str.length < 1) {
								layer.msg("您还没选中要删除的记录！");
								return false;
							}
							layer
									.confirm(
											"您确定要删除老人【" + oldManStr
													+ "】的礼品兑换记录吗？",
											function() {
												$
														.ajax({
															url : "${APP_PATH}/giftexchange/deleteGIftexchange/"
																	+ Ids_str,
															type : "delete",
															success : function(
																	result) {
																if (result.code == 100) {
																	layer
																			.msg("删除成功！");
																	window.location.href = "${APP_PATH}/giftexchange/findAllGiftexchange.action?pn=1";
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
