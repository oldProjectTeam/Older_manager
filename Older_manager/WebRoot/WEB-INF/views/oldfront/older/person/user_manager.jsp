<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>老人管理平台-用户自助中心</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="${APP_PATH}/static/oldfront/older/css/easyui.css"
	rel="stylesheet" type="text/css">
<link href="${APP_PATH}/static/oldfront/older/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${APP_PATH}/static/oldfront/older/css/layout.css"
	rel="stylesheet">
<link href="${APP_PATH}/static/oldfront/older/css/default.css"
	rel="stylesheet">
<link href="${APP_PATH}/static/oldfront/older/css/icon.css"
	rel="stylesheet">

<script src="${APP_PATH}/static/oldfront/older/js/jquery.js"></script>
<script src="${APP_PATH}/static/oldfront/older/js/json2.js"></script>
<script src="${APP_PATH}/static/oldfront/older/js/jquery.cookie.js"></script>
<script src="${APP_PATH}/static/oldfront/older/js/jquery.easyui.js"></script>
<script src="${APP_PATH}/static/oldfront/older/js/easyui-lang-zh_CN.js"></script>
<script src="${APP_PATH}/static/oldfront/older/js/KingonUI.js"></script>
<script src="${APP_PATH}/static/jQuery-MD5-master/jquery.md5.js"
	type="text/javascript"></script>
<script
	src="${APP_PATH}/lib/jquery.validation/1.14.0/validate-methods.js"></script>
<script
	src="${APP_PATH}/lib/jquery.validation/1.14.0/jquery.validate.js"></script>
</head>

<style>
.error {
	color: red;
}
</style>
<body style="overflow:auto;" class="layout panel-noscroll">
	<!--头部开始  -->
	<jsp:include page="header.jsp"></jsp:include>
	<!-- 主体部分开始 -->
	<div style="padding:111px 0 0;margin-bottom:15px;">
		<div class="container">
			<div class="row">
				<!-- 左侧导航菜单开始 -->
				<jsp:include page="left.jsp"></jsp:include>
				<!-- 左侧导航菜单结束 -->

				<!-- 右侧内容区开始 -->
				<div class="col-md-9" style="background:#fff;min-height:647px;">

					<div class="main">
						<!-- 个人中心数据开始 -->
						<div class="jksj">
							<div class="xy-title">
								个人中心
								<button type="button" onclick="javascript:history.go(-1);"
									class="btn back fr" id="btnclose">返回</button>
							</div>
							<div>
								<div class="row">
									<div id="show_panel" style="text-align: center;">
										<form id="account_form">
											<table
												class="table table-striped table-bordered table-hover text-center yyjl-table"
												style="width:500px;margin: 0 auto;">
												<tbody align="right" type="hidd">
													<tr height="60px" class="firstRow">
														<input type="hidden" value="${oldmanaccount.id}" name="id"
															id="id">
														<input type="hidden" value="${oldmanaccount.oldmanId}"
															name="oldmanId" id="oldmanId">
														<th align="right" width="100px" for="account"
															style="vertical-align: middle;">登录号码:</th>
														<td align="left" style="vertical-align: middle;">
														${oldmanaccount.account}
														</td>
													</tr>
													<tr height="60px">
														<th align="right" width="100px" for="orgin_password"
															style="vertical-align: middle;"><span
															style="color:red;">* </span>原密码:</th>
														<td align="left" style="vertical-align: middle;"><input
															style="height:30px;" type="password" name="orginPassword"
															id="orginPassword"></td>
													</tr>
													<tr height="60px">
														<th align="right" width="100px" for="password"
															style="vertical-align: middle;"><span
															style="color:red;">* </span>新密码:</th>
														<td align="left" style="vertical-align: middle;"><input
															style="height:30px;" type="password" name="password"
															id="password"><span
															style="color:grey;padding-left:50px;">空 表示不修改密码</span></td>
													</tr>
													<tr height="60px">
														<th align="right" width="70px" for="password2"
															style="vertical-align: middle;"><span
															style="color:red;">* </span>密码确认:</th>
														<td align="left" style="vertical-align: middle;"><input
															style="height:30px;" type="password" name="password2"
															id="password2"></td>
													</tr>
												</tbody>
											</table>
										</form>
									</div>
									<div class="form-group"
										style="overflow:hidden;margin-top:20px;">
										<div class=" col-xs-6">
											<button type="button" class="btn btn-success "
												style="padding-left:20px;padding-right:20px;margin-left:360px;"
												id="save">保 存</button>
										</div>
									</div>
								</div>
							</div>

						</div>
					</div>
				</div>
				<!-- 右侧内容区结束 -->
			</div>
		</div>
	</div>
	<!--底部开始  -->
	<jsp:include page="footer.jsp"></jsp:include>
	<!-- 底部结束 -->
	<script src="${APP_PATH}/static/oldfront/older/js/bootstrap.js"></script>
	<script src="${APP_PATH}/static/oldfront/older/js/bootstrap.min.js"></script>
	<script src="${APP_PATH}/static/oldfront/older/js/TableJS.js"
		type="text/javascript"></script>
	<script src="${APP_PATH}/static/oldfront/older/js/md5.js"></script>
	<script type="text/javascript">
		function Login_Out() {
			if (confirm('您确定要退出本次登录吗?')) {
				window.location.href = "oldmanaccount/loginOut";
			}
		};

		$("#save").click(function() {
			if (validateForm().form() && validatorPassword()) {
				$.ajax({
					url : "${APP_PATH}/PersonalCenter/updateOldmanAcount",
					type : "post",
					data : $("#account_form").serialize(),
					success : function(result) {
						if (result.code == 100) {

							layer.msg("修改账户成功！", {
								icon : 6,
								time : 1000,
								offset : [ '35%' ]
							});
							$("#account_form")[0].reset();

						} else {
							layer.open({
								offset:['30%'],
								title : '添加提示',
								content : '添加用户会员失败！'
							});
						}
					}
				});
			}
		});

		function validatorPassword() {
			if ($.md5($("#orginPassword").val()) == "${oldmanaccount.password}") {
				$("#orginPassword").val("");
				return true;
			} else {
				layer.open({
					offset:['30%'],
					title : '密码提示',
					content : '你输入的原密码错误'
				});
				return false;
			}
		};
		function validateForm() {
			return $("#account_form").validate({
				debug : true, //调试模式取消submit的默认提交功能   
				//errorClass: "label.error", //默认为错误的样式类为：error   
				onfocusout : true,
				onkeyup : false,
				rules : {
					orginPassword : {
						required : true,
					},
					password : {
						required : true,
						isPwd : true
					},
					password2 : {
						required : true,
						equalTo : "#password"
					}

				},
				messages : {
					orginPassword : {
						required : "必填"
					},
					password : {
						required : "必填",
						isPwd : "以字母开头，长度在6-30之间，只能包含字符、数字和下划线"
					},
					password2 : {
						required : "必填",
						equalTo : "两次输入密码不相同!",
					}
				}
			});
		};
	</script>
</body>
</html>
