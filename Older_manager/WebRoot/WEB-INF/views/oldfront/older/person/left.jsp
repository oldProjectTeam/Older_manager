<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

pageContext.setAttribute("APP_PATH", request.getContextPath());
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>老人个人中心左侧导航栏</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
  </head>
  
  <body>
     <div class="left1" style="background-image: url(${APP_PATH}/static/oldfront/img/left1.jpg);">
			<hr />
			<div class="lanmu1">
				<a>个人资料</a>
			</div>
			<div class="left11">
				<a href="${APP_PATH}/older/personInfo">个人资料查看</a>
			</div>
			<div class="left11">
				<a href="${APP_PATH}/older/oldmanModify">个人资料修改</a>
			</div>
			<div class="left11">
				<a href="${APP_PATH}/older/changePassword">账户密码修改</a>
			</div>
			<hr />
			<div class="lanmu1">
				<a>健康数据</a>
			</div>
			<div class="left11">
				<a href="${APP_PATH}/older/oldManHealthInfo">个人健康查看</a>
			</div>
			<div class="left11">
				<a href="${APP_PATH}/older/healthReport">健康评估报告</a>
			</div>
			<div class="left11">
				<a href="${APP_PATH}/older/peinfoView">体检资料查看</a>
			</div>
			<div class="left11">
				<a href="${APP_PATH}/older/visiting_record">就诊记录查看</a>
			</div>
			<div class="left11">
				<a href="${APP_PATH}/older/takeDrug">服用药品详情</a>
			</div>
			<div class="left11">
				<a href="${APP_PATH}/older/useHealth">使用养生用品</a>
			</div>
			<hr />
			<div class="lanmu1">
				<a>短信通告</a>
			</div>
			<div class="left11">
				<a href="${APP_PATH}/older/sms">短信查看</a>
			</div>
			<div class="left11">
				<a href="${APP_PATH}/older/notice">通告查看</a>
			</div>
			<hr />
			<div class="lanmu1">
				<a>我的活动</a>
			</div>
			<div class="left11">
				<a href="${APP_PATH}/older/activitymanager">我的活动详情</a>
			</div>
			<div class="left11">
				<a href="${APP_PATH}/older/activity_recom">推荐活动</a>
			</div>
			<hr />
			<div class="lanmu1">
				<a>我的视频课程</a>
			</div>
			<div class="left11">
				<a href="${APP_PATH}/older/myCourse">我关注的课程</a>
			</div>
			<div class="left11">
				<a href="${APP_PATH}/older/myVideo">我关注的视频</a>
			</div>
		</div>
  </body>
</html>
