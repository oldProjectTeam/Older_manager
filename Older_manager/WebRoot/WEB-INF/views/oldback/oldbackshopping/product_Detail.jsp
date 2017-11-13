<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>产品详细</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
 
  <link rel="stylesheet" href="${APP_PATH}/static/shop/css/style.css"/>       
  <script src="${APP_PATH}/static/shop/js/jquery-1.9.1.min.js"></script>
  <script src="${APP_PATH}/static/shop/assets/js/bootstrap.min.js"></script>
  <link href="${APP_PATH}/static/shop/assets/css/bootstrap.min.css" rel="stylesheet" />
    <style type="text/css">
    .imgDiv {
            display: inline-block;
            position: relative;
            margin-top:5px;
            margin-left:5px
        }
    </style> 
  </head>
  
<body>
 <div class="page-content clearfix">
 <div class="brand_detailed" style="margin-top:-25px">
  <div class="brand_info clearfix">
    <div class="row" >
    	<div class="panel panel-default">
    		<table class="table table-hover">
  		<tr class="active">
  			<td>产品名称：</td>
  			<td>${product.name}</td>
  			<td>产品编号：</td>
  			<td>${product.number }</td>
  		</tr>
		<tr class="success">
			<td>产品类型：</td>
  			<td>${product.productType.name}</td>
  			<td>产品品牌：</td>
  			<td>${product.brand.name}</td>
		</tr>
		<tr class="info">
			<td>产品状态：</td>
  			<td>${product.state==1?'启用':'停用'}</td>
  			<td>审核状态：</td>
  			<td>${product.auditstatus==1?'审核通过':'正在审核'}</td>
		</tr>
		<tr class="info">
			<td>添加时间：</td>
  			<td><fmt:formatDate value="${product.addtime}" pattern='yyyy-MM-dd HH:mm:ss'/></td>
  			<td>单位：</td>
  			<td>${product.unit==null?"未知":product.unit}</td>
		</tr>
		<tr class="warning">
			<td>原价：</td>
  			<td>${product.orprice}元</td>
  			<td>现价：</td>
  			<td>${product.nowprice}元</td>
		</tr>
		<tr class="danger">
			<td>库存量：</td>
  			<td>${product.inventory}</td>
  			<td>销量：</td>
  			<td>${product.sales}</td>
		</tr>
		
		<tr class="active">
  			<td>产地：</td>
  			<td>${product.placeorigin==null?"未知":product.placeorigin}</td>
  			<td>材质：</td>
  			<td>${product.texture==null?"未知":product.texture }</td>
  		</tr>
  		<tr class="active">
  			<td>所属地区/国家：</td>
  			<td>${product.region}</td>
  			<td>重量：</td>
  			<td>${product.weight==null?"未知":product.weight}
  			    ${product.weight==null?"":"KG"}
  			</td>
  		</tr>
  		<tr class="active">
  			<td>关键词：</td>
  			<td colspan="3">
  				${product.productKeyword.keyword }
  			</td> 
  		</tr>
	</table>
	<div class="panel panel-success"" style="margin-top:8px">
	  <div class="panel-heading">内容摘要：</div>
	  <div class="panel-body">
	    ${product.synopsis}
	  </div>
	</div>
    <div class="panel panel-info">
	  <div class="panel-heading">详细描述：</div>
	  <div class="panel-body">
	    ${product.description}
	  </div>
	</div>
    <!--产品图片展示  -->
    <div class="panel panel-info">
	  <div class="panel-heading">产品图片展示：</div>
	  <div class="panel-body">
	     <c:if test="${empty product.imgList }">
				<center><h5>空空如也</h5></center>
		   </c:if>
		   <c:forEach items="${product.imgList }" var="img">
			    <div class="imgDiv">
			        <img src="${APP_PATH }/${img}" 
			        onerror="onerror=null;src='${APP_PATH }/static/images/f9b49612f9d78f425c77eae488b9c1ad.jpg'"
			        width="150px" height="150px"/>
				</div>
		   </c:forEach>
	      
	  </div>
	</div>
    </div>
    </div>
   </div>
 </div>
</div>
</body>
</html>
<script type="text/javascript">
$('.carousel').carousel({
	  interval:2000
});
 
 	//图层隐藏限时参数		 
$(function() { 
	$("#products_list").fix({
		float : 'left',
		//minStatue : true,
		skin : 'green',	
		durationTime :false,
		stylewidth:'220',
		spacingw:30,//设置隐藏时的距离
	    spacingh:260,//设置显示时间距
	});
});
//初始化宽度、高度  
 $(".widget-box").height($(window).height()-215); 
$(".table_menu_list").width($(window).width()-260);
 $(".table_menu_list").height($(window).height()-215);
  //当文档窗口发生改变时 触发  
    $(window).resize(function(){
	$(".widget-box").height($(window).height()-215);
	 $(".table_menu_list").width($(window).width()-260);
	  $(".table_menu_list").height($(window).height()-215);
	});
 

 
//面包屑返回值
var index = parent.layer.getFrameIndex(window.name);
parent.layer.iframeAuto(index);
$('.Order_form').on('click', function(){
	var cname = $(this).attr("title");
	var chref = $(this).attr("href");
	var cnames = parent.$('.Current_page').html();
	var herf = parent.$("#iframe").attr("src");
    parent.$('#parentIfour').html(cname);
    parent.$('#iframe').attr("src",chref).ready();;
	parent.$('#parentIfour').css("display","inline-block");
	//parent.$('.Current_page').attr({"name":herf,"href":"javascript:void(0)"}).css({"color":"#4c8fbd","cursor":"pointer"});
	parent.$('.parentIframe').attr("name",herf).css({"color":"#4c8fbd","cursor":"pointer"});
	//parent.$('.Current_page').html("<a href='javascript:void(0)' name="+herf+" class='iframeurl'>" + cnames + "</a>");
    parent.layer.close(index);
	
});
</script>

