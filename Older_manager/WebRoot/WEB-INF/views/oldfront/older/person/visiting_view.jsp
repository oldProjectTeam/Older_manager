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

<title>就诊记录详情</title>

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
	<!--头部导航  -->
    <jsp:include page="head.jsp"></jsp:include>
	<div class="below-slideshow">
		<div class="container">
			<div class="row">
				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
					<div class="txt-block">
						<h1 class="head-line">就诊记录详情查看</h1>
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
			<h3>&nbsp; &nbsp; 欢迎您查看就诊记录详情：</h3>
			<hr />
			<div class="ziliao">
				<div class="ziliao1">
					<p style="color: #000000;">
						<span>用户名：</span>罗先生
					</p>
					<p style="color: #000000;">
						<span>就诊医院：</span>女
					</p>
					<p style="color: #000000;">
						<span>就诊时间：</span>45岁
					</p>
				</div>
				<hr />
				<div class="ziliao2">
					<p style="color: #000000;">
						<span>就诊科室：</span>罗先生
					</p>
					<p style="color: #000000;">
						<span>医生姓名：</span>女
					</p>
					<p style="color: #000000;">
						<span>复诊时间：</span>45岁
					</p>
				</div>
				<hr />
				<div class="ziliao3">

					<p style="color: #000000;">
						<span>主诉内容：</span>
					</p>
					<div class="text1">
						<textarea readonly="readonly">
运动神经元症(渐冻人症)、癌症、艾滋病、白血病、类风湿
    				    </textarea>
					</div>
					<p style="color: #000000;">
						<span>体格检查内容：</span>
					</p>
					<div class="text1">
						<textarea readonly="readonly">
运动神经元症(渐冻人症)、癌症、艾滋病、白血病、类风湿
    				    </textarea>
					</div>
					<p style="color: #000000;">
						<span>辅助检查：</span>
					</p>
					<div class="text1">
						<textarea readonly="readonly">
运动神经元症(渐冻人症)、癌症、艾滋病、白血病、类风湿
    				    </textarea>
					</div>
					<p style="color: #000000;">
						<span>实际检查内容：</span>
					</p>
					<div class="text1">
						<textarea readonly="readonly">
运动神经元症(渐冻人症)、癌症、艾滋病、白血病、类风湿
    				    </textarea>
					</div>
					<p>
						<span>正常使用药物：</span>
					</p>
					<div class="text1">
						<textarea readonly="readonly">
运动神经元症(渐冻人症)、癌症、艾滋病、白血病、类风湿
    				    </textarea>
					</div>
					<p style="color: #000000;">
						<span>本次诊断结果：</span>
					</p>
					<div class="text1">
						<textarea readonly="readonly">
运动神经元症(渐冻人症)、癌症、艾滋病、白血病、类风湿
    				    </textarea>
					</div>
					<p style="color: #000000;">
						<span>治疗处方和保健处方：</span>
					</p>
					<div class="text1">
						<textarea readonly="readonly">
运动神经元症(渐冻人症)、癌症、艾滋病、白血病、类风湿
    				    </textarea>
					</div>
					<p style="color: #000000;">
						<span>相关禁忌事项：</span>
					</p>
					<div class="text1">
						<textarea readonly="readonly">
运动神经元症(渐冻人症)、癌症、艾滋病、白血病、类风湿
    				    </textarea>
					</div>
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
