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

<title>健康评估报告</title>

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
	href="${APP_PATH}/static/oldfront/css/healthreport.css" />
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
						<h1 class="head-line">健康评估报告</h1>
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
			<h3>&nbsp; &nbsp; 欢迎查看您的健康评估报告：</h3>
			<hr />
			<div class="ziliao">
				<div class="ziliao1">
					<p style="color: #000000;">
						<span>用户名：</span>罗先生
					</p>
					<p style="color: #000000;">
						<span>医生姓名：</span>女
					</p>
					<p style="color: #000000;">
						<span>老人id：</span>45岁
					</p>
					<p style="color: #000000;">
						<span>健康状况：</span>45岁
					</p>
				</div>
				<hr />
				<div class="ziliao2">
					<p style="color: #000000;">
						<span>健康数据评估：</span>
					</p>
					<div class="text1">
						<textarea readonly="readonly">
   (1）、从个人信息来看，您目前肥胖，而且有高血压、糖尿病、脑卒中的家族史；  
     （2）、从生活方式与环境危险因素来看，您的饮食结构不合理，尤其是高脂肪、高盐、低膳食纤维饮食比较突出，而且长期运动量不足，还存在着吸烟、饮酒过量、等不良生活习惯，这些都是引发高脂血症疾病的外因；  
     （3）、从遗传分析结果来看，您患高脂血症的遗传风险主要由ApoA5、RBP4和ICAM1的基因突变引起，其中ICAM1的遗传风险在高血压患者中尤其显著，RBP4的遗传风险在糖尿病患者中尤其显著，由于您已患高血压，目前尚未患糖尿病，因此我们建议您，积极治疗高血压，有效控制血糖、血脂，严格按照健康管理师为您指定的干预方案进行管理； 
     （4）、你本次体检体质指数28，属于肥胖，血压是160/,100mmHg，处于高血压二级，空腹血糖8.0，餐后血糖10.6 mmol/l，糖化血红蛋白7.2%，血脂异常，处于代谢综合征。 
    				    </textarea>
					</div>
				</div>
				<hr />
				<div class="ziliao3">
					<p style="color: #000000;">
						<span>医生建议：</span>
					</p>
					<div class="text1">
						<textarea readonly="readonly">
           鉴于以上情况，您的健康管理师为您制定了一套非常适合您的《个性化健康改善方案》和《动态监测方案》，希望您在健康管理师的指导下，通过积极的药物治疗、培养健康的生活方式、降低危险因素，预防高风险疾病及已患疾病并发症，使您获得健康的、高品质的生活，拥有幸福、美好的人生。
    				    </textarea>
					</div>
				</div>
				<hr />
				<div class="ziliao2">
					<p style="color: #000000;">
						<span>报告图片：</span>罗先生
					</p>
					<div class="text1">
						<img src="${APP_PATH}/static/oldfront/assets/img/par.jpg" /> 
						<img src="${APP_PATH}/static/oldfront/assets/img/par.jpg" />
						<img src="${APP_PATH}/static/oldfront/assets/img/par.jpg" />
						<hr />
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
