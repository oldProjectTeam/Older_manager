<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	pageContext.setAttribute("APP_PATH", request.getContextPath());
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'refund.jsp' starting page</title>

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
<link href="${APP_PATH}/static/css/refstyle.css" rel="stylesheet"
	type="text/css">

<script src="${APP_PATH}/static/js/jquery.min.js" type="text/javascript"></script>
<script src="${APP_PATH}/static/js/amazeui.js" type="text/javascript"></script>
<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery-1.7.2.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>

<script language="JavaScript"
	src="${APP_PATH}/static/js/uploadPreview.js"></script>


</head>

<body>
	<jsp:include page="../home/shopheader.jsp"></jsp:include>
	<div class="nav-table">
		<div class="long-title">
			<span class="all-goods">全部分类</span>
		</div>
		<div class="nav-cont">
			<ul>
				<li class="index"><a href="#">首页</a></li>
				<li class="qc"><a href="#">闪购</a></li>
				<li class="qc"><a href="#">限时抢</a></li>
				<li class="qc"><a href="#">团购</a></li>
				<li class="qc last"><a href="#">大包装</a></li>
			</ul>
			<div class="nav-extra">
				<i class="am-icon-user-secret am-icon-md nav-user"></i><b></b>我的福利 <i
					class="am-icon-angle-right" style="padding-left: 10px;"></i>
			</div>
		</div>
	</div>
	<b class="line"></b>
	<div class="center">
		<div class="col-main">
			<div class="main-wrap">
				<!--标题 -->
				<div class="am-cf am-padding">
					<div class="am-fl am-cf">
						<strong class="am-text-danger am-text-lg">退换货申请</strong> / <small>Apply&nbsp;for&nbsp;returns</small>
					</div>
				</div>
				<hr />
				<div class="comment-list">
					<form action="" id="formid" enctype="multipart/form-data">


						<div class="">
							<c:forEach items="${list}" var="list" varStatus="v">

								<input type="hidden" name="chno" value="${list.orders.id}">






								<div class="item-pic">
									<a href="product/getProduct/${list.products.id}"
										class="J_MakePoint"> <%-- <img src="${APP_PATH}/static/images/comment.jpg_400x400.jpg" class="itempic"> --%>
										<img src="${list.products.images}" class="itempic">
									</a>
								</div>

								<div class="item-title">

									<div class="item-name">
										<a href="product/getProduct/${list.products.id}">
											<p class="item-basic-info">${list.producctname}</p>
										</a>
									</div>
									<div class="info-little">
										<span>${list.products.synopsis}</span> <span>包装：裸装</span>
										<%-- <p>${list.producctname}</p>
									<p class="info-little">${list.products.synopsis}
										<br />包装：裸装
									</p> --%>
									</div>
								</div>
								<div class="item-info">
									<div class="item-ordernumber">
										<span class="info-title">订单编号：</span><a>${list.orders.orderNo}</a>
									</div>
									<div class="item-price">
										<span class="info-title">价&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;格：</span><span
											class="price">${list.products.nowprice}元</span> <span
											class="number">×${list.number}</span><span class="item-title">(数量)</span>
									</div>
									<div class="item-pay-logis">
										<span class="info-title">含&nbsp;&nbsp;运&nbsp;费：</span><span
											class="price">${list.orders.freight}元</span>
									</div>
									<div class="item-amountall">
										<c:set var="sum" value="${list.baseprice*list.number}"></c:set>
										<span class="info-title">总&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;计：</span><span
											class="amountall">${sum}元</span>
									</div>
									<div class="item-time">
										<input value="${list.orders.cost}" id="cost" type="hidden">
										<span class="info-title">成交时间：</span><span class="time"><fmt:formatDate
												value="${list.orders.creattime}" pattern="yyyy-MM-dd" /></span>
									</div>

								</div>
								<hr>
							</c:forEach>
							<!-- <div class="clear"></div> -->
						</div>

						<div class="refund-main" style="width:100%">
							<div class="item-comment">
								<div class="am-form-group">
									<label for="refund-type" class="am-form-label">退款类型</label>
									<div class="am-form-content">
										<input type="text" id="refund-money" name="chtype"
											value="退款/退货" readonly="readonly" placeholder="退款/退货">
									</div>
								</div>

								<div class="am-form-group">
									<label for="refund-reason" class="am-form-label">退款原因</label>
									<div class="am-form-content">
										<select data-am-selected="" name="chwhy" id="selectid">
											<option value="a" selected>请选择退款原因</option>
											<option value="没收到货">没收到货</option>
											<option value="与说明不符">与说明不符</option>
										</select>
									</div>
								</div>

								<div class="am-form-group">
									<label for="refund-money" class="am-form-label">退款金额<span>（不可修改）</span></label>
									<div class="am-form-content">
										<input type="text" id="costid" readonly="readonly"
											name="chmoeny">
									</div>
								</div>
								<div class="am-form-group">
									<label for="refund-info" class="am-form-label">退款说明<span>（可不填）</span></label>
									<div class="am-form-content">
										<textarea placeholder="请输入退款说明" required="required"
											name="chcontent" id="contentid"></textarea>
									</div>
								</div>

							</div>
							<div class="refund-tip">
								<div class="filePic">
									<input type="file" class="inputPic" id="up_img" value="选择凭证图片"
										name="file" max="5" maxsize="5120"
										allowexts="gif,jpeg,jpg,png,bmp" accept="image/*"> <img
										src="${pageContext.request.contextPath}/upload/${user.image==null?'image.jpg':user.image}"
										id="imgShow" class="itempic J_ItemImg">
								</div>
								<span class="desc"></span>
							</div>
							<div class="info-btn">
								<div class="am-btn am-btn-danger" id="saveid">提交申请</div>
							</div>
						</div>
					</form>
				</div>
				<div class="clear"></div>
			</div>
			<!--底部-->
			<jsp:include page="footer.jsp"></jsp:include>
		</div>
		<jsp:include page="left.jsp"></jsp:include>
	</div>
	<script type="text/javascript">
		window.onload = function() {
			new uploadPreview({
				UpBtn : "up_img",
				ImgShow : "imgShow"
			});
		};
		$(function() {
			$("#costid").val($("#cost").val());
		});
		//保存申请
		$("#saveid").click(
				function() {
					if ($("#selectid").val() != 'a') {

						var kk = /^[\u4E00-\u9FA5A-Za-z0-9]/;
						if ($("#contentid").val() == ""
								|| !kk.test($("#contentid").val())) {
							layer.msg("请合理填写退款说明");
						} else {

							$.ajax({
								url : "order/addordercomment",
								type : "POST",
								data : new FormData($("#formid")[0]),
								cache : false,
								processData : false,
								contentType : false,
								success : function(result) {
									if (result.code == 100) {
										layer.msg("申请成功");

									} else {
										layer.msg("亲！已经申请过了");

									}
								}
							});
						}

					} else {
						layer.msg("请选着退款原因");
					}

				});
	</script>
</body>

</html>