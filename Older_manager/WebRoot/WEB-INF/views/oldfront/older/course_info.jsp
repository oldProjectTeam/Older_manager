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
<link href="${APP_PATH}/static/oldfront/assets/css/style.css"
	rel="stylesheet" />
<script language="JavaScript"
	src="${APP_PATH}/static/js/jquery-3.2.1.min.js"></script>
<link rel="stylesheet"
	href="${APP_PATH}/static/oldfront/css/huodongxiangqing.css" />
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300'
	rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Lobster'
	rel='stylesheet' type='text/css' />
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
	<hr />
	<div class="all" style="margin: 15px;">
		<div class="head" style="margin-top: 90px;">
			<span>位置：</span> <a href="activity.jsp">课程/</a> <span>课程详情</span>
		</div>
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
				<img src="http://123.207.93.53/Older_back/${course.photo}" />
			</div>
		</div>
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
