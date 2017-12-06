<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	pageContext.setAttribute("APP_PATH", request.getContextPath());
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>购物商城-交易详情</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="${APP_PATH}/static/css/admin.css" rel="stylesheet"
	type="text/css">
<link href="${APP_PATH}/static/css/amazeui.css" rel="stylesheet"
	type="text/css">

<link href="${APP_PATH}/static/css/personal.css" rel="stylesheet"
	type="text/css">
<link href="${APP_PATH}/static/css/orstyle.css" rel="stylesheet"
	type="text/css">

<script src="${APP_PATH}/static/js/jquery.min.js"></script>
<script src="${APP_PATH}/static/js/amazeui.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	//订单进度条处理
	if("${order.state}"=='待发货'){
		$("#daifa").addClass("step-3");
		$("#queshou").addClass("step-3");
		$("#jiaoyi").addClass("step-3");
		$(".Mystatus").html("等待卖家发货");
		
	}else if("${order.state}"=='待收货'){
		$("#daifa").addClass("step-2");
		$("#queshou").addClass("step-3");
		$("#jiaoyi").addClass("step-3");
		$(".Mystatus").html("卖家已发货");
	}else if("${order.state}"=='待评价'){
		$("#daifa").addClass("step-2");
		$("#queshou").addClass("step-2");
		$("#jiaoyi").addClass("step-2");
		$(".Mystatus").html("交易完成");
		$(".anniu").addClass("am-disabled");
	}
});

//确定收货按钮
function suresh(id,n) {
	layer.confirm("确认收货吗", function() {
		$.ajax({
			url : "${APP_PATH}/order/updatestate/" + id + "&"
					+ n,
			type : "POST",
			success : function(result) {
				if (result.code == 100) {
					layer.msg("感谢你的支持");
					$(".anniu").addClass("am-disabled");
					$(".anniu").html("已收货");
					$("#queshou").addClass("step-2");
					$("#jiaoyi").addClass("step-2");
					$(".Mystatus").html("交易完成");
				}
			}
		});
	});
}
</script>

</head>

