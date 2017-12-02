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

<title>购物商城</title>

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
<link href="${APP_PATH}/static/css/systyle.css" rel="stylesheet"
	type="text/css">
<script src="${APP_PATH}/static/js/jquery.min.js"></script>
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
				<div class="wrap-left">
					<div class="wrap-list">
						<div class="m-user">
							<!--个人信息 -->
							<div class="m-bg"></div>
							<div class="m-userinfo">
								<div class="m-baseinfo">
									<a href="${APP_PATH}/safety/skipinformation1"> <img
										src="${APP_PATH}/static/images/getAvatar.do.jpg">
									</a> <em class="s-name"><font color="black">(${users.account})</font><span
										class="vip1"></em>
									<div class="s-prestige am-btn am-round">
										</span><font color="black" id="level"></font>
									</div>
									<div class="u-safety">
								当前积分 <span class="u-profile"><i class="bc_ee0000"
									style="width: 60px;" width="0" id="numid"></i></span>
							</div>
								</div>
								<div class="m-right">
									<div class="m-new">
										<a href="javascript:#"><i class="am-icon-bell-o"></i><font
											color="black">消息</font></a>
									</div>
									<div class="m-address">
										<a
											href="${APP_PATH}/address/selectallshoppingaddress/${users.id}"
											class="i-trigger"><font color="black">我的收货地址</font></a>
									</div>
								</div>
							</div>
						</div>
						<div class="box-container-bottom"></div>

						<!--订单 -->
						<div class="m-order">
							<div class="s-bar">
								<i class="s-icon"></i>我的订单 <a class="i-load-more-item-shadow"
									href="${APP_PATH}/order/selectallorder/${users.id}">全部订单</a>
							</div>
							<ul>
								<li><a href="javascript:#"><i><img
											src="${APP_PATH}/static/images/pay.png" /></i><span>待付款<em
											class="m-num" id="orderNum1"></em></span></a></li>
								<li><a href="javascript:#"><i><img
											src="${APP_PATH}/static/images/send.png" /></i><span>待发货<em
											class="m-num" id="orderNum2"></em></span></a></li>
								<li><a href="javascript:#"><i><img
											src="${APP_PATH}/static/images/receive.png" /></i><span>待收货<em
											class="m-num" id="orderNum3"></em></span></a></li>
								<li><a href="javascript:#"><i><img
											src="${APP_PATH}/static/images/comment.png" /></i><span>待评价<em
											class="m-num" id="orderNum4"></em></span></a></li>
							</ul>
						</div>
						<!--物流 -->
						<div class="m-logistics">

							<div class="s-bar">
								<i class="s-icon"></i>我的物流
							</div>
							<div class="s-content">
								<ul class="lg-list">

									<li class="lg-item">
										<div class="item-info">
											<a href="#"> <img
												src="${APP_PATH}/static/images/65.jpg_120x120xz.jpg"
												alt="抗严寒冬天保暖隔凉羊毛毡底鞋垫超薄0.35厘米厚吸汗排湿气舒适">
											</a>

										</div>
										<div class="lg-info">

											<p>快件已从 义乌 发出</p>
											<time>2015-12-20 17:58:05</time>

											<div class="lg-detail-wrap">
												<a class="lg-detail i-tip-trigger" href="logistics.html">查看物流明细</a>
												<div class="J_TipsCon hide">
													<div class="s-tip-bar">中通快递&nbsp;&nbsp;&nbsp;&nbsp;运单号：373269427686</div>
													<div class="s-tip-content">
														<ul>
															<li>快件已从 义乌 发出2015-12-20 17:58:05</li>
															<li>义乌 的 义乌总部直发车 已揽件2015-12-20 17:54:49</li>
															<li class="s-omit"><a
																data-spm-anchor-id="a1z02.1.1998049142.3"
																target="_blank" href="#">··· 查看全部</a></li>
															<li>您的订单开始处理2015-12-20 08:13:48</li>

														</ul>
													</div>
												</div>
											</div>

										</div>
										<div class="lg-confirm">
											<a class="i-btn-typical" href="#">确认收货</a>
										</div>
									</li>
									<div class="clear"></div>

									<li class="lg-item">
										<div class="item-info">
											<a href="#"> <img
												src="${APP_PATH}/static/images/88.jpg_120x120xz.jpg"
												alt="礼盒袜子女秋冬 纯棉袜加厚 女式中筒袜子 韩国可爱 女袜 女棉袜">
											</a>

										</div>
										<div class="lg-info">

											<p>已签收,签收人是青年城签收</p>
											<time>2015-12-19 15:35:42</time>

											<div class="lg-detail-wrap">
												<a class="lg-detail i-tip-trigger" href="logistics.html">查看物流明细</a>
												<div class="J_TipsCon hide">
													<div class="s-tip-bar">天天快递&nbsp;&nbsp;&nbsp;&nbsp;运单号：666287461069</div>
													<div class="s-tip-content">
														<ul>

															<li>已签收,签收人是青年城签收2015-12-19 15:35:42</li>
															<li>【光谷关山分部】的派件员【关山代派】正在派件 电话:*2015-12-19 14:27:28</li>
															<li class="s-omit"><a
																data-spm-anchor-id="a1z02.1.1998049142.7"
																target="_blank"
																href="//wuliu.taobao.com/user/order_detail_new.htm?spm=a1z02.1.1998049142.7.8BJBiJ&amp;trade_id=1479374251166800&amp;seller_id=1651462988&amp;tracelog=yimaidaologistics">···
																	查看全部</a></li>
															<li>您的订单开始处理2015-12-17 14:27:50</li>

														</ul>
													</div>
												</div>
											</div>

										</div>
										<div class="lg-confirm">
											<a class="i-btn-typical" href="#">确认收货</a>
										</div>
									</li>

								</ul>

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
	<!--引导 -->
	<div class="navCir">
		<li><a href="../home/home.html"><i class="am-icon-home "></i>首页</a></li>
		<li><a href="../home/sort.html"><i class="am-icon-list"></i>分类</a></li>
		<li><a href="../home/shopcart.html"><i
				class="am-icon-shopping-basket"></i>购物车</a></li>
		<li class="active"><a href="index.html"><i
				class="am-icon-user"></i>我的</a></li>
	</div>

	<script type="text/javascript">
		$(function() {
			orderInfo();
			//发送请求获取
			$.ajax({
				url : "${APP_PATH}/info/selectinformation",
				data : {
					"usersid" : ${users.id}
				},
				type : "GET",
				success : function(result) {
					var rel = result.extend.shopInfo;
					$("#level").append(rel.level);
					$("#numid").text(rel.integral.currentintegral + '分');
		}
			});
		});

		function orderInfo() {
			$.ajax({
				url : "${APP_PATH}/order/queryOrderInfoByUserId",
				data : {
					"usersid" : ${users.id}
				},
				type : "GET",
				success : function(result) {
					$("#orderNum1").empty();
					$("#orderNum2").empty();
					$("#orderNum3").empty();
					$("#orderNum4").empty();
					var order = result.extend.orderInfo;
					$("#orderNum1").append(order[0]);
					$("#orderNum2").append(order[1]);
					$("#orderNum3").append(order[2]);
					$("#orderNum4").append(order[3]);
				}
			});
		}
	</script>
</body>
</html>