<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
	<!--顶部导航条 -->
	<div class="am-container header">
		<ul class="message-l">
			<div class="topMessage">
				<div class="menu-hd">
					<c:if test="${empty users}">
						<a href="shop/login" target="_top" class="h">亲，请登录</a>
						<a href="shop/register" target="_top">免费注册</a>
					</c:if>
					欢迎 <a href="shop/index" target="_top" class="h"> <b>${users.account}</b>
					</a>
				</div>
			</div>
		</ul>
		<ul class="message-r">
			<div class="topMessage home">
				<div class="menu-hd">
					<a href="${APP_PATH}/shop/oldfronthome" target="_top" class="h">商城首页</a>
				</div>
			</div>
			<div class="topMessage my-shangcheng">
				<div class="menu-hd MyShangcheng">
					<a href="${APP_PATH}/address/index" target="_top"> <i
						class="am-icon-user am-icon-fw"></i>个人中心
					</a>
				</div>
			</div>
			<div class="topMessage mini-cart">
				<div class="menu-hd">
					<a id="mc-menu-hd" href="shop/shopcart" target="_top"> <i
						class="am-icon-shopping-cart  am-icon-fw"></i><span>购物车</span><strong
						id="J_MiniCartNum" class="h">0</strong>
					</a>
				</div>
			</div>
			<div class="topMessage favorite">
				<div class="menu-hd">
					<a href="shop/collection" target="_top"> <i
						class="am-icon-heart am-icon-fw"></i><span>收藏夹</span>
					</a>
				</div>
		</ul>
	</div>

	<!--悬浮搜索框-->

	<div class="nav white">
		<div class="logoBig">
			<li><a href="${APP_PATH}/shop/oldfronthome"><img
					src="${APP_PATH}/static/images/oldback/images/logo.png"
					height="65px;" style="margin-top: 10px" /></a></li>
		</div>

		<div class="search-bar pr">
			<a name="index_none_header_sysc" href="home/complexSearch"></a>
			<form action="home/search">
				<input id="searchInput" name="searchKeyWord" type="text"
					placeholder="搜索" autocomplete="off"> <input
					id="ai-topsearch" class="submit am-btn" value="搜索" index="1"
					type="button">
			</form>
		</div>
	</div>
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
					</ul>
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
									class="num" id="searchNumber">0</strong>件相关商品
								</span>
							</p>
							<div class="clear"></div>
							<li class="select-result">
								<dl>
									<dt>已选</dt>
									<dd class="select-no"></dd>
									<p class="eliminateCriteria" id="clearAllselect">清除</p>
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
									<div class="dd-conent" id="hotkey_nav"></div>
								</dl>
							</li>

						</ul>
						<div class="clear"></div>
					</div>
					<div class="search-content">
						<div class="sort">
							<li class="first" id="composite"><a title="综合">综合排序</a></li>
							<li id="sales"><a title="销量">销量排序</a></li>
							<li id="price"><a title="价格">价格优先</a></li>
							<!-- <li class="big">
								<a title="评价" href="#">评价为主</a>
							</li> -->
						</div>
						<div class="clear"></div>

						<ul class="am-avg-sm-2 am-avg-md-3 am-avg-lg-4 boxes"
							id="center_goods_date">
						</ul>
					</div>
					<div class="clear"></div>
					<!--分页 -->
					<ul id="footerPage" class="am-pagination am-pagination-right">
					</ul>
				</div>
			</div>
			<jsp:include page="../person/footer.jsp"></jsp:include>
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
	<script>
		var brand_data;
		var type_data;
		var keyword_data;
		var search_key;
		jQuery(function($) {
			var data = null;
			var data2 = "${rearchkey}";//外部传入的搜索关键字
			var brand_data_go = "${brandkey}";
			var type_data_go = "${typekey}";
			if (data2 != '') {
				$("#searchInput").val(data2);
				$("#searchword").html(data2);
				search_key = data2;
	<%request.removeAttribute("rearchkey");%>
		} else if (brand_data_go != '') {
				$("#searchInput").val(brand_data_go);
				$("#searchword").html(brand_data_go);
				brand_data = brand_data_go;
	<%request.removeAttribute("brandkey");%>
		} else if (type_data_go != '') {
				$("#searchInput").val(type_data_go);
				$("#searchword").html(type_data_go);
				type_data = type_data_go;
	<%request.removeAttribute("typekey");%>
		}
			go(1);
			data = $('#searchInput').val();
			init_ProductsDetail(data);
		});
		//构建品牌
		function build_brand(result) {
			$("#brand_nav").empty();

			if (result.extend.bran == '') {
				var ddAll = $("<dd></dd>");
				var aa = $("<a></a>").append("无")
				ddAll.addClass("select-all selected").append(aa);
				$("#brand_nav").append(ddAll);
			} else {
				var ddAll = $("<dd></dd>");
				var aa = $("<a></a>").append("全部")
				ddAll.addClass("select-all selected").append(aa);
				$("#brand_nav").append(ddAll);
				$.each(result.extend.bran, function(index, item) {
					var a1 = $("<a></a>").append(item.name)
					var ddbrand = $("<dd></dd>").append(a1);

					ddbrand.attr("brand", item.name);
					ddbrand.click(function() {
						brand_data = ddbrand.attr("brand");
						search(1, 0, 0, 0);
					});
					ddbrand.appendTo($("#brand_nav"));
				});
				aa.click(function() {
					brand_data = '';
					search(1, 0, 0, 0);
				});

			}

		};

		function init_ProductsDetail(data) {
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

			//查询商品对应的关键词
			$.ajax({
				url : "home/searchHotKeywordProductsByAllProductType",
				data : {
					"search" : data
				},
				type : "GET",
				success : function(result) {
					setTimeout(function() {
						layer.closeAll('loading');
					}, 500);
					if (result.code == 100) {
						//构建热销产品关键词
						build_Hotproduct(result);
					} else {
						build_Hotproduct(null);
					}
				}
			});
		}

		//构建种类
		function build_productType(result) {
			$("#products_type").empty();

			if (result.extend.bran == '') {
				var ddAll = $("<dd></dd>");
				var aa = $("<a></a>").append("无")
				ddAll.addClass("select-all selected").append(aa);
				$("#products_type").append(ddAll);
			} else {
				var ddAll = $("<dd></dd>");
				var aa = $("<a></a>").append("全部")
				ddAll.addClass("select-all selected").append(aa);
				$("#products_type").append(ddAll);
				$.each(result.extend.bran, function(index, item) {
					if (item.name != '') {
						var a1 = $("<a></a>").append(item.name)
						var ddtype = $("<dd></dd>").append(a1);
						ddtype.attr("type", item.name);
						ddtype.click(function() {
							type_data = ddtype.attr("type");
							search(1, 0, 0, 0);
						});
						ddtype.appendTo($("#products_type"));
					}
				});
				aa.click(function() {
					type_data = '';
					search(1, 0, 0, 0);
				});
			}

		};

		//构建热搜关键词
		function build_Hotproduct(result) {
			$("#hotkey_nav").empty();

			if (result == null) {
				var ddAll = $("<dd></dd>");
				var aa = $("<a></a>").append("无")
				ddAll.addClass("select-all selected").append(aa);
				$("#hotkey_nav").append(ddAll);
			} else {
				var ddAll = $("<dd></dd>");
				var aa = $("<a></a>").append("全部")
				ddAll.addClass("select-all selected").append(aa);
				$("#hotkey_nav").append(ddAll);
				$.each(result.extend.HotkeyWord, function(index, item) {
					if (item != '') {
						var a1 = $("<a></a>").append(item)
						var ddhotkey = $("<dd></dd>").append(a1);
						ddhotkey.attr("keyword", item);
						ddhotkey.click(function() {
							keyword_data = ddhotkey.attr("keyword");
							search(1, 0, 0, 0);
						});
						ddhotkey.appendTo($("#hotkey_nav"));
					}
				});
				aa.click(function() {
					ddhotkey = '';
					search(1, 0, 0, 0);
				});
			}
		}

		var totalRecord, currentNum;

		function go(pn) {
			layer.load(2);
			$.ajax({
				url : "home/sampleSearch",
				data : {
					"keyword" : search_key,
					"typename" : type_data,
					"brandname" : brand_data,
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
						build_page_nav(result, 0, 0, 0, 0);
						//构建表格数据
						build_table_data(result);
						type_data = '';
						search_key = '';
						brand_data = '';
					}
				}
			});
		}

		//构建头部的所有搜索条数
		function build_page_text(result) {
			$("#searchNumber").html(" " + result.extend.pageInfo.total + " ");
		}
		//解析显示分页条信息
		function build_page_nav(result, code, pricestate, salestate,
				commentstate) {
			var firstPageLi;
			var lastPageLi;
			$("#footerPage").empty();
			var ul = $("#footerPage");
			if (code == 1) {
				if (pricestate == 0 && salestate == 0 && commentstate == 0) {
					firstPageLi = $("<li></li>").append(
							$("<a></a>").append("首页").attr("href",
									"javascript:search(1,0,0,0)"));
				} else if (pricestate == 1 && salestate == 0
						&& commentstate == 0) {
					firstPageLi = $("<li></li>").append(
							$("<a></a>").append("首页").attr("href",
									"javascript:search(1,1,0,0)"));
				} else if (pricestate == 1 && salestate == 1
						&& commentstate == 0) {
					firstPageLi = $("<li></li>").append(
							$("<a></a>").append("首页").attr("href",
									"javascript:search(1,1,1,0)"));
				} else if (pricestate == 0 && salestate == 1
						&& commentstate == 0) {
					firstPageLi = $("<li></li>").append(
							$("<a></a>").append("首页").attr("href",
									"javascript:search(1,0,1,0)"));
				}
				;

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
				prePageLi
						.click(function() {
							if (code == 1) {
								if (pricestate == 0 && salestate == 0
										&& commentstate == 0) {
									search(result.extend.pageInfo.pageNum - 1,
											0, 0, 0);
								} else if (pricestate == 1 && salestate == 0
										&& commentstate == 0) {
									search(result.extend.pageInfo.pageNum - 1,
											1, 0, 0);
								} else if (pricestate == 1 && salestate == 1
										&& commentstate == 0) {
									search(result.extend.pageInfo.pageNum - 1,
											1, 1, 0);
								} else if (pricestate == 0 && salestate == 1
										&& commentstate == 0) {
									search(result.extend.pageInfo.pageNum - 1,
											0, 1, 0);
								}
								;
							} else {
								go(result.extend.pageInfo.pageNum - 1);
							}
						});
			}
			var nextPageLi = $("<li></li>").append(
					$("<a></a>").append("&raquo;"));
			if (code == 1) {
				if (pricestate == 0 && salestate == 0 && commentstate == 0) {
					lastPageLi = $("<li></li>").append(
							$("<a></a>").append("末页").attr(
									"href",
									"javascript:search("
											+ result.extend.pageInfo.pages
											+ ",0,0,0)"));
				} else if (pricestate == 1 && salestate == 0
						&& commentstate == 0) {
					lastPageLi = $("<li></li>").append(
							$("<a></a>").append("末页").attr(
									"href",
									"javascript:search("
											+ result.extend.pageInfo.pages
											+ ",1,0,0)"));

				} else if (pricestate == 1 && salestate == 1
						&& commentstate == 0) {
					lastPageLi = $("<li></li>").append(
							$("<a></a>").append("末页").attr(
									"href",
									"javascript:search("
											+ result.extend.pageInfo.pages
											+ ",1,1,0)"));
				} else if (pricestate == 0 && salestate == 1
						&& commentstate == 0) {
					lastPageLi = $("<li></li>").append(
							$("<a></a>").append("末页").attr(
									"href",
									"javascript:search("
											+ result.extend.pageInfo.pages
											+ ",0,1,0)"));
				}
				;

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
					if (pricestate == 0 && salestate == 0 && commentstate == 0) {
						nextPageLi
								.click(function() {
									search(result.extend.pageInfo.pageNum + 1,
											0, 0, 0);
								});
					} else if (pricestate == 1 && salestate == 0
							&& commentstate == 0) {
						nextPageLi
								.click(function() {
									search(result.extend.pageInfo.pageNum + 1,
											1, 0, 0);
								});

					} else if (pricestate == 1 && salestate == 1
							&& commentstate == 0) {
						nextPageLi
								.click(function() {
									search(result.extend.pageInfo.pageNum + 1,
											1, 1, 0);
								});
					} else if (pricestate == 0 && salestate == 1
							&& commentstate == 0) {
						nextPageLi
								.click(function() {
									search(result.extend.pageInfo.pageNum + 1,
											0, 1, 0);
								});
					}
					;
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
						if (pricestate == 0 && salestate == 0
								&& commentstate == 0) {
							search(item, 0, 0, 0);
						} else if (pricestate == 1 && salestate == 0
								&& commentstate == 0) {
							search(item, 1, 0, 0);
						} else if (pricestate == 1 && salestate == 1
								&& commentstate == 0) {
							search(item, 1, 1, 0);
						} else if (pricestate == 0 && salestate == 1
								&& commentstate == 0) {
							search(item, 0, 1, 0);
						}
						;
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
				var dataimg = $("<img>").css("height", "218").css("width",
						"218");
				if (item.images.indexOf(",") > 0) {
					dataimg.attr("src", "http://gyadmin-1252357563.file.myqcloud.com/"
							+ item.images.split(",", 1));
				} else {
					dataimg.attr("src", "http://gyadmin-1252357563.file.myqcloud.com/"
							+ item.images);
				}

				//var dataimg = $("<img>").attr("src", "${APP_PATH}/static/images/imgsearch1.jpg");
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
					window.location.href = "product/getProduct/"
							+ dataDiv.attr("products_id");
				});

				dataLi.append(
						dataDiv.append(dataimg).append(dataPname).append(
								dataPprice).append(dataPsales)).appendTo(
						$("#center_goods_date"));
			});
		}

		//清除按钮
		$("#clearAllselect").click(function() {
			brand_data = '';
			type_data = '';
			keyword_data = '';
			search(1, 0, 0, 0);
		});

		//搜索按钮
		$("#ai-topsearch").click(function() {
			search(1, 0, 0, 0);
		});

		//综合排序
		$("#composite").click(function() {
			$("#composite").addClass("first");
			$("#sales").removeClass("first");
			$("#price").removeClass("first");
			search(1, 1, 0, 0);
		});

		//价格排序
		$("#price").click(function() {
			$("#price").addClass("first");
			$("#sales").removeClass("first");
			$("#composite").removeClass("first");
			search(1, 1, 0, 0);
		});

		//销量排序
		$("#sales").click(function() {
			$("#sales").addClass("first");
			$("#price").removeClass("first");
			$("#composite").removeClass("first");
			search(1, 0, 1, 0);
		});

		function search(pn, pricestate, salestate, commentstate) {
			var dtitle = $('#searchInput').val();//获取搜索的值
			$("#searchword").html(dtitle);
			if (dtitle.length == 0) {
				/* layer.open({
				    offset : [ '10%' ],
				    title : '搜索提示',
				    content : '请输入搜索数据！'
				}); */
				go(1);
			} else {
				init_ProductsDetail(dtitle);
				layer.load(2);
				$.ajax({
					url : "home/complexSearch",
					data : {
						"searchkey" : dtitle,
						"brandname" : brand_data,
						"typename" : type_data,
						"keywordname" : keyword_data,
						"pricestate" : pricestate,
						"salestate" : salestate,
						"commentstate" : commentstate,
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
								build_page_nav(result, 1, pricestate,
										salestate, commentstate);
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
				layer.msg("请输入中文字符");
				return false;
			} else {
				return true;
			}
		}

		function keyDownSearch(e) {
			// 兼容FF和IE和Opera  
			var theEvent = e || window.event;
			var code = theEvent.keyCode || theEvent.which || theEvent.charCode;
			if (code == 13) {
				search(1, 1, 0, 0);
				return false;
			}
			return true;
		}
	</script>
</body>

</html>