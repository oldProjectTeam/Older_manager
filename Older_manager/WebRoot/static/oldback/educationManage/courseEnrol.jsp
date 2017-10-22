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
    <script type="text/javascript"  src="static/js/jquery-3.2.1.min.js"></script>
	<link rel="stylesheet" type="text/css" href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
	<script type="text/javascript" src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
  	
  </head>
  
<body >
  <!--路劲导航  -->
   <div>
  	<div class="row">
	  <div class="col-md-12" >
		<ol class="breadcrumb">
		  <li><b>位置：<a href="static/oldback/educationManage/educationIndex.html">教育管理</a></b></li>
		  <li class="active">课程报名</li>
		</ol>
	  </div>
    </div>
   </div>
   <!--内容 -->
   <div >
     <!--操作按钮  -->
  	<div class="row" >
	  <div class="col-md-6">&nbsp;
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
		  <div class="form-group">
		    <label for="exampleInputEmail2">老人姓名</label>
		    <input type="text" class="form-control" placeholder="请输入老人姓名">
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
		 		  <td>老人姓名</td>
		 		  <td>联系电话</td>
		 		  <td>课程完成情况</td>
		 		  <td>成绩</v>
		 		  <td>评价等级</td>
		 		  <td>报名时间</td>
		 		  <td>报名状态</td>
		 		  <td>操作</td>
		 		</tr>
		 	</thead>
		 	<tbody>
		 		 <tr>  
		 		 	<td class="text-center">
		 		 		<input type="checkbox" class="item_check">
		 		 	</td>
		 		 	<td>0</td>
		 		 	<td>中医经络芳疗认证课</td>
		 		 	<td>李成全</td>
		 		 	<td>18208516963</td>
		 		 	<td>通过</td>
		 		 	<td>89</td>
		 		 	<td>优秀</td>
		 		 	<td>2017年8月9日</td>
		 		 	<td>审核通过</td>
		 		 	<td>
		 		 	<button type="button" class="btn btn-info btn-sm" id="course_view_btn">
					 	<span class="glyphicon glyphicon-search" aria-hidden="true" ></span>
					 	查看
					 </button>
					 <button type="button" class="btn btn-info btn-sm" id="course_edit_btn">
					 	<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
					 	编辑
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
		 		 	<td>1</td>
		 		 	<td>中医经络芳疗认证课</td>
		 		 	<td>李成全</td>
		 		 	<td>18208516963</td>
		 		 	<td>通过</td>
		 		 	<td>89</td>
		 		 	<td>优秀</td>		 		 
		 		 	<td>2017年8月9日</td>
		 		 	<td>审核通过</td>
		 		 	<td>
		 		 	<button type="button" class="btn btn-info btn-sm">
					 	<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
					 	查看
					 </button>
					 <button type="button" class="btn btn-info btn-sm">
					 	<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
					 	编辑
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
		 		 	<td>李成全</td>
		 		 	<td>18208516963</td>
		 		 	<td>通过</td>
		 		 	<td>89</td>
		 		 	<td>优秀</td>
		 		 	<td>2017年8月9日</td>
		 		 	<td>审核通过</td>
		 		 	<td>
		 		 	<button type="button" class="btn btn-info btn-sm">
					 	<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
					 	查看
					 </button>
					 <button type="button" class="btn btn-info btn-sm">
					 	<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
					 	编辑
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
		 		 	<td>李成全</td>
		 		 	<td>18208516963</td>
		 		 	<td>通过</td>
		 		 	<td>89</td>
		 		 	<td>优秀</td>
		 		 	<td>2017年8月9日</td>
		 		 	<td>审核通过</td>
		 		 	<td>
					 <button type="button" class="btn btn-info btn-sm">
					 	<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
					 	查看
					 </button>
					 <button type="button" class="btn btn-info btn-sm">
					 	<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
					 	编辑
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
		 		 	<td>李成全</td>
		 		 	<td>18208516963</td>
		 		 	<td>通过</td>
		 		 	<td>89</td>
		 		 	<td>优秀</td>
		 		 	<td>2017年8月9日</td>
		 		 	<td>审核通过</td>
		 		 	<td>
		 		 	<button type="button" class="btn btn-info btn-sm">
					 	<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
					 	查看
					 </button>
					 <button type="button" class="btn btn-info btn-sm">
					 	<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
					 	编辑
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

