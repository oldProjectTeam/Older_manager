<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%pageContext.setAttribute("APP_PATH",request.getContextPath()); %>
<!DOCTYPE html>
<html>
  <head>
   <base href="<%=basePath%>">
    <meta name="keywords" content="keyword1,keyword2,keyword3">
    <meta name="description" content="this is my page">
    <meta name="content-type" content="text/html; charset=UTF-8">
    
    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->
    <script type="text/javascript"  src="${APP_PATH }/static/js/jquery-3.2.1.min.js"></script>
	<link rel="stylesheet" type="text/css" href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
	<script type="text/javascript" src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
  	<style type="text/css">
	  #parent{
	  		width:200px; 
	  		height:20px;
	  		 border:2px solid #09F;
	  		 }
	  #son {width:0; height:100%; background-color:#09F; text-align:center;font-size:0.6em; line-height:15px; font-weight:bold;} 
	</style>
  </head>
  
<body style="margin-left:15px">
  <!--路劲导航  -->
   <div>
  	<div class="row">
	  <div class="col-md-12" >
		<ol class="breadcrumb">
		  <li><b>位置：教育管理</b></li>
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
		 <button type="button" class="btn btn-danger" id="batchDel_btn">
		 	<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
		 	批量删除
		 </button>
	  </div>
    </div>
    <!--条件查询  -->
    <div class="row" style="margin-top:5px">
	  <div class="col-md-12">
		 <form class="form-inline" action="${APP_PATH}/courseenrol/searchCourseenrol.action">
		  <div class="form-group">
		    &nbsp;&nbsp;<label for="exampleInputName2">课程名称</label>
		    <input type="text" class="form-control" placeholder="请输入课程名称" name="courses.title">
		  </div>
		  <div class="form-group">
		    <label for="exampleInputEmail2">老人姓名</label>
		    <input type="text" class="form-control" placeholder="请输入老人姓名" name="oldman.name">
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
		 		  <td><input type="checkbox" id='check_item_all'></td>
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
		 	  <c:forEach items="${pageInfo.list}" var="cs">
		 	  	<tr>  
		 		 	<td class="text-center">
		 		 		<input type="checkbox" class="item_check">
		 		 	</td>
		 		 	<td>${cs.id }</td>
		 		 	<td>${cs.courses.title}</td>
		 		 	<td>${cs.oldman.name }</td>
		 		 	<td>${cs.oldman.phone }</td>
		 		 	<td>${cs.coursecompletion!=null&&cs.coursecompletion!=''?cs.coursecompletion:'--'}</td>
		 		 	<td>${cs.grade!=null?cs.grade:'--'}</td>
		 		 	<td>${cs.rating!=null&&cs.rating!=''?cs.rating:'--' }</td>
		 		 	<td><fmt:formatDate value="${cs.enroltime}" pattern='yyyy-MM-dd HH:mm:ss'/></td>
		 		 	<td>${cs.enrolstate}</td>
		 		 	<td>
		 		 	<button type="button" class="btn btn-info btn-sm view_btn">
					 	<span class="glyphicon glyphicon-search" aria-hidden="true" ></span>
					 	查看
					 </button>
					 <button type="button" class="btn btn-info btn-sm edit_btn">
					 	<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
					 	编辑
					 </button>
					 <button type="button" class="btn btn-danger btn-sm del_btn">
					 	<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
					 	删除
					 </button>
		 		 	</td>
		 		 </tr>
		 	  </c:forEach>  
		 	</tbody>
			<thead>
		 </table>
		</div>
	  </div>
    </div>
    <!--分页信息  -->
    <div class="row" >
      <div class="col-md-7">
      	&nbsp;&nbsp;当前第${pageInfo.pageNum}页，共${pageInfo.pages}页，总计${pageInfo.total}条记录
      </div>
	  <div class="col-md-4 col-md-offset-1">
		 <nav aria-label="Page navigation">
			  <ul class="pagination">
			    <c:if test="${pageInfo.hasPreviousPage==false}">
			    	<li class="disabled">
			    	   <a>首页</a>
			    	 </li>
			    	<li class="disabled"> 
			           <span aria-hidden="true">&laquo;</span>
			        </li>
			    </c:if>
			    <c:if test="${pageInfo.hasPreviousPage==true}">
			    	<li>
			    	  <a href="${APP_PATH}/courseenrol/searchCourseenrol.action?pn=${1}">首页</a>
			    	</li>
			    	<li> 
			    	   <a href="${APP_PATH}/courseenrol/searchCourseenrol.action?pn=${pageInfo.pageNum-1}">
			           <span aria-hidden="true">&laquo;</span></a>
			        </li>
			    </c:if>		    
			    <c:forEach items="${pageInfo.navigatepageNums}" var="p">
			       <c:if test="${p==pageInfo.pageNum}">
			       		<li class="active"><a href="${APP_PATH}/courseenrol/searchCourseenrol.action?pn=${pageInfo.pageNum}">${p}</a></li>
			       </c:if>
			       <c:if test="${p!=pageInfo.pageNum}">
			       		<li><a href="${APP_PATH}/courseenrol/searchCourseenrol.action?pn=${p}">${p}</a></li>
			       </c:if>
			    </c:forEach>
			    <c:if test="${pageInfo.hasNextPage==false}">
			      <li class="disabled"> 
			         <span aria-hidden="true">&raquo;</span>
			      </li>
			      <li class="disabled"><a>末页</a></li>
			    </c:if>	
			    <c:if test="${pageInfo.hasNextPage!=false}">
			      <li> 
			         <a href="${APP_PATH}/courseenrol/searchCourseenrol.action?pn=${pageInfo.pageNum+1}" aria-label="Next">
			         <span aria-hidden="true">&raquo;</span></a>
			      </li>
			      <li>
			        <a href="${APP_PATH}/courseenrol/searchCourseenrol.action?pn=${pageInfo.pages}">末页</a>
			       </li>
			    </c:if>		     	     
			  </ul>
		</nav>
	  </div>
    </div>
   </div>

