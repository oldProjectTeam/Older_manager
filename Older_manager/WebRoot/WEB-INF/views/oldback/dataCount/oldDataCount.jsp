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
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>
</head>
</head>

<body style="margin: 15px;">
	<div class="page-header">
		<h4>老人数据(按年龄阶段统计)</h4>
	</div>
	<div class="row">
		<!-- 按年龄阶段来统计老人数据  饼状图-->
		<div class="col-md-6">
			<div id="main" style="width: 600px;height:400px;"></div>
		</div>
		<!-- 按年龄阶段来统计老人数据  柱状图 -->
		<div class="col-md-6">
			<div id="main1" style="width: 600px;height:400px;"></div>
		</div>
	</div>
	<div class="page-header">
		<h4>老人数据(按地区分布统计)</h4>
	</div>
	<div class="row">
		<!-- 按分区来统计老人数据 -->
		<div class="col-md-6">
			<div id="main3" style="width: 600px;height:400px;"></div>
		</div>
		<!-- 按分区来统计老人数据 -->
		<div class="col-md-6">
			<div id="main4" style="width: 600px;height:400px;"></div>
		</div>
	</div>
	<script type="text/javascript">
		layer.msg('数据加载中...', {
			icon : 16,
			shade : 0.01
		});
		//饼状图获取数据
		$().ready(function() {
			var myChart = echarts.init(document.getElementById('main'));
			//图表显示提示信息
			myChart.showLoading();
			//定义图表options
			var options = {
				title : {
					x : 'center'
				},
				tooltip : {
					trigger : 'item',
					formatter : "{a} <br/>{b} : {c} ({d}%)"
				},
				legend : {
					orient : 'vertical',
					left : 'left',
					data : []
				},
				series : [ {
					name : '访问来源',
					type : 'pie',
					data : []
				} ]
			};
			//通过Ajax获取数据
			$.ajax({
				type : "post",
				async : false, //同步执行
				url : "data/oldManPieData",
				dataType : "json", //返回数据形式为json
				success : function(result) {
					if (result) {
						options.legend.data = result.legend;

						//将返回的category和series对象赋值给options对象内的category和series
						//因为xAxis是一个数组 这里需要是xAxis[i]的形式
						options.series[0].name = result.series[0].name;
						options.series[0].type = result.series[0].type;
						var serisdata = result.series[0].data;

						//jquery遍历
						var value = [];
						$.each(serisdata, function(i, p) {
							value[i] = {
								'name' : p['name'],
								'value' : p['value']
							};
						});
						options.series[0]['data'] = value;

						myChart.hideLoading();
						myChart.setOption(options);
					}
				},
				error : function(errorMsg) {
					alert("图表请求数据失败啦!");
					myChart.hideLoading();
				}
			});
		});

		//柱状图获取数据

		$().ready(function() {
			var myChart = echarts.init(document.getElementById('main1'));
			//图表显示提示信息
			myChart.showLoading();
			//定义图表options
			var options = {
				color : [ '#3398DB' ],
				tooltip : {
					trigger : 'axis'
				},
				legend : {
					data : []
				},
				toolbox : {
					show : true,
					feature : {
						mark : false
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
				url : "data/oldManBarData",
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

		/* 老人数据统计,按照地区统计 */
		//饼状图获取数据
		$().ready(function() {
			var myChart = echarts.init(document.getElementById('main3'));
			//图表显示提示信息
			myChart.showLoading();
			//定义图表options
			var options = {
				title : {
					x : 'center'
				},
				tooltip : {
					trigger : 'item',
					formatter : "{a} <br/>{b} : {c} ({d}%)"
				},
				legend : {
					orient : 'vertical',
					left : 'left',
					data : []
				},
				series : [ {
					name : '访问来源',
					type : 'pie',
					data : []
				} ]
			};
			//通过Ajax获取数据
			$.ajax({
				type : "post",
				async : false, //同步执行
				url : "data/oldManPieDataRegion",
				dataType : "json", //返回数据形式为json
				success : function(result) {
					if (result) {
						options.legend.data = result.legend;

						//将返回的category和series对象赋值给options对象内的category和series
						//因为xAxis是一个数组 这里需要是xAxis[i]的形式
						options.series[0].name = result.series[0].name;
						options.series[0].type = result.series[0].type;
						var serisdata = result.series[0].data;

						//jquery遍历
						var value = [];
						$.each(serisdata, function(i, p) {
							value[i] = {
								'name' : p['name'],
								'value' : p['value']
							};
						});
						options.series[0]['data'] = value;

						myChart.hideLoading();
						myChart.setOption(options);
					}
				},
				error : function(errorMsg) {
					alert("图表请求数据失败啦!");
					myChart.hideLoading();
				}
			});
		});
		//老人数据,按照地区分布,柱状图
		$().ready(function() {
			var myChart = echarts.init(document.getElementById('main4'));
			//图表显示提示信息
			myChart.showLoading();
			//定义图表options
			var options = {
				color : [ '#3398DB' ],
				tooltip : {
					trigger : 'axis'
				},
				legend : {
					data : []
				},
				toolbox : {
					show : true,
					feature : {
						mark : false
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
				url : "data/oldManBarDataRegion",
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