<!--编辑模态框  -->
<div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" id="course_edit_modal">
   <div class="modal-dialog modal-lg" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title">编辑报名信息</h4>
	      </div>
	      <div class="modal-body">
	        <form class="form-horizontal">
			   <table class="table table-striped table-bordered text-center">
			   	  <tr>
			   		 <td>课程名称</td>
					 <td class="col-xs-2">		 	
						<p>中医经络芳疗认证课</p>
					 </td>
					 <td>老人姓名</td>
					 <td class="col-xs-2">
						 <p>李成全</p>
					 </td>
					 <td>联系电话</td>
					 <td>18208516069</td>
			   	  </tr>
			   	   <tr>
			   		 <td>课程完成情况</td>
					 <td>		 	
						 <input type="text" class="form-control">
					 </td>
					 <td>成绩</td>
					 <td>
						 <input type="text" class="form-control">
					 </td>
					 <td colspan="2">上课风采</td>
			   	  </tr>
			   	  <tr>
			   		 <td>评价等级</td>
					 <td>		 	
						  <select>
						  	<option>差</option>
						  	<option>中</option>
						  	<option>良</option>
						  	<option>优</option>
						  </select>
					 </td>
					 <td>正常上课</td>
					 <td>
						 <select >
						  	<option>是</option>
						  	<option>否</option>					  
						  </select>
					 </td>
					 <td rowspan="3" colspan="2">
					 	<input class="btn btn-success" type="button" value="上传图片">
					    <img src="static/oldback/images/vedioview.png" alt="..." class="img-rounded">
					 </td>
			   	  </tr>
			   	  <tr>
			   		 <td>报名时间</td>
					 <td>		 	
						 <p>2017年8月9日</p>
					 </td>
					 <td>报名状态</td>
					 <td>
						 <select>
						  	<option>审核通过</option>
						  	<option>正在审核</option>					  
						  </select>
					 </td>
			   	  </tr>
			   	  <tr>
			   		 <td>备注</td>
					 <td colspan="3">		 	
						   <textarea class="form-control" rows="3"></textarea>
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

<!--查看模态框  -->
<div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" id="course_view_modal">
   <div class="modal-dialog modal-lg" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title">查看报名信息</h4>
	      </div>
	      <div class="modal-body">
	        <form class="form-horizontal">
			   <table class="table table-striped table-bordered text-center">
			   	  <tr>
			   		 <td>课程名称</td>
					 <td class="col-xs-2">		 	
						中医经络芳疗认证课
					 </td>
					 <td>老人姓名</td>
					 <td class="col-xs-2">
						 <p>李成全</p>
					 </td>
					 <td>联系电话</td>
					 <td>18208516069</td>
			   	  </tr>
			   	   <tr>
			   		 <td>课程完成情况</td>
					 <td>		 	
						  通过
					 </td>
					 <td>成绩</td>
					 <td>
						 100
					 </td>
					 <td colspan="2">上课风采</td>
			   	  </tr>
			   	  <tr>
			   		 <td>评价等级</td>
					 <td>		 	
						   优
					 </td>
					 <td>正常上课</td>
					 <td>
						 是
					 </td>
					 <td rowspan="3" colspan="2">
					    <img src="static/oldback/images/vedioview.png" alt="..." class="img-rounded">
					 </td>
			   	  </tr>
			   	  <tr>
			   		 <td>报名时间</td>
					 <td>		 	
						 2017年8月9日
					 </td>
					 <td>报名状态</td>
					 <td>
						 审核通过
					 </td>
			   	  </tr>
			   	  <tr>
			   		 <td>备注</td>
					 <td colspan="3">		 	
						  该生已通过本课程考核
					 </td>
			   	  </tr>
			   </table>
			</form>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
	      </div>
	    </div><!-- /.modal-content -->
	</div><!-- /.modal-dialog -->
</div><!-- /.modal -->
<script type="text/javascript">
   //全选
   $("#check_item_all").click(function(){
	   $(".item_check").prop("checked",$(this).prop("checked"));
   });
   //查看按钮
   $("#course_view_btn").click(function(){
	   $("#course_view_modal").modal({
			backdrop:"static"
		});
   });
   
   //编辑按钮
   $("#course_edit_btn").click(function(){
	   $("#course_edit_modal").modal({
			backdrop:"static"
		});
   });
   
</script>
</body>
</html>
