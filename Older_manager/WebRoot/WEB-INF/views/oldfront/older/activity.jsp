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
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>智慧老人系统</title>
<link href="${APP_PATH}/static/oldfront/assets/css/bootstrap.css"
	rel="stylesheet" />
<link href="${APP_PATH}/static/oldfront/assets/css/font-awesome.css"
	rel="stylesheet" />
<link href="${APP_PATH}/static/oldfront/assets/css/animate.css"
	rel="stylesheet" />
<link href="${APP_PATH}/static/oldfront/assets/css/flexslider.css"
	rel="stylesheet" />
<link href="${APP_PATH}/static/oldfront/assets/css/prettyPhoto.css"
	rel="stylesheet" />
<link href="${APP_PATH}/static/oldfront/assets/css/style.css"
	rel="stylesheet" />
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300'
	rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Lobster'
	rel='stylesheet' type='text/css' />
</head>
<body>
	<section class="menu-section">
	<div class="container">
		<div class="row ">
			<div class="col-md-12">
				<div class="navbar-collapse collapse">
					<ul id="menu-top"
						class="nav navbar-nav navbar-fixed-top navbar-inverse">
						<li
							style="padding-left: 15px;padding-top: 6px;padding-bottom: 6px;"><img
							src="${APP_PATH}/static/images/oldback/images/logo.png"
							width="200px" style="margin-right: 240px;" /></li>
						<li><a href="${APP_PATH}/older/index"
							class="menu-top-active check">主页</a></li>
						<li><a href="${APP_PATH}/older/" class="check">课程专区</a></li>
						<li><a href="${APP_PATH}/older/video_list" class="check">视频专区</a></li>
						<li><a href="${APP_PATH}/older/activity" class="menu-top-active check">社区活动</a></li>
						<li><a href="${APP_PATH}/shop/oldfronthome" class="check">电子商务</a></li>
						<li>
						<!-- 用户头像 -->
						<img src="${APP_PATH}/static/images/old.png" height="30" width="30" style="margin-left: 240px;margin-top: 20px;display: none;"  class="img-circle">
						 <a href="${APP_PATH}/older/login" style="margin-left: 240px;">登录</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	</section>
	<div class="just-sec" id="port-folio">
		<div class="container">
			<div class="row">
				<ul id="filters">
					<li><span class="filter active"
						data-filter="landscape nature awesome">比赛 </span></li>
					<li><span class="filter active">/</span></li>
					<li><span class="filter" data-filter="landscape">旅游</span></li>
					<li><span class="filter">/</span></li>
					<li><span class="filter" data-filter="nature">歌舞会</span></li>
					<li><span class="filter">/</span></li>
					<li><span class="filter" data-filter="awesome">欢迎您的加入</span></li>
				</ul>
				<img src="${APP_PATH}/static/images/load.gif" width="100"
					height="100" class="col-md-offset-5 activity" />
				<div id="content1" class="row"></div>
				<div id="content2" class="row"></div>
			</div>
		</div>
	</div>
	<div id="page_nav" style="margin-left: 500px;"></div>
	<jsp:include page="footer.jsp"></jsp:include>
	<script
		src="${APP_PATH}/static/oldfront/assets/js/jquery-1.11.1.min.js"></script>
	<script src="${APP_PATH}/static/oldfront/assets/js/bootstrap.js"></script>
	<script src="${APP_PATH}/static/oldfront/assets/js/wow.js"></script>
	<script
		src="${APP_PATH}/static/oldfront/assets/js/jquery.flexslider.js"></script>
	<script
		src="${APP_PATH}/static/oldfront/assets/js/jquery.prettyPhoto.js"></script>
	<script
		src="${APP_PATH}/static/oldfront/assets/js/jquery.mixitup.min.js"></script>
	<script src="${APP_PATH}/static/oldfront/assets/js/custom.js"></script>
	<script type="text/javascript">
		$(function() {
			go(1);
		});
		function go(pn) {
			$("#content1").empty();
			$("#content2").empty();
			$("#page_nav").empty();
			$
					.ajax({
						url : "${APP_PATH}/official/infoActivity/" + pn,
						type : "GET",
						success : function(result) {
							if (result.code == 100) {
								$(".activity").css("display", "none");
								$
										.each(
												result.extend.pageInfo.list,
												function(index, item) {
													var outDiv = $(
															"<div></div>")
															.addClass(
																	"col-md-4 find")
															.attr("id", item.id);
													var inDiv = $("<div></div>")
															.addClass(
																	"portfolio-item awesome mix_all")
															.attr("data-cat",
																	"awesome");
													var overlayDiv = $(
															"<div></div>")
															.addClass("overlay")
															.append(
																	$("<p></p>")
																			.append(
																					$(
																							"<span></span>")
																							.append(
																									item.title))
																			.append(
																					"点击了解详情"));
													var titleTxt = item.title;
													if (titleTxt.length > 12) {
														titleTxt = titleTxt
																.substring(0,
																		12)
																+ "...";
													} else {
														titleTxt = titleTxt
																.substring(0,
																		12);
													}
													var title = $("<h6></h6>")
															.css("text-align",
																	"center")
															.append(titleTxt);
													inDiv
															.append(
																	$("<img/>")
																			.addClass(
																					"img-responsive")
																			.attr(
																					"src",
																					"http://123.207.93.53/Older_back/"
																							+ item.activity1))
															.css("height",
																	"240").css(
																	"width",
																	"350")
															.append(overlayDiv)
															.append(title);
													if (index < 3) {
														outDiv
																.append(inDiv)
																.appendTo(
																		$("#content1"));
													} else {
														outDiv
																.append(inDiv)
																.appendTo(
																		$("#content2"));
													}
													$(".find")
															.click(
																	function() {
																		window.location.href = "${APP_PATH}/official/activityInfo/"
																				+ $(
																						this)
																						.attr(
																								"id");
																	});
												});
							}
							build_page_nav(result);
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
	</script>
</body>
</html>
