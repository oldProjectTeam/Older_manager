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

<title>个人资料修改</title>

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
	href="${APP_PATH}/static/oldfront/css/oldmanmodify.css" />	
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
						<h1 class="head-line">个人资料修改</h1>
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
			<h3>&nbsp; &nbsp; 资料修改：</h3>
			<hr />
			<div class="ziliao">
				<table style="border-collapse:separate; border-spacing:0px 20px;">
					<tr>
						<td style="color: #000000;">头像：</td>
						<td><img src="${APP_PATH}/static/oldfront/img/Tulips.jpg" alt="头像" /></td>
						<td><button>点击上传图片</button></td>
					</tr>
					<tr>
						<td style="color: #000000;">用户名：</td>
						<td><input type="text" value="罗先生" /></td>
						<td></td>
						<td></td>
						<td></td>
					</tr>
					<tr>
						<td style="color: #000000;">性别：</td>
						<td><input type="text" value="女" /></td>
						<td></td>
						<td>年龄：</td>
						<td><input type="text" value="10岁" /></td>
					</tr>
					<tr>
						<td>联系手机号：</td>
						<td><input type="text" value="女" /></td>
						<td></td>
						<td>民族：</td>
						<td><input type="text" value="10岁" /></td>
					</tr>
					<tr>
						<td>婚姻状况：</td>
						<td><input type="text" value="女" /></td>
						<td></td>
						<td>出生日期：</td>
						<td><input type="text" value="10岁" /></td>
					</tr>
					<tr>
						<td>紧急联系人：</td>
						<td><input type="text" value="女" /></td>
						<td></td>
						<td>紧急联系电话：</td>
						<td><input type="text" value="10岁" /></td>
					</tr>
					<tr>
						<td>家庭地址：</td>
						<td><input type="text" value="女" /></td>
						<td></td>
						<td>社保号：</td>
						<td><input type="text" value="10岁" /></td>
					</tr>
					<tr>
						<td>专业：</td>
						<td><input type="text" value="女" /></td>
						<td></td>
						<td>职称：</td>
						<td><input type="text" value="10岁" /></td>
					</tr>
					<tr>
						<td>原单位：</td>
						<td><input type="text" value="女" /></td>
						<td></td>
						<td></td>
						<td><button>提交</button></td>
					</tr>
				</table>
			</div>
		</div>
		<div class="clear"></div>
	</div>
	<hr />
	<br />
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
</html>
