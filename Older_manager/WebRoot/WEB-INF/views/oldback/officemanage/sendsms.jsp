<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
pageContext.setAttribute("APP_PATH", request.getContextPath());
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'sendsms.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta content="width=device-width,initial-scale=1">
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
  	<div style="width:98%;margin-left:10px">
  		<br>
  		<span>发送短信</span>
  		<form action="" method="post">
  			<br>
  			收信人：<input type="text"> &nbsp;&nbsp;&nbsp;&nbsp;
			<a href="/Older_manager/static/oldback/officemanage/addressbookmanager.jsp"><button type="button">从通讯录中选择</button></a>
  			<br>
  			<br>
  			<span>发送内容：</span><br>
  			<textarea rows="10" cols="130" placeholder="发送内容" style="margin-top:10px;margin-bottom:10px"></textarea><br>
  			<button type="button" class="col-sm-offset-7" style="font-size:20px">发送</button>
  		</form>
  	</div>
  </body>
</html>
