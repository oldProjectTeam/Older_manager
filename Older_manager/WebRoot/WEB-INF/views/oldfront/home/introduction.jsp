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

<title>商品详情</title>

<link href="${APP_PATH}/static/css/admin.css" rel="stylesheet"
	type="text/css" />
<link href="${APP_PATH}/static/css/amazeui.css" rel="stylesheet"
	type="text/css" />
<link href="${APP_PATH}/static/css/demo.css" rel="stylesheet"
	type="text/css" />
<link type="text/css" href="${APP_PATH}/static/css/optstyle.css"
	rel="stylesheet" />
<link type="text/css" href="${APP_PATH}/static/css/style.css"
	rel="stylesheet" />
<link type="text/css" href="${APP_PATH}/static/css/style.css"
	rel="stylesheet" />

<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
	src="${APP_PATH}/static/js/quick_links.js"></script>

<script type="text/javascript" src="${APP_PATH}/static/js/amazeui.js"></script>
<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery.imagezoom.min.js"></script>
<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery.flexslider.js"></script>
<script type="text/javascript" src="${APP_PATH}/static/js/list.js"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>
</head>
<body>
	<jsp:include page="shopheader.jsp"></jsp:include>
	<b class="line"></b>
	<div class="listMain">
		<!--分类-->
		<div class="nav-table">
			<div class="long-title">
				<span class="all-goods">全部分类</span>
			</div>
			<div class="nav-cont">
				<ul>
					<li class="index"><a href="${APP_PATH}/shop/oldfronthome">首页</a></li>
					<li class="qc"><a href="#">闪购</a></li>
					<li class="qc"><a href="#">限时抢</a></li>
					<li class="qc"><a href="#">团购</a></li>
					<li class="qc last"><a href="#">大包装</a></li>
				</ul>
			</div>
		</div>

		<!-- 路径导航 -->
		<ol class="am-breadcrumb am-breadcrumb-slash">
			<li><a href="${APP_PATH}/shop/oldfronthome">首页</a></li>
			<li><a href="#">分类</a></li>
			<li class="am-active">内容</li>
		</ol>

		<script type="text/javascript">
			$(function() {
			});
			$(window).load(function() {
				$('.flexslider').flexslider({
					animation : "slide",
					start : function(slider) {
						$('body').removeClass('loading');
					}
				});
			});
		</script>
		<!--放大镜-->
		<div class="item-inform">
			<div class="clearfixLeft" id="clearcontent">
				<div class="box">
					<script type="text/javascript">
						$(document).ready(
								function() {
									$(".jqzoom").imagezoom();
									$("#thumblist li a").click(
											function() {
												$(this).parents("li").addClass(
														"tb-selected")
														.siblings()
														.removeClass(
																"tb-selected");
												$(".jqzoom").attr(
														'src',
														$(this).find("img")
																.attr("mid"));
												$(".jqzoom").attr(
														'rel',
														$(this).find("img")
																.attr("big"));
											});
								});
					</script>

					<div class="tb-booth tb-pic tb-s310">
						<a href="http://123.207.93.53/Older_back/${product.imgList[0]}"><img
							src="http://123.207.93.53/Older_back/${product.imgList[0]}"
							alt="细节展示放大镜特效"
							rel="http://123.207.93.53/Older_back/${product.imgList[0]}"
							class="jqzoom" /></a>
					</div>
					<ul class="tb-thumb" id="thumblist">
						<c:forEach items="${product.imgList}" var="s">
							<li class="tb-selected">
								<div class="tb-pic tb-s40">
									<a href="javascript:#"> <img
										src="http://123.207.93.53/Older_back/${s}"
										mid="http://123.207.93.53/Older_back/${s}"
										big="http://123.207.93.53/Older_back/${s}">
									</a>
								</div>
							</li>
						</c:forEach>
					</ul>

				</div>
				<div class="clear"></div>
			</div>

			<div class="clearfixRight">
				<!--规格属性-->
				<!--名称-->
				<div class="tb-detail-hd" id="products_name">
					<h1>${product.name}</h1>
				</div>
				<div class="tb-detail-list">
					<!--价格-->
					<div class="tb-detail-price">
						<li class="price iteminfo_price">
							<dt>促销价</dt>
							<dd>
								<em>¥</em> <b class="sys_item_price">${product.nowprice}</b>
							</dd>
						</li>
						<li class="price iteminfo_mktprice">
							<dt>原价</dt>
							<dd>
								<em>¥</em> <b class="sys_item_mktprice">${product.orprice}</b>
							</dd>
						</li>
						<div class="clear"></div>
					</div>
					<div class="clear"></div>

					<!--销量-->
					<ul class="tm-ind-panel">
						<!-- <li class="tm-ind-item tm-ind-sellCount canClick">
									<div class="tm-indcon">
										<span class="tm-label">月销量</span>
										<span class="tm-count">1015</span>
									</div>
								</li> -->
						<li class="tm-ind-item tm-ind-sumCount canClick">
							<div class="tm-indcon">
								<span class="tm-label">累计销量</span> <span class="tm-count">${product.sales}</span>
							</div>
						</li>
					</ul>

					<div class="clear"></div>

					<!--各种规格-->
					<dl class="iteminfo_parameter sys_item_specpara">
						<dt class="theme-login">
							<div class="cart-title">
								可选规格<span class="am-icon-angle-right"></span>
							</div>
						</dt>
						<dd>
							<!--操作页面-->
							<div class="theme-popover-mask"></div>
							<div class="theme-popover">
								<div class="theme-span"></div>
								<div class="theme-poptit">
									<a href="javascript:;" title="关闭" class="close">×</a>
								</div>
								<div class="theme-popbod dform">
									<form class="theme-signin" name="loginform" action=""
										method="post">
										<div class="theme-signin-left">
											<div class="theme-options">
												<div class="cart-title number">数量</div>
												<dd>
													<input id="min" class="am-btn am-btn-default" name=""
														type="button" value="-" /> <input id="text_box" name=""
														type="text" value="1" style="width:30px;" /> <input
														id="add" class="am-btn am-btn-default" name=""
														type="button" value="+" /> <span id="Stock"
														class="tb-hidden">库存<span class="stock">1000</span>件
													</span>
												</dd>
											</div>
											<div class="clear"></div>

											<div class="btn-op">
												<div class="btn am-btn am-btn-warning">确认</div>
												<div class="btn close am-btn am-btn-warning">取消</div>
											</div>
										</div>
										<div class="theme-signin-right">
											<div class="img-info">
												<img src="${APP_PATH}/static/images/songzi.jpg" />
											</div>
											<div class="text-info">
												<span class="J_Price price-now">¥39.00</span> <span
													id="Stock" class="tb-hidden">库存<span class="stock">${product.inventory}</span>件
												</span>
											</div>
										</div>
									</form>
								</div>
							</div>
						</dd>
					</dl>

					<div class="clear"></div>
				</div>

				<!-- 购买 -->
				<div class="pay">
					<div class="pay-opt">
						<a href="home.html"> <span class="am-icon-home am-icon-fw">首页</span>
						</a> <a> <span class="am-icon-heart am-icon-fw">收藏</span>
						</a>
					</div>
					<li>
						<div class="clearfix tb-btn tb-btn-buy theme-login">
							<a id="LikBuy" title="点此按钮到下一步确认购买信息" href="javascript:now_pay()">立即购买</a>
						</div>
					</li>
					<li>
						<div class="clearfix tb-btn tb-btn-basket theme-login">
							<a id="LikBasket" title="加入购物车" href="javascript:addCart()"><i></i>加入购物车</a>
						</div>
					</li>
				</div>

			</div>

			<div class="clear"></div>
		</div>
		<div class="clear"></div>

		<!-- 介绍-->
		<div class="introduce">
			<div class="introduceMain">
				<!-- 介绍主体 -->
				<div class="am-tabs" data-am-tabs>
					<ul class="am-avg-sm-3 am-tabs-nav am-nav am-nav-tabs">
						<li class="am-active"><a href="#"> <span
								class="index-needs-dt-txt">宝贝详情</span>
						</a></li>
						<li><a href="#"> <span class="index-needs-dt-txt">全部评价</span>
						</a></li>
					</ul>

					<!-- 介绍主体内容 -->
					<div class="am-tabs-bd">
						<div class="am-tab-panel am-fade am-in am-active">
							<div class="J_Brand">
								<div class="attr-list-hd tm-clear">
									<h4>产品参数：</h4>
								</div>
								<div class="clear"></div>
								<ul id="J_AttrUL">
									<li title="">产品类型:&nbsp;${product.productType.name}</li>
									<li title="">产地:&nbsp;${product.placeorigin}</li>
									<li title="">产品规格:&nbsp;${product.weight}${product.unit}</li>
									<!-- <li title="">保质期:&nbsp;180天</li>
											<li title="">产品标准号:&nbsp;GB/T 22165</li>
											<li title="">生产许可证编号：&nbsp;QS4201 1801 0226</li>
											<li title="">储存方法：&nbsp;请放置于常温、阴凉、通风、干燥处保存 </li>
											<li title="">食用方法：&nbsp;开袋去壳即食</li> -->
								</ul>
								<div class="clear"></div>
							</div>

							<!-- 商品细节 -->
							<div class="details">
								<div class="attr-list-hd after-market-hd">
									<h4>商品细节</h4>
								</div>
								<div class="twlistNews">
									<c:forEach items="${product.imgList}" var="s">
										<img src="http://123.207.93.53/Older_back/${s}" />
									</c:forEach>
								</div>
							</div>
							<div class="clear"></div>
						</div>

						<!-- 全部评价 -->
						<div class="am-tab-panel am-fade">
							<div class="actor-new">
								<div class="rate">
									<strong>100<span>%</span></strong> <br> <span>好评度</span>
								</div>
								<dl>
									<dt>买家印象</dt>
									<dd class="p-bfc">
										<q class="comm-tags"><span>味道不错</span><em>(2177)</em></q> <q
											class="comm-tags"><span>颗粒饱满</span><em>(1860)</em></q> <q
											class="comm-tags"><span>口感好</span><em>(1823)</em></q> <q
											class="comm-tags"><span>商品不错</span><em>(1689)</em></q> <q
											class="comm-tags"><span>香脆可口</span><em>(1488)</em></q> <q
											class="comm-tags"><span>个个开口</span><em>(1392)</em></q> <q
											class="comm-tags"><span>价格便宜</span><em>(1119)</em></q> <q
											class="comm-tags"><span>特价买的</span><em>(865)</em></q> <q
											class="comm-tags"><span>皮很薄</span><em>(831)</em></q>
									</dd>
								</dl>
							</div>
							<div class="clear"></div>

							<div class="tb-r-filter-bar">
								<ul class=" tb-taglist am-avg-sm-4">
									<li class="tb-taglist-li tb-taglist-li-current">
										<div class="comment-info">
											<span>全部评价</span> <span class="tb-tbcr-num">(32)</span>
										</div>
									</li>
									<li class="tb-taglist-li tb-taglist-li-1">
										<div class="comment-info">
											<span>好评</span> <span class="tb-tbcr-num">(32)</span>
										</div>
									</li>
									<li class="tb-taglist-li tb-taglist-li-0">
										<div class="comment-info">
											<span>中评</span> <span class="tb-tbcr-num">(32)</span>
										</div>
									</li>
									<li class="tb-taglist-li tb-taglist-li--1">
										<div class="comment-info">
											<span>差评</span> <span class="tb-tbcr-num">(32)</span>
										</div>
									</li>
								</ul>
							</div>
							<div class="clear"></div>

							<ul class="am-comments-list am-comments-list-flip">
								<!-- 评论容器 -->
								<li class="am-comment"><a href=""> <!-- 评论者头像 --> <img
										class="am-comment-avatar"
										src="${APP_PATH}/static/images/hwbn40x40.jpg" />
								</a>
									<div class="am-comment-main">
										<!-- 评论内容容器 -->
										<header class="am-comment-hd"> <!--<h3 class="am-comment-title">评论标题</h3>-->
										<!-- 评论元数据 -->
										<div class="am-comment-meta">
											<!-- 评论者 -->
											<a href="#link-to-user" class="am-comment-author">b***1
												(匿名)</a>评论于
											<time datetime="">2015年11月02日 17:46</time>
										</div>
										</header>

										<div class="am-comment-bd">
											<div class="tb-rev-item " data-id="255776406962">
												<!-- 评论内容 -->
												<div class="J_TbcRate_ReviewContent tb-tbcr-content ">
													摸起来丝滑柔软，不厚，没色差，颜色好看！买这个衣服还接到诈骗电话，我很好奇他们是怎么知道我买了这件衣服，并且还知道我的电话的！
												</div>
												<div class="tb-r-act-bar">颜色分类：柠檬黄&nbsp;&nbsp;尺码：S</div>
											</div>
										</div>
									</div></li>
							</ul>
							<div class="clear"></div>

							<!--评论的分页 -->
							<ul class="am-pagination am-pagination-right">
								<li class="am-disabled"><a href="#">&laquo;</a></li>
								<li class="am-active"><a href="#">1</a></li>
								<li><a href="#">2</a></li>
								<li><a href="#">3</a></li>
								<li><a href="#">4</a></li>
								<li><a href="#">5</a></li>
								<li><a href="#">&raquo;</a></li>
							</ul>
							<div class="clear"></div>

							<!-- 提示信息 -->
							<div class="tb-reviewsft">
								<div class="tb-rate-alert type-attention">
									购买前请查看该商品的 <a href="#" target="_blank">购物保障</a>，明确您的售后保障权益。
								</div>
							</div>
						</div>
					</div>
					<!-- 介绍主体内容 -->
				</div>
				<!-- 介绍主体 -->
				<div class="clear"></div>
				<!-- 底部 -->
				<jsp:include page="../person/footer.jsp"></jsp:include>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		var num = $('#text_box').val();
		var id = '${product.id}';
		var userId = '${users.id}';
		function now_pay() {
			window.location.href = "${APP_PATH}/confirm/now_buy/" + id + "&"
					+ num + "&" + userId;
		}
		function addCart() {
			var users = '${users.id}';
			if (users == '') {
				window.location.href = "${APP_PATH}/shop/login";
			} else {
				$.ajax({
					url : "${APP_PATH}/cart/addCart",
					type : "GET",
					data : {
						"usersId" : userId,
						"produtsId" : id,
						"number" : num
					},
					success : function(result) {
						if (result.code == 100) {
							layer.msg("加入成功");
						}
					}
				});
			}
		}
	</script>
</body>
</html>