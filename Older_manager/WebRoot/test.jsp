<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	pageContext.setAttribute("APP_PATH", request.getContextPath());
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'test.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script src="${APP_PATH}/static/layui/layui.js" type="text/javascript"></script>
<link rel="stylesheet" href="${APP_PATH}/static/layui/css/layui.css" />
<script src="${APP_PATH}/static/shop/assets/js/jquery.min.js"></script>
</head>

<body>
	<table class="layui-table"
		lay-data="{height:332, url:'activity/test', page:true, id:'idTest'}"
		lay-filter="demo">
		<thead>
			<tr>
				<th lay-data="{field:'id', width:80, sort: true, fixed: true}">ID</th>
				<th lay-data="{field:'title', width:80}">标题</th>
				<th lay-data="{field:'releasetime', width:80, sort: true}">发布时间</th>
				<th
					lay-data="{fixed: 'right', width:160, align:'center', toolbar: '#barDemo'}"></th>
			</tr>
		</thead>
	</table>

	<script type="text/html" id="barDemo">
  <a class="layui-btn layui-btn-primary layui-btn-mini" lay-event="detail">查看</a>
  <a class="layui-btn layui-btn-mini" lay-event="edit">编辑</a>
  <a class="layui-btn layui-btn-danger layui-btn-mini" lay-event="del">删除</a>
</script>
	<script>
		layui.use('table', function() {
			var table = layui.table;
		});
	</script>
</body>
</html>
