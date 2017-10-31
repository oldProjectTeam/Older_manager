<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${APP_PATH}/static/css/oldbackstyle.css" rel="stylesheet"
	type="text/css" />
<script language="JavaScript" src="${APP_PATH}/static/js/jquery.js"></script>

<script type="text/javascript">
	$(function() {
		//导航切换
		$(".menuson li").click(function() {
			$(".menuson li.active").removeClass("active")
			$(this).addClass("active");
		});

		$('.title').click(function() {
			var $ul = $(this).next('ul');
			$('dd').find('ul').slideUp();
			if ($ul.is(':visible')) {
				$(this).next('ul').slideUp();
			} else {
				$(this).next('ul').slideDown();
			}
		});
	});
</script>
</head>
<body style="background:#f0f9fd;">
	<div class="lefttop">
		<span></span>后台管理
	</div>
	<dl class="leftmenu" id="menu">
		<c:if test="${activeUser.listMenus!=null}">
			<c:forEach items="${activeUser.listMenus}" var="menu">
				<dd>
					<div class="title">
						<span><img src="${menu.menuImg}" width="30" height="30"
							style="margin-top: -8px;" /></span> <a href="${menu.menuUrl}"
							target="rightFrame">${menu.menuName}</a>
					</div>
					<ul class="menuson">
						<c:forEach items="${menu.menus}" var="childMenu">
							<li><cite></cite><a href="${childMenu.url}"
								target="rightFrame">${childMenu.name}</a><i></i></li>
						</c:forEach>
					</ul>
				</dd>
			</c:forEach>
		</c:if>
	</dl>
</body>
</html>
