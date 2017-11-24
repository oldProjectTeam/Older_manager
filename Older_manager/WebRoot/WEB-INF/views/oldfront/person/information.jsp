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

<title>个人信息</title>

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
<script src="${APP_PATH}/static/js/jquery.min.js" type="text/javascript"></script>
<script src="${APP_PATH}/static/js/amazeui.js" type="text/javascript"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>

<link
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<style type="text/css">
a {
	text-decoration: none;
}
</style>
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

				<div class="user-info">
					<!--标题 -->
					<div class="am-cf am-padding">
						<div class="am-fl am-cf">
							<strong class="am-text-danger am-text-lg">个人资料</strong> / <small>Personal&nbsp;information</small>
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
									class="classes" href="#" id="mvpid"></a>
								</span>
							</div>
							<div class="u-safety">
								<a href="safety.html"> 账户安全 <span class="u-profile"><i
										class="bc_ee0000" style="width: 60px;" width="0" id="numid">60分</i></span>
								</a>
							</div>
						</div>
					</div>

					<!--个人信息 -->
					<div class="info-main">
						<form class="am-form am-form-horizontal" id="formid">

							<div class="am-form-group">
								<label for="user-name2" class="am-form-label">昵称</label>
								<div class="am-form-content">
									<input type="text" id="ncikid" required="true"
										placeholder="nickname" name="nickname">

								</div>
							</div>

							<div class="am-form-group">
								<label for="user-name" class="am-form-label">姓名</label>
								<div class="am-form-content">
									<input type="text" id="truenameid" required="true"
										placeholder="name" name="realname">

								</div>
							</div>

							<div class="am-form-group">
								<label class="am-form-label">性别</label>
								<div class="am-form-content sex">
									<label class="am-radio-inline"> <input type="radio"
										name="sex" value="男" checked="checked" data-am-ucheck>
										男
									</label> <label class="am-radio-inline"> <input type="radio"
										name="sex" value="女" data-am-ucheck> 女
									</label> <label class="am-radio-inline"> <input type="radio"
										name="sex" value="保密" data-am-ucheck> 保密
									</label>
								</div>
							</div>

							<div class="am-form-group">
								<label for="user-birth" class="am-form-label">身份证</label>
								<div class="am-form-content birth">
									<input type="text" id="idcarid" required="true" name="idcard"
										placeholder="身份证">
								</div>

							</div>
							<div class="am-form-group">
								<label for="user-phone" class="am-form-label">电话</label>
								<div class="am-form-content">
									<input id="user-phone" name="phone" required="true"
										placeholder="telephonenumber" type="tel">

								</div>
							</div>
							<div class="am-form-group">
								<label for="user-email" class="am-form-label">电子邮件</label>
								<div class="am-form-content">
									<input id="user-email" name="email" required="true"
										placeholder="Email" type="email">

								</div>
							</div>

							<div class="am-form-group">
								<label for="user-email" class="am-form-label">收货地址</label>
								<div class="am-form-content">
									<a
										href="${APP_PATH}/address/selectallshoppingaddress/${users.id}"
										class="am-form-label" id="addressid"> </a>
								</div>
							</div>

							<div class="am-form-group ">
								<label for="user-safety" class="am-form-label">账号安全</label>
								<div class="am-form-content safety">
									<a href="${APP_PATH}/safety/skipsafety" class="am-form-label">
										> </a>

								</div>
							</div>
							<div class="" align="center">
								<button type="button" class="btn btn-danger" id="saveinfo">保存修改</button>
							</div>

						</form>
					</div>

				</div>

			</div>
			<!--底部-->
			<div class="footer">
				<div class="footer-hd">
					<p>
						<a href="#">恒望科技</a> <b>|</b> <a href="#">商城首页</a> <b>|</b> <a
							href="#">支付宝</a> <b>|</b> <a href="#">物流</a>
					</p>
				</div>
				<div class="footer-bd">
					<p>
						<a href="#">关于恒望</a> <a href="#">合作伙伴</a> <a href="#">联系我们</a> <a
							href="#">网站地图</a> <em>© 2015-2025 Hengwang.com 版权所有</em>
					</p>
				</div>
			</div>
		</div>

		<jsp:include page="left.jsp"></jsp:include>
	</div>

	<script type="text/javascript">
		$(function() {
			//发送请求获取
			$.ajax({
				url : "${APP_PATH}/info/selectinformation",
				data : {
					"usersid" : ${users.id}
				},
				type : "GET",
				success : function(result) {
					var rel = result.extend.shopInfo;
					$("#usernameid").text(rel.users.account);
					$("#mvpid").text(rel.level);
					$("#ncikid").val(rel.users.nickname);
					$("#truenameid").val(rel.users.realname);
					$("#user-phone").val(rel.users.phone);
					$("#user-email").val(rel.users.email);
					$("#idcarid").val(rel.users.idcard);
					$("#formid input[name=sex]").val([ rel.users.sex ]);
					var a = rel.shippingaddress.location + " "
							+ rel.shippingaddress.detailaddress;
					if (a == null || a == '' || a.length < 4) {
						$("#addressid").text("去设置默认地址");
					} else {
						$("#addressid").text(a);
					}

				}
			});

		});

		$("#saveinfo").click(function() {
			var idcar = /^\d{15}|\d{18}$/;
			if (!idcar.test($("#idcarid").val())) {
				layer.msg("身份证不符合！");
			} else {
				//${users.id}
				$.ajax({
					url : "${APP_PATH}/info/updateinformation/" + ${users.id},
					type : "POST",
					data : $("#formid").serialize(),
					success : function(result) {
						if (result.code == 100) {
							layer.msg("保存成功！");
						}

					}
				});
			}

		});
	</script>
</body>

</html>