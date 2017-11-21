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
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
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
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300'
	rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Lobster'
	rel='stylesheet' type='text/css' />
<link rel="stylesheet" href="css/normalize.css">
<link rel="stylesheet" href="css/style1.css">

<link rel="stylesheet" href="${APP_PATH}/static/video/css/styles.css">
<script src="${APP_PATH}/static/video/js/jquery-1.7.2.min.js"></script>
<script src="${APP_PATH}/static/video/js/jquery.jplayer.min.js"></script>

<link rel="stylesheet" type="text/css"
	href="${APP_PATH}/static/video/css/reset.css" />
<link rel="stylesheet" type="text/css"
	href="${APP_PATH}/static/video/css/willesPlay.css" />
<script src="${APP_PATH}/static/video/js/willesPlay.js"
	type="text/javascript" charset="utf-8"></script>
</head>
<body style="margin: 15px;background-color: black">
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
						<li><a href="${APP_PATH}/older/index">主页</a></li>
						<li><a href="${APP_PATH}/older/about">关于我们</a></li>
						<li><a href="${APP_PATH}/older/contact">联系我们</a></li>
						<li><a href="${APP_PATH}/older/activity">社区活动</a></li>
						<li><a href="${APP_PATH}/shop/oldfronthome" class="check">电子商务</a></li>
						<li><a href="${APP_PATH}/older/download">客户端下载</a></li>
						<li><a href="${APP_PATH}/older/">会员登陆</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	</section>
	<!--视频播放-->
	<div id="willesPlay">
		<div class="playContent" style="display: inline;">
			<video height="100%" id="playVideo" style="width:77%;"> <source
				src="http://123.207.93.53/Older_back/${video.path}" type="video/mp4"></source>
			当前浏览器不支持 video直接播放，点击这里下载视频： <a href="/">下载视频</a> </video>
			<div class="playTip glyphicon glyphicon-play" style="top: -320px;"></div>
		</div>
		<div class="list-group pull-right" style="width: 23%;display: inline;"
			id="videoDiv">
			<a href="#" class="list-group-item active">
				<h4 class="list-group-item-heading">当前播放</h4>
				<p class="list-group-item-text">${video.title}</p>
			</a> <img src="${APP_PATH}/static/images/load.gif" width="100"
				height="100" class="col-md-offset-5 video"
				style="margin-top: 200px;" />
		</div>
		<div class="playControll" style="width:77%;" id="playControll">
			<div class="playPause playIcon"></div>
			<div class="timebar">
				<span class="currentTime">0:00:00</span>
				<div class="progress">
					<div class="progress-bar progress-bar-danger progress-bar-striped"
						role="progressbar" aria-valuemin="0" aria-valuemax="100"
						style="width: 0%"></div>
				</div>
				<span class="duration">0:00:00</span>
			</div>
			<div class="otherControl">
				<span class="volume glyphicon glyphicon-volume-down"></span> <span
					class="fullScreen glyphicon glyphicon-fullscreen" id="full"></span>
				<div class="volumeBar">
					<div class="volumewrap">
						<div class="progress">
							<div class="progress-bar progress-bar-danger" role="progressbar"
								aria-valuemin="0" aria-valuemax="100"
								style="width: 8px;height: 40%;"></div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
	<script type="text/javascript">
		var b = true;
		$("#full").click(function() {
			if (b) {
				$("#playControll").css("width", "100%");
				b = false;
			} else {
				$("#playControll").css("width", "77%");
				b = true;
			}
		});

		$(function() {
			$.ajax({
				url : "${APP_PATH}/official/videoLive/1",
				type : "GET",
				success : function(result) {
					if (result.code == 100) {
						$(".video").css("display", "none");
						$.each(result.extend.pageInfo.list, function(index,
								item) {
							$("<a></a>").attr(
									"href",
									"${APP_PATH}/official/videoItemInfo/"
											+ item.id).addClass(
									"list-group-item").append(
									$("<h4></h4>").addClass(
											"list-group-item-heading").append(
											item.title)).append(
									$("<p></p>").addClass(
											"list-group-item-text").append(
											item.director)).appendTo(
									$("#videoDiv"));
						});
					}
				}
			});
		});
	</script>
</body>

</html>
