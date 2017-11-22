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

					<div class="main"
						style="text-align: center; padding:0 20px 20px 20px;">
						<div class="gllr-title">
							<div style="float:left">个人资料</div>
							<button type="button" class="btn back fr" id="btnclose">返回</button>
						</div>
						<div id="show_panel" style="text-align: center;width:100%">
							<table
								class="table table-striped table-bordered table-hover text-center yyjl-table;"
								style="width:90%;margin: 0 auto;">
								<tbody align="right">
									<tr class="firstRow">
										<th width="15%" height="50px"
											style="text-align:right;vertical-align: middle;"><span
											style="color:red;">* </span>姓名:</th>
										<td width="35%" align="left" style="vertical-align: middle;">
											<input style="height: 30px;padding-left:10px" type="text"
											name="h_DoctorName" id="h_DoctorName">
										</td>
										<th width="15%" height="50px" rowspan="3"
											style="text-align:right;vertical-align: middle;"><span
											style="color:red;">* </span>头像:</th>
										<td width="35%" align="center" rowspan="3"
											style="vertical-align: middle;"><input type="hidden"
											id="h_YPhoto" name="h_YPhoto" value="">
										<div id="h_YPhoto_div"></div>
											<input class="" filetype="*.jpg;*.png;*.gif" filenumber="1"
											filewidth="120" fileheight="120" type="text"
											name="h_YPhoto_text" id="h_YPhoto_text"
											style="display: none;"><input type="button"
											style="border-left:none;margin:0;" value="更换头像"></td>
									</tr>
									<tr>
										<th height="50px"
											style="text-align:right;vertical-align: middle;">生活状态:</th>
										<td align="left" style="vertical-align: middle;"><select
											style="width:157px;height: 30px;padding-left:10px;">
												<option>请选择</option>
												<option>低保老人</option>
												<option>独居老人</option>
												<option>三无老人</option>
												<option>孤寡老人</option>
										</select></td>
									</tr>
									<tr>
										<th height="50px"
											style="text-align:right;vertical-align: middle;">婚姻状况:</th>
										<td align="left" style="vertical-align: middle;"><select
											style="width:157px;height: 30px;padding-left:10px;">
												<option>请选择</option>
												<option>已婚</option>
												<option>未婚</option>
												<option>离异</option>
												<option>丧偶</option>
												<option>再婚</option>
										</select></td>
									</tr>
									<tr>
										<th height="15%"
											style="text-align:right;vertical-align: middle;"><span
											style="color:red;">* </span> 出生日期:</th>
										<td align="left" width="35%"><input
											class="easyui-datebox datebox-f combo-f textbox-f"
											editable="false" id="h_kaishi" style="height: 30px;">
										</td>
										<th width="15%"
											style="text-align:right;vertical-align: middle;">经济来源:</th>
										<td align="left" style="vertical-align: middle;"><select
											style="width:157px;height: 30px;padding-left:10px;">
												<option value="">--请选择--</option>
												<option>出租房子</option>
												<option>社保工资</option>
												<option>子女赡养</option>
												<option>做小生意</option>
												<option>低保</option>
												<option>退休金/养老金</option>
												<option>其它资助</option>
										</select></td>
									</tr>
									<tr>
										<th height="50px"
											style="text-align:right;vertical-align: middle;"><span
											style="color:red;">* </span>身份证:</th>
										<td align="left" style="vertical-align: middle;" colspan="3">
											<input style="width:330px;height: 30px;padding-left:10px;"
											type="text" onchange="idcardcheck(value)" name="h_IDNum"
											id="h_IDNum"><span style="padding-left:13px;"></span>
											<input type="radio" name="h_YSex" value="0" id="h_YSex0"
											checked="true">男 <span style="padding-left:13px;"></span>
											<input type="radio" name="h_YSex" value="1" id="h_YSex1">女
										</td>
									</tr>
									<tr>
										<th height="50px"
											style="text-align:right;vertical-align: middle;"><span
											style="color:red;">* </span> 联系电话:</th>
										<td align="left" style="vertical-align: middle;"><input
											style="height: 30px;padding-left:10px" type="text"
											name="h_YTel" id="h_YTel"></td>
										<th style="text-align:right;vertical-align: middle;"><span
											style="color:red;">* </span> 年龄:</th>
										<td align="left" style="vertical-align: middle;"><input
											readonly="readonly" style="height: 30px;padding-left:10px"
											type="text" name="h_YAge" id="h_YAge"></td>
									</tr>
									<tr>
										<th height="50px"
											style="text-align:right;vertical-align: middle;"><span
											style="color:red;">* </span>紧急联系人:</th>
										<td align="left" style="vertical-align: middle;"><input
											style="height: 30px;padding-left:10px" type="text"></td>
										<th style="text-align:right;vertical-align: middle;"><span
											style="color:red;">* </span>联系人手机号:</th>
										<td align="left" style="vertical-align: middle;"><input
											style="height: 30px;padding-left:10px" type="text"></td>
									</tr>

									<tr>
										<th height="50px"
											style="text-align:right;vertical-align: middle;">特长:</th>
										<td align="left" colspan="3"><textarea
												style="width:87%;height:100px;padding:10px" type="text"
												name="h_YRemark" id="h_YRemark"></textarea></td>
									</tr>
									<tr>
										<th style="text-align:right;vertical-align: middle;">爱好:
										</th>
										<td align="left" colspan="3"><textarea
												style="width:87%;height:100px;padding:10px" type="text"
												name="h_SpecialtyInt" id="h_SpecialtyInt"></textarea></td>
									</tr>
								</tbody>
							</table>
						</div>
						<div class="form-group" style="overflow: hidden;margin-top: 20px;">
							<div class=" col-md-6">
								<button type="submit" class="btn btn-success "
									style="padding-left:20px;padding-right:20px;margin-left:-15px;"
									onclick=" SaveData()">保 存</button>
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
