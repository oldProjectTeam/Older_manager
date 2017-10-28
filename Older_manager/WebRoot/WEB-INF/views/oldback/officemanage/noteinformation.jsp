<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>短信详情</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!-- 引入jquery -->
<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery-1.7.2.min.js"></script>
<!-- 引入样式 -->
<link
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>

<body style="margin: 15px;">
	<div style="width:98%;margin-left:10px; margin-top:10px">
		<span>收信人：赵琴琴</span><br> <br> <span>发送内容为：</span>
		<div
			style="border:1px solid #F00; margin-top:10px;margin-left:20px;margin-bottom:10px;padding-top:10px;padding-left:10px;width:90%;height:160px">
			爷爷你好：<br>
			&nbsp;&nbsp;&nbsp;&nbsp;我是琴琴，最近身体可好，有好几天没有看到爷爷了，所以我们在花果山有一个打保龄球比赛哟，不
			但可以拿到丰厚的奖品，还可以锻炼身体交很多朋友哟，忘爷爷能积极参加哟。
		</div>
		<div>
			<ul class="list-unstyle list-inline  col-sm-offset-6">
				<li>发送人：18989707890</li>&nbsp;&nbsp;&nbsp;&nbsp;
				<li>发送时间为：2017-10-22</li>&nbsp;&nbsp;&nbsp;&nbsp;
				<li><a
					href="/Older_manager/static/oldback/officemanage/sendrecord.jsp"
					style="color:black">返回</a></li>
			</ul>
		</div>
	</div>
</body>
</html>