<!--编辑模态框  -->
<div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" id="courseenrol_edit_modal">
   <div class="modal-dialog modal-lg" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        
	        <h4 class="modal-title">编辑报名信息</h4>
	      </div>
	      <div class="modal-body">
	        <form class="form-horizontal" id="courseenrol_edit_form">
			   <table class="table table-striped table-bordered text-center" id="courseenrol_edit_table">
			   	  <tr>
			   	  	<td>课程名称</td>
			   	  	<td id="courseTitle"></td>
			   	  	<td>老人姓名</td>
			   	  	<td id="oldManName"></td>
			   	  	<td>联系电话</td>
			   	  	<td id="oldManphone"></td>
			   	  </tr>
			   	  <tr>
			   	  	<td>课程完成情况</td>
			   	  	<td>
			   	  		<input type="text" class="form-control" name="coursecompletion" id="coursecompletion">
			   	  	</td>
			   	  	<td>成绩</td>
			   	  	<td>
			   	  		<input type="text" class="form-control" name="grade" id="grade">
			   	  	</td>
			   	  	<td colspan="2">上课风采</td>
			   	  </tr>
			   	  <tr>
			   	  	<td>评价等级</td>
			   	  	<td >
			   	  	    <select name="rating" id="rating">
			   	  	    	<option value="">请选择</option>
			   	  	    	<option value="差">差</option>
			   	  	    	<option value="中">中</option>
			   	  	    	<option value="良">良</option>
			   	  	    	<option value="优">优</option>
			   	  	    </select>			   	  		
			   	  	</td>
			   	  	<td>正常上课</td>
			   	  	<td>
			   	  		<input type="text" class="form-control" name="isnormalclass" id="isnormalclass">
			   	  	</td>
			   	  	<td colspan="2" rowspan="3">
			   	  		<input type="file" class="form-control" id="photofile" onchange="showPic()">
			   	  		<input class="btn btn-success" type="button" value="上传图片" onclick="uploadFile()"><br>
			   	  		<div class="col-md-6 col-md-offset-2" id="imgDiv">
			   	  		
			   	  		   <div class="progress" id="parent">
							  <div id="son" class="progress-bar progress-bar-success progress-bar-striped" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
							    <span class="sr-only"></span>
							  </div>
							</div>
			   	  		
			   	  		   <!-- <div id="parent">
 							<div id="son"></div>
 						   </div> -->
						</div>
			   	  		<img class="img-rounded" id="img" width="150" height="150">
			   	  		
			   	  	</td>
			   	  </tr>
			   	  <tr>
			   	  	<td>报名时间</td>
			   	  	<td id="timeStr">
			   	  	</td>
			   	  	<td>报名状态</td>
			   	  	<td>
			   	  		<select name="enrolstate" id="enrolstate">
			   	  	    	<option value="正在审核">正在审核</option>
			   	  	    	<option value="报名成功">报名成功</option>
			   	  	    </select>
			   	  	</td>			   	  	 
			   	  </tr>
			   	  <tr>
			   	  	<td>备注</td>
			   	  	<td colspan="3" id="tr5">
			   	  		<textarea class="form-control" rows="3" name="remark" id="remark"></textarea>
			   	  		<input type="hidden" name="id" id="csid"/>
			   	  	</td>			   	  	 		   	  	 
			   	  </tr>
			   </table>
			</form>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal" id="close_btn">关闭</button>
	        <button type="button" class="btn btn-primary" id="save_btn">保存</button>
	      </div>
	    </div><!-- /.modal-content -->
	</div><!-- /.modal-dialog -->
