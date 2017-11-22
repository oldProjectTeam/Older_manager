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

<title>老人管理平台-用户自助中心</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="${APP_PATH}/static/oldfront/older/css/easyui.css"
	rel="stylesheet" type="text/css">
<link href="${APP_PATH}/static/oldfront/older/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${APP_PATH}/static/oldfront/older/css/layout.css"
	rel="stylesheet">
<link href="${APP_PATH}/static/oldfront/older/css/default.css"
	rel="stylesheet">
<link href="${APP_PATH}/static/oldfront/older/css/icon.css"
	rel="stylesheet">

<script src="${APP_PATH}/static/oldfront/older/js/jquery.js"></script>
<script src="${APP_PATH}/static/oldfront/older/js/json2.js"></script>
<script src="${APP_PATH}/static/oldfront/older/js/jquery.cookie.js"></script>
<script src="${APP_PATH}/static/oldfront/older/js/jquery.easyui.js"></script>
<script src="${APP_PATH}/static/oldfront/older/js/easyui-lang-zh_CN.js"></script>
<script src="${APP_PATH}/static/oldfront/older/js/KingonUI.js"></script>
</head>
<body style="overflow:auto;" class="layout panel-noscroll">
	<!--头部开始  -->
	<jsp:include page="header.jsp"></jsp:include>
	<!-- 主体部分开始 -->
	<div style="padding:111px 0 0;margin-bottom:15px;">
		<div class="container">
			<div class="row">
				<!-- 左侧导航菜单开始 -->
				<jsp:include page="left.jsp"></jsp:include>
				<!-- 左侧导航菜单结束 -->

				<!-- 右侧内容区开始 -->
				<div class="col-md-9" style="background:#fff;min-height:647px;">

					<div class="main">
						<!-- 关联老人开始 -->
						<div class="gllr" style="padding:0;">
							<div class="gllr-title">
								<div style="float:left">健康评估</div>
								<!--div style="float:right;"><button type="button" class="gllr-item-btn" onclick="add()" style="background:#13c0ab;color:#fff;margin:0;width:100px;">添加老人</button></div-->
								<button type="button" class="btn back fr" id="btnclose">返回</button>
							</div>
							<div id="DataList">
								<table
									class="table table-striped table-bordered table-hover text-center"
									id="tablecontent">
									<thead>
										<tr class="xy-head firstRow">
											<th style="width:20%">医生姓名</th>
											<th style="width:20%">健康状况</th>

											<th style="width:20%">健康数据评估</th>
											<th style="width:20%">医生建议</th>
										</tr>
									</thead>
									<tbody id="shuju">
										<tr style="height:40px">
											<td>高大神</td>
											<td>良好</td>
											<td>中等度热</td>
											<td>忌吃叫辣的东西</td>
										</tr>
									</tbody>
								</table>
								<!-- 列表结束 -->

							</div>
							<div class="row" style="margin-top:30px;">
								<div class="col-md-2 col-md-offset-4">
									<button type="button" onclick="Last()" class="gllr-item-btn">上一页</button>
								</div>
								<div class="col-md-2 ">
									<button type="button" onclick="Next()" class="gllr-item-btn">下一页</button>
								</div>
							</div>
						</div>
						<!-- 关联老人结束 -->
					</div>
				</div>
			</div>
<!--底部开始  -->
<jsp:include page="footer.jsp"></jsp:include>
<!-- 底部结束 -->
<script src="${APP_PATH}/static/oldfront/older/js/bootstrap.js"></script>
<script src="${APP_PATH}/static/oldfront/older/js/bootstrap.min.js"></script>
<script src="${APP_PATH}/static/oldfront/older/js/TableJS.js"
	type="text/javascript"></script>
<script src="${APP_PATH}/static/oldfront/older/js/md5.js"></script>
</body>
</html>
