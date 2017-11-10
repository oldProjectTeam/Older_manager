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
<script type="text/javascript" src="${APP_PATH}/static/js/jquery-3.2.1.min.js"></script>
<!-- 引入样式 -->
<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script language="JavaScript" src="${APP_PATH}/static/js/uploadPreview.js"></script>
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
					<li>
						<b>位置：健康管理>回访记录</b>>修改记录
				</ol>
			</div>
		</div>

		<!-- 表格 -->
		<div class="row">
			<div class="col-md-12">
				<form action="plan/updateVisitPlan" method="post" id="saveForm" enctype="multipart/form-data">
					<table class="table table-bordered">
						<tr class="active">
							<td class="text" id="oldmanIdText">老人姓名:</td>
							<td><input type="text" disabled="disabled" class="form-control" id="selectName"
									value="${visiplan.oldman.name}" /></td>
							<input type="hidden" id="id" name="id" value="${visiplan.id}" />
							<input type="hidden" id="oldmanId" name="oldmanId" value="${visiplan.oldmanId}" />
							<td class="text"><font color="red">*</font>计划回访事物:</td>
							<td colspan="2"><textarea class="form-control" rows="3" onchange="checkStr2(this.value)"
									name="plannedvisits" id="plannedvisits">${visiplan.plannedvisits}</textarea><span id="plannedvisitsHelpBlock"
								class="help-block" style="color: red;"></span></td>
							<td class="text"><font color="red">*</font>计划时间：</td>
							<td class="col-xs-1"><input type="date" class="form-control" name="visiplantime" id="visiplantime" /> <span
								id="visiplantimeHelpBlock" class="help-block" style="color: red;"></span></td>
						</tr>
						<tr>
							<td class="text">身份证:</td>
							<td><input type="text" disabled="disabled" id="IdCard" class="form-control" value="${visiplan.oldman.idcar}" /></td>
							<td class="text"><font color="red">*</font>实际回访事务:</td>
							<td colspan="2"><textarea class="form-control" rows="3" onchange="checkStr2(this.value)"
									name="actualplannedvisits" id="actualplannedvisits">${visiplan.actualplannedvisits}</textarea> <span
								id="actualplannedvisitsHelpBlock" class="help-block" style="color: red;"></span></td>
							<td class="text"><font color="red">*</font>实际时间:</td>
							<td><INPUT type="date" class="form-control" name="actualtime" id="actualtime" /> <span
								id="actualtimeHelpBlock" class="help-block" style="color: red;"></span></td>
						</tr>
						<tr class="active">
							<td class="text">提醒人员:</td>
							<td><input type="text" readonly="readonly" onchange="checkStr(this.value)" value="${visiplan.remindpeople}"
									class="form-control" name="remindpeople" /></td>
							<td><font color="red">*</font>上次回访记录:</td>
							<td colspan="2"><textarea class="form-control" rows="5" onchange="checkStr2(this.value)" name="visitrecord"
									id="visitrecord">${visiplan.visitrecord}</textarea> <span id="visitrecordHelpBlock" class="help-block"
								style="color: red;"></span></td>

							<td class="text"><font color="red">*</font>提醒时间:</td>
							<td><INPUT type="date" class="form-control" name="remindvistitplantime" id="remindvistitplantime"> <span
								id="remindvistitplantimeHelpBlock" class="help-block" style="color: red;"></span></td>
						</tr>
						<tr class="active">
							<td class="text"><font color="red">*</font>回访状态:</td>
							<td><select name="state" class="form-control" value="${visiplan.state}">
									<option>已回访</option>
									<option>未回访</option>
								</select></td>
							<td class="text"><font color="red">*</font>待提醒:</td>
							<td colspan="2"><textarea class="form-control" rows="5" onchange="checkStr2(this.value)" name="pendingevent"
									id="pendingevent">${visiplan.pendingevent}</textarea> <span id="pendingeventHelpBlock" class="help-block"
								style="color: red;"></span></td>
							<td class="text"><font color="red">*</font>创建时间</td>
							<td><input type="date" class="form-control" name="createtime" id="createtime" value="${visiplan.createtime}">
								<span id="createtimeHelpBlock" class="help-block" style="color: red;"></span></td>
						</tr>
						<tr>

						</tr>
						<tr class="active">
							<td rowspan="1" class="active" class="text"><font color="red">*</font>图片</td>
							<td colspan="2" class="col-xs-3"><input type="hidden" id="videopath" name="path" value="${visiplan.images}" />
								<input class="form-control" type="file" multiple="multiple" class="btn btn-info" value="图片管理" name="file"
									id="up_img" required="true"> <br /> <input class="btn btn-sm btn-success" type="button" value="上传图片"
									name="addvideo" onclick="uploadFile()"> <br /> <br />
								<div id="progress" style=" margin-top: 20 " class="progress-bar"></td>
							<td colspan="3">
								</div> <img src="${visiplan.images}" id="imgShow" class="img-responsive" />
							</td>
						</tr>
					</table>
				</form>
			</div>
		</div>
		<!-- 按钮 -->
		<div class="row">
			<div align="center">
				<BUTTON class="btn btn-sm btn-success" id="save">修改</BUTTON>
				<BUTTON class="btn btn-sm btn-defualt" onclick="javascript:history.back(-1);">返回</BUTTON>
			</div>
		</div>
	</div>

	<script type="text/javascript">
        $(function() {
            new uploadPreview({
                UpBtn : "up_img",
                ImgShow : "imgShow"
            });
            document.getElementById("createtime").valueAsDate = new Date("${visiplan.createtime}");
            document.getElementById("remindvistitplantime").valueAsDate = new Date(
                    "${visiplan.remindvistitplantime}");
            document.getElementById("actualtime").valueAsDate = new Date("${visiplan.actualtime}");
            document.getElementById("visiplantime").valueAsDate = new Date(
                    "${visiplan.visiplantime}");
            document.getElementById("actualtime").valueAsDate = new Date("${visiplan.actualtime}");
        });
        /* 修改*/
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
                if ($("#visiplantime").val())
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
        $("#save").click(
                function() {
                    if ($("#plannedvisits").val() == '' || $("#visiplantime").val() == ''
                            || $("#actualplannedvisits").val() == ''
                            || $("#actualtime").val() == ''
                            || $("#remindvistitplantime").val() == ''
                            || $("#pendingevent").val() == '' || $("#visitrecord").val() == '') {
                        layer.msg("请填写必填信息");
                    } else {
                        var name = "(^[\u4e00-\u9fa5]+(·[\u4e00-\u9fa5]+)*$)";
                        if ($("#visiplantime").val() > $("#actualtime").val()) {
                            layer.msg("实际时间不能在计划时间之前");
                        } else if ($("#visiplantime").val() > $("#remindvistitplantime").val()) {
                            layer.msg("提醒时间不能再计划时间之前");
                        } else if (!$("#plannedvisits").val().match(name)) {
                            layer.msg("计划回访必须是中文的");
                        } else if (!$("#actualplannedvisits").val().match(name)) {
                            layer.msg("实际回访必须是中文的");
                        } else if (!$("#pendingevent").val().match(name)) {
                            layer.msg("待提醒必须是中文的");
                        } else if (!$("#visitrecord").val().match(name)) {
                            layer.msg("回访记录必须是中文的");
                        } else {
                            $("#saveForm").submit();
                        }
                    }
                });

        function checkStr2(str) {
            // [\u4E00-\uFA29]|[\uE7C7-\uE7F3]|[a-zA-Z0-9]汉字编码范围 
            var re1 = new RegExp("^([\u4E00-\uFA29]|[\uE7C7-\uE7F3]|[a-zA-Z0-9])*$");
            if (!re1.test(str)) {
                layer.open({
                    title : '输入提示',
                    content : '请输入中文、大小写字母、数字、下划线、横线中的字符'
                });
                return false;
            } else {
                return true;
            }
        }

        function checkStr(str) {
            // [\u4E00-\uFA29]|[\uE7C7-\uE7F3]|[a-zA-Z0-9]汉字编码范围 
            var re1 = new RegExp("^([\u4E00-\uFA29]|[\uE7C7-\uE7F3])*$");
            if (!re1.test(str)) {
                layer.open({
                    title : '输入提示',
                    content : '请输入中文'
                });
                return false;
            } else {
                return true;
            }
        }
    </script>
</body>
</html>
