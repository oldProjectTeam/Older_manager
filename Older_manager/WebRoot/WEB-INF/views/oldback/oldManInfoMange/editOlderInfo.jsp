<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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

<script language="JavaScript"
	src="${APP_PATH}/static/js/uploadPreview.js"></script>

<!-- 引入jquery -->
<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery-1.7.2.min.js"></script>
<!-- 引入样式 -->
<link
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>
</head>
  
  <body>
     <!--路劲导航  -->
  	<div class="row">
	  <div class="col-md-12" >
		<ol class="breadcrumb">
		  <li><b>位置：老人档案管理</b></li>
		  <li class="active">编辑老人</li>
		</ol>
	  </div>
    </div>
    <!--页内导航栏  -->
	<div class="row">
		<div class="col-md-12">
			<ul class="nav nav-tabs">
				<li role="presentation" class="active"><a
					href="static/oldback/oldManInfoMange/addOldManInfo.jsp">老人基本信息</a></li>
						 
			</ul>
		</div>
	</div>

	<!--主体内容  -->
	<div class="row">
		<div class="col-md-12">&nbsp;&nbsp;
		  <div class="table-responsive">
		   <form class="form-horizontal" method="post"  enctype="multipart/form-data" action="${APP_PATH}/old/upateolder/${oldman.id}&${updatepn}">
			 <table   class="table text-center table-bordered">
				<tr>
					<td><font color=red>*</font>老人姓名:</td>
					<td>
					<input type="hidden" name="name" value="${oldman.name}">
					<p class="form-control-static">${oldman.name}</p>
					</td>
					<td><font color=red>*</font>身份证号:</td>
					<td >
					<input type="text" required="required" id="idcarid" name="idcar" style="width:150px" value="${oldman.idcar}"/>
					    
					</td>
					<td><font color=red>*</font>性别:</td>
					<td>
					  <select style="width:70px" name="sex" id="sexid">
						<option value="男">男</option>
						<option value="女">女</option>
					  </select>
					</td>
					<td rowspan="4" style="width:80px">
					    <img src=${oldman.photo}  class="img-responsive" >
					</td>
					     <td rowspan="4">
					     
								<input type="hidden" name="photo"> <input
								type="file" multiple="multiple" class="btn btn-info"
								  name="file" id="up_img" class="form-control" />
								
								
								
								<img
								src="${pageContext.request.contextPath}/upload/${user.image==null?'failure.png':user.image}"
								id="imgShow" class="img-responsive">
								
						</td>					
				</tr>
				<tr>
					<td><font color=red>*</font>联系手机号：</td>
					<td><input type="text" required="required" name="phone" id="phoneid" value="${oldman.phone}" style="width:120px"/>
					    
					</td>
					<td>婚姻状况：</td>
					<td>
					  <select style="width:70px" name="marriage" id="marriageid">
						<option value="已婚">已婚</option>
						<option value="未婚">未婚</option>
						<option value="离异">离异</option>
						<option value="丧偶">丧偶</option>
						<option value="再婚">再婚</option>
					  </select>
					</td>
					<td><font color=red>*</font>民族：</td>
					<td>
					  <select name="nation" id="nationid">
						<option value="汉族">汉族</option>
						<option value="土家族">土家族</option>
						<option value="彝族">彝族</option>
						<option value="壮族">壮族</option>
						<option value="水族">水族</option>
						<option value="侗族">侗族</option>
						<option value="布依族">布依族</option>
						<option value="苗族">苗族</option>
						<option value="其它">其它</option>
					  </select>
					</td>					
				</tr>
				<tr>
					<td>老人类别：</td>
					<td>
					  <select name="type" id="typeid">
						<option value="低保老人">低保老人</option>
						<option value="独居老人">独居老人</option>
						<option value="三无老人">三无老人</option>
						<option value="孤寡老人">孤寡老人</option>						
					  </select>
					</td>
					<td><font color=red>*</font>出生日期：</td>
					<td>
					<!--value="<fmt:formatDate value="${oldman.birthday}" pattern="yyyy-MM-dd"/> "  -->
					  <input type="date" name="birthday" value=<fmt:formatDate value="${oldman.birthday}" pattern="yyyy-MM-dd"/>
					     required="required" id="birthday"/>
					    
					</td>
					<td><font color=red>*</font>年龄：</td>
					<td>
					  <input type="text" required="required" id="age" readonly="readonly"  name="age" value="${oldman.age}" style="width:120px;"/>
					</td>					
				</tr>
				<tr>
					<td><font color=red>*</font>家庭地址：</td>
					<td colspan="2">
					   <input type="text" name="address" value="${oldman.address}" required="required"/>
					</td>
					<td>
					  <font color=red>*</font>所属服务点：
					</td>
					<td colspan="2">
					  <select name="service" id="serviceid">
						<option value="贵阳分部">贵阳分部</option>
						<option value="北京分部">北京分部</option>
						<option value="南通分部">南通分部</option>
						<option value="杭州分部">杭州分部</option>						
					  </select>
					</td>					 					
				</tr>
				<tr>
					<td colspan="8" align="left">紧急联系人</td> 					
				</tr>
				<tr>
					<td><font color=red>*</font>紧急联系人：</td>
					<td>
					   <input type="hidden" name="urgencycontact" value="${oldman.urgencycontact}">
					   <p class="form-control-static">${oldman.urgencycontact}</p>
					</td>
					 <td><font color=red>*</font>联系电话：</td>
					 <td>
					     <input type="hidden" name="urgencycontactphone" value="${oldman.urgencycontactphone}">
					     <p class="form-control-static">${oldman.urgencycontactphone}</p>
					 </td>
					<td>
					  关系：
					</td>
					<td>
					<input type="hidden" name="relation" value="${oldman.relation}">
					 <p class="form-control-static">${oldman.relation}</p>
					</td>
					<td>是否同住</td>
					<td>
					 <input type="hidden" name="liveinfo" value="${oldman.liveinfo}">
					  <p class="form-control-static">${oldman.liveinfo}</p>
					</td>					 					 					
				</tr>
				<tr>
					<td colspan="8" align="left">老人服务信息</td> 					
				</tr>
				<tr>
					<td>服务类型：</td>
					<td>
					   <select style="width:120px" name="servicetype" id="servicetypeid">
						<option value="残联购买">残联购买</option>
						<option value="有偿服务">有偿服务</option>
						<option value="政府购买">政府购买</option>				
					  </select>
					</td>
					 <td><font color=red>*</font>服务状态：</td>
					 <td>
					    <select style="width:120px" name="servicestatu" id="servicestatuid">
					    <option value="正常服务">正常服务</option>	
						<option value="迁出服务区">迁出服务区</option>
						<option value="去世">去世</option>
						<option value="停止服务">停止服务</option>
						<option value="移民国外">移民国外</option>	
								
					  </select></td>
					 				 					
				</tr>
				<tr>
					<td colspan="8" align="left">老人经济情况</td> 					
				</tr>
				<tr>
					<td>经济来源：</td>
					<td>
					   <select style="width:120px" name="economicsource" id="economicsourceid">
						<option value="出租房子">出租房子</option>
						<option value="社保工资">社保工资</option>
						<option value="子女赡养">子女赡养</option>
						<option value="做小生意">做小生意</option>
						<option value="低保">低保</option>
						<option value="退休金/养老金">退休金/养老金</option>
						<option value="其它资助">其它资助</option>				
					  </select>
					</td>
					 <td>月收入</td>
					 <td>
					    <input type="text" style="width:120px" value="${oldman.monthlyincome}" id="monthlyincomeid" name="monthlyincome"/>
					 </td>
					 <td>医疗保障：</td>
					<td>
					   <select style="width:120px" class="healthcare" id="healthcareid">
						<option value="城镇居民医疗保险">城镇居民医疗保险</option>
						<option value="城镇职工医疗保险">城镇职工医疗保险</option>
						<option value="商业保险">商业保险</option>
						<option value="新兴农村合作医疗">新兴农村合作医疗</option>
						<option value="其它">其它</option>			
					  </select>
					</td>
					<td>社保号</td>
					 <td>
					    <input type="text" style="width:120px" id="socialsecuritynoid" value="${oldman.socialsecurityno}" name="socialsecurityno"/>
					 </td>				 					
				</tr>
				<tr>
					<td colspan="8" align="left">老人健康情况</td> 					
				</tr>
				<tr>
					<td>慢性病：</td>
					<td>
					   <select style="width:120px" name="chronicdiseases" id="chronicdiseasesid">
						<option value="高血压">高血压</option>
						<option value="高血糖">高血糖</option>
						<option value="无">无</option>
						<option value="其它">其它</option>			
					  </select>
					</td>
					 <td>血型</td>
					 <td>
					    <select style="width:120px" name="bloodtype" id="bloodtypeid">
						<option value="A型">A型</option>
						<option value="B型">B型</option>
						<option value="O型">O型</option>
						<option value="特殊血型">特殊血型</option>
					  </select>
					 </td>
					 <td>失能情况：</td>
					<td>
					   <select style="width:120px" name="disabilitysituation" id="disabilitysituationid">
						<option value="无">无</option>
						<option value="轻度失能">轻度失能</option>
						<option value="中度失能">中度失能</option>
						<option value="重度失能">重度失能</option>
						<option>test</option>						 		
					  </select>
					</td>
					<td>残疾情况：</td>
					<td>
					   <select style="width:120px" name="disability" id="disabilityid">
						<option value="无">无</option>
						<option value="轻度残疾">轻度残疾</option>
						<option value="中度残疾">中度残疾</option>
						<option value="重度残疾">重度残疾</option>
						<option>test</option>						 		
					  </select>
					</td>				 					
				</tr>
				<tr>
					<td colspan="8" align="left">备注信息</td> 					
				</tr>
				<tr>
					<td>文化程度：</td>
					<td>
					   <select style="width:120px" name="educationlevel" id="educationlevelid">
					    <option value="硕士">硕士</option>
						<option value="本科">本科</option>
						<option value="专科">专科</option>
						<option value="高中">高中</option>
						<option value="初中">初中</option>
						<option value="中学">中专</option>	
						<option value="小学">小学</option>		
					  </select>
					</td>
					 <td>专业</td>
					 <td>
					    <input type="text" value="${oldman.majors}" style="width:120px"name="majors"/>
					 </td>
					 <td>职称</td>
					 <td>
					    <input type="text" value="${oldman.title}" style="width:120px"name="title"/>
					 </td>
					<td>原单位</td>
					 <td>
					    <input type="text" value="${oldman.unitorignal}" style="width:120px" name="unitorignal"/>
					 </td>			 					
				</tr>
				<tr>
					<td colspan="8">
					    <button type="submit" class="btn btn-success" id="saveolder">保存</button>
						 
						<button type="button" class="btn btn-info" id="updatecomeback">返回</button>
					</td>
				</tr>
			</table>
		 </form>
			</div>
		</div>
	</div>
	
