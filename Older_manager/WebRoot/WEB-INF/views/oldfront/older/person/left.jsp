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

<title>左侧导航栏</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<style type="text/css">
a {
	text-decoration: none !important;
}
</style>

</head>

<body>
	<div class="col-md-3">
		<div class="left">
			<!-- 用户中心开始 -->
			<div class="user">
				<div class="user-photo">
					<img src="${older.oldman.photo}" height="115" width="108"
						border="0" class="img-circle"
						nerror="onerror=null;src='${APP_PATH }/static/oldfront/older/images/doctor.png'" />
				</div>
				<div class="user-mes">
					<ul>
						<li class="name"><i class="icon-nav icon-user"></i>
							${older.oldman.name }</li>
						<li><i class="icon-phone"></i>${older.oldman.phone }</li>
						<li>所属分部:${older.oldman.service}</li>
						<li>
							<div class="news"
								onClick="javascript:window.location.href='${APP_PATH}/older/sms'">
								<i class="icon-mail"></i> <span id="sms_count"></span>
							</div>
							<div class="tips"
								onClick="javascript:window.location.href='${APP_PATH}/older/notice'">
								<i class="icon-light"></i> <span id="notice_count"></span>
							</div>
						</li>
					</ul>
				</div>
				<div class="my_center"
					onclick="javascript:window.location.href='${APP_PATH}/older/person'">&gt;&gt;个人中心</div>
			</div>
			<!-- 用户中心结束 -->
			<!-- 菜单开始 -->
			<div class="menu">
				<ul>
					<li><a href="${APP_PATH}/older/pinggu/1&${older.oldman.id}"
						class="menu-item"><i class="icon-nav icon-fwyd mr30"></i>健康评估</a></li>
					<li><a href="${APP_PATH}/older/lvli" class="menu-item"><i
							class="icon-nav icon-fwyd mr30"></i>健康履历</a></li>
					<li><a href="${APP_PATH}/older/tijian" class="menu-item"><i
							class="icon-nav icon-dtdw mr30"></i>体检记录</a></li>
					<li><a href="${APP_PATH}/older/jiuzhen" class="menu-item"><i
							class="icon-nav icon-jjaq mr30"></i>就诊记录</a></li>
					<li><a href="${APP_PATH}/older/takeDrug" class="menu-item"><i
							class="icon-nav icon-gasp mr30"></i>用药记录</a></li>
					<li><a href="${APP_PATH}/older/myactivity" class="menu-item"><i
							class="icon-nav icon-sbgl mr30"></i>我的活动</a></li>
					<li><a href="${APP_PATH}/older/mycourse" class="menu-item"><i
							class="icon-nav icon-xxcx mr30"></i>我的课程</a></li>
				</ul>
			</div>
			<!-- 菜单结束 -->
		</div>
	</div>
	<script type="text/javascript">
		//默认加载数据
		$(function() {

			//加载短信总数
			getSmsCount();
			//加载公告总数
			getNoticeCount();
		});
		//获得短信总数
		function getSmsCount() {
			$.ajax({
				url : "${APP_PATH}/sms/getCount/${older.account}",
				type : "post",
				success : function(result) {
					$("#sms_count").html(result.extend.count);
				}
			});
		}

		//获得短信总数
		function getNoticeCount() {
			$.ajax({
				url : "${APP_PATH}/notice/getCount",
				type : "post",
				success : function(result) {
					$("#notice_count").html(result.extend.count);
				}
			});
		}
	</script>
</body>
</html>
