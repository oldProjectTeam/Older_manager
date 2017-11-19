<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	pageContext.setAttribute("APP_PATH", request.getContextPath());
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>地址</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link href="${APP_PATH}/static/css/admin.css" rel="stylesheet"
	type="text/css">
<link href="${APP_PATH}/static/css/amazeui.css" rel="stylesheet"
	type="text/css">

<link href="${APP_PATH}/static/css/personal.css" rel="stylesheet"
	type="text/css">
<link href="${APP_PATH}/static/css/addstyle.css" rel="stylesheet"
	type="text/css">
<script src="${APP_PATH}/static/js/jquery-3.2.1.min.js"
	type="text/javascript"></script>
<script src="${APP_PATH}/static/js/amazeui.js"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>
<script language="javascript"
	src="${APP_PATH}/static/shop/city/PCASClass.js"></script>
<link
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
	<jsp:include page="../home/shopheader.jsp"></jsp:include>
	<div class="nav-table">
		<div class="long-title">
			<span class="all-goods">全部分类</span>
		</div>
		<div class="nav-cont">
			<ul>
				<li class="index"><a href="#">首页</a></li>
				<li class="qc"><a href="#">闪购</a></li>
				<li class="qc"><a href="#">限时抢</a></li>
				<li class="qc"><a href="#">团购</a></li>
				<li class="qc last"><a href="#">大包装</a></li>
			</ul>
			<div class="nav-extra">
				<i class="am-icon-user-secret am-icon-md nav-user"></i><b></b>我的福利 <i
					class="am-icon-angle-right" style="padding-left: 10px;"></i>
			</div>
		</div>
	</div>
	<b class="line"></b>
	<div class="center">
		<div class="col-main">
			<div class="main-wrap">

				<div class="user-address">
					<!--标题 -->
					<div class="am-cf am-padding">
						<div class="am-fl am-cf">
							<strong class="am-text-danger am-text-lg">地址管理</strong> / <small>Address&nbsp;list</small>
						</div>
					</div>
					<hr />
					<ul class="am-avg-sm-1 am-avg-md-3 am-thumbnails">
						<c:forEach items="${address}" var="a">

							<c:if test="${a.state==1}">
								<li class="user-addresslist defaultAddr"><span
									class="new-option-r"><i class="am-icon-check-circle"></i><a
										onclick="changestate(${a.id},${a.userId})">默认地址</a></span>
									<p class="new-tit new-p-re">
										<span class="new-txt">${a.name}</span> <span
											class="new-txt-rd2">${a.phone }</span>
									</p>
									<div class="new-mu_l2a new-p-re">
										<p class="new-mu_l2cw">
											<span class="title">地址： ${a.location } <br />
												${a.detailaddress}
											</span>
										</p>
									</div>
									<div class="new-addr-btn" style="float:left;">
										<a onclick="updateaddress(${a.id},${a.userId})"><i
											class="am-icon-edit updateid"></i>编辑</a>
										<!-- <a class="am-icon-edit" id="updateid">编辑</a> -->
										<span class="new-addr-bar">|</span> <a
											onclick="deleteaddress(${a.id},${a.userId})"><i
											class="am-icon-trash"></i>删除</a>
									</div></li>
							</c:if>
							<c:if test="${a.state==0}">
								<li class="user-addresslist"><span class="new-option-r"><i
										class="am-icon-check-circle"></i><a
										onclick="changestate(${a.id},${a.userId})">默认地址</a></span>
									<p class="new-tit new-p-re">
										<span class="new-txt">${a.name}</span> <span
											class="new-txt-rd2">${a.phone }</span>
									</p>
									<div class="new-mu_l2a new-p-re">
										<p class="new-mu_l2cw">
											<span class="title">地址： ${a.location } <br />
												${a.detailaddress}
											</span>
										</p>
									</div>
									<div class="new-addr-btn" style="float:left;">
										<a onclick="updateaddress(${a.id},${a.userId})"><i
											class="am-icon-edit updateid"></i>编辑</a>
										<!-- <a class="tc-btn createAddr theme-login am-icon-edit">编辑</a> -->
										<span class="new-addr-bar">|</span> <a
											onclick="deleteaddress(${a.id},${a.userId})"><i
											class="am-icon-trash"></i>删除</a>
									</div></li>
							</c:if>
						</c:forEach>
					</ul>
					<div class="clear"></div>
					<a class="new-abtn-type"
						data-am-modal="{target: '#doc-modal-1', closeViaDimmer: 0}">添加新地址</a>
					<!--例子-->
					<div class="am-modal am-modal-no-btn" id="doc-modal-1">

						<div class="add-dress">

							<!--标题 -->
							<div class="am-cf am-padding">
								<div class="am-fl am-cf">
									<strong class="am-text-danger am-text-lg">新增地址</strong> / <small>Add&nbsp;address</small>
								</div>
							</div>
							<hr />

							<div class="am-u-md-12 am-u-lg-8" style="margin-top: 20px;">
								<form class="am-form am-form-horizontal" method="post"
									id="formid"
									action="${APP_PATH}/address/addshoppingaddress/${users.id}">

									<div class="am-form-group">
										<label for="user-name" class="am-form-label">收货人</label>
										<div class="am-form-content">
											<input type="text" id="user-name" name="name" required="true"
												placeholder="收货人">
										</div>
									</div>

									<div class="am-form-group">
										<label for="user-phone" class="am-form-label">手机号码</label>
										<div class="am-form-content">
											<!-- <input id="user-phone" placeholder="手机号必填" name="phone" type="tel"> -->
											<input type="tel" name="phone" id="user-phone"
												placeholder="手机号必填" required
												pattern="^(0|86|17951)?(13[0-9]|15[012356789]|17[0678]|18[0-9]|14[57])[0-9]{8}">
										</div>
									</div>
									<div class="am-form-group">
										<label for="user-address" class="am-form-label">所在地</label>
										<div class="am-form-content address">
											<input type="hidden" name="location" id="locid">
											<fieldset>
												<select name="province6" id="st1"></select><select
													name="city6" id="st2"></select><select name="area6"
													id="st3"></select><br>
											</fieldset>
										</div>
									</div>

									<div class="am-form-group">
										<label for="user-intro" class="am-form-label">详细地址</label>
										<div class="am-form-content">
											<textarea class="" rows="3" id="user-intro" required="true"
												id="detid" name="detailaddress" placeholder="输入详细地址"></textarea>
											<small>100字以内写出你的详细地址...</small>
										</div>
									</div>

									<div class="am-form-group">
										<div class="am-u-sm-9 am-u-sm-push-3">
											<!-- <a class="am-btn am-btn-danger">保存</a> -->
											<button class="am-btn am-btn-danger" id="saveaddressid">保存</button>
											<!-- 	<a href="javascript: void(0)" class="am-close am-btn am-btn-danger" data-am-modal-close>取消</a> -->
											<button class="am-btn am-btn-defalut" id="notid">取消</button>
										</div>
									</div>
								</form>
							</div>

						</div>

					</div>

				</div>






				<!-- 编辑模态框 -->
				<div class="modal fade" id="updatemodal" tabindex="-1" role="dialog"
					aria-labelledby="myModalLabel">
					<div class="modal-dialog" role="document">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal"
									aria-label="Close">
									<span aria-hidden="true">&times;</span>
								</button>
								<h4 class="modal-title" id="myModalLabel">编辑收货地址</h4>
							</div>
							<div class="modal-body">
								<form class="am-form am-form-horizontal">

									<div class="am-form-group">
										<label for="user-name" class="am-form-label">收货人</label>
										<div class="am-form-content">
											<input type="text" id="update-name" required="true"
												placeholder="收货人" name="name">
										</div>
									</div>

									<div class="am-form-group">
										<label for="user-phone" class="am-form-label">手机号码</label>
										<div class="am-form-content">
											<input type="tel" name="phone" id="update-phone"
												required="true" placeholder="手机号必填" required
												pattern="^(0|86|17951)?(13[0-9]|15[012356789]|17[0678]|18[0-9]|14[57])[0-9]{8}">

										</div>
									</div>

									<div class="am-form-group">
										<label for="user-phone" class="am-form-label">所在地</label>
										<div class="am-form-content address">
											<input type="hidden" name="location" id="locid1">
											<fieldset>
												<select name="province7" id="str1"></select><select
													name="city7" id="str2"></select><select name="area7"
													id="str3"></select><br>
											</fieldset>
										</div>
									</div>

									<div class="am-form-group">
										<label for="user-intro" class="am-form-label">详细地址</label>
										<div class="am-form-content">
											<textarea class="" rows="3" id="update-intro" required="true"
												name="detailaddress" placeholder="输入详细地址"></textarea>
											<small>100字以内写出你的详细地址...</small>
										</div>
									</div>

									<div class="am-form-group theme-poptit">
										<div class="am-u-sm-9 am-u-sm-push-3">
											<button class="btn btn-danger" id="updateaddressid">保存</button>
											<button type="button" class="btn btn-default"
												data-dismiss="modal">取消</button>
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
				<script type="text/javascript" defer>
					$(document).ready(
							function() {
								$(".new-option-r").click(
										function() {
											$(this).parent('.user-addresslist')
													.addClass("defaultAddr")
													.siblings().removeClass(
															"defaultAddr");
										});

								var $ww = $(window).width();
								if ($ww > 640) {
									$("#doc-modal-1").removeClass(
											"am-modal am-modal-no-btn");
								}

							});
				</script>
				<script type="text/javascript">
					//删除
					function deleteaddress(id, userid) {
						layer
								.confirm(
										"确认删除吗",
										function() {

											window.location.href = "${APP_PATH}/address/deleteshoppingaddressbyid/"
													+ id + "&" + userid;
											layer.msg("删除成功");
										});
					}
					//点击保存
					$("#saveaddressid").click(
							function() {
								var address = $("#st1").val() + "-"
										+ $("#st2").val() + "-"
										+ $("#st3").val();
								$("#locid").val(address);
								$("#saveaddressid").submit();
							});
					//取消清空	
					$("#notid").click(function() {
						$("#formid")[0].reset();
					});
					//设置默认状态
					function changestate(id, userid) {
						$.ajax({
							url : "${APP_PATH}/address/updatestate/" + id + "&"
									+ userid,
							type : "POST",
							success : function(result) {

								if (result.code == 100) {
									layer.msg("设置成功");
								}
							}

						});

					}
					//点击编辑
					function updateaddress(id, userid) {

						$("#updateaddressid").attr("id", id).attr("userid",
								userid);
						//$("#updateaddressid").attr("userid",userid);
						$
								.ajax({
									url : "${APP_PATH}/address/selectshoppingaddressbyid/"
											+ id,
									type : "GET",
									success : function(result) {

										if (result.code == 100) {
											var rel = result.extend.address;
											$("#update-name").val(rel.name);
											$("#update-phone").val(rel.phone);

											var num = rel.location.split("-");

											new PCAS("province7", "city7",
													"area7", num[0], num[1],
													num[2]);
											$("#update-intro").val(
													rel.detailaddress);
											$("#updatemodal").modal();
										}
									},

								});
					}

					$("#updateaddressid")
							.click(
									function() {
										var address = $("#str1").val() + "-"
												+ $("#str2").val() + "-"
												+ $("#str3").val();
										var upid = $(this).attr("id");
										var userid = $(this).attr("userid");
										$("#locid1").val(address);
										$
												.ajax({
													url : "${APP_PATH}/address/updateaddress/"
															+ upid,
													type : "POST",
													data : $(
															"#updatemodal form")
															.serialize(),
													success : function(result) {
														if (result.code == 100) {
															layer.msg("更新成功");

															window.location.href = "${APP_PATH}/address/selectallshoppingaddress/"
																	+ userid;
														}
													}
												});

									});
				</script>
				<script language="javascript" defer>
					new PCAS("province6", "city6", "area6", "江苏省", "苏州市", "沧浪区");
					/* new PCAS("province7","city7","area7"); */
				</script>




				<div class="clear"></div>

			</div>
			<!--底部-->
			<div class="footer">
				<div class="footer-hd">
					<p>
						<a href="#">恒望科技</a> <b>|</b> <a href="#">商城首页</a> <b>|</b> <a
							href="#">支付宝</a> <b>|</b> <a href="#">物流</a>
					</p>
				</div>
				<div class="footer-bd">
					<p>
						<a href="#">关于恒望</a> <a href="#">合作伙伴</a> <a href="#">联系我们</a> <a
							href="#">网站地图</a> <em>© 2015-2025 Hengwang.com 版权所有</em>
					</p>
				</div>
			</div>
		</div>
		<jsp:include page="left.jsp"></jsp:include>
	</div>

</body>

</html>