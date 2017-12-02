<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	pageContext.setAttribute("APP_PATH", request.getContextPath());
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>退款记录</title>

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
<link href="${APP_PATH}/static/css/orstyle.css" rel="stylesheet"
	type="text/css">
<script src="${APP_PATH}/static/js/jquery-3.2.1.min.js"
	type="text/javascript"></script>
<script src="${APP_PATH}/static/js/amazeui.js"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>
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
				<li class="index"><a href="${APP_PATH}/shop/oldfronthome">首页</a></li>
			</ul>
		</div>
	</div>
	<b class="line"></b>
	<div class="center">
		<div class="col-main">
			<div class="main-wrap">

				<div class="user-order">

					<!--标题 -->
					<div class="am-cf am-padding">
						<div class="am-fl am-cf">
							<strong class="am-text-danger am-text-lg">退款记录</strong> / <small>Change</small>
						</div>
					</div>
					<hr />

					<div class="am-tabs am-tabs-d2 am-margin" data-am-tabs>

						<div class="am-tabs-bd">


							<div class="am-tab-panel am-fade am-in am-active" id="tab1">
								<div class="order-top">
									<div class="th th-item">
										<td class="td-inner">商品</td>
									</div>
									<div class="th th-orderprice th-price">
										<td class="td-inner">交易金额</td>
									</div>
									<div class="th th-changeprice th-price">
										<td class="td-inner">退款金额</td>
									</div>
									<div class="th th-status th-moneystatus">
										<td class="td-inner">交易状态</td>
									</div>
									<div class="th th-change th-changebuttom">
										<td class="td-inner">交易操作</td>
									</div>
								</div>


								<c:forEach items="${list}" var="ch">
									<c:if test="${ch.chdeletestate=='0'}">
										<div class="order-main">
											<div class="order-list">
												<div class="order-title">
													<div class="dd-num">
														退款编号：<a href="javascript:;">${ch.chno }</a>
													</div>
													<span>申请时间：<fmt:formatDate value="${ch.chtime}"
															pattern="yyyy-MM-dd HH:mm:ss" /></span>
													<!--    <em>店铺：小桔灯</em>-->
												</div>
												<div class="order-content">
													<div class="order-left">
														<ul class="item-list">
															<li class="td td-item">
																<div class="item-pic">
																	<a href="product/getProduct/${ch.productid}"
																		class="J_MakePoint"> <img
																		src="http://123.207.93.53/Older_back/${ch.chphoto}"
																		class="itempic J_ItemImg">
																	</a>
																</div>
																<div class="item-info">
																	<div class="item-basic-info">
																		<a href="product/getProduct/${ch.productid}">
																			<p>${ch.chname}</p>
																			<p class="info-little">
																				${ch.chbrieft} <br />包装：裸装
																			</p>
																		</a>
																	</div>
																</div>
															</li>

															<ul class="td-changeorder">
																<li class="td td-orderprice">
																	<div class="item-orderprice">
																		<span>交易金额：</span>${ch.chmoeny }
																	</div>
																</li>
																<li class="td td-changeprice">
																	<div class="item-changeprice">
																		<span>退款金额：</span>${ch.chaftermoney }
																	</div>
																</li>
															</ul>
															<div class="clear"></div>
														</ul>

														<div class="change move-right">
															<li class="td td-moneystatus td-status">
																<div class="item-status">
																	<c:if test="${ch.chstate==0}">
																		<p class="Mystatus">退款成功</p>
																	</c:if>
																	<c:if test="${ch.chstate==1}">
																		<p class="Mystatus">退款失败</p>
																	</c:if>
																	<c:if test="${ch.chstate==2}">
																		<p class="Mystatus">处理中</p>
																	</c:if>
																</div>
															</li>
														</div>
														<li class="td td-change td-changebutton"><c:if
																test="${ch.chstate==0}">
																<div class="am-btn am-btn-defulat anniu">
																	<a onclick="deletechange(${ch.id},${ch.usid})">删除记录</a>
																</div>
															</c:if> <c:if test="${ch.chstate==1}">
																<div class="am-btn am-btn-defulat anniu">

																	<p class="order-info">
																		<a onclick="why()">查看原因</a>
																	</p>
																	<p class="order-info">
																		<a onclick="deletechange(${ch.id},${ch.usid})">删除记录</a>
																	</p>

																</div>
															</c:if> <c:if test="${ch.chstate==2}">
																<div class="am-btn am-btn-defulat anniu">

																	<p class="order-info">
																		<a onclick="handle()">提醒处理</a>
																	</p>
																	<p class="order-info">
																		<a onclick="deletechange(${ch.id},${ch.usid})">删除记录</a>
																	</p>

																</div>
															</c:if></li>

													</div>
												</div>
											</div>

										</div>
									</c:if>
								</c:forEach>
							</div>




						</div>

					</div>
				</div>

			</div>


			<script type="text/javascript">
				function deletechange(id, userid) {

					layer.confirm("确认删除吗", function() {

						window.location.href = "change/deletechangebyid/" + id
								+ "&" + userid;
					});

				}

				function handle() {

					layer.msg("亲！正在努力处理中");

				}

				function why() {
					layer.open({
						title : '失败原因',
						content : '超出申请时限或物件被损坏'
					});

				}
			</script>
			<!--底部-->
			<jsp:include page="footer.jsp"></jsp:include>
		</div>
		<jsp:include page="left.jsp"></jsp:include>
	</div>
</body>
</html>