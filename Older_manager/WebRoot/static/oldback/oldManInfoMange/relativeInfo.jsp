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
    <script language="JavaScript" src="static/js/jquery-3.2.1.min.js"></script>
	<link rel="stylesheet" type="text/css" href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
	<script type="text/javascript" src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script> 	
  </head>
  
<body >
  <!--路劲导航  -->
  	<div class="row">
	  <div class="col-md-12" >
		<ol class="breadcrumb">
		  <li><b>位置：<a href="static/oldback/oldManInfoMange/index.html">老人档案管理</a></b></li>
		  <li class="active">新增老人</li>
		</ol>
	  </div>
    </div>
    <!--页内导航栏  -->
	<div class="row">
		<div class="col-md-12">
			<ul class="nav nav-tabs">
				<li role="presentation"><a
					href="static/oldback/oldManInfoMange/addOldManInfo.jsp">老人基本信息</a></li>
				<li role="presentation" class="active"><a href="#">亲属信息</a></li>			 
			</ul>
		</div>
	</div>
    <br>
   <!--内容 -->
   <div >
     <!--操作按钮  -->
  	<div class="row" >
	  <div class="col-md-6">&nbsp;
		 <button type="button" class="btn btn-primary" id="add_old_relative_btn">
		 	<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
		 	新增
		 </button>
		 <button type="button" class="btn btn-danger">
		 	<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
		 	批量删除
		 </button>
	  </div>
    </div>
     &nbsp;
    <!--亲属信息列表  -->
    <div class="row" >
	  <div class="col-md-12">
	    <div class="table-responsive">
		 <table class="table table-hover table-bordered text-center">
		 	<thead>
		 		<tr class="text-center">
		 		  <td><input type="checkbox" id='check_item_all'></td>
		 		  <td>#</td>
		 		  <td>姓名</td>
		 		  <td>联系电话</td>
		 		  <td>与老人关系</td>
		 		  <td>是否同住</td>
		 		  <td>联系地址</td>		 		 
		 		  <td>操作</td>
		 		</tr>
		 	</thead>
		 	<tbody>
		 		 <tr>  
		 		 	<td class="text-center"><input type="checkbox" class="item_check"></td>
		 		 	<td>1</td>
		 		 	<td>李大伟</td>
		 		 	<td>18208546963 </td>
		 		 	<td>儿子</td>
		 		 	<td>是</td>
		 		 	<td>北京紫禁城</td>		 		 	 
		 		 	<td>
		 		 	 <button type="button" class="btn btn-success btn-sm update_old_relative_btn">
					   <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
					     修改
					 </button>
					 <button type="button" class="btn btn-danger btn-sm">
					 	<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
					 	删除
					 </button>
		 		 	</td>
		 		 </tr>
		 		 <tr>  
		 		 	<td class="text-center"><input type="checkbox" class="item_check"></td>
		 		 	<td>1</td>
		 		 	<td>李大伟</td>
		 		 	<td>18208546963 </td>
		 		 	<td>儿子</td>
		 		 	<td>是</td>
		 		 	<td>北京紫禁城</td>		 		 	 
		 		 	<td>
		 		 	 <button type="button" class="btn btn-success btn-sm">
					   <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
					     修改
					 </button>
					 <button type="button" class="btn btn-danger btn-sm">
					 	<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
					 	删除
					 </button>
		 		 	</td>
		 		 </tr>
		 		 <tr>  
		 		 	<td class="text-center"><input type="checkbox" class="item_check"></td>
		 		 	<td>1</td>
		 		 	<td>李大伟</td>
		 		 	<td>18208546963 </td>
		 		 	<td>儿子</td>
		 		 	<td>是</td>
		 		 	<td>北京紫禁城</td>		 		 	 
		 		 	<td>
		 		 	 <button type="button" class="btn btn-success btn-sm">
					   <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
					     修改
					 </button>
					 <button type="button" class="btn btn-danger btn-sm">
					 	<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
					 	删除
					 </button>
		 		 	</td>
		 		 </tr>
		 		 <tr>  
		 		 	<td class="text-center"><input type="checkbox" class="item_check"></td>
		 		 	<td>1</td>
		 		 	<td>李大伟</td>
		 		 	<td>18208546963 </td>
		 		 	<td>儿子</td>
		 		 	<td>是</td>
		 		 	<td>北京紫禁城</td>		 		 	 
		 		 	<td>
		 		 	 <button type="button" class="btn btn-success btn-sm">
					   <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
					     修改
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
   
