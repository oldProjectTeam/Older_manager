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

<title>孝和购物商城-商品结算</title>

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

<link href="${APP_PATH}/static/css/jsstyle.css" rel="stylesheet"
	type="text/css" />

<script type="text/javascript" src="${APP_PATH}/static/js/address.js"></script>
<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery-1.7.2.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>
</head>

<body>
    <jsp:include page="shopheader.jsp"></jsp:include>
	<c:if test="${empty carts }">
            	<script type="text/javascript">
            	confirm("没有商品，请先选购商品!");
            	window.location.href="${APP_PATH}/shop/oldfronthome";
            	</script>
            </c:if>
			<div class="concent">
				<!--地址 -->
				<div class="paycont">
					<div class="address">
						<h3>确认收货地址 </h3>
						<div class="control">
							<div class="tc-btn createAddr theme-login am-btn am-btn-danger">使用新地址</div>
						</div>
						<div class="clear"></div>
						<ul>
						    <c:forEach items="${addressList}" var="address">
						    	<div class="per-border"></div>
							<li class="user-addresslist defaultAddr">

								<div class="address-left">
									<div class="user DefaultAddr">

										<span class="buy-address-detail">   
                   						<span class="buy-user">${address.name} </span>
										<span class="buy-phone">${address.phone}</span>
										</span>
									</div>
									<div class="default-address DefaultAddr">
										<span class="buy-line-title buy-line-title-type">收货地址：</span>
										<span class="buy--address-detail">
								        <span class="province">${address.location}</span>
										<!-- <span class="city">武汉</span>市
										<span class="dist">洪山</span>区 --><br>
										<span class="street">${address.detailaddress}</span>
										</span>										 
									</div>
									<c:if test="${address.state==1}">
										<ins class="deftip">默认地址</ins>
									</c:if>									
								</div>
								<div class="address-right">
									<a href="../person/address.html">
										<span class="am-icon-angle-right am-icon-lg"></span></a>
								</div>
								<div class="clear"></div>

								<div class="new-addr-btn">
									
									<c:if test="${address.state==1}">
										<span class="new-addr-bar">启用</span>
									    <span class="new-addr-bar">
									    	<input type="radio" checked="true" 
									    	onClick="start(this)" name="state"
									    	 value="${address.id}" style="width:18px;height:18px;margin-top:-5px" >
									    </span>
										<span class="new-addr-bar">|</span>
										<a href="#" class="hidden">设为默认</a>
										<span class="new-addr-bar hidden">|</span>
										
									</c:if>	
									<c:if test="${address.state!=1}">
									    <span class="new-addr-bar">启用</span>
									    <input type="radio" name="state" 
									    onClick="start(this)"  
									    value="${address.id}" style="width:18px;height:18px;margin-top:-5px" >
										<span class="new-addr-bar">|</span>
										<a href="#">设为默认</a>
									    <span class="new-addr-bar">|</span>
									</c:if>											
									<a href="#">编辑</a>
									<span class="new-addr-bar">|</span>
									<a href="javascript:void(0);" onclick="delClick(this);">删除</a>
								</div>

							</li>						    
						    </c:forEach>
						</ul>

						<div class="clear"></div>
					</div>
					<!--物流 -->
					<div class="logistics">
						<h3>选择物流方式</h3>
						<ul class="op_express_delivery_hot">
							<li data-value="yuantong" onClick="logisti('1')" class="OP_LOG_BTN  "><i class="c-gap-right" style="background-position:0px -468px"></i>圆通<span></span></li>
							<li data-value="shentong" onClick="logisti('2')" class="OP_LOG_BTN  "><i class="c-gap-right" style="background-position:0px -1008px"></i>申通<span></span></li>
							<li data-value="yunda" onClick="logisti('3')" class="OP_LOG_BTN  "><i class="c-gap-right" style="background-position:0px -576px"></i>韵达<span></span></li>
							<li data-value="zhongtong" onClick="logisti('4')" class="OP_LOG_BTN op_express_delivery_hot_last "><i class="c-gap-right" style="background-position:0px -324px"></i>中通<span></span></li>
							<li data-value="shunfeng" onClick="logisti('5')" class="OP_LOG_BTN  op_express_delivery_hot_bottom"><i class="c-gap-right" style="background-position:0px -180px"></i>顺丰<span></span></li>
						</ul>
					</div>
					<div class="clear"></div>

					<!--支付方式-->
					<div>
						<h3>选择支付方式</h3>
						<ul class="pay-list">	 
							<li class="pay taobao selected" style="border-color:#F03726 ;position:relative ;">
								<input type="radio" name="payType" checked="true" value="1" style="width:18px;height:18px" >
								&nbsp;&nbsp;
								<img src="${APP_PATH}/static/images/zhifubao.jpg" />支付宝(默认)<span></span>
							</li>							 
						</ul>
					</div>
					<div class="clear"></div>

					<!--订单 -->
					<div class="concent">
						<div id="payTable">
							<h3>确认订单信息</h3>
							<div class="cart-table-th">
								<div class="wp">

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
									<div class="th th-oplist">
										<div class="td-inner">配送方式</div>
									</div>

								</div>
							</div>
							<div class="clear"></div>
							<c:forEach items="${carts }" var="cart">
								<tr class="item-list">
								<div class="bundle  bundle-last">

									<div class="bundle-main">
										<ul class="item-content clearfix" value="${cart.id}">
										<div class="pay-phone">
											<li class="td td-item">
												<div class="item-pic">
													<a href="#" class="J_MakePoint" title="${cart.product.imagetitle}">
														<img src="${APP_PATH}/${cart.product.images}"
														onerror="onerror=null;src='${APP_PATH }/static/images/f9b49612f9d78f425c77eae488b9c1ad.jpg'" 
														class="itempic J_ItemImg" width="80px" height="80px">
													</a>
												</div>
												<div class="item-info">
													<div class="item-basic-info">
														<a href="#" class="item-title J_MakePoint" value="${cart.id}" title="${cart.product.name}"
														data-point="tbcart.8.11">${cart.product.name}</a>
													</div>
												</div>
											</li>
											<!-- <li class="td td-info">
												<div class="item-props">
													<span class="sku-line">颜色：12#川南玛瑙</span>
													<span class="sku-line">包装：裸装</span>
												</div>
											</li> -->
											<li class="td td-price">
												<div class="item-price price-promo-promo">
													<div class="price-content">
														<em class="J_Price price-now">${cart.product.nowprice}</em>
													</div>
												</div>
											</li>
										</div>
										<li class="td td-amount">
											<div class="amount-wrapper ">
											<div class="item-amount ">
												<span class="phone-title">购买数量</span>
												<div class="sl">
													<input class="min am-btn" name="" type="button" value="-" />
													<input class="text_box" name="" type="text" value="${cart.number}" style="width:30px;" />
													<input class="add am-btn" name="" type="button" value="+" />
												</div>
											</div>
											</div>
										</li>
										<li class="td td-sum">
											<div class="td-inner">
												<em tabindex="0" class="J_ItemSum number">${cart.baseprice}</em>
											</div>
										</li>
										<li class="td td-oplist">
										<div class="td-inner">
											<span class="phone-title">配送方式</span>
											<div class="pay-logis">
											   <c:if test="${cart.product.paral11!=null}">
											   	  快递<b class="sys_item_freprice">${cart.product.paral11}</b>元
											   </c:if>
											   <c:if test="${cart.product.paral11==null}">
											   	包邮 
											   </c:if>
											   
											</div>
										</div>
									</li>
									</ul>
								<div class="clear"></div>
								</div>
							</tr>
							<div class="clear"></div>
							</c:forEach>
							
							</div>

							 
							</div>
							<div class="clear"></div>
							<div class="pay-total">
						<!--留言-->
							<div class="order-extra">
								<div class="order-user-info">
									<div id="holyshit257" class="memo">
										<label>买家留言：</label>
										<input type="text" id="body"
										title="选填,对本次交易的说明（建议填写已经和卖家达成一致的说明）" placeholder="选填,建议填写和卖家达成一致的说明" class="memo-input J_MakePoint c2c-text-default memo-close">
										<div class="msg hidden J-msg">
											<p class="error">最多输入500个字符</p>
										</div>
									</div>
								</div>

							</div>
							
							<div class="clear"></div>
							</div>
							<!--含运费小计 -->
							<div class="buy-point-discharge ">
								<p class="price g_price ">
									合计（含运费） <span>¥</span><em class="pay-sum" id="pay-sum">${cost}</em>
								</p>
							</div>

							<!--信息 -->
							<div class="order-go clearfix">
								<div class="pay-confirm clearfix">
									<div class="box">
										<div tabindex="0" id="holyshit267" class="realPay"><em class="t">实付款：</em>
											<span class="price g_price ">
                                    <span>¥</span> <em class="style-large-bold-red " id="J_ActualFee">${cost}</em>
											</span>
										</div>

										<div id="holyshit268" class="pay-address">
										<c:forEach items="${addressList}" var="address">
										   <c:if test="${address.state==1}">
											<p class="buy-footer-address">
												<span class="buy-line-title buy-line-title-type">寄送至：</span>
												<span class="buy--address-detail">
								  				<span class="province">${address.location}</span>
					
												<span class="street">${address.detailaddress }</span>
												</span>
												 
											</p>
											<p class="buy-footer-address">
												<span class="buy-line-title">收货人：</span>
												<span class="buy-address-detail">   
                                                <span class="buy-user">${address.name}</span>
												<span class="buy-phone">${address.phone}</span>
												</span>
											</p>
											</c:if>
										</c:forEach>
										</div>
									</div>
									<div id="holyshit269" class="submitOrder" >
										<div class="go-btn-wrap">
											<a id="J_Go" href="javascript:;" onClick="submitOrder(2)" class="btn-go" tabindex="0" title="点击此按钮，提交订单">提交订单</a>
										</div>
									</div>
									<div class="clear"></div>
								</div>
							</div>
						</div>

						<div class="clear"></div>
					</div>
				</div>
				<div class="footer">
					<div class="footer-hd">
						<p>
							<a href="#">恒望科技</a>
							<b>|</b>
							<a href="#">商城首页</a>
							<b>|</b>
							<a href="#">支付宝</a>
							<b>|</b>
							<a href="#">物流</a>
						</p>
					</div>
					<div class="footer-bd">
						<p>
							<a href="#">关于恒望</a>
							<a href="#">合作伙伴</a>
							<a href="#">联系我们</a>
							<a href="#">网站地图</a>
							<em>© 2015-2025 Hengwang.com 版权所有</em>
						</p>
					</div>
				</div>
			</div>
			<div class="theme-popover-mask"></div>
			<div class="theme-popover">

				<!--标题 -->
				<div class="am-cf am-padding">
					<div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">新增地址</strong> / <small>Add address</small></div>
				</div>
				<hr/>

				<div class="am-u-md-12">
					<form class="am-form am-form-horizontal">

						<div class="am-form-group">
							<label for="user-name" class="am-form-label">收货人</label>
							<div class="am-form-content">
								<input type="text" id="user-name" placeholder="收货人">
							</div>
						</div>

						<div class="am-form-group">
							<label for="user-phone" class="am-form-label">手机号码</label>
							<div class="am-form-content">
								<input id="user-phone" placeholder="手机号必填" type="email">
							</div>
						</div>

						<div class="am-form-group">
							<label for="user-phone" class="am-form-label">所在地</label>
							<div class="am-form-content address">
								<select data-am-selected>
									<option value="a">浙江省</option>
									<option value="b">湖北省</option>
								</select>
								<select data-am-selected>
									<option value="a">温州市</option>
									<option value="b">武汉市</option>
								</select>
								<select data-am-selected>
									<option value="a">瑞安区</option>
									<option value="b">洪山区</option>
								</select>
							</div>
						</div>

						<div class="am-form-group">
							<label for="user-intro" class="am-form-label">详细地址</label>
							<div class="am-form-content">
								<textarea class="" rows="3" id="user-intro" placeholder="输入详细地址"></textarea>
								<small>100字以内写出你的详细地址...</small>
							</div>
						</div>

						<div class="am-form-group theme-poptit">
							<div class="am-u-sm-9 am-u-sm-push-3">
								<div class="am-btn am-btn-danger">保存</div>
								<div class="am-btn am-btn-danger close">取消</div>
							</div>
						</div>
					</form>
				</div>

			</div>
		<div class="clear"></div>
