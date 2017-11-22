<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
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
						<!-- 健康数据开始 -->
						<div class="jksj">
							<div class="xy-title">
								健康数据
								<button type="button" class="btn back fr" id="btnclose">返回</button>
							</div>
							<div>
								<div class="jksj">
									<div class="row" style="margin-top:20px;margin-bottom:20px;">
										<div class="col-md-3" id="xueya">
											<div class="jksj-box" onclick="goXueYa()">
												<div class="icon-jksj-nav-xy"></div>
												<ul class=" list-paddingleft-2">
													<li>
														<p>血压（mmHg）</p>
													</li>
													<li>
														<p>
															收缩压：<span id="gaoya">60</span>
														</p>
													</li>
													<li>
														<p>
															舒张压：<span id="diya">30</span>
														</p>
													</li>
													<li>
														<p>
															状态：<span id="xyzhuangtai">正常低值</span>
														</p>
													</li>
												</ul>
											</div>
										</div>
										<div class="col-md-3 text-center" id="tiwen">
											<div class="jksj-box" onclick="goTiWen()">
												<div class="icon-jksj-nav-ns"></div>
												<ul class=" list-paddingleft-2">
													<li>
														<p>体温</p>
													</li>

													<li>
														<p>
															体温：<span id="tiwenvalue">39</span>
														</p>
													</li>
													<li>
														<p>
															测试状态：<span id="ceshishijian">中等度热</span>
														</p>
													</li>

												</ul>
											</div>
										</div>
										<div class="col-md-3" id="tizhongs">
											<div class="jksj-box" onclick="goTiZhong()">
												<div class="icon-jksj-nav-tz"></div>
												<ul class=" list-paddingleft-2">
													<li>
														<p>体重（Kg）</p>
													</li>
													<li>
														<p>
															体重：<span id="tizhong"></span>
														</p>
													</li>
													<li>
														<p>
															状态：<span id="tzzhuangtai"></span>
														</p>
													</li>
												</ul>
											</div>
										</div>
									</div>

								</div>

								<!-- 健康数据结束 -->
							</div>
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
<script type="text/javascript">
   function goXueYa (){
      location.href="${APP_PATH}/older/xueya";
   }     
    function goTiWen(){
      location.href="${APP_PATH}/older/tiwen";
   }   
   function goTiZhong(){
      location.href="${APP_PATH}/older/tizhong";
   }  
  function Login_Out() { 
      if( confirm('您确定要退出本次登录吗?')) {
         location.href = '/index.html';
       }
  };
  
</script>
</body>
</html>
