<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>商品结算</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta name="viewport" content="width=device-width, initial-scale=1"> 
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
	<script  src="static/js/jquery-3.2.1.min.js"></script>
	<script  src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
 	<style>
        table{
        border:1px solid red ;
        height:140px;
        width:100%;
        margin:10px;}
       
       table tr td{
				padding-left:9px; }
				
		a{color:black; }
		a:hover{color:red;
				text-decoration:none;}
				
		.astyle{
			dispaly:block;
			width:100px;
			height;70px;
		}
    </style>
 
  </head>
  
  <body>
    <div class="container">
    		<div class="row" style="height:50px">
    			<ul class="col-sm-2 list-unstyled list-inline" style="line-height:50px">
    				<li><a href="#">亲，请登录</a></li>
    				<li><a href="#">免费注册</a></li>
    			</ul>
    			<ul class="col-sm-4 list-unstyled list-inline col-sm-offset-6" style="line-height:50px">
    				<li class="center"><a href="#">商场首页</a></li>
    				<li class="center"><a href="#"><span class="glyphicon glyphicon-user">个人中心</span></a></li>
    				<li class="center"><a href="#"><span class="glyphicon glyphicon-shopping-cart">购物车</span></a></li>
    				<li class="center"><a href="#"><span class="glyphicon glyphicon-heart">收藏夹</span></a></li>
    			</ul>
    		</div>
   
    		<!-- 搜索栏 -->
    		<div style="height:100px">
    			<span class="col-sm-2">
    				<img alt="" src="img/ms.jpg" class="img-responsive">
    			</span>
    			<div class="input-group col-sm-7">
		    		<input type="text" class="form-control input-lg">
		    		<span class="input-group-addon">
		    			<button type="button" class="btn btn-danger">搜索</button>
    				</span>
    			</div>
    		</div>
   
    	<!-- 中间 -->
    	<div style="margin-top:16px">
    		<div>
		    	<div>
		    		<span>确认收货地址</span> &nbsp;&nbsp;&nbsp;&nbsp;
		    		<span ><a href="#" class="astyle">使用新地址</a></span>
		    	</div>
		    	<div>
		    		<div class="col-sm-6">
		    			<table>
		    				<tr>
		    					<td>赵琴琴</td>
		    					<td>12345678909</td>
		    				</tr>
		    				<tr>
								<td>收货地址：</td>
								<td> 湖北省 武汉市 洪山区 雄楚大道666号(中南财经政法大学) </td>
							</tr>
							<tr>
								<td></td>
								<td align="right" style="padding-right:50px">
									<a href="#">编辑</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<a href="#">删除</a>
								</td>
							</tr>
		    			</table>
		    		</div>
		    		<div class="col-sm-6">
		    			<table>
		    				<tr>
		    					<td>赵琴琴</td>
		    					<td>12345678909</td>
		    					
		    				</tr>
		    				<tr>
								<td>收货地址：</td>
								<td> 湖北省 武汉市 洪山区 雄楚大道666号(中南财经政法大学) </td>
							</tr>
		    				<tr>
								<td></td>
								<td align="right" style="padding-right:30px">
									<a href="#">设为默认地址</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<a href="#">编辑</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<a href="#">删除</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								</td>
		    				</tr>
		    			</table>
		    		</div>
		    	</div>
	    	</div>
	    	<div class="col-sm-12 clearfix" style="margin-top:17px">
	    		<div>
			    	<span><b>选择物流方式</b></span>
			    	<hr>
			    	<ul class="list-inline  list-unstyle">
			    		<li class="col-sm-2"><a href="#"><img alt="Responsive image" src="static/images/yuntong.jpg">&nbsp;&nbsp;&nbsp;圆通</a></li>
			    		<li class="col-sm-2"><a href="#"><img alt="Responsive image" src="static/images/shentong.jpg">&nbsp;&nbsp;&nbsp;申通</a></li>
			    		<li class="col-sm-2"><a href="#"><img alt="Responsive image" src="static/images/yuabda.jpg">&nbsp;&nbsp;&nbsp;韵达</a></li>
			    		<li class="col-sm-2"><a href="#"><img alt="Responsive image" src="static/images/zhongtong.jpg">&nbsp;&nbsp;&nbsp;中通</a></li>
			    		<li class="col-sm-2"><a href="#"><img alt="Responsive image" src="static/images/shunfeng.jpg">&nbsp;&nbsp;&nbsp;顺丰</a></li>
			    		<li class="col-sm-2"><a href="#"><img alt="Responsive image" src="static/images/youzheng.jpg">邮政</a></li>
			    	</ul>
		    	</div>
	    	</div>
	    	<div class="col-sm-12" style="margin-top:17px">
	    		<span><b>选择支付方式</b></span>
		    	<hr class="col-sm-12">
		    	<ul class="list-unstyle list-inline">
		    		<li class="col-sm-2"><a href="#"><img alt="Responsive image" src="static/images/yinlian.jpg">&nbsp;&nbsp;&nbsp;银联</a></li>
		    		<li class="col-sm-2"><a href="#"><img alt="Responsive image" src="static/images/weixin.jpg">&nbsp;&nbsp;&nbsp;微信</a></li>
		    		<li class="col-sm-2"><a href="#"><img alt="Responsive image" src="static/images/zfb.jpg">&nbsp;&nbsp;&nbsp;支付宝</a></li>
		    	</ul>
	    	</div>
	    	
		    <span class="col-sm-12" style="margin-top:20px"><b>确认订单信息</b></span>
	    	<div class="col-sm-12" style="margin-top:10px">
	    		<nav class="navbar navbar-default">
		    		<div class="col-sm-12" style="margin-top:13px" >
			    		<ul class="list-unstyle list-inline ">
			    			<li class="col-sm-4 text-center">商品信息</li>
			    			<li class="col-sm-2 text-center">单价</li>
			    			<li class="col-sm-2 text-center">数量</li>
			    			<li class="col-sm-2 text-center">金额</li>
			    			<li class="col-sm-2 text-center">配送方式</li>
			    		</ul>
		    		</div>
	    		</nav>
	    	</div>
	    	<div class=" col-sm-12">
		    	<ul class="list-unstyle list-inline">
		    		<li class="col-sm-4">
		    			<img alt="Responsive image" src="img/meishe.jpg">&nbsp;&nbsp;&nbsp;
		    			<label>赵家美食，色香味俱全</label>
		    		</li>
		    		<li class="col-sm-2 text-center">20.00</li>
		    		<li class="col-sm-2 text-center">
		    			<a href="#"><span class="glyphicon glyphicon-minus"></span></a>
		    			<input type="text" style="width:30px" placeholder="1">
		    			<a href="#"><span class="glyphicon glyphicon-plus"></span></a>
		    		</li>
		    		<li class="col-sm-2 text-center">60.00</li>
		    		<li class="col-sm-2 text-center">包邮</li>
		    	</ul>
	    	</div>
	    	<hr class=" col-sm-12">
	    	<div class=" col-sm-12">
		    	<ul class="list-unstyle list-inline">
		    		<li class="col-sm-4">
		    			<img alt="Responsive image" src="img/meishe.jpg">&nbsp;&nbsp;&nbsp;
		    			<label>赵家美食，色香味俱全</label>
		    		</li>
		    		<li class="col-sm-2 text-center">20.00</li>
		    		<li class="col-sm-2 text-center">
		    			<a href="#"><span class="glyphicon glyphicon-minus"></span></a>
		    			<input type="text" style="width:30px" placeholder="1">
		    			<a href="#"><span class="glyphicon glyphicon-plus"></span></a>
		    		</li>
		    		<li class="col-sm-2 text-center">60.00</li>
		    		<li class="col-sm-2 text-center">包邮</li>
		    	</ul>
	    	</div>
	    	<hr class=" col-sm-12">
	    	<div >
	    		<div class="col-sm-6">
	    			<label>买家留言：</label>
	    			<form action="#" method="post">
	    			<textarea rows="4" cols="90" placeholder="亲，请留下你宝贵的建议"></textarea>
	    			</form>
	    		</div>
	    		<div class="col-sm-6" style="margin-top:30px">
	    			<div class="col-sm-offset-6">
	    				<span>优惠劵</span>
	    				<select>
	    					<option>无</option>
	    					<option>¥&nbsp;8(满50元可以用)</option>
	    					<option>¥&nbsp;16(满100元可以用)</option>
	    				</select>
	    			</div>
	    			<div class="col-sm-offset-6" style="margin-top:10px">
	    				<span>红&nbsp;&nbsp;&nbsp;&nbsp;包</span>
	    				<select>
	    					<option>亲，你还没有红包哟</option>
	    					<option>¥&nbsp;8元</option>
	    					<option>¥&nbsp;16元</option>
	    				</select>
	    			</div>
	    		</div>
	    		<hr class="col-sm-12">
	    		<div class="col-sm-12">
	    			<div class=" pull-right col-sm-6">
		    			&nbsp;&nbsp;<b>合计（含运费）<span class="glyphicon glyphicon-yen" style="color:red">120.00</span></b><br>
		    			<table>
		    				<tr>
		    					<td>实付款：</td>
		    					<td style="font-size:30px; color:red">¥ 244.00</td>
		    				</tr>
		    				<tr>
		    					<td>寄送至：</td>
		    					<td> 湖北省 武汉市 洪山区 雄楚大道666号(中南财经政法大学) </td>
		    				</tr>
		    				<tr>
		    					<td>收货人：</td>
		    					<td>艾迪  15871145629 </td>
		    				</tr>
		    			</table>
		    			<button type="button" class="btn btn-danger pull-right">提交订单</button>
	    			</div>
	    		</div>
	    	</div>
	    	<hr class="col-sm-12" style="border:1px solid red">
    	</div>
    	<!-- 尾 -->
    	<div class="col-sm-12" style="height:100px">
    		
    	</div>
   </div>
  </body>
</html>
