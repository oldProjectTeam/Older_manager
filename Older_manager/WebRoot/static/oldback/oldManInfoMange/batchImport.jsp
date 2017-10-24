<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'batchImport.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
 	<script language="JavaScript" src="static/js/jquery-3.2.1.min.js"></script>
	<link rel="stylesheet" type="text/css" href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
	<script type="text/javascript" src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script> 	
  </head>
  
  <body>
     <!--路劲导航  -->
  	<div class="row">
	  <div class="col-md-12" >
		<ol class="breadcrumb">
		  <li><b>位置：<a href="static/oldback/oldManInfoMange/index.html">老人档案管理</a></b></li>
		  <li class="active">批量导入</li>
		</ol>
	  </div>
    </div>
    
    <div class="container">
    	<div class="row">
		  <div class="col-md-4 col-md-offset-4">
		  	<input type="file" class="form-control">
		  </div><br><br>
		  <div class="col-md-4 col-md-offset-5">
		  	<button type="button" class="btn btn-success">批量导入</button>
		  	<span></span>
		  </div>
		</div>
    </div>
  </body>
</html>
