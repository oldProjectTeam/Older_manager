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
					src="${APP_PATH}/static/images/oldback/images/leftico01.png" /></span> <a
					href="${APP_PATH }/old/addOldManInfo" target="rightFrame">档案管理</a>
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="${APP_PATH }/old/addOldManInfo"
					target="rightFrame">新增老人</a><i></i></li>
				<li><cite></cite><a href="${APP_PATH }/old/batchImport"
					target="rightFrame">批量导入</a><i></i></li>

				<li><cite></cite><a href="${APP_PATH }/old/skipolderinfo/"
					target="rightFrame">老人列表</a><i></i></li>
			</ul>
		</dd>

		<!-- 健康管理导航开始 -->
		<dd>
			<div class="title">
				<span><img
					src="${APP_PATH}/static/images/oldback/images/leftico01.png" /></span><a
					href="healthManage/health.html" target="rightFrame">健康管理</a>
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="healthManage/healthInfo.html"
					target="rightFrame">基本健康信息</a><i></i></li>
				<li><cite></cite><a href="right.html" target="rightFrame">体检记录</a><i></i></li>
				<li><cite></cite><a href="right.html" target="rightFrame">健康评估</a><i></i></li>
				<li><cite></cite><a href="healthManage/healthattend.html"
					target="rightFrame">就诊记录</a><i></i></li>
			</ul>
		</dd>

		<!-- 老人客户关系管理导航开始 -->
		<dd>
			<div class="title">
				<span><img
					src="${APP_PATH}/static/images/oldback/images/leftico01.png" /></span>客户关系管理
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
					src="${APP_PATH}/static/images/oldback/images/leftico01.png" /></span> <a
					href="educationManage/educationIndex.html" target="rightFrame">教育管理</a>
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="educationManage/videoManager.jsp"
					target="rightFrame">视频管理</a><i></i></li>
				<li><cite></cite><a href="educationManage/addvedio.jsp"
					target="rightFrame">添加视频</a><i></i></li>
				<li><cite></cite><a href="educationManage/coursemanager.jsp"
					target="rightFrame">课程管理</a><i></i></li>
				<li><cite></cite><a href="educationManage/addcourse.jsp"
					target="rightFrame">添加课程</a><i></i></li>
				<li><cite></cite><a href="educationManage/courseEnrol.jsp"
					target="rightFrame">课程报名</a><i></i></li>
			</ul>
		</dd>

		<!-- 数据统计导航开始 -->
		<dd>
			<div class="title">
				<span><img
					src="${APP_PATH}/static/images/oldback/images/leftico02.png" /></span>数据统计
			</div>
			<ul class="menuson">

				<li><cite></cite><a href="listinto.html" target="rightFrame">回访时间</a><i></i></li>
				<li><cite></cite><a href="list.html" target="rightFrame">活动统计</a><i></i></li>
			</ul>
		</dd>

		<!--办公管理导航开始  -->
		<dd>
			<div class="title">
				<span><img
					src="${APP_PATH}/static/images/oldback/images/leftico02.png" /></span> <a
					href="/Older_manager/static/oldback/officemanage/page.jsp"
					target="rightFrame">办公管理</a>
			</div>
			<ul class="menuson">

				<li><cite></cite><a
					href="/Older_manager/static/oldback/officemanage/sendsms.jsp"
					target="rightFrame">发送短信</a><i></i></li>
				<li><cite></cite><a
					href="/Older_manager/static/oldback/officemanage/sendrecord.jsp"
					target="rightFrame">短信记录</a><i></i></li>
				<li><cite></cite><a
					href="/Older_manager/static/oldback/officemanage/informnotice.jsp"
					target="rightFrame">通知公告</a><i></i></li>
				<li><cite></cite><a
					href="/Older_manager/static/oldback/officemanage/sendnotice.jsp"
					target="rightFrame">发布公告</a><i></i></li>
				<li><cite></cite><a
					href="/Older_manager/static/oldback/officemanage/addressbookmanager.jsp"
					target="rightFrame">通讯录管理</a><i></i></li>
				<li><cite></cite><a
					href="/Older_manager/static/oldback/officemanage/activitymanager.jsp"
					target="rightFrame">活动管理</a><i></i></li>
				<li><cite></cite><a
					href="/Older_manager/static/oldback/officemanage/sendactivity.jsp"
					target="rightFrame">发布活动</a><i></i></li>
			</ul>
		</dd>

		<!-- 老人账户管理开始 -->
		<dd>
			<div class="title">
				<span><img
					src="${APP_PATH}/static/images/oldback/images/accounticon1.png" /></span>
				<a href="oldaccountmanage/accountManageindex.html"
					target="rightFrame">老人账户管理</a>
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="oldaccountmanage/accountmanage.jsp"
					target="rightFrame">老人账户列表</a><i></i></li>
				<li><cite></cite><a href="oldaccountmanage/giftmanage.jsp"
					target="rightFrame">老人礼品管理</a><i></i></li>
				<li><cite></cite><a href="oldaccountmanage/giftexchange.jsp"
					target="rightFrame">礼品兑换记录</a><i></i></li>
				<li><cite></cite><a href="oldaccountmanage/integralexchane.jsp"
					target="rightFrame">积分管理</a><i></i></li>
			</ul>
		</dd>


		<!-- 系统管理导航开始 -->
		<dd>
			<div class="title">
				<span><img
					src="${APP_PATH}/static/images/oldback/images/leftico03.png" /></span> <a
					href="systemManage/systemManageindex.html" target="rightFrame">系统管理</a>
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="systemManage/operation_log.jsp"
					target="rightFrame">操作日志</a><i></i></li>
			</ul>
		</dd>

		<!-- 定位查询导航开始 -->
		<dd>
			<div class="title">
				<span><img
					src="${APP_PATH}/static/images/oldback/images/leftico04.png" /></span>定位管理
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="#">定位查询</a><i></i></li>
			</ul>
		</dd>
	</dl>
</body>
</html>
