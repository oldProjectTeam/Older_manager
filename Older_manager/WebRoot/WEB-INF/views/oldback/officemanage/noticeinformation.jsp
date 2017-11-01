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

<title>My JSP 'noticeinformation.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta content="width=device-width,initial-scale=1">
<!-- 引入jquery -->
<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery-3.2.1.min.js"></script>
<!-- 引入样式 -->
<link
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<style>
a {
	color: black;
}
</style>
</head>

<body style="margin: 15px;">
	<div style="width:98%;margin-top:10px;margin-left:10px">
		<span>公告信息：</span><br>
		<div
			style="border:1px solid #F00;margin-top:10px;margin-bottom:10px;padding:10px;width:90%;height:220px">
			<ul class="list-unstyled">
				<li class="col-sm-offset-5" style="font-size:18px">${notice.title}</li>
				<li>&nbsp;&nbsp;&nbsp;&nbsp; ${notice.content}</li>
				<br>
				<li class="col-sm-offset-8">发送人：<a>${notice.releasepeople}</a> &nbsp;&nbsp;&nbsp;&nbsp;
					发送时间：<b>ChangeDateFormat(${notice.time})</b></li>
			</ul>
		</div>
		<a class="col-sm-offset-10"
			href="/Older_manager/static/oldback/officemanage/informnotice.jsp"><button
				type="button" onClick="javascript :history.back(-1);">返回</button></a>
	</div>
	<script type="text/javascript">
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
