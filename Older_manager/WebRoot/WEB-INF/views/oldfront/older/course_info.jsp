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

<title>课程详情</title>

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
	<jsp:include page="header.jsp"></jsp:include>
	<div class="container">
		<div class="all" style="margin: 15px;">
			<hr />
			<div class="neirong" style="margin-left: 20px;">
				<div class="biaoti">
					<h3>${course.title}</h3>
					<div class="bt1">
						<span>结束时间:</span><span><fmt:formatDate
								value="${course.endtime}" pattern="yyyy-MM-dd" /></span>
					</div>
					<div class="kong"></div>
					<hr />
				</div>
				<div class="news1">
					<p>${course.content}</p>
				</div>
				<div>
					<img src="${course.photo}" />
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
				var courseId = '${course.id}';
				$.ajax({
					url : "${APP_PATH}/course/JoinCourseWithOldMan",
					data : {
						"courseId" : courseId,
						"oldManId" : oldManId
					},
					type : "GET",
					success : function(result) {
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
				url : "official/recommendCourse",
				type : "GET",
				success : function(result) {
					$.each(result.extend.courses, function(index, item) {
						$("<li></li>").addClass("news").append(
								$("<a></a>").attr(
										"href",
										"${APP_PATH}/official/courseInfoId/"
												+ item.id).append(item.title))
								.appendTo($("#news"));
					});
				}
			});
		});
	</script>
</body>
</html>
