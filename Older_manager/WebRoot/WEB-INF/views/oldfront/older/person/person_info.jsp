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
<script language="JavaScript"
	src="${APP_PATH}/static/js/uploadPreview.js"></script>
<script
	src="${APP_PATH}/lib/jquery.validation/1.14.0/validate-methods.js"></script>
<script
	src="${APP_PATH}/lib/jquery.validation/1.14.0/jquery.validate.js"></script>

<style>
.error {
	color: red;
}
</style>
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
							<button type="button" class="btn back fr" id="btnclose"
								onClick="javascript :history.back(-1);">返回</button>
						</div>
						<div id="show_panel" style="text-align: center;width:100%">
							<form id="old_form" enctype="multipart/form-data">
								<table
									class="table table-striped table-bordered table-hover text-center yyjl-table;"
									style="width:90%;margin: 0 auto;">
									<tbody align="right">
										<tr class="firstRow">
											<input type="hidden" value="${oldman.id}" name="id" id="id">
											<th width="15%" height="50px"
												style="text-align:right;vertical-align: middle;"><span
												style="color:red;">* </span>姓名:</th>
											<td width="35%" align="left" style="vertical-align: middle;">
												<input style="height: 30px;padding-left:10px" type="text"
												value="${oldman.name}" name="name" id="name">
											</td>
											<th width="15%" height="50px" rowspan="3"
												style="text-align:right;vertical-align: middle;"><span
												style="color:red;">* </span>头像:</th>
											<td width="35%" align="center" rowspan="3"
												style="vertical-align: middle;">
												<div id="h_YPhoto_div"></div> <img
												src="http://123.207.93.53/Older_back/${oldman.photo}"
												width="120" height="120" name="photo"
												value="${oldman.photo}" id="imgShow" style="display: block;" />
												<input type="file" id="up_img"
												style="border-left:none;margin:0;" value="更换图像" name="file">
											</td>
										</tr>
										<tr>
											<th height="50px"
												style="text-align:right;vertical-align: middle;">生活状态:</th>
											<td align="left" style="vertical-align: middle;"><select
												id="type" name="type"
												style="width:157px;height: 30px;padding-left:10px;">
													<option value="请选择">请选择</option>
													<option value="低保老人">低保老人</option>
													<option value="独居老人">独居老人</option>
													<option value="三无老人">三无老人</option>
													<option value="孤寡老人">孤寡老人</option>
											</select></td>
										</tr>
										<tr>
											<th height="50px"
												style="text-align:right;vertical-align: middle;">婚姻状况:</th>
											<td align="left" style="vertical-align: middle;"><select
												id="marriage" name="marriage"
												style="width:157px;height: 30px;padding-left:10px;">
													<option value="请选择">请选择</option>
													<option value="已婚">已婚</option>
													<option value="未婚">未婚</option>
													<option value="离异">离异</option>
													<option value="丧偶">丧偶</option>
													<option value="再婚">再婚</option>
											</select></td>
										</tr>
										<tr>
											<th height="15%"
												style="text-align:right;vertical-align: middle;"><span
												style="color:red;">* </span> 出生日期:</th>
											<td align="left" width="35%"><input
												class="easyui-datebox datebox-f combo-f textbox-f"
												editable="false" id="birthday" name="birthday"
												value="${oldman.birthday}" style="height: 30px;"></td>
											<th width="15%"
												style="text-align:right;vertical-align: middle;">经济来源:</th>
											<td align="left" style="vertical-align: middle;"><select
												id="economicsource"
												style="width:157px;height: 30px;padding-left:10px;"
												name="economicsource">
													<option value="--请选择--">--请选择--</option>
													<option value="出租房子">出租房子</option>
													<option value="社保工资">社保工资</option>
													<option value="子女赡养">子女赡养</option>
													<option value="做小生意">做小生意</option>
													<option value="低保">低保</option>
													<option value="退休金/养老金">退休金/养老金</option>
													<option value="其它资助">其它资助</option>
											</select></td>
										</tr>
										<tr>
											<th height="50px"
												style="text-align:right;vertical-align: middle;"><span
												style="color:red;">* </span>身份证:</th>
											<td align="left" style="vertical-align: middle;" colspan="3">
												<input style="width:330px;height: 30px;padding-left:10px;"
												type="text" onchange="idcardcheck(value)"
												value="${oldman.idcar}" name="idcar" id="idcar"> <span
												style="padding-left:13px;"> </span> <input type="radio"
												name="sex" value="男" id="sex"> 男 <span
												style="padding-left:13px;"> </span> <input type="radio"
												name="sex" value="女" id="sex" checked="true"> 女
											</td>
										</tr>
										<tr>
											<th height="50px"
												style="text-align:right;vertical-align: middle;"><span
												style="color:red;">* </span> 联系电话:</th>
											<td align="left" style="vertical-align: middle;"><input
												style="height: 30px;padding-left:10px" type="text"
												id="phone" name="phone" value="${oldman.phone}"></td>
											<th style="text-align:right;vertical-align: middle;"><span
												style="color:red;">* </span> 年龄:</th>
											<td align="left" style="vertical-align: middle;"><input
												readonly="readonly" style="height: 30px;padding-left:10px"
												type="text" name="age" value="${oldman.age}" id="age"></td>
										</tr>
										<tr>
											<th height="50px"
												style="text-align:right;vertical-align: middle;"><span
												style="color:red;">* </span>紧急联系人:</th>
											<td align="left" style="vertical-align: middle;"><input
												style="height: 30px;padding-left:10px" name="urgencycontact"
												id="urgencycontact" value="${oldman.urgencycontact}"
												type="text"></td>
											<th style="text-align:right;vertical-align: middle;"><span
												style="color:red;">* </span>联系人手机号:</th>
											<td align="left" style="vertical-align: middle;"><input
												style="height: 30px;padding-left:10px"
												name="urgencycontactphone" id="urgencycontactphone"
												value="${oldman.urgencycontactphone}" type="text"></td>
										</tr>

										<tr>
											<th height="50px"
												style="text-align:right;vertical-align: middle;">特长:</th>
											<td align="left" colspan="3"><textarea
													style="width:87%;height:100px;padding:10px" type="text"
													name="specialString" id="specialString">${oldman.special.projectname}</textarea></td>
										</tr>
										<tr>
											<th style="text-align:right;vertical-align: middle;">爱好:
											</th>
											<td align="left" colspan="3"><textarea
													style="width:87%;height:100px;padding:10px" type="text"
													name="hobbyString" id="hobbyString">${oldman.hobby.projectname}</textarea></td>
										</tr>
									</tbody>
								</table>
							</form>
						</div>
						<div class="form-group" style="overflow: hidden;margin-top: 20px;">
							<div class=" col-md-6">
								<button type="button" class="btn btn-success "
									style="padding-left:20px;padding-right:20px;margin-left:-15px;"
									onclick="doUpload()">保 存</button>
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
		$(function() {

			new uploadPreview({
				UpBtn : "up_img",
				ImgShow : "imgShow"
			});
			$("#economicsource").val([ '${oldman.economicsource}' ]);
			$("#marriage").val([ '${oldman.marriage}' ]);
			$("#type").val([ '${oldman.type}' ]);
			$("#sex:input[name=sex]").val([ '${oldman.sex}' ]);
		})
		function Login_Out() {
			if (confirm('您确定要退出本次登录吗?')) {
				window.location.href = "oldmanaccount/loginOut";
			}
		};
		function doUpload() {
			if(validateForm().form() ){
				$.ajax({
					url : "${APP_PATH}/PersonalCenter/modifyAcountInfo",
					type : 'POST',
					data : new FormData($("#old_form")[0]),
					cache : false,
					contentType : false,
					processData : false,
					success : function(result) {
						if (result.code == 100) {
							layer.open({
								offset:['30%'],
								title : '更新提示！',
								content : '更新成功！'
							});
						}
					},
					error : function(result) {
						if (code == 200) {
							layer.open({
								offset:['30%'],
								title : '更新提示！',
								content : '更新失败！'
							});
						}
					}
				});
			}
		}

		function validateForm() {
			return $("#old_form").validate({
				debug : true, //调试模式取消submit的默认提交功能   
				//errorClass: "label.error", //默认为错误的样式类为：error   
				onfocusout : true,
				onkeyup : false,
				rules : {
					name : {
						required : true,
						isChinese : true
					},
					birthday : {
						required : true,
					},
					phone : {
						required : true,
						isMobile : true
					},
					age : {
						required : true,
						isIntGtZero : true
					},
					idcard : {
						required : true,
						isIdCardNo : true
					},
					urgencycontact : {
						required : true,
						isChinese : true
					},
					urgencycontactphone : {
						required : true,
						isMobile : true
					}
				},
				messages : {
					name : {
						required : "必填",
						isChinese : "必须填写中文"
					},
					birthday : {
						required : "必填",
					},
					phone : {
						required : "必填",
						isMobile : "手机电话号码格式错误"
					},
					age : {
						required : "必填",
						isIntGtZero : "年龄必须大于0"
					},
					idcard : {
						required : "必填",
						isIdCardNo : "身份证格式不对"
					},
					urgencycontact : {
						required : "必填",
						isChinese : "必须填写中文"
					},
					urgencycontactphone : {
						required : "必填",
						isMobile : "手机电话号码格式错误"
					}
				}
			});
		};
	</script>
</body>
</html>
