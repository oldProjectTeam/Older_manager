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

<title>My JSP 'addAttend.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!-- 引入jquery -->
<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery-3.2.1.min.js"></script>
<!-- 引入样式 -->
<link
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script language="JavaScript"
	src="${APP_PATH}/static/js/uploadPreview.js"></script>
<STYLE type="text/css">
.table td {
	text-align: center;
	vertical-align: middle !important;
}

.text {
	width: 150px !important;
	height: 100px !important;
}
</STYLE>
</head>
<body style="margin: 15px;">
	<!-- 头部 -->
	<div class="col-md-12">
		<div>
			<div class="row">
				<ol class="breadcrumb">
					<li><b>位置：健康管理>回访记录</b>>新增记录
				</ol>
			</div>
		</div>

		<!-- 小模态框,显示老人信息 -->
		<div class="modal fade bs-example-modal-sm" tabindex="-1"
			role="dialog" aria-labelledby="mySmallModalLabel">
			<div class="modal-dialog modal-sm" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h4 class="modal-title" id="mySmallModalLabel">请选择老人</h4>
					</div>
					<div class="modal-body">
						<div class="list-group">
							<table class="table" id="oldManNameDiv"></table>
						</div>
						<div style="text-align: center;">
							<button class="btn btn-sm btn-info" id="preBtn"
								style="margin-right: 15px;">上一页</button>
							<button class="btn btn-sm btn-info" id="nextBtn">下一页</button>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- 表格 -->
		<div class="row">
			<div class="col-md-12">
				<form action="plan/addVisitPlan" method="post" id="saveForm"
					enctype="multipart/form-data">
					<table class="table table-bordered">
						<tr class="active">
							<td class="text" id="oldmanIdText">老人姓名:</td>
							<td><input type="text" disabled="disabled"
								class="form-control" id="selectName" /> <br />
								<button class="btn btn-sm btn-info" data-toggle="modal"
									data-target=".bs-example-modal-sm">选择老人</button></td>

							<td class="text"><font color="red">*</font>计划回访:</td>
							<td><textarea class="form-control" rows="3"
									name="plannedvisits" id="plannedvisits"></textarea><span
								id="plannedvisitsHelpBlock" class="help-block"
								style="color: red;"></span></td>
							<td class="text"><font color="red">*</font>计划时间：</td>
							<td class="col-xs-1"><input type="date" class="form-control"
								name="visiplantime" id="visiplantime" /> <span
								id="visiplantimeHelpBlock" class="help-block"
								style="color: red;"></span></td>
						</tr>
						<tr>
							<td class="text">身份证:</td>
							<td><input type="text" disabled="disabled" id="IdCard"
								class="form-control" /></td>
							<td class="text"><font color="red">*</font>实际回访:</td>
							<td><textarea class="form-control" rows="3"
									name="actualplannedvisits" id="actualplannedvisits"></textarea>
								<span id="actualplannedvisitsHelpBlock" class="help-block"
								style="color: red;"></span></td>
							<td class="text"><font color="red">*</font>实际时间:</td>
							<td><INPUT type="date" class="form-control"
								name="actualtime" id="actualtime" /> <span
								id="actualtimeHelpBlock" class="help-block" style="color: red;"></span>
							</td>
						</tr>
						<tr class="active">
							<td class="text">提醒人员:</td>
							<td><input type="text" readonly="readonly"
								value="${activeUser.username}" class="form-control"
								name="remindpeople" /></td>

							<td class="text"><font color="red">*</font>回访状态:</td>
							<td><select name="state" class="form-control">
									<option>已回访</option>
									<option>未回访</option>
							</select></td>
							<td class="text"><font color="red">*</font>提醒时间:</td>
							<td><INPUT type="date" class="form-control"
								name="remindvistitplantime" id="remindvistitplantime"> <span
								id="remindvistitplantimeHelpBlock" class="help-block"
								style="color: red;"></span></td>
						</tr>
						<tr>
							<td class="text"><font color="red">*</font>待提醒:</td>
							<td colspan="2"><textarea class="form-control" rows="4"
									name="pendingevent" id="pendingevent"></textarea> <span
								id="pendingeventHelpBlock" class="help-block"
								style="color: red;"></span></td>
							<td class="text"><font color="red">*</font>回访记录:</td>
							<td colspan="2"><textarea class="form-control" rows="4"
									name="visitrecord" id="visitrecord"></textarea> <span
								id="visitrecordHelpBlock" class="help-block" style="color: red;"></span>
							</td>
						</tr>
						<tr class="active">
							<td rowspan="1" class="active" class="text"><font
								color="red">*</font>图片</td>
							<td rowspan="1" class="col-xs-3"><input type="hidden"
								id="videopath" name="path" /> <input class="form-control"
								type="file" multiple="multiple" class="btn btn-info"
								value="图片管理" name="file" id="up_img" required="true"> <br />
								<input class="btn btn-sm btn-success" type="button" value="上传图片"
								name="addvideo" onclick="uploadFile()"> <br /> <br />
								<div id="progress" style=" margin-top: 20 " class="progress-bar"></div>
								<img src="" id="imgShow" height="160" width="210"
								class="img-rounded" /></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
		<!-- 按钮 -->
		<div class="row">
			<div align="center">
				<BUTTON class="btn btn-sm btn-success" id="save">保存</BUTTON>
				<BUTTON class="btn btn-sm btn-defualt"
					onclick="javascript:history.back(-1);">返回</BUTTON>
			</div>
		</div>
	</div>

	<script type="text/javascript">
		/* 加载所有的老人 */
		var currentNum;
		$(function() {
			go(1, "");
		});
		function go(pn, str) {
			$.ajax({
				url : "${APP_PATH}/old/selectallolderwith",
				data : {
					"pn" : pn,
					"str" : str
				},
				type : "GET",
				success : function(result) {
					if (result.code == 100) {
						console.log(result.extend.pageInfo);
						currentNum = result.extend.pageInfo.pageNum;
						$("#oldManNameDiv").empty();
						$.each(result.extend.pageInfo.list, function(index,
								item) {
							var oldMan = $("<button></button>").addClass(
									"list-group-item selectMan");
							//添加老人的id
							oldMan.attr("oldManId", item.id);
							//添加老人的姓名
							oldMan.attr("oldManName", item.name);
							//添加老人的身份证号码
							oldMan.attr("oldManIdCard", item.idcar);
							oldMan.append(item.name);
							$("<tr></tr>")
									.append($("<td></td>").append(oldMan))
									.appendTo($("#oldManNameDiv"));
						});

						//上一页
						if (result.extend.pageInfo.hasPreviousPage) {
							$("#preBtn").removeAttr("disabled");
							$("#preBtn").click(function() {
								go(currentNum - 1, "");
							});
						} else {
							$("#preBtn").attr("disabled", "disabled");
						}
						//下一页
						if (result.extend.pageInfo.hasNextPage) {
							$("#nextBtn").removeAttr("disabled");
							$("#nextBtn").click(function() {
								go(currentNum + 1, "");
							});
						} else {
							$("#nextBtn").attr("disabled", "disabled");
						}
					}
				}
			});
		}
		$(document).on("click", ".selectMan", function() {
			$("#oldmanIdText").empty();
			$("#selectName").val("");
			$("#IdCard").val("");
			var IdText;
			IdText = $("<input type='hidden'/>").attr("name", "oldmanId");
			IdText.val($(this).attr("oldManId"));
			$("#oldmanIdText").append(IdText);
			$("#selectName").val($(this).attr("oldManName"));
			$("#IdCard").val($(this).attr("oldManIdCard"));
			$(".bs-example-modal-sm").modal("hide");
		});
		window.onload = function() {
			new uploadPreview({
				UpBtn : "up_img",
				ImgShow : "imgShow"
			});
		};
		/* 保存 */
		$("#save").click(function() {
			if ($("#plannedvisits").val() == '') {
				$("#plannedvisitsHelpBlock").text("");
				$("#plannedvisitsHelpBlock").append("计划回访不能为空");

			}
			if ($("#visiplantime").val() == '') {
				$("#visiplantimeHelpBlock").text("");
				$("#visiplantimeHelpBlock").append("计划回访时间不能为空");
			}
			if ($("#actualplannedvisits").val() == '') {
				$("#actualplannedvisitsHelpBlock").text("");
				$("#actualplannedvisitsHelpBlock").append("实际回访不能为空");

			}
			if ($("#actualtime").val() == '') {
				$("#actualtimeHelpBlock").text("");
				$("#actualtimeHelpBlock").append("实际回访时间不能为空");
			}
			if ($("#remindvistitplantime").val() == '') {
				$("#remindvistitplantimeHelpBlock").text("");
				$("#remindvistitplantimeHelpBlock").append("提醒时间不能为空");
			}
			if ($("#pendingevent").val() == '') {
				$("#pendingeventHelpBlock").text("");
				$("#pendingeventHelpBlock").append("待提醒不能为空");
			}
			if ($("#visitrecord").val() == '') {
				$("#visitrecordHelpBlock").text("");
				$("#visitrecordHelpBlock").append("回访记录不能为空");
			} else {
				if($("#visiplantime").val())
				$("#plannedvisitsHelpBlock").text("");
				$("#visiplantimeHelpBlock").text("");
				$("#actualplannedvisitsHelpBlock").text("");
				$("#actualtimeHelpBlock").text("");
				$("#remindvistitplantimeHelpBlock").text("");
				$("#pendingeventHelpBlock").text("");
				$("#visitrecordHelpBlock").text("");
				$("#saveForm").submit();
			}
		});
	</script>
</body>
</html>