<script type="text/javascript">

//启用地址
function start(obj){
	//收货人姓名
	 var name=$(obj).parents("li").find("span:.buy-user").text();
	 var phone=$(obj).parents("li").find("span:.buy-phone").text();
	 var location=$(obj).parents("li").find("span:.province").text();
	 var street=$(obj).parents("li").find("span:.street").text();
	 //收货地址确认信息改变
	 $("#holyshit268").find("span:.buy-user").html(name);
	 $("#holyshit268").find("span:.buy-phone").html(phone);
	 $("#holyshit268").find("span:.province").html(location);
	 $("#holyshit268").find("span:.street").html(street);
	
}


var formulaWay="";//物流名称，配送方式
function logisti(name){
	formulaWay=name;
}

//提交订单按钮
function submitOrder(userId){
	if(userId==""||userId==null||userId==undefined){
		 layer.msg("用户登录失效，请重新登录！");
		 return false;
	}
	//收货地址id
	 var addressId=$("input[name='state']:checked").val();
	 if(formulaWay==''||formulaWay==null){
		 layer.msg("请选择物流方式！");
		 return false;
	 }
	 var ids="";
	 $.each($(".item-title"),function(){
		 ids+=$(this).attr("value")+"-";
	 });
	 ids=ids.substring(0,ids.length-1);
	 if(ids==""){
		 layer.msg("无订单商品，不能提交订单！");
		 return false;
	 }
	 var payType=$("input[name='payType']:checked").val();
	 if(payType==''||payType==null){
		 layer.msg("请选择支付方式！");
		 return false;
	 }
	 //买家留言
	 var body=$("#body").val();
	 if(body.length>200){
		 layer.msg("留言字数不能超过200！");
		 return false;
	 }
	 window.location.href="${APP_PATH}/pay/orderPay.action?shippingaddressId="+addressId+
			 "&formulaway="+formulaWay+"&paytype="+payType+"&ids="+ids+"&userId="+userId+"&body="+body;
}

