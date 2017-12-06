<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	pageContext.setAttribute("APP_PATH", request.getContextPath());
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<link href="${APP_PATH}/static/oldfront/older/css/bootstrap.min.css"
	rel="stylesheet">
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
										src="http://gyadmin-1252357563.file.myqcloud.com/images/getAvatar.do.jpg">
									</a> <em class="s-name"><font color="black">(${users.account})</font><span
										class="vip1"></em>
									<div class="s-prestige am-btn am-round">
										</span><font color="black" id="level"></font>
									</div>
								</div>
								<div class="m-right">
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
								<li><a href="${APP_PATH}/order/selectallorder/${users.id}"><i><img
											src="http://gyadmin-1252357563.file.myqcloud.com/images/pay.png" /></i><span>待付款<em
											class="m-num" id="orderNum1"></em></span></a></li>
								<li><a href="${APP_PATH}/order/selectallorder/${users.id}"><i><img
											src="http://gyadmin-1252357563.file.myqcloud.com/images/send.png" /></i><span>待发货<em
											class="m-num" id="orderNum2"></em></span></a></li>
								<li><a href="${APP_PATH}/order/selectallorder/${users.id}"><i><img
											src="http://gyadmin-1252357563.file.myqcloud.com/images/receive.png" /></i><span>待收货<em
											class="m-num" id="orderNum3"></em></span></a></li>
								<li><a href="${APP_PATH}/order/selectallorder/${users.id}"><i><img
											src="http://gyadmin-1252357563.file.myqcloud.com/images/comment.png" /></i><span>待评价<em
											class="m-num" id="orderNum4"></em></span></a></li>
							</ul>
						</div>
						<!--物流 -->
						<div class="m-logistics">

							<div class="s-bar">
								<i class="s-icon"></i>我的物流
							</div>
							<div class="s-content">
								<ul class="lg-list" id="myLogistics">
									<div class="clear"></div>
								</ul>
							</div>
							<!--分页信息  -->
							<div class="row">
								<div class="col-md-12">
									<nav aria-label="Page navigation" style="float:right">
									<ul class="pagination pagination-sm" id="nav_ul_info">
									</ul>
									</nav>
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
	<!--引导 -->
	<div class="navCir">
		<div class="navCir">
			<li><a href="${APP_PATH}/shop/oldfronthome"><i
					class="am-icon-home "></i>首页</a></li>
			<li><a href="${APP_PATH}/home/search?searchKeyWord="> <i
					class="am-icon-list"></i>分类
			</a></li>
			<li><a
				href="${APP_PATH}/cart/findAllByUserId?userId=${users.id}"><i
					class="am-icon-shopping-basket"></i>购物车</a></li>
			<li class="active"><a href="${APP_PATH}/address/index"><i
					class="am-icon-user"></i>我的</a></li>
		</div>
	</div>
	<script type="text/javascript">
		$(function() {
			//加载我的物流信息
			to_page(1);
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

		//构建我的物流信息
		function build_myLogistics(result) {
			$("#myLogistics").empty();
			$.each(result.extend.pageInfo.list, function(index, items) {
				$.each(items.products, function(i, item) {
					var li = $("<li></li>").addClass("lg-item");
					var div1 = $("<div></div>").addClass("item-info");
					var a1 = $("<a></a>").attr("href",
							"${APP_PATH}/product/getProduct/" + item.id).attr(
							"title", item.name);
					var img1 = $("<img>").attr("src",
							"http://123.207.93.53/Older_back/" + item.images);
					a1.append(img1);
					div1.append(a1);

					var div2 = $("<div><p>快件已发出,请耐心等待...</p></div>").addClass(
							"lg-info");
					var div21 = $("<div></div>").addClass("lg-detail-wrap");
					var div211 = $("<div></div>").addClass("J_TipsCon");
					var div2111 = $("<div></div>").addClass("s-tip-bar")
							.append(
									items.formulaway + "快递"
											+ "&nbsp;&nbsp;&nbsp;&nbsp;运单号："
											+ items.orders4);
					div211.append(div2111);
					div21.append(div211);
					div2.append(div21);

					var div3 = $("<div></div>").addClass("lg-confirm");
					var a3 = $("<a class='i-btn-typical'>查看物流</a>").attr(
							"href", "${APP_PATH}/order/logistic/" + items.id);
					div3.append(a3);

					li.append(div1).append(div2).append(div3).appendTo(
							"#myLogistics");
				});
			});
		}

		//构建分页信息
		function buil_nav_pageInfo(result) {
			$("#nav_ul_info").empty();
			//右边分页导航
			var firstPage = $("<li></li>").append($("<a></a>").append("首页"));
			var prePage = $("<li></li>").append($("<a></a>").append("&laquo;"));
			var nextPage = $("<li></li>")
					.append($("<a></a>").append("&raquo;"));
			var lastPage = $("<li></li>").append($("<a></a>").append("末页"));
			if (result.extend.pageInfo.hasPreviousPage == false) {
				firstPage.addClass("disabled");
				prePage.addClass("disabled");
			} else {
				firstPage.click(function() {
					to_page(1);
				});
				prePage.click(function() {
					to_page(result.extend.pageInfo.pageNum - 1);
				});
			}
			if (result.extend.pageInfo.hasNextPage == false) {
				nextPage.addClass("disabled");
				lastPage.addClass("disabled");
			} else {
				nextPage.click(function() {
					to_page(result.extend.pageInfo.pageNum + 1);
				});
				lastPage.click(function() {
					to_page(result.extend.pageInfo.pages);
				});
			}
			$("#nav_ul_info").append(firstPage).append(prePage);
			$.each(result.extend.pageInfo.navigatepageNums, function(index,
					item) {
				var numLi = $("<li></li>").append($("<a></a>").append(item));
				if (result.extend.pageInfo.pageNum == item) {
					numLi.addClass("active");
				}
				numLi.click(function() {
					to_page(item);
				});
				$("#nav_ul_info").append(numLi);
			});
			$("#nav_ul_info").append(nextPage).append(lastPage);
		}

		//去哪页加载数据
		function to_page(pn) {
			layer.msg('加载中', {
				icon : 16,
				shade : 0.01,
				time : 100000,
				offset : [ '60%' ],
			});
			$.ajax({
				url : "${APP_PATH}/order/orderListByState",
				data : {
					pn : pn,
					userId : '${users.id}'
				},
				type : "post",
				success : function(result) {
					layer.closeAll();
					//console.log(result);
					//1.构建我的物流数据
					build_myLogistics(result);
					//2.构建分页信息
					if (result.extend.pageInfo.pages > 2)
						buil_nav_pageInfo(result);
				}
			});
		}
	</script>
</body>
</html>