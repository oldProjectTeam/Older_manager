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

<title></title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="${APP_PATH}/static/shop/assets/css/bootstrap.min.css"
	rel="stylesheet" />
<link rel="stylesheet" href="${APP_PATH}/static/shop/css/style.css" />
<link rel="stylesheet"
	href="${APP_PATH}/static/shop/assets/css/font-awesome.min.css" />
<link rel="stylesheet"
	href="${APP_PATH}/static/shop/assets/css/font-awesome.min.css" />
<link href="${APP_PATH}/static/shop/assets/css/codemirror.css"
	rel="stylesheet">
<script src="${APP_PATH}/static/shop/assets/js/ace-extra.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/jquery.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/dist/echarts.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/bootstrap.min.js"></script>

</head>

<body>
	<div class="page-content clearfix">
		<div class="alert alert-block alert-success">
			<button type="button" class="close" data-dismiss="alert">
				<i class="icon-remove"></i>
			</button>
			<i class="icon-ok green"></i>欢迎使用<strong class="green">后台管理系统</strong>,你本次登陆时间为${activeUser.shopIndexInfo.loginTime}，登陆IP:${activeUser.shopIndexInfo.loginIP}.
		</div>
		<div class="state-overview clearfix">
			<div class="col-lg-3 col-sm-6">
				<section class="panel">
				<div class="symbol terques">
					<i class="icon-user"></i>
				</div>
				<div class="value">
					<h1>${activeUser.shopIndexInfo.shopUsers}</h1>
					<p>商城用户</p>
				</div>
				</section>
			</div>
			<div class="col-lg-3 col-sm-6">
				<section class="panel">
				<div class="symbol red">
					<i class="icon-tags"></i>
				</div>
				<div class="value">
					<h1>${activeUser.shopIndexInfo.saleRecord}</h1>
					<p>分销记录</p>
				</div>
				</section>
			</div>
			<div class="col-lg-3 col-sm-6">
				<section class="panel">
				<div class="symbol yellow">
					<i class="icon-shopping-cart"></i>
				</div>
				<div class="value">
					<h1>${activeUser.shopIndexInfo.shopOrders}</h1>
					<p>商城订单</p>
				</div>
				</section>
			</div>
			<div class="col-lg-3 col-sm-6">
				<section class="panel">
				<div class="symbol blue">
					<i class="icon-bar-chart"></i>
				</div>
				<div class="value">
					<h1>￥${activeUser.shopIndexInfo.tradeRecord}</h1>
					<p>交易记录</p>
				</div>
				</section>
			</div>
		</div>
		<!--实时交易记录-->
		<div>
			<div class="t_Record">
				<div id="main"
					style="height:300px; overflow:hidden; width:100%; overflow:auto"></div>
			</div>
			<div class="news_style">
				<div class="title_name">最新消息</div>
				<ul class="list">
					<li><i class="icon-bell red"></i><a href="#">暂时没有最新消息。</a></li>
				</ul>
			</div>
		</div>

		<script type="text/javascript">
			$().ready(function() {
				$(".t_Record").width($(window).width() - 320);
				//当文档窗口发生改变时 触发  
				$(window).resize(function() {
					$(".t_Record").width($(window).width() - 320);
				});
			});

			require.config({
				paths : {
					echarts : './static/shop/assets/dist'
				}
			});
			require([ 'echarts', 'echarts/theme/macarons',
					'echarts/chart/line', // 按需加载所需图表，如需动态类型切换功能，别忘了同时加载相应图表
					'echarts/chart/bar' ], function(ec, theme) {
				var myChart = ec.init(document.getElementById('main'), theme);
				//图表显示提示信息
				myChart.showLoading();
				//定义图表options
				var options = {
					title : {
						text : '月购买订单交易记录',
						subtext : '实时获取用户订单购买记录'
					},
					tooltip : {
						trigger : 'axis'
					},
					legend : {
						data : []
					},
					toolbox : {
						show : true,
						feature : {
							mark : {
								show : true
							},
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
						type : 'value'
					} ],
					series : []
				};

				//通过Ajax获取数据
				$.ajax({
					type : "post",
					async : false, //同步执行
					url : "shop/orderInfo",
					dataType : "json", //返回数据形式为json
					success : function(result) {
						console.log(result);
						if (result != null) {
							//将返回的category和series对象赋值给options对象内的category和series
							//因为xAxis是一个数组 这里需要是xAxis[i]的形式
							options.xAxis[0].data = result.category;
							options.series = result.serie;
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

			/* $(document).ready(function() {

			$(".t_Record").width($(window).width() - 320);
			//当文档窗口发生改变时 触发  
			$(window).resize(function() {
				$(".t_Record").width($(window).width() - 320);
			});
			});

			require.config({
			paths : {
				echarts : './static/shop/assets/dist'
			}
			});
			require([ 'echarts', 'echarts/theme/macarons',
				'echarts/chart/line', // 按需加载所需图表，如需动态类型切换功能，别忘了同时加载相应图表
				'echarts/chart/bar' ], function(ec, theme) {
			var myChart = ec.init(document.getElementById('main'), theme);
			option = {
				title : {
					text : '月购买订单交易记录',
					subtext : '实时获取用户订单购买记录'
				},
				tooltip : {
					trigger : 'axis'
				},
				legend : {
					data : [ '所有订单', '待付款', '已付款', '代发货' ]
				},
				toolbox : {
					show : true,
					feature : {
						mark : {
							show : true
						},
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
					data : [ '1月', '2月', '3月', '4月', '5月', '6月', '7月',
							'8月', '9月', '10月', '11月', '12月' ]
				} ],
				yAxis : [ {
					type : 'value'
				} ],
				series : [
						{
							name : '所有订单',
							type : 'bar',
							data : [ 120, 49, 70, 232, 256, 767, 1356,
									1622, 326, 200, 164, 133 ],
							markPoint : {
								data : [ {
									type : 'max',
									name : '最大值'
								}, {
									type : 'min',
									name : '最小值'
								} ]
							}
						},
						{
							name : '待付款',
							type : 'bar',
							data : [ 26, 59, 30, 84, 27, 77, 176, 1182,
									487, 188, 60, 23 ],
							markPoint : {
								data : [ {
									name : '年最高',
									value : 1182,
									xAxis : 7,
									yAxis : 1182,
									symbolSize : 18
								}, {
									name : '年最低',
									value : 23,
									xAxis : 11,
									yAxis : 3,
									symbolSize : 18
								} ]
							},

						},
						{
							name : '已付款',
							type : 'bar',
							data : [ 26, 59, 60, 264, 287, 77, 176, 122,
									247, 148, 60, 23 ],
							markPoint : {
								data : [ {
									name : '年最高',
									value : 172,
									xAxis : 7,
									yAxis : 172,
									symbolSize : 18
								}, {
									name : '年最低',
									value : 23,
									xAxis : 11,
									yAxis : 3,
									symbolSize : 18
								} ]
							},

						},
						{
							name : '代发货',
							type : 'bar',
							data : [ 26, 59, 80, 24, 87, 70, 175, 1072, 48,
									18, 69, 63 ],
							markPoint : {
								data : [ {
									name : '年最高',
									value : 1072,
									xAxis : 7,
									yAxis : 1072,
									symbolSize : 18
								}, {
									name : '年最低',
									value : 22,
									xAxis : 11,
									yAxis : 3,
									symbolSize : 18
								} ]
							},

						} ]
			};

			myChart.setOption(option);
			});  */
		</script>
	</div>
</body>
</html>
