<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>
</head>

<body style="margin: 15px;">
	<!--路劲导航  -->
	<div class="row">
		<div class="col-md-12">
			<ol class="breadcrumb">
				<li><b>位置：老人档案管理</b></li>
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
					method="post" action="${APP_PATH}/old/addnewolder/1" id="addForm">
					<table class="table text-center table-bordered">
						<tr>
							<td style="width:180px"><font color=red>*</font>老人姓名:</td>
							<td><input type="text" required="required" name="name"
								id="name" style="width:120px" class="form-control" /></td>
							<td style="width:140px"><font color=red>*</font>身份证号:</td>
							<td><input type="text" required="required" name="idcar"
								id="idcard" class="form-control" /></td>
							<td style="width:120px"><font color=red>*</font>性别:</td>
							<td><select name="sex" class="form-control"
								style="width:80px">
									<option>男</option>
									<option>女</option>
							</select></td>
							<td style="width:130px">图片</td>
							<td rowspan="4"><input type="hidden" name="photo"> <input
								type="file" multiple="multiple" class="btn btn-info"
								value="图片管理" name="file" id="up_img" class="form-control" /> <br />
								<img
								src="${pageContext.request.contextPath}/upload/${user.image==null?'default.png':user.image}"
								id="imgShow" width="300" height="200"></td>
						</tr>
						<tr>
							<td><font color=red>*</font>联系手机号:</td>
							<td><input type="text" required="required" name="phone"
								id="phone" class="form-control" /></td>
							<td>婚姻状况:</td>
							<td><select name="marriage" class="form-control">
									<option>已婚</option>
									<option>未婚</option>
									<option>离异</option>
									<option>丧偶</option>
									<option>再婚</option>
							</select></td>
							<td><font color=red>*</font>民族:</td>
							<td><select name="nation" class="form-control">
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
							<td>老人类别:</td>
							<td><select name="type" class="form-control">
									<option>低保老人</option>
									<option>独居老人</option>
									<option>三无老人</option>
									<option>孤寡老人</option>
							</select></td>
							<td><font color=red>*</font>出生日期:</td>
							<td><input type="date" name="birthday" id="birthday"
								required="required" class="form-control" /></td>
							<td><font color=red>*</font>年龄:</td>
							<td><input type="text" required="required" name="age"
								id="age" class="form-control" readonly="readonly" /></td>
						</tr>
						<tr>
							<td><font color=red>*</font>地址:</td>
							<td colspan="2"><input type="text" name="address"
								required="required" class="form-control" id="address" /></td>
							<td><font color=red>*</font>服务点:</td>
							<td colspan="2"><select name="service" class="form-control">
									<option>贵阳分部</option>
									<option>北京分部</option>
									<option>南通分部</option>
									<option>杭州分部</option>
							</select></td>
						</tr>
						<tr>
							<td colspan="8" align="left"><font color="blue" size="4">紧急联系人信息</font></td>
						</tr>
						<tr>
							<td><font color=red>*</font>紧急联系人:</td>
							<td><input type="text" name="urgencycontact" id="urgency"
								required="required" style="width:120px" class="form-control" /></td>
							<td><font color=red>*</font>联系电话:</td>
							<td><input type="text" name="urgencycontactphone"
								id="urgency_phone" required="required" class="form-control" /></td>
							<td>关系:</td>
							<td><select name="relation" class="form-control">
									<option>父子</option>
									<option>母子</option>
									<option>兄弟</option>
									<option>儿子</option>
							</select></td>
							<td>是否同住</td>
							<td><select class="form-control" name="liveinfo">
									<option>是</option>
									<option>否</option>

							</select></td>
						</tr>
						<tr>
							<td colspan="8" align="left">老人服务信息</td>
						</tr>
						<tr>
							<td>服务类型:</td>
							<td><select class="form-control" name="servicetype">
									<option>残联购买</option>
									<option>有偿服务</option>
									<option>政府购买</option>
							</select></td>
							<td><font color=red>*</font>服务状态:</td>
							<td><select class="form-control" name="servicestatu">
									<option>迁出服务区</option>
									<option>去世</option>
									<option>停止服务</option>
									<option>移民国外</option>
									<option>正常服务</option>
							</select></td>

						</tr>
						<tr>
							<td colspan="8" align="left"><font color="blue" size="4">老人经济情况</font></td>
						</tr>
						<tr>
							<td>经济来源:</td>
							<td><select class="form-control" name="economicsource">
									<option>出租房子</option>
									<option>社保工资</option>
									<option>子女赡养</option>
									<option>做小生意</option>
									<option>低保</option>
									<option>退休金/养老金</option>
									<option>其它资助</option>
							</select></td>
							<td>月收入</td>
							<td><input type="text" class="form-control"
								name="monthlyincome" /></td>
							<td>医疗保障:</td>
							<td><select class="form-control" class="healthcare">
									<option>城镇居民医疗保险</option>
									<option>城镇职工医疗保险</option>
									<option>商业保险</option>
									<option>新兴农村合作医疗</option>
									<option>其它</option>
							</select></td>
							<td>社保号</td>
							<td><input type="text" class="form-control"
								name="socialsecurityno" /></td>
						</tr>
						<tr>
							<td colspan="8" align="left"><font color="blue" size="4">老人健康情况</font></td>
						</tr>
						<tr>
							<td>慢性病:</td>
							<td><select class="form-control" name="chronicdiseases">
									<option>高血压</option>
									<option>高血糖</option>
									<option>无</option>
									<option>其它</option>
							</select></td>
							<td>血型</td>
							<td><select class="form-control" name="bloodtype">
									<option>A型</option>
									<option>B型</option>
									<option>O型</option>
									<option>特殊血型</option>
									<option>test</option>
							</select></td>
							<td>失能情况:</td>
							<td><select class="form-control" name="disabilitysituation">
									<option>无</option>
									<option>轻度失能</option>
									<option>中度失能</option>
									<option>重度失能</option>
									<option>test</option>
							</select></td>
							<td>残疾情况:</td>
							<td><select class="form-control" name="disability">
									<option>无</option>
									<option>轻度残疾</option>
									<option>中度残疾</option>
									<option>重度残疾</option>
							</select></td>
						</tr>
						<tr>
							<td colspan="8" align="left"><font color="blue" size="4">备注信息</font></td>
						</tr>
						<tr>
							<td>文化程度:</td>
							<td><select class="form-control" name="educationlevel">
									<option>硕士</option>
									<option>本科</option>
									<option>专科</option>
									<option>高中</option>
									<option>初中</option>
									<option>中专</option>
									<option>小学</option>
							</select></td>
							<td>专业</td>
							<td><input type="text" class="form-control" name="majors" />
							</td>
							<td>职称</td>
							<td><input type="text" class="form-control" name="title" /></td>
							<td>原单位</td>
							<td><input type="text" class="form-control"
								name="unitorignal" /></td>
						</tr>
						<tr>
							<td colspan="8">
								<button type="button" id="save" class="btn btn-success">保存</button>

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
		};
		//计算年龄
		$("#birthday").change(
				function() {
					var today = new Date();//获取当前时间(没有格式化)  
					var year = today.getFullYear();
					//获取年份, 四位数
					var month = today.getMonth() + 1;
					//获取月份, 0 - 11
					var day = today.getDate();
					//获取几号
					if (month <= 9) {//格式化  
						month = "0" + month;
					}
					if (day <= 9) {
						day = "0" + day;
					}
					today = year + "-" + month + "-" + day;
					if ($("#birthday").val() > today) {
						layer.msg("出生日期不能大于当前日期");
					} else if ($("#birthday").val() < "1947-01-01"
							&& $("#birthday").val() > "1907-01-01") {
						$("#age").val(jsGetAge($("#birthday").val()));
					} else {
						layer.msg("年龄在70-110岁才符合");
					}
				});
		var nameMatch = "(^[\u4e00-\u9fa5]+(·[\u4e00-\u9fa5]+)*$)";
		var idcardMatch = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
		var phoneMatch = "(^1[0-9]{10}$)";
		$("#name").change(function() {
			if (!$("#name").val().match(nameMatch)) {
				layer.msg("姓名格式不正确");
			}
		});
		$("#urgency").change(function() {
			if (!$("#urgency").val().match(nameMatch)) {
				layer.msg("紧急联系人姓名格式不正确");
			}
		});
		$("#idcard").change(function() {
			if (!$("#idcard").val().match(idcardMatch)) {
				layer.msg("身份证格式不正确");
			}
		});
		$("#phone").change(function() {
			if (!$("#phone").val().match(phoneMatch)) {
				layer.msg("电话号码格式不正确");
			}
		});
		$("#urgency_phone").change(function() {
			if (!$("#urgency_phone").val().match(phoneMatch)) {
				layer.msg("电话号码格式不正确");
			}
		});
		$("#save")
				.click(
						function() {
							if ($("#name").val() == ''
									|| $("#idcard").val() == ''
									|| $("#phone").val() == ''
									|| $("#birthday").val() == ''
									|| $("#age").val() == ''
									|| $("#address").val() == ''
									|| $("#urgency").val() == ''
									|| $("#urgency_phone").val() == '') {
								layer.msg("请把必填的项填写完");
							} else {
								if (!$("#name").val().match(nameMatch)) {
									layer.msg("姓名格式不正确");
								} else if (!$("#idcard").val().match(
										idcardMatch)) {
									layer.msg("身份证格式不正确");
								} else if (!$("#phone").val().match(phoneMatch)) {
									layer.msg("电话号码格式不正确");
								} else if (!$("#urgency_phone").val().match(
										phoneMatch)) {
									layer.msg("电话号码格式不正确");
								} else if (!$("#urgency").val()
										.match(nameMatch)) {
									layer.msg("紧急联系人姓名格式不正确");
								}
								if ($("#birthday").val() > "1947-01-01") {
									layer.msg("年龄" + $("#age").val() + "不符合要求");
								} else {
									$("#addForm").submit();
								}
							}
						});

		/*根据出生日期算出年龄*/
		function jsGetAge(strBirthday) {
			var returnAge;
			var strBirthdayArr = strBirthday.split("-");
			var birthYear = strBirthdayArr[0];
			var birthMonth = strBirthdayArr[1];
			var birthDay = strBirthdayArr[2];

			d = new Date();
			var nowYear = d.getFullYear();
			var nowMonth = d.getMonth() + 1;
			var nowDay = d.getDate();

			if (nowYear == birthYear) {
				returnAge = 0;//同年 则为0岁  
			} else {
				var ageDiff = nowYear - birthYear; //年之差  
				if (ageDiff > 0) {
					if (nowMonth == birthMonth) {
						var dayDiff = nowDay - birthDay;//日之差  
						if (dayDiff < 0) {
							returnAge = ageDiff - 1;
						} else {
							returnAge = ageDiff;
						}
					} else {
						var monthDiff = nowMonth - birthMonth;//月之差  
						if (monthDiff < 0) {
							returnAge = ageDiff - 1;
						} else {
							returnAge = ageDiff;
						}
					}
				} else {
					returnAge = -1;//返回-1 表示出生日期输入错误 晚于今天  
				}
			}
			return returnAge;//返回周岁年龄  
		}
	</script>


</body>
</html>
