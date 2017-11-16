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


<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

<title>我的足迹</title>

<link href="${APP_PATH}/static/css/admin.css" rel="stylesheet" type="text/css">
<link href="${APP_PATH}/static/css/amazeui.css" rel="stylesheet" type="text/css">

<link href="${APP_PATH}/static/css/personal.css" rel="stylesheet" type="text/css">
<link href="${APP_PATH}/static/css/footstyle.css" rel="stylesheet" type="text/css">

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

				<div class="user-foot">
					<!--标题 -->
					<div class="am-cf am-padding">
						<div class="am-fl am-cf">
							<strong class="am-text-danger am-text-lg">我的足迹</strong> / <small>Browser&nbsp;History</small>
						</div>
					</div>
					<hr />

					<!--足迹列表 -->

					<div class="goods">
						<div class="goods-date" data-date="2015-12-21">
							<span><i class="month-lite">12</i>.<i class="day-lite">21</i><i
								class="date-desc">今天</i></span>
							<del class="am-icon-trash"></del>
							<s class="line"></s>
						</div>

						<div class="goods-box first-box">
							<div class="goods-pic">
								<div class="goods-pic-box">
									<a class="goods-pic-link" target="_blank" href="#"
										title="意大利费列罗进口食品巧克力零食24粒  进口巧克力食品"> <img
										src="${APP_PATH}/static/images/TB1_pic.jpg_200x200.jpg" class="goods-img"></a>
								</div>
								<a class="goods-delete" href="javascript:void(0);"><i
									class="am-icon-trash"></i></a>
								<div class="goods-status goods-status-show">
									<span class="desc">宝贝已下架</span>
								</div>
							</div>

							<div class="goods-attr">
								<div class="good-title">
									<a class="title" href="#" target="_blank">意大利费列罗进口食品巧克力零食24粒
										进口巧克力食品</a>
								</div>
								<div class="goods-price">
									<span class="g_price"> <span>¥</span><strong>71</strong>
									</span> <span class="g_price g_price-original"> <span>¥</span><strong>142</strong>
									</span>
								</div>
								<div class="clear"></div>
								<div class="goods-num">
									<div class="match-recom">
										<a href="#" class="match-recom-item">找相似</a> <a href="#"
											class="match-recom-item">找搭配</a> <i><em></em><span></span></i>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div class="goods">
						<div class="goods-date" data-date="2015-12-21">
							<s class="line"></s>
						</div>

						<div class="goods-box">
							<div class="goods-pic">
								<div class="goods-pic-box">
									<a class="goods-pic-link" target="_blank" href="#"
										title="意大利费列罗进口食品巧克力零食24粒  进口巧克力食品"> <img
										src="${APP_PATH}/static/images/TB1_pic.jpg_200x200.jpg" class="goods-img"></a>
								</div>
								<a class="goods-delete" href="javascript:void(0);"><i
									class="am-icon-trash"></i></a>
								<div class="goods-status goods-status-show">
									<span class="desc">宝贝已下架</span>
								</div>
							</div>

							<div class="goods-attr">
								<div class="good-title">
									<a class="title" href="#" target="_blank">意大利费列罗进口食品巧克力零食24粒
										进口巧克力食品</a>
								</div>
								<div class="goods-price">
									<span class="g_price"> <span>¥</span><strong>71</strong>
									</span> <span class="g_price g_price-original"> <span>¥</span><strong>142</strong>
									</span>
								</div>
								<div class="clear"></div>
								<div class="goods-num">
									<div class="match-recom">
										<a href="#" class="match-recom-item">找相似</a> <a href="#"
											class="match-recom-item">找搭配</a> <i><em></em><span></span></i>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div class="goods">
						<div class="goods-date" data-date="2015-12-21">
							<s class="line"></s>
						</div>

						<div class="goods-box">
							<div class="goods-pic">
								<div class="goods-pic-box">
									<a class="goods-pic-link" target="_blank" href="#"
										title="意大利费列罗进口食品巧克力零食24粒  进口巧克力食品"> <img
										src="${APP_PATH}/static/images/TB1_pic.jpg_200x200.jpg" class="goods-img"></a>
								</div>
								<a class="goods-delete" href="javascript:void(0);"><i
									class="am-icon-trash"></i></a>
								<div class="goods-status goods-status-show">
									<span class="desc">宝贝已下架</span>
								</div>
							</div>

							<div class="goods-attr">
								<div class="good-title">
									<a class="title" href="#" target="_blank">意大利费列罗进口食品巧克力零食24粒
										进口巧克力食品</a>
								</div>
								<div class="goods-price">
									<span class="g_price"> <span>¥</span><strong>71</strong>
									</span> <span class="g_price g_price-original"> <span>¥</span><strong>142</strong>
									</span>
								</div>
								<div class="clear"></div>
								<div class="goods-num">
									<div class="match-recom">
										<a href="#" class="match-recom-item">找相似</a> <a href="#"
											class="match-recom-item">找搭配</a> <i><em></em><span></span></i>
									</div>
								</div>
							</div>
						</div>
					</div>

					<div class="goods">
						<div class="goods-date" data-date="2015-12-21">
							<s class="line"></s>
						</div>

						<div class="goods-box">
							<div class="goods-pic">
								<div class="goods-pic-box">
									<a class="goods-pic-link" target="_blank" href="#"
										title="意大利费列罗进口食品巧克力零食24粒  进口巧克力食品"> <img
										src="${APP_PATH}/static/images/TB1_pic.jpg_200x200.jpg" class="goods-img"></a>
								</div>
								<a class="goods-delete" href="javascript:void(0);"><i
									class="am-icon-trash"></i></a>
								<div class="goods-status goods-status-show">
									<span class="desc">宝贝已下架</span>
								</div>
							</div>

							<div class="goods-attr">
								<div class="good-title">
									<a class="title" href="#" target="_blank">意大利费列罗进口食品巧克力零食24粒
										进口巧克力食品</a>
								</div>
								<div class="goods-price">
									<span class="g_price"> <span>¥</span><strong>71</strong>
									</span> <span class="g_price g_price-original"> <span>¥</span><strong>142</strong>
									</span>
								</div>
								<div class="clear"></div>
								<div class="goods-num">
									<div class="match-recom">
										<a href="#" class="match-recom-item">找相似</a> <a href="#"
											class="match-recom-item">找搭配</a> <i><em></em><span></span></i>
									</div>
								</div>
							</div>
						</div>
					</div>


					<div class="goods">
						<div class="goods-date" data-date="2015-12-21">
							<s class="line"></s>
						</div>

						<div class="goods-box">
							<div class="goods-pic">
								<div class="goods-pic-box">
									<a class="goods-pic-link" target="_blank" href="#"
										title="意大利费列罗进口食品巧克力零食24粒  进口巧克力食品"> <img
										src="${APP_PATH}/static/images/TB1_pic.jpg_200x200.jpg" class="goods-img"></a>
								</div>
								<a class="goods-delete" href="javascript:void(0);"><i
									class="am-icon-trash"></i></a>
								<div class="goods-status goods-status-show">
									<span class="desc">宝贝已下架</span>
								</div>
							</div>

							<div class="goods-attr">
								<div class="good-title">
									<a class="title" href="#" target="_blank">意大利费列罗进口食品巧克力零食24粒
										进口巧克力食品</a>
								</div>
								<div class="goods-price">
									<span class="g_price"> <span>¥</span><strong>71</strong>
									</span> <span class="g_price g_price-original"> <span>¥</span><strong>142</strong>
									</span>
								</div>
								<div class="clear"></div>
								<div class="goods-num">
									<div class="match-recom">
										<a href="#" class="match-recom-item">找相似</a> <a href="#"
											class="match-recom-item">找搭配</a> <i><em></em><span></span></i>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="clear"></div>
					<div class="goods">
						<div class="goods-date" data-date="2015-12-17">
							<span><i class="month-lite"></i><i class="day-lite"></i> <i
								class="date-desc">一周内</i></span>
							<del class="am-icon-trash"></del>
							<s class="line"></s>
						</div>
						<div class="goods-box">
							<div class="goods-pic">
								<div class="goods-pic-box">
									<a class="goods-pic-link" target="_blank" href="#"
										title="意大利费列罗进口食品巧克力零食24粒  进口巧克力食品"> <img
										src="${APP_PATH}/static/images/TB1_pic.jpg_200x200.jpg"
										class="goods-img"></a>
								</div>
								<a class="goods-delete" href="javascript:void(0);"><i
									class="am-icon-trash"></i></a>
								<div class="goods-status goods-status-show">
									<span class="desc">宝贝已下架</span>
								</div>
							</div>

							<div class="goods-attr">
								<div class="good-title">
									<a class="title" href="#" target="_blank">意大利费列罗进口食品巧克力零食24粒
										进口巧克力食品</a>
								</div>
								<div class="goods-price">
									<span class="g_price"> <span>¥</span><strong>71</strong>
									</span> <span class="g_price g_price-original"> <span>¥</span><strong>142</strong>
									</span>
								</div>
								<div class="clear"></div>
								<div class="goods-num">
									<div class="match-recom">
										<a href="#" class="match-recom-item">找相似</a> <a href="#"
											class="match-recom-item">找搭配</a> <i><em></em><span></span></i>
									</div>
								</div>
							</div>
						</div>
					</div>


				</div>
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
