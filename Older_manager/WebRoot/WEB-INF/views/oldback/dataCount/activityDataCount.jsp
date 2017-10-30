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

<title></title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css"
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script type="text/javascript"
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script language="JavaScript"
	src="${APP_PATH}/static/js/jquery-3.2.1.min.js"></script>
<script language="JavaScript" src="${APP_PATH}/static/js/echarts.min.js"></script>
</head>

<body style="margin: 15px;">
	<!-- 活动统计 -->
	<div class="page-header">
		<h4>活动统计</h4>
	</div>
	<div class="col-md-4 col-md-offset-3">
		<div id="main" style="width: 600px;height:400px;"></div>
	</div>
	<script type="text/javascript">
		$().ready(function() {
			var myChart = echarts.init(document.getElementById('main'));
			//图表显示提示信息
			myChart.showLoading();
			//定义图表options
			var options = {
				title : {
					text : '老人参加活动的统计',
					subtext : '活动统计'
				},
				tooltip : {
					trigger : 'axis'
				},
				legend : {
					data : [ '活动统计' ]
				},
				toolbox : {
					show : true,
					feature : {
						dataView : {
							show : true,
							readOnly : false
						},
						magicType : {
							show : true,
							type : [ 'line', 'bar' ]
						},
						restore : {
							show : true
						},
						saveAsImage : {
							show : true
						}
					}
				},
				calculable : true,
				xAxis : [ {
					type : 'category',
					data : []
				} ],
				yAxis : [ {
					type : 'value',
					splitArea : {
						show : true
					}
				} ],
				series : [ {
					barWidth : '60%'
				} ]
			};

			//通过Ajax获取数据
			$.ajax({
				type : "post",
				async : false, //同步执行
				url : "activity/activityBarData",
				dataType : "json", //返回数据形式为json
				success : function(result) {
					if (result) {
						//将返回的category和series对象赋值给options对象内的category和series
						//因为xAxis是一个数组 这里需要是xAxis[i]的形式
						options.xAxis[0].data = result.category;
						options.series = result.series;
						options.legend.data = result.legend;

						myChart.hideLoading();
						myChart.setOption(options);
					}
				},
				error : function(errorMsg) {
					alert("图表请求数据失败啦!");
				}
			});

		});
	</script>
</body>
</html>
