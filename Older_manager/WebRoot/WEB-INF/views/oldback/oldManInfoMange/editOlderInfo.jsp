<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
		   <form class="form-horizontal" method="post"  enctype="multipart/form-data" action="${APP_PATH}/old/upateolder/${oldman.id}&${pn}">
			 <table   class="table text-center table-bordered">
				<tr>
					<td><font color=red>*</font>老人姓名:</td>
					<td><input type="text" required="required" name="name" style="width:120px" value="${oldman.name}" /></td>
					<td><font color=red>*</font>身份证号:</td>
					<td ><input type="text" required="required" name="idcar" style="width:150px" value="${oldman.idcar}"/></td>
					<td><font color=red>*</font>性别:</td>
					<td>
					  <select style="width:70px" name="sex" id="sexid">
						<option>男</option>
						<option>女</option>
					  </select>
					</td>
					<td rowspan="4" style="width:80px">
					    <img src=${oldman.photo}  class="img-responsive" >
					</td>
					     <td rowspan="4"><input type="hidden" name="photo">
								<input type="file" multiple="multiple" class="btn btn-default"
								value="图片管理" name="photo" id="up_img" /> <img
								src="${pageContext.request.contextPath}/upload/${user.image==null?'failure.png':user.image}"
								id="imgShow" class="img-responsive">
								
						</td>					
				</tr>
				<tr>
					<td><font color=red>*</font>联系手机号：</td>
					<td><input type="text" required="required" name="phone" value="${oldman.phone}" style="width:120px"/></td>
					<td>婚姻状况：</td>
					<td>
					  <select style="width:70px" name="marriage" id="marriageid">
						<option>已婚</option>
						<option>未婚</option>
						<option>离异</option>
						<option>丧偶</option>
						<option>再婚</option>
					  </select>
					</td>
					<td><font color=red>*</font>民族：</td>
					<td>
					  <select name="nation" id="nationid">
						<option>汉族</option>
						<option>土家族</option>
						<option>彝族</option>
						<option>壮族</option>
						<option>水族</option>
						<option>侗族</option>
						<option>布依族</option>
						<option>苗族</option>
						<option>其它</option>
					  </select>
					</td>					
				</tr>
				<tr>
					<td>老人类别：</td>
					<td>
					  <select name="type" id="typeid">
						<option>低保老人</option>
						<option>独居老人</option>
						<option>三无老人</option>
						<option>孤寡老人</option>						
					  </select>
					</td>
					<td><font color=red>*</font>出生日期：</td>
					<td>
					  <input type="date" name="birthday"  value="${oldman.birthday}"  required="required"/>
					</td>
					<td><font color=red>*</font>年龄：</td>
					<td>
					  <input type="text" required="required" name="age" value="${oldman.age}" style="width:120px;"/>
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
						<option>贵阳分部</option>
						<option>北京分部</option>
						<option>南通分部</option>
						<option>杭州分部</option>						
					  </select>
					</td>					 					
				</tr>
				<tr>
					<td colspan="8" align="left">紧急联系人</td> 					
				</tr>
				<tr>
					<td><font color=red>*</font>紧急联系人：</td>
					<td>
					   <input type="text" name="urgencycontact" value="${oldman.urgencycontact}" required="required" style="width:120px"/>
					</td>
					 <td><font color=red>*</font>联系电话：</td>
					 <td><input type="text" name="urgencycontactphone" value="${oldman.urgencycontactphone}" required="required" style="width:120px"/></td>
					<td>
					  关系：
					</td>
					<td>
					  <select style="width:70px" name="relation" id="relationid">
						<option>父子</option>
						<option>母子</option>
						<option>兄弟</option>
						<option>儿子</option>						
					  </select>
					</td>
					<td>是否同住</td>
					<td>
					   <select style="width:70px" name="liveinfo" id="liveinfoid">
						<option>是</option>
						<option>否</option>
												
					  </select>
					</td>					 					 					
				</tr>
				<tr>
					<td colspan="8" align="left">老人服务信息</td> 					
				</tr>
				<tr>
					<td>服务类型：</td>
					<td>
					   <select style="width:120px" name="servicetype" id="servicetypeid">
						<option>残联购买</option>
						<option>有偿服务</option>
						<option>政府购买</option>				
					  </select>
					</td>
					 <td><font color=red>*</font>服务状态：</td>
					 <td>
					    <select style="width:120px" name="servicestatu" id="servicestatuid">
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
					<td>
					   <select style="width:120px" name="economicsource" id="economicsourceid">
						<option>出租房子</option>
						<option>社保工资</option>
						<option>子女赡养</option>
						<option>做小生意</option>
						<option>低保</option>
						<option>退休金/养老金</option>
						<option>其它资助</option>				
					  </select>
					</td>
					 <td>月收入</td>
					 <td>
					    <input type="text" style="width:120px" value="${oldman.monthlyincome}" name="monthlyincome"/>
					 </td>
					 <td>医疗保障：</td>
					<td>
					   <select style="width:120px" class="healthcare" id="healthcareid">
						<option>城镇居民医疗保险</option>
						<option>城镇职工医疗保险</option>
						<option>商业保险</option>
						<option>新兴农村合作医疗</option>
						<option>其它</option>			
					  </select>
					</td>
					<td>社保号</td>
					 <td>
					    <input type="text" style="width:120px" value="${oldman.socialsecurityno}" name="socialsecurityno"/>
					 </td>				 					
				</tr>
				<tr>
					<td colspan="8" align="left">老人健康情况</td> 					
				</tr>
				<tr>
					<td>慢性病：</td>
					<td>
					   <select style="width:120px" name="chronicdiseases" id="chronicdiseasesid">
						<option>高血压</option>
						<option>高血糖</option>
						<option>无</option>
						<option>其它</option>			
					  </select>
					</td>
					 <td>血型</td>
					 <td>
					    <select style="width:120px" name="bloodtype" id="bloodtypeid">
						<option>A型</option>
						<option>B型</option>
						<option>O型</option>
						<option>特殊血型</option>
						<option>test</option>					 		
					  </select>
					 </td>
					 <td>失能情况：</td>
					<td>
					   <select style="width:120px" name="disabilitysituation" id="disabilitysituationid">
						<option>无</option>
						<option>轻度失能</option>
						<option>中度失能</option>
						<option>重度失能</option>
						<option>test</option>						 		
					  </select>
					</td>
					<td>残疾情况：</td>
					<td>
					   <select style="width:120px" name="disability" id="disabilityid">
						<option>无</option>
						<option>轻度残疾</option>
						<option>中度残疾</option>
						<option>重度残疾</option>
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
					    <option>硕士</option>
						<option>本科</option>
						<option>专科</option>
						<option>高中</option>
						<option>初中</option>
						<option>中专</option>	
						<option>小学</option>		
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
					    <button type="submit" class="btn btn-success">保存</button>
						 
						<button type="button" class="btn btn-info" onClick="javascript :history.back(-1);">返回</button>
					</td>
				</tr>
			</table>
		 </form>
			</div>
		</div>
	</div>
	
