<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
pageContext.setAttribute("APP_PATH", request.getContextPath());
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'information.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="${APP_PATH}/static/css/admin.css" rel="stylesheet" type="text/css">
		<link href="${APP_PATH}/static/css/amazeui.css" rel="stylesheet" type="text/css">

		<link href="${APP_PATH}/static/css/personal.css" rel="stylesheet" type="text/css">
		<link href="${APP_PATH}/static/css/infstyle.css" rel="stylesheet" type="text/css">
		<script src="${APP_PATH}/static/js/jquery.min.js" type="text/javascript"></script>
		<script src="${APP_PATH}/static/js/amazeui.js" type="text/javascript"></script>
		 <script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	   type="text/javascript"></script>
		
	   <link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
       <script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>	
	</head>

	<body>
		<!--头 -->
		<header>
			<article>
				<div class="mt-logo">
					<!--顶部导航条 -->
					<div class="am-container header">
						<ul class="message-l">
							<div class="topMessage">
								<div class="menu-hd">
									<a href="#" target="_top" class="h">亲，请登录</a>
									<a href="#" target="_top">免费注册</a>
								</div>
							</div>
						</ul>
						<ul class="message-r">
							<div class="topMessage home">
								<div class="menu-hd"><a href="#" target="_top" class="h">商城首页</a></div>
							</div>
							<div class="topMessage my-shangcheng">
								<div class="menu-hd MyShangcheng"><a href="#" target="_top"><i class="am-icon-user am-icon-fw"></i>个人中心</a></div>
							</div>
							<div class="topMessage mini-cart">
								<div class="menu-hd"><a id="mc-menu-hd" href="#" target="_top"><i class="am-icon-shopping-cart  am-icon-fw"></i><span>购物车</span><strong id="J_MiniCartNum" class="h">0</strong></a></div>
							</div>
							<div class="topMessage favorite">
								<div class="menu-hd"><a href="#" target="_top"><i class="am-icon-heart am-icon-fw"></i><span>收藏夹</span></a></div>
						</ul>
						</div>

						<!--悬浮搜索框-->

						<div class="nav white">
							<div class="logoBig">
								<li><img src="${APP_PATH}/static/images/logobig.png" /></li>
							</div>

							<div class="search-bar pr">
								<a name="index_none_header_sysc" href="#"></a>
								<form>
									<input id="searchInput" name="index_none_header_sysc" type="text" placeholder="搜索" autocomplete="off">
									<input id="ai-topsearch" class="submit am-btn" value="搜索" index="1" type="submit">
								</form>
							</div>
						</div>

						<div class="clear"></div>
					</div>
				</div>
			</article>
		</header>
            <div class="nav-table">
					   <div class="long-title"><span class="all-goods">全部分类</span></div>
					   <div class="nav-cont">
							<ul>
								<li class="index"><a href="#">首页</a></li>
                                <li class="qc"><a href="#">闪购</a></li>
                                <li class="qc"><a href="#">限时抢</a></li>
                                <li class="qc"><a href="#">团购</a></li>
                                <li class="qc last"><a href="#">大包装</a></li>
							</ul>
						    <div class="nav-extra">
						    	<i class="am-icon-user-secret am-icon-md nav-user"></i><b></b>我的福利
						    	<i class="am-icon-angle-right" style="padding-left: 10px;"></i>
						    </div>
						</div>
			</div>
			<b class="line"></b>
		<div class="center">
			<div class="col-main">
				<div class="main-wrap">

					<div class="user-info">
						<!--标题 -->
						<div class="am-cf am-padding">
							<div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">个人资料</strong> / <small>Personal&nbsp;information</small></div>
						</div>
						<hr/>

						<!--头像 -->
						<div class="user-infoPic">

							<div class="filePic">
								<input type="file" class="inputPic" allowexts="gif,jpeg,jpg,png,bmp" accept="image/*">
								<img class="am-circle am-img-thumbnail" src="${APP_PATH}/static/images/getAvatar.do.jpg" alt="" />
							</div>

							<p class="am-form-help">头像</p>

							<div class="info-m">
								<div><b>用户名：<i id="usernameid" class="form-control-static"></i></b></div>
								<div class="u-level">
									<span class="rank r2">
							             <s class="vip1"></s><a class="classes" href="#" id="mvpid"></a>
						            </span>
								</div>
								<div class="u-safety">
									<a href="safety.html">
									 账户安全
									<span class="u-profile"><i class="bc_ee0000" style="width: 60px;" width="0" id="numid">60分</i></span>
									</a>
								</div>
							</div>
						</div>

						<!--个人信息 -->
						<div class="info-main">
							<form class="am-form am-form-horizontal" id="formid">

								<div class="am-form-group">
									<label for="user-name2" class="am-form-label">昵称</label>
									<div class="am-form-content">
										<input type="text" id="ncikid" required="true" placeholder="nickname" name="nickname">

									</div>
								</div>

								<div class="am-form-group">
									<label for="user-name" class="am-form-label">姓名</label>
									<div class="am-form-content">
										<input type="text" id="truenameid" required="true" placeholder="name" name="realname">

									</div>
								</div>

								<div class="am-form-group">
									<label class="am-form-label">性别</label>
									<div class="am-form-content sex">
										<label class="am-radio-inline">
											<input type="radio" name="sex" value="男" checked="checked"  data-am-ucheck> 男
										</label>
										<label class="am-radio-inline">
											<input type="radio" name="sex" value="女"  data-am-ucheck> 女
										</label>
										<label class="am-radio-inline">
											<input type="radio" name="sex" value="保密" data-am-ucheck> 保密
										</label>
									</div>
								</div>

								<div class="am-form-group">
									<label for="user-birth" class="am-form-label">身份证</label>
									<div class="am-form-content birth">
										<input type="text" id="idcarid" required="true" name="idcar" placeholder="身份证">
									</div>
							
								</div>
								<div class="am-form-group">
									<label for="user-phone" class="am-form-label">电话</label>
									<div class="am-form-content">
										<input id="user-phone" name="phone" required="true" placeholder="telephonenumber"  type="tel">

									</div>
								</div>
								<div class="am-form-group">
									<label for="user-email" class="am-form-label">电子邮件</label>
									<div class="am-form-content">
										<input id="user-email" name="email" required="true" placeholder="Email" type="email">

									</div>
								</div>
								
								<div class="am-form-group">
									<label for="user-email" class="am-form-label">收货地址</label>
									<div class="am-form-content">
										<a  class="am-form-label" id="addressid">
										
										</a>
									</div>
								</div>
							
								<div class="am-form-group ">
									<label for="user-safety" class="am-form-label">账号安全</label>
									<div class="am-form-content safety">
										<a class="am-form-label">
										  >
										</a>

									</div>
								</div>
								<div class="" align="center">
									<button type="button" class="btn btn-danger" id="saveinfo">保存修改</button>
								</div>

							</form>
						</div>

					</div>

				</div>
				<!--底部-->
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

			<aside class="menu">
				<ul>
					<li class="person">
						<a href="index.html">个人中心</a>
					</li>
					<li class="person">
						<a href="#">个人资料</a>
						<ul>
							<li class="active"> <a href="information.html">个人信息</a></li>
							<li> <a href="safety.html">安全设置</a></li>
							<li> <a href="address.html">收货地址</a></li>
						</ul>
					</li>
					<li class="person">
						<a href="#">我的交易</a>
						<ul>
							<li><a href="order.html">订单管理</a></li>
							<li> <a href="change.html">退款售后</a></li>
						</ul>
					</li>
					<li class="person">
						<a href="#">我的资产</a>
						<ul>
							<li> <a href="coupon.html">优惠券 </a></li>
							<li> <a href="bonus.html">红包</a></li>
							<li> <a href="bill.html">账单明细</a></li>
						</ul>
					</li>

					<li class="person">
						<a href="#">我的小窝</a>
						<ul>
							<li> <a href="collection.html">收藏</a></li>
							<li> <a href="foot.html">足迹</a></li>
							<li> <a href="comment.html">评价</a></li>
							<li> <a href="news.html">消息</a></li>
						</ul>
					</li>

				</ul>

			</aside>
		</div>

