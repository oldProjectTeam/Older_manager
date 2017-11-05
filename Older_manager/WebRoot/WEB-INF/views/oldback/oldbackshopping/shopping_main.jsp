<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>网站后台管理系统</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta charset="utf-8" />
<title>老人电商后台管理系统</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link href="${APP_PATH}/static/shop/assets/css/bootstrap.min.css"
	rel="stylesheet" />
<link rel="stylesheet"
	href="${APP_PATH}/static/shop/assets/css/font-awesome.min.css" />
<!--[if IE 7]>
		  <link rel="stylesheet" href="${APP_PATH}/static/shop/assets/css/font-awesome-ie7.min.css" />
		<![endif]-->
<link rel="stylesheet"
	href="${APP_PATH}/static/shop/assets/css/ace.min.css" />
<link rel="stylesheet"
	href="${APP_PATH}/static/shop/assets/css/ace-rtl.min.css" />
<link rel="stylesheet"
	href="${APP_PATH}/static/shop/assets/css/ace-skins.min.css" />
<link rel="stylesheet" href="${APP_PATH}/static/shop/css/style.css" />
<!--[if lte IE 8]>
		  <link rel="stylesheet" href="${APP_PATH}/static/shop/assets/css/ace-ie.min.css" />
		<![endif]-->
<script src="${APP_PATH}/static/shop/assets/js/ace-extra.min.js"></script>
<!--[if lt IE 9]>
		<script src="${APP_PATH}/static/shop/assets/js/html5shiv.js"></script>
		<script src="${APP_PATH}/static/shop/assets/js/respond.min.js"></script>
		<![endif]-->
<!--[if !IE]> -->
<script src="${APP_PATH}/static/shop/js/jquery-1.9.1.min.js"></script>
<!-- <![endif]-->
<!--[if IE]>
         <script type="text/javascript">window.jQuery || document.write("<script src='./static/shop/assets/js/jquery-1.10.2.min.js'>"+"<"+"script>");</script>
        <![endif]-->
<script type="text/javascript">
	if ("ontouchend" in document)
		document
				.write("<script src='./static/shop/assets/js/jquery.mobile.custom.min.js'>"
						+ "<"+"script>");
</script>
<script src="${APP_PATH}/static/shop/assets/js/bootstrap.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/typeahead-bs2.min.js"></script>
<!--[if lte IE 8]>
		  <script src="${APP_PATH}/static/shop/assets/js/excanvas.min.js"></script>
		<![endif]-->
<script src="${APP_PATH}/static/shop/assets/js/ace-elements.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/ace.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>
<script src="${APP_PATH}/static/shop/assets/laydate/laydate.js"
	type="text/javascript"></script>
<script type="text/javascript">
	$(function() {
		var cid = $('#nav_list> li>.submenu');
		cid.each(function(i) {
			$(this).attr('id', "Sort_link_" + i);

		})
	})
	jQuery(document)
			.ready(
					function() {
						$.each($(".submenu"), function() {
							var $aobjs = $(this).children("li");
							var rowCount = $aobjs.size();
							var divHeigth = $(this).height();
							$aobjs.height(divHeigth / rowCount);
						});
						//初始化宽度、高度    
						$("#main-container").height($(window).height() - 76);
						$("#iframe").height($(window).height() - 140);

						$(".sidebar").height($(window).height() - 99);
						var thisHeight = $("#nav_list").height(
								$(window).outerHeight() - 173);
						$(".submenu").height();
						$("#nav_list").children(".submenu").css("height",
								thisHeight);

						//当文档窗口发生改变时 触发  
						$(window).resize(
								function() {
									$("#main-container").height(
											$(window).height() - 76);
									$("#iframe").height(
											$(window).height() - 140);
									$(".sidebar").height(
											$(window).height() - 99);

									var thisHeight = $("#nav_list").height(
											$(window).outerHeight() - 173);
									$(".submenu").height();
									$("#nav_list").children(".submenu").css(
											"height", thisHeight);
								});
						$(".iframeurl")
								.click(
										function() {
											var cid = $(this).attr("name");
											var cname = $(this).attr("title");
											$("#iframe").attr("src", cid)
													.ready();
											$("#Bcrumbs").attr("href", cid)
													.ready();
											$(".Current_page a").attr('href',
													cid).ready();
											$(".Current_page")
													.attr('name', cid);
											$(".Current_page").html(cname).css(
													{
														"color" : "#333333",
														"cursor" : "default"
													}).ready();
											$("#parentIframe")
													.html(
															'<span class="parentIframe iframeurl"> </span>')
													.css("display", "none")
													.ready();
											$("#parentIfour").html('').css(
													"display", "none").ready();
										});

					});
	/*********************点击事件*********************/
	$(document).ready(
			function() {
				$('#nav_list').find('li.home').click(function() {
					$('#nav_list').find('li.home').removeClass('active');
					$(this).addClass('active');
				});

				//时间设置
				function currentTime() {
					var d = new Date(), str = '';
					str += d.getFullYear() + '年';
					str += d.getMonth() + 1 + '月';
					str += d.getDate() + '日';
					str += d.getHours() + '时';
					str += d.getMinutes() + '分';
					str += d.getSeconds() + '秒';
					return str;
				}
				setInterval(function() {
					$('#time').html(currentTime)
				}, 1000);
				//修改密码
				$('.change_Password').on(
						'click',
						function() {
							layer.open({
								type : 1,
								title : '修改密码',
								area : [ '300px', '300px' ],
								shadeClose : true,
								content : $('#change_Pass'),
								btn : [ '确认修改' ],
								yes : function(index, layero) {
									if ($("#password").val() == "") {
										layer.alert('原密码不能为空!', {
											title : '提示框',
											icon : 0,

										});
										return false;
									}
									if ($("#Nes_pas").val() == "") {
										layer.alert('新密码不能为空!', {
											title : '提示框',
											icon : 0,

										});
										return false;
									}

									if ($("#c_mew_pas").val() == "") {
										layer.alert('确认新密码不能为空!', {
											title : '提示框',
											icon : 0,

										});
										return false;
									}
									if (!$("#c_mew_pas").val
											|| $("#c_mew_pas").val() != $(
													"#Nes_pas").val()) {
										layer.alert('密码不一致!', {
											title : '提示框',
											icon : 0,

										});
										return false;
									} else {
										layer.alert('修改成功！', {
											title : '提示框',
											icon : 1,
										});
										layer.close(index);
									}
								}
							});
						});
				$('#Exit_system').on('click', function() {
					layer.confirm('是否确定退出系统？', {
						btn : [ '是', '否' ],//按钮
						icon : 2,
					}, function() {
						location.href = "logout";

					});
				});
			})
