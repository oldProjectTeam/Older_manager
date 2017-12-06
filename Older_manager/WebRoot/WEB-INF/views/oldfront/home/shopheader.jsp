<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	pageContext.setAttribute("APP_PATH", request.getContextPath());
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'shopheader.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
</head>
<body>
	<div class="hmtop">
		<!--顶部导航条 -->
		<div class="am-container header">
			<ul class="message-l">
				<div class="topMessage">
					<div class="menu-hd">
						<c:if test="${empty users}">
							<a href="${APP_PATH}/shop/login" target="_top" class="h">亲，请登录</a>
							<a href="${APP_PATH}/shop/register" target="_top">免费注册</a>
						</c:if>
						<c:if test="${!empty users}">
							欢迎
							<a href="${APP_PATH}/address/index" target="_top" class="h">
								<b>${users.account}</b>
							</a>
							<a href="javascript:logouttip()" target="_top" class="h"> <b>退出登录</b>
							</a>
						</c:if>
					</div>
				</div>
			</ul>
			<ul class="message-r">
				<div class="topMessage home">
					<div class="menu-hd">
						<a href="${APP_PATH}/" target="_top" class="h">官网</a>
					</div>
				</div>
				<div class="topMessage home">
					<div class="menu-hd">
						<a href="${APP_PATH}/shop/oldfronthome" target="_top" class="h">商城首页</a>
					</div>
				</div>
				<div class="topMessage my-shangcheng">
					<div class="menu-hd MyShangcheng">
						<a href="${APP_PATH}/address/index" target="_top"> <i
							class="am-icon-user am-icon-fw"></i>个人中心
						</a>
					</div>
				</div>
				<div class="topMessage mini-cart">
					<div class="menu-hd">
						<a id="mc-menu-hd"
							href="${APP_PATH}/cart/findAllByUserId?userId=${users.id}"
							target="_top"> <i class="am-icon-shopping-cart  am-icon-fw"></i><span>购物车</span><strong
							id="J_MiniCartNum" class="h">0</strong>
						</a>
					</div>
				</div>
				<div class="topMessage favorite">
					<div class="menu-hd">
						<a href="shop/collection" target="_top"> <i
							class="am-icon-heart am-icon-fw"></i><span>收藏夹</span>
						</a>
					</div>
			</ul>
		</div>
		<!--悬浮搜索框-->
		<div class="nav white">
			<div class="logoBig">
				<li><a href="${APP_PATH}/shop/oldfronthome"><img
						src="http://gyadmin-1252357563.file.myqcloud.com/images/oldback/images/logo.png"
						height="65px;" style="margin-top: 10px" /></a></li>
			</div>
			<div class="search-bar pr">
				<a name="index_none_header_sysc" href="#"></a>
				<form>
					<input id="searchInput" name="searchKeyWord" type="text"
						placeholder="搜索" autocomplete="on"> <input
						id="ai-topsearch" class="submit am-btn" value="搜索" index="1"
						type="button" onclick="search()">
				</form>
			</div>
		</div>
		<div class="clear"></div>
	</div>
	<script type="text/javascript">
		function logouttip() {
			layer.open({
				content : '是否需要退出登录？',
				btn : [ '退出', '取消' ],
				yes : function(index, layero) {
					window.location.href = "Shop/Userlogout";
				},
				btn2 : function(index, layero) {
					//return false 开启该代码可禁止点击该按钮关闭
				},

				cancel : function() {
					//右上角关闭回调
					//return false 开启该代码可禁止点击该按钮关闭
				}
			});
		}

		$(function() {
			updateNum();
		});

		function updateNum() {
			$.ajax({
				url : "${APP_PATH}/cart/findCartUserId",
				data : {
					"userId" : '${users.id}'
				},
				type : "GET",
				success : function(result) {
					if (result.code == 100) {
						$("#J_MiniCartNum").html(
								"(" + result.extend.carts + ")");
					}
				}
			});
		}

		function search() {
			var searchcontent = $("#searchInput").val();
			if (searchcontent == null || searchcontent == '') {
				layer.msg("请输入搜索信息", {
					offset : [ '16%' ]
				});
			} else {
				window.location.href = "home/search?searchKeyWord="
						+ searchcontent;
			}
		}

		document.onkeydown = function() {
			if (event.keyCode == 13) {
				search();
			}
		};
	</script>
</body>
</html>
