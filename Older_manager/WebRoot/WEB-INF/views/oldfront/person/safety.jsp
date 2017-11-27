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

<title>安全设置</title>

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
<link href="${APP_PATH}/static/css/infstyle.css" rel="stylesheet"
	type="text/css">
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>
<script src="${APP_PATH}/static/js/jquery.min.js" type="text/javascript"></script>

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
			</ul>
		</div>
	</div>
	<b class="line"></b>
	<div class="center">
		<div class="col-main">
			<div class="main-wrap">
				<!--标题 -->
				<div class="user-safety">
					<div class="am-cf am-padding">
						<div class="am-fl am-cf">
							<strong class="am-text-danger am-text-lg">账户安全</strong> / <small>Set&nbsp;up&nbsp;Safety</small>
						</div>
					</div>
					<hr />
					<!--头像 -->
					<div class="user-infoPic">

						<div class="filePic">
							<input type="file" class="inputPic"
								allowexts="gif,jpeg,jpg,png,bmp" accept="image/*"> <img
								class="am-circle am-img-thumbnail"
								src="${APP_PATH}/static/images/getAvatar.do.jpg" alt="" />
						</div>

						<p class="am-form-help">头像</p>

						<div class="info-m">
							<div>
								<b>用户名：<i id="usernameid" class="form-control-static"></i></b>
							</div>
							<div class="u-level">
								<span class="rank r2"> <s class="vip1"></s><a
									class="classes" href="javascript:#" id="mvpid"></a>
								</span>
							</div>
							<div class="u-safety">
								<a href="${APP_PATH}/safety/skipsafety"> 账户安全 <span class="u-profile"><i
										class="bc_ee0000" style="width: 60px;" width="0" id="numid">60分</i></span>
								</a>
							</div>
						</div>
					</div>

					<div class="check">
						<ul>
							<li><i class="i-safety-lock"></i>
								<div class="m-left">
									<div class="fore1">登录密码</div>
									<div class="fore2">
										<small>为保证您购物安全，建议您定期更改密码以保护账户安全。</small>
									</div>
								</div>
								<div class="fore3">
									<a href="${APP_PATH}/safety/skippassword">
										<div class="am-btn am-btn-secondary">修改</div>
									</a>
								</div></li>
							<li><i class="i-safety-wallet"></i>
								<div class="m-left">
									<div class="fore1">支付密码</div>
									<div class="fore2">
										<small>启用支付密码功能，为您资产账户安全加把锁。</small>
									</div>
								</div>
								<div class="fore3">
									<a href="${APP_PATH}/shop/setpay">
										<div class="am-btn am-btn-secondary">立即启用</div>
									</a>
								</div></li>
							<li><i class="i-safety-iphone"></i>
								<div class="m-left">
									<div class="fore1">手机验证</div>
									<div class="fore2">
										<small>您验证的手机：186XXXXXXXX 若已丢失或停用，请立即更换</small>
									</div>
								</div>
								<div class="fore3">
									<a href="${APP_PATH}/shop/bindphone">
										<div class="am-btn am-btn-secondary">换绑</div>
									</a>
								</div></li>
							<li><i class="i-safety-mail"></i>
								<div class="m-left">
									<div class="fore1">邮箱验证</div>
									<div class="fore2">
										<small>您验证的邮箱：5831XXX@qq.com 可用于快速找回登录密码</small>
									</div>
								</div>
								<div class="fore3">
									<a href="${APP_PATH}/shop/email">
										<div class="am-btn am-btn-secondary">换绑</div>
									</a>
								</div></li>
							<li><i class="i-safety-idcard"></i>
								<div class="m-left">
									<div class="fore1">实名认证</div>
									<div class="fore2">
										<small>用于提升账号的安全性和信任级别，认证后不能修改认证信息。</small>
									</div>
								</div>
								<div class="fore3">
									<a href="${APP_PATH}/shop/idcard">
										<div class="am-btn am-btn-secondary">认证</div>
									</a>
								</div></li>
							<li><i class="i-safety-security"></i>
								<div class="m-left">
									<div class="fore1">安全问题</div>
									<div class="fore2">
										<small>保护账户安全，验证您身份的工具之一。</small>
									</div>
								</div>
								<div class="fore3">
									<a href="${APP_PATH}/safety/skipquestion">
										<div class="am-btn am-btn-secondary">认证</div>
									</a>
								</div></li>
						</ul>
					</div>
				</div>
			</div>
			<!--底部-->
			<jsp:include page="footer.jsp"></jsp:include>
		</div>
		<jsp:include page="left.jsp"></jsp:include>
	</div>
	<script type="text/javascript">
		$(function() {
			//发送请求获取
			$.ajax({
				url : "${APP_PATH}/info/selectinformation/" + '${users.id}',
				type : "GET",

				success : function(result) {

					var rel = result.extend.shop;
					$("#usernameid").text(rel.users.nickname);
					$("#mvpid").text(rel.level);
					/* 	$("#ncikid").val(rel.users.nickname);
					$("#truenameid").val(rel.users.realname);
					$("#user-phone").val(rel.users.phone);
					$("#user-email").val(rel.users.email);
					$("#idcarid").val(rel.users.idcard);
					   $("#formid input[name=sex]").val([rel.users.sex]);
					   var a=rel.shippingaddress.location+" "+rel.shippingaddress.detailaddress;
					   //alert(a);
					   $("#addressid").text(a); */
				}
			});

		});
	</script>
</body>

</html>