<script type="text/javascript">
  $(function(){
       //发送请求获取
	  $.ajax({
			url:"${APP_PATH}/info/selectinformation/"+6,
			type:"GET",
			
			success:function(result){
				
					var rel=result.extend.shop;
					$("#usernameid").text(rel.users.nickname);
					$("#mvpid").text(rel.level);
	 				$("#ncikid").val(rel.users.nickname);
					$("#truenameid").val(rel.users.realname);
					$("#user-phone").val(rel.users.phone);
					$("#user-email").val(rel.users.email);
					$("#idcarid").val(rel.users.idcard);
				    $("#formid input[name=sex]").val([rel.users.sex]);
				    var a=rel.shippingaddress.location+" "+rel.shippingaddress.detailaddress;
				    //alert(a);
				    $("#addressid").text(a);
			   }
			});
  
  });

  $("#saveinfo").click(function(){
       var idcar=/^\d{15}|\d{18}$/;
     if(!idcar.test( $("#idcarid").val())){
     layer.msg("身份证不符合！");
     }else{
     
             $.ajax({
			url:"${APP_PATH}/info/updateinformation/"+6,
			type:"POST",
			data:$("#formid").serialize(),
			success:function(result){
			   if(result.code==100){
			     layer.msg("保存成功！");
			   }
			
			}});
     }
      
  
  });
</script>
	</body>

</html>