<body>
	<jsp:include page="../home/shopheader.jsp"></jsp:include>
	<div class="nav-table">
		<div class="long-title">
			<span class="all-goods">全部分类</span>
		</div>
		<div class="nav-cont">
			<ul>
				<li class="index"><a href="${APP_PATH}/shop/oldfronthome">首页</a></li>
			</ul>
		</div>
	</div>
	<b class="line"></b>
	<div class="center">
		<div class="col-main">
			<div class="main-wrap">

				<div class="user-orderinfo">

					<!--标题 -->
					<div class="am-cf am-padding">
						<div class="am-fl am-cf">
							<strong class="am-text-danger am-text-lg">订单详情</strong> / <small>Order&nbsp;details</small>
						</div>
					</div>
					<hr />
					<!--进度条-->
					<div class="m-progress">
						<div class="m-progress-list">
							<span class="step-1 step ">
							    <em class="u-progress-stage-bg"></em>
								<i class="u-stage-icon-inner">1<em class="bg"></em></i>
								<p class="stage-name">拍下商品</p>
							</span>
							<span class="step-2 step">
								<em class="u-progress-stage-bg"></em>
								<i class="u-stage-icon-inner">2<em class="bg"></em></i>
								<p class="stage-name">等待发货</p>
							</span>
							<span class="step" id="daifa">
								<em class="u-progress-stage-bg"></em>
								<i class="u-stage-icon-inner">3<em class="bg"></em></i>
								<p class="stage-name">卖家发货</p>
							</span>
							<span class="step" id="queshou">
								<em class="u-progress-stage-bg"></em>
								<i class="u-stage-icon-inner">4<em class="bg"></em></i>
								<p class="stage-name">确认收货</p>
							</span>
							<span class="step" id="jiaoyi">
								<em class="u-progress-stage-bg"></em> 
								<i class="u-stage-icon-inner">5<em class="bg"></em></i>
								<p class="stage-name">交易完成</p>
							</span>
							<span class="u-progress-placeholder"></span>
						</div>
						<div class="u-progress-bar total-steps-2">
							<div class="u-progress-bar-inner"></div>
						</div>
					</div>
					<div class="order-infoaside">
						<div class="order-logistics">
						  <c:if test="${order.orders4!=null}">
						  		<a href="${APP_PATH}/order/logistic/${order.id}">
								<div class="icon-log">
									<i><img src="http://gyadmin-1252357563.file.myqcloud.com/images/receive.png"></i>
								</div>
								<div class="latest-logistics">
									<p class="text">${order.state=='待评价'?'已签收,感谢使用 ${order.formulaway}快递，期待再次为您服务':'运输中，请耐心等待'}</p>
									<div class="time-list">
										<!-- <span class="date">2015-12-19</span>
										<span class="week">周六</span>
										<span class="time">15:35:42</span> -->
									</div>
									<div class="inquire">
										<span class="package-detail">物流：${order.formulaway }快递&nbsp;&nbsp;</span>
										<span class="package-detail">快递单号: </span>
										<span class="package-number">${order.orders4}</span> <a
											href="${APP_PATH}/order/logistic/${order.id}">&nbsp;&nbsp;<font color="red">查看物流</font></a>
									</div>
								</div> <span class="am-icon-angle-right icon"></span>
							</a>
						  </c:if>
						  <c:if test="${order.orders4==null}">
								<div class="icon-log">
									<i><img src="${APP_PATH}/static/images/receive.png"></i>
								</div>
								<div class="latest-logistics">
									<p class="text">亲，暂无物流信息，请耐心等待，卖家已经准备发货拉</p>
									<div class="time-list">
										 
									</div>
									<div class="inquire">
										<span class="package-detail">物流：${order.formulaway }快递</span>
										 <span class="package-number"></span>
									</div>
								</div> <span class="am-icon-angle-right icon"></span>
						  </c:if>
							<div class="clear"></div>
						</div>
						<div class="order-addresslist">
							<div class="order-address">
								<div class="icon-add"></div>
								<p class="new-tit new-p-re">
									<span class="new-txt">${order.shippingaddress.name}</span>
									<span class="new-txt-rd2">${order.shippingaddress.phone}</span>
								</p>
								<div class="new-mu_l2a new-p-re">
									<p class="new-mu_l2cw">
										<span class="title">收货地址：</span>
										<span class="province">${order.shippingaddress.location}</span>
										<!-- <span class="city">武汉</span>市
										<span class="dist">洪山</span> -->
										 <span class="street">${order.shippingaddress.detailaddress}</span>
									</p>
								</div>
							</div>
						</div>
					</div>
					<div class="order-infomain">

						<div class="order-top">
							<div class="th th-item">
								<td class="td-inner">商品</td>
							</div>
							<div class="th th-price">
								<td class="td-inner">单价</td>
							</div>
							<div class="th th-number">
								<td class="td-inner">数量</td>
							</div>
							<div class="th th-operation">
								<td class="td-inner">商品操作</td>
							</div>
							<div class="th th-amount">
								<td class="td-inner">合计</td>
							</div>
							<div class="th th-status">
								<td class="td-inner">交易状态</td>
							</div>
							<div class="th th-change">
								<td class="td-inner">交易操作</td>
							</div>
						</div>

						<div class="order-main">

							<div class="order-status3">
								<div class="order-title">
									<div class="dd-num">
										订单编号：<a href="javascript:;">${order.orderNo }</a>
									</div>
									<span>成交时间：
									<fmt:formatDate value="${order.creattime}" pattern="yyyy-MM-dd HH:mm:ss" /></span>
									<!--    <em>店铺：小桔灯</em>-->
								</div>
								<div class="order-content">
									<div class="order-left">
									  <c:forEach items="${order.orderdetails}" var="o">
										<ul class="item-list">
											<li class="td td-item">
												<div class="item-pic">
													<a href="${APP_PATH}/product/getProduct/${o.product.id}" class="J_MakePoint">
													<img
														src="http://123.207.93.53/Older_back/${o.product.images}"
														class="itempic J_ItemImg" >
													</a>
												</div>
												<div class="item-info">
													<div class="item-basic-info">
														<a href="${APP_PATH}/product/getProduct/${o.product.id}">
															<p>${o.product.name}</p>
															<p class="info-little">
															包装：裸装 </p>
														</a>
													</div>
												</div>
											</li>
											<li class="td td-price">
												<div class="item-price">${o.product.nowprice}</div>
											</li>
											<li class="td td-number">
												<div class="item-number">
													<span>×</span>${o.number}
												</div>
											</li>
											<li class="td td-operation">
												<div class="item-operation">
												<a href="${APP_PATH }/order/selectorderdetailbyorderno/${order.id}">
													申请退款/退货
												</a>
												</div>
											</li>
										</ul>
									</c:forEach> 
									</div>
									<div class="order-right">
										<li class="td td-amount">
											<div class="item-amount">
												合计：${order.cost}
												<p>
													含运费：<span>${order.freight}</span>
												</p>
											</div>
										</li>
										<div class="move-right">
											<li class="td td-status">
												<div class="item-status">
													<p class="Mystatus"></p>
													<br>
													<p class="order-info">
														<a href="${APP_PATH}/order/logistic/${order.id}">查看物流</a>
													</p>
												</div>
											</li>
											<li class="td td-change">
												<div class="am-btn am-btn-danger anniu" onClick="suresh('${order.id}',2)">确认收货</div>
											</li>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!--底部-->
			<jsp:include page="footer.jsp"></jsp:include>
		</div>
		<jsp:include page="left.jsp"></jsp:include>
	</div>
</body>
</html>