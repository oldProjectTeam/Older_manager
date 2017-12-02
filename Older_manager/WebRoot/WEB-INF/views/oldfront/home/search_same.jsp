<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

<title>My JSP 'search.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="${APP_PATH}/static/css/amazeui.css" rel="stylesheet"
	type="text/css" />
<link href="${APP_PATH}/static/css/admin.css" rel="stylesheet"
	type="text/css" />

<link href="${APP_PATH}/static/css/demo.css" rel="stylesheet"
	type="text/css" />

<link href="${APP_PATH}/static/css/seastyle.css" rel="stylesheet"
	type="text/css" />
<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="${APP_PATH}/static/js/script.js"></script>
<script src="${APP_PATH}/lib/layer/2.4/layer.js"></script>
</head>
<body>
	<jsp:include page="shopheader.jsp"></jsp:include>
	<b class="line"></b>
	<div class="search">
		<div class="search-list">
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
						<i class="am-icon-user-secret am-icon-md nav-user"></i><b></b>我的福利
						<i class="am-icon-angle-right" style="padding-left: 10px;"></i>
					</div>
				</div>
			</div>


			<div class="am-g am-g-fixed">
				<div class="am-u-sm-12 am-u-md-12">
					<div class="theme-popover">

						<div class="clear"></div>
					</div>
					<div class="search-content">
						<div class="sort">
							<li class="first"><a title="综合" id="composite"
								imgTilte="${title}">综合排序</a></li>
							<li><a title="销量" id="seale" imgTilte="${title}">销量排序</a></li>
							<li><a title="价格" id="prices" imgTilte="${title}">价格优先</a></li>
						</div>
						<div class="clear"></div>
						<!-- 商品内容信息展示 -->
						<ul
							class="am-avg-sm-2 am-avg-md-3 am-avg-lg-4 boxes products_info">
							<c:forEach items="${pageInfo.list}" var="productsinfo">

								<li>
									<div class="i-pic limit">
										<img
											src="http://123.207.93.53/Older_back/${ productsinfo.images}" />
										<p class="title fl" id="img_title">${productsinfo.imagetitle }</p>
										<p class="price fl">
											<b>¥</b> <strong>${productsinfo.nowprice }</strong>
										</p>
										<p class="number fl">
											销量<span>${productsinfo.sales }</span>
										</p>
									</div>
								</li>
							</c:forEach>
						</ul>
					</div>
					<div class="clear"></div>
					<!--分页 -->
					<div id="page_info">
						<ul class="am-pagination am-pagination-right">

							<c:if test="${pageInfo.hasPreviousPage}">
								<li><a
									href="${APP_PATH}/dimquery/${title}&${pageInfo.pageNum-1}">&laquo;</a></li>
							</c:if>

							<c:forEach items="${pageInfo.navigatepageNums}" var="page">
								<c:if test="${page==pageInfo.pageNum}">
									<li class="active"><a
										href="${APP_PATH}/dimquery/${title}&${pageInfo.pageNum}">${page}</a></li>
								</c:if>
								<c:if test="${page!=pageInfo.pageNum}">
									<li><a href="${APP_PATH}/dimquery/${title}&${page}">${page}</a></li>
								</c:if>
							</c:forEach>
							<c:if test="${pageInfo.hasNextPage}">
								<li><a
									href="${APP_PATH}/dimquery/${title}&${pageInfo.pageNum+1}">&raquo;</a></li>
							</c:if>

						</ul>
					</div>

				</div>
			</div>
			<jsp:include page="../person/footer.jsp"></jsp:include>
		</div>
	</div>
	<!--引导 -->
	<div class="navCir">
		<li><a href="home.html"><i class="am-icon-home "></i>首页</a></li>
		<li><a href="sort.html"><i class="am-icon-list"></i>分类</a></li>
		<li><a href="shopcart.html"><i
				class="am-icon-shopping-basket"></i>购物车</a></li>
		<li><a href="../person/index.html"><i class="am-icon-user"></i>我的</a></li>
	</div>
	<!--菜单 -->
	<div class=tip>
		<div id="sidebar">
			<div id="wrap">
				<div id="prof" class="item">
					<a href="#"> <span class="setting"></span>
					</a>
					<div class="ibar_login_box status_login">
						<div class="avatar_box">
							<p class="avatar_imgbox">
								<img src="${APP_PATH}/static/images/no-img_mid_.jpg" />
							</p>
							<ul class="user_info">
								<li>用户名：sl1903</li>
								<li>级&nbsp;别：普通会员</li>
							</ul>
						</div>
						<div class="login_btnbox">
							<a href="#" class="login_order">我的订单</a> <a href="#"
								class="login_favorite">我的收藏</a>
						</div>
						<i class="icon_arrow_white"></i>
					</div>

				</div>
				<div id="shopCart" class="item">
					<a href="#"> <span class="message"></span>
					</a>
					<p>购物车</p>
					<p class="cart_num">0</p>
				</div>
				<div id="asset" class="item">
					<a href="#"> <span class="view"></span>
					</a>
					<div class="mp_tooltip">
						我的资产 <i class="icon_arrow_right_black"></i>
					</div>
				</div>

				<div id="foot" class="item">
					<a href="#"> <span class="zuji"></span>
					</a>
					<div class="mp_tooltip">
						我的足迹 <i class="icon_arrow_right_black"></i>
					</div>
				</div>

				<div id="brand" class="item">
					<a href="#"> <span class="wdsc"><img
							src="${APP_PATH}/static/images/wdsc.png" /></span>
					</a>
					<div class="mp_tooltip">
						我的收藏 <i class="icon_arrow_right_black"></i>
					</div>
				</div>

				<div id="broadcast" class="item">
					<a href="#"> <span class="chongzhi"><img
							src="${APP_PATH}/static/images/chongzhi.png" /></span>
					</a>
					<div class="mp_tooltip">
						我要充值 <i class="icon_arrow_right_black"></i>
					</div>
				</div>

				<div class="quick_toggle">
					<li class="qtitem"><a href="#"><span class="kfzx"></span></a>
						<div class="mp_tooltip">
							客服中心<i class="icon_arrow_right_black"></i>
						</div></li>
					<!--二维码 -->
					<li class="qtitem"><a href="#none"><span
							class="mpbtn_qrcode"></span></a>
						<div class="mp_qrcode" style="display:none;">
							<img src="${APP_PATH}/static/images/weixin_code_145.png" /><i
								class="icon_arrow_white"></i>
						</div></li>
					<li class="qtitem"><a href="#top" class="return_top"><span
							class="top"></span></a></li>
				</div>

				<!--回到顶部 -->
				<div id="quick_links_pop" class="quick_links_pop hide"></div>

			</div>

		</div>
		<div id="prof-content" class="nav-content">
			<div class="nav-con-close">
				<i class="am-icon-angle-right am-icon-fw"></i>
			</div>
			<div>我</div>
		</div>
		<div id="shopCart-content" class="nav-content">
			<div class="nav-con-close">
				<i class="am-icon-angle-right am-icon-fw"></i>
			</div>
			<div>购物车</div>
		</div>
		<div id="asset-content" class="nav-content">
			<div class="nav-con-close">
				<i class="am-icon-angle-right am-icon-fw"></i>
			</div>
			<div>资产</div>

			<!-- <div class="ia-head-list">
					<a href="#" target="_blank" class="pl">
						<div class="num">0</div>
						<div class="text">优惠券</div>
					</a>
					<a href="#" target="_blank" class="pl">
						<div class="num">0</div>
						<div class="text">红包</div>
					</a>
					<a href="#" target="_blank" class="pl money">
						<div class="num">￥0</div>
						<div class="text">余额</div>
					</a>
				</div> -->

		</div>
		<div id="foot-content" class="nav-content">
			<div class="nav-con-close">
				<i class="am-icon-angle-right am-icon-fw"></i>
			</div>
			<div>足迹</div>
		</div>
		<div id="brand-content" class="nav-content">
			<div class="nav-con-close">
				<i class="am-icon-angle-right am-icon-fw"></i>
			</div>
			<div>收藏</div>
		</div>
		<div id="broadcast-content" class="nav-content">
			<div class="nav-con-close">
				<i class="am-icon-angle-right am-icon-fw"></i>
			</div>
			<div>充值</div>
		</div>
	</div>
	<div class="theme-popover-mask"></div>
	<script type="text/javascript">
		//加载商品内容
		function products_info_list(result) {
			$(".products_info").empty();
			$.each(result.extend.pageInfo.list, function(index, item) {
				var createLi = $("<li></li>");
				var createDiv = $("<div></div>").addClass("i-pic limit");
				var createImg = $("<img>").attr("src",
						"http://123.207.93.53/Older_back/" + item.images);
				var createP = $("<p></p>").append(item.imagetitle).addClass(
						"title fl");
				var createp1 = $("<p></p>").append($("<b></b>").append("¥"))
						.append($("<strong></strong>").append(item.nowprice))
						.addClass("price fl");
				var createp2 = $("<p></p>").append("销量").append(
						$("<span></span>").append(item.sales)).addClass(
						"number fl");
				createDiv.append(createImg).append(createP).append(createp1)
						.append(createp2);
				createLi.append(createDiv).appendTo($(".products_info"));
			});

		}
		//分页条
		function products_page(result) {
			$("#page_info").empty();
			var pageul = $("<ul></ul>").addClass(
					"am-pagination am-pagination-right");
			var prePage = $("<li></li>").append($("<a></a>").append("&laquo;"));
			if (result.extend.pageInfo.hasPreviousPage) {
				prePage.click(function() {
					products_info_page(result.extend.pageInfo.pageNum - 1);
				});
			}
			pageul.append(prePage);
			$.each(result.extend.pageInfo.navigatepageNums, function(index,
					item) {
				var pageLi = $("<li></li>").append($("<a></a>").append(item));
				if (item == result.extend.pageInfo.pageNum) {
					pageLi.addClass("active");
				}
				pageLi.click(function() {
					products_info_page(item);
				});
				pageul.append(pageLi);
			});
			var lastPage = $("<li></li>")
					.append($("<a></a>").append("&raquo;"));
			if (result.extend.pageInfo.hasNextPage) {
				lastPage.click(function() {
					products_info_page(result.extend.pageInfo.pageNum + 1);
				});
			}
			pageul.append(lastPage).appendTo($("#page_info"));
		}

		//分页
		function products_info_page(pn) {
			var index = layer.load();
			$.ajax({
				url : "${APP_PATH}/salesOrPrices/" + $(this).attr("title")
						+ "-" + $(this).attr("imgTilte"),
				type : "GET",
				data : {
					"pn" : pn
				},
				success : function(result) {
					if (result.code == 100) {
						products_info_list(result);
						products_page(result);
						layer.close(index);
					}
				}
			});
		}

		//销量排序
		$("#seale").click(function() {
			$(".products_info").empty();
			$("#page_info").empty();
			$("#prices").parent("li").removeClass("first");
			$("#composite").parent("li").removeClass("first");
			$("#seale").parent("li").addClass("first");
			products_info_page(1);
		});

		//用价格排序
		$("#prices").click(function() {
			$(".products_info").empty();
			$("#page_info").empty();
			$("#seale").parent("li").removeClass("first");
			$("#composite").parent("li").removeClass("first");
			$("#prices").parent("li").addClass("first");

			products_info_page(1);
		});
		//综合排序
		$("#composite").click(function() {
			$(".products_info").empty();
			$("#page_info").empty();
			$("#seale").parent("li").removeClass("first");
			$("#prices").parent("li").removeClass("first");
			$("#composite").parent("li").addClass("first");
			products_info_page(1);
		});
	</script>
</body>
</html>