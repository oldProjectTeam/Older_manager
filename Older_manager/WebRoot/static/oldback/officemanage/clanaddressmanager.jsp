<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'clanaddressmanager.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta name=""viewport content="width=device-width,initial-scale=1">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
  	<link rel="stylesheet" href="static/oldback/css/informnotice.css">
  	
  </head>
  
  <body>
    <div style="width:98%;margin-left:4px">
    	<ul class="list-unstyle list-inline nav nav-tabs" style="margin-top:10px">
    		<li style="font-size:20px;"><a href="/Older_manager/static/oldback/officemanage/addressbookmanager.jsp">老人</a></li>
    		<li class="active" style="font-size:20px;"><a href="/Older_manager/static/oldback/officemanage/clanaddressmanager.jsp">亲属</a></li>
    	</ul>
    	<div>
	    	<table class="table table-bordered table-hover" style="margin-top:10px">
	    		<tr>
	    			<th></th>
	    			<th class="col-sm-2"><input type="checkbox">&nbsp;&nbsp;亲属姓名</th>
	    			<th class="col-sm-3">与老人关系</th>
	    			<th class="col-sm-2">电话</th>
	    			<th class="col-sm-3">老人姓名</th>
	    			<th class="col-sm-2">操作</th>
	    		</tr>
	    		<tr>
	    			<td>1</td>
	    			<td ><input type="checkbox">&nbsp;&nbsp;张三</td>
	    			<td >太空</td>
	    			<td >12345678909</td>
	    			<td >火星</td>
	    			<td >
	    				<a href="" class="col-sm-6">修改</a>
	    				<a href="" class="col-sm-6">删除</a>
	    			</td>
	    		</tr>
	    		<tr>
	    			<td>2</td>
	    			<td ><input type="checkbox">&nbsp;&nbsp;张三</td>
	    			<td >太空</td>
	    			<td >12345678909</td>
	    			<td >火星</td>
	    			<td >
	    				<a href="" class="col-sm-6">修改</a>
	    				<a href="" class="col-sm-6">删除</a>
	    			</td>
	    		</tr>
	    		<tr>
	    			<td>3</td>
	    			<td ><input type="checkbox">&nbsp;&nbsp;张三</td>
	    			<td >太空</td>
	    			<td >12345678909</td>
	    			<td >火星</td>
	    			<td >
	    				<a href="" class="col-sm-6">修改</a>
	    				<a href="" class="col-sm-6">删除</a>
	    			</td>
	    		</tr>
	    		<tr>
	    			<td>4</td>
	    			<td ><input type="checkbox">&nbsp;&nbsp;张三</td>
	    			<td >太空</td>
	    			<td >12345678909</td>
	    			<td >火星</td>
	    			<td >
	    				<a href="" class="col-sm-6">修改</a>
	    				<a href="" class="col-sm-6">删除</a>
	    			</td>
	    		</tr>
	    	</table>
    	</div>
    	<div>
    		跳转至：
    		<select>
    			<option>1</option>
    			<option>2</option>
    			<option>3</option>
    			<option>4</option>
    		</select>
    		&nbsp;&nbsp;&nbsp;&nbsp;<a href=""><span class="glyphicon glyphicon-step-backward"></span></a>
    		&nbsp;&nbsp;第&nbsp;<input type="text"  style="width:50px" placeholder="1">&nbsp;页
    		&nbsp;&nbsp;<a href=""><span class="glyphicon glyphicon-step-forward"></span></a>
    		&nbsp;&nbsp;&nbsp;&nbsp;<a href=""><span class="glyphicon glyphicon-repeat"></span></a>
    	</div>
    </div>
  </body>
</html>
