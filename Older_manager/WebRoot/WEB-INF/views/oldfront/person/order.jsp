<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	pageContext.setAttribute("APP_PATH", request.getContextPath());
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>订单管理</title>

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

<script src="${APP_PATH}/static/js/jquery.min.js"></script>
<script src="${APP_PATH}/static/js/amazeui.js"></script>
<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery-1.7.2.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>

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
							<strong class="am-text-danger am-text-lg">订单管理</strong> / <small>Order</small>
						</div>
					</div>
					<hr />

					<div class="am-tabs am-tabs-d2 am-margin" data-am-tabs>

						<ul class="am-avg-sm-5 am-tabs-nav am-nav am-nav-tabs">
							<li class="am-active"><a href="#tab1">所有订单</a></li>
							<li><a href="#tab2">待付款</a></li>
							<li><a href="#tab3">待发货</a></li>
							<li><a href="#tab4">待收货</a></li>
							<li><a href="#tab5">待评价</a></li>
						</ul>

						<div class="am-tabs-bd">
							<div class="am-tab-panel am-fade am-in am-active" id="tab1">
								<div class="order-top">
									<div class="th th-item">
										<td class="td-inner">商品</td>
									</div>
									<div class="th th-price">
										<td class="td-inner">单价</td>
									</div>
									<div class="th th-number">
										<td class="td-inner">数量</td>
									</div>
									<div class="th th-operation">
										<td class="td-inner">商品操作</td>
									</div>
									<div class="th th-amount">
										<td class="td-inner">合计</td>
									</div>
									<div class="th th-status">
										<td class="td-inner">交易状态</td>
									</div>
									<div class="th th-change">
										<td class="td-inner">交易操作</td>
									</div>
								</div>

								<div class="order-main">
									<div class="order-list">
										<!--交易成功-->
										<c:forEach var="item" items="${map}">
											<div class="order-status5">
												<c:forEach items="${item.value}" var="l" end="${exitId}">
													<c:if test="${l.orders.orders1=='1'}">
														<div class="order-title">
															<div class="dd-num">
																订单编号：<a href="javascript:;">${item.key}</a>
															</div>
															<c:forEach items="${map2}" var="m">
																<c:if test="${m.key==item.key}">
																	<span>成交时间：<fmt:formatDate value="${m.value}"
																			pattern="yyyy-MM-dd" /></span>
																</c:if>
															</c:forEach>
														</div>
														<div class="order-content">
															<div class="order-left">
																<c:forEach items="${item.value}" var="list">
																	<ul class="item-list">
																		<li class="td td-item">
																			<div class="item-pic">
																				<a href="product/getProduct/${list.products.id}"
																					class="J_MakePoint"> <img
																					src="${list.products.images}"
																					class="itempic J_ItemImg">
																				</a>
																			</div>
																			<div class="item-info">
																				<div class="item-basic-info">
																					<a href="product/getProduct/${list.products.id}">
																						<p>${list.producctname}</p>
																						<p class="info-little">${list.products.synopsis}
																							<br />包装：裸装
																						</p>
																					</a>
																				</div>
																			</div>
																		</li>
																		<li class="td td-price" style="margin-top: 55px;">
																			<div class="item-price">
																				${list.products.nowprice}</div>
																		</li>
																		<li class="td td-number" style="margin-top: 55px;">
																			<div class="item-number">
																				<span>×</span>${list.number}
																			</div>
																		</li>
																		<li class="td td-operation">
																			<div class="item-operation"></div>
																		</li>
																	</ul>
																</c:forEach>
															</div>
															<div class="order-right">
																<c:forEach var="mp3" items="${map3}">
																	<c:if test="${mp3.key==item.key}">

																		<ul>
																			<li class="td td-amount">
																				<div class="item-amount">
																					合计：${mp3.value[0]}
																					<p>
																						含运费：<span>${mp3.value[1]}</span>
																					</p>
																				</div>
																			</li>
																		</ul>
																		<div class="move-right">
																			<ul>
																				<c:if test="${mp3.value[2]==('待评价')}">
																					<li class="td td-status">
																						<div class="item-status">
																							<p class="Mystatus">交易成功</p>

																							<p class="order-info">
																								<a href="order/orderinfo">订单详情</a>
																							</p>
																							<p class="order-info">
																								<a href="order/logistics">查看物流</a>
																							</p>
																							<p class="order-info">
																								<a
																									href="order/selectorderdetailbyorderno/${mp3.value[3]}">申请退款</a>
																							</p>

																						</div>
																					</li>
																					<li class="td td-change">
																						<p class="order-info">
																							<a
																								onclick="order/selectproductbyid/${mp3.value[3]}">评价商品</a>
																						</p>
																						<p class="order-info">
																							<a onclick="deleteOrder(${mp3.value[3]},this)">删除记录</a>
																						</p>
																					</li>
																				</c:if>
																				<c:if test="${mp3.value[2]==('待付款')}">
																					<li class="td td-status">
																						<div class="item-status">
																							<p class="Mystatus" style="margin-top: 12px;">等待买家付款</p>
																							<!-- 删除点单 -->
																							<p class="order-info">
																								<a
																									href="javascript:cancel(${mp3.value[3]},this)">取消订单</a>
																							</p>

																						</div>
																					</li>
																					<li class="td td-change">
																						<p class="order-info">
																							<a
																								href="${APP_PATH}/pay/wait_pay?id=${mp3.value[3]}">一键支付</a>
																						</p>
																						<p class="order-info">
																							<a
																								href="javascript:deleteOrder(${mp3.value[3]},this)">删除记录</a>
																						</p>

																					</li>
																				</c:if>
																				<c:if test="${mp3.value[2]==('待收货')}">
																					<li class="td td-status">
																						<div class="item-status">
																							<p class="Mystatus">卖家已发货</p>

																							<p class="order-info">
																								<a href="order/orderinfo">订单详情</a>
																							</p>
																							<p class="order-info">
																								<a href="order/logistics">查看物流</a>
																							</p>
																							<p class="order-info">


																								<c:if test="${mp3.value[4]==('0')}">
																									<a onclick="remindone(${mp3.value[3]},this)">延长收货</a>
																								</c:if>
																								<c:if test="${mp3.value[4]==('1')}">
																	   延长收货中
																	</c:if>
																							</p>
																						</div>
																					</li>
																					<li class="td td-change">
																						<p class="order-info">
																							<a onclick="suresh(${mp3.value[3]},2,this)">确认收货</a>
																						</p>
																						<p class="order-info">
																							<a onclick="deleteOrder(${mp3.value[3]},this)">删除记录</a>
																						</p>
																					</li>
																				</c:if>
																				<c:if test="${mp3.value[2]==('待发货')}">
																					<li class="td td-status">
																						<div class="item-status">
																							<p class="Mystatus">买家已付款</p>

																							<p class="order-info">
																								<a href="order/orderinfo">订单详情</a>
																							</p>


																						</div>
																					</li>
																					<li class="td td-change">
																						<p class="order-info">
																							<a onclick="remind()">提醒发货</a>
																						</p>
																						<p class="order-info">
																							<a onclick="deleteOrder(${mp3.value[3]},this)">删除记录</a>
																						</p>
																					</li>
																				</c:if>
																				<c:if test="${mp3.value[2]==('已评价')}">
																					<li class="td td-status">
																						<div class="item-status">
																							<p class="Mystatus">已评价</p>
																						</div>
																					</li>
																					<li class="td td-change">
																						<p class="order-info">
																							<a onclick="deleteOrder(${mp3.value[3]},this)">删除记录</a>
																						</p>
																					</li>
																				</c:if>
																			</ul>
																		</div>

																	</c:if>
																</c:forEach>
															</div>
														</div>
														<c:set var="exitId" value="0"></c:set>
													</c:if>
												</c:forEach>

											</div>
										</c:forEach>


									</div>




								</div>

							</div>



							<div class="am-tab-panel am-fade am-in" id="tab2">
								<div class="order-top">
									<div class="th th-item">
										<td class="td-inner">商品</td>
									</div>
									<div class="th th-price">
										<td class="td-inner">单价</td>
									</div>
									<div class="th th-number">
										<td class="td-inner">数量</td>
									</div>
									<div class="th th-operation">
										<td class="td-inner">商品操作</td>
									</div>
									<div class="th th-amount">
										<td class="td-inner">合计</td>
									</div>
									<div class="th th-status">
										<td class="td-inner">交易状态</td>
									</div>
									<div class="th th-change">
										<td class="td-inner">交易操作</td>
									</div>
								</div>

								<div class="order-main">
									<div class="order-list">

										<!--交易成功-->


										<c:forEach var="item" items="${map}">
											<div class="order-status5">

												<c:forEach items="${item.value}" var="l" end="${exitId1}">
													<c:if test="${l.orders.orders1=='1'}">
														<c:forEach items="${item.value}" var="kk" end="${exitId}">
															<c:if test="${kk.getOrders().getState()=='待付款' }">
																<div class="order-title">

																	<div class="dd-num">
																		订单编号：<a href="javascript:;">${item.key}</a>
																	</div>
																	<c:forEach items="${map2}" var="m">
																		<c:if test="${m.key==item.key}">
																			<span>成交时间：<fmt:formatDate value="${m.value}"
																					pattern="yyyy-MM-dd" /></span>
																		</c:if>

																	</c:forEach>






																	<!--    <em>店铺：小桔灯</em>-->
																</div>

																<div class="order-content">

																	<div class="order-left">
																		<c:forEach items="${item.value}" var="list">
																			<ul class="item-list">
																				<li class="td td-item">
																					<div class="item-pic">
																						<a href="product/getProduct/${list.products.id}"
																							class="J_MakePoint"> <img
																							src="${list.products.images}"
																							class="itempic J_ItemImg">
																						</a>
																					</div>
																					<div class="item-info">
																						<div class="item-basic-info">
																							<a href="product/getProduct/${list.products.id}">
																								<p>${list.producctname}</p>
																								<p class="info-little">${list.products.synopsis}
																									<br />包装：裸装
																								</p>
																							</a>
																						</div>
																					</div>
																				</li>
																				<li class="td td-price">
																					<div class="item-price">
																						${list.products.nowprice}</div>
																				</li>
																				<li class="td td-number">
																					<div class="item-number">
																						<span>×</span>${list.number}
																					</div>
																				</li>
																				<li class="td td-operation">
																					<div class="item-operation"></div>
																				</li>
																			</ul>
																		</c:forEach>
																	</div>
																	<div class="order-right">
																		<c:forEach var="mp3" items="${map3}">
																			<c:if test="${mp3.key==item.key}">

																				<ul>
																					<li class="td td-amount">
																						<div class="item-amount">
																							合计：${mp3.value[0]}
																							<p>
																								含运费：<span>${mp3.value[1]}</span>
																							</p>
																						</div>
																					</li>
																				</ul>
																				<div class="move-right">
																					<ul>
																						<c:if test="${mp3.value[2]==('待付款')}">
																							<li class="td td-status">
																								<div class="item-status">
																									<p class="Mystatus">等待买家付款</p>
																									<!-- 删除点单 -->
																									<p class="order-info">
																										<a onclick="cancel(${mp3.value[3]},this)">取消订单</a>
																									</p>

																								</div>
																							</li>
																							<li class="td td-change">

																								<p class="order-info">
																									<a
																										href="${APP_PATH}/pay/wait_pay?id=${mp3.value[3]}">一键支付</a>
																								</p>
																								<p class="order-info">
																									<a onclick="deleteOrder(${mp3.value[3]},this)">删除记录</a>
																								</p>
																							</li>
																						</c:if>

																					</ul>
																				</div>

																			</c:if>
																		</c:forEach>
																	</div>
																</div>
																<c:set var="exitId" value="0"></c:set>
															</c:if>
														</c:forEach>
														<c:set var="exitId1" value="0"></c:set>
													</c:if>
												</c:forEach>

											</div>
										</c:forEach>


									</div>




								</div>

							</div>
							<div class="am-tab-panel am-fade am-in" id="tab3">
								<div class="order-top">
									<div class="th th-item">
										<td class="td-inner">商品</td>
									</div>
									<div class="th th-price">
										<td class="td-inner">单价</td>
									</div>
									<div class="th th-number">
										<td class="td-inner">数量</td>
									</div>
									<div class="th th-operation">
										<td class="td-inner">商品操作</td>
									</div>
									<div class="th th-amount">
										<td class="td-inner">合计</td>
									</div>
									<div class="th th-status">
										<td class="td-inner">交易状态</td>
									</div>
									<div class="th th-change">
										<td class="td-inner">交易操作</td>
									</div>
								</div>

								<div class="order-main">
									<div class="order-list">

										<!--交易成功-->


										<c:forEach var="item" items="${map}">
											<div class="order-status5">

												<c:forEach items="${item.value}" var="l" end="${exitId1}">
													<c:if test="${l.orders.orders1=='1'}">
														<c:forEach items="${item.value}" var="kk" end="${exitId}">
															<c:if test="${kk.getOrders().getState()=='待发货' }">
																<div class="order-title">

																	<div class="dd-num">
																		订单编号：<a href="javascript:;">${item.key}</a>
																	</div>
																	<c:forEach items="${map2}" var="m">
																		<c:if test="${m.key==item.key}">
																			<span>成交时间：<fmt:formatDate value="${m.value}"
																					pattern="yyyy-MM-dd" /></span>
																		</c:if>

																	</c:forEach>






																	<!--    <em>店铺：小桔灯</em>-->
																</div>

																<div class="order-content">

																	<div class="order-left">
																		<c:forEach items="${item.value}" var="list">
																			<ul class="item-list">
																				<li class="td td-item">
																					<div class="item-pic">
																						<a href="product/getProduct/${list.products.id}"
																							class="J_MakePoint"> <img
																							src="${list.products.images}"
																							class="itempic J_ItemImg">
																						</a>
																					</div>
																					<div class="item-info">
																						<div class="item-basic-info">
																							<a href="product/getProduct/${list.products.id}">
																								<p>${list.producctname}</p>
																								<p class="info-little">${list.products.synopsis}
																									<br />包装：裸装
																								</p>
																							</a>
																						</div>
																					</div>
																				</li>
																				<li class="td td-price">
																					<div class="item-price">
																						${list.products.nowprice}</div>
																				</li>
																				<li class="td td-number">
																					<div class="item-number">
																						<span>×</span>${list.number}
																					</div>
																				</li>
																				<li class="td td-operation">
																					<div class="item-operation"></div>
																				</li>
																			</ul>
																		</c:forEach>
																	</div>
																	<div class="order-right">
																		<c:forEach var="mp3" items="${map3}">
																			<c:if test="${mp3.key==item.key}">

																				<ul>
																					<li class="td td-amount">
																						<div class="item-amount">
																							合计：${mp3.value[0]}
																							<p>
																								含运费：<span>${mp3.value[1]}</span>
																							</p>
																						</div>
																					</li>
																				</ul>
																				<div class="move-right">
																					<ul>
																						<c:if test="${mp3.value[2]==('待发货')}">
																							<li class="td td-status">
																								<div class="item-status">
																									<p class="Mystatus">买家已付款</p>
																									<!-- 删除点单 -->
																									<p class="order-info">
																										<a href="order/billlist">查看详情</a>
																									</p>


																								</div>
																							</li>
																							<li class="td td-change">
																								<p class="order-info">
																									<a onclick="remind()">提醒发货</a>
																								</p>
																								<p class="order-info">
																									<a onclick="deleteOrder(${mp3.value[3]},this)">删除记录</a>
																								</p>
																							</li>
																						</c:if>

																					</ul>
																				</div>

																			</c:if>
																		</c:forEach>
																	</div>
																</div>
																<c:set var="exitId" value="0"></c:set>
															</c:if>
														</c:forEach>
														<c:set var="exitId1" value="0"></c:set>
													</c:if>
												</c:forEach>

											</div>
										</c:forEach>


									</div>




								</div>

							</div>
							<div class="am-tab-panel am-fade am-in" id="tab4">
								<div class="order-top">
									<div class="th th-item">
										<td class="td-inner">商品</td>
									</div>
									<div class="th th-price">
										<td class="td-inner">单价</td>
									</div>
									<div class="th th-number">
										<td class="td-inner">数量</td>
									</div>
									<div class="th th-operation">
										<td class="td-inner">商品操作</td>
									</div>
									<div class="th th-amount">
										<td class="td-inner">合计</td>
									</div>
									<div class="th th-status">
										<td class="td-inner">交易状态</td>
									</div>
									<div class="th th-change">
										<td class="td-inner">交易操作</td>
									</div>
								</div>

								<div class="order-main">
									<div class="order-list">

										<!--交易成功-->


										<c:forEach var="item" items="${map}">
											<div class="order-status5">

												<c:forEach items="${item.value}" var="l" end="${exitId1}">
													<c:if test="${l.orders.orders1=='1'}">
														<c:forEach items="${item.value}" var="kk" end="${exitId}">
															<c:if test="${kk.getOrders().getState()=='待收货' }">
																<div class="order-title">

																	<div class="dd-num">
																		订单编号：<a href="javascript:;">${item.key}</a>
																	</div>
																	<c:forEach items="${map2}" var="m">
																		<c:if test="${m.key==item.key}">
																			<span>成交时间：<fmt:formatDate value="${m.value}"
																					pattern="yyyy-MM-dd" /></span>
																		</c:if>

																	</c:forEach>






																	<!--    <em>店铺：小桔灯</em>-->
																</div>

																<div class="order-content">

																	<div class="order-left">
																		<c:forEach items="${item.value}" var="list">
																			<ul class="item-list">
																				<li class="td td-item">
																					<div class="item-pic">
																						<a href="product/getProduct/${list.products.id}"
																							class="J_MakePoint"> <img
																							src="${list.products.images}"
																							class="itempic J_ItemImg">
																						</a>
																					</div>
																					<div class="item-info">
																						<div class="item-basic-info">
																							<a href="product/getProduct/${list.products.id}">
																								<p>${list.producctname}</p>
																								<p class="info-little">${list.products.synopsis}
																									<br />包装：裸装
																								</p>
																							</a>
																						</div>
																					</div>
																				</li>
																				<li class="td td-price">
																					<div class="item-price">
																						${list.products.nowprice}</div>
																				</li>
																				<li class="td td-number">
																					<div class="item-number">
																						<span>×</span>${list.number}
																					</div>
																				</li>
																				<li class="td td-operation">
																					<div class="item-operation"></div>
																				</li>
																			</ul>
																		</c:forEach>
																	</div>
																	<div class="order-right">
																		<c:forEach var="mp3" items="${map3}">
																			<c:if test="${mp3.key==item.key}">

																				<ul>
																					<li class="td td-amount">
																						<div class="item-amount">
																							合计：${mp3.value[0]}
																							<p>
																								含运费：<span>${mp3.value[1]}</span>
																							</p>
																						</div>
																					</li>
																				</ul>
																				<div class="move-right">
																					<ul>
																						<c:if test="${mp3.value[2]==('待收货')}">
																							<li class="td td-status">
																								<div class="item-status">
																									<p class="Mystatus">卖家已发货</p>
																									<!-- 删除点单 -->
																									<p class="order-info">
																										<a href="order/orderinfo">订单详情</a>
																									</p>
																									<p class="order-info">
																										<a href="order/logistics">查看物流</a>
																									</p>
																									<p class="order-info">


																										<c:if test="${mp3.value[4]==('0')}">
																											<a onclick="remindone(${mp3.value[3]},this)">延长收货</a>
																										</c:if>
																										<c:if test="${mp3.value[4]==('1')}">
																	   延长收货中
																	</c:if>
																									</p>
																								</div>
																							</li>
																							<li class="td td-change">

																								<p class="order-info">
																									<a onclick="suresh(${mp3.value[3]},2,this)">确认收货</a>
																								</p>
																								<p class="order-info">
																									<a onclick="deleteOrder(${mp3.value[3]},this)">删除记录</a>
																								</p>
																							</li>
																						</c:if>

																					</ul>
																				</div>

																			</c:if>
																		</c:forEach>
																	</div>
																</div>
																<c:set var="exitId" value="0"></c:set>
															</c:if>
														</c:forEach>
														<c:set var="exitId1" value="0"></c:set>
													</c:if>
												</c:forEach>

											</div>
										</c:forEach>


									</div>




								</div>

							</div>

							<div class="am-tab-panel am-fade am-in" id="tab5">
								<div class="order-top">
									<div class="th th-item">
										<td class="td-inner">商品</td>
									</div>
									<div class="th th-price">
										<td class="td-inner">单价</td>
									</div>
									<div class="th th-number">
										<td class="td-inner">数量</td>
									</div>
									<div class="th th-operation">
										<td class="td-inner">商品操作</td>
									</div>
									<div class="th th-amount">
										<td class="td-inner">合计</td>
									</div>
									<div class="th th-status">
										<td class="td-inner">交易状态</td>
									</div>
									<div class="th th-change">
										<td class="td-inner">交易操作</td>
									</div>
								</div>

								<div class="order-main">
									<div class="order-list">

										<!--交易成功-->


										<c:forEach var="item" items="${map}">
											<div class="order-status5">

												<c:forEach items="${item.value}" var="l" end="${exitId1}">
													<c:if test="${l.orders.orders1=='1'}">



														<c:forEach items="${item.value}" var="kk" end="${exitId}">

															<c:if test="${kk.getOrders().getState()=='待评价' }">


																<div class="order-title">

																	<div class="dd-num">
																		订单编号：<a href="javascript:;">${item.key}</a>
																	</div>
																	<c:forEach items="${map2}" var="m">
																		<c:if test="${m.key==item.key}">
																			<span>成交时间：<fmt:formatDate value="${m.value}"
																					pattern="yyyy-MM-dd" /></span>
																		</c:if>

																	</c:forEach>






																	<!--    <em>店铺：小桔灯</em>-->
																</div>

																<div class="order-content">

																	<div class="order-left">
																		<c:forEach items="${item.value}" var="list">
																			<ul class="item-list">
																				<li class="td td-item">
																					<div class="item-pic">
																						<a href="product/getProduct/${list.products.id}"
																							class="J_MakePoint"> <img
																							src="${list.products.images}"
																							class="itempic J_ItemImg">
																						</a>
																					</div>
																					<div class="item-info">
																						<div class="item-basic-info">
																							<a href="product/getProduct/${list.products.id}">
																								<p>${list.producctname}</p>
																								<p class="info-little">${list.products.synopsis}
																									<br />包装：裸装
																								</p>
																							</a>
																						</div>
																					</div>
																				</li>
																				<li class="td td-price">
																					<div class="item-price">
																						${list.products.nowprice}</div>
																				</li>
																				<li class="td td-number">
																					<div class="item-number">
																						<span>×</span>${list.number}
																					</div>
																				</li>
																				<li class="td td-operation">
																					<div class="item-operation"></div>
																				</li>
																			</ul>
																		</c:forEach>
																	</div>
																	<div class="order-right">
																		<c:forEach var="mp3" items="${map3}">
																			<c:if test="${mp3.key==item.key}">

																				<ul>
																					<li class="td td-amount">
																						<div class="item-amount">
																							合计：${mp3.value[0]}
																							<p>
																								含运费：<span>${mp3.value[1]}</span>
																							</p>
																						</div>
																					</li>
																				</ul>
																				<div class="move-right">
																					<ul>
																						<c:if test="${mp3.value[2]==('待评价')}">
																							<li class="td td-status">
																								<div class="item-status">
																									<p class="Mystatus">交易成功</p>
																									<!-- 删除点单 -->
																									<p class="order-info">
																										<a href="logistics.html">点单详情</a>
																									</p>
																									<p class="order-info">
																										<a href="order/logistics">查看物流</a>
																									</p>
																									<p class="order-info">
																										<a
																											href="order/selectorderdetailbyorderno/${mp3.value[3]}">申请退款</a>
																									</p>
																								</div>
																							</li>
																							<li class="td td-change">
																								<p class="order-info">
																									<a
																										href="order/selectproductbyid/${mp3.value[3]}">评价商品</a>
																								</p>
																								<p class="order-info">
																									<a onclick="deleteOrder(${mp3.value[3]},this)">删除记录</a>
																								</p>


																							</li>
																						</c:if>

																					</ul>
																				</div>

																			</c:if>
																		</c:forEach>
																	</div>
																</div>
																<c:set var="exitId" value="0"></c:set>
															</c:if>
														</c:forEach>
														<c:set var="exitId1" value="0"></c:set>
													</c:if>
												</c:forEach>

											</div>
										</c:forEach>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<script type="text/javascript">
				function deleteOrder(id, obj) {
					layer.confirm("确认删除吗", function() {
						$.ajax({
							url : "order/deleteorder/" + id,
							type : "POST",
							success : function(result) {
								if (result.code == 100) {
									layer.msg("删除成功");
									window.location.reload();
									$(obj).parents("div:.order-status5")
											.remove();

								}
							}
						});
					});
				}

				function suresh(id, n, obj) {
					layer.confirm("确认收货吗", function() {
						$.ajax({
							url : "${APP_PATH}/order/updatestate/" + id + "&"
									+ n,
							type : "POST",
							success : function(result) {
								if (result.code == 100) {
									layer.msg("感谢你的支持");
									$(obj).parents("div:.order-status5")
											.remove();
								}
							}
						});
					});
				}

				//提醒发货
				function remind() {
					layer.msg("亲！已通知卖家，请赖心等待");
				}

				//延长收货
				function remindone(id, obj) {
					layer.confirm("确认延长收货吗", function() {
						$.ajax({
							url : "order/updatetake/" + id,
							type : "POST",
							success : function(result) {
								if (result.code == 100) {
									layer.msg("亲！已经延长收货，请尽快领取你的快递");
									$(obj).parents("p:.order-info").append(
											" 延长收货中");
									$(obj).remove();
								}
							}
						});
					});
				}

				function cancel(id, obj) {
					layer.confirm("确认取消订单吗", function() {
						$.ajax({
							url : "order/deleteorder/" + id,
							type : "POST",
							success : function(result) {
								if (result.code == 100) {
									layer.msg("取消成功");
									$(obj).parents("div:.order-status5")
											.remove();
								}
							}
						});
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