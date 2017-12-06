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
<link
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${APP_PATH}/static/css/admin.css" rel="stylesheet"
	type="text/css">
<link href="${APP_PATH}/static/css/amazeui.css" rel="stylesheet"
	type="text/css">
<link href="${APP_PATH}/static/css/personal.css" rel="stylesheet"
	type="text/css">
<link href="${APP_PATH}/static/css/footstyle.css" rel="stylesheet"
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

				<div class="user-foot">
					<!--标题 -->
					<div class="am-cf am-padding">
						<div class="am-fl am-cf">
							<strong class="am-text-danger am-text-lg">我的足迹</strong> / <small>Browser&nbsp;History</small>
						</div>
					</div>
					<hr />

					<!-- 浏览列表 -->
					<div id="productsViews_list"></div>
				</div>
				<div class="clear"></div>
				<!-- 分页条 -->
				<nav aria-label="Page navigation" class="col-sm-offset-8"
					id="productsView_page_list"> </nav>
			</div>

			<!--底部-->
			<jsp:include page="../person/footer.jsp"></jsp:include>
		</div>
		<jsp:include page="left.jsp"></jsp:include>
	</div>

	<script type="text/javascript">
		$(function() {
			products_views_page(1);
		});

		//加载产品信息
		function products_views_info(result) {
			$.each(result.extend.pageInfo.list, function(index, item) {
				var oneDiv = $("<div></div>").addClass("goods");
				var twoDiv = $("<div></div>").append(
						$("<s></s>").addClass("line")).addClass("goods-date")
						.attr("data-date", item.viewtime);

				var div1 = $("<div></div>").addClass("goods-box");
				var div2 = $("<div></div>").addClass("goods-pic");
				var div3 = $("<div></div>").append(
						$("<a></a>").attr("href",
								"product/getProduct/" + item.productsId)
								.append(
										$("<img>").attr(
												"src",
												"http://123.207.93.53/Older_back/"
														+ item.products.images)
												.attr("height", "150")
												.addClass("goods-img")).attr(
										"target", "_blank").attr("title",
										item.products.imagetitle).addClass(
										"goods-pic-link")).addClass(
						"goods-pic-box");
				var a = $("<a></a>").append(
						$("<i><i>").addClass("am-icon-trash").attr(
								"productsview_id", item.id)
								.attr("id", "delete")).attr("href",
						"javascript:void(0);").addClass("goods-delete");
				div2.append(div3).append(a);

				var div4 = $("<div></div>").addClass("goods-attr");
				var div5 = $("<div></div>").append(
						$("<a></a>").append(item.products.imagetitle).addClass(
								"title").attr("target", "_blank")).addClass(
						"good-title");
				var div6 = $("<div></div>").addClass("goods-price");
				var span1 = $("<span></span>").addClass("g_price");
				var span2 = $("<span></span>").append("¥");
				var strong1 = $("<strong></strong>").append(
						item.products.nowprice);
				span1.append(span2).append(strong1);
				var span3 = $("<span></span>").addClass(
						"g_price g_price-original");
				var span4 = $("<span></span>").append("¥");
				var strong2 = $("<strong></strong>").append(
						item.products.orprice);
				span3.append(span4).append(strong2);
				div6.append(span1).append(" ").append(span3);
				var div7 = $("<div></div>").addClass("clear");
				div4.append(div5).append(div6).append(div7);
				div1.append(div2).append(div4);
				oneDiv.append(twoDiv).append(div1).appendTo(
						"#productsViews_list");
			});
		}
		//分页条
		function productsViews_page_info(result) {
			$("#productsView_page_list").empty();
			var pageUl = $("<ul></ul>").addClass("pagination");
			var prePage = $("<li></li>").append(
					$("<a></a>").append($("<span></span>").append("&laquo;")));
			if (result.extend.pageInfo.hasPreviousPage) {
				prePage.click(function() {
					select_info(result.extend.pageInfo.pageNum - 1);
				});
			}

			pageUl.append(prePage);

			$.each(result.extend.pageInfo.navigatepageNums, function(index,
					item) {
				var pageli = $("<li></li>").append($("<a></a>").append(item));
				if (item == result.extend.pageInfo.pageNum) {
					pageli.addClass("active");
				}
				pageli.click(function() {
					select_info(item);
				});
				pageUl.append(pageli);
			});

			var lastPage = $("<li></li>").append(
					$("<a></a>").append($("<span></span>").append("&raquo;")));
			pageUl.append(lastPage).appendTo("#productsView_page_list");

			if (result.extend.pageInfo.hasNextPage) {
				prePage.click(function() {
					select_info(result.extend.pageInfo.pageNum + 1);
				});
			}
		}

		function products_views_page(pn) {
			var index = layer.load();
			$.ajax({
				url : "${APP_PATH}/queryProductsViewsInfo",
				type : "POST",
				data : {
					"pn" : pn,
					"userId" : '${users.id}'
				},
				success : function(result) {
					console.log(result);
					products_views_info(result);
					productsViews_page_info(result);
					layer.close(index);
				}
			});
		}

		$(document).on(
				"click",
				"#delete",
				function() {
					$.ajax({
						url : "${APP_PATH}/deleteProductsViews/"
								+ $(this).attr("productsview_id"),
						type : "GET",
						success : function(result) {
							if (result.code == 100) {
								layer.msg("删除成功");
								window.location.reload();
							}
						}
					});
				});
	</script>
</body>
</html>
