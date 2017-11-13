<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>品牌详细</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link href="${APP_PATH}/static/shop/assets/css/bootstrap.min.css"
	rel="stylesheet" />
<link rel="stylesheet" href="${APP_PATH}/static/shop/css/style.css" />
<link rel="stylesheet"
	href="${APP_PATH}/static/shop/assets/css/ace.min.css" />
<link rel="stylesheet"
	href="${APP_PATH}/static/shop/assets/css/font-awesome.min.css" />
<link href="${APP_PATH}/static/shop/Widget/icheck/icheck.css"
	rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="${APP_PATH}/static/shop/assets/css/font-awesome.min.css" />
<script src="${APP_PATH}/static/shop/js/jquery-1.9.1.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/bootstrap.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/typeahead-bs2.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/jquery.dataTables.min.js"></script>
<script
	src="${APP_PATH}/static/shop/assets/js/jquery.dataTables.bootstrap.js"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>
<script src="${APP_PATH}/static/shop/assets/laydate/laydate.js"
	type="text/javascript"></script>
<script type="text/javascript" src="${APP_PATH}/static/shop/js/H-ui.js"></script>
<script type="text/javascript"
	src="${APP_PATH}/static/shop/js/H-ui.admin.js"></script>
<script src="${APP_PATH}/static/shop/js/lrtk.js" type="text/javascript"></script>
</head>

<body>
	<div class="page-content clearfix">
		<div class="brand_detailed">
			<div class="brand_info clearfix">
				<div class="title_brand">品牌信息</div>
				<form>
					<ul class="Info_style clearfix">
						<li><label class="label_name">品牌名称：</label> <span
							class="name">${brand.name}</span></li>
						<li><label class="label_name">品牌类型：</label><span class="name">${brand.region!=中国?'国外品牌':'国内品牌'}</span></li>
						<li><label class="label_name">所属国家：</label><span class="name">${brand.region}</span></li>
						<li><label class="label_name">品牌编号：</label><span class="name">${brand.brandid }</span></li>
						<li><label class="label_name">品牌排序：</label><span class="name">${brand.sort}</span></li>
						<li><label class="label_name">添加时间：</label><span class="name"><fmt:formatDate
									value="${brand.addtime}" pattern='yyyy-MM-dd HH:mm:ss' /></span></li>
						<li>
						<label class="label_name">状&nbsp;&nbsp;&nbsp;&nbsp;态：</label><span
							class="name">${brand.state==1?'启用':'停用'}</span></li>
						<br><br>
						<li class="b_Introduce">
							<label class="label_name">品牌介绍：</label>
							<p>${brand.description }</p>
						</li>
					</ul>
					<div class="brand_logo">
						<img src="${APP_PATH }/${brand.logoimage}" onerror="onerror=null;src='${APP_PATH }/upload/152.jpg'"
						 width="120px" height="60px" />
						<p class="name">${brand.name}</p>
					</div>
				</form>
			</div>
		</div>
		 
		<div class="border clearfix">
			<span class="l_f"> <a href="javascript:window.history.back();" title="返回"
				class="btn btn-warning Order_form"><i class="icon-plus"></i>返回</a>
			</span>
		</div>
		 
	</div>
</body>
</html>
 

