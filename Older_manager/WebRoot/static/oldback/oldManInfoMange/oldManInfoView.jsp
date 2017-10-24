<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
	 <script language="JavaScript" src="static/js/jquery-3.2.1.min.js"></script>
	<link rel="stylesheet" type="text/css" href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
	<script type="text/javascript" src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script> 	
  </head>
  
  <body>
     <!--路劲导航  -->
  	<div class="row">
	  <div class="col-md-12" >
		<ol class="breadcrumb">
		  <li><b>位置：<a href="static/oldback/oldManInfoMange/index.html">老人档案管理</a></b></li>
		  <li><b><a href="static/oldback/oldManInfoMange/oldManInfoList.jsp">老人列表</a></b></li>
		  <li class="active">查看老人信息</li>
		</ol>
	  </div>
    </div>
	<!--主体内容  -->
	<div class="row" style="margin-left:3px">
		<div class="col-md-12">
		  <div class="table-responsive">
		   <form class="form-horizontal">
			 <table   class="table text-center table-bordered">
				<tr>
					<td>老人姓名:</td>
					<td>李秀媛</td>
					<td>身份证号:</td>
					<td>522187206052915</td>
					<td>性别:</td>
					<td>
					  女
					</td>
					<td rowspan="4" style="width:80px">图片</td>
					<td rowspan="4">
						 <img src="static/oldback/images/vedioview.png" alt="..." class="img-rounded">
					</td>					
				</tr>
				<tr>
					<td>联系手机号：</td>
					<td>18208526156</td>
					<td>婚姻状况：</td>
					<td>
					   已婚
					</td>
					<td>民族：</td>
					<td>
					  汉族
					</td>					
				</tr>
				<tr>
					<td>老人类别：</td>
					<td>
					  低保老人
					</td>
					<td>出生日期：</td>
					<td>
					  1987-2-5
					</td>
					<td>年龄：</td>
					<td>
					  52
					</td>					
				</tr>
				<tr>
					<td>家庭地址：</td>
					<td colspan="2">
					    北京紫荆城皇宫
					</td>
					<td>
					  所属服务点：
					</td>
					<td colspan="2">
					  北京分部
					</td>					 					
				</tr>
				<tr>
					<td colspan="8" align="left">紧急联系人</td> 					
				</tr>
				<tr>
					<td>紧急联系人：</td>
					<td>
					   李四
					</td>
					 <td>联系电话：</td>
					 <td>18208546263</td>
					<td>
					  关系：
					</td>
					<td colspan="2" >
					  母子
					</td>					 					
				</tr>
				<tr>
					<td colspan="8" align="left">老人服务信息</td> 					
				</tr>
				<tr>
					<td>服务类型：</td>
					<td>
					   政府购买
					</td>
					 <td>服务状态：</td>
					 <td>
					    正常服务			
					 </td>
					 				 					
				</tr>
				<tr>
					<td colspan="8" align="left">老人经济情况</td> 					
				</tr>
				<tr>
					<td>经济来源：</td>
					<td>
					   出租房子 
					</td>
					 <td>月收入</td>
					 <td>
					    10000
					 </td>
					 <td>医疗保障：</td>
					<td>
					   城镇居民医疗保险 
					</td>
					<td>社保号</td>
					 <td>
					    2000515
					 </td>				 					
				</tr>
				<tr>
					<td colspan="8" align="left">老人健康情况</td> 					
				</tr>
				<tr>
					<td>慢性病：</td>
					<td>无 </td>
					 <td>血型</td>
					 <td>O型 </td>
					 <td>失能情况：</td>
					<td>
					   无
					</td>
					<td>残疾情况：</td>
					<td>
					   无
					</td>				 					
				</tr>
				<tr>
					<td colspan="8" align="left">备注信息</td> 					
				</tr>
				<tr>
					<td>文化程度：</td>
					<td>小学</td>
					 <td>专业</td>
					 <td>
					    软件工程
					 </td>
					 <td>职称</td>
					 <td>
					    高级软件工程师
					 </td>
					<td>原单位</td>
					 <td>
					    IBM
					 </td>			 					
				</tr>
				<tr>
					<td colspan="8">						 
						<button type="button" class="btn btn-info" onClick="javascript :history.back(-1);">返回</button>
					</td>
				</tr>
			</table>
		 </form>
			</div>
		</div>
	</div>
</body>
</html>