<!--新增亲属模态框  -->
<div class="modal fade" tabindex="-1" role="dialog" id="add_old_relative_modal">
   <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title">新增家属信息</h4>
	      </div>
	      <div class="modal-body">	
	           <form class="form-inline">        
			    <table class="table table-striped table-bordered text-center">
			    	<tr>
			    		<td><font color=red>*</font>姓名</td>
			    		<td><input type="text" required="required" class="form-control"/>
			    		<br><input type="radio" name="sex" value="男"/>男<input type="radio" name="sex" value="女"/>女
			    		</td>
			    		<td>联系电话</td>
			    		<td><input type="text" class="form-control"/>
			    		</td>
			    	</tr>
			    	<tr>
			    		<td>关系</td>
			    		<td>
			    		  <select style="width:70px">
							<option>父子</option>
							<option>母子</option>
							<option>兄弟</option>
							<option>儿子</option>						
						  </select>
			    		</td>
			    		<td>是否同住</td>
			    		<td>
			    		  <select style="width:70px">
							<option>是</option>
							<option>否</option>							 						
						  </select>
			    		</td>
			    	</tr>
			    	<tr>
			    		<td>联系地址</td>
			    		<td colspan="4">
			    		<input type="text" class="form-control"/>
			    		</td>
			    		 
			    	</tr>			    	
			    </table>
			    </form>  
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
	        <button type="button" class="btn btn-primary">保存</button>
	      </div>
	    </div><!-- /.modal-content -->
	</div><!-- /.modal-dialog -->
</div><!-- /.modal -->

<!--修改亲属模态框  -->
<div class="modal fade" tabindex="-1" role="dialog" id="update_old_relative_modal">
   <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title">修改家属信息</h4>
	      </div>
	      <div class="modal-body">	
	           <form class="form-inline">        
			    <table class="table table-striped table-bordered text-center">
			    	<tr>
			    		<td><font color=red>*</font>姓名</td>
			    		<td><input type="text" required="required" class="form-control"/>
			    		<br><input type="radio" name="sex" value="男"/>男<input type="radio" name="sex" value="女"/>女
			    		</td>
			    		<td>联系电话</td>
			    		<td><input type="text" class="form-control"/>
			    		</td>
			    	</tr>
			    	<tr>
			    		<td>关系</td>
			    		<td>
			    		  <select style="width:70px">
							<option>父子</option>
							<option>母子</option>
							<option>兄弟</option>
							<option>儿子</option>						
						  </select>
			    		</td>
			    		<td>是否同住</td>
			    		<td>
			    		  <select style="width:70px">
							<option>是</option>
							<option>否</option>							 						
						  </select>
			    		</td>
			    	</tr>
			    	<tr>
			    		<td>联系地址</td>
			    		<td colspan="4">
			    		<input type="text" class="form-control"/>
			    		</td>
			    		 
			    	</tr>			    	
			    </table>
			    </form>  
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
	        <button type="button" class="btn btn-primary">修改</button>
	      </div>
	    </div><!-- /.modal-content -->
	</div><!-- /.modal-dialog -->
</div><!-- /.modal -->
<script type="text/javascript">
   //显示信息全选
   $("#check_item_all").click(function(){
	   $(".item_check").prop("checked",$(this).prop("checked"));
   });
   	
    
      
   //新增家属信息按钮，弹出模态框
   $("#add_old_relative_btn").click(function(){
	   $("#add_old_relative_modal").modal({
		   backdrop:"static"
	   });
   });
   //修改按钮，弹出修改模态框
   $(".update_old_relative_btn").click(function(){
	   $("#update_old_relative_modal").modal({
		   backdrop:"static"
	   });
   });
</script>
</body>
</html>
