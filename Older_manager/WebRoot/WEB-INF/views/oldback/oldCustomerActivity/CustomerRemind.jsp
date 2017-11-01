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

<title>My JSP 'CustomerActivity.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
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
	<div class="col-sm-12">
		<div class="row">
			<div class="col-md-12">
				<ol class="breadcrumb">
					<li><b>位置：客户关系管理</b></li>
					<li>提醒记录</li>
				</ol>
			</div>
		</div>



		<table class="table table-hover table-bordered">
			<thead>
				<tr>
					<th><input name="" type="checkbox" value="" id="activity" /></th>
					<th>编号<i class="sort"><img src="images/px.gif" /></i></th>
					<th>老人的姓名</th>
					<th>上次回访的时间</th>
					<th>上次回访的内容</th>
					<th>上次回访人员</th>
					<th>未访问的天数</th>
					<th>老人所属服务点</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><input name="" type="checkbox" value="" class="activityid" /></td>
					<td>20130908</td>
					<td>王金平</td>
					<td>20130908</td>
					<td>和老人聊了他的家庭情况</td>
					<td>李宇春</td>
					<td>15天</td>
					<td>通州湾服务点</td>
					<td><a href="#" class="click"> 删除</a></td>
				</tr>
				<tr>
					<td><input name="" type="checkbox" value="" class="activityid" /></td>
					<td>20130908</td>
					<td>王金平</td>
					<td>20130908</td>
					<td>和老人聊了他的家庭情况</td>
					<td>李宇春</td>
					<td>15天</td>
					<td>通州湾服务点</td>
					<td><a href="#" class="click"> 删除</a></td>
				</tr>
				<tr>
					<td><input name="" type="checkbox" value="" class="activityid" /></td>
					<td>20130908</td>
					<td>王金平</td>
					<td>20130908</td>
					<td>和老人聊了他的家庭情况</td>
					<td>李宇春</td>
					<td>15天</td>
					<td>通州湾服务点</td>
					<td><a href="#" class="click"> 删除</a></td>
				</tr>
				<tr>
					<td><input name="" type="checkbox" value="" class="activityid" /></td>
					<td>20130908</td>
					<td>王金平</td>
					<td>20130908</td>
					<td>和老人聊了他的家庭情况</td>
					<td>李宇春</td>
					<td>15天</td>
					<td>通州湾服务点</td>
					<td><a href="#" class="click"> 删除</a></td>
				</tr>
				<tr>
					<td><input name="" type="checkbox" value="" class="activityid" /></td>
					<td>20130908</td>
					<td>王金平</td>
					<td>20130908</td>
					<td>和老人聊了他的家庭情况</td>
					<td>李宇春</td>
					<td>15天</td>
					<td>通州湾服务点</td>
					<td><a href="#" class="click"> 删除</a></td>
				</tr>
				<tr>
					<td><input name="" type="checkbox" value="" class="activityid" /></td>
					<td>20130908</td>
					<td>王金平</td>
					<td>20130908</td>
					<td>和老人聊了他的家庭情况</td>
					<td>李宇春</td>
					<td>15天</td>
					<td>通州湾服务点</td>
					<td><a href="#" class="click"> 删除</a></td>
				</tr>
				<tr>
					<td><input name="" type="checkbox" value="" class="activityid" /></td>
					<td>20130908</td>
					<td>王金平</td>
					<td>20130908</td>
					<td>和老人聊了他的家庭情况</td>
					<td>李宇春</td>
					<td>15天</td>
					<td>通州湾服务点</td>
					<td><a href="#" class="click"> 删除</a></td>
				</tr>
				<tr>
					<td><input name="" type="checkbox" value="" class="activityid" /></td>
					<td>20130908</td>
					<td>王金平</td>
					<td>20130908</td>
					<td>和老人聊了他的家庭情况</td>
					<td>李宇春</td>
					<td>15天</td>
					<td>通州湾服务点</td>
					<td><a href="#" class="click"> 删除</a></td>
				</tr>
			</tbody>
		</table>

		<div class="pagin">
			<div class="message">
				共<i class="blue">258</i>条记录，当前显示第&nbsp;<i class="blue">1&nbsp;</i>页
			</div>
			<ul class="paginList">
				<li class="paginItem"><a href="javascript:;"><span
						class="pagepre"></span></a></li>
				<li class="paginItem current"><a href="javascript:;">1</a></li>
				<li class="paginItem"><a href="javascript:;">2</a></li>
				<li class="paginItem"><a href="javascript:;">3</a></li>
				<li class="paginItem"><a href="javascript:;">4</a></li>
				<li class="paginItem"><a href="javascript:;">5</a></li>
				<li class="paginItem more"><a href="javascript:;">...</a></li>
				<li class="paginItem"><a href="javascript:;">10</a></li>
				<li class="paginItem"><a href="javascript:;"><span
						class="pagenxt"></span></a></li>
			</ul>
		</div>
	</div>

</body>
</html>
