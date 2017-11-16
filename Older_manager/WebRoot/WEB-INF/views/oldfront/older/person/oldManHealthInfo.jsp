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

<title>个人健康信息</title>

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
						<h1 class="head-line">个人健康查看</h1>
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
			<h3>&nbsp; &nbsp; 欢迎查看您的健康资料：</h3>
			<hr />
			<div class="ziliao">
				<div class="ziliao1">
					<p style="color: #000000;">
						<span>症状：</span>罗先生
					</p>
					<p style="color: #000000;">
						<span>体温：</span>女
					</p>
					<p style="color: #000000;">
						<span>脉率：</span>45岁
					</p>
				</div>
				<hr />
				<div class="ziliao2">
					<p style="color: #000000;">
						<span>呼吸频率：</span>罗先生
					</p>
					<p style="color: #000000;">
						<span>左侧血压：</span>女
					</p>
					<p style="color: #000000;">
						<span>右侧血压：</span>45岁
					</p>
					<p>
						<span>身高：</span>罗先生
					</p>
					<p>
						<span>体重：</span>45岁
					</p>
					<p>
						<span>腰围：</span>女
					</p>
					<p>
						<span>认知功能：</span>女
					</p>
					<p>
						<span>情感状态：</span>女
					</p>
					<p>
						<span>坚持锻炼时间：</span>罗先生
					</p>
					<p>
						<span>锻炼方法：</span>罗先生
					</p>
					<p>
						<span>开始吸烟年龄：</span>罗先生
					</p>
					<p>
						<span>日吸烟量：</span>罗先生
					</p>
					<p>
						<span>戒烟年龄：</span>罗先生
					</p>
					<p>
						<span>齿列：</span>罗先生
					</p>
					<p style="color: #000000;">
						<span>左眼视力：</span>罗先生
					</p>
					<p style="color: #000000;">
						<span>右眼视力：</span>罗先生
					</p>
					<p style="color: #000000;">
						<span>听力：</span>罗先生
					</p>
					<p style="color: #000000;">
						<span>运动能力：</span>罗先生
					</p>
					<p style="color: #000000;">
						<span>巩膜：</span>罗先生
					</p>
					<p style="color: #000000;">
						<span>心率：</span>罗先生
					</p>
					<p>
						<span>压痛：</span>罗先生
					</p>
					<p>
						<span>脾：</span>罗先生
					</p>
				</div>
				<div class="ziliao3">
					<p style="color: #000000;">
						<span>体质指数：</span>女
					</p>
					<p style="color: #000000;">
						<span>臀围：</span>女
					</p>
					<p>
						<span>腰臀比值：</span>45岁
					</p>
					<p>
						<span>健康状况评价：</span>罗先生
					</p>
					<p>
						<span>自理能力评价：</span>女
					</p>
					<p>
						<span>自理能力评价：</span>女
					</p>
					<p>
						<span>自理能力评价：</span>女
					</p>
					<p>
						<span>每次锻炼时间：</span>女
					</p>
					<p>
						<span>饮酒频率：</span>罗先生
					</p>
					<p>
						<span>日饮酒量：</span>罗先生
					</p>
					<p>
						<span>开始饮酒年龄：</span>罗先生
					</p>
					<p>
						<span>是否戒酒：</span>罗先生
					</p>
					<p>
						<span>口唇：</span>罗先生
					</p>
					<p>
						<span>咽部：</span>罗先生
					</p>
					<p style="color: #000000;">
						<span>矫正左眼视力：</span>罗先生
					</p>
					<p style="color: #000000;">
						<span>矫正右眼视力：</span>罗先生
					</p>
					<p style="color: #000000;">
						<span>皮肤：</span>罗先生
					</p>
					<p style="color: #000000;">
						<span>淋巴结：</span>罗先生
					</p>
					<p style="color: #000000;">
						<span>杂音：</span>罗先生
					</p>
					<p>
						<span>包块：</span>罗先生
					</p>
					<p>
						<span>肝：</span>罗先生
					</p>
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
