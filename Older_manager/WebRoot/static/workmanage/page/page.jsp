<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'page.jsp' starting page</title>
    
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
    <link rel="stylesheet" href="static/workmanage/css/page.css">
  </head>
  	
  <body>
  <div style="width:98%;margin-left:4px">
    <div class="col-sm-12">
	    <div class="col-sm-3 ">
	    	<a href="/Older_manager/static/workmanage/page/sendsms.jsp" class="backcolor">
		    	<img alt="" src="static/images/sendsms.png"><br>
		    	<span class="textfont">发送短信</span>
	    	</a>
	    </div>
	    <div class="col-sm-3">
	    	<a href="/Older_manager/static/workmanage/page/sendrecord.jsp" class="backcolor">
		    	<img alt="" src="static/images/sendrecord.png"><br>
		    	<span class="textfont">短信记录</span>
	    	</a>
	    </div>
	    <div class="col-sm-3">
	    	<a href="/Older_manager/static/workmanage/page/informnotice.jsp" class="backcolor">
		    	<img alt="" src="static/images/tzgg.png"><br>
		    	<span class="textfont">通知公告</span>
	    	</a>
	    </div>
	    <div class="col-sm-3">
	    	<a href="/Older_manager/static/workmanage/page/sendnotice.jsp" class="backcolor" style="padding-top:10px;">
		    	<img alt="" src="static/images/sendgg.png" style="height:90px;width:100px;margin-bottom:10px"><br>
		    	<span class="textfont" style="margin-top:150px">发布公告</span>
	    	</a>
	    </div>
    </div>
     <div class="col-sm-12" style="margin-top:50px">
	    <div class="col-sm-3">
	    	<a href="/Older_manager/static/workmanage/page/addressbookmanager.jsp" class="backcolor">
		    	<img alt="" src="static/images/txlrecord.png"><br>
		    	<span class="textfont">通讯录管理</span>
	    	</a>
	    </div>
	    <div class="col-sm-3">
	    	<a href="/Older_manager/static/workmanage/page/activitymanager.jsp" class="backcolor" style="padding-top:10px">
		    	<img alt="" src="static/images/hdmanage.png" style="height:90px;width:110px;margin-bottom:10px"><br>
		    	<span class="textfont">活动管理</span>
	    	</a>
	    </div>
	    <div class="col-sm-3">
	    	<a href="/Older_manager/static/workmanage/page/sendactivity.jsp" class="backcolor" style="padding-top:10px">
		    	<img alt="" src="static/images/sendhd.png"  style="height:90px;width:110px;margin-bottom:10px"><br>
		    	<span class="textfont">发布活动</span>
	    	</a>
	    </div>
	    <div class="col-sm-3">
	    </div>
    </div>
  </div>
  </body>
</html>