</div><!-- /.modal -->

<!--查看模态框  -->
<div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" id="courseenrol_view_modal">
   <div class="modal-dialog modal-lg" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title">查看报名信息</h4>
	      </div>
	      <div class="modal-body">
	        <form class="form-horizontal">
			   <table id="courseenrol_view_table" class="table table-striped table-bordered text-center">
			   <tr>
			   	  	<td>课程名称</td>
			   	  	<td id="courseTitle1"></td>
			   	  	<td>老人姓名</td>
			   	  	<td id="oldManName1"></td>
			   	  	<td>联系电话</td>
			   	  	<td id="oldManphone1"></td>
			   	  </tr>
			   	  <tr>
			   	  	<td>课程完成情况</td>
			   	  	<td id="coursecompletion1">		   	  		
			   	  	</td>
			   	  	<td>成绩</td>
			   	  	<td id="grade1">	  	  		
			   	  	</td>
			   	  	<td colspan="2">上课风采</td>
			   	  </tr>
			   	  <tr>
			   	  	<td>评价等级</td>
			   	  	<td id="rating1">			   	  	   		   	  		
			   	  	</td>
			   	  	<td>正常上课</td>
			   	  	<td id="isnormalclass1">	   	  		 
			   	  	</td>
			   	  	<td colspan="2" rowspan="3">
			   	  		 
			   	  		<img class="img-rounded" id="img1" width="150" height="150">
			   	  		
			   	  	</td>
			   	  </tr>
			   	  <tr>
			   	  	<td>报名时间</td>
			   	  	<td id="timeStr1">
			   	  	</td>
			   	  	<td>报名状态</td>
			   	  	<td id="enrolstate1">			   	  		 
			   	  	</td>			   	  	 
			   	  </tr>
			   	  <tr>
			   	  	<td>备注</td>
			   	  	<td colspan="3" id="remark1">  		 
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
	//当前页
	var currentPage=${pageInfo.pageNum};

	//去哪页
	function go(pn){
		window.location.href="${APP_PATH}/courseenrol/searchCourseenrol.action?pn="+pn;
	}

   //全选
   $("#check_item_all").click(function(){
	   $(".item_check").prop("checked",$(this).prop("checked"));
   });
   //如果复选框全部选中，全选复选框应该也要选中
   $(document).on("click",".item_check",function(){
	   var flag=$(".item_check:checked").length==$(".item_check").length;
	   $("#check_item_all").prop("checked",flag);
   });
   
   //点击查看，加载数据，弹出模态框
   $(document).on("click",".view_btn",function(){
	   //$("#courseenrol_view_table").empty();
	   var id=$(this).parents("tr").find("td:eq(1)").text();
	   $.ajax({
		   url:"${APP_PATH}/courseenrol/queryCourseenrolById.action?id="+id,
		   type:"post",
		   success:function(result){
			   var cs=result.extend.courseenrol;
			   //1.弹出模态框
			   $("#courseenrol_view_modal").modal({
					backdrop:"static"
			   });
			   //2.显示数据
			   
			   //第一行
			   
			   $("#courseTitle1").html(cs.courses.title);
			   $("#oldManName1").html(cs.oldman.name);
			   $("#oldManphone1").html(cs.oldman.phone);
			   
			   //第二行
			   var coursecompletion=cs.coursecompletion!=null?cs.coursecompletion:'';
			   var grade=cs.grade!=null?cs.grade:'';
			   $("#coursecompletion1").html(coursecompletion);
			   $("#grade1").html(grade);
			   
			   //第三行
			   var rating=cs.rating!=null?cs.rating:'';
			   $("#rating1").html(rating);
			   var isnormalclass=cs.isnormalclass!=null?cs.isnormalclass:'';
			   $("#isnormalclass1").html(isnormalclass);
			   if(cs.courseenrol1!=null&&cs.courseenrol1!='')
			   		$("#img1").attr("src","upload/"+cs.courseenrol1);
			   else{
				   $("#img1").attr("src","upload/default.png");
			   }
			   //第四行
			   $("#timeStr1").html(cs.timeStr);
			   var enrolstate=cs.enrolstate!=null?cs.enrolstate:'';
			   $("#enrolstate1").html(enrolstate);
			  
			   //第五行
			   var remark=cs.remark!=null?cs.remark:'';
			    $("#remark1").html(remark);
			    			  
		   }
	   });
   });
   
 //点击编辑，加载数据，弹出模态框
   $(document).on("click",".edit_btn",function(){
	   
	   //判断图片是否遗留，有则删除
	   var isImg=$("#cs1").val();
	    if(isImg!=undefined&&isImg!=''){//如果cs1已在，先删除
	    	$("#cs1").remove();
	    }
	   
	   $("#imgDiv").hide();
	    //清空文件域
	   var file = $("#photofile") ;
	   file.after(file.clone().val(""));      
	   file.remove(); 
	   var id=$(this).parents("tr").find("td:eq(1)").text();	   
	   $.ajax({
		   url:"${APP_PATH}/courseenrol/queryCourseenrolById.action?id="+id,
		   type:"post",
		   success:function(result){			
			   var cs=result.extend.courseenrol;
			   //1.弹出模态框
			   $("#courseenrol_edit_modal").modal({
					backdrop:"static"
			   });
			   //2.显示数据
			   
			   //第一行
			   
			   $("#courseTitle").html(cs.courses.title);
			   $("#oldManName").html(cs.oldman.name);
			   $("#oldManphone").html(cs.oldman.phone);
			   
			   //第二行
			   var coursecompletion=cs.coursecompletion!=null?cs.coursecompletion:'';
			   var grade=cs.grade!=null?cs.grade:'';
			   $("#coursecompletion").val(coursecompletion);
			   $("#grade").val(grade);
			   
			   //第三行
			   $("#rating").val([cs.rating]);
			   var isnormalclass=cs.isnormalclass!=null?cs.isnormalclass:'';
			   $("#isnormalclass").val(isnormalclass);
			   if(cs.courseenrol1!=null&&cs.courseenrol1!='')
			   		$("#img").attr("src","upload/"+cs.courseenrol1);
			   else{
				   $("#img").attr("src","upload/default.png");
			   }
			   //第四行
			   $("#timeStr").html(cs.timeStr);
			   $("#enrolstate").val([cs.enrolstate]);
			  
			   //第五行
			   var remark=cs.remark!=null?cs.remark:'';
			    $("#remark").val(remark);
			    $("#csid").val(cs.id);
			  
		   }
	   });
   });
   //点击保存按钮，修改报名信息
   $("#save_btn").click(function(){
	   $.ajax({
		   url:"${APP_PATH}/courseenrol/updateCourseenrol",
		   type:"post",
		   data:$("#courseenrol_edit_form").serialize(),
		   success:function(result){
			   if(result.code==100){
				   alert("修改成功！");
				   //1.关闭模态框
				   $("#courseenrol_edit_modal").modal('hide');
				   //2.
				   var isImg=$("#cs1").val();
				    if(isImg!=undefined&&isImg!=''){//如果图片已上传，那么关闭之前将图片文本框删除
				    	$("#cs1").remove();			    	 
				    }
				   //3.重新加载当页
				   go(currentPage);
			   }else{
				   alert("修改失败，请再重试一遍吧！");
				   $("#courseenrol_edit_modal").modal('hide');
				   var isImg=$("#cs1").val();
				    if(isImg!=undefined&&isImg!=''){//如果图片已上传，那么关闭之前将图片删除
				    	$("#cs1").remove();
				    	removeImg(isImg);
				    }
			   }
			   
		   }
	   });
   });
   
   
   //删除上传但没保存的图片
   function removeImg(imgName){
	   $.ajax({
   		url:"${APP_PATH}/courseenrol/checkImg.action?isImg="+imgName,    		 
   		type:"post",
   		success:function(result){
   		}
   	});
   }
   //编辑模态框点击关闭，查看是否已上传图片但没保存
   $("#close_btn").click(function(){
	   //获取图片
	   var isImg=$("#cs1").val();
	    if(isImg!=undefined&&isImg!=''){//如果图片已上传，那么关闭之前将图片删除
	    	$("#cs1").remove();
	    	removeImg(isImg);
	    }
   });
   
   //单选删除按钮
   $(document).on("click",".del_btn",function(){
	   var id=$(this).parents("tr").find("td:eq(1)").text();
	   var name=$(this).parents("tr").find("td:eq(3)").text();
	   if(!confirm("您确定要删除老人【"+name+"】的报名记录吗？")){
		   return false;
	   }else{
		   $.ajax({
			   url:"${APP_PATH}/courseenrol/deleteCourseenrol/"+id,
			   type:"delete",
			   success:function(result){
				   if(result.code==100){
					   alert("删除成功！");
					   go(currentPage);
				   }else{
					   alert("删除失败，请再重试一遍吧！");
				   }		   
			   }
			   
		   });
	   }
   });
   
   //批量删除按钮
   $("#batchDel_btn").click(function(){
	   var oldManStr="";
	   var Ids_str="";
	   $.each($(".item_check:checked"),function(){
		   oldManStr+=$(this).parents("tr").find("td:eq(3)").text()+",";
		   Ids_str+=$(this).parents("tr").find("td:eq(1)").text()+"-";
	   });
	   oldManStr=oldManStr.substring(0,oldManStr.length-1);
	   Ids_str=Ids_str.substring(0,Ids_str.length-1);
	   if(Ids_str.length<1){
		   alert("您还没选中要删除的记录！");
		   return false;
	   }
	   if(!confirm("您确定要删除老人【"+oldManStr+"】的报名信息吗？")){
		   return false;
	   }
	   
	   $.ajax({
		   url:"${APP_PATH}/courseenrol/deleteCourseenrol/"+Ids_str,
		   type:"delete",
		   success:function(result){
			   if(result.code==100){
				   alert("删除成功！");
				   go(currentPage);
			   }else{
				   alert("删除失败，请再重试一遍吧！");
			   }	
		   }
	   });
   });
