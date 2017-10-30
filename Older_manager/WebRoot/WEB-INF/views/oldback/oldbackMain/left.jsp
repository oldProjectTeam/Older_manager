<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${APP_PATH}/static/css/oldbackstyle.css" rel="stylesheet"
	type="text/css" />
<script language="JavaScript" src="${APP_PATH}/static/js/jquery.js"></script>

<script type="text/javascript">
	$(function() {
		//导航切换
		$(".menuson li").click(function() {
			$(".menuson li.active").removeClass("active")
			$(this).addClass("active");
		});

		$('.title').click(function() {
			var $ul = $(this).next('ul');
			$('dd').find('ul').slideUp();
			if ($ul.is(':visible')) {
				$(this).next('ul').slideUp();
			} else {
				$(this).next('ul').slideDown();
			}
		});
	});
</script>
</head>
<body style="background:#f0f9fd;">
	<div class="lefttop">
		<span></span>后台管理
	</div>
	<dl class="leftmenu">
		<!--档案管理导航开始  -->
		<dd>
			<div class="title">
				<span><img
					src="${APP_PATH}/static/images/oldback/images/info.png" width="30"
					height="30" style="margin-top: -8px;" /></span> <a
					href="${APP_PATH }/old/insertnewolder" target="rightFrame">档案管理</a>
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="${APP_PATH }/old/insertnewolder"
					target="rightFrame">新增老人</a><i></i></li>
				<li><cite></cite><a href="${APP_PATH }/old/batchImport"
					target="rightFrame">批量导入</a><i></i></li>

				<li><cite></cite><a href="${APP_PATH }/old/skipolderinfo/1"
					target="rightFrame">老人列表</a><i></i></li>
			</ul>
		</dd>

		<!-- 健康管理导航开始 -->
		<dd>
			<div class="title">
				<span><img
					src="${APP_PATH}/static/images/oldback/images/health.png"
					width="30" height="30" style="margin-top: -8px;" /></span><a
					href="${APP_PATH}/health/health" target="rightFrame">健康管理</a>
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="${APP_PATH}/health/healthInfo"
					target="rightFrame">基本健康信息</a><i></i></li>
				<li><cite></cite><a href="right.html" target="rightFrame">体检记录</a><i></i></li>
				<li><cite></cite><a href="right.html" target="rightFrame">健康评估</a><i></i></li>
				<li><cite></cite><a href="${APP_PATH}/health/healthattend"
					target="rightFrame">就诊记录</a><i></i></li>
			</ul>
		</dd>

		<!-- 老人客户关系管理导航开始 -->
		<dd>
			<div class="title">
				<span><img
					src="${APP_PATH}/static/images/oldback/images/relative.png"
					width="30" height="30" style="margin-top: -8px;" /></span> <a href=""
					target="rightFrame">客户关系管理</a>
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="into.html" target="rightFrame">参加活动</a><i></i></li>
				<li><cite></cite><a href="right.html" target="rightFrame">推荐活动</a><i></i></li>
				<li><cite></cite><a href="right.html" target="rightFrame">提醒记录</a><i></i></li>
				<li><cite></cite><a href="right.html" target="rightFrame">沟通老人</a><i></i></li>
				<li><cite></cite><a href="right.html" target="rightFrame">购买商品</a><i></i></li>
				<li><cite></cite><a href="right.html" target="rightFrame">推荐商品</a><i></i></li>
				<li><cite></cite><a href="right.html" target="rightFrame">购买能力</a><i></i></li>
			</ul>
		</dd>
		<!-- 老人教育管理导航开始 -->
		<dd>
			<div class="title" id="education">
				<span><img
					src="${APP_PATH}/static/images/oldback/images/education.png"
					width="30" height="30" style="margin-top: -8px;" /></span> <a
					href="education/educationIndex" target="rightFrame">教育管理</a>
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="${APP_PATH }/video/intoVideoManager"
					target="rightFrame">视频管理</a><i></i></li>
				<li><cite></cite><a href="${APP_PATH }/video/intoAddVideo"
					target="rightFrame">添加视频</a><i></i></li>
				<li><cite></cite><a href="${APP_PATH }/Course/coursemanager/"
					target="rightFrame">课程管理</a><i></i></li>
				<li><cite></cite><a href="${APP_PATH }/Course/addcourse/"
					target="rightFrame">添加课程</a><i></i></li>
				<li><cite></cite><a href="courseenrol/searchCourseenrol"
					target="rightFrame">课程报名</a><i></i></li>
			</ul>
		</dd>

		<!-- 数据统计导航开始 -->
		<dd>
			<div class="title">
				<span><img
					src="${APP_PATH}/static/images/oldback/images/count.png" width="30"
					height="30" style="margin-top: -8px;" /></span>数据统计
			</div>
			<ul class="menuson">

				<li><cite></cite><a href="listinto.html" target="rightFrame">回访时间</a><i></i></li>
				<li><cite></cite><a href="data/oldDataCount"
					target="rightFrame">老人统计</a><i></i></li>
				<li><cite></cite><a href="activity/activityDataCount"
					target="rightFrame">活动统计</a><i></i></li>
			</ul>
		</dd>

		<!--办公管理导航开始  -->
		<dd>
			<div class="title">
				<span><img
					src="${APP_PATH}/static/images/oldback/images/office.png"
					width="30" height="30" style="margin-top: -8px;" /></span> <a
					href="officemanage/officemanageIndex" target="rightFrame">办公管理</a>
			</div>
			<ul class="menuson">

				<li><cite></cite><a href="sendsms" target="rightFrame">发送短信</a><i></i></li>
				<li><cite></cite><a href="sendrecord" target="rightFrame">短信记录</a><i></i></li>
				<li><cite></cite><a href="informnotice" target="rightFrame">通知公告</a><i></i></li>
				<li><cite></cite><a href="sendnotice" target="rightFrame">发布公告</a><i></i></li>
				<li><cite></cite><a href="addressbookmanager"
					target="rightFrame">通讯录管理</a><i></i></li>
				<li><cite></cite><a href="activity/queryActivity"
					target="rightFrame">活动管理</a><i></i></li>
				<li><cite></cite><a href="activity/sendactivity"
					target="rightFrame">发布活动</a><i></i></li>
			</ul>
		</dd>

		<!-- 老人账户管理开始 -->
		<dd>
			<div class="title">
				<span><img
					src="${APP_PATH}/static/images/oldback/images/old.png" width="30"
					height="30" style="margin-top: -8px;" /></span> <a href="accountmanage"
					target="rightFrame">老人账户管理</a>
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="accountmanage" target="rightFrame">老人账户列表</a><i></i></li>
				<li><cite></cite><a href="giftmanage" target="rightFrame">老人礼品管理</a><i></i></li>
				<li><cite></cite><a href="giftexchange" target="rightFrame">礼品兑换记录</a><i></i></li>
				<li><cite></cite><a href="integralexchane" target="rightFrame">积分管理</a><i></i></li>
			</ul>
		</dd>


		<!-- 系统管理导航开始 -->
		<dd>
			<div class="title">
				<span><img
					src="${APP_PATH}/static/images/oldback/images/system.png"
					width="30" height="30" style="margin-top: -8px;" /></span> <a
					href="systemManageindex" target="rightFrame">系统管理</a>
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="operation_log" target="rightFrame">操作日志</a><i></i></li>
			</ul>
		</dd>

		<!-- 定位查询导航开始 -->
		<dd>
			<div class="title">
				<span><img
					src="${APP_PATH}/static/images/oldback/images/location.png"
					width="30" height="30" style="margin-top: -8px;" /></span>定位管理
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="#">定位查询</a><i></i></li>
			</ul>
		</dd>
	</dl>
</body>
</html>
