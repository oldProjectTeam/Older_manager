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

<title>My JSP 'insertnewolder.jsp' starting page</title>

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
</head>
<body style="margin: 15px;">
	<div class="row">
		<div class="col-sm-12">
			<form action="${APP_PATH}/addnewolder" method="post" class="form">
				<div class="col-sm-4">
					老人名字： <input type="text" name="name" class="form-control">
				</div>
				<div class="col-sm-4">
					性别： <select class="form-control" name="sex">
						<option>男</option>
						<option>女</option>
					</select>
				</div>
				<div class="col-sm-4">
					电话： <input type="telephone" class="form-control" name="phone">
				</div>
				<div class="col-sm-4">
					名族： <select class="form-control" name="nation">
						<option>汉</option>
						<option>水族</option>
					</select>
				</div>
				<div class="col-sm-4">
					生日： <input type="date" class="form-control" name="birthday">
				</div>
				<div class="col-sm-4">
					年龄： <select class="form-control" name="age">
						<option>10</option>
						<option>20</option>
					</select>
				</div>
				<div class="col-sm-4">
					地址： <input type="text" class="form-control" name="address">
				</div>
				<div class="col-sm-4">
					相片： <input type="text" class="form-control" name="photo">
				</div>
				<div class="col-sm-4">
					服务点： <input type="text" class="form-control" name="service">
				</div>
				<div class="col-sm-4">
					紧急联系人： <input type="text" class="form-control"
						name="urgencycontact">
				</div>
				<div class="col-sm-4">
					紧急联系人电话： <input type="telephone" class="form-control"
						name="urgencycontactphone">
				</div>
				<div class="col-sm-4">
					服务状态： <select class="form-control" name="servicestatu">
						<option>好</option>
						<option>不好</option>
					</select>
				</div>
				<button type="submit" class="btn btn-defualt">保存</button>
			</form>
		</div>

	</div>
</body>
</html>
