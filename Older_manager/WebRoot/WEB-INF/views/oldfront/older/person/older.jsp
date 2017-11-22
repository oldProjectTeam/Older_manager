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
    
    <title>老人管理平台-用户自助中心</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	 
    <link href="${APP_PATH}/static/oldfront/older/css/easyui.css" rel="stylesheet" type="text/css">
    <link href="${APP_PATH}/static/oldfront/older/css/bootstrap.min.css" rel="stylesheet">
    <link href="${APP_PATH}/static/oldfront/older/css/layout.css" rel="stylesheet">
    <link href="${APP_PATH}/static/oldfront/older/css/default.css" rel="stylesheet">
    <link href="${APP_PATH}/static/oldfront/older/css/icon.css" rel="stylesheet">

    <script src="${APP_PATH}/static/oldfront/older/js/jquery.js"></script>
    <script src="${APP_PATH}/static/oldfront/older/js/json2.js"></script>
    <script src="${APP_PATH}/static/oldfront/older/js/jquery.cookie.js"></script>
    <script src="${APP_PATH}/static/oldfront/older/js/jquery.easyui.js"></script>
    <script src="${APP_PATH}/static/oldfront/older/js/easyui-lang-zh_CN.js"></script>
    <script src="${APP_PATH}/static/oldfront/older/js/KingonUI.js"></script>
  </head>
  <body style="overflow:auto;" class="layout panel-noscroll">
  <!--头部开始  -->
  <jsp:include page="header.jsp"></jsp:include>
  <!-- 主体部分开始 -->
<div style="padding:111px 0 0;margin-bottom:15px;">
    <div class="container">
        <div class="row">
            <!-- 左侧导航菜单开始 -->
            <jsp:include page="left.jsp"></jsp:include>
            <!-- 左侧导航菜单结束 -->

            <!-- 右侧内容区开始 -->
          <div class="col-md-9" style="background:#fff;min-height:647px;">
 			<div class="main"> 
                    <div class="row">
                        <!-- 健康服务开始 -->
                        <div class="col-md-6">
                            <div class="main-content">
                                <div class="main-pic jkfw">
                                    <div class="main-title">健康服务</div>
                                </div>
                                <div class="main-body">
                                    <ul>
                                        <li>
                                          <a href="health.html">
                                          <i class="icon-nav2 icon-jksj2">
                                          </i>健康数据</a>
                                        </li>
                                        <li><a href="${APP_PATH}/static/oldfront/older/person/pinggu.jsp"><i class="icon-nav2 icon-yjsz"></i>健康评估</a></li>
                                        <li><a href="${APP_PATH}/static/oldfront/older/person/lvli.jsp"><i class="icon-nav2 icon-jkda"></i>健康履历</a></li>
                                        <li><a href="${APP_PATH}/static/oldfront/older/person/takeDrug.jsp"><i class="icon-nav2 icon-yyjl"></i>用药记录</a></li>
                                        <li><a href="${APP_PATH}/static/oldfront/older/person/tijian.jsp"><i class="icon-nav2 icon-tjjl"></i>体检记录</a></li>
                                        <li><a href="${APP_PATH}/static/oldfront/older/person/jiuzhen.jsp"><i class="icon-nav2 icon-jzjl"></i>就诊记录</a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <!-- 健康服务结束 -->
                        <!-- 活动管理开始 -->
                        <div class="col-md-6">
                            <div class="main-content">
                                <div class="main-pic bmfw">
                                    <div class="main-title">活动管理</div>
                                </div>
                                <div class="main-body" style="height:241px;">
                                    <ul class="ul-bmfw">
                                        <li><a href="${APP_PATH}/static/oldfront/older/person/myactivity.jsp"><i class="icon-nav2 icon-fwyd2"></i><div class="li-title">我的活动</div><p>我参与哪些活动了呢</p></a></li>
                                        <li><a href="${APP_PATH}/static/oldfront/older/person/recomActivity.jsp"><i class="icon-nav2 icon-ydjl"></i><div class="li-title">推荐活动</div><p>我们给您推荐活动啦</p></a></li>

                                    </ul>
                                </div>
                            </div>
                        </div>
                        <!-- 活动管理结束 -->
                    </div>
                    <div class="row" style="margin-top:30px;">
                       <!-- 课程管理开始 -->
                       <div class="col-md-6">
                           <div class="main-content">
                               <div class="main-pic wzfw">
                                   <div class="main-title">课程管理</div>
                               </div>
                               <div class="main-body">
                                   <ul class="ul-wzfw">
                                       <li><a href="${APP_PATH}/static/oldfront/older/person/mycourse.jsp"><i class="icon-nav2 icon-dwfw"></i><div class="li-title">我的课程</div><p>我参加了哪些课程</p></a></li>
                                       <li><a href="${APP_PATH}/static/oldfront/older/person/allcourse.jsp"><i class="icon-nav2 icon-gjhf"></i><div class="li-title">寻找课程</div><p>所有课程，都在这里</p></a></li>
                                       <li>
                                        <i class="icon-nav2"></i><div class="li-title"></div><p></p>
                                       </li>

                                   </ul>
                               </div>
                           </div>
                       </div>
                       <!-- 课程管理结束 -->                   
                </div>
            <!-- 右侧内容区结束 -->
        </div>
    </div>
</div>
  <!--底部开始  -->
  <jsp:include page="footer.jsp"></jsp:include>
  <!-- 底部结束 -->
<script src="${APP_PATH}/static/oldfront/older/js/bootstrap.js"></script>
<script src="${APP_PATH}/static/oldfront/older/js/bootstrap.min.js"></script>
<script src="${APP_PATH}/static/oldfront/older/js/TableJS.js" type="text/javascript"></script>
<script src="${APP_PATH}/static/oldfront/older/js/md5.js"></script>    
 
  </body>
</html>
