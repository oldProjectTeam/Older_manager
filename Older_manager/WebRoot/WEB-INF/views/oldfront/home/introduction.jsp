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
							
							<div class="clear"></div>

							<div class="tb-r-filter-bar">
								<ul class=" tb-taglist am-avg-sm-4">
									<li class="tb-taglist-li tb-taglist-li-current">
										<div class="comment-info">
											<span>全部评价</span> <span class="tb-tbcr-num" id="comm1"></span>
										</div>
									</li>
									<li class="tb-taglist-li tb-taglist-li-1">
										<div class="comment-info">
											<span>好评</span> <span class="tb-tbcr-num" id="comm2"></span>
										</div>
									</li>
									<li class="tb-taglist-li tb-taglist-li-0">
										<div class="comment-info">
											<span>中评</span> <span class="tb-tbcr-num" id="comm3"></span>
										</div>
									</li>
									<li class="tb-taglist-li tb-taglist-li--1">
										<div class="comment-info">
											<span>差评</span> <span class="tb-tbcr-num" id="comm4"></span>
										</div>
									</li>
								</ul>
							</div>
							<div class="clear"></div>
                             <div id="divid">
                             
                             </div>
							<div class="clear"></div>

							<!--评论的分页 -->
							<!--分页信息  -->
						<div class="row">
							<div class="col-md-10">
								<nav aria-label="Page navigation" style="float:right">
								<ul class="am-pagination am-pagination-right" id="nav_ul_info">

								</ul>
								</nav>
							</div>
						</div>
							<div class="clear"></div>

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
		var current_pageNum = "";
		var current_pages = "";
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
		//好评 差评
	$(function(){
	       $.ajax({
					url : "${APP_PATH}/comment/selectcomment",
					type : "GET",
					data : {
						"pid" : ${product.id},
						
					},
					success : function(result) {
						if (result.code == 100) {
							var rel=result.extend.map;
							
							$("#comm1").text('('+(rel[1]+rel[2]+rel[3]+rel[4]+rel[5])+')');
							$("#comm2").text('('+(rel[4]+rel[5])+')');
							$("#comm3").text('('+(rel[3])+')');
							$("#comm4").text('('+(rel[1]+rel[2])+')');
						}
					}
				});
	
	
	//构建
	bulidthis();
	});	
		
		
	//评论	
	//构建
							
	function bulidthis(result){	
	       $("#divid").empty();	
		    current_pageNum = result.extend.pageInfo.pageNum;
			current_pages = result.extend.pageInfo.pages;
	$.each(result.extend.pageInfo.list, function(index, item) {	
	var tul=$("<ul></ul>").addClass("am-comments-list am-comments-list-flip").appendTo("#divid");
	var tli=$("<li></li>").addClass("am-comment").appendTo(tul);
	var ta=$("<a></a>").append("<img class='am-comment-avatar' src='${APP_PATH}/static/images/hwbn40x40.jpg' />").appendTo(tli);
	
	var divout=$("<div></div>").addClass("am-comment-main").appendTo(tli);
	var theader=$("<header></header>").addClass("am-comment-hd").appendTo(divout);
	var divin=$("<div></div>").addClass("am-comment-meta").appendTo(theader);
	var tain=$("<a></a>").addClass("am-comment-author").append(item.users.email+'  ').appendTo(divin);
	var ttime=$("<time datetime=''></time>").append(ChangeDateFormat(item.createtime)).appendTo(divin);
	var div1=$("<div></div>").addClass("am-comment-bd").appendTo(divout);
	var div4=$("<div data-id='255776406962'></div>").addClass("tb-rev-item").appendTo(div1);
	var div2=$("<div></div>").append(item.content).addClass("J_TbcRate_ReviewContent tb-tbcr-content").appendTo(div4);
	
	});
	
	}	
	
	
	function buil_table_pageInfo(result) {
			$("#nav_ul_info").empty();
			$("#page_info").empty();
			//左边分页信息
			var pageInfo = result.extend.pageInfo;
			
			var firstPage = $("<li></li>").append($("<a></a>").append("首页"));
			var prePage = $("<li></li>").append($("<a></a>").append("&laquo;"));
			var nextPage = $("<li></li>")
					.append($("<a></a>").append("&raquo;"));
			var lastPage = $("<li></li>").append($("<a></a>").append("末页"));
			if (result.extend.pageInfo.hasPreviousPage == false) {
				firstPage.addClass("am-disabled");
				prePage.addClass("am-disabled");
			} else {
				firstPage.click(function() {
					go(1);
				});
				prePage.click(function() {
					go(result.extend.pageInfo.pageNum - 1);
				});
			}
			if (result.extend.pageInfo.hasNextPage == false) {
				nextPage.addClass("am-disabled");
				lastPage.addClass("am-disabled");
			} else {
				nextPage.click(function() {
					go(result.extend.pageInfo.pageNum + 1);
				});
				lastPage.click(function() {
					go(result.extend.pageInfo.pages);
				});
			}
			$("#nav_ul_info").append(firstPage).append(prePage);
			$.each(result.extend.pageInfo.navigatepageNums, function(index,
					item) {
				var numLi = $("<li></li>").append($("<a></a>").append(item));
				if (result.extend.pageInfo.pageNum == item) {
					numLi.addClass("am-active");
				}
				numLi.click(function() {
					go(item);
				});
				$("#nav_ul_info").append(numLi);
			});
			$("#nav_ul_info").append(nextPage).append(lastPage);

		}
	$(function(){
	      go(1);
	});
	
	
	
	
	
	
	
	
	
//去第几页		
function go(pn){

         $.ajax({
					url : "${APP_PATH}/comment/selectallcomment",
					type : "GET",
					data : {
					    "pn":pn,
						"pid" : ${product.id},
						
					},
					success : function(result) {
						if (result.code == 100) {
						   //构建这个
							bulidthis(result);
						   //分页
						   buil_table_pageInfo(result);
						}
					}
				});
	

}		
		
		function ChangeDateFormat(d) {
			//将时间戳转为int类型，构造Date类型
			if (d != null) {
				var date = new Date(parseInt(d));

				//月份得+1，且只有个位数时在前面+0
				var month = date.getMonth() + 1 + "月";

				//日期为个位数时在前面+0
				var currentDate = date.getDate()+"日";
                var hoses=date.getHours();
                var mm=date.getMinutes();
                if(mm<10){
                   mm="0"+mm;
                }
				//getFullYear得到4位数的年份 ，返回一串字符串
				return date.getFullYear() + "年" + month + currentDate+" "+hoses+":"+mm;
			} else {
				return null;
			}
		}
		
	</script>
</body>
</html>