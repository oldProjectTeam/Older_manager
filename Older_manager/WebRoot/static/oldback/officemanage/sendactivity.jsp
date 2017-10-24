<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'sendactivity.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta name="viewport" content="width=device-width,initial-scale=1">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
  	<link rel="stylesheet" href="static/oldback/css/informnotice.css">

  </head>
  
  <body>
  	<div style="width:98%;margin-left:10px">
  	<br>
  		<span style="font-size:17px">发布活动</span>
  		<form action="" class="form-inline" style="margin-top:10px">
  		 	活动标题：<input type="text" placeholder="活动标题">
  		 	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;活动地点：<input type="text" placeholder="活动地点">
  		 	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;发布部门：<input type="text" placeholder="发布部门">
  		</form>
  		<br>
	  	<span style="font-size:15px;">活动内容:</span><br>
	  	<textarea rows="12" cols="129" placeholder="活动的内容" style="margin-top:10px;margin-bottom:10px"></textarea><br>
	  	<button type="button" class="col-sm-offset-7" value="提交" style="font-size:20px">提交</button>
  	</div>
  </body>
</html>
