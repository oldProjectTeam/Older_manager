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

<title>My JSP 'informnotice.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta content="width=device-width,initial-scale=1">
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
	<div style="width:98%;margin-left:4px"">

		<div class="page-header">
			<h4>通知公告表</h4>
		</div>
		<div style="background:#fdfdfd;margin-top:15px;">
			<ul class="list-unstyle list-inline">
				<li><a
					href="/Older_manager/static/oldback/officemanage/sendnotice.jsp"><button
							type="button" class="btn btn-info">发布新公告</button></a></li>
				<li><a href=""><button type="button" class="btn btn-danger">删除公告</button></a></li>
				<li><a href=""><button type="button"
							class="btn btn-success">推送到手机</button></a></li>
			</ul>
			<form class="form-inline">
				<div class="form-group">
					<label for="exampleInputName2">通告标题:</label> <input type="text"
						class="form-control" placeholder="通告标题">
				</div>
				<div class="form-group">
					<label for="exampleInputEmail2">发布部门:</label> <input type="email"
						class="form-control" placeholder="发布部门">
				</div>
				<button type="submit" class="btn btn-info">发布</button>
			</form>
			<table class="table table-bordered table-hover">
				<tr>
					<th></th>
					<th class="col-sm-2"><input type="checkbox" id="inform1">&nbsp;&nbsp;&nbsp;通告编号</th>
					<th class="col-sm-2  text-center">发布部门</th>
					<th class="col-sm-2  text-center">发布人</th>
					<th class="col-sm-2  text-center">发布时间</th>
					<th class="col-sm-2  text-center">通告标题</th>
					<th class="col-sm-2  text-center">操作</th>
				</tr>
				<tr>
					<td>1</td>
					<td><input type="checkbox" class="informid">&nbsp;INFO2017101117145</td>
					<td>南湖碧园</td>
					<td>南湖碧园</td>
					<td>2017-10-11 17:01:45</td>
					<td>123</td>
					<td>
						<ul class="list-unstyle list-inline">
							<li class="col-sm-4 text-center"><button
									class="btn btn-sm btn-info">修改</button></li>
							<li class="col-sm-4 text-center"><button
									class="btn btn-sm btn-danger" onclick="javascript:return del()">删除</button></li>
							<li class="col-sm-4 text-center"><button
									class="btn btn-sm btn-info">查看</button></li>
						</ul>
					</td>
				</tr>
				<tr>
					<td>2</td>
					<td><input type="checkbox" class="informid">
						&nbsp;INFO2017101117145</td>
					<td>南湖碧园</td>
					<td>南湖碧园</td>
					<td>2017-10-11 17:01:45</td>
					<td>123</td>
					<td>
						<ul class="list-unstyle list-inline">
							<li class="col-sm-4 text-center"><button
									class="btn btn-sm btn-info">修改</button></li>
							<li class="col-sm-4 text-center"><button
									class="btn btn-sm btn-danger" onclick="javascript:return del()">删除</button></li>
							<li class="col-sm-4 text-center"><button
									class="btn btn-sm btn-info">查看</button></li>
						</ul>
					</td>
				</tr>
				<tr>
					<td>3</td>
					<td><input type="checkbox" class="informid">&nbsp;INFO2017101117145</td>
					<td>南湖碧园</td>
					<td>南湖碧园</td>
					<td>2017-10-11 17:01:45</td>
					<td>123</td>
					<td>
						<ul class="list-unstyle list-inline">
							<li class="col-sm-4 text-center"><button
									class="btn btn-sm btn-info">修改</button></li>
							<li class="col-sm-4 text-center"><button
									class="btn btn-sm btn-danger" onclick="javascript:return del()">删除</button></li>
							<li class="col-sm-4 text-center"><button
									class="btn btn-sm btn-info">查看</button></li>
						</ul>
					</td>
				</tr>
				<tr>
					<td>4</td>
					<td><input type="checkbox" class="informid">&nbsp;INFO2017101117145</td>
					<td>南湖碧园</td>
					<td>南湖碧园</td>
					<td>2017-10-11 17:01:45</td>
					<td>123</td>
					<td>
						<ul class="list-unstyle list-inline">
							<li class="col-sm-4 text-center"><button
									class="btn btn-sm btn-info">修改</button></li>
							<li class="col-sm-4 text-center"><button
									class="btn btn-sm btn-danger" onclick="javascript:return del()">删除</button></li>
							<li class="col-sm-4 text-center"><button
									class="btn btn-sm btn-info">查看</button></li>
						</ul>
					</td>
				</tr>
			</table>
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
		<div class="modal fade" id="alter" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-body">
						<form action="" method="post" class="form-horizontal">
							<div class="form-group">
								&nbsp;&nbsp;&nbsp;&nbsp;通告标题：<input type="text"
									style="width:300px">
							</div>
							<div class="form-group">
								&nbsp;&nbsp;&nbsp;&nbsp;发布时间：<input type="text"
									style="width:300px">
							</div>
							<div class="form-group">
								&nbsp;&nbsp;&nbsp;&nbsp;发&nbsp;&nbsp;布&nbsp;&nbsp;人：<input
									type="text" style="width:300px">
							</div>
							<div class="form-group">
								&nbsp;&nbsp;&nbsp;&nbsp;通告类型：<select style="width:70px"></select><br>
							</div>
							通告内容：
							<textarea rows="8" cols="80"></textarea>
						</form>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">关闭</button>
							<button type="button" class="btn btn-primary">提交更改</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script>
		function del() {
			var text = "你确定要删除吗";
			if (confirm(text) == true) {
				return true;
			} else {
				return false;
			}
		}

		$("#inform1").click(function() {

			$(".informid").prop("checked", $(this).prop("checked"));
		});
	</script>
</body>

</html>