<script type="text/javascript">
   // 根据值让option选中 
   $("#sexid option[value='"+${oldman.sex}+"']").attr("selected","selected");
   $("#marriageid option[value='"+${oldman.marriage}+"']").attr("selected","selected");
   $("#nationid option[value='"+${oldman.nation}+"']").attr("selected","selected");
   $("#typeid option[value='"+${oldman.type}+"']").attr("selected","selected");
   $("#serviceid option[value='"+${oldman.service}+"']").attr("selected","selected");
   $("#relationid option[value='"+${oldman.relation}+"']").attr("selected","selected");
   $("#servicetypeid option[value='"+${oldman.servicetype}+"']").attr("selected","selected");
   $("#servicestatuid option[value='"+${oldman.servicestatu}+"']").attr("selected","selected");
   $("#economicsourceid option[value='"+${oldman.economicsource}+"']").attr("selected","selected");
   $("#healthcareid option[value='"+${oldman.healthcare}+"']").attr("selected","selected");
   $("#chronicdiseasesid option[value='"+${oldman.chronicdiseases}+"']").attr("selected","selected");
   $("#bloodtypeid option[value='"+${oldman.bloodtype}+"']").attr("selected","selected");
   $("#disabilitysituationid option[value='"+${oldman.disabilitysituation}+"']").attr("selected","selected");
   $("#disabilityid option[value='"+${oldman.disability}+"']").attr("selected","selected");
   $("#educationlevelid option[value='"+${oldman.educationlevel}+"']").attr("selected","selected"); 
   $("#liveinfoid option[value='"+${oldman.liveinfo}+"']").attr("selected","selected"); 



	 
		window.onload = function() {
			new uploadPreview({
				UpBtn : "up_img",
				ImgShow : "imgShow"
			});
		}

</script>	
</body>
</html>
