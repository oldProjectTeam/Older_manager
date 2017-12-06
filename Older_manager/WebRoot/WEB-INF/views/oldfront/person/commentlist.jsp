<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	pageContext.setAttribute("APP_PATH", request.getContextPath());
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>商品评价</title>

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


<link href="${APP_PATH}/static/css/appstyle.css" rel="stylesheet"
	type="text/css">
<script src="${APP_PATH}/static/js/jquery-3.2.1.min.js"
	type="text/javascript"></script>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>
<style type="text/css">
.item-opinion1 {
	position: relative;
	left: 200px;
	top: 0px;
	right: 0px;
	width: auto;
	max-width: 100%;
	margin-top: 10px;
	margin-bottom: 40px;
}

.item-opinion1 li {
	float: left;
	margin-left: 20px;
}

.item-opinion2 {
	position: absolute;
	left: 200px;
	top: 0px;
	right: 150px;
	width: auto;
	max-width: 100%;
	margin-top: 10px;
}

.refund-tip1 {
	position: relative;
	left: 200px;
	top: 0px;
	border: 1px dashed #e6e6e6;
	height: 100px;
	width: 600px;
	margin-top: 10px;
}

.filePic1 {
	width: 100px;
	padding: 10px 10px;
	position: relative;
	overflow: hidden;
}

.item-pic1 {
	width: 90px;
	height: 90px;
	border: 1px solid #EEE;
	float: left;
	overflow: hidden;
	margin-left: 5px;
	margin-right: 10px;
}

.item-comment1 {
	position: relative;
	left: 200px;
	top: 0px;
	right: 0px;
	max-width: 600px;
	margin-top: 10px;
}

.main-wrap1 {
	position: relative;
	margin-left: 150px;
	overflow: hidden;
	min-height: 600px;
	background-color: #fff;
}
</style>
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
				<li class="index"><a href="shop/oldfronthome">首页</a></li>
			</ul>
		</div>
	</div>
	<b class="line"></b>
	<div class="center">
		<div class="col-main">
			<!-- 好像也没有关系 -->
			<div class="main-wrap1">

				<div class="user-comment">
					<!--  没有关系-->
					<!--标题 -->
					<div class="am-cf am-padding">
						<div class="am-fl am-cf">
							<strong class="am-text-danger am-text-lg">发表评论</strong> / <small>Make&nbsp;Comments</small>
						</div>
					</div>
					<hr />

					<form action="" id="formid" enctype="multipart/form-data">
						<div class="comment-list">
							<!-- 没有关系 -->
							<c:forEach items="${list}" var="l">

								<div class="item-pic1">
									<a href="product/getProduct/${l.producctsId}"
										class="J_MakePoint"> <img
										src="http://123.207.93.53/Older_back/${l.products.images}"
										class="itempic J_ItemImg">

									</a>
								</div>
								<input type="hidden" value="${l.orderId}" id="orderid">
								<input type="hidden" name="usersId" value="${users.id}">
								<input type="hidden" name="ordersdetailId" value="${l.id}">
								<input type="hidden" name="grade" id="gardeid">


								<div class="">

									<div class="item-name">
										<a href="product/getProduct/${l.id}">
											<p class="item-basic-info">${l.producctname}</p>
										</a>
									</div>
									<div class="">
										<div class="">
											<span>${l.products.synopsis}</span> <span>包装：裸装</span>
										</div>
										<div class="">
											价格：<strong>${l.products.nowprice}</strong>
										</div>
									</div>
								</div>
								<div class="clear"></div>
								<hr>
							</c:forEach>



							<div class="item-opinion1">

								<ul id="star">
									<li title="很差" id="star1" star="1" class="op1">☆</li>
									<li title="差" id="star2" star="2" class="op2">☆</li>
									<li title="一般" id="star3" star="3" class="op3">☆</li>
									<li title="好" id="star4" star="4" class="op4">☆</li>
									<li title="很好" id="star5" star="5" class="op5">☆</li>
								</ul>
							</div>
							<div class="item-comment1">
								<textarea placeholder="请写下对宝贝的感受吧，对他人帮助很大哦！" id="textid"
									required="required" name="content"></textarea>
							</div>
							<div class="refund-tip1">
								<div class="filePic1">
									<input type="file" class="inputPic" id="up_img" value="选择凭证图片"
										name="file" max="5" maxsize="5120"
										allowexts="gif,jpeg,jpg,png,bmp" accept="image/*"> <img
										src="${pageContext.request.contextPath}/upload/${user.image==null?'image.jpg':user.image}"
										id="imgShow" class="itempic J_ItemImg">
								</div>
								<span class="desc"></span>
							</div>
							<div class="info-btn" style="margin-top:10px;position: relative;">
								<button type="button" class="am-btn am-btn-danger" id="savebtn">发表评论</button>
							</div>
						</div>
						<div class="comment-main">
							<!-- 好像也没有关系 -->
						</div>
					</form>
				</div>
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
		$(document).ready(function() {
			//隐藏图片
			var _temp_value = 0;//鼠标hover时的等级value
			var choiceValue = 0;//默认选定的等级值为1

			//鼠标移入的时候
			$("#star li").mouseenter(function() {
				//获取当前的星级
				_temp_value = new Number($(this).attr("star"));
				showStar();

				//鼠标移入的时候
			}).mouseout(function() {
				hideStar();

				//鼠标移入的时候
			}).click(function() {
				//单击时，设定当前的选定值
				choiceValue = _temp_value;
				hideStar();
				$("#gardeid").val(choiceValue);
			});

			//星级显示
			function showStar() {
				for (var i = 1; i < _temp_value + 1; ++i) {
					$("#star" + i).addClass("choice");
					document.getElementById("star" + i).innerText = "★";
				}
			}

			function hideStar() {
				for (var i = 5; i > choiceValue; --i) {
					$("#star" + i).removeClass("choice");
					document.getElementById("star" + i).innerText = "☆";
				}
			}
		});
		$("#savebtn")
				.click(
						function() {
							if ($("#gardeid").val() == null) {
								$("#gardeid").val(0);
							}
							if ($("#gardeid").val() > 0) {
								if (($.trim($("#textid").val()) != "")) {
									var index = layer.load();
									$
											.ajax({
												url : "order/addproductscomment/"
														+ $("#orderid").val(),
												type : "POST",
												data : new FormData(
														$("#formid")[0]),
												cache : false,
												processData : false,
												contentType : false,
												success : function(result) {
													if (result.code == 100) {
														layer.close(index);
														layer.msg("评论成功");
														window.location.href = "order/selectallorder/"
																+ ${users.id};
														$("#formid")[0].reset();
													}
												}
											});
								} else {
									layer.msg("亲！给点评语吧");
								}
							} else {
								layer.msg("亲！给颗星吧");
							}

						});
	</script>

</body>

</html>