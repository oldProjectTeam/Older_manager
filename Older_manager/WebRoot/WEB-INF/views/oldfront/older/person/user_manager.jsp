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
</head>
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
										<table
											class="table table-striped table-bordered table-hover text-center yyjl-table"
											style="width:500px;margin: 0 auto;">
											<tbody align="right">
												<tr height="60px" class="firstRow">
													<th align="right" width="100px"
														style="vertical-align: middle;"><span
														style="color:red;">* </span>登录号码:</th>
													<td align="left" style="vertical-align: middle;"><input
														style="height:30px;" type="text" name="h_LoginName"
														id="h_LoginName" onchange="check(value)"><span
														style="color:red;padding-left:20px;" id="sp_msg"></span></td>
												</tr>
												<tr height="60px">
													<th align="right" width="100px"
														style="vertical-align: middle;"><span
														style="color:red;">* </span>原密码:</th>
													<td align="left" style="vertical-align: middle;"><input
														style="height:30px;" type="password" name="h_LoginPass"
														id="h_LoginPass"></td>
												</tr>
												<tr height="60px">
													<th align="right" width="100px"
														style="vertical-align: middle;"><span
														style="color:red;">* </span>新密码:</th>
													<td align="left" style="vertical-align: middle;"><input
														style="height:30px;" type="password" name="h_LoginPass1"
														id="h_LoginPass1"><span
														style="color:grey;padding-left:50px;">空 表示不修改密码</span></td>
												</tr>
												<tr height="60px">
													<th align="right" width="70px"
														style="vertical-align: middle;"><span
														style="color:red;">* </span>密码确认:</th>
													<td align="left" style="vertical-align: middle;"><input
														style="height:30px;" type="password" name="h_LoginPass2"
														id="h_LoginPass2"></td>
												</tr>
											</tbody>
										</table>
									</div>
									<div class="form-group"
										style="overflow:hidden;margin-top:20px;">
										<div class=" col-xs-6">
											<button type="submit" class="btn btn-success "
												style="padding-left:20px;padding-right:20px;margin-left:360px;"
												onclick="setUser()">保 存</button>
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
				location.href = '/index.html';
			}
		};
	</script>
</body>
</html>
