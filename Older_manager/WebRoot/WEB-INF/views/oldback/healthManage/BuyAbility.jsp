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
    <meta name="keywords" content="keyword1,keyword2,keyword3">
    <meta name="description" content="this is my page">
    <meta name="content-type" content="text/html; charset=UTF-8">
<!-- 引入jquery -->
<script type="text/javascript" src="${APP_PATH}/static/js/jquery-3.2.1.min.js"></script>
<!-- 引入样式 -->
<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
 <script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
  </head>
  <body>
    <div class="col-sm-12">
   <!--路劲导航  -->
	<div class="row">
		<div class="col-md-12">
			<ol class="breadcrumb">
				<li><b>位置：客户关系管理</b></li>
				<li class="active">购买能力</li>
				
			</ol>
		</div>
	</div>
    
      <!--条件查询  -->
    <div class="row form-inline" style="margin-top:5px">
    
    <div class="col-md-12">
              老人姓名： <input type="text" class="form-control"  id="name1" placeholder="请输入老人名字">
              购买能力：<select>
                       <option>高</option>
                       <option>中</option>
                       <option>低</option>
                 </select>
       
	   <button  class="btn btn-default"  id="selectwith">
			  	<span class="glyphicon glyphicon-search"></span>
			  	查询
	   </button>      

		  </div>

    </div>
         <!-- 表格 -->
		<div class="row" style="margin-top:10px">
			<div class="col-md-12">
				<table class="table table-bordered table-hover text-center">
					<tr>

						<td><input type="checkbox" id='check_item_all' /></td>
						<td>#</td>
						<td>老人姓名</td>
						<td>当前积分</td>
						<td>每月平均消费金额</td>
						<td>购买能力</td>
						<td>活跃状态</td>
						<td>备注</td>
					</tr>
					<tr>

						<td><input type="checkbox" id='check_item_all' /></td>
						<td>#</td>
						<td>张三</td>
						<td>555</td>
						<td>555</td>
						<td>高</td>
						<td>潜水</td>
						<td>无</td>
					</tr>
					<tr>

						<td><input type="checkbox" id='check_item_all' /></td>
						<td>#</td>
						<td>张三</td>
						<td>555</td>
						<td>555</td>
						<td>高</td>
						<td>潜水</td>
						<td>无</td>
					</tr>
					<tr>

						<td><input type="checkbox" id='check_item_all' /></td>
						<td>#</td>
						<td>张三</td>
						<td>555</td>
						<td>555</td>
						<td>高</td>
						<td>潜水</td>
						<td>无</td>
					</tr>
					<tr>

						<td><input type="checkbox" id='check_item_all' /></td>
						<td>#</td>
						<td>张三</td>
						<td>555</td>
						<td>555</td>
						<td>高</td>
						<td>潜水</td>
						<td>无</td>
					</tr>
					<tr>

						<td><input type="checkbox" id='check_item_all' /></td>
						<td>#</td>
						<td>张三</td>
						<td>555</td>
						<td>555</td>
						<td>高</td>
						<td>潜水</td>
						<td>无</td>
					</tr>

				</table>
			</div>
		</div>

       
		<!-- 尾部 -->
		<div class="col-sm-12">
			<LABEL class="floatlast"> 显示1到5，共10000条记录 </LABEL>
		</div>
		<!-- 分页条 -->
		<div class="col-md-offset-4 col-md-4">
			<nav aria-label="Page navigation">
			<ul class="pagination pagination-lg">
				<li><a href="#" aria-label="Previous"> <span
						aria-hidden="true">&laquo;</span>
				</a></li>
				<li><a href="#">1</a></li>
				<li><a href="#">2</a></li>
				<li><a href="#">3</a></li>
				<li><a href="#">4</a></li>
				<li><a href="#">5</a></li>
				<li><a href="#" aria-label="Next"> <span aria-hidden="true">&raquo;</span>
				</a></li>
			</ul>
			</nav>
		</div>
	</div>  

<!-- 新增模态框 --> 
<div class="modal fade" tabindex="-1" role="dialog" id="add_modal">
   <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title">新增手术信息</h4>
	      </div>
	      <div class="modal-body">	
	           <form class="form-inline" id="add_activity_form">        
			    <div class="">
	            <table class="table table-bordered table-hover">
	                
	               <tr>
	                 <td>老人姓名</td>
	                 <td>
	                   <select id="oldman_name" class="form-control" name="oldmanId">
	                 		<option>张三</option>
	                 		<option>李四</option>
	                 		</select>
	                 </td>
	                 <td>手术名称</td>
	                  <td>
                         <input name="remak" type="text" class="form-control">
	                 </td>
	               </tr>
	               <tr>
	                 
	                 <td>手术时间</td>
	                 <td><input name="taketime" type="date" class="form-control"></td>
	                 <td>医院名称</td>
	                  <td>
                        <input name="taketime" type="date" class="form-control">
	                 </td>
	               </tr>
	               <tr>
	                  <td >备注</td >
	                  <td colspan="3"><input name="remak" type="text" class="form-control"></td>
	               </tr>
	          
	               
	          </table>
	   </div>
			    </form>  
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
	        <button type="button" class="btn btn-primary" id="save_activities_btn">保存</button>
	      </div>
	    </div><!-- /.modal-content -->
	</div><!-- /.modal-dialog -->
</div><!-- /.modal -->

<!-- 修改模态框 --> 
<div class="modal fade" tabindex="-1" role="dialog" id="update_modal">
   <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title">修改手术信息</h4>
	      </div>
	      <div class="modal-body">	
	           <form class="form-inline" id="add_activity_form">        
			    <div class="">
	            <table class="table table-bordered table-hover">
	                
	               <tr>
	                 <td>老人姓名</td>
	                 <td>
	                                   张三
	                 </td>
	                 <td>手术名称</td>
	                  <td>
                         <input name="remak" type="text" class="form-control">
	                 </td>
	               </tr>
	               <tr>
	                 
	                 <td>手术时间</td>
	                 <td><input name="taketime" type="date" class="form-control"></td>
	                 <td>医院名称</td>
	                  <td>
                        <input name="taketime" type="text" class="form-control">
	                 </td>
	               </tr>
	               <tr>
	                  
	                  <td>备注</td >
	                  <td colspan="3"><input name="remak" type="text" class="form-control"></td>
	               </tr>
	          
	               
	          </table>
	   </div>
			    </form>  
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
	        <button type="button" class="btn btn-primary" id="save_activities_btn">更新</button>
	      </div>
	    </div><!-- /.modal-content -->
	</div><!-- /.modal-dialog -->
</div><!-- /.modal -->

<script type="text/javascript">


//新增模态框
$("#add_btn").click(function(){

$("#add_modal").modal();


});

//编辑模态框
$("#update-btn").click(function(){

$("#update_modal").modal();


});
 
</script>






  </body>
</html>
