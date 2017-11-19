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
<link href="${APP_PATH}/static/oldfront/assets/css/style.css"
	rel="stylesheet" />
<link rel="stylesheet"
	href="${APP_PATH}/static/oldfront/assets/css/zhuye.css" />
<script language="JavaScript"
	src="${APP_PATH}/static/js/jquery-3.2.1.min.js"></script>
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300'
	rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Lobster'
	rel='stylesheet' type='text/css' />
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>
</head>
<body>
	<section class="menu-section">
	<div class="container">
		<div class="row ">
			<div class="col-md-12">
				<div class="navbar-collapse collapse">
					<ul id="menu-top"
						class="nav navbar-nav navbar-right navbar-fixed-top navbar-inverse">
						<li
							style="padding-left: 15px;padding-top: 6px;padding-bottom: 6px;"><img
							src="${APP_PATH}/static/images/oldback/images/logo.png"
							width="200px" style="margin-right: 240px;" /></li>
						<li><a href="${APP_PATH}/older/index"
							class="menu-top-active check">主页</a></li>
						<li><a href="${APP_PATH}/older/about" class="check">关于我们</a></li>
						<li><a href="${APP_PATH}/older/contact" class="check">联系我们</a></li>
						<li><a href="${APP_PATH}/older/activity" class="check">社区活动</a></li>
						<li><a href="${APP_PATH}/shop/oldfronthome" class="check">电子商务</a></li>
						<li><a href="${APP_PATH}/older/download" class="check">客户端下载</a></li>
						<li><a href="${APP_PATH}/older/login" class="check">会员登陆</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	</section>
	<div id="slideshow-sec" style="margin-top: 15px;">
		<div id="carousel-div" class="carousel slide" data-ride="carousel">
			<div class="carousel-inner">
				<div class="item active">
					<img src="${APP_PATH}/static/oldfront/assets/img/1.jpg" alt="" />
					<div class="carousel-caption">
						<h1 class="wow slideInLeft" data-wow-duration="2s">在家满是父母的唠叨</h1>
						<h2 class="wow slideInRight" data-wow-duration="2s">在外全是父母的叮咛</h2>
					</div>
				</div>
				<div class="item">
					<img src="${APP_PATH}/static/oldfront/assets/img/2.jpg" alt="" />
					<div class="carousel-caption">
						<h1 class="wow slideInLeft" data-wow-duration="2s">多一点关爱</h1>
						<h2 class="wow slideInRight" data-wow-duration="2s">多一点问侯</h2>
					</div>
				</div>
				<div class="item">
					<img src="${APP_PATH}/static/oldfront/assets/img/3.jpg" alt="" />
					<div class="carousel-caption">
						<h1 class="wow slideInLeft" data-wow-duration="2s">老有所养</h1>
						<h2 class="wow slideInRight" data-wow-duration="2s">老有所依</h2>
					</div>

				</div>
			</div>
			<ol class="carousel-indicators">
				<li data-target="#carousel-div" data-slide-to="0" class="active"></li>
				<li data-target="#carousel-div" data-slide-to="1"></li>
				<li data-target="#carousel-div" data-slide-to="2"></li>
			</ol>
			<!--PREVIUS-NEXT BUTTONS-->
			<a class="left carousel-control" href="#carousel-div"
				data-slide="prev"> <span
				class="glyphicon glyphicon-chevron-left"></span>
			</a> <a class="right carousel-control" href="#carousel-div"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right"></span>
			</a>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
				<h1 class="tag-home">
					他们奉献一生，难免走路磕磕绊绊;他们教育一生，难免话语细细碎碎。尊重老人，他们才是我们前行的明灯。.</h1>
				<p style="color: #1781C2;font-size: 20px;font-weight:bold;">最近活动</p>
				<hr />
			</div>
		</div>
	</div>
	<div class="container">
		<div class="row" id="activity1">
			<img src="${APP_PATH}/static/images/load.gif" width="100"
				height="100" class="col-md-offset-5 activity1">
		</div>
		<div class="row" id="activity2">
			<img src="${APP_PATH}/static/images/load.gif" width="100"
				height="100" class="col-md-offset-5 activity2">
		</div>
	</div>
	<div class="container">
		<div class="row ">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
				<h1 class="head-line">尊老为德，敬老为善，爱老为美，助老为乐</h1>
				<br />
			</div>
		</div>
		<div class="row ">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
				<hr />
				<div class="new1" style="padding: 6px;">
					<p
						style="color: #1781C2;font-size: 20px;font-weight:bold;float: left;">最新课程</p>
					<br />
					<hr />
					<div class="new2">
						<ul id="course">
							<img src="${APP_PATH}/static/images/load.gif" width="100"
								height="100" class="col-md-offset-5 course" />
						</ul>
					</div>
				</div>
				<div class="new1" style="padding: 6px;">
					<p
						style="color: #1781C2;font-size: 20px;font-weight:bold;float: left;">最新直播</p>
					<br />
					<hr />
					<div class="new2">
						<ul id="video">
							<img src="${APP_PATH}/static/images/load.gif" width="100"
								height="100" class="col-md-offset-5 video" />
						</ul>
					</div>
				</div>
				<hr />
				<br />
			</div>
		</div>
	</div>
	<hr />
	<div class="container">
		<div class="row">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
				<h1 class="tag-home">
					他们奉献一生，难免走路磕磕绊绊;他们教育一生，难免话语细细碎碎。尊重老人，他们才是我们前行的明灯。.</h1>
				<hr />
			</div>
		</div>
	</div>
	<div class="container ">
		<div class="row ">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
				<h1 class="head-line">尊老为德，敬老为善，爱老为美，助老为乐</h1>
				<br />
			</div>
		</div>
	</div>
	<div class="container ">
		<div class="row">
			<div
				class="col-lg-10 col-md-10 col-sm-10 col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-12 set-div">
				<div class="just-txt-div text-center">
					<h3>
						<strong>-- 现在加入还有特别优惠哦 --</strong>
					</h3>
					<p>
						我们的口号是： <strong> 世界和平 ：</strong> 尊老人敬，助老风和，人间美好，社会文明。 <br /> <br />
					</p>
					<a class="btn btn-info btn-lg" href="${APP_PATH}/older/about">了解更多</a>
					&nbsp;&nbsp; <a class="btn btn-success btn-lg" href="#">加入我们 </a>
				</div>

			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
	<script src="${APP_PATH}/static/oldfront/assets/js/bootstrap.js"></script>
	<script src="${APP_PATH}/static/oldfront/assets/js/wow.js"></script>
	<script
		src="${APP_PATH}/static/oldfront/assets/js/jquery.flexslider.js"></script>
	<script src="${APP_PATH}/static/oldfront/assets/js/custom.js"></script>

	<script type="text/javascript">
		$(function() {
			go(1);
			getCourseInfo(1);
			getVideoInfo(1);
		});
		//获取活动信息
		function go(pn) {
			$("#activity1").empty();
			$("#activity2").empty();
			var index = layer.load();
			$
					.ajax({
						url : "${APP_PATH}/official/info",
						type : "GET",
						success : function(result) {
							if (result.code == 100) {
								$(".activity1").attr("display", "none");
								$(".activity2").attr("display", "none");
								layer.close(index);
								$
										.each(
												result.extend.activityPageInfo.list,
												function(index, item) {
													var img = $("<img/>")
															.attr(
																	"src",
																	'${APP_PATH}/'
																			+ item.activity1);
													var look_btn = $(
															"<button></button>")
															.addClass(
																	"btn btn-sm btn-info")
															.append("查看详情");
													look_btn
															.attr("id", item.id);
													var content = item.content;
													if (content.length > 40) {
														content = content
																.substring(0,
																		40)
																+ "...";
													}
													var title = item.content;
													if (title.length > 12) {
														title = title
																.substring(0,
																		12)
																+ "...";
													}
													var captionDiv = $(
															"<div></div>")
															.addClass("caption")
															.append(
																	$(
																			"<h3></h3>")
																			.append(
																					title))
															.append(
																	$("<p></P>")
																			.append(
																					content))
															.append(
																	$("<p></P>")
																			.append(
																					look_btn));
													var thumbnailDiv = $(
															"<div></div>")
															.addClass(
																	"thumbnail")
															.append(img)
															.append(captionDiv);
													var outDiv = $(
															"<div></div>")
															.addClass(
																	"col-sm-6 col-md-4");
													if (index < 3) {
														outDiv
																.append(
																		thumbnailDiv)
																.appendTo(
																		$("#activity1"));
													} else {
														outDiv
																.append(
																		thumbnailDiv)
																.appendTo(
																		$("#activity2"));
													}
													//查看
													look_btn
															.click(function() {
																window.location.href = "${APP_PATH}/official/activityInfo/"
																		+ $(
																				this)
																				.attr(
																						"id");
															});
												});

							}
						}
					});
		}

		function getCourseInfo(pn) {
			$("#course").empty();
			var index = layer.load();
			$.ajax({
				url : "${APP_PATH}/official/courseInfo/" + pn,
				type : "GET",
				success : function(result) {
					if (result.code == 100) {
						$(".course").attr("display", "none");
						layer.close(index);
						$.each(result.extend.pageInfo.list, function(index,
								item) {
							var time = ChangeDateFormat(item.starttime);
							$("<li></li>").append(
									$("<a></a>").attr(
											"href",
											"${APP_PATH}/official/courseInfoId/"
													+ item.id).append(
											item.title)).append(
									$("<span></span>").append(time)).appendTo(
									$("#course"));
						});
					}
				}
			});
		}

		function getVideoInfo(pn) {
			$("#video").empty();
			var index = layer.load();
			$.ajax({
				url : "${APP_PATH}/official/videoInfo/" + pn,
				type : "GET",
				success : function(result) {
					if (result.code == 100) {
						$(".video").attr("display", "none");
						layer.close(index);
						$.each(result.extend.pageInfo.list, function(index,
								item) {
							var time = ChangeDateFormat(item.createtime);
							$("<li></li>").append(
									$("<a></a>").attr(
											"href",
											"${APP_PATH}/official/videoItemInfo/"
													+ item.id).append(
											item.title)).append(
									$("<span></span>").append(time)).appendTo(
									$("#video"));
						});
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
