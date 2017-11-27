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

<title>设置安全问题</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="${APP_PATH}/static/css/admin.css" rel="stylesheet"
	type="text/css">
<link href="${APP_PATH}/static/css/amazeui.css" rel="stylesheet"
	type="text/css">

<link href="${APP_PATH}/static/css/personal.css" rel="stylesheet"
	type="text/css">
<link href="${APP_PATH}/static/css/stepstyle.css" rel="stylesheet"
	type="text/css">

<script src="${APP_PATH}/static/js/jquery.min.js" type="text/javascript"></script>
<script src="${APP_PATH}/static/js/amazeui.js" type="text/javascript"></script>
<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery-1.7.2.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>
<link
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>

<body>
	<jsp:include page="../home/shopheader.jsp"></jsp:include>
	<div class="nav-table">
		<div class="long-title">
			<span class="all-goods">全部分类</span>
		</div>
		<div class="nav-cont">
			<ul>
				<li class="index"><a href="#">首页</a></li>
				<li class="qc"><a href="#">闪购</a></li>
				<li class="qc"><a href="#">限时抢</a></li>
				<li class="qc"><a href="#">团购</a></li>
				<li class="qc last"><a href="#">大包装</a></li>
			</ul>
			<div class="nav-extra">
				<i class="am-icon-user-secret am-icon-md nav-user"></i><b></b>我的福利 <i
					class="am-icon-angle-right" style="padding-left: 10px;"></i>
			</div>
		</div>
	</div>
	<b class="line"></b>
	<div class="center">
		<div class="col-main">
			<div class="main-wrap">

				<div class="am-cf am-padding">
					<div class="am-fl am-cf">
						<strong class="am-text-danger am-text-lg">设置安全问题</strong> / <small>Set&nbsp;Safety&nbsp;Question</small>
					</div>
				</div>

				<div align="center">
					<div class="progress" style="width:100%;height:2px;">
						<div class="progress-bar" id="prog" role="progressbar"
							aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
							style="width: 0%;">
							<span class="sr-only" id="proglabel">40% 完成</span>
						</div>
					</div>
				</div>
				<div class="m-progress"></div>
				<form class="am-form am-form-horizontal" id="formid">
					<div class="am-form-group select">
						<label for="user-question1" class="am-form-label">问题一</label>
						<div class="am-form-content">
							<select name="questionone" id="qu1">
								<option value="a" selected>请选择安全问题</option>
								<option value="您最喜欢的颜色是什么？">您最喜欢的颜色是什么？</option>
								<option value="您的故乡在哪里？">您的故乡在哪里？</option>
							</select>
						</div>
					</div>
					<div class="am-form-group">
						<label for="user-answer1" class="am-form-label">答案</label>
						<div class="am-form-content">
							<input type="text" id="user-answer1" name="answerone"
								placeholder="请输入安全问题答案">
						</div>
					</div>
					<div class="am-form-group select">
						<label for="user-question2" class="am-form-label">问题二</label>
						<div class="am-form-content">
							<select name="questiontwo" id="qu2">
								<option value="a" selected>请选择安全问题</option>
								<option value="您最喜欢的颜色是什么？">您最喜欢的颜色是什么？</option>
								<option value="您的故乡在哪里？">您的故乡在哪里？</option>
							</select>
						</div>
					</div>
					<div class="am-form-group">
						<label for="user-answer2" class="am-form-label">答案</label>
						<div class="am-form-content">
							<input type="text" id="user-answer2" name="answertwo"
								placeholder="请输入安全问题答案">
						</div>
					</div>
					<INPUT type="hidden" name="userid" value="${users.id}">
					<div class="info-btn">
						<div class="am-btn am-btn-danger" id="saveid">保存修改</div>
					</div>
				</form>
			</div>
			<!--底部-->
			<jsp:include page="footer.jsp"></jsp:include>
		</div>
		<jsp:include page="left.jsp"></jsp:include>
	</div>
	<SCRIPT type="text/javascript">
		$("#saveid").click(
				function() {

					if ($("#qu1").val() != 'a') {
						if ($("#qu2").val() != 'a') {
							var kk = /^[\u4E00-\u9FA5A-Za-z0-9]/;
							if ($("#user-answer1").val() != ""
									&& kk.test($("#user-answer1").val())) {

								if ($("#user-answer2").val() != ""
										&& kk.test($("#user-answer2").val())) {
									var value = 0;
									var time = 10;
									//进度条复位函数
									function reset() {
										value = 0;
										$("#prog").removeClass(
												"progress-bar-success").css(
												"width", "0%").text("等待启动");
										//setTimeout(increment,5000);
									}
									//百分数增加，0-30时为红色，30-60为黄色，60-90为蓝色，>90为绿色
									function increment() {
										value += 1;
										$("#prog").css("width", value + "%")
												.text(value + "%");
										if (value >= 0 && value <= 30) {
											$("#prog").addClass(
													"progress-bar-danger");
										} else if (value >= 30 && value <= 60) {
											$("#prog").removeClass(
													"progress-bar-danger");
											$("#prog").addClass(
													"progress-bar-warning");
										} else if (value >= 60 && value <= 90) {
											$("#prog").removeClass(
													"progress-bar-warning");
											$("#prog").addClass(
													"progress-bar-info");
										} else if (value >= 90 && value < 100) {
											$("#prog").removeClass(
													"progress-bar-info");
											$("#prog").addClass(
													"progress-bar-success");
										} else {
											setTimeout(reset, 1000);
											return;

										}

										st = setTimeout(increment, time);
									}

									increment();

									$.ajax({
										url : "safety/addquestionandanswer",
										type : "POST",
										data : $("#formid").serialize(),
										success : function(result) {
											if (result.code == 100) {
												value = 100;
												layer.msg("保存成功");
												$("#formid")[0].reset();
											}
										}
									});
								} else {
									layer.msg("请填写正确的答案二");
								}
							} else {
								layer.msg("请填写正确的答案一");

							}

						} else {
							layer.msg("请选择问题二");

						}

					} else {
						layer.msg("请选择问题一");
					}

				});
	</SCRIPT>
</body>

</html>