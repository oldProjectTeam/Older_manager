<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title></title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta content="width=device-width,initial-scale=1">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
	<style>
		a{
			color:black;
		}
	</style>
  </head>
  
  <body>
    <div style="width:98%;margin-top:10px;margin-left:10px">
    	<span>活动信息：</span><br>
    	<div style="border:1px solid #F00;margin-top:10px;margin-bottom:10px;padding:10px;width:90%;height:220px">
    		<ul class="list-unstyled">
	    		<li class="col-sm-offset-5" style="font-size:18px">便宜卖书</li>
	    		<li>&nbsp;&nbsp;&nbsp;&nbsp;
	    			书店近来窃贼颇多，多在讲座，签售会，团体活动时伺机作案。
	    			专寻年轻女士挎包下手，店内无监控，忘各位读者朋友多多留心，大家共同防范，和先锋一起快乐。
					另对之前被窃女生表示歉意，世风日下，小贼实在可恶。
	    		</li>
	    		<br>
	    		<li class="col-sm-offset-8" >
	    			发送人：琴琴   &nbsp;&nbsp;&nbsp;&nbsp;
	    			发送时间：2017-10-22
	    		</li>
    		</ul>
    	</div>
    	<a class="col-sm-offset-10" href="/Older_manager/static/workmanage/page/informnotice.jsp"><button type="button">返回</button></a>
    </div>
  </body>
</html>
