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

<title>My JSP 'addressbookmanager.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta name="" viewport content="width=device-width,initial-scale=1">
<!-- 引入jquery -->
<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery-1.7.2.min.js"></script>
<!-- 引入样式 -->
<link
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script type="text/javascript">
	function del() {
		var text = "你确定要删除吗";
		if (confirm(text) == true) {
			return true;
		} else {
			return false;
		}
	}
</script>
</head>

<body style="margin: 15px;">
	<div style="width:98%;margin-left:4px">
		<ul class="list-unstyle list-inline nav nav-tabs"
			style="margin-top:10px">
			<li class="active" style="font-size:20px;">老人</li>
			<li style="font-size:20px;">亲属</li>
		</ul>
		<div>
			<table class="table table-bordered table-hover"
				style="margin-top:10px">
				<tr>
					<th></th>
					<th class="col-sm-2"><input id="addressbook" type="checkbox">&nbsp;&nbsp;姓名</th>
					<th class="col-sm-3">地址</th>
					<th class="col-sm-2">电话</th>
					<th class="col-sm-3">所属服务区</th>
					<th>操作</th>
				</tr>
				<tr>
					<td>1</td>
					<td><input class="addressbookid" type="checkbox">&nbsp;&nbsp;张三</td>
					<td>太空</td>
					<td>12345678909</td>
					<td>火星</td>
					<td><button class="btn btn-sm btn-danger"
							style="margin-left: 40px;" onclick="javascript:return del()">删除</button></td>
				</tr>
				<tr>
					<td>2</td>
					<td><input class="addressbookid" type="checkbox">&nbsp;&nbsp;张三</td>
					<td>太空</td>
					<td>12345678909</td>
					<td>火星</td>
					<td><button class="btn btn-sm btn-danger"
							style="margin-left: 40px;" onclick="javascript:return del()">删除</button></td>
				</tr>
				<tr>
					<td>3</td>
					<td><input class="addressbookid" type="checkbox">&nbsp;&nbsp;张三</td>
					<td>太空</td>
					<td>12345678909</td>
					<td>火星</td>
					<td><button class="btn btn-sm btn-danger"
							style="margin-left: 40px;" onclick="javascript:return del()">删除</button></td>
				</tr>
				<tr>
					<td>4</td>
					<td><input class="addressbookid" type="checkbox">&nbsp;&nbsp;张三</td>
					<td>太空</td>
					<td>12345678909</td>
					<td>火星</td>
					<td><button class="btn btn-sm btn-danger"
							style="margin-left: 40px;" onclick="javascript:return del()">删除</button></td>
				</tr>
			</table>
		</div>
		<div>
			跳转至： <select>
				<option>1</option>
				<option>2</option>
				<option>3</option>
				<option>4</option>
			</select> &nbsp;&nbsp;&nbsp;&nbsp;<a href=""><span
				class="glyphicon glyphicon-step-backward"></span></a>
			&nbsp;&nbsp;第&nbsp;<input type="text" style="width:50px"
				placeholder="1">&nbsp;页 &nbsp;&nbsp;<a href=""><span
				class="glyphicon glyphicon-step-forward"></span></a>
			&nbsp;&nbsp;&nbsp;&nbsp;<a href=""><span
				class="glyphicon glyphicon-repeat"></span></a>
		</div>
	</div>

	<script>
		$("#addressbook").click(function() {
			$(".addressbookid").prop("checked", $(this).prop("checked"));
		});
	</script>
</body>
</html>
