<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<link href="${APP_PATH}/static/css/amazeui.css" rel="stylesheet"
	type="text/css" />
<link href="${APP_PATH}/static/css/admin.css" rel="stylesheet"
	type="text/css" />

<link href="${APP_PATH}/static/css/demo.css" rel="stylesheet"
	type="text/css" />

<link href="${APP_PATH}/static/css/hmstyle.css" rel="stylesheet"
	type="text/css" />
<link href="${APP_PATH}/static/css/skin.css" rel="stylesheet"
	type="text/css" />
<script src="${APP_PATH}/static/js/jquery-1.7.2.min.js"></script>
<script src="${APP_PATH}/static/js/amazeui.min.js"></script>
<script src="${APP_PATH}/lib/layer/2.4/layer.js"></script>
</head>

<body>
	<jsp:include page="shopheader.jsp"></jsp:include>
	<div class="banner">
		<!--轮播 -->
		<div class="am-slider am-slider-default scoll" data-am-flexslider
			id="demo-slider-0">
			<ul class="am-slides">
				<li class="banner1"><a href="introduction.html"> <img
						src="${APP_PATH}/static/images/ad1.jpg" />
				</a></li>
				<li class="banner2"><a> <img
						src="${APP_PATH}/static/images/ad2.jpg" />
				</a></li>
				<li class="banner3"><a> <img
						src="${APP_PATH}/static/images/ad3.jpg" />
				</a></li>
				<li class="banner4"><a> <img
						src="${APP_PATH}/static/images/ad4.jpg" />
				</a></li>
			</ul>
		</div>
		<div class="clear"></div>
	</div>
	<div class="shopNav">
		<div class="slideall">
			<div class="long-title">
				<span class="all-goods">全部分类</span>
			</div>
			<div class="nav-cont">
				<ul>
					<li class="index"><a href="${APP_PATH}/shop/oldfronthome">首页</a>
					</li>
					<!-- <li class="qc">
						<a href="#">闪购</a>
					</li>
					<li class="qc">
						<a href="#">限时抢</a>
					</li>
					<li class="qc">
						<a href="#">团购</a>
					</li>
					<li class="qc last">
						<a href="#">大包装</a>
					</li> -->
				</ul>
				<div class="nav-extra">
					<i class="am-icon-user-secret am-icon-md nav-user"></i><b></b>我的福利
					<i class="am-icon-angle-right" style="padding-left: 10px;"></i>
				</div>
			</div>

			<!--侧边导航 -->
			<div id="nav" class="navfull">
				<div class="area clearfix">
					<div class="category-content" id="guide_2">
						<div class="category">
							<ul class="category-list" id="js_climit_li">

								<!-- 构建信息 -->
								<li class="appliance js_toggle relative first">
									<div class="category-info">
										<h3 class="category-name b-category-name">
											<i><img src="${APP_PATH}/static/images/cake.png"> </i>
											<a class="ml-22" title="保健品">保健品</a>
										</h3>
										<em>&gt;</em>
									</div> <b class="arrow"></b>
								</li>
								<li class="appliance js_toggle relative first">
									<div class="category-info">
										<h3 class="category-name b-category-name">
											<i><img src="${APP_PATH}/static/images/cake.png"> </i>
											<a class="ml-22" title="保健品">医疗器材</a>
										</h3>
										<em>&gt;</em>
									</div> <b class="arrow"></b>
								</li>
								<li class="appliance js_toggle relative first">
									<div class="category-info">
										<h3 class="category-name b-category-name">
											<i><img src="${APP_PATH}/static/images/cake.png"> </i>
											<a class="ml-22" title="保健品">健身器材</a>
										</h3>
										<em>&gt;</em>
									</div> <b class="arrow"></b>
								</li>
								<li class="appliance js_toggle relative first">
									<div class="category-info">
										<h3 class="category-name b-category-name">
											<i><img src="${APP_PATH}/static/images/cake.png"> </i>
											<a class="ml-22" title="保健品">床上用品</a>
										</h3>
										<em>&gt;</em>
									</div> <b class="arrow"></b>
								</li>
								<li class="appliance js_toggle relative first">
									<div class="category-info">
										<h3 class="category-name b-category-name">
											<i><img src="${APP_PATH}/static/images/cake.png"> </i>
											<a class="ml-22" title="保健品">厨卫用品</a>
										</h3>
										<em>&gt;</em>
									</div> <b class="arrow"></b>
								</li>
								<li class="appliance js_toggle relative first">
									<div class="category-info">
										<h3 class="category-name b-category-name">
											<i><img src="${APP_PATH}/static/images/cake.png"> </i>
											<a class="ml-22" title="保健品">日常用品</a>
										</h3>
										<em>&gt;</em>
									</div> <b class="arrow"></b>
								</li>
								<li class="appliance js_toggle relative first">
									<div class="category-info">
										<h3 class="category-name b-category-name">
											<i><img src="${APP_PATH}/static/images/cake.png"> </i>
											<a class="ml-22" title="保健品">服装</a>
										</h3>
										<em>&gt;</em>
									</div> <b class="arrow"></b>
								</li>
								<li class="appliance js_toggle relative first">
									<div class="category-info">
										<h3 class="category-name b-category-name">
											<i><img src="${APP_PATH}/static/images/cake.png"> </i>
											<a class="ml-22" title="保健品">食品</a>
										</h3>
										<em>&gt;</em>
									</div> <b class="arrow"></b>
								</li>
								<li class="appliance js_toggle relative first">
									<div class="category-info">
										<h3 class="category-name b-category-name">
											<i><img src="${APP_PATH}/static/images/cake.png"> </i>
											<a class="ml-22" title="保健品">药品</a>
										</h3>
										<em>&gt;</em>
									</div> <b class="arrow"></b>
								</li>

							</ul>
						</div>
					</div>
				</div>
			</div>


			<!--轮播-->

			<script type="text/javascript">
				(function() {
					$('.am-slider').flexslider();
				});
				$(document)
						.ready(
								function() {
									$("li")
											.hover(
													function() {
														$(
																".category-content .category-list li.first .menu-in")
																.css("display",
																		"none");
														$(
																".category-content .category-list li.first")
																.removeClass(
																		"hover");
														$(this).addClass(
																"hover");
														$(this)
																.children(
																		"div.menu-in")
																.css("display",
																		"block");
													},
													function() {
														$(this).removeClass(
																"hover");
														$(this).children(
																"div.menu-in")
																.css("display",
																		"none");
													});
								});
			</script>



			<!--小导航 -->
			<div class="am-g am-g-fixed smallnav">
				<div class="am-u-sm-3">
					<a href="sort.html"> <img
						src="${APP_PATH}/static/images/navsmall.jpg" />
						<div class="title">商品分类</div>
					</a>
				</div>
				<div class="am-u-sm-3">
					<a href="#"> <img src="${APP_PATH}/static/images/huismall.jpg" />
						<div class="title">大聚惠</div>
					</a>
				</div>
				<div class="am-u-sm-3">
					<a href="shop/index"> <img
						src="${APP_PATH}/static/images/mansmall.jpg" />
						<div class="title">个人中心</div>
					</a>
				</div>
				<div class="am-u-sm-3">
					<a href="#"> <img
						src="${APP_PATH}/static/images/moneysmall.jpg" />
						<div class="title">投资理财</div>
					</a>
				</div>
			</div>

			<!--走马灯 -->

			<div class="marqueen">
				<span class="marqueen-title">商城头条</span>
				<div class="demo">

					<ul>
						<li class="title-first"><a target="_blank" href="#"> <img
								src="${APP_PATH}/static/images/TJ2.jpg"></img> <span>[特惠]</span>商城爆品1分秒
						</a></li>
						<span>[公告]</span>商城与广州市签署战略合作协议
						<img src="${APP_PATH}/static/images/TJ.jpg"></img>
						<p>XXXXXXXXXXXXXXXXXX</p>
						</a>
						</li>

						<div class="mod-vip">
							<div class="m-baseinfo">
								<a href="../person/index.html"> <img
									src="${APP_PATH}/static/images/getAvatar.do.jpg">
								</a> <em> Hi,<span class="s-name"><c:if
											test="${uses}==null">小叮当</c:if>${users.account}</span> <a href="#">
										<p>点击更多优惠活动</p>
								</a>
								</em>
							</div>
							<c:if test="${uses}==null || ${uses}==''">
								<div class="member-logout">
									<a class="am-btn-warning btn" href="login.html">登录</a> <a
										class="am-btn-warning btn" href="register.html">注册</a>
								</div>
							</c:if>

							<div class="member-login">
								<a href="#"> <strong>0</strong>待收货
								</a> <a href="#"> <strong>0</strong>待发货
								</a> <a href="#"> <strong>0</strong>待付款
								</a> <a href="#"> <strong>0</strong>待评价
								</a>
							</div>
							<div class="clear"></div>
						</div>

						<li><a target="_blank" href="#"> <span>[特惠]</span>洋河年末大促，低至两件五折
						</a></li>
						<li><a target="_blank" href="#"> <span>[公告]</span>华北、华中部分地区配送延迟
						</a></li>
						<li><a target="_blank" href="#"> <span>[特惠]</span>家电狂欢千亿礼券
								买1送1！
						</a></li>

					</ul>
					<div class="advTip">
						<img src="${APP_PATH}/static/images/advTip.jpg" />
					</div>
				</div>
			</div>
			<div class="clear"></div>
		</div>
		<script type="text/javascript">
			if ($(window).width() < 640) {
				function autoScroll(obj) {
					$(obj).find("ul").animate({
						marginTop : "-39px"
					}, 500, function() {
						$(this).css({
							marginTop : "0px"
						}).find("li:first").appendTo(this);
					})
				}
				$(function() {
					setInterval('autoScroll(".demo")', 3000);
				})
			}
		</script>
	</div>
	<div class="shopMainbg">
		<div class="shopMain" id="shopmain">

			<!--今日推荐 -->

			<div class="am-g am-g-fixed recommendation">
				<div class="clock am-u-sm-3"">
					<img src="${APP_PATH}/static/images/2016.png "></img>
					<p>
						今日<br>推荐
					</p>
				</div>
				<div class="am-u-sm-4 am-u-lg-3 ">
					<div class="info ">
						<h3>真的有鱼</h3>
						<h4>开年福利篇</h4>
					</div>
					<div class="recommendationMain one">
						<a href="introduction.html"> <img
							src="${APP_PATH}/static/images/tj.png "></img>
						</a>
					</div>
				</div>
				<div class="am-u-sm-4 am-u-lg-3 ">
					<div class="info ">
						<h3>囤货过冬</h3>
						<h4>让爱早回家</h4>
					</div>
					<div class="recommendationMain two">
						<img src="${APP_PATH}/static/images/tj1.png "></img>
					</div>
				</div>
				<div class="am-u-sm-4 am-u-lg-3 ">
					<div class="info ">
						<h3>浪漫情人节</h3>
						<h4>甜甜蜜蜜</h4>
					</div>
					<div class="recommendationMain three">
						<img src="${APP_PATH}/static/images/tj2.png "></img>
					</div>
				</div>
			</div>
			<div class="clear "></div>
			<div id="center_product_data"></div>
			<jsp:include page="../person/footer.jsp"></jsp:include>
		</div>
	</div>
	<!--引导 -->
	<div class="navCir">
		<li class="active"><a href="shop/oldfronthome"> <i
				class="am-icon-home "></i>首页
		</a></li>
		<li><a href="shop/sort"> <i class="am-icon-list"></i>分类
		</a></li>
		<li><a href="shop/shopcart"> <i
				class="am-icon-shopping-basket"></i>购物车
		</a></li>
		<li><a href="shop/index"> <i class="am-icon-user"></i>我的
		</a></li>
	</div>


	<script>
		window.jQuery
				|| document
						.write('<script src="basic/js/jquery.min.js "><\/script>');
	</script>
	<script type="text/javascript " src="../basic/js/quick_links.js "></script>
	<script type="text/javascript">
		jQuery(function($) {
			//请求侧边栏的商品类型数据
			$.ajax({
				url : "home/findProductsTypeIncludeProducts",
				type : "GET",
				success : function(result) {
					if (result.code == 100) {
						//构建侧边栏商品类型数据
						build_slide_data(result);

						//构建侧边栏商品类型数据
						build_center_products_data(result);
					}
				}
			});

			//请求浮动广告数据
			/* $.ajax({
			    url : "home/selectSlidePeoducts",
			    type : "GET",
			    success : function(result) {
			        if (result.code == 100) {
			            build_slide_products_data(result);
			        }
			    }
			}); */
		});

		function logouttip() {
			layer.open({
				content : '是否需要退出登录？',
				btn : [ '退出', '取消' ],
				yes : function(index, layero) {
					window.location.href = "Shop/Userlogout";
				},
				btn2 : function(index, layero) {
				},
				cancel : function() {
				}
			});
		}

		function build_slide_products_data(result) {

		}

		//构建侧边栏商品类型数据
		function build_slide_data(result) {
			$("#js_climit_li").empty();
			$.each(result.extend.productTypes, function(index, item) {
				//信息头
				var li_head = $("<li></li>").addClass(
						"appliance js_toggle relative first head");
				var b_arrow = $("<b></b>").addClass("arrow");
				var div_info = $("<div></div>").addClass("category-info");
				var h3_name = $("<h3></h3>").addClass(
						"category-name b-category-name");
				var img_typename = $("<img>").attr("src",
						"${APP_PATH}/static/images/cake.png");//类型图片
				var i_img = $("<i></i>").append(img_typename);
				var a_first_typname = $("<a></a>").addClass("ml-22").attr(
						"title", item.name).append(item.name);//产品类型名称
				var em = $("<em></em>").append("&gt;");
				div_info.append(h3_name.append(i_img).append(a_first_typname))
						.append(em);

				// 构建二级商品类型名称
				var div_second_top = $("<div></div>").addClass(
						"menu-item menu-in top second");
				var div_area_in = $("<div></div>").addClass("area-in");
				var div_area_bg = $("<div></div>").addClass("area-bg");
				var div_menu_srot = $("<div></div>").addClass("menu-srot");
				var div_sort_side = $("<div></div>").addClass("sort-side");
				var dl_dl_sort = $("<dl></dl>").addClass("dl-sort");
				var dt_head = $("<dt></dt>").attr("title", item.name).append(
						$("<span></span>").append(item.name));
				dl_dl_sort.append(dt_head);
				$.each(item.productTypes, function(index, item) {
					//循环构建a标签
					var a_second_type_name = $("<a></a>").attr("href",
							"home/typeIntoSearch?typeName=" + item.name)
							.append($("<span></span>").append(item.name)).attr(
									"title", item.name);
					var dd = $("<dd></dd>").append(a_second_type_name);
					dd.appendTo(dl_dl_sort);
				})

				dl_dl_sort.appendTo(div_sort_side);
				// 构建商品品牌名称
				var div_brand_side = $("<div></div>").addClass("brand-side");
				var dl_dl_sort2 = $("<dl></dl>").addClass("dl-sort");
				var dt_brand = $("<dt></dt>").append(
						$("<span></span>").append("实力品牌"));
				dt_brand.appendTo(dl_dl_sort2);

				$.each(item.brands, function(index, item) {
					if (index < 10) {
						var dd_brand = $("<dd></dd>");
						var a_brand = $("<a></a>").attr("ref", "nofollow")
								.attr("title", item.name).attr("target",
										"_blank").attr(
										"href",
										"home/brandIntoSearch?brandName="
												+ item.name).attr("rel",
										"nofollow");
						if (index % 2 != 0) {
							a_brand.addClass("red");
						}
						dd_brand.append(a_brand).appendTo(dl_dl_sort2);
					}

				});

				div_brand_side.append(dl_dl_sort2);
				div_second_top.append(div_area_in.append(div_area_bg
						.append(div_menu_srot.append(div_sort_side).append(
								div_brand_side))));

				li_head.append(div_info).append(div_second_top).append(b_arrow)
						.appendTo($("#js_climit_li"));

				$(document).on("mouseover", ".head", function() {
					$(this).addClass("hover");
					$(this).find($(".second")).css("display", "block");
				});

				$(document).on("mouseout", ".head", function() {
					$(this).removeClass("hover");
					$(this).find($(".second")).css("display", "none");
				});
			})

		};

		//构建底部商品类型数据
		function build_center_products_data(result) {
			var center_caner = $("#center_product_data");
			center_caner.empty();
			$
					.each(
							result.extend.productTypes,
							function(index, item) {
								var div_f = $("<div></div>");
								div_f.attr("id", "f" + (index + 1));
								var div_clear = $("<div></div>").addClass(
										"clear ");

								//食品故事
								var div_am_container = $("<div></div>")
										.addClass("am-container");
								var div_shopTitle = $("<div></div>").addClass(
										"shopTitle");
								var h4 = $("<h4></h4>").append(item.name);
								var h3 = $("<h3></h3>").append("每一道甜品都有一个故事");
								var div_today_brands = $("<div></div>")
										.addClass("today-brands ");

								$.each(item.brands, function(index, item) {
									var a_brands = $("<a></a>").append(
											item.name);
									a_brands.appendTo(div_today_brands);
								});

								var span_more = $("<span></span>").addClass(
										"more ");
								var a_more = $("<a></a>")
										.append("更多美味")
										.append(
												$("<i></i>")
														.addClass(
																"am-icon-angle-right")
														.attr("style",
																"padding-left:10px ;"));
								a_more.appendTo(span_more);

								//故事
								div_am_container.append(div_shopTitle
										.append(h4).append(h3).append(
												div_today_brands).append(
												span_more));

								var div_floodFour = $("<div></div>").addClass(
										"am-g am-g-fixed floodFour");
								var div_text_one_list = $("<div></div>")
										.addClass(
												"am-u-sm-5 am-u-md-4 text-one list ");
								var div_word1 = $("<div></div>").addClass(
										"word");

								$
										.each(
												item.productTypes,
												function(index, item) {
													if (index < 6) {
														var a_outer = $(
																"<a></a>")
																.addClass(
																		"outer");
														a_outer
																.attr(
																		"href",
																		"home/typeIntoSearch?typeName="
																				+ item.name);
														var span_inner = $(
																"<span></span>")
																.addClass(
																		"inner");
														var b_text = $(
																"<b></b>")
																.addClass(
																		"text")
																.append(
																		item.name);
														a_outer
																.append(
																		span_inner
																				.append(b_text))
																.appendTo(
																		div_word1);
													}

												});

								var a_activity = $("<a></a>");
								a_activity.attr("href", "#");
								var div_outer_con = $("<div></div>").addClass(
										"outer-con ");
								var div_title1 = $("<div></div>").addClass(
										"title").append("开抢啦！");
								var div_sub_title1 = $("<div></div>").addClass(
										"sub-title ");
								var img_activity = $("<img>").attr("href", "");
								var div_triangle_topright = $("<div></div>")
										.addClass("triangle-topright");

								a_activity.append(
										div_outer_con.append(div_title1)
												.append(div_sub_title1))
										.append(img_activity);

								//核桃
								div_floodFour.append(div_text_one_list.append(
										div_word1).append(a_activity).append(
										div_triangle_topright));

								$
										.each(
												item.products,
												function(index, item) {
													var div_products_item = $("<div></div>");
													var img_content = $("<img></img>");
													if (index == 0) {
														div_products_item
																.addClass("am-u-sm-7 am-u-md-4 text-two sug");
														img_content
																.css("height",
																		"170")
																.css("width",
																		"170");
													} else if (index == 1) {
														div_products_item
																.addClass("am-u-sm-7 am-u-md-4 text-two");
														img_content
																.css("height",
																		"170")
																.css("width",
																		"170");
													} else if (index == 2) {
														img_content
																.css("height",
																		"170")
																.css("width",
																		"170");
														div_products_item
																.addClass("am-u-sm-3 am-u-md-2 text-three big");
													} else if (index == 3) {
														img_content
																.css("height",
																		"170")
																.css("width",
																		"170");
														div_products_item
																.addClass("am-u-sm-3 am-u-md-2 text-three sug");
													} else if (index == 4) {
														div_products_item
																.addClass("am-u-sm-3 am-u-md-2 text-three ");
														img_content
																.css("height",
																		"170")
																.css("width",
																		"170");
													} else if (index == 5) {
														div_products_item
																.addClass("am-u-sm-3 am-u-md-2 text-three last big ");
													}

													var div_outer_con = $(
															"<div></div>")
															.addClass(
																	"outer-con ");
													var div_title = $(
															"<div></div>")
															.addClass("title")
															.append(item.name);
													var div_price = $(
															"<div></div>")
															.addClass(
																	"sub-title ",
																	item.price);
													var i_am_icon = $("<i></i>")
															.addClass(
																	"am-icon-shopping-basket am-icon-md  seprate");

													//img_content.attr("src", item.images.split(",",1));
													if (item.images
															.indexOf(",") > 0) {
														img_content
																.attr(
																		"src",
																		"http://123.207.93.53/Older_back/"
																				+ item.images
																						.split(
																								",",
																								1));
													} else {
														img_content
																.attr(
																		"src",
																		"http://123.207.93.53/Older_back/"
																				+ item.images);
													}

													var a_href = $("<a></a>")
															.append(img_content);
													a_href.attr("href",
															"product/getProduct/"
																	+ item.id);
													div_products_item
															.append(
																	div_outer_con
																			.append(
																					div_title)
																			.append(
																					div_price)
																			.append(
																					i_am_icon))
															.append(a_href)
															.appendTo(
																	div_floodFour);
												});

								div_f.append(div_am_container).append(
										div_floodFour).append(div_clear)
										.appendTo(center_caner);

							});

			// $.parser.parse($("#center_product_data"));
		}
	</script>
</body>

</html>