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
    
    <title>My JSP 'password.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="${APP_PATH}/static/css/admin.css" rel="stylesheet" type="text/css">
		<link href="${APP_PATH}/static/css/amazeui.css" rel="stylesheet" type="text/css">

		<link href="${APP_PATH}/static/css/personal.css" rel="stylesheet" type="text/css">
		<link href="${APP_PATH}/static/css/stepstyle.css" rel="stylesheet" type="text/css">

		<script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.7.2.min.js"></script>
		<script src="${APP_PATH}/static/js/amazeui.js"></script>
         	<script src="${APP_PATH}/static/shop/assets/layer/layer.js" type="text/javascript"></script>
	   <script src="${APP_PATH}/static/js/jquery.min.js" type="text/javascript"></script>
	   
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

					<div class="am-cf am-padding">
						<div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">修改密码</strong> / <small>Password</small></div>
					</div>
					<hr/>
					
					
				
					  	<div align="center">
					  <div class="progress" style="width:100%;height:2px;">
							<div class="progress-bar" id="prog" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 0%;">
								<span class="sr-only" id="proglabel">40% 完成</span>
							</div>
					 </div>
					</div>
						<div class="m-progress">	
					   </div>
				
					
					<form class="am-form am-form-horizontal" id="formid">
						<div class="am-form-group">
							<label for="user-old-password" class="am-form-label">原密码</label>
							<div class="am-form-content">
								<input type="password" id="pass1"  placeholder="请输入原登录密码">
							</div>
						</div>
						<div class="am-form-group">
							<label for="user-new-password" class="am-form-label">新密码</label>
							<div class="am-form-content">
								<input type="password" id="pass2" placeholder="由数字、字母组合">
							</div>
						</div>
						<div class="am-form-group">
							<label for="user-confirm-password" name="password" class="am-form-label">确认密码</label>
							<div class="am-form-content">
								<input type="password" id="pass3" placeholder="请再次输入上面的密码">
							</div>
						</div>
						<div class="" align="center">
							<!-- <div class="am-btn am-btn-danger">保存修改</div> -->
							<button type="button" class="btn btn-danger" id="saveid">保存修改</button>
						</div>

					</form>

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
							<li> <a href="information.html">个人信息</a></li>
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
var password;
$(function(){
       $("#saveid").attr("disabled",true);
       //发送请求获取
	  $.ajax({
			url:"${APP_PATH}/safety/selectuserbyid/"+6,
			type:"GET",
			
			success:function(result){
				
					var rel=result.extend.users;
					/* $("#usernameid").text(rel.users.nickname);
					$("#mvpid").text(rel.level); */
					 password=rel.password;
	 			/* 	$("#ncikid").val(rel.users.nickname);
					$("#truenameid").val(rel.users.realname);
					$("#user-phone").val(rel.users.phone);
					$("#user-email").val(rel.users.email);
					$("#idcarid").val(rel.users.idcard);
				    $("#formid input[name=sex]").val([rel.users.sex]);
				    var a=rel.shippingaddress.location+" "+rel.shippingaddress.detailaddress;
				    //alert(a);
				    $("#addressid").text(a); */
			   }
			});
  
  });
  
  $("#pass1").change(function(){
    if($("#pass1").val()==password){
         $("#saveid").attr("disabled",false);
        
        
    }else{
         layer.msg("原密码不对");
        $("#saveid").attr("disabled",true);
    }
  });
  //点击保存
  $("#saveid").click(
       function(){
              var value = 0;
              var time = 10;
              //进度条复位函数
              
             
         
   if($("#pass2").val()!=$("#pass3").val()){
     layer.msg("新密码不一致");
   }else{
           function reset( ) {
                value = 0;
                  $("#prog").removeClass("progress-bar-success").css("width","0%").text("等待启动");
                  //setTimeout(increment,5000);
              }
              //百分数增加，0-30时为红色，30-60为黄色，60-90为蓝色，>90为绿色
              function increment( ) {
                  value += 1;
                  $("#prog").css("width",value + "%").text(value + "%");
                  if (value>=0 && value<=30) {
                      $("#prog").addClass("progress-bar-danger");
                  }
                  else if (value>=30 && value <=60) {
                      $("#prog").removeClass("progress-bar-danger");
                      $("#prog").addClass("progress-bar-warning");
                  }
                  else if (value>=60 && value <=90) {
                      $("#prog").removeClass("progress-bar-warning");
                      $("#prog").addClass("progress-bar-info");
                  }
                  else if(value >= 90 && value<100) {
                      $("#prog").removeClass("progress-bar-info");
                      $("#prog").addClass("progress-bar-success");    
                  }
                  else{
                      setTimeout(reset,1000);
                      return;

                  }

                  st = setTimeout(increment,time);
              }

              increment();
   
      $.ajax({
			url:"${APP_PATH}/safety/upateusers/"+6+"&"+$("#pass3").val(),
			type:"POST",
			success:function(result){
			   if(result.code==100){
			      value =100;
			     layer.msg("保存成功！");
			     $("#formid")[0].reset();
			   }
			
			}});
   }
  });
  

</script>


	</body>

</html>