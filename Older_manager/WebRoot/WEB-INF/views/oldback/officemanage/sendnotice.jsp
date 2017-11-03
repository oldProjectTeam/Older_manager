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

<title>My JSP 'sendnotice.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta name="viewport" content="width=device-width,initial-scale=1">
<!-- 引入jquery -->
<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery-3.2.1.min.js"></script>
<!-- 引入样式 -->
<link
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>

<body style="margin: 15px;">

	<!--路径导航  -->
	<div>
		<div class="row">
			<div class="col-md-12">
				<ol class="breadcrumb">
					<li><b>位置：<a href="page">办公管理</a></b></li>
					<li class="active">发布公告</li>
				</ol>
			</div>
		</div>
	</div>
	<div style="width:98%;margin-left:12px">
		<form class="form-inline" id="noticeForm">
			<div class="form-group">
				<input type="hidden" id="id" name="id"> <label
					for="exampleInputEmail2">公告标题:<span style="color:red">*</span></label>
				<input type="text" class="form-control" id="title" name="title"
					placeholder="公告标题" onchange="checkStr(this.value)">
			</div>
			<div class="form-group">
				<label for="exampleInputEmail2">发布人:<span style="color:red">*</span></label>
				<input type="text" class="form-control" id="releasepeople"
					name="releasepeople" placeholder="发布人姓名"
					onchange="checkStr(this.value)"> <input type="hidden"
					id="time" name="time">
			</div>
			<div>
				<br /> <label for="exampleInputEmail2">通告类型:<span
					style="color:red">*</span></label> <select id="type" name="type"
					class="form-control">
					<option value="通知类型">通知类型</option>
					<option value="会议通知">会议通知</option>
					<option value="指示通知">指示通知</option>
					<option value="转发通知">转发通知</option>
					<option value="重大通知">重大通知</option>
				</select>
			</div>
			<br /> <label>发布内容:<span style="color:red">*</span></label><br />
			<div class="form-group">
				<textarea class="form-control" placeholder="发布内容" rows="10"
					id="content" name="content" cols="128"></textarea>
			</div>
			<br /> <br />
			<button type="button" class="col-sm-offset-8 btn btn-info"
				id="sendNotice">发布</button>
		</form>
	</div>
	<script type="text/javascript">
		//点击保存按钮，修改报名信息
		$("#sendNotice").click(
				function() {
					//var time=document.getElementById("time").val;
					var releasepeople = $("#releasepeople").val();
					var type = $("#type").val();
					var content = $("#content").val();
					var title = $("#title").val();
					if (title == '' || releasepeople == '' || type == ''
							|| content == '') {
						alert("请填写完整信息再发布");
					} else {
						$.ajax({
							url : "${APP_PATH}/notice/addNotice",
							type : "post",
							data : $("#noticeForm").serialize(),
							success : function(result) {
								if (result.code == 100) {
									alert(result.extend.msg);
								} else {
									alert(result.extend.msg);
								}
							}
						});
					}

				});
		function checkStr(str) {
			// [\u4E00-\uFA29]|[\uE7C7-\uE7F3]汉字编码范围 
			var re1 = new RegExp("^([\u4E00-\uFA29]|[\uE7C7-\uE7F3])*$");
			if (!re1.test(str)) {
				alert("请输入中文字符");

				return false;
			} else {
				return true;
			}
		}
	</script>
</body>
</html>