//更改商品数量，向服务器发送更改指令
//参数：购物车记录id,更改的数量数值number
function updateNumber(id,number){
	if(id==''||id==undefined||number==''||number==undefined){
		return false;
	}
	$.ajax({
		url:"${APP_PATH}/cart/updateNumber.action?id="+id+"&number="+number,
		type:"POST",
		success:function(result){
		}
	});
}
//增加数量按钮+
 $(document).on("click",".add",function(){
	var num=Number($(this).parents("div:.sl").find("input[type=text]").val());
	$(this).parents("div:.sl").find("input[type='text']").val(num);
	
	//向服务器发送更改指令
	var id=$(this).parents("ul").attr("value");
	updateNumber(id,num);
	
	//商品单价
	var nowprice=parseFloat($(this).parents("ul").find("em:.price-now").text());
	//该商品总金额
	var baseprice=num*nowprice;
	$(this).parents("ul").find("em:.number").html(baseprice+".0");

	var cost=parseFloat($("#J_ActualFee").text());
	cost+=nowprice;
	$("#J_ActualFee").html(cost+".00");
	$("#pay-sum").html(cost+".00");
	
});
//减少数量按钮-
$(document).on("click",".min",function(){
	//原数量
	var num=Number($(this).parents("div:.sl").find("input[type=text]").val());
	if(num<1){
		$(this).parents("div:.sl").find("input[type='text']").val("1");
		return false;
	}
	 
	$(this).parents("div:.sl").find("input[type='text']").val(num);
	
	//向服务器发送更改指令
	//向服务器发送更改指令
	var id=$(this).parents("ul").attr("value");
	updateNumber(id,num);
	
	//商品单价
	var nowprice=parseFloat($(this).parents("ul").find("em:.price-now").text());
	//该商品总金额
	var baseprice=num*nowprice;
	$(this).parents("ul").find("em:.number").html(baseprice+".0");

	var cost=parseFloat($("#J_ActualFee").text());
	cost-=nowprice;
	$("#J_ActualFee").html(cost+".00");
	$("#pay-sum").html(cost+".00");
});

//文本框原数量值
var number=0;
//数量文本框获得焦点，保存原来数字
$(document).on("focus",".text_box",function(){
	number=$(this).val();
});
$(document).on("change",".text_box",function(){
	var regx=/^[1-9]\d*$/i;
	if(!regx.test($(this).val())){
		layer.msg("请输入一个合法的数字");
		$(this).val(number);
		return false;
	}
	if($(this).val()<1){
		layer.msg("请输入一个合法的数字");
		$(this).val(number);
		return false;
	}
	
	//修改相应数据
	//1.修改此商品总金额
	//商品单价
	var nowprice=parseFloat($(this).parents("ul").find("em:.price-now").text());
	var num=$(this).val();//现在数量
	
	//向服务器发送更改指令
	var id=$(this).parents("ul").attr("value");
	updateNumber(id,num);
	
	//该商品总金额
	var baseprice=num*nowprice;
	$(this).parents("ul").find("em:.number").html(baseprice+".0");
	
	var cost=parseFloat($("#J_ActualFee").text());
	var n=num-number;//相差数量
	cost+=nowprice*n;
	$("#J_ActualFee").html(cost+".00");
	$("#pay-sum").html(cost+".00");
});

</script>		
</body>

</html>
