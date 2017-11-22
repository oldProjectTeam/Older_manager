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
<link href="${APP_PATH}/static/oldfront/older/css/easyui.css"
	rel="stylesheet" type="text/css">
<link href="${APP_PATH}/static/oldfront/older/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${APP_PATH}/static/oldfront/older/css/layout.css"
	rel="stylesheet">
<link href="${APP_PATH}/static/oldfront/older/css/default.css"
	rel="stylesheet">
<link href="${APP_PATH}/static/oldfront/older/css/icon.css"
	rel="stylesheet">

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
					<!-- 位置开始 -->
					<div class="jksj" style="margin-top:15px;">
						<div class="xy-title">
							课程详细
							<button type="button" class="btn back fr"
								onclick="javascript:history.go(-1)">返回</button>
						</div>
					</div>
					<!-- 详细内容开始 -->
					<div class="jksj">
						<div class="row">
							<div class="col-md-3 course_title_bg">
								<img src="${APP_PATH}/static/oldfront/older/images/course_img.jpg">
							</div>
							<div class="col-md-5">
								<h3>java后端开发</h3>
								<p>讲师：马云</p>
								<p>授课方式：线上授课</p>
								<p>开课时间：2017-5-6</p>
								<p>
									<a href=""><font color="red">开始学习</font></a>
								</p>
							</div>
							<div class="col-md-4">
								<button type="button" class="btn btn-primary">立即报名</button>
							</div>
						</div>
						<div class="row">
							<div class="panel panel-primary" style="margin-top:5px">
								<div class="panel-heading">课程介绍</div>
								<div class="panel-body">&nbsp; &nbsp;胶东在线11月20日讯(通讯员 赵中妹)
									农历九月初九是我国古老的传统节日之一，古人把“九九相重”叫重阳节，我国把农历九月初九定为“老人节”，将传统与现代巧妙地结合，成为尊老、爱老、助老的“老人节”。长岛县第一实验学校家委会利用周末组织策划了“情浓重阳，礼敬老人”的主题活动。
									让孩子们走进情感世界，感受长辈对自己的爱，并把长辈的爱“迁移”身边每一位老人和敬老院的老人，感受与老人一起的快乐，同时让老人们享受到被关怀的快乐，让老人为孩子的成长感到欣慰与骄傲。
									通过开展礼敬老人的活动，激发孩子们关爱老人、孝敬老人的情感，培养孩子们关心老人、敬重老人的良好品质，弘扬了中华民族尊老敬老的优良传统。
								</div>
							</div>
						</div>
					</div>

				</div>
			</div>
			<!--底部开始  -->
			<jsp:include page="footer.jsp"></jsp:include>
			<!-- 底部结束 -->
			<script src="${APP_PATH}/static/oldfront/older/js/bootstrap.js"></script>
			<script src="${APP_PATH}/static/oldfront/older/js/bootstrap.min.js"></script>
			<script src="${APP_PATH}/static/oldfront/older/js/TableJS.js"
				type="text/javascript"></script>
			<script src="${APP_PATH}/static/oldfront/older/js/md5.js"></script>
</body>
</html>
