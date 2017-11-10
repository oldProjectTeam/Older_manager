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

<title>订单详细</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link href="${APP_PATH}/static/shop/assets/css/bootstrap.min.css"
	rel="stylesheet" />
<link rel="stylesheet" href="${APP_PATH}/static/shop/css/style.css" />
<link href="${APP_PATH}/static/shop/assets/css/codemirror.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="${APP_PATH}/static/shop/assets/css/ace.min.css" />
<link rel="stylesheet"
	href="${APP_PATH}/static/shop/font/css/font-awesome.min.css" />
<link rel="stylesheet"
	href="${APP_PATH}/static/shop/assets/css/font-awesome.min.css" />
<script src="${APP_PATH}/static/shop/js/jquery-1.9.1.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/bootstrap.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/typeahead-bs2.min.js"></script>
<script type="text/javascript" src="${APP_PATH}/static/shop/js/H-ui.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/jquery.dataTables.min.js"></script>
<script
	src="${APP_PATH}/static/shop/assets/js/jquery.dataTables.bootstrap.js"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>
<script src="${APP_PATH}/static/shop/assets/laydate/laydate.js"
	type="text/javascript"></script>
<script
	src="${APP_PATH}/static/shop/assets/js/jquery.easy-pie-chart.min.js"></script>
<script src="${APP_PATH}/static/shop/js/lrtk.js" type="text/javascript"></script>
</head>

<body>
	<div class="margin clearfix">
		<div class="Order_Details_style">
			<div class="Numbering">
				订单编号:<b>NJHDXJ201509-001</b>
			</div>
		</div>
		<div class="detailed_style">
			<!--收件人信息-->
			<div class="Receiver_style">
				<div class="title_name">收件人信息</div>
				<div class="Info_style clearfix">
					<div class="col-xs-4">
						<label class="label_name" for="form-field-2"> 收件人姓名： </label>
						<div class="o_content">张孝全</div>
					</div>
					<div class="col-xs-4">
						<label class="label_name" for="form-field-2"> 收件人电话： </label>
						<div class="o_content">16543432343</div>
					</div>
					<div class="col-xs-4">
						<label class="label_name" for="form-field-2"> 收件地邮编： </label>
						<div class="o_content">104545</div>
					</div>
					<div class="col-xs-4">
						<label class="label_name" for="form-field-2"> 收件地址： </label>
						<div class="o_content">江苏南京市雨花台区郁金香软件大厦3懂3单元302室</div>
					</div>
				</div>
			</div>
			<!--订单信息-->
			<div class="product_style">
				<div class="title_name">产品信息</div>
				<div class="Info_style clearfix">
					<div class="product_info clearfix">
						<a href="#" class="img_link"><img
							src="${APP_PATH}/static/shop/products/p_3.jpg" width="200"
							height="200" /></a> <span> <a href="#" class="name_link">美果汇
								美国进口嘎啦果苹果6粒装 加力果 姬娜果 伽利果 新鲜应季水果</a> <b>也称为姬娜果，饱满色艳，个头小</b>
							<p>规格：500g/斤</p>
							<p>数量：2kg</p>
							<p>
								价格：<b class="price"><i>￥</i>56</b>
							</p>
							<p>
								状态：<i class="label label-success radius">有货</i>
							</p>
						</span>
					</div>
					<div class="product_info clearfix">
						<a href="#" class="img_link"><img
							src="${APP_PATH}/static/shop/products/p_5.jpg" width="200"
							height="200" /></a> <span> <a href="#" class="name_link">美果汇
								美国进口嘎啦果苹果6粒装 加力果 姬娜果 伽利果 新鲜应季水果</a> <b>也称为姬娜果，饱满色艳，个头小</b>
							<p>规格：39.9/5kg</p>
							<p>数量：2</p>
							<p>
								价格：<b class="price"><i>￥</i>69.9</b>
							</p>
							<p>
								状态：<i class="label label-success radius">有货</i>
							</p>
						</span>
					</div>
					<div class="product_info clearfix">
						<a href="#" class="img_link"><img
							src="${APP_PATH}/static/shop/products/p_8.jpg" width="200"
							height="200" /></a> <span> <a href="#" class="name_link">美果汇
								美国进口嘎啦果苹果6粒装 加力果 姬娜果 伽利果 新鲜应季水果</a> <b>也称为姬娜果，饱满色艳，个头小</b>
							<p>规格：500g/斤</p>
							<p>数量：2kg</p>
							<p>
								价格：<b class="price"><i>￥</i>56</b>
							</p>
							<p>
								状态：<i class="label label-success radius">有货</i>
							</p>
						</span>
					</div>
				</div>
			</div>
			<!--总价-->
			<div class="Total_style">
				<div class="Info_style clearfix">
					<div class="col-xs-4">
						<label class="label_name" for="form-field-2"> 支付方式： </label>
						<div class="o_content">在线支付</div>
					</div>
					<div class="col-xs-4">
						<label class="label_name" for="form-field-2"> 支付状态： </label>
						<div class="o_content">等待付款</div>
					</div>
					<div class="col-xs-4">
						<label class="label_name" for="form-field-2"> 订单生成日期： </label>
						<div class="o_content">2016-7-5</div>
					</div>
				</div>
				<div class="Total_m_style">
					<span class="Total">总数：<b>10</b></span><span class="Total_price">总价：<b>345</b>元
					</span>
				</div>
			</div>
			<div class="Button_operation">
				<button onclick="article_save_submit();"
					class="btn btn-primary radius" type="submit">
					<i class="icon-save "></i>返回上一步
				</button>

				<button onclick="layer_close();" class="btn btn-default radius"
					type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
			</div>
		</div>
	</div>
</body>
</html>