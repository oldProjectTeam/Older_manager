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
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>智慧老人系统</title>
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
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300'
	rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Lobster'
	rel='stylesheet' type='text/css' />
<style type="text/css">
</style>
</head>
<body>
	<section class="menu-section">
	<div class="container">
		<div class="row ">
			<div class="col-md-12">
				<div class="navbar-collapse collapse">
					<ul id="menu-top"
						class="nav navbar-nav navbar-right navbar-fixed-top navbar-inverse">
						<li style="padding-left: 15px;padding-top: 6px;padding-bottom: 6px;"><img
							src="${APP_PATH}/static/images/oldback/images/logo.png"
							width="200px" style="margin-right: 240px;" /></li>
						<li><a href="index.jsp" class="menu-top-active">主页</a></li>
						<li><a href="about.jsp">关于我们</a></li>
						<li><a href="contact.jsp">联系我们</a></li>
						<li><a href="activity.jsp">社区活动</a></li>
						<li><a href="download.jsp">客户端下载</a></li>
						<li><a href="${APP_PATH}/older/video">视频直播</a></li>
						<li><a href="blank.jsp">会员登陆</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	</section>
	<!-- MENU SECTION END-->
	<div id="slideshow-sec" style="margin-top: 15px;">
		<div id="carousel-div" class="carousel slide" data-ride="carousel">

			<div class="carousel-inner">
				<div class="item active">

					<img src="${APP_PATH}/static/oldfront/assets/img/1.jpg" alt="" />
					<div class="carousel-caption">
						<h1 class="wow slideInLeft" data-wow-duration="2s">在家满是父母的唠叨</h1>
						<h2 class="wow slideInRight" data-wow-duration="2s">在外全是父母的叮咛</h2>
					</div>

				</div>
				<div class="item">
					<img src="${APP_PATH}/static/oldfront/assets/img/2.jpg" alt="" />
					<div class="carousel-caption">
						<h1 class="wow slideInLeft" data-wow-duration="2s">多一点关爱</h1>
						<h2 class="wow slideInRight" data-wow-duration="2s">多一点问侯</h2>
					</div>
				</div>
				<div class="item">
					<img src="${APP_PATH}/static/oldfront/assets/img/3.jpg" alt="" />
					<div class="carousel-caption">
						<h1 class="wow slideInLeft" data-wow-duration="2s">老有所养</h1>
						<h2 class="wow slideInRight" data-wow-duration="2s">老有所依</h2>
					</div>

				</div>
			</div>
			<!--INDICATORS-->
			<ol class="carousel-indicators">
				<li data-target="#carousel-div" data-slide-to="0" class="active"></li>
				<li data-target="#carousel-div" data-slide-to="1"></li>
				<li data-target="#carousel-div" data-slide-to="2"></li>
			</ol>
			<!--PREVIUS-NEXT BUTTONS-->
			<a class="left carousel-control" href="#carousel-div"
				data-slide="prev"> <span
				class="glyphicon glyphicon-chevron-left"></span>
			</a> <a class="right carousel-control" href="#carousel-div"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right"></span>
			</a>
		</div>
	</div>
	<!-- SLIDESHOW SECTION END-->
	<div class="below-slideshow">
		<div class="container">
			<div class="row">
				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
					<div class="txt-block">


						<i class="fa fa-lastfm fa-4x"></i>
						<h4>
							近期活动
							<h4>
								<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
									Mauris sagittis felis dolor vitae.</p>
					</div>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
					<div class="txt-block">


						<i class="fa fa-yelp fa-4x"></i>
						<h4>服务简介</h4>
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
							Mauris sagittis felis dolor vitae.</p>
					</div>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
					<div class="txt-block">


						<i class="fa fa-ioxhost fa-4x"></i>
						<h4>最近推荐</h4>
						<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
							Mauris sagittis felis dolor vitae.</p>
					</div>
				</div>
			</div>

		</div>
	</div>
	<!-- BELOW SLIDESHOW SECTION END-->
	<div class="container">
		<div class="row">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
				<h1 class="tag-home">
					他们奉献一生，难免走路磕磕绊绊;他们教育一生，难免话语细细碎碎。尊重老人，他们才是我们前行的明灯。.</h1>
				<hr />
			</div>
		</div>
	</div>
	<!--VEDIO SECTION END-->

	<!--JUST SECTION END-->
	<div class="container ">
		<div class="row ">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
				<h1 class="head-line">尊老为德，敬老为善，爱老为美，助老为乐</h1>
				<br />
			</div>
		</div>
	</div>
	<!--CLIENT SECTION END-->
	<div class="container ">
		<div class="row">
			<div
				class="col-lg-10 col-md-10 col-sm-10 col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-12 set-div">
				<div class="just-txt-div text-center">
					<h3>
						<strong>-- 现在加入还有特别优惠哦 --</strong>
					</h3>
					<p>
						我们的口号是： <strong> 世界和平 ：</strong> 尊老人敬，助老风和，人间美好，社会文明。 <br /> <br />
					</p>
					<a class="btn btn-info btn-lg" href="#">了解更多</a> &nbsp;&nbsp; <a
						class="btn btn-success btn-lg" href="#">加入我们 </a>
				</div>

			</div>
		</div>
	</div>
	<div
		style="color: #F0F0EE;background: #01A2A6;font:16px Tahoma; margin:0px auto; text-align:center;">
		<div>
			<hr />
			<p>关于我们 | 联系我们 | 使用帮助 | 用户协议 | iPhone/iPad Android</p>

			<p>地址：贵州省贵阳市花溪区贵州大学北校区野猪林 | 联系电话：0851-7474740</p>

			Copyright &copy;2017 孝和集团<a href="#" style="color:#00A4AC;">七剑下通州有限公司</a>
			ALL RIGHT RESERVED<br /> 联系方式：qijianxiatongzhou@gmail.com<br />
			<hr />
		</div>
	</div>
	<script
		src="${APP_PATH}/static/oldfront/assets/js/jquery-1.11.1.min.js"></script>
	<!--BOOTSTRAP SCRIPTS PLUGIN-->
	<script src="${APP_PATH}/static/oldfront/assets/js/bootstrap.js"></script>
	<!--WOW SCRIPTS PLUGIN-->
	<script src="${APP_PATH}/static/oldfront/assets/js/wow.js"></script>
	<!--FLEXSLIDER SCRIPTS PLUGIN-->
	<script
		src="${APP_PATH}/static/oldfront/assets/js/jquery.flexslider.js"></script>
	<!--CUSTOM SCRIPTS -->
	<script src="${APP_PATH}/static/oldfront/assets/js/custom.js"></script>
</body>

</html>
