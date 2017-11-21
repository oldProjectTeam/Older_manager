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

<title>我的课程</title>

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
<link rel="stylesheet"
	href="${APP_PATH}/static/oldfront/css/usehealth.css" />
<link
	href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300'
	rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' />
<link href='http://fonts.googleapis.com/css?family=Lobster'
	rel='stylesheet' type='text/css' />
</head>

<body>
	<!--头部导航  -->
    <jsp:include page="head.jsp"></jsp:include>
	<div class="below-slideshow">
		<div class="container">
			<div class="row">
				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
					<div class="txt-block">
						<h1 class="head-line">您关注的课程查看</h1>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- BELOW SLIDESHOW SECTION END-->
	<div class="neirong">
		<!--左侧导航栏  -->
		<jsp:include page="left.jsp"></jsp:include>
		<div class="right1" style="background-image: url(${APP_PATH}/static/oldfront/img/right1.png)">
			<!--基本信息部分 -->
			<jsp:include page="olderInfo.jsp"></jsp:include>
			<hr />
			<h3>&nbsp; &nbsp; 欢迎查看您的关注课程：</h3>
			<hr />
			<div class="ziliao">
				<div class="ziliao5">
					<table class="bordered">
						<thead>
							<tr>
								<th>#</th>
								<th>课程名称：</th>
								<th>关注时间：</th>
								<th>点击查看视频详情</th>
							</tr>
						</thead>
						<tr>
							<td>1</td>
							<td>The Shawshank Redemption</td>
							<td>1994</td>
							<td><a href=""><button>详情</button></a></td>
						</tr>
						<tr>
							<td>2</td>
							<td>The Shawshank Redemption</td>
							<td>1994</td>
							<td><a href=""><button>详情</button></a></td>
						</tr>
						<tr>
							<td>3</td>
							<td>The Shawshank Redemption</td>
							<td>1994</td>
							<td><a href=""><button>详情</button></a></td>
						</tr>
						<tr>
							<td>4</td>
							<td>The Shawshank Redemption</td>
							<td>1994</td>
							<td><a href=""><button>详情</button></a></td>
						</tr>
						<tr>
							<td>5</td>
							<td>The Shawshank Redemption</td>

							<td>1994</td>
							<td><a href=""><button>详情</button></a></td>
						</tr>
						<tr>
							<td>6</td>
							<td>The Shawshank Redemption</td>
							<td>1994</td>
							<td><a href=""><button>详情</button></a></td>
						</tr>
						<tr>
							<td>7</td>
							<td>The Shawshank Redemption</td>

							<td>1994</td>
							<td><a href=""><button>详情</button></a></td>
						</tr>
					</table>
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
