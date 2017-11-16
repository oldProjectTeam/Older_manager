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

<title>商城商品搜索</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
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
						<li class="index"><a href="${APP_PATH}/shop/oldfronthome">首页</a>
						</li>
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
						<div class="searchAbout">
							<span class="font-pale">相关搜索：</span> <a title="坚果" href="#">坚果</a>
							<a title="瓜子" href="#">瓜子</a> <a title="鸡腿" href="#">豆干</a>

						</div>
						<ul class="select">
							<p class="title font-normal">
								<span class="fl" id="searchword"></span> <span class="total fl">搜索到<strong
									class="num" id="searchNumber">997</strong>件相关商品
								</span>
							</p>
							<div class="clear"></div>
							<li class="select-result">
								<dl>
									<dt>已选</dt>
									<dd class="select-no"></dd>
									<p class="eliminateCriteria">清除</p>
								</dl>
							</li>
							<div class="clear"></div>
							<li class="select-list">
								<dl id="select1">
									<dt class="am-badge am-round">品牌</dt>

									<div class="dd-conent" id="brand_nav"></div>

								</dl>
							</li>
							<li class="select-list">
								<dl id="select2">
									<dt class="am-badge am-round">种类</dt>
									<div class="dd-conent" id="products_type"></div>
								</dl>
							</li>
							<li class="select-list">
								<dl id="select3">
									<dt class="am-badge am-round">选购热点</dt>
									<div class="dd-conent">
										<dd class="select-all selected">
											<a href="#">全部</a>
										</dd>
										<dd>
											<a href="#">手剥松子</a>
										</dd>
										<dd>
											<a href="#">薄壳松子</a>
										</dd>
										<dd>
											<a href="#">进口零食</a>
										</dd>
										<dd>
											<a href="#">有机零食</a>
										</dd>
									</div>
								</dl>
							</li>

						</ul>
						<div class="clear"></div>
					</div>
					<div class="search-content">
						<div class="sort">
							<li class="first"><a title="综合">综合排序</a></li>
							<li><a title="销量">销量排序</a></li>
							<li><a title="价格">价格优先</a></li>
							<li class="big"><a title="评价" href="#">评价为主</a></li>
						</div>
						<div class="clear"></div>

						<ul class="am-avg-sm-2 am-avg-md-3 am-avg-lg-4 boxes"
							id="center_goods_date">
						</ul>
					</div>

					<div class="search-side">

						<div class="side-title">经典搭配</div>

						<li>
							<div class="i-pic check">
								<img src="${APP_PATH}/static/images/cp.jpg" />
								<p class="check-title">萨拉米 1+1小鸡腿</p>
								<p class="price fl">
									<b>¥</b> <strong>29.90</strong>
								</p>
								<p class="number fl">
									销量<span>1110</span>
								</p>
							</div>
						</li>
						<li>
							<div class="i-pic check">
								<img src="${APP_PATH}/static/images/cp2.jpg" />
								<p class="check-title">ZEK 原味海苔</p>
								<p class="price fl">
									<b>¥</b> <strong>8.90</strong>
								</p>
								<p class="number fl">
									销量<span>1110</span>
								</p>
							</div>
						</li>
						<li>
							<div class="i-pic check">
								<img src="${APP_PATH}/static/images/cp.jpg" />
								<p class="check-title">萨拉米 1+1小鸡腿</p>
								<p class="price fl">
									<b>¥</b> <strong>29.90</strong>
								</p>
								<p class="number fl">
									销量<span>1110</span>
								</p>
							</div>
						</li>

					</div>
					<div class="clear"></div>
					<!--分页 -->

					<ul id="footerPage" class="am-pagination am-pagination-right">
					</ul>

				</div>
			</div>
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

	</div>

	<!--引导 -->
	<div class="navCir">
		<li><a href="home.html"> <i class="am-icon-home "></i>首页
		</a></li>
		<li><a href="sort.html"> <i class="am-icon-list"></i>分类
		</a></li>
		<li><a href="shopcart.html"> <i
				class="am-icon-shopping-basket"></i>购物车
		</a></li>
		<li><a href="../person/index.html"> <i class="am-icon-user"></i>我的
		</a></li>
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
					<li class="qtitem"><a href="#"> <span class="kfzx"></span>
					</a>
						<div class="mp_tooltip">
							客服中心<i class="icon_arrow_right_black"></i>
						</div></li>
					<!--二维码 -->
					<li class="qtitem"><a href="#none"> <span
							class="mpbtn_qrcode"></span>
					</a>
						<div class="mp_qrcode" style="display:none;">
							<img src="${APP_PATH}/static/images/weixin_code_145.png" /><i
								class="icon_arrow_white"></i>
						</div></li>
					<li class="qtitem"><a href="#top" class="return_top"> <span
							class="top"></span>
					</a></li>
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

			<div class="ia-head-list">
				<a href="#" target="_blank" class="pl">
					<div class="num">0</div>
					<div class="text">优惠券</div>
				</a> <a href="#" target="_blank" class="pl">
					<div class="num">0</div>
					<div class="text">红包</div>
				</a> <a href="#" target="_blank" class="pl money">
					<div class="num">￥0</div>
					<div class="text">余额</div>
				</a>
			</div>

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
	<!-- <script>
        window.jQuery || document.write('<script src="basic/js/jquery-1.9.min.js"><\/script>');
    </script> -->
	<!-- <script type="text/javascript" src="../basic/js/quick_links.js"></script>
 -->
	<div class="theme-popover-mask"></div>


	<script>
		jQuery(function($) {
			var data = "${rearchkey}";//外部传入的搜索关键字

			if (data == null) {
				go(1);
			} else {
				$("#searchInput").val(data);
				$("#searchword").html(data);
				layer.load(2);

				//搜索查询所有的商品
				$.ajax({
					url : "home/test",
					data : {
						"search" : data,
						"pn" : 1
					},
					type : "GET",
					success : function(result) {
						setTimeout(function() {
							layer.closeAll('loading');
						}, 500);
						if (result.code == 100) {
							//构建分页信息
							build_page_text(result);
							//构建分页条
							build_page_nav(result, 0);
							//构建表格数据
							build_table_data(result);
						}
					}
				});

				//查询商品对应的品牌
				$.ajax({
					url : "home/searchProductsByAllBrand",
					data : {
						"search" : data
					},
					type : "GET",
					success : function(result) {
						setTimeout(function() {
							layer.closeAll('loading');
						}, 500);
						if (result.code == 100) {
							//构建品牌
							build_brand(result);
						}
					}
				});

				//查询商品对应的种类
				$.ajax({
					url : "home/searchProductsByAllProductType",
					data : {
						"search" : data
					},
					type : "GET",
					success : function(result) {
						setTimeout(function() {
							layer.closeAll('loading');
						}, 500);
						if (result.code == 100) {
							//构建种类
							build_productType(result);
						}
					}
				});
				//查询商品对应的种类
				/* $.ajax({
				    url : "home/searchProductsByAllProductType",
				    data : {
				        "search" : data,
				        "pn" : 1
				    },
				    type : "GET",
				    success : function(result) {
				        setTimeout(function() {
				            layer.closeAll('loading');
				        }, 500);
				        if (result.code == 100) {
				            //构建热销产品
				            build_Hotproduct(result);
				        }
				    }
				}); */
			}

		});
		//构建品牌
		function build_brand(result) {
			$("#brand_nav").empty();

			var ddAll = $("<dd></dd>");
			var aa = $("<a></a>").append("全部")
			ddAll.addClass("select-all selected").append(aa);
			$("#brand_nav").append(ddAll);
			$.each(result.extend.bran, function(index, item) {
				var a1 = $("<a></a>").append(item.name)
				var ddbrand = $("<dd></dd>").append(a1);
				ddbrand.attr("brand", item.name);
				ddbrand.appendTo($("#brand_nav"));
			});
		};

		//构建种类
		function build_productType(result) {
			$("#products_type").empty();

			var ddAll = $("<dd></dd>");
			var aa = $("<a></a>").append("全部")
			ddAll.addClass("select-all selected").append(aa);
			$("#products_type").append(ddAll);
			$.each(result.extend.bran, function(index, item) {
				var a1 = $("<a></a>").append(item.name)
				var ddbrand = $("<dd></dd>").append(a1);
				ddbrand.attr("brand", item.name);
				ddbrand.appendTo($("#products_type"));

			});
		}

		var totalRecord, currentNum;

		function go(pn) {
			layer.load(2);
			$.ajax({
				url : "home/test",
				data : {
					"search" : "",
					"pn" : pn
				},
				type : "GET",
				success : function(result) {
					setTimeout(function() {
						layer.closeAll('loading');
					}, 500);
					if (result.code == 100) {
						//构建分页信息
						build_page_text(result);
						//构建分页条
						build_page_nav(result, 0);
						//构建表格数据
						build_table_data(result);
					}
				}
			});
		}

		//构建头部的所有搜索条数
		function build_page_text(result) {
			$("#searchNumber").html(" " + result.extend.pageInfo.total + " ");
		}
		//解析显示分页条信息
		function build_page_nav(result, code) {
			var firstPageLi;
			var lastPageLi;
			$("#footerPage").empty();
			var ul = $("#footerPage");
			if (code == 1) {
				firstPageLi = $("<li></li>").append(
						$("<a></a>").append("首页").attr("href",
								"javascript:search(1)"));
			} else {
				firstPageLi = $("<li></li>").append(
						$("<a></a>").append("首页").attr("href",
								"javascript:go(1)"));
			}

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
			if (code == 1) {
				lastPageLi = $("<li></li>").append(
						$("<a></a>").append("末页").attr(
								"href",
								"javascript:search("
										+ result.extend.pageInfo.pages + ")"));
			} else {
				lastPageLi = $("<li></li>").append(
						$("<a></a>").append("末页").attr(
								"href",
								"javascript:go(" + result.extend.pageInfo.pages
										+ ")"));
			}

			if (result.extend.pageInfo.hasNextPage == false) {
				nextPageLi.addClass("disabled");
				lastPageLi.addClass("disabled");
			} else {
				if (code == 1) {
					nextPageLi.click(function() {
						search(result.extend.pageInfo.pageNum + 1);
					});
				} else {
					nextPageLi.click(function() {
						go(result.extend.pageInfo.pageNum + 1);
					});
				}
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
					if (code == 1) {
						search(item);
					} else {
						go(item);
					}
				});
				ul.append(numLi);
			});
			//添加下一页和末页的提示
			ul.append(nextPageLi).append(lastPageLi);
		}

		function build_table_data(result) {

			$("#center_goods_date").empty();

			$.each(result.extend.pageInfo.list, function(index, item) {

				var dataLi = $("<li></li>");
				var dataDiv = $("<div></div>").addClass("i-pic limit");
				//var dataimg = $("<img>").attr("src", item.images);//原始图片数据
				var dataimg = $("<img>").attr("src",
						"${APP_PATH}/static/images/imgsearch1.jpg");
				var dataPname = $("<p></p>").addClass("title fl").append(
						item.name);
				var dateSprice = $("<strong></strong>").append(item.nowprice);
				var dataPprice = $("<p></p>").addClass("price fl").append(
						"<b>¥</b>").append(dateSprice);
				var dateSsales = $("<span></span>").append(item.sales);
				var dataPsales = $("<td></td>").addClass("number fl").append(
						"销量").append(dateSsales);

				dataDiv.attr("products_id", item.id);
				//单个div点击事件
				dataDiv.click(function() {
					layer.open({
						title : '测试'
					});
					window.load.href = "/shop/"
				});

				dataLi.append(
						dataDiv.append(dataimg).append(dataPname).append(
								dataPprice).append(dataPsales)).appendTo(
						$("#center_goods_date"));
			});
		}

		//搜索按钮
		$("#ai-topsearch").click(function() {
			search(1);
		});

		function search(pn) {
			var dtitle = $('#searchInput').val();//获取搜索的值
			$("#searchword").html(dtitle);
			if (dtitle.length == 0) {
				layer.open({
					offset : [ '10%' ],
					title : '搜索提示',
					content : '请输入搜索数据！'
				});
				go(1);
			} else {
				layer.load(2);
				$.ajax({
					url : "home/test",
					data : {
						"search" : dtitle,
						"pn" : pn
					},
					type : "get",
					success : function(result) {
						setTimeout(function() {
							layer.closeAll('loading');
						}, 500);
						if (result.code == 100) {
							if (result.extend.pageInfo.list == null) {
								layer.open({
									offset : [ '10%' ],
									title : '搜索提示',
									content : '查询不到相关数据！'
								});
							} else {
								//构建分页信息
								build_page_text(result);
								//构建分页条
								build_page_nav(result, 1);
								//构建表格数据
								build_table_data(result);
							}

						} else {
							layer.open({
								offset : [ '10%' ],
								title : '搜索提示',
								content : result.extend.msg
							});
						}
					}
				});
			}

		}

		function checkStr(str) {
			// [\u4E00-\uFA29]|[\uE7C7-\uE7F3]汉字编码范围 
			var re1 = new RegExp(
					"^([\u4E00-\uFA29]|[\uE7C7-\uE7F3]|[a-zA-Z0-9]|@)*$");
			if (!re1.test(str)) {
				alert("请输入中文字符");
				return false;
			} else {
				return true;
			}
		}
	</script>
</body>

</html>