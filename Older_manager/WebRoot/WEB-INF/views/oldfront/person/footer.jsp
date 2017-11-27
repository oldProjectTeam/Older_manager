<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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

<title>My JSP 'footer.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"></script>
<script type="text/javascript">
	function contact() {
		layer.tips('邮箱:1834678427@qq.com', '#contact', {
			tips : [ 1, '#0FA6D8' ]
		});
	}
</script>
<style type="text/css">
.footer-bd a {
	text-decoration: none;
	color: black;
}

.footer-bd a:hover {
	color: blue;
}
</style>
</head>

<body>
	<div class="footer">
		<div class="footer-hd">
			<p>
				<a href="${APP_PATH}/">孝和集团</a> <b>|</b> <a
					href="${APP_PATH}/shop/oldfronthome">商城首页</a> <b>|</b> <a
					href="https://www.alipay.com/">支付宝</a> <b>|</b> <a
					href="${APP_PATH}/address/index">物流</a>
			</p>
		</div>
		<div class="footer-bd">
			<p>
				<a href="${APP_PATH}/older/about">关于孝和&nbsp;</a><a
					href="javascript:contact()" id="contact">联系我们</a> <em>© 2017
					XiaoHe.com 版权所有</em>
			</p>
		</div>
	</div>
</body>
</html>
