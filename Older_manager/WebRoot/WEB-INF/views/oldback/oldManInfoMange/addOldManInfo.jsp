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
<script language="JavaScript"
	src="${APP_PATH}/static/js/uploadPreview.js"></script>

<link
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>

<body style="margin: 15px;">
	<!--路劲导航  -->
	<div class="row">
		<div class="col-md-12">
			<ol class="breadcrumb">
				<li><b>位置：<a
						href="static/oldback/oldManInfoMange/index.html">老人档案管理</a></b></li>
				<li class="active">新增老人</li>
			</ol>
		</div>
	</div>

	<!--主体内容  -->
	<div class="row">
		<div class="col-md-12">
			&nbsp;&nbsp;
			<div class="table-responsive">
				<form class="form-horizontal" enctype="multipart/form-data"
					method="post" action="${APP_PATH}/old/addnewolder/99999">
					<table class="table text-center table-bordered">
						<tr>
							<td><font color=red>*</font>老人姓名:</td>
							<td><input type="text" required="required" name="name"
								style="width:120px" /></td>
							<td><font color=red>*</font>身份证号:</td>
							<td><input type="text" required="required" name="idcar"
								style="width:150px" /></td>
							<td><font color=red>*</font>性别:</td>
							<td><select style="width:70px" name="sex">
									<option>男</option>
									<option>女</option>
							</select></td>
							<td rowspan="4" style="width:80px">图片</td>
							<td rowspan="4"><input type="hidden" name="photo"> <input
								type="file" multiple="multiple" class="btn btn-default"
								value="图片管理" name="file" id="up_img" /> <img
								src="${pageContext.request.contextPath}/upload/${user.image==null?'failure.png':user.image}"
								id="imgShow" class="img-responsive"></td>
						</tr>
						<tr>
							<td><font color=red>*</font>联系手机号：</td>
							<td><input type="text" required="required" name="phone"
								style="width:120px" /></td>
							<td>婚姻状况：</td>
							<td><select style="width:70px" name="marriage">
									<option>已婚</option>
									<option>未婚</option>
									<option>离异</option>
									<option>丧偶</option>
									<option>再婚</option>
							</select></td>
							<td><font color=red>*</font>民族：</td>
							<td><select name="nation">
									<option>汉族</option>
									<option>土家族</option>
									<option>彝族</option>
									<option>壮族</option>
									<option>水族</option>
									<option>侗族</option>
									<option>布依族</option>
									<option>苗族</option>
									<option>其它</option>
							</select></td>
						</tr>
						<tr>
							<td>老人类别：</td>
							<td><select name="type">
									<option>低保老人</option>
									<option>独居老人</option>
									<option>三无老人</option>
									<option>孤寡老人</option>
							</select></td>
							<td><font color=red>*</font>出生日期：</td>
							<td><input type="date" name="birthday" required="required" />
							</td>
							<td><font color=red>*</font>年龄：</td>
							<td><input type="text" required="required" name="age"
								style="width:120px;" /></td>
						</tr>
						<tr>
							<td><font color=red>*</font>家庭地址：</td>
							<td colspan="2"><input type="text" name="address"
								required="required" /></td>
							<td><font color=red>*</font>所属服务点：</td>
							<td colspan="2"><select name="service">
									<option>贵阳分部</option>
									<option>北京分部</option>
									<option>南通分部</option>
									<option>杭州分部</option>
							</select></td>
						</tr>
						<tr>
							<td colspan="8" align="left">紧急联系人</td>
						</tr>
						<tr>
							<td><font color=red>*</font>紧急联系人：</td>
							<td><input type="text" name="urgencycontact"
								required="required" style="width:120px" /></td>
							<td><font color=red>*</font>联系电话：</td>
							<td><input type="text" name="urgencycontactphone"
								required="required" style="width:120px" /></td>
							<td>关系：</td>
							<td><select style="width:70px" name="relation">
									<option>父子</option>
									<option>母子</option>
									<option>兄弟</option>
									<option>儿子</option>
							</select></td>
							<td>是否同住</td>
							<td><select style="width:70px" name="liveinfo">
									<option>是</option>
									<option>否</option>

							</select></td>
						</tr>
						<tr>
							<td colspan="8" align="left">老人服务信息</td>
						</tr>
						<tr>
							<td>服务类型：</td>
							<td><select style="width:120px" name="servicetype">
									<option>残联购买</option>
									<option>有偿服务</option>
									<option>政府购买</option>
							</select></td>
							<td><font color=red>*</font>服务状态：</td>
							<td><select style="width:120px" name="servicestatu">
									<option>请选择</option>
									<option>迁出服务区</option>
									<option>去世</option>
									<option>停止服务</option>
									<option>移民国外</option>
									<option>正常服务</option>
							</select></td>

						</tr>
						<tr>
							<td colspan="8" align="left">老人经济情况</td>
						</tr>
						<tr>
							<td>经济来源：</td>
							<td><select style="width:120px" name="economicsource">
									<option>出租房子</option>
									<option>社保工资</option>
									<option>子女赡养</option>
									<option>做小生意</option>
									<option>低保</option>
									<option>退休金/养老金</option>
									<option>其它资助</option>
							</select></td>
							<td>月收入</td>
							<td><input type="text" style="width:120px"
								name="monthlyincome" /></td>
							<td>医疗保障：</td>
							<td><select style="width:120px" class="healthcare">
									<option>城镇居民医疗保险</option>
									<option>城镇职工医疗保险</option>
									<option>商业保险</option>
									<option>新兴农村合作医疗</option>
									<option>其它</option>
							</select></td>
							<td>社保号</td>
							<td><input type="text" style="width:120px"
								name="socialsecurityno" /></td>
						</tr>
						<tr>
							<td colspan="8" align="left">老人健康情况</td>
						</tr>
						<tr>
							<td>慢性病：</td>
							<td><select style="width:120px" name="chronicdiseases">
									<option>高血压</option>
									<option>高血糖</option>
									<option>无</option>
									<option>其它</option>
							</select></td>
							<td>血型</td>
							<td><select style="width:120px" name="bloodtype">
									<option>A型</option>
									<option>B型</option>
									<option>O型</option>
									<option>特殊血型</option>
									<option>test</option>
							</select></td>
							<td>失能情况：</td>
							<td><select style="width:120px" name="disabilitysituation">
									<option>无</option>
									<option>轻度失能</option>
									<option>中度失能</option>
									<option>重度失能</option>
									<option>test</option>
							</select></td>
							<td>残疾情况：</td>
							<td><select style="width:120px" name="disability">
									<option>无</option>
									<option>轻度残疾</option>
									<option>中度残疾</option>
									<option>重度残疾</option>
									<option>test</option>
							</select></td>
						</tr>
						<tr>
							<td colspan="8" align="left">备注信息</td>
						</tr>
						<tr>
							<td>文化程度：</td>
							<td><select style="width:120px" name="educationlevel">
									<option>硕士</option>
									<option>本科</option>
									<option>专科</option>
									<option>高中</option>
									<option>初中</option>
									<option>中专</option>
									<option>小学</option>
							</select></td>
							<td>专业</td>
							<td><input type="text" style="width:120px" name="majors" />
							</td>
							<td>职称</td>
							<td><input type="text" style="width:120px" name="title" /></td>
							<td>原单位</td>
							<td><input type="text" style="width:120px"
								name="unitorignal" /></td>
						</tr>
						<tr>
							<td colspan="8">
								<button type="submit" class="btn btn-success">保存</button>

								<button type="button" class="btn btn-info"
									onClick="javascript :history.back(-1);">返回</button>
							</td>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		window.onload = function() {
			new uploadPreview({
				UpBtn : "up_img",
				ImgShow : "imgShow"
			});
		}
	</script>


</body>
</html>
