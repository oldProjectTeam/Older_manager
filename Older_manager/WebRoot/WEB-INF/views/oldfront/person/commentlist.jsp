<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	pageContext.setAttribute("APP_PATH", request.getContextPath());
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	pageContext.setAttribute("orid", request.getAttribute("orid"));
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'commentlist.jsp' starting page</title>

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
<link href="${APP_PATH}/static/css/appstyle.css" rel="stylesheet"
	type="text/css">
<script src="${APP_PATH}/static/js/jquery-3.2.1.min.js"
	type="text/javascript"></script>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>
<style type="text/css">
.item-opinion1 {
	position: absolute;
	left: 200px;
	top: 0px;
	right: 0px;
	width: auto;
	max-width: 600px;
	margin-top: 10px;
}

.item-opinion1 li {
	float: left;
	margin-left: 20px;
}

.item-opinion2 {
	position: absolute;
	left: 200px;
	top: 150px;
	right: 150px;
	width: auto;
	max-width: 600px;
	margin-top: 10px;
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
				<li class="index"><a href="${APP_PATH}/shop/oldfronthome">首页</a></li>
			</ul>
		</div>
	</div>
	<b class="line"></b>
	<div class="center">
		<div class="col-main">
			<div class="main-wrap">

				<div class="user-comment">
					<!--标题 -->
					<div class="am-cf am-padding">
						<div class="am-fl am-cf">
							<strong class="am-text-danger am-text-lg">发表评论</strong> / <small>Make&nbsp;Comments</small>
						</div>
					</div>
					<hr />

					<form action="" id="formid" enctype="multipart/form-data">
						<div class="comment-main">
							<div class="comment-list">
								<div class="item-pic">
									<a href="product/getProduct/${id}" class="J_MakePoint"> <img
										src="http://123.207.93.53/Older_back/${pro.images}"
										class="itempic J_ItemImg">
									</a>

								</div>
								<input type="hidden" name="usersId" value="${users.id}">
								<input type="hidden" name="ordersdetailId" value="${orid}">
								<input type="hidden" name="grade" id="gardeid">


								<div class="item-title">

									<div class="item-name">
										<a href="product/getProduct/${id}">
											<p class="item-basic-info">${pro.name}</p>
										</a>
									</div>
									<div class="item-info">
										<div class="info-little">
											<span>${pro.synopsis}</span> <span>包装：裸装</span>
										</div>
										<div class="item-price">
											价格：<strong>${pro.nowprice}</strong>
										</div>
									</div>
								</div>
								<div class="clear"></div>
								<div class="item-comment">
									<textarea placeholder="请写下对宝贝的感受吧，对他人帮助很大哦！" id="textid"
										required="required" name="content"></textarea>
								</div>
								<div class="filePic">
									上传截图：<input type="file" multiple="multiple"
										class="btn btn-info" name="file" id="up_img" />

								</div>
								<div style="width:100px;height:100px;" class="item-opinion2">
									<img
										src="${pageContext.request.contextPath}/upload/${user.image==null?'default.png':user.image}"
										id="imgShow" class="itempic J_ItemImg">
								</div>
								<div>
									<div class="item-opinion1">

										<ul id="star">
											<li title="很差" id="star1" star="1" class="op1">☆</li>
											<li title="差" id="star2" star="2" class="op2">☆</li>
											<li title="一般" id="star3" star="3" class="op3">☆</li>
											<li title="好" id="star4" star="4" class="op4">☆</li>
											<li title="很好" id="star5" star="5" class="op5">☆</li>
										</ul>
									</div>


									<div class="info-btn">
										<!-- <div class="am-btn am-btn-danger">发表评论</div> -->
										<button type="button" class="am-btn am-btn-danger"
											id="savebtn">发表评论</button>
									</div>
								</div>

							</div>


						</div>
					</form>
				</div>

			</div>
			<!--底部-->
			<div class="footer">
				<div class="footer-hd">
					<p>
						<a href="#">恒望科技</a> <b>|</b> <a href="#">商城首页</a> <b>|</b> <a
							href="#">支付宝</a> <b>|</b> <a href="#">物流</a>
					</p>
				</div>
				<div class="footer-bd">
					<p>
						<a href="#">关于恒望</a> <a href="#">合作伙伴</a> <a href="#">联系我们</a> <a
							href="#">网站地图</a> <em>© 2015-2025 Hengwang.com 版权所有</em>
					</p>
				</div>
			</div>
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
			$("#imgShow").hide();
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
		//发表评论($.trim($(selector).val())==""
		$("#savebtn").click(function() {
			if ($("#gardeid").val() == null) {
				$("#gardeid").val(0);
			}
			if ($("#gardeid").val() > 0) {
				if (($.trim($("#textid").val()) != "")) {
					$.ajax({
						url : "order/addproductscomment",
						type : "POST",
						data : new FormData($("#formid")[0]),
						cache : false,
						processData : false,
						contentType : false,
						success : function(result) {
							if (result.code == 100) {
								layer.msg("评论成功");
								window.location.reload();
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

		$("#up_img").change(function() {
			$("#imgShow").show();

		});
	</script>

</body>

</html>