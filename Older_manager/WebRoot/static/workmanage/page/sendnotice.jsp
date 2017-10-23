<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'sendnotice.jsp' starting page</title>
    
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
  	<link rel="stylesheet" href="static/workmanage/css/informnotice.css">
  </head>
  
  <body>
  	<div style="width:98%;margin-left:12px">
  		<div style="background:#fdfdfd">
	  		<br>
	    	<span >发布公告</span>
	    	<br>
	    	<div>
		    	<form action="">
		    		<br>
		    		公告标题：<input type="text" style="width:220px" placeholder="公告标题" >
		    		&nbsp;&nbsp;&nbsp;&nbsp;发布人：<input type="text" style="width:210px" placeholder="发布人姓名"><br>
		    		<br>	    		
		    		发布内容：<br>
		    		<textarea rows="10" cols="150" style="margin-top:10px"></textarea>
		    		<button type="button" class="col-sm-offset-9" style="font-size:20px;margin-top:20px">提交</button>
		    	</form> 
	    	</div>
    	</div>
    </div>
  </body>
</html>
