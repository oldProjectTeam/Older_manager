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
</head>
<body>
	<!--加载头部  -->
	<jsp:include page="header.jsp"></jsp:include>

	<div class="container" style="margin-top:80px">
		<div class="row">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
				<h1 class="tag-home">
					贵州孝和集团是一家业内资深的专注于提供优质健康管理服务的老年养护集团公司。孝和集团在老年养护行业深耕十年有余，实力雄厚。</h1>
				<hr />
			</div>
		</div>
	</div>
	<div class="just-sec">
		<div class="container">
			<div class="row">
				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
					<div class="just-txt-div">
						<img src="${APP_PATH}/static/oldfront/assets/img/t1.jpg" alt=""
							class="img-circle set-about-img" />
						<h2>
							<strong>我们的品牌理念</strong>
						</h2>
						<p>孝和集团追求“5H”品牌理念，即HEALTH --- 健康、HAPPINESS --- 幸福、HARMONY ---
							和谐、HOPE --- 希望、HOME --- 家一样的舒适，为我们的老年朋友打造健康、幸福和谐、有希望的家！</p>
					</div>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
					<div class="just-txt-div">
						<img src="${APP_PATH}/static/oldfront/assets/img/t2.jpg" alt=""
							class="img-circle set-about-img" />
						<h2>
							<strong>我们的发展目标</strong>
						</h2>
						<p>孝和集团目标成为最符合社会需要的养老综合服务运营商，所以我们把握好时机和节奏，做好这三件事： 1.
							行业标准制定方，服务最完善的养老机构 2. 一套内生增长、自动循环、修复、完善的标准系统模式 3.
							链接各行业的“养老+互联网”服务平台</p>
					</div>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
					<div class="just-txt-div">
						<img src="${APP_PATH}/static/oldfront/assets/img/t3.jpg" alt=""
							class="img-circle set-about-img" />
						<h2>
							<strong>我们的经营模式</strong>
						</h2>
						<p>
							其主打的机构养老、社区养老和居家养老三级服务相结合的模式，打破了机构养老的单一模式，集团会员可自由选择居住、托管、康复或是仅参加日常园区内社团活动。会员在养护园区内既能享受舒适的设施和优质的养护、医疗服务，又不脱离生活社交圈，依然保有一定的社会活跃度。
						</p>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-6 col-md-6 col-sm-46 col-xs-12">
					<div class="just-txt-div">
						<p>贵州孝和集团是一家业内资深的专注于提供优质健康管理服务的老年养护集团公司。
							和孝集团在老年养护行业深耕十年有余，实力雄厚。其主打的机构养老、社区养老和居家养老三级服务相结合的模式，
							打破了机构养老的单一模式，集团会员可自由选择居住、托管、康复或是仅参加日常园区内社团活动。
							会员在养护园区内既能享受舒适的设施和优质的养护、医疗服务，又不脱离生活社交圈，依然保有一定的社会活跃度。
							这即是和孝集团倡导的安定、安心、安康、安享的“四安”养护生活方式，从而助力老年人享受充实而精彩的晚年生活。</p>
						<p>和孝养老服务集团在上海、浙江等地设有8家长寿家园养护机构，占地面积5万余平方，管理床位2000多张。</p>
					</div>
				</div>
				<div class="col-lg-6 col-md-6 col-sm-46 col-xs-12">
					<div class="just-txt-div">
						<img src="${APP_PATH}/static/oldfront/assets/img/side.jpg"
							class="img-responsive" />
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
	<script language="JavaScript"
		src="${APP_PATH}/static/js/jquery-3.2.1.min.js"></script>
	<script src="${APP_PATH}/static/oldfront/assets/js/bootstrap.js"></script>
	<script src="${APP_PATH}/static/oldfront/assets/js/wow.js"></script>
	<script
		src="${APP_PATH}/static/oldfront/assets/js/jquery.flexslider.js"></script>
	<script src="${APP_PATH}/static/oldfront/assets/js/custom.js"></script>
	<script type="text/javascript">
		$(function() {
			var x = document.getElementsByClassName("check");
			$(x[0]).removeClass("menu-top-active");
			$(x[4]).addClass("menu-top-active");

		});
	</script>
</body>
</html>
