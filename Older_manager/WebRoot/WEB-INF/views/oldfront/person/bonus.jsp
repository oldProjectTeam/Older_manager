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

<title>My JSP 'bonus.jsp' starting page</title>

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
<link href="${APP_PATH}/static/css/bostyle.css" rel="stylesheet"
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

				<div class="user-bonus">
					<!--标题 -->
					<div class="am-cf am-padding">
						<div class="am-fl am-cf">
							<strong class="am-text-danger am-text-lg">红包</strong> / <small>Bonus</small>
						</div>
					</div>
					<hr />

					<div class="am-tabs-d2 am-tabs  am-margin" data-am-tabs>

						<ul class="am-avg-sm-2 am-tabs-nav am-nav am-nav-tabs">
							<li class="am-active"><a href="#tab1">可用红包</a></li>
							<li><a href="#tab2">已用/过期红包</a></li>

						</ul>

						<div class="am-tabs-bd">
							<div class="am-tab-panel am-fade am-in am-active" id="tab1">

								<div class="cart-table-th">
									<div class="order-top">
										<div class="th th-from">来源</div>
										<div class="th th-remainderprice">剩余金额</div>
										<div class="th th-term">有效期</div>
										<div class="th th-usestatus">使用状态</div>
									</div>
									<div class="clear"></div>
									<div class="order-main">

										<ul class="item-list">
											<li class="td td-from">
												<div class="item-img">
													<img src="${APP_PATH}/static/images/566fda5cN4b8a1675.gif">
												</div>

												<div class="item-info">

													<a href="#">
														<p>蓝胖子赠与</p>
														<p class="info-little ">
															<span>红包初始面额：</span>¥50.00<span>元</span>
														</p>
													</a>

												</div>
											</li>
											<li class="td td-remainderprice">
												<div class="item-remainderprice">
													<span>还剩</span>10.40<span>元</span>
												</div>
											</li>

											<li class="td td-term ">
												<div class="item-term">
													<span>有效期</span> 2015.12.26-2016.2.1
												</div>
											</li>

											<li class="td td-usestatus ">
												<div class="item-usestatus ">
													<p>可使用</p>
													<span><img
														src="${APP_PATH}/static/images/gift_stamp_1.png"></span>
												</div>
											</li>
										</ul>

									</div>
								</div>
							</div>
							<div class="am-tab-panel am-fade" id="tab2">

								<div class="cart-table-th">
									<div class="order-top">
										<div class="th th-from">来源</div>
										<div class="th th-remainderprice">剩余金额</div>
										<div class="th th-term">有效期</div>
										<div class="th th-usestatus">使用状态</div>
									</div>
									<div class="clear"></div>
									<div class="order-main">

										<ul class="item-list">
											<li class="td td-from">
												<div class="item-img">
													<img src="${APP_PATH}/static/images/566fda5cN4b8a1675.gif">
												</div>

												<div class="item-info">

													<a href="# ">
														<p>蓝胖子赠与</p>
														<p class="info-little ">
															<span>红包初始面额：</span>¥50.00<span>元</span>
														</p>
													</a>

												</div>
											</li>
											<li class="td td-remainderprice">
												<div class="item-remainderprice">
													<span>还剩</span>0.00<span>元</span>
												</div>
											</li>

											<li class="td td-term ">
												<div class="item-term">
													<span>有效期</span> 2015.12.26-2016.2.1
												</div>
											</li>

											<li class="td td-usestatus ">
												<div class="item-usestatus ">
													<p>已用完</p>
													<span><img
														src="${APP_PATH}/static/images/gift_stamp_2.png"></span>
												</div>
											</li>
										</ul>

										<!--已过期-->
										<ul class="item-list">

											<li class="td td-from">
												<div class="item-img">
													<img src="${APP_PATH}/static/images/566fda5cN4b8a1675.gif">
												</div>

												<div class="item-info">

													<a href="# ">
														<p>蓝胖子赠与</p>
														<p class="info-little ">
															<span>红包初始面额：</span>¥50.00<span>元</span>
														</p>
													</a>

												</div>
											</li>
											<li class="td td-remainderprice">
												<div class="item-remainderprice">
													<span>还剩</span>50.00<span>元</span>
												</div>
											</li>

											<li class="td td-term ">
												<div class="item-term">
													<span>有效期</span> 2015.12.26-2016.2.1
												</div>
											</li>

											<li class="td td-usestatus ">
												<div class="item-usestatus ">
													<p>已过期</p>
													<span><img
														src="${APP_PATH}/static/images/gift_stamp_3.png"></span>
												</div>
											</li>
										</ul>



									</div>

								</div>
							</div>

						</div>
					</div>
				</div>
			</div>
			<!--底部-->
			<div class="footer ">
				<div class="footer-hd ">
					<p>
						<a href="# ">恒望科技</a> <b>|</b> <a href="# ">商城首页</a> <b>|</b> <a
							href="# ">支付宝</a> <b>|</b> <a href="# ">物流</a>
					</p>
				</div>
				<div class="footer-bd ">
					<p>
						<a href="# ">关于恒望</a> <a href="# ">合作伙伴</a> <a href="# ">联系我们</a>
						<a href="# ">网站地图</a> <em>© 2015-2025 Hengwang.com 版权所有</em>
					</p>
				</div>
			</div>

		</div>

		<jsp:include page="left.jsp"></jsp:include>
	</div>

</body>

</html>