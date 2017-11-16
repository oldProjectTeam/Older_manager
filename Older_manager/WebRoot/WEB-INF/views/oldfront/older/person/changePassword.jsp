<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
pageContext.setAttribute("APP_PATH", request.getContextPath());
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>修改密码</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1" />
<link href="${APP_PATH}/static/oldfront/assets/css/bootstrap.css"
	rel="stylesheet" />
<link href="${APP_PATH}/static/oldfront/assets/css/font-awesome.css"
	rel="stylesheet" />
<link href="${APP_PATH}/static/oldfront/assets/css/animate.css"
	rel="stylesheet" />
<link href="${APP_PATH}/static/oldfront/assets/css/flexslider.css"
	rel="stylesheet" />
<link href="${APP_PATH}/static/oldfront/assets/css/style.css"
	rel="stylesheet" />
<link rel="stylesheet"
	href="${APP_PATH}/static/oldfront/css/logincss.css" />
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300'
	rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Lobster'
	rel='stylesheet' type='text/css' />
</head>
<body>
	<div class="below-slideshow">
		<div class="container">
			<div class="row">
				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
					<div class="txt-block">
						<h1 class="head-line">账户密码修改</h1>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- BELOW SLIDESHOW SECTION END-->
	<div class="neirong">
		<div class="left1" style="background-image: url(img/left1.jpg);">
			<hr />
			<div class="lanmu1">
				<a>个人资料</a>
			</div>
			<div class="left11">
				<a href="oldmanview.html">个人资料查看</a>
			</div>
			<div class="left11">
				<a href="oldmanmodify.html">个人资料修改</a>
			</div>
			<div class="left11">
				<a href="changepassword.html">账户密码修改</a>
			</div>
			<hr />
			<div class="lanmu1">
				<a>健康数据</a>
			</div>
			<div class="left11">
				<a href="oldmanhealth.html">个人健康查看</a>
			</div>
			<div class="left11">
				<a href="healthreport.html">健康评估报告</a>
			</div>
			<div class="left11">
				<a href="peinfoview.html">体检资料查看</a>
			</div>
			<div class="left11">
				<a href="visiting_record.html">就诊记录查看</a>
			</div>
			<div class="left11">
				<a href="takedrug.html">服用药品详情</a>
			</div>
			<div class="left11">
				<a href="usehealth.html">使用养生用品</a>
			</div>
			<hr />
			<div class="lanmu1">
				<a>短信通告</a>
			</div>
			<div class="left11">
				<a href="sms.html">短信查看</a>
			</div>
			<div class="left11">
				<a href="notice.html">通告查看</a>
			</div>
			<hr />
			<div class="lanmu1">
				<a>我的活动</a>
			</div>
			<div class="left11">
				<a href="activity.html">我的活动详情</a>
			</div>
			<div class="left11">
				<a href="activity_recom.html">推荐活动</a>
			</div>
			<hr />
			<div class="lanmu1">
				<a>我的视频课程</a>
			</div>
			<div class="left11">
				<a href="mycourses.html">我关注的课程</a>
			</div>
			<div class="left11">
				<a href="myvedio.html">我关注的视频</a>
			</div>
		</div>
		<div class="right1" style="background-image: url(img/right1.png)">
			<div class="touxiang">
				<div class="img1">
					<img src="assets/img/portfolio/c.png" alt="头像" />
				</div>
				<div class="touxiangziliao">
					<p>
						<span>用户名：</span>罗先生
					</p>
					<p>
						<span>id：</span>41212
					</p>
					<p>
						<span>积分：</span>45
					</p>
				</div>
			</div>
			<hr />
			<h3>&nbsp; &nbsp;密码很重要，修改需谨慎：</h3>
			<hr />
			<div class="ziliao">
				<div class="ziliao4">
					<form>
						<label for="label4">请输入您的原密码：</label> <input type="password"
							id="label4" /> <label for="label1">请输入您的新密码：</label> <input
							type="password" id="label1" /> <label for="label2">请确认您的新密码：</label>
						<input type="password" id="label2" /> <br /> <label for="label3">请输入左边验证码：</label>
						<input type="text" id="label3" /><img src="assets/img/2.jpg" />
						<hr />
						<button>确认修改</button>
					</form>
				</div>
			</div>
		</div>
		<div class="clear"></div>
	</div>
	<hr />
	<br />
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>
