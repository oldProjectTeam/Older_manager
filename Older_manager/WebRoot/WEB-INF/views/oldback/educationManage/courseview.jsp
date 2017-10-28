<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
	<script type="text/javascript" src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
  	<script language="JavaScript" src="static/js/jquery-3.2.1.min.js"></script>
  </head>
  
  <body style="margin: 15px;">
    <!--路劲导航  -->
  	<div class="row">
	  <div class="col-md-12" >
		<ol class="breadcrumb">
		  <li><b>位置：<a href="static/oldback/educationManage/educationIndex.html">教育管理</a></b></li>
		  <li><b><a href="static/oldback/educationManage/coursemanager.jsp">课程管理</a></b></li>
		  <li class="active">查看课程</li>
		</ol>
	  </div>
    </div>
    <!--主体  -->
    <div class="row">
    	<div class="col-md-12">
    	<form class="form-horizontal">
    	<div class="table-responsive">
		  <table class="table table-bordered table-striped text-center">
			<tbody >
			 <tr>  
				 <td>课程名称</td>
				 <td class="col-xs-2">		 	
					<!-- <input type="text" class="form-control" required="required"> -->
					${Course.title}
				 </td>
				 <td>授课方式</td>
				 <td class="col-xs-2">
					 <!-- <input type="text" class="form-control" required="required"> -->
					 ${Course.teachingway}
				 </td>
				 <td>讲师</td>
				 <td class="col-xs-2">
					<!--  <input type="text" class="form-control" required="required"> -->
					 ${Course.teacher}
				 </td>
				 <td rowspan="3" class="active" style="padding-top:50px">宣传图片:</td>
				 <td rowspan="3" class="col-xs-2">
				 	 <img src=${Course.photo==null?'./upload/default.png':Course.photo} alt="..." class="img-responsive">
				 </td>		 	
			</tr>	 		 
			 <tr>  
				 <td>课程介绍</td>
				 <td>
				   <!-- <textarea class="form-control" rows="3" required="required"></textarea> -->
				   ${Course.content}
				 </td>
				 <td>限定人数</td>
				 <td>
					  <!-- <input type="number" class="form-control"> -->
					${Course.limitnumber}
				 </td>
				 <td>报名截止时间</td>
				 <td>
  					<!-- <input type="date" class="form-control"> -->
  					<fmt:formatDate value="${Course.bytime}" pattern="yyyy-MM-dd HH:mm:ss"/> 
				 </td>	 	
			</tr>
			<tr>  
				 <td>开课时间</td>
				 <td>		 	
					<fmt:formatDate value="${Course.starttime}" pattern="yyyy-MM-dd HH:mm:ss"/> 
				 </td>
				 <td>结课时间</td>
				 <td>
					 <!-- <input type="date" class="form-control"> -->
					 <fmt:formatDate value="${Course.endtime}" pattern="yyyy-MM-dd HH:mm:ss"/> 
					 <%-- ${Course.endtime} --%>
				 </td>
				 <td colspan="2">
				   <div class="form-group">
				    <div class="col-sm-12">
				                课程路径或链接 
				      <!-- <input type="text" class="form-control"> -->
				      ${Course.path}
				    </div>
				    
				  </div>
				 </td> 		 	
			</tr>
			<tr>
				<td colspan="8">
					<button type="button" class="btn btn-info" onClick="javascript :history.back(-1);">返回</button>
				</td>
			</tr>
			</tbody>
					
		</table>
		</div>
    	</form>
    	</div>
    </div>
  </body>
</html>
