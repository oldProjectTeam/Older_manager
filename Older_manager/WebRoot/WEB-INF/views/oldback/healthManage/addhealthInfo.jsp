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

<title>My JSP 'addhealthInfo.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!-- 引入jquery -->
<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery-1.7.2.min.js"></script>
<!-- 引入样式 -->
<link
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<STYLE type="text/css">
.table th,.table td {
	text-align: center;
	vertical-align: middle !important;
}
</STYLE>
</head>
<body>
	<!-- 头部 -->
	<div class="col-md-12">
		<div>
			<div class="row">

				<ol class="breadcrumb">
					<li><b>位置：健康管理>基本健康信息</b> >新增信息
				</ol>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<table class="table table-bordered">
					<tr>
						<th colspan="8">基本信息</th>
					</tr>
					<tr>
						<th>老人姓名：</th>
						<th><SELECT>
								<OPTION class="form-control">罗先生</OPTION>

						</SELECT></th>

						<th>身高:</th>
						<th><SELECT>
								<OPTION class="form-control">555</OPTION>

						</SELECT> <label class="control-label">cm</label></th>
						<th>体重：</th>
						<th><SELECT>
								<OPTION class="form-control">555</OPTION>

						</SELECT> <label class="control-label">kg</label></th>
						<th>臀围：</th>
						<th><SELECT>
								<OPTION class="form-control">555</OPTION>

						</SELECT> <label class="control-label">cm</label></th>
					</tr>
					<tr>
						<th>胸围：</th>
						<th><SELECT>
								<OPTION class="form-control">555</OPTION>

						</SELECT> <label class="control-label">cm</label></th>
						<th>腰臂围比值:</th>
						<th><SELECT>
								<OPTION class="form-control">555</OPTION>

						</SELECT></th>
						<th>个体体征：</th>
						<th><SELECT>
								<OPTION class="form-control">555</OPTION>

						</SELECT> <label class="control-label">kg/m2</label></th>
						<th colspan="2"></th>
					</tr>
					<tr>
						<th colspan="8">身体信息</th>
					</tr>
					<tr>
						<th>左眼视力:</th>
						<th><INPUT type="text" class="form-control"></th>
						<th>右眼视力:</th>
						<th><INPUT type="text" class="form-control"></th>
						<th>矫正左眼视力:</th>
						<th><INPUT type="text" class="form-control"></th>
						<th>矫正右眼视力</th>
						<th><INPUT type="text" class="form-control"></th>
					</tr>
					<tr>
						<th>右侧血压：</th>
						<th><SELECT>
								<OPTION class="form-control">555</OPTION>

						</SELECT> <label class="control-label">mmHg</label></th>

						<th>左侧血压:</th>
						<th><SELECT>
								<OPTION class="form-control">555</OPTION>

						</SELECT> <label class="control-label">mmHg</label></th>
						<th>呼吸频率:</th>
						<th><SELECT>
								<OPTION class="form-control">555</OPTION>

						</SELECT> <label class="control-label">次/分钟</label></th>
						<th>脉率：</th>
						<th><SELECT>
								<OPTION class="form-control">555</OPTION>

						</SELECT> <label class="control-label">次/分钟</label></th>
					</tr>
					<tr>
						<th>口唇:</th>
						<th><INPUT type="text" class="form-control"></th>
						<th>齿列：</th>
						<th><INPUT type="text" class="form-control"></th>
						<th>咽部：</th>
						<th><INPUT type="text" class="form-control"></th>
						<th>皮肤：</th>
						<th><INPUT type="text" class="form-control"></th>
					</tr>
					<tr>
						<th>巩膜:</th>
						<th><INPUT type="text" class="form-control"></th>
						<th>淋巴结:</th>
						<th><INPUT type="text" class="form-control"></th>
						<th>心律:</th>
						<th><select>
								<OPTION>50</OPTION>
						</select> <label class="control-label">次/分钟</label></th>
						<th>脾大：</th>
						<th><select>
								<OPTION>是</OPTION>
								<OPTION>否</OPTION>
						</select></th>
					<tr>
						<th>桶状胸:</th>
						<th><select>
								<OPTION>是</OPTION>
								<OPTION>否</OPTION>
						</select></th>
						<th>呼吸音:</th>
						<th><select>
								<OPTION>正常</OPTION>
								<OPTION>异常</OPTION>
						</select></th>
						<th>罗音:</th>
						<th><INPUT type="text" class="form-control"></th>
						<th>体温：</th>
						<th><SELECT>
								<OPTION class="form-control">38</OPTION>

						</SELECT> <label class="control-label">℃</label></th>
					</tr>
					<tr>
						<th>听力:</th>
						<th><INPUT type="text" class="form-control"></th>
						<th>杂音:</th>
						<th><select>
								<OPTION>是</OPTION>
								<OPTION>否</OPTION>
						</select></th>
						<th>压痛:</th>
						<th><select>
								<OPTION>是</OPTION>
								<OPTION>否</OPTION>
						</select></th>
						<th>包块:</th>
						<th><select>
								<OPTION>是</OPTION>
								<OPTION>否</OPTION>
						</select></th>
					</tr>
					<TR>
						<th>症状：</th>
						<th><SELECT>
								<OPTION class="form-control">发烧</OPTION>

						</SELECT></th>
						<th colspan="6"></th>
					</TR>
					<tr>
					<tr>
						<th colspan="8">评价信息</th>
					</tr>

					<tr>
						<th>健康状况评价:</th>
						<th><SELECT>
								<OPTION class="form-control">良好</OPTION>

						</SELECT></th>
						<th>自理能力评价：</th>
						<th><INPUT type="text" class="form-control"></th>
						<th>认知功能：</th>
						<th><INPUT type="text" class="form-control"></th>
						<th colspan="2"></th>
					</tr>
					<tr>
						<th colspan="8">日常习惯</th>
					</tr>
					<tr>
						<th>饮食习惯:</th>
						<th><INPUT type="text" class="form-control"></th>
						<th>锻炼频率：</th>
						<th><INPUT type="text" class="form-control"></th>
						<th>每次锻炼时间：</th>
						<th><select>
								<OPTION>50</OPTION>
						</select> <label class="control-label">分钟</label></th>
						<th>坚持锻炼时间：</th>
						<th><select>
								<OPTION>50</OPTION>
						</select> <label class="control-label">年</label></th>
					</tr>
					<tr>
						<th>锻炼方法：</th>
						<th><INPUT type="text" class="form-control"></th>
						<th>吸烟状态：</th>
						<th><INPUT type="text" class="form-control"></th>
						<th>开始吸烟年龄：</th>
						<th><select>
								<OPTION>50</OPTION>
						</select> <label class="control-label">岁</label></th>
						<th>戒烟年龄：</th>
						<th><select>
								<OPTION>50</OPTION>
						</select> <label class="control-label">岁</label></th>
					</tr>
					<tr>
						<th>饮酒频率：</th>
						<th><INPUT type="text" class="form-control"></th>
						<th>日饮酒量：</th>
						<th><select>
								<OPTION>50</OPTION>
						</select> <label class="control-label">两</label></th>
						<th>开始饮酒年龄：</th>
						<th><select>
								<OPTION>50</OPTION>
						</select> <label class="control-label">岁</label></th>
						<th>是否戒酒：</th>
						<th><select>
								<OPTION>是</OPTION>
								<OPTION>否</OPTION>
						</select></th>
					</tr>
					<tr>
						<th>日吸烟量：</th>
						<th><select>
								<OPTION>50</OPTION>
						</select> <label class="control-label">支</label></th>
						<th colspan="6"></th>
					</tr>
				</table>
			</div>
		</div>
		<!-- 按钮 -->
		<div class="row" style="margin-bottom:20px">
			<div align="center">
				<BUTTON class="btn btn-success">保存</BUTTON>
				<BUTTON class="btn btn-defualt">返回</BUTTON>
			</div>
		</div>
	</div>
</body>
</html>
