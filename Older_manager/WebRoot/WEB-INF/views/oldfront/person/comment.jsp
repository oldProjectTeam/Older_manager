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

<title>评价</title>

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
<link href="${APP_PATH}/static/css/cmstyle.css" rel="stylesheet"
	type="text/css">

<script src="${APP_PATH}/static/js/jquery.min.js"></script>
<script src="${APP_PATH}/static/js/amazeui.js"></script>
<style type="text/css">
#page_nav li {
	float: left;
	margin-left: 10px;
}

#page_nav li a {
	cursor: pointer;
	font-size: 16px;
}

#page_nav {
	margin-left: 600px;
	margin-bottom: 15px;
}
</style>
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

				<div class="user-comment">
					<!--标题 -->
					<div class="am-cf am-padding">
						<div class="am-fl am-cf">
							<strong class="am-text-danger am-text-lg">评价管理</strong> / <small>Manage&nbsp;Comment</small>
						</div>
					</div>
					<hr />

					<div class="am-tabs am-tabs-d2 am-margin" data-am-tabs>

						<ul class="am-avg-sm-2 am-tabs-nav am-nav am-nav-tabs">
							<li class="am-active"><a href="#tab1">所有评价</a></li>
							<li><a href="#tab2">有图评价</a></li>

						</ul>

						<div class="am-tabs-bd">
							<div class="am-tab-panel am-fade am-in am-active" id="tab1">

								<div class="comment-main">
									<div class="comment-list">
										<ul class="item-list" id="comment_list">
											<div class="comment-top">
												<div class="th th-price">
													<td class="td-inner">评价</td>
												</div>
												<div class="th th-item">
													<td class="td-inner">商品</td>
												</div>
											</div>
										</ul>
									</div>
								</div>
							</div>
							<div class="am-tab-panel am-fade" id="tab2">

								<div class="comment-main">
									<div class="comment-list">
										<ul class="item-list" id="comment_list_img">
											<div class="comment-top">
												<div class="th th-price">
													<td class="td-inner">评价</td>
												</div>
												<div class="th th-item">
													<td class="td-inner">商品</td>
												</div>
											</div>
										</ul>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- 分页 -->
			<div id="page_nav"></div>
			<!--底部-->
			<jsp:include page="footer.jsp"></jsp:include>
		</div>
		<jsp:include page="left.jsp"></jsp:include>
	</div>

	<script type="text/javascript">
		$(document).ready(function() {
			go(1);
		});
		function go(pn) {
			$.ajax({
				url : "comment/queryProductsCommentByUserId",
				data : {
					"pn" : pn,
					"userId" : ${users.id}
				},
				type : "GET",
				success : function(result) {
					console.log(result);
					build_all_comment(result);
					build_page_nav(result);
					build_all_comment_img(result);
				}
			});
		}
		function build_all_comment(result) {
			$("#comment_list").empty();
			$
					.each(
							result.extend.pageInfo.list,
							function(index, item) {
								var firstA = $("<a></a>").addClass(
										"J_MakePoint").attr(
										"href",
										"${APP_PATH}/product/getProduct/"
												+ item.orderdetail.producctsId);
								var imgUrl = item.imageurl;
								if (imgUrl == null || imgUrl == '') {
									imgUrl = '${APP_PATH}/static/images/logo.png';
								}
								firstA.append($("<img/>").addClass("itempic")
										.attr("src", imgUrl)
										.attr("width", "80").attr("height",
												"80"));
								var firstLi = $("<li></li>").addClass(
										"td td-item").append(
										$("<div></div>").addClass("item-pic")
												.append(firstA));

								var secondLi = $("<li></li>").addClass(
										"td td-comment");
								var div1 = $("<div></div>").addClass(
										"item-title").append(
										$("<div></div>").addClass(
												"item-opinion").append("好评"));
								var div11 = $("<div></div>")
										.addClass("item-name")
										.append(
												$("<a></a>")
														.attr(
																"href",
																"${APP_PATH}/product/getProduct/"
																		+ item.orderdetail.producctsId)
														.append(
																$("<p></p>")
																		.addClass(
																				"item-basic-info")
																		.append(
																				item.orderdetail.producctname)));
								div1.append(div11);
								var div2 = $("<div></div>").addClass(
										"item-comment").append(item.content);

								var div3 = $("<div></div>").addClass(
										"item-info");
								var div33 = $("<div></div>")
										.append(
												$("<p></p>")
														.addClass("info-little")
														.append(
																$(
																		"<span></span>")
																		.append(
																				"数量:"
																						+ item.orderdetail.number))
														.append(
																$(
																		"<span></span")
																		.append(
																				"单价:"
																						+ item.orderdetail.baseprice))
														.append($("<br/>"))
														.append(
																$("<p></p>")
																		.addClass(
																				"info-time")
																		.append(
																				ChangeDateFormat(item.createtime))));
								div3.append(div33);

								secondLi.append(div1).append(div2).append(div3);

								$("#comment_list").append(firstLi).append(
										$("<br/>")).append($("<br/>")).append(
										secondLi);
							});
		}

		function build_all_comment_img(result) {
			$("#comment_list_img").empty();
			$
					.each(
							result.extend.pageInfo.list,
							function(index, item) {
								if (item.imageurl != null
										&& item.imageurl != '') {
									var firstA = $("<a></a>")
											.addClass("J_MakePoint")
											.attr(
													"href",
													"${APP_PATH}/product/getProduct/"
															+ item.orderdetail.producctsId);
									firstA.append($("<img/>").addClass(
											"itempic").attr("src",
											item.imageurl).attr("width", "80")
											.attr("height", "80"));
									var firstLi = $("<li></li>").addClass(
											"td td-item").append(
											$("<div></div>").addClass(
													"item-pic").append(firstA));

									var secondLi = $("<li></li>").addClass(
											"td td-comment");
									var div1 = $("<div></div>").addClass(
											"item-title").append(
											$("<div></div>").addClass(
													"item-opinion")
													.append("好评"));
									var div11 = $("<div></div>")
											.addClass("item-name")
											.append(
													$("<a></a>")
															.attr(
																	"href",
																	"${APP_PATH}/product/getProduct/"
																			+ item.orderdetail.producctsId)
															.append(
																	$("<p></p>")
																			.addClass(
																					"item-basic-info")
																			.append(
																					item.orderdetail.producctname)));
									div1.append(div11);
									var div2 = $("<div></div>").addClass(
											"item-comment")
											.append(item.content);

									var div3 = $("<div></div>").addClass(
											"item-info");
									var div33 = $("<div></div>")
											.append(
													$("<p></p>")
															.addClass(
																	"info-little")
															.append(
																	$(
																			"<span></span>")
																			.append(
																					"数量:"
																							+ item.orderdetail.number))
															.append(
																	$(
																			"<span></span")
																			.append(
																					"单价:"
																							+ item.orderdetail.baseprice))
															.append($("<br/>"))
															.append(
																	$("<p></p>")
																			.addClass(
																					"info-time")
																			.append(
																					ChangeDateFormat(item.createtime))));
									div3.append(div33);

									secondLi.append(div1).append(div2).append(
											div3);

									$("#comment_list_img").append(firstLi)
											.append($("<br/>")).append(
													$("<br/>"))
											.append(secondLi);
								}
							});
		}

		//解析显示分页条信息
		function build_page_nav(result) {
			$("#page_nav").empty();
			var ul = $("<ul></ul>").addClass("pagination");
			var firstPageLi = $("<li></li>").append($("<a></a>").append("首页"));
			firstPageLi.click(function() {
				go(1);
			});
			var prePageLi = $("<li></li>").append(
					$("<a></a>").append("&laquo;"));
			if (result.extend.pageInfo.hasPreviousPage == false) {
				firstPageLi.addClass("disabled");
				prePageLi.addClass("disabled");
			} else {
				//为元素添加点击翻页事件
				prePageLi.click(function() {
					go(result.extend.pageInfo.pageNum - 1);
				});
			}
			var nextPageLi = $("<li></li>").append(
					$("<a></a>").append("&raquo;"));
			var lastPageLi = $("<li></li>").append($("<a></a>").append("末页"));
			lastPageLi.click(function() {
				go(result.extend.pageInfo.pages);
			});
			if (result.extend.pageInfo.hasNextPage == false) {
				nextPageLi.addClass("disabled");
				lastPageLi.addClass("disabled");
			} else {
				//为元素添加点击翻页事件
				nextPageLi.click(function() {
					go(result.extend.pageInfo.pageNum + 1);
				});
			}
			//添加首页和前一页的提示
			ul.append(firstPageLi).append(prePageLi);
			//遍历给ul中添加页码提示
			$.each(result.extend.pageInfo.navigatepageNums, function(index,
					item) {
				var numLi = $("<li></li>").append($("<a></a>").append(item));
				if (result.extend.pageInfo.pageNum == item) {
					numLi.addClass("active");
				}
				numLi.click(function() {
					go(item);
				});
				ul.append(numLi);
			});
			//添加下一页和末页的提示
			ul.append(nextPageLi).append(lastPageLi);
			//把ul加到nav 
			var navEle = $("<nav></nav>").append(ul);
			navEle.appendTo("#page_nav");
		}

		function ChangeDateFormat(d) {
			//将时间戳转为int类型，构造Date类型
			if (d != null) {
				var date = new Date(parseInt(d));

				//月份得+1，且只有个位数时在前面+0
				var month = date.getMonth() + 1 + "月";

				//日期为个位数时在前面+0
				var currentDate = date.getDate() + "日";

				//getFullYear得到4位数的年份 ，返回一串字符串
				return date.getFullYear() + "年" + month + currentDate;
			} else {
				return null;
			}
		}
	</script>
</body>
</html>