<script type="text/javascript">
   // 根据值让option选中 
   $(function() {
   $("#sexid").val([ "${oldman.sex}" ]);
   
  
    $("#marriageid").val([ "${oldman.marriage}" ]);
  
    $("#nationid").val([ "${oldman.nation}" ]);
   
    $("#typeid").val([ "+${oldman.type}" ]);
  
    $("#serviceid").val([ "${oldman.service}" ]);
  
   // $("#relationid").val([ "${oldman.relation}" ]);
   
    $("#servicetypeid").val([ "${oldman.servicetype}" ]);
  
    $("#servicestatuid").val([ "${oldman.servicestatu}" ]);
   
    $("#economicsourceid").val([ "${oldman.economicsource}" ]);
  
    $("#healthcareid").val([ "${oldman.healthcare}" ]);
   
    $("#chronicdiseasesid").val([ "${oldman.chronicdiseases}" ]);
  
    $("#bloodtypeid").val([ "${oldman.bloodtype}" ]);
  
    $("#disabilitysituationid").val([ "${oldman.disabilitysituation}" ]);
  
    $("#disabilityid").val([ "${oldman.disability}" ]);
 
    $("#educationlevelid").val([ "${oldman.educationlevel}" ]);
  
   // $("#liveinfoid").val([ "${oldman.liveinfo}" ]); 
    
   
   });
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
 
	 
	 
	
	 
		window.onload = function() {
			new uploadPreview({
				UpBtn : "up_img",
				ImgShow : "imgShow"
			});
		};
