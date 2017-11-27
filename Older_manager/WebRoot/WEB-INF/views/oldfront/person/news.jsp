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

<title>My JSP 'news.jsp' starting page</title>

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
<link href="${APP_PATH}/static/css/newstyle.css" rel="stylesheet"
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

				<div class="user-news">

					<!--标题 -->
					<div class="am-cf am-padding">
						<div class="am-fl am-cf">
							<strong class="am-text-danger am-text-lg">我的消息</strong> / <small>News</small>
						</div>
					</div>
					<hr />

					<div class="am-tabs am-tabs-d2" data-am-tabs>
						<ul class="am-avg-sm-3 am-tabs-nav am-nav am-nav-tabs">
							<li class="am-active"><a href="#tab1">商城活动</a></li>
							<li><a href="#tab2">物流助手</a></li>
							<li><a href="#tab3">交易信息</a></li>

						</ul>

						<div class="am-tabs-bd">
							<div class="am-tab-panel am-fade am-in am-active" id="tab1">

								<div class="news-day">
									<div class="goods-date" data-date="2015-12-21">
										<span><i class="month-lite">12</i>.<i class="day-lite">21</i>
											<i class="date-desc">今天</i></span>
									</div>

									<!--消息 -->
									<div class="s-msg-item s-msg-temp i-msg-downup">
										<h6 class="s-msg-bar">
											<span class="s-name">每日新鲜事</span>
										</h6>
										<div class="s-msg-content i-msg-downup-wrap">
											<div class="i-msg-downup-con">
												<a class="i-markRead" target="_blank" href="blog.html">
													<img src="${APP_PATH}/static/images/TB102.jpg">
													<p class="s-main-content">最特色的湖北年货都在这儿 ~快来囤年货啦！</p>
													<p class="s-row s-main-content">
														<a href="blog.html"> 阅读全文 <i
															class="am-icon-angle-right"></i>
														</a>
													</p>
												</a>
											</div>
										</div>
										<a class="i-btn-forkout" href="#"><i
											class="am-icon-close am-icon-fw"></i></a>
									</div>
								</div>
							</div>

							<div class="am-tab-panel am-fade" id="tab2">
								<!--消息 -->
								<div class="s-msg-item s-msg-temp i-msg-downup">
									<h6 class="s-msg-bar">
										<span class="s-name">订单已签收</span>
									</h6>
									<div class="s-msg-content i-msg-downup-wrap">
										<div class="i-msg-downup-con">
											<a class="i-markRead" target="_blank" href="logistics.html">
												<div class="m-item">
													<div class="item-pic">
														<img src="${APP_PATH}/static/images/kouhong.jpg_80x80.jpg"
															class="itempic J_ItemImg">
													</div>
													<div class="item-info">您购买的美康粉黛醉美唇膏已签收，
														快递单号:373269427868</div>

												</div>

												<p class="s-row s-main-content">
													查看详情 <i class="am-icon-angle-right"></i>
												</p>
											</a>
										</div>
									</div>
									<a class="i-btn-forkout" href="#"><i
										class="am-icon-close am-icon-fw"></i></a>
								</div>
							</div>

							<div class="am-tab-panel am-fade" id="tab3">
								<!--消息 -->
								<div class="s-msg-item s-msg-temp i-msg-downup">
									<h6 class="s-msg-bar">
										<span class="s-name">卖家已退款&nbsp;¥12.90元</span>
									</h6>
									<div class="s-msg-content i-msg-downup-wrap">
										<div class="i-msg-downup-con">
											<a class="i-markRead" target="_blank" href="record.html">
												<div class="m-item">
													<div class="item-pic">
														<img src="${APP_PATH}/static/images/kouhong.jpg_80x80.jpg"
															class="itempic J_ItemImg">
													</div>
													<div class="item-info">
														<p class="item-comment">您购买的美康粉黛醉美唇膏卖家已退款</p>
														<p class="item-time">2015-12-21&nbsp;17:38:29</p>
													</div>

												</div>

												<p class="s-row s-main-content">
													<a href="record.html">钱款去向</a> <i
														class="am-icon-angle-right"></i>
												</p>
											</a>
										</div>
									</div>
									<a class="i-btn-forkout" href="#"><i
										class="am-icon-close am-icon-fw"></i></a>
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