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
    
    <title></title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	 
  </head>
  
  <body>
    <!-- 头部开始 -->
<header>
    <div class="navbar navbar-default navbar-fixed-top" style="">
       <div class="container" style="padding:15px 0;">
          <div class="navbar-header pull-left" style="margin-left:0;">
             <a href="${APP_PATH}/older/older" class="logo navbar-brand"
              style="margin-left:0;margin-top:0;background: url(${APP_PATH}/static/oldfront/older/images/logo.png) no-repeat">
             </a>
          </div>
          <div class="navbar-collapse collapse" style="">
             <ul class="nav navbar-nav navbar-right" style="margin-right:0;">
                <li><div class="navbar-header  telnum">服务热线：400-761-5656</div></li>
                <li style="margin-left:50px;"><a href="#" onclick="Login_Out()" class="logout">退出<i class="icon-logout pull-right"></i></a></li>
             </ul>
          </div>
       </div>
    </div>
</header>
<!-- 头部结束 -->
  </body>
</html>