</script>
<script type="text/javascript">

//首先隐藏进度条
$(function(){
	 $("#imgDiv").hide();
});

//判断选择的是否是


//上传图片，加载进度条
 function showPic(){
  var pic = $("#photofile").get(0).files[0];
  var regImg=/\.(gif|jpg|jpeg|png|GIF|JPG|PNG)$/;
   if(!regImg.test($("#photofile").val())){
	   alert("图片类型必须是.gif,jpeg,jpg,png中的一种");
	 //清空文件域
	   var file = $("#photofile") ;
	   file.after(file.clone().val(""));      
	   file.remove();
       return false;
   }
  $("#son").css("width" ,"0%");
  $("#imgDiv").hide();
  $("#img").prop("src" , window.URL.createObjectURL(pic));
 // uploadFile();
 }
 function uploadFile(){
  var pic = $("#photofile").get(0).files[0];
  if(pic==undefined){
	  alert("您还没选择上传的文件！");
	  return false;
  }
  //显示进度条
  $("#imgDiv").show();
  var formData = new FormData();
  formData.append("file" , pic);
  /** 
   * 必须false才会避开jQuery对 formdata 的默认处理 
   * XMLHttpRequest会对 formdata 进行正确的处理 
   */
  $.ajax({
	   type: "POST",
	   url: "courseenrol/upload.action",
	   data: formData ,
	   processData : false, 
	   //必须false才会自动加上正确的Content-Type 
	   contentType : false , 
	   xhr: function(){
	    var xhr = $.ajaxSettings.xhr();
	    if(onprogress && xhr.upload) {
	     	xhr.upload.addEventListener("progress" , onprogress, false);
	     return xhr;
	    }
  	   },
  	 success:function(result){
  		 if(result.code==100){
  			 //返回图片路径创建文本框之前，先判断之前是否已经上传过了，如果是，先删除再创建
  			var isImg=$("#cs1").val();
		    if(isImg!=undefined&&isImg!=''){//如果图片已上传，那么创建之前将图片删除
		    	$("#cs1").remove();
		    	removeImg(isImg);
		    }
		  //清空文件域
			 var file = $("#photofile") ;
			 file.after(file.clone().val(""));      
			 file.remove();
			 //存放文件名
			 var inputPath=$("<input type='hidden' name='courseenrol1' id='cs1'/>" );
			 inputPath.attr("value",result.extend.fileName);
			 inputPath.appendTo("#tr5");
  		 }else{
  			 $("#son").html("上传失败");
  			 $("#son").css("font-size","0.6em");
  			 $("#son").css("color","red");
  		 }
	 }
  });
 }
 

 
 /**
  * 侦查附件上传情况 ,这个方法大概0.05-0.1秒执行一次
  */
 function onprogress(evt){
	  var loaded = evt.loaded;     //已经上传大小情况 
	  var tot = evt.total;      //附件总大小 
	  var per = Math.floor(100*loaded/tot);  //已经上传的百分比 
	  $("#son").html( per +"%" );
	  $("#son").css("width" , per +"%");
	  if($("#son").text()=="100%"){
		  $("#son").html("上传成功");
	  }
 }
 </script>
</body>
</html>
