<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
								<button type="button" class="btn back fr" 
							onClick="javascript:history.go(-1);">返回</button>
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
										<c:forEach items="${pageInfo.list}" var="assess">
											<tr style="height:40px">
												<td>${assess.doctor}</td>
												<td>${assess.health}</td>
												<td>${assess.healthdataassessment}</td>
												<td>${assess.suggest}</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
								<!-- 列表结束 -->
							</div>
							<div class="row" style="margin-top:30px;">
								<div class="col-md-2 col-md-offset-4">
									<c:if test="${pageInfo.hasPreviousPage}">
										<button type="button" onclick="Last(${pageInfo.pageNum})"
											class="gllr-item-btn">上一页</button>
									</c:if>
								</div>
								<div class="col-md-2 ">
									<c:if test="${pageInfo.hasNextPage}">
										<button type="button" onclick="Next(${pageInfo.pageNum})"
											class="gllr-item-btn">下一页</button>
									</c:if>
								</div>
							</div>
						</div>
						<!-- 关联老人结束 -->
					</div>
				</div>
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

	<script type="text/javascript">
		function Last(pn) {
			window.location.href = "${APP_PATH}/older/pinggu/" + pn + "&"
					+ ${older.oldman.id};
		}
		function Next(pn) {
			window.location.href = "${APP_PATH}/older/pinggu/" + pn + "&"
					+ ${older.oldman.id};
		}
	</script>
</body>
</html>
