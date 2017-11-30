<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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

<title>活动详情</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1" />
<meta name="description" content="" />
<meta name="author" content="" />
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
<script language="JavaScript"
	src="${APP_PATH}/static/js/jquery-3.2.1.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>
</head>
<style type="text/css">
.news {
	color: gray;
}

.news a:hover {
	color: red !important;
}
</style>
<body>
	<div class="container" style="margin: 15px;">
		<div class="all" style="margin: 15px;">
			<hr />
			<div class="neirong" style="margin-left: 20px;">
				<div class="biaoti">
					<h3>${activity.title}</h3>
					<div class="bt1">
						<span>发布人:</span><span>${activity.releasepeople}</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span>发布时间:</span><span><fmt:formatDate
								value="${activity.releasetime}" pattern="yyyy-MM-dd" /></span>
					</div>
					<div class="kong"></div>
					<hr />
				</div>
				<div class="news1">
					<p>${activity.content}</p>
				</div>
				<div>
					<img src="http://gyadmin-1252357563.file.myqcloud.com/${activity.activity1}" />
				</div>
			</div>
		</div>
		<button class="btn btn-info" style="margin-left:25px;" id="join">报名参加</button>
		<div class="right1" style="margin-top: 15px;">
			<div class="right2">
				<p
					style="color: #1781C2;font-size: 20px;font-weight:bold;float: left;">&nbsp;
					&nbsp;热门推荐</p>
				<a href="#" style="float: right;color:#666666;"></a><br />
				<hr />
				<div class="new3">
					<ul id="news">
					</ul>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
	<script type="text/javascript">
		$("#join").click(function() {
			if ('${older.oldman.id}' == null || '${older.oldman.id}' == '') {
				layer.msg("请你先登录", {
					offset : [ '20%' ]
				});
				window.location.href = "${APP_PATH}/older/login";
			} else {
				var oldManId = '${older.oldman.id}';
				var activityId = '${activity.id}';
				$.ajax({
					url : "${APP_PATH}/activity/joinActivityWithOldMan",
					data : {
						"activityId" : activityId,
						"oldManId" : oldManId
					},
					type : "GET",
					success : function(result) {
						console.log(result);
						if (result.code == 100) {
							layer.msg("报名成功", {
								offset : [ '20%' ]
							});
						} else {
							layer.msg("你已经报名过了", {
								offset : [ '20%' ]
							});
						}
					}
				});
			}
		});
		$(function() {
			$.ajax({
				url : "official/recommend",
				type : "GET",
				success : function(result) {
					$.each(result.extend.activities, function(index, item) {
						$("<li></li>").addClass("news").append(
								$("<a></a>").attr(
										"href",
										"${APP_PATH}/official/activityInfo/"
												+ item.id).append(item.title))
								.appendTo($("#news"));
					});
				}
			});
		});
	</script>
</body>
</html>
