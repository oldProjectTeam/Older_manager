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
<link href="${APP_PATH}/static/css/admin.css" rel="stylesheet"
	type="text/css">
<link href="${APP_PATH}/static/css/amazeui.css" rel="stylesheet"
	type="text/css">

<link href="${APP_PATH}/static/css/personal.css" rel="stylesheet"
	type="text/css">
<link href="${APP_PATH}/static/css/stepstyle.css" rel="stylesheet"
	type="text/css">

<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery-1.7.2.min.js"></script>
<script src="${APP_PATH}/static/js/amazeui.js"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>
<script src="${APP_PATH}/static/js/jquery.min.js" type="text/javascript"></script>
<link
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src="${APP_PATH}/static/jQuery-MD5-master/jquery.md5.js"
	type="text/javascript"></script>
</head>
<body>
	<jsp:include page="../home/shopheader.jsp"></jsp:include>
	<div class="nav-table">
		<div class="long-title">
			<span class="all-goods">全部分类</span>
		</div>
		<div class="nav-cont">
			<ul>
				<li class="index"><a href="${APP_PATH}/shop/oldfronthome">首页</a></li>
			</ul>
		</div>
	</div>
	<b class="line"></b>
	<div class="center">
		<div class="col-main">
			<div class="main-wrap">

				<div class="am-cf am-padding">
					<div class="am-fl am-cf">
						<strong class="am-text-danger am-text-lg">修改密码</strong> / <small>Password</small>
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
					<div class="am-form-group">
						<label for="user-old-password" class="am-form-label">原密码</label>
						<div class="am-form-content">
							<input type="password" id="pass1" placeholder="请输入原登录密码">
						</div>
					</div>
					<div class="am-form-group">
						<label for="user-new-password" class="am-form-label">新密码</label>
						<div class="am-form-content">
							<input type="password" id="pass2" placeholder="由数字、字母组合">
						</div>
					</div>
					<div class="am-form-group">
						<label for="user-confirm-password" name="password"
							class="am-form-label">确认密码</label>
						<div class="am-form-content">
							<input type="password" id="pass3" placeholder="请再次输入上面的密码">
						</div>
					</div>
					<div class="" align="center">
						<!-- <div class="am-btn am-btn-danger">保存修改</div> -->
						<button type="button" class="btn btn-danger" id="saveid">保存修改</button>
					</div>
				</form>
			</div>
			<!--底部-->
			<jsp:include page="footer.jsp"></jsp:include>
		</div>
		<jsp:include page="left.jsp"></jsp:include>
	</div>
	<script type="text/javascript">
		$(function() {
			$("#saveid").attr("disabled", true);
		});
		$("#pass1").change(function() {
			//再次去查密码
			$.ajax({
				url : "${APP_PATH}/safety/selectuserbyid/" + '${users.id}',
				type : "GET",

				success : function(result) {
					var rel = result.extend.users;
					if ($.md5($("#pass1").val()) == rel.password) {
						$("#saveid").attr("disabled", false);
					} else {
						layer.msg("原密码不对");
						$("#saveid").attr("disabled", true);
					}
				}
			});

		});
		//点击保存
		$("#saveid").click(
				function() {
					var value = 0;
					var time = 10;
					//进度条复位函数

					if ($("#pass2").val() != $("#pass3").val()) {
						layer.msg("新密码不一致");
					} else {

						function reset() {
							value = 0;
							$("#prog").removeClass("progress-bar-success").css(
									"width", "0%").text("等待启动");
							//setTimeout(increment,5000);
						}
						//百分数增加，0-30时为红色，30-60为黄色，60-90为蓝色，>90为绿色
						function increment() {
							value += 1;
							$("#prog").css("width", value + "%").text(
									value + "%");
							if (value >= 0 && value <= 30) {
								$("#prog").addClass("progress-bar-danger");
							} else if (value >= 30 && value <= 60) {
								$("#prog").removeClass("progress-bar-danger");
								$("#prog").addClass("progress-bar-warning");
							} else if (value >= 60 && value <= 90) {
								$("#prog").removeClass("progress-bar-warning");
								$("#prog").addClass("progress-bar-info");
							} else if (value >= 90 && value < 100) {
								$("#prog").removeClass("progress-bar-info");
								$("#prog").addClass("progress-bar-success");
							} else {
								setTimeout(reset, 1000);
								return;

							}

							st = setTimeout(increment, time);
						}

						increment();

						$.ajax({
							url : "${APP_PATH}/safety/upateusers/"
									+ ${users.id} + "&"
									+ $.md5($("#pass3").val()),
							type : "POST",
							success : function(result) {
								if (result.code == 100) {
									value = 100;
									layer.msg("保存成功！");
									$("#formid")[0].reset();
								}
								$("#saveid").attr("disabled", true);
							}
						});

					}
				});
	</script>


</body>

</html>