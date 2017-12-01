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

<title>孝和购物商城-购物车</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="${APP_PATH}/static/css/amazeui.css" rel="stylesheet"
	type="text/css" />
<link href="${APP_PATH}/static/css/demo.css" rel="stylesheet"
	type="text/css" />
<link href="${APP_PATH}/static/css/cartstyle.css" rel="stylesheet"
	type="text/css" />
<link href="${APP_PATH}/static/css/optstyle.css" rel="stylesheet"
	type="text/css" />

<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery-1.7.2.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>
</head>

<body>
	<jsp:include page="shopheader.jsp"></jsp:include>
	<!--购物车 -->
	<div class="concent">
		<div id="cartTable">
			<div class="cart-table-th">
				<div class="wp">
					<div class="th th-chk">
						<div id="J_SelectAll1" class="select-all J_SelectAll"></div>
					</div>
					<div class="th th-item">
						<div class="td-inner">商品信息</div>
					</div>
					<div class="th th-price">
						<div class="td-inner">单价</div>
					</div>
					<div class="th th-amount">
						<div class="td-inner">数量</div>
					</div>
					<div class="th th-sum">
						<div class="td-inner">金额</div>
					</div>
					<div class="th th-op">
						<div class="td-inner">操作</div>
					</div>
				</div>
			</div>
			<div class="clear"></div>


			<div class="clear"></div>

			<!--购物车信息列表  -->
			<c:forEach items="${carts}" var="cart">
				<tr class="item-list">
					<div class="bundle  bundle-last ">
						<div class="clear"></div>
						<div class="bundle-main">
							<ul class="item-content clearfix">
								<li class="td td-chk">
									<div class="cart-checkbox ">
										<input class="check item_check" id="J_CheckBox_170769542747"
											name="items[]" value="${cart.id}" type="checkbox"> <label
											for="J_CheckBox_170769542747"></label>
									</div>
								</li>
								<li class="td td-item">
									<div class="item-pic">
										<a href="${APP_PATH}/product/getProduct/${cart.product.id}"
											title="${cart.product.imagetitle}" class="J_MakePoint"
											data-point="tbcart.8.12"> <img
											src="${cart.product.images}"
											onerror="onerror=null;src='${APP_PATH }/static/images/f9b49612f9d78f425c77eae488b9c1ad.jpg'"
											class="itempic J_ItemImg" width="80px" height="80px">
										</a>
									</div>
									<div class="item-info">
										<div class="item-basic-info">
											<a href="${APP_PATH}/product/getProduct/${cart.product.id}"
												title="${cart.product.name}" class="item-title J_MakePoint"
												data-point="tbcart.8.11"> ${cart.product.name} </a>
										</div>
									</div>
								</li>
								<li class="td td-info">
									<div class="item-props "></div>
								</li>
								<li class="td td-price">
									<div class="item-price price-promo-promo">
										<div class="price-content">
											<div class="price-line">
												<em class="price-original">${cart.product.orprice}</em>
											</div>
											<div class="price-line">
												<em class="J_Price price-now" tabindex="0">${cart.product.nowprice}</em>
											</div>
										</div>
									</div>
								</li>
								<li class="td td-amount">
									<div class="amount-wrapper">
										<div class="item-amount">
											<div class="sl">
												<input class="min am-btn" name="" type="button" value="-" />
												<input class="text_box" name="" type="text"
													value="${cart.number}" style="width:30px;" /> <input
													class="add am-btn" name="" type="button" value="+" />
											</div>
										</div>
									</div>
								</li>
								<li class="td td-sum">
									<div class="td-inner">
										<em tabindex="0" class="J_ItemSum number">${cart.baseprice}</em>
									</div>
								</li>
								<li class="td td-op">
									<div class="td-inner">
										<a title="移入收藏夹" class="btn-fav"
											href="javascript:addCollection(${cart.product.id})">
											移入收藏夹</a> <a href="javascript:;"
											onClick="del_btn(this,'${cart.id}')" data-point-url="#"
											class="delete"> 删除</a>
									</div>
								</li>
							</ul>
						</div>
					</div>
				</tr>

			</c:forEach>

		</div>
		<div class="clear"></div>

		<div class="float-bar-wrapper">
			<div id="J_SelectAll2" class="select-all J_SelectAll">
				<div class="cart-checkbox">
					<input class="check-all check" id="J_SelectAllCbx2"
						name="select-all" value="true" type="checkbox"> <label
						for="J_SelectAllCbx2"></label>
				</div>
				<span>全选</span>
			</div>
			<div class="operations">
				<a href="javascript:;" onClick="batchDel_btn()" hidefocus="true"
					class="deleteAll">删除</a> <a href="#" hidefocus="true"
					class="J_BatchFav">移入收藏夹</a>
			</div>
			<div class="float-bar-right">
				<div class="amount-sum">
					<span class="txt">已选商品</span> <em id="J_SelectedItemsCount">0</em><span
						class="txt">件</span>
					<div class="arrow-box">
						<span class="selected-items-arrow"></span> <span class="arrow"></span>
					</div>
				</div>
				<div class="price-sum">
					<span class="txt">合计:</span> <strong class="price">¥<em
						id="J_Total">0.00</em></strong>
				</div>
				<div class="btn-area">
					<a href="javascript:;" id="J_Go" onClick="account('${users.id}')"
						class="submit-btn submit-btn-disabled"
						aria-label="请注意如果没有选择宝贝，将无法结算"> <span>结&nbsp;算</span></a>
				</div>
			</div>

		</div>
		<jsp:include page="../person/footer.jsp"></jsp:include>
	</div>
	<!--操作页面-->
	<div class="theme-popover-mask"></div>
	<!--引导 -->
	<div class="navCir">
		<li><a href="home.html"><i class="am-icon-home "></i>首页</a></li>
		<li><a href="sort.html"><i class="am-icon-list"></i>分类</a></li>
		<li class="active"><a href="shopcart.html"><i
				class="am-icon-shopping-basket"></i>购物车</a></li>
		<li><a href="../person/index.html"><i class="am-icon-user"></i>我的</a></li>
	</div>
	<script type="text/javascript">
		function addCollection(id) {
			var index1 = layer.load();
			$.ajax({
				url : "${APP_PATH}/queryCollectByProductId",
				data : {
					"id" : id,
					"userId" : ${users.id}
				},
				type : "GET",
				success : function(result) {
					if (result.code == 100) {
						layer.close(index1);
						layer.msg("已经收藏过了");
					} else {
						var index = layer.load();
						$.ajax({
							url : "${APP_PATH}/insertProductCollect",
							data : {
								"usersId" : ${users.id},
								"productsId" : id
							},
							success : function(result) {
								if (result.code == 100) {
									layer.close(index);
									layer.msg("加入成功");
								}
							}
						});
					}
				}
			});
		}

		//判断商品是否加入收藏
		function isCollect(id, userId) {

		}
		//结算按钮
		function account(userId) {
			if (userId == '' || userId == undefined) {
				return false;
			}
			if ($(".item_check:checked").length < 1) {
				layer.msg("请先选择要结算的商品！");
				return false;
			}
			var ids = "";
			$.each($(".item_check:checked"), function() {
				ids += $(this).attr("value") + "-";
			});
			ids = ids.substring(0, ids.length - 1);
			window.location.href = "${APP_PATH}/confirm/confirmOrder.action?userId="
					+ userId + "&ids=" + ids;
		}
		//全选
		$("#J_SelectAllCbx2").click(
				function() {
					//全选
					$(".item_check").prop("checked", $(this).prop("checked"));

					//结算金额和数量变动
					var cost = 0.00;
					var num = 0;
					if ($(this).prop("checked")) {
						$.each($(".item_check:checked"), function() {
							cost += parseFloat($(this).parents("ul").find(
									"em:.number").text());
							num++;
						});

					}
					$("#J_Total").html(cost.toFixed(2));
					$("#J_SelectedItemsCount").html(num);
				});
		//反选
		$(document)
				.on(
						"click",
						".item_check",
						function() {
							//1.如果所有商品选中，则全选按钮也跟着选中
							var flag = $(".item_check:checked").length == $(".item_check").length;
							$("#J_SelectAllCbx2").prop("checked", flag);

							//2.检测结算金额是该减还是加
							//选中商品总金额
							var baseprice = parseFloat($(this).parents("ul")
									.find("em:.number").text());
							var cost = parseFloat($("#J_Total").text());//原结算金额
							var num = Number($("#J_SelectedItemsCount").text());//原已选中商品数
							if ($(this).prop("checked")) {//如果选中，则结算金额该加	
								cost += baseprice;
								num += 1;
							} else {
								cost -= baseprice;
								num -= 1;
							}
							$("#J_Total").html(cost.toFixed(2));
							$("#J_SelectedItemsCount").html(num);
						});

		//更改商品数量，向服务器发送更改指令
		//参数：购物车记录id,更改的数量数值number
		function updateNumber(id, number) {
			if (id == '' || id == undefined || number == ''
					|| number == undefined) {
				return false;
			}
			$.ajax({
				url : "${APP_PATH}/cart/updateNumber.action?id=" + id
						+ "&number=" + number,
				type : "POST",
				success : function(result) {

				}
			});
		}
		//增加数量按钮+
		$(document).on(
				"click",
				".add",
				function() {
					var num = Number($(this).parents("div:.sl").find(
							"input[type=text]").val());
					num += 1;
					$(this).parents("div:.sl").find("input[type='text']").val(
							num);

					//向服务器发送更改指令
					var id = $(this).parents("ul").find(".item_check").attr(
							"value");
					updateNumber(id, num);

					//商品单价
					var nowprice = parseFloat($(this).parents("ul").find(
							"em:.price-now").text());
					//该商品总金额
					var baseprice = num * nowprice;
					$(this).parents("ul").find("em:.number").html(
							baseprice.toFixed(2));

					if ($(this).parents("ul").find(".item_check").prop(
							"checked")) {
						var cost = parseFloat($("#J_Total").text());
						cost += nowprice;
						$("#J_Total").html(cost.toFixed(2));
					}
				});
		//减少数量按钮-
		$(document).on(
				"click",
				".min",
				function() {
					//原数量
					var num = Number($(this).parents("div:.sl").find(
							"input[type=text]").val());
					if (num <= 1) {
						return false;
					}
					//现数量
					num -= 1;
					$(this).parents("div:.sl").find("input[type='text']").val(
							num);

					//向服务器发送更改指令
					var id = $(this).parents("ul").find(".item_check").attr(
							"value");
					updateNumber(id, num);

					//商品单价
					var nowprice = parseFloat($(this).parents("ul").find(
							"em:.price-now").text());
					//该商品总金额
					var baseprice = num * nowprice;
					$(this).parents("ul").find("em:.number").html(
							baseprice.toFixed(2));
					if ($(this).parents("ul").find(".item_check").prop(
							"checked")) {
						var cost = parseFloat($("#J_Total").text());
						cost -= nowprice;
						$("#J_Total").html(cost.toFixed(2));
					}
				});

		//文本框原数量值
		var number = 0;
		//数量文本框获得焦点，保存原来数字
		$(document).on("focus", ".text_box", function() {
			number = $(this).val();
		});
		$(document).on(
				"change",
				".text_box",
				function() {
					var regx = /^[1-9]\d*$/i;
					if (!regx.test($(this).val())) {
						layer.msg("请输入一个合法的数字");
						$(this).val(number);
						return false;
					}
					if ($(this).val() < 1) {
						layer.msg("请输入一个合法的数字");
						$(this).val(number);
						return false;
					}

					//修改相应数据
					//1.修改此商品总金额
					//商品单价
					var nowprice = parseFloat($(this).parents("ul").find(
							"em:.price-now").text());
					var num = $(this).val();//现在数量

					//向服务器发送更改指令
					var id = $(this).parents("ul").find(".item_check").attr(
							"value");
					updateNumber(id, num);

					//该商品总金额
					var baseprice = num * nowprice;
					$(this).parents("ul").find("em:.number").html(
							baseprice.toFixed(2));

					//如果此产品是选中状态，则修改相应结算金额
					if ($(this).parents("ul").find(".item_check").prop(
							"checked")) {
						var cost = parseFloat($("#J_Total").text());
						var n = num - number;//相差数量
						cost += nowprice * n;
						$("#J_Total").html(cost.toFixed(2));
					}
				});

		//删除按钮处理事件，向服务器发送删除指令
		function del_btn(obj, id) {
			if (id == '' || id == undefined) {
				return false;
			}

			layer.confirm("确定删除该商品？", function(index) {
				layer.close(index);
				$.ajax({
					url : "${APP_PATH}/cart/deleteCart/" + id,
					type : "DELETE",
					success : function(result) {
						if (result.code == 100) {
							layer.msg("商品已删除", {
								icon : 6,
								time : 1000
							});
							//如果此产品是选中状态，则修改相应结算金额
							if ($(obj).parents("ul").find(".item_check").prop(
									"checked")) {
								var cost = parseFloat($("#J_Total").text());
								var baseprice = parseFloat($(obj).parents("ul")
										.find("em:.number").text());
								cost -= baseprice;
								var num = Number($("#J_SelectedItemsCount")
										.text()) - 1;
								$("#J_Total").html(cost.toFixed(2));
								$("#J_SelectedItemsCount").html(num);
							}
							//将该行删除掉
							$(obj).parents("ul:.item-content").remove();

						} else {
							layer.msg("删除失败了", {
								icon : 5,
								time : 1000
							});
						}

					}
				});
			});
		}

		//批量删除按钮
		function batchDel_btn() {
			var ids = "";
			var num = 0;
			if ($(".item_check:checked").length < 1) {
				layer.msg("请先选中要删除的商品！");
				return false;
			}
			$.each($(".item_check:checked"), function() {
				ids += $(this).attr("value") + "-";
				num++;
			});
			ids = ids.substring(0, ids.length - 1);
			layer.confirm("您确定要删除这" + num + "件商品吗？", function(index) {
				layer.close(index);
				$.ajax({
					url : "${APP_PATH}/cart/deleteCart/" + ids,
					type : "DELETE",
					success : function(result) {
						if (result.code == 100) {
							layer.msg("商品已删除", {
								icon : 6,
								time : 1000
							});

							//重置结算金额和选中数量
							$("#J_Total").html("0.00");
							$("#J_SelectedItemsCount").html("0");
							//循环删除被选中组建
							$.each($(".item_check:checked"), function() {
								$(this).parents("ul:.item-content").remove();
							});
						} else {
							layer.msg("删除失败了", {
								icon : 5,
								time : 1000
							});
						}

					}
				});
			});
		}
	</script>


</body>
</html>
