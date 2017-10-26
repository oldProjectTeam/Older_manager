<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'download.jsp' starting page</title>
    
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
	<script src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<script src="static/js/jquery-3.2.1.min.js"></script>
	
	<style>
		a{
			color:black;
		}
		a:hover{
			color:red;
			text-decoration:none;
		}
	</style>
	
  </head>
  
  <body>
    <div class="container">
    	<div style="height:100px">
    		头部
    	</div>
    	<div style=" background:url(static/images/eat2.png); height:400px;width:100%; ">
    		<div class="col-sm-6 col-sm-offset-3" style="background:#F0FFFF;opacity:0.7; margin-top:130px; padding:18px;">
	    		<b>客户端下载：<a href="#">下载</a></b>
	    		
	    		<div class="progress" style="margin-top:15px">
	    			 <div class="progress-bar progress-bar-danger progress-bar-striped" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%;">
					    80%
					 </div>
			    </div>
	    		<span class="col-sm-3  col-sm-offset-10"><a href="#"> <b>取消 </b></a>  </span>
    		</div>
    	</div>
    	<div style="height:100px">
    		尾部
    	</div>
    </div>
  </body>
</html>
