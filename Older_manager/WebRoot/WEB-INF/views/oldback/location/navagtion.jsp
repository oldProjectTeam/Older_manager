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

<title>My JSP 'navagtion.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
<style type="text/css">
body,html {
	width: 100%;
	height: 100%;
	margin: 0;
	font-family: "微软雅黑";
}

#allmap {
	height: 500px;
	width: 100%;
}

#r-result {
	width: 100%;
	font-size: 14px;
}
</style>
<script type="text/javascript"
	src="http://api.map.baidu.com/api?v=2.0&ak=iS6LnjyLHNYBpvVCNGY6fGsDOvBH1tf0"></script>
<link
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery-1.7.2.min.js"></script>

</head>

<body style="margin: 15px;">
	<div id="r-result">
		<form class="form-inline">
			<div class="form-group">
				<label>城市名:</label> <input type="text" class="form-control"
					id="cityName" type="text" style="width:200px; margin-right:10px;"
					placeholder="请输入城市名">
			</div>
			<button type="button" class="btn btn-sm btn-success"
				onclick="theLocation()">查询</button>
				<span id="city" style="margin-left: 15px;font-size: 18px;"></span>
		</form>
	</div>
	<div id="allmap"></div>
</body>

<script type="text/javascript">
	// 百度地图API功能
	var map = new BMap.Map("allmap");
	var point = new BMap.Point(116.331398, 39.897445);
	map.centerAndZoom(point, 11);

	function theLocation() {
		var city = document.getElementById("cityName").value;
		if (city != "") {
			map.centerAndZoom(city, 11); // 用城市名设置地图中心点
		}
	}
	
	// 百度地图API功能
	map.centerAndZoom(point,12);

	function myFun(result){
		var cityName = result.name;
		map.setCenter(cityName);
		$("#city").append("当前定位城市:"+cityName);
	}
	var myCity = new BMap.LocalCity();
	myCity.get(myFun);
</script>
</html>
