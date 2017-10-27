<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" type="text/css"
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script type="text/javascript"
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script language="JavaScript"
	src="${APP_PATH}/static/js/jquery-3.2.1.min.js"></script>
<script language="JavaScript"
	src="${APP_PATH}/static/js/uploadPreview.js"></script>
</head>

<body onload="">
	<!--路劲导航  -->
	<div class="row">
		<div class="col-md-12">
			<ol class="breadcrumb">
				<li><b>位置：<a
						href="static/oldback/educationManage/educationIndex.html">教育管理</a></b></li>
				<li class="active">新增课程</li>
			</ol>
		</div>
	</div>
	<!--主体  -->
	<div class="row">
		<div class="col-md-12">
			<form class="form-horizontal" id="addForm"
				enctype="multipart/form-data" <%-- action="${APP_PATH}/Course/addCourse"
				method="post" --%>>
				<div class="table-responsive">
					<table class="table table-bordered table-striped text-center">
						<tbody>
							<tr>

								<td>课程名称</td>
								<td class="col-xs-2"><input type="hidden"
									value="${Course.id}" name="id" /> <input type="text"
									class="form-control" required="required" name="title">
								</td>
								<td>授课方式</td>
								<td class="col-xs-2"><input type="text"
									class="form-control" required="required" name="teachingway">
								</td>
								<td>讲师</td>
								<td class="col-xs-2"><input type="text"
									class="form-control" required="required" name="teacher">
								</td>
								<td rowspan="3" class="active" style="padding-top:50px">宣传图片:</td>
								<td rowspan="3" class="col-xs-2"><input type="file" multiple="multiple"
									class="btn btn-default" value="图片管理" name="file" id="up_img" />
									<img
									src="${pageContext.request.contextPath}/upload/${user.image==null?'failure.png':user.image}"
									id="imgShow" class="img-responsive"></td>
							</tr>
							<tr>
								<td>课程介绍</td>
								<td><textarea class="form-control" rows="3"
										required="required" name="content"></textarea></td>
								<td>限定人数</td>
								<td><input type="number" class="form-control"
									name="limitnumber"></td>
								<td>报名截止时间</td>
								<td><input type="date" class="form-control" name="bytime">
								</td>
							</tr>
							<tr>
								<td>开课时间</td>
								<td><input type="date" class="form-control"
									name="starttime"></td>
								<td>结课时间</td>
								<td><input type="date" class="form-control" name="endtime">
								</td>
								<td colspan="2">
									<div class="form-group">
										<div class="col-sm-12">
											课程路径或链接 <input type="text" class="form-control" name="path">
										</div>
									</div>
								</td>
							</tr>
							<tr>
								<td colspan="8"><input type="hidden" class="form-control"
									name="promulgator">
									<button type="button" class="btn btn-primary" id="addCourse">添加</button>
									<button type="button" class="btn btn-info"
										onClick="javascript :history.back(-1);">返回</button></td>
							</tr>
						</tbody>
					</table>
				</div>
			</form>
		</div>
	</div>

	<script type="text/javascript">
		window.onload = function() {
			new uploadPreview({
				UpBtn : "up_img",
				ImgShow : "imgShow"
			});
		};
		
		$("#addCourse").click(function() {

			$.ajax({
				url : "Course/addCourse",
				data: new FormData($("#addForm")[0]),
				type : "post",
				cache: false,
				processData: false,
				contentType: false,
				success : function(result) {

					if (result.code == 100) {
						alert("添加成功!");
					} else {
						alert("添加失败!");
					}
				}
			});

		});
	</script>
</body>
</html>
