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
<title>视频直播</title>
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
						<li><a href="${APP_PATH}/older/index">主页</a></li>
						<li><a href="about.jsp">关于我们</a></li>
						<li><a href="contact.jsp">联系我们</a></li>
						<li><a href="activity.jsp">社区活动</a></li>
						<li><a href="download.jsp">客户端下载</a></li>
						<li><a href="${APP_PATH}/older/video" class="menu-top-active">视频直播</a></li>
						<li><a href="blank.jsp">会员登陆</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	</section>
	<!--视频播放-->
	<div id="jp_container_1" class="jp-video jp-video-360p">
		<div id="jquery_jplayer_1" class="jp-jplayer"></div>
		<div class="jp-gui">
			<div class="jp-interface">
				<div class="jp-controls-holder">
					<a href="javascript:;" class="jp-play" tabindex="1">play</a> <a
						href="javascript:;" class="jp-pause" tabindex="1">pause</a> <span
						class="separator sep-1"></span>
					<div class="jp-progress">
						<div class="jp-seek-bar">
							<div class="jp-play-bar">
								<span></span>
							</div>
						</div>
					</div>
					<div class="jp-current-time"></div>
					<span class="time-sep">/</span>
					<div class="jp-duration"></div>
					<span class="separator sep-2"></span> <a href="javascript:;"
						class="jp-mute" tabindex="1" title="mute">mute</a> <a
						href="javascript:;" class="jp-unmute" tabindex="1" title="unmute">unmute</a>
					<div class="jp-volume-bar">
						<div class="jp-volume-bar-value">
							<span class="handle"></span>
						</div>
					</div>
					<span class="separator sep-2"></span> <a href="javascript:;"
						class="jp-full-screen" tabindex="1" title="full screen">full
						screen</a> <a href="javascript:;" class="jp-restore-screen"
						tabindex="1" title="restore screen">restore screen</a>
				</div>
			</div>
		</div>
		<div class="jp-no-solution">
			<span>Update Required</span> Here's a message which will appear if
			the video isn't supported. A Flash alternative can be used here if
			you fancy it.
		</div>
	</div>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#jquery_jplayer_1").jPlayer({
				ready : function() {
					$(this).jPlayer("setMedia", {
						m4v : "mi4.m4v",
						ogv : "mi4.ogv",
						webmv : "http://jq22.qiniudn.com/www.jq22.commi4.webm",
						poster : "mi4.png"
					});
				},
				swfPath : "js",
				supplied : "webmv, ogv, m4v",
				size : {
					width : "570px",
					height : "340px",
					cssClass : "jp-video-360p"
				}
			});
		});
	</script>
</body>

</html>
