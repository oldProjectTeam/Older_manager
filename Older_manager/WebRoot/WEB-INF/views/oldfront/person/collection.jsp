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

<title>我的收藏</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0,maximum-scale=1.0, user-scalable=0">

<title>我的收藏</title>

<link href="${APP_PATH}/static/css/admin.css" rel="stylesheet"
	type="text/css">
<link href="${APP_PATH}/static/css/amazeui.css" rel="stylesheet"
	type="text/css">

<link href="${APP_PATH}/static/css/personal.css" rel="stylesheet"
	type="text/css">
<link href="${APP_PATH}/static/css/colstyle.css" rel="stylesheet"
	type="text/css">

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

				<div class="user-collection">
					<!--标题 -->
					<div class="am-cf am-padding">
						<div class="am-fl am-cf">
							<strong class="am-text-danger am-text-lg">我的收藏</strong> / <small>My&nbsp;Collection</small>
						</div>
					</div>
					<hr />

					<div class="you-like">
						<div class="s-bar">
							我的收藏
							<!-- <a class="am-badge am-badge-danger am-round">降价</a> <a
								class="am-badge am-badge-danger am-round">下架</a> -->
						</div>
						<!-- 中间内容 -->
						<div class="s-content" id="products_list"></div>

						<div class="s-more-btn i-load-more-item" data-screen="0"
							id="update_list">
							<i class="am-icon-refresh am-icon-fw"></i>更多
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
	<script type="text/javascript">
		$(function() {
			update_products(1);
		});

		//加载产品的信息
		function products_info(result) {
			if (result.extend.pageInfo.hasNextPage) {
				$("#update_list").attr("data", result.extend.pageInfo.pageNum);
			} else {
				$("#update_list").attr("data", 0);
			}
			$
					.each(
							result.extend.pageInfo.list,
							function(index, item) {
								var prices = $("<div></div>").addClass(
										"s-price-box");
								var sales = $("<div></div>").addClass(
										"s-extra-box");
								var onediv = $("<div></div>").addClass("s-tp");
								var towdiv = $("<div></div>")
										.addClass("s-info");
								var paggingdiv = $("<div></div>").addClass(
										"s-item");
								var threediv = $("<div></div>").addClass(
										"s-item-wrap");
								var productsImg = $("<div></div>")
										.append(
												$("<a></a>")
														.append(
																$("<img>")
																		.addClass(
																				"s-pic-img s-guess-item-img")
																		.attr(
																				"src",
																				item.images)
																		.attr(
																				"alt",
																				item.imagetitle)
																		.attr(
																				"title",
																				item.imagetitle))
														.addClass("s-pic-link")
														.attr("href", "#"))
										.addClass("s-pic");

								var produtstitle = $("<div></div>").append(
										$("<a></a>").append(item.imagetitle)
												.attr("href", "#").attr(
														"title",
														item.imagetitle))
										.addClass("s-title");

								$(prices)
										.append(
												$("<span>现价</span>")
														.append(
																$("<em>¥</em>")
																		.addClass(
																				"s-price-sign"))
														.append(
																$("<em></em>")
																		.append(
																				item.nowprice)
																		.addClass(
																				"s-value"))
														.addClass("s-price"));
								$(prices).append(" ");
								$(prices)
										.append(
												$("<del></del>")
														.append(
																$(
																		"<span>原价</span>")
																		.append(
																				$(
																						"<em>¥</em>")
																						.addClass(
																								"s-price-sign"))
																		.append(
																				$(
																						"<em></em>")
																						.append(
																								item.orprice)
																						.addClass(
																								"s-value"))
																		.addClass(
																				"s-history-price")));

								$(sales).append(
										$("<span></span>").append("好评")
												.addClass("s-comment"));
								$(sales).append(" ");
								$(sales).append(
										$("<span></span>").append(
												"月销" + item.sales).addClass(
												"s-sales"));

								$(towdiv).append(produtstitle).append(prices)
										.append(sales);

								$(onediv)
										.append(
												$("<span></span>")
														.append("找相似")
														.addClass(
																"ui-btn-loading-before findId")
														.attr("title",
																item.imagetitle));
								$(onediv).append(
										$("<i></i>").addClass(
												"am-icon-shopping-cart"));
								$(onediv)
										.append(
												$("<span></span>")
														.append("加入购物车")
														.addClass(
																"ui-btn-loading-before buy shoppingcart")
														.attr("productsID",
																item.id));
								$(onediv)
										.append(
												$("<p></p>")
														.append(
																$("<a></a>")
																		.append(
																				"取消收藏")
																		.addClass(
																				"c-nodo J_delFav_btn")
																		.attr(
																				"href",
																				"javascript:;")));

								$(paggingdiv).append(productsImg)
										.append(towdiv).append(onediv);
								$(threediv).append(paggingdiv).appendTo(
										"#products_list");
								$(".s-pic-link").attr("id", item.id);
							});
		}
		$(document).on(
				"click",
				".s-pic-link",
				function() {
					$(this).attr(
							"href",
							"${APP_PATH}/product/getProduct/"
									+ $(this).attr("id"));
				});
		//分页显示内容
		function update_products(pn) {
			var index = layer.load();
			$.ajax({
				url : "${APP_PATH}/select",
				type : "GET",
				data : "pn=" + pn,
				success : function(result) {
					console.log(result);
					if (result.code == 100) {
						products_info(result);
						layer.close(index);
					}
				}
			});
		}

		//点击更多
		$("#update_list").click(function() {
			if ($("#update_list").attr("data") != 0) {
				update_products($("#update_list").attr("data") + 1);
			} else {
				layer.msg("亲，没有更多数据了哟");
			}
		});

		//找相似
		$(document).on(
				"click",
				".findId",
				function() {
					window.location.href = "${APP_PATH}/dimquery/"
							+ $(this).attr("title") + "&" + 1;
				});

		//加入购物车
		$(document).on("click", ".shoppingcart", function() {
			$.ajax({
				url : "${APP_PATH}/cart/addCart",
				type : "GET",
				data : {
					"usersId" : '${users.id}',
					"produtsId" : $(this).attr("productsID"),
					"number" : 1
				},
				success : function(result) {
					if (result.code == 100) {
						layer.msg("加入成功");
					}
				}
			});
		});
	</script>
</body>
</html>
