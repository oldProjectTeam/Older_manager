<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
   <base href="<%=basePath%>">
    <meta name="keywords" content="keyword1,keyword2,keyword3">
    <meta name="description" content="this is my page">
    <meta name="content-type" content="text/html; charset=UTF-8">
    
    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->
	<link rel="stylesheet" type="text/css" href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
	<script type="text/javascript" src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
  	<script language="JavaScript" src="static/js/jquery-3.2.1.min.js"></script>
  </head>
  
<body >
  <!--路劲导航  -->
   <div>
  	<div class="row">
	  <div class="col-md-12" >
		<ol class="breadcrumb">
		  <li><b>位置：<a href="static/oldback/educationManage/educationIndex.html">教育管理</a></b></li>
		  <li class="active">课程管理</li>
		</ol>
	  </div>
    </div>
   </div>
   <!--内容 -->
   <div >
     <!--操作按钮  -->
  	<div class="row" >
	  <div class="col-md-6">&nbsp;
		 <button type="button" class="btn btn-primary" id="addcourse_btn">
		 	<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
		 	新增
		 </button>
		 <button type="button" class="btn btn-danger">
		 	<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
		 	批量删除
		 </button>
	  </div>
    </div>
    <!--条件查询  -->
    <div class="row" style="margin-top:5px">
	  <div class="col-md-12">
		 <form class="form-inline">
		  <div class="form-group">
		    &nbsp;&nbsp;<label for="exampleInputName2">课程名称</label>
		    <input type="text" class="form-control" placeholder="请输入课程名称">
		  </div>
		  <div class="form-group">
		    <label for="exampleInputEmail2">讲师</label>
		    <input type="text" class="form-control" placeholder="请输入讲师姓名">
		  </div>
		  <button type="submit" class="btn btn-default">
		  	<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
		  	查询
		  </button>
		</form>
	  </div>
    </div>
    <br>
    <!--课程信息列表  -->
    <div class="row" >
	  <div class="col-md-12">
	    <div class="table-responsive">
		 <table class="table table-hover table-bordered text-center">
		 	<thead >
		 		<tr>
		 		  <td>全选<input type="checkbox" id='check_item_all'></td>
		 		  <td>#</td>
		 		  <td>课程名称</td>
		 		  <td>授课方式</td>
		 		  <td>讲师</td>
		 		  <td>限定人数</v>
		 		  <td>开课时间</td>
		 		  <td>结课时间</td>
		 		  <td>操作</td>
		 		</tr>
		 	</thead>
		 	<tbody>
		 		 <tr>  
		 		 	<td class="text-center">
		 		 		<input type="checkbox" class="item_check">
		 		 	</td>
		 		 	<td>1</td>
		 		 	<td>中医经络芳疗认证课</td>
		 		 	<td>在线授课</td>
		 		 	<td>TaniaTang 唐露</td>
		 		 	<td>100</td>
		 		 	<td>2017年10月8日</td>
		 		 	<td>2017年12月8日</td>
		 		 	<td>
		 		 	<button type="button" class="btn btn-success btn-sm update-btn">
					   <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
					    修改
					 </button>
					 <button type="button" class="btn btn-info btn-sm courseview-btn">
					 	<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
					 	查看
					 </button>
					 <button type="button" class="btn btn-danger btn-sm">
					 	<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
					 	删除
					 </button>
		 		 	</td>
		 		 </tr>
		 		 <tr>  
		 		 	<td class="text-center">
		 		 		<input type="checkbox" class="item_check">
		 		 	</td>
		 		 	<td>2</td>
		 		 	<td>中医经络芳疗认证课</td>
		 		 	<td>在线授课</td>
		 		 	<td>TaniaTang 唐露</td>
		 		 	<td>100</td>
		 		 	<td>2017年10月8日</td>
		 		 	<td>2017年12月8日</td>
		 		 	<td>
		 		 	<button type="button" class="btn btn-success btn-sm update-btn">
					   <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
					    修改
					 </button>
					 <button type="button" class="btn btn-info btn-sm vedioview-btn">
					 	<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
					 	查看
					 </button>
					 <button type="button" class="btn btn-danger btn-sm">
					 	<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
					 	删除
					 </button>
		 		 	</td>
		 		 </tr>
		 		 <tr>  
		 		 	<td class="text-center">
		 		 		<input type="checkbox" class="item_check">
		 		 	</td>
		 		 	<td>3</td>
		 		 	<td>中医经络芳疗认证课</td>
		 		 	<td>在线授课</td>
		 		 	<td>TaniaTang 唐露</td>
		 		 	<td>100</td>
		 		 	<td>2017年10月8日</td>
		 		 	<td>2017年12月8日</td>
		 		 	<td>
		 		 	<button type="button" class="btn btn-success btn-sm update-btn">
					   <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
					    修改
					 </button>
					 <button type="button" class="btn btn-info btn-sm vedioview-btn">
					 	<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
					 	查看
					 </button>
					 <button type="button" class="btn btn-danger btn-sm">
					 	<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
					 	删除
					 </button>
		 		 	</td>
		 		 </tr>
		 		 <tr>  
		 		 	<td class="text-center">
		 		 		<input type="checkbox" class="item_check">
		 		 	</td>
		 		 	<td>4</td>
		 		 	<td>中医经络芳疗认证课</td>
		 		 	<td>在线授课</td>
		 		 	<td>TaniaTang 唐露</td>
		 		 	<td>100</td>
		 		 	<td>2017年10月8日</td>
		 		 	<td>2017年12月8日</td>
		 		 	<td>
		 		 	<button type="button" class="btn btn-success btn-sm update-btn">
					   <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
					    修改
					 </button>
					 <button type="button" class="btn btn-info btn-sm vedioview-btn">
					 	<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
					 	查看
					 </button>
					 <button type="button" class="btn btn-danger btn-sm">
					 	<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
					 	删除
					 </button>
		 		 	</td>
		 		 </tr>
		 	</tbody>
			<thead>
		 </table>
		</div>
	  </div>
    </div>
    <!--分页信息  -->
    <div class="row" >
      <div class="col-md-7">
      	&nbsp;&nbsp;当前第1页，共20页，总计100条记录
      </div>
	  <div class="col-md-4 col-md-offset-1">
		 <nav aria-label="Page navigation">
			  <ul class="pagination">
			    <li>
			      <a href="#">首页
			      </a>
			    </li>
			    <li>
			      <a href="#" aria-label="Previous">
			        <span aria-hidden="true">&laquo;</span>
			      </a>
			    </li>
			    <li class="active"><a href="#">1</a></li>
			    <li><a href="#">2</a></li>
			    <li><a href="#">3</a></li>
			    <li><a href="#">4</a></li>
			    <li><a href="#">5</a></li>
			    <li>
			      <a href="#" aria-label="Next">
			        <span aria-hidden="true">&raquo;</span>
			      </a>
			    </li>
			    <li>
			      <a href="#">末页
			      </a>
			    </li>
			  </ul>
		</nav>
	  </div>
    </div>
   </div>
   
<script type="text/javascript">
   //全选
   $("#check_item_all").click(function(){
	   $(".item_check").prop("checked",$(this).prop("checked"));
   });
   	
   //新增按钮
   $("#addcourse_btn").click(function(){
	   window.location.href="static/oldback/educationManage/addcourse.jsp";
   });
   //修改按钮
   $(".update-btn").click(function(){
	   window.location.href="static/oldback/educationManage/updatecourse.jsp";
   });
   //查看按钮
   $(".courseview-btn").click(function(){
	   window.location.href="static/oldback/educationManage/courseview.jsp";
   });
</script>
</body>
</html>
