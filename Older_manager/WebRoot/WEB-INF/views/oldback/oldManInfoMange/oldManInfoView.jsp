<%@page import="com.older.manager.bean.Oldman"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'addOldManInfo.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<!-- 引入jquery -->
<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery-1.7.2.min.js"></script>
<!-- 引入样式 -->

<link
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>
</head>

<body>
	<!--路劲导航  -->
	<div class="row">
		<div class="col-md-12">
			<ol class="breadcrumb">
				<li><b>位置：老人档案管理</b></li>
				<li><b>老人列表</b></li>
				<li class="active">查看老人信息</li>
			</ol>
		</div>
	</div>

	<!--页内导航栏  -->
	<div class="row">
		<div class="col-md-12">
			<ul class="nav nav-tabs">
				<li role="presentation" class="active"><a>老人基本信息</a></li>
				<li role="presentation"><a
					href="${APP_PATH}/rel/skipallrelatives/${oldman.id}&${selectpn}">亲属信息</a></li>
			</ul>
		</div>
	</div>





	<!--主体内容  -->
	<div class="row" style="margin-left:3px;padding-top:20px;">
		<div class="col-md-12">
			<div class="table-responsive">
				<form class="form-horizontal">
					<table class="table text-center table-bordered">
						<tr>
							<td>老人姓名:</td>
							<td>${oldman.name}</td>
							<td>身份证号:</td>
							<td>${oldman.idcar}</td>
							<td>性别:</td>
							<td>${oldman.sex}</td>
							<td rowspan="4"><img
								src="${pageContext.request.contextPath}/${oldman.photo==null?'upload/default.png':oldman.photo}"
								width="200" height="150"></td>
						</tr>
						<tr>
							<td>联系手机号：</td>
							<td>${oldman.phone}</td>
							<td>婚姻状况：</td>
							<td>${oldman.marriage}</td>
							<td>民族：</td>
							<td>${oldman.nation}</td>
						</tr>
						<tr>
							<td>老人类别：</td>
							<td>${oldman.type}</td>
							<td>出生日期：</td>
							<td><fmt:formatDate value="${oldman.birthday}"
									pattern="yyyy-MM-dd" /></td>
							<td>年龄：</td>
							<td>${oldman.age}</td>
						</tr>
						<tr>
							<td>家庭地址：</td>
							<td colspan="2">${oldman.address}</td>
							<td>所属服务点：</td>
							<td colspan="2">${oldman.service}</td>
						</tr>
						<tr>
							<td colspan="8" align="left">紧急联系人</td>
						</tr>
						<tr>
							<td>紧急联系人：</td>
							<td>${oldman.urgencycontact}</td>
							<td>联系电话：</td>
							<td>${oldman.urgencycontactphone}</td>
							<td>关系：</td>
							<td>${oldman.relation}</td>
							<td>是否同住</td>
							<td>${oldman.liveinfo}</td>
						</tr>
						<tr>
							<td colspan="8" align="left">老人服务信息</td>
						</tr>
						<tr>
							<td>服务类型：</td>
							<td>${oldman.servicetype}</td>
							<td>服务状态：</td>
							<td>${oldman.servicestatu}</td>

						</tr>
						<tr>
							<td colspan="8" align="left">老人经济情况</td>
						</tr>
						<tr>
							<td>经济来源：</td>
							<td>${oldman.economicsource}</td>
							<td>月收入</td>
							<td>${oldman.monthlyincome}</td>
							<td>医疗保障：</td>
							<td>${oldman.healthcare}</td>
							<td>社保号</td>
							<td>${oldman.socialsecurityno}</td>
						</tr>
						<tr>
							<td colspan="8" align="left">老人健康情况</td>
						</tr>
						<tr>
							<td>慢性病：</td>
							<td>${oldman.chronicdiseases}</td>
							<td>血型</td>
							<td>${oldman.bloodtype}</td>
							<td>失能情况：</td>
							<td>${oldman.disabilitysituation}</td>
							<td>残疾情况：</td>
							<td>${oldman.disability}</td>
						</tr>
						<tr>
							<td colspan="8" align="left">备注信息</td>
						</tr>
						<tr>
							<td>文化程度：</td>
							<td>${oldman.educationlevel}</td>
							<td>专业</td>
							<td>${oldman.majors}</td>
							<td>职称</td>
							<td>${oldman.title}</td>
							<td>原单位</td>
							<td>${oldman.unitorignal}</td>
						</tr>
						<tr>
							<td colspan="8">
								<button type="button" class="btn btn-info" id="goback">返回</button>
							</td>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</div>
	<script type="text/javascript">
	 $("#goback").click(function(){
	     //var a = '
	     
	     
	     var selectpn='<%=request.getAttribute("selectpn")%>';
	      window.location.href="${APP_PATH}/old/skipolderinfo/"+selectpn;
	 });
	
	
	</script>
	
</body>
</html>