</script>
</head>
<body>
	<!--个人资料模态框 -->
	<div class="modal fade bs-example-modal-sm" id="myModal" tabindex="-1"
		role="dialog" aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">个人资料</h4>
				</div>
				<div class="modal-body">
					<form class="form-horizontal">
						<div class="form-group">
							<label class="col-sm-2 control-label">用户名:</label>
							<div class="col-sm-10">
								<input type="text" class="form-control"
									value="${activeUser.usercode}" disabled="disabled">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">所属角色:</label>
							<div class="col-sm-10">
								<input type="text" class="form-control"
									value="${activeUser.username}" disabled="disabled">
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">具有权限:</label>
							<div class="col-sm-10">
								<table class="table table-bordered">
									<tr>
										<td>权限名称</td>
									</tr>
									<c:forEach items="${activeUser.menus}" var="menu">
										<tr>
											<td>${menu.name}</td>
										</tr>
									</c:forEach>
								</table>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<!-- 个人资料 -->
	<div class="navbar navbar-default" id="navbar">
		<script type="text/javascript">
			try {
				ace.settings.check('navbar', 'fixed')
			} catch (e) {
			}
		</script>
		<div class="navbar-container" id="navbar-container">
			<div class="navbar-header pull-left">
				<a href="backShopMain" class="navbar-brand"> <small> <img
						src="${APP_PATH}/static/shop/images/logo.png" width="240"
						style="margin-top: 15px;" height="50">
				</small>
				</a>
			</div>
			<!-- /.navbar-header -->
			<div class="navbar-header pull-right" role="navigation">
				<ul class="nav ace-nav">
					<li><a data-toggle="dropdown" href="#" class="dropdown-toggle">
							<span class="time"><em id="time"></em></span><span
							class="user-info" style="margin-top: 12px;">${activeUser.usercode}</span>
							<i class="icon-caret-down"></i>
					</a>
						<ul
							class="user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
							<li><a href="#" data-toggle="modal" data-target="#myModal"><i
									class="icon-user"></i>个人资料</a></li>
							<li class="divider"></li>
							<li><a href="javascript:ovid(0)" id="Exit_system"><i
									class="icon-off"></i>退出</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="main-container" id="main-container">
		<script type="text/javascript">
			try {
				ace.settings.check('main-container', 'fixed');
			} catch (e) {
			}
		</script>
		<div class="main-container-inner">
			<a class="menu-toggler" id="menu-toggler" href="#"> <span
				class="menu-text"></span>
			</a>
			<div class="sidebar" id="sidebar">
				<script type="text/javascript">
					try {
						ace.settings.check('sidebar', 'fixed')
					} catch (e) {
					}
				</script>
				<div class="sidebar-shortcuts" id="sidebar-shortcuts">
					<div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
						老人电商后台管理系统</div>
					<div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
						<span class="btn btn-success"></span> <span class="btn btn-info"></span>
						<span class="btn btn-warning"></span> <span class="btn btn-danger"></span>
					</div>
				</div>
				<!-- #sidebar-shortcuts -->
				<ul class="nav nav-list" id="nav_list">
					<c:if test="${activeUser.listMenus!=null}">
						<c:forEach items="${activeUser.listMenus}" var="menu">
							<li><a href="#" class="dropdown-toggle"> <i
									class="${menu.menuImg}"></i><span class="menu-text">
										${menu.menuName} </span><b class="arrow icon-angle-down"></b></a>
								<ul class="submenu">
									<c:forEach items="${menu.menus}" var="childMenu">
										<li class="home"><a href="javascript:void(0)"
											name="${childMenu.url}" title="${childMenu.name}"
											class="iframeurl"><i class="icon-double-angle-right"></i>${childMenu.name}</a></li>
									</c:forEach>
								</ul></li>
						</c:forEach>
					</c:if>
				</ul>
				<div class="sidebar-collapse" id="sidebar-collapse">
					<i class="icon-double-angle-left"
						data-icon1="icon-double-angle-left"
						data-icon2="icon-double-angle-right"></i>
				</div>
				<script type="text/javascript">
					try {
						ace.settings.check('sidebar', 'collapsed')
					} catch (e) {
					}
				</script>
			</div>
			<div class="main-content">
				<script type="text/javascript">
					try {
						ace.settings.check('breadcrumbs', 'fixed');
					} catch (e) {
					}
				</script>
				<div class="breadcrumbs" id="breadcrumbs">
					<ul class="breadcrumb">
						<li><i class="icon-home home-icon"></i> <a
							href="backShopMain" style="margin-top: 10px;">首页</a></li>
						<li class="active"><span class="Current_page iframeurl"></span></li>
						<li class="active" id="parentIframe"><span
							class="parentIframe iframeurl"></span></li>
						<li class="active" id="parentIfour"><span
							class="parentIfour iframeurl"></span></li>
					</ul>
				</div>

				<iframe id="iframe"
					style="border:0; width:100%; background-color:#FFF;" name="iframe"
					frameborder="0" src="home.html"> </iframe>


				<!-- /.page-content -->
			</div>
			<!-- /.main-content -->

			<div class="ace-settings-container" id="ace-settings-container">
				<div class="btn btn-app btn-xs btn-warning ace-settings-btn"
					id="ace-settings-btn">
					<i class="icon-cog bigger-150"></i>
				</div>

				<div class="ace-settings-box" id="ace-settings-box">
					<div>
						<div class="pull-left">
							<select id="skin-colorpicker" class="hide">
								<option data-skin="default" value="#438EB9">#438EB9</option>
								<option data-skin="skin-1" value="#222A2D">#222A2D</option>
								<option data-skin="skin-2" value="#C6487E">#C6487E</option>
								<option data-skin="skin-3" value="#D0D0D0">#D0D0D0</option>
							</select>
						</div>
						<span>&nbsp; 选择皮肤</span>
					</div>

					<div>
						<input type="checkbox" class="ace ace-checkbox-2"
							id="ace-settings-sidebar" /> <label class="lbl"
							for="ace-settings-sidebar"> 固定滑动条</label>
					</div>

					<div>
						<input type="checkbox" class="ace ace-checkbox-2"
							id="ace-settings-rtl" /> <label class="lbl"
							for="ace-settings-rtl">切换到左边</label>
					</div>

					<div>
						<input type="checkbox" class="ace ace-checkbox-2"
							id="ace-settings-add-container" /> <label class="lbl"
							for="ace-settings-add-container"> 切换窄屏 <b></b>
						</label>
					</div>
				</div>
			</div>
			<!-- /#ace-settings-container -->
		</div>
		<!-- /.main-container-inner -->

	</div>
	<!--底部样式-->
	<div class="footer_style" id="footerstyle">
		<p class="l_f">版权所有：孝和集团</p>
		<p class="r_f">地址：贵州省贵阳市</p>
	</div>
	<!--修改密码样式-->
	<div class="change_Pass_style" id="change_Pass">
		<ul class="xg_style">
			<li><label class="label_name">原&nbsp;&nbsp;密&nbsp;码</label><input
				name="原密码" type="password" class="" id="password"></li>
			<li><label class="label_name">新&nbsp;&nbsp;密&nbsp;码</label><input
				name="新密码" type="password" class="" id="Nes_pas"></li>
			<li><label class="label_name">确认密码</label><input name="再次确认密码"
				type="password" class="" id="c_mew_pas"></li>
		</ul>
	</div>
</body>
</html>