//校验-------------------------------------------------------------------
var IDcar= /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
var telephone=/(^1[0-9]{10}$)/;
var numone=/^[0-9]{5,16}$/;
var numtwo=/^[0-9]+(.[0-9]{1,2})?$/;

var num=new Array(1,1,1,1);
$("#idcarid").change(function(){
  var idcar=$("#idcarid").val();
  
  if(!IDcar.test(idcar)){
    layer.msg("身份证码格式不正确");
    num[0]=0;
  
  }else{
    
     num[0]=1;
  }
save();
});
$("#phoneid").change(function(){
  var idcar=$("#phoneid").val();
  
  if(!telephone.test(idcar)){
      layer.msg("电话证码格式不正确");
    num[1]=0;
  
  }else{
     num[1]=1;
  }
save();
});
$("#monthlyincomeid").change(function(){
  var idcar=$("#monthlyincomeid").val();
  
  if(numtwo.test(idcar)||idcar==""){
    
  num[2]=1;
  }else{
     layer.msg("月收入证码格式不正确");
   num[2]=0;
  }
save();
});
$("#socialsecuritynoid").change(function(){
  var idcar=$("#socialsecuritynoid").val();
  
  if(numone.test(idcar)||idcar==""){
    num[3]=1;
  
  }else{
     layer.msg("社保号证码格式不正确");
     num[3]=0;
  }
save();
});

function save() {
			var count = 0;
			var j;

			for (j in num) {
				if (num[j] == 1) {
					count = count + 1;
				}
			}
			if (count == 4) {

				$("#saveolder").attr("disabled", false);
			} else {
				$("#saveolder").attr("disabled", true);
			}
		}
		
	$("#updatecomeback").click(function(){
	     window.location.href="${APP_PATH}/old/skipolderinfo/${updatepn}";
	});	
		
		
</script>	
</body>
</html>
