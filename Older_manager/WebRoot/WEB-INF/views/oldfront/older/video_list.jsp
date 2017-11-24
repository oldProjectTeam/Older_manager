<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	request.setAttribute("APP_PATH", request.getContextPath());
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>视频</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${APP_PATH}/static/css/video.css" rel="stylesheet">
<script src="${APP_PATH}/static/js/jquery-3.2.1.min.js"></script>
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://vjs.zencdn.net/5-unsafe/video-js.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Lato&amp;subset=latin,latin-ext">
<link rel="stylesheet" href="${APP_PATH}/static/video/css/advanced.css">
<link rel="stylesheet"
	href="${APP_PATH}/static/video/css/videojs-playlist-ui.vertical.css">

<link href="http://vjs.zencdn.net/5.0.2/video-js.css" rel="stylesheet">
<script src="http://vjs.zencdn.net/ie8/1.1.0/videojs-ie8.min.js"></script>
<script src="http://vjs.zencdn.net/5.0.2/video.js"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>
<style type="text/css">
a:hover {
	color: red !important;
}

li {
	padding-right: 10px;
}

.title {
	color: black !important;
}
</style>
</head>

<body>
	<!-- 轮播条与收搜框 -->
	<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#"> <img
				src="${APP_PATH}/static/images/oldback/images/logo.png"
				width="160px" />
			</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse"
			style="margin-top: 18px;">
			<form class="navbar-form navbar-right" id="searchForm">
				<div class="form-group">
					<input type="text" placeholder="搜索视频..." class="form-control"
						id="key" name="key">
				</div>
				<button type="button" id="search" class="btn btn-success">搜索</button>
			</form>
		</div>
	</div>
	</nav>
	<!-- 视频区域 -->
	<div style="margin-top: 20px;">
		<section class="main-preview-player"> <video id="my_video_1"
			class="video-js vjs-default-skin" width="640px" height="360px"
			controls preload="none"
			poster='http://video-js.zencoder.com/oceans-clip.jpg'
			data-setup='{ "aspectRatio":"640:360", "playbackRates": [1, 1.5, 2] }'>
		<source src="http://123.207.93.53/Older_back/${video.path}"
			type='video/mp4' autoplay="autoplay" /> </video>
		<div class="playlist-container preview-player-dimensions vjs-fluid">
			<ol class="vjs-playlist" id="video_list">
				<img src="${APP_PATH}/static/images/load.gif"
					style="margin-left: 160px !important;width: 100px !important;height:100px !important;margin-top: 260px;"
					id="loading" />
			</ol>
		</div>
		</section>
	</div>
	<div style="margin:30px;">
		<div class="divmargin">
			<span class="textstyle">视频列表</span>
			<div class="container borderstyle">
				<ul class="list-inline" style="text-align: center;" id="title">
					<img src="${APP_PATH}/static/images/load.gif" width="60"
						height="60" id="titleLoading" />
				</ul>
			</div>
		</div>
	</div>
	<!-- 视频列表 方块-->
	<div class=""></div>
	<!-- 底部内容 -->
	<jsp:include page="footer.jsp"></jsp:include>
	<script src="${APP_PATH}/static/video/js/video.js"></script>
	<script type="text/javascript">
		$("#search").click(function() {
			if ($("#key").val() == '') {
				layer.msg("请输入关键字再查询", {
					offset : [ '10%' ]
				});
			} else {
				var index = layer.load();
				$.ajax({
					url : "${APP_PATH}/official/queryVideoByKeyWord",
					data : $("#searchForm").serialize(),
					type : "GET",
					success : function(result) {
						if (result.code == 100) {
							$("#video_list").empty();
							build_video(result);
							layer.close(index);
						} else {
							layer.close(index);
							layer.msg("数据请求失败啦");
						}
					}
				});
			}
		});

		$(function() {
			go(1);
			$("#video_list").empty();
		});

		function go(pn) {
			$.ajax({
				url : "${APP_PATH}/official/queryVideo",
				data : {
					"pn" : pn
				},
				type : "GET",
				success : function(result) {
					if (result.code == 100) {
						$("#loading").css("display", "none");
						build_video(result);
					} else {
						layer.msg("数据请求失败啦");
					}
				}
			});
		}
		function build_video(result) {
			$
					.each(
							result.extend.pageInfo.list,
							function(index, item) {
								var vli = $("<li></li>").addClass(
										"vjs-playlist-item vli").attr(
										"tabindex", "0");
								vli.attr("id", item.id);
								var picture = $("<picture></picture>")
										.addClass(
												"vjs-playlist-thumbnail vjs-icon-play");
								var src = $(
										"<source type='image/png' media=''(min-width: 400px;)''/>")
										.attr("srcset",
												"${APP_PATH}/static/images/oldback/images/video_bg .jpg");
								var img = $("<img/>")
										.attr("src",
												"//d2zihajmogu5jn.cloudfront.net/sintel/poster.png");
								picture.append(src).append(img);

								var time = $("<time></time>").addClass(
										"vjs-playlist-duration").append(
										item.lenght);
								var cite = $("<cite></cite>").addClass(
										"vjs-playlist-name").attr("title",
										item.title).append(item.title);
								var p = $("<p></p>").addClass(
										"vjs-playlist-description").attr(
										"title", item.subtitle);

								vli.append(picture).append(time).append(cite)
										.append(p).appendTo($("#video_list"));

								//构建标题
								if (index < 12) {
									var titleLi = $("<li></li>").append(
											$("<a></a>").attr(
													"href",
													"${APP_PATH}/official/videoItemInfo/"
															+ item.id)
													.addClass("title").append(
															item.title));
									$("#title").append(titleLi);
								}
								$("#titleLoading").css("display", "none");
							});

			$(document)
					.on(
							"click",
							".vli",
							function() {
								window.location.href = "${APP_PATH}/official/videoItemInfo/"
										+ $(this).attr("id");
							});

		}
	</script>
</body>
</html>
