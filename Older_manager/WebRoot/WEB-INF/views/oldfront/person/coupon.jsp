<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	pageContext.setAttribute("APP_PATH", request.getContextPath());
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'coupon.jsp' starting page</title>

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
<link href="${APP_PATH}/static/css/cpstyle.css" rel="stylesheet"
	type="text/css">

<script src="${APP_PATH}/static/js/jquery.min.js"></script>
<script src="${APP_PATH}/static/js/amazeui.js"></script>
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

				<div class="user-coupon">
					<!--标题 -->
					<div class="am-cf am-padding">
						<div class="am-fl am-cf">
							<strong class="am-text-danger am-text-lg">优惠券</strong> / <small>Coupon</small>
						</div>
					</div>
					<hr />

					<div class="am-tabs-d2 am-tabs  am-margin" data-am-tabs>

						<ul class="am-avg-sm-2 am-tabs-nav am-nav am-nav-tabs">
							<li class="am-active"><a href="#tab1">可用优惠券</a></li>
							<li><a href="#tab2">已用/过期优惠券</a></li>

						</ul>

						<div class="am-tabs-bd">
							<div class="am-tab-panel am-fade am-in am-active" id="tab1">
								<div class="coupon-items">
									<div class="coupon-item coupon-item-d">
										<div class="coupon-list">
											<div class="c-type">
												<div class="c-class">
													<strong>购物券</strong>
												</div>
												<div class="c-price">
													<strong>￥8</strong>
												</div>
												<div class="c-limit">【消费满&nbsp;95元&nbsp;可用】</div>
												<div class="c-time">
													<span>使用期限</span>2015-12-21--2015-12-31
												</div>
												<div class="c-type-top"></div>

												<div class="c-type-bottom"></div>
											</div>

											<div class="c-msg">
												<div class="c-range">
													<div class="range-all">
														<div class="range-item">
															<span class="label">券&nbsp;编&nbsp;号：</span> <span
																class="txt">35730144</span>
														</div>
													</div>
												</div>
												<div class="op-btns">
													<a href="#" class="btn"><span class="txt">立即使用</span><b></b></a>
												</div>
											</div>
										</div>
									</div>
									<div class="coupon-item coupon-item-yf">
										<div class="coupon-list">
											<div class="c-type">
												<div class="c-class">
													<strong>运费券</strong>
												</div>
												<div class="c-price">
													<strong>可抵运费</strong>
												</div>
												<div class="c-limit">【不含偏远地区】</div>
												<div class="c-time">
													<span>使用期限</span>2015-12-21--2015-12-31
												</div>
												<div class="c-type-top"></div>

												<div class="c-type-bottom"></div>
											</div>

											<div class="c-msg">
												<div class="c-range">
													<div class="range-all">
														<div class="range-item">
															<span class="label">券&nbsp;编&nbsp;号：</span> <span
																class="txt">35728267</span>
														</div>
													</div>

												</div>
												<div class="op-btns">
													<a href="#" class="btn"><span class="txt">立即使用</span><b></b></a>
												</div>
											</div>
										</div>
									</div>
								</div>

							</div>
							<div class="am-tab-panel am-fade" id="tab2">
								<div class="coupon-items">
									<div class="coupon-item coupon-item-d">
										<div class="coupon-list">
											<div class="c-type">
												<div class="c-class">
													<strong>购物券</strong> <span class="am-icon-trash"></span>
												</div>
												<div class="c-price">
													<strong>￥8</strong>
												</div>
												<div class="c-limit">【消费满&nbsp;95元&nbsp;可用】</div>
												<div class="c-time">
													<span>使用期限</span>2015-12-21--2015-12-31
												</div>
												<div class="c-type-top"></div>

												<div class="c-type-bottom"></div>
											</div>

											<div class="c-msg">
												<div class="c-range">
													<div class="range-all">
														<div class="range-item">
															<span class="label">券&nbsp;编&nbsp;号：</span> <span
																class="txt">35730144</span>
														</div>
													</div>
												</div>
												<div class="op-btns c-del">
													<a href="#" class="btn"><span class="txt">删除</span><b></b></a>
												</div>
											</div>

											<li class="td td-usestatus ">
												<div class="item-usestatus ">
													<span><img
														src="${APP_PATH}/static/images/gift_stamp_31.png"></span>
												</div>
											</li>
										</div>
									</div>
									<div class="coupon-item coupon-item-yf">
										<div class="coupon-list">
											<div class="c-type">
												<div class="c-class">
													<strong>运费券</strong> <span class="am-icon-trash"></span>
												</div>
												<div class="c-price">
													<strong>可抵运费</strong>
												</div>
												<div class="c-limit">【不含偏远地区】</div>
												<div class="c-time">
													<span>使用期限</span>2015-12-21--2015-12-31
												</div>
												<div class="c-type-top"></div>

												<div class="c-type-bottom"></div>
											</div>

											<div class="c-msg">
												<div class="c-range">
													<div class="range-all">
														<div class="range-item">
															<span class="label">券&nbsp;编&nbsp;号：</span> <span
																class="txt">35728267</span>
														</div>
													</div>

												</div>
												<div class="op-btns c-del">
													<a href="#" class="btn"><span class="txt">删除</span><b></b></a>
												</div>
											</div>
											<li class="td td-usestatus ">
												<div class="item-usestatus ">
													<span><img
														src="${APP_PATH}/static/images/gift_stamp_21.png"></span>
												</div>
											</li>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!--底部-->
			<jsp:include page="footer.jsp"></jsp:include>
		</div>
		<jsp:include page="left.jsp"></jsp:include>
	</div>
</body>
</html>