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
  	
  </head>
  
<body style="margin: 15px;">
  <!--路劲导航  -->
   <div>
  	<div class="row">
	  <div class="col-md-12" >
		<ol class="breadcrumb">
		  <li><b>位置：<a href="education/educationIndex">教育管理</a></b></li>
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
		 		 	<td>${cs.coursecompletion!=null?cs.coursecompletion:'--'}</td>
		 		 	<td>${cs.grade!=null?cs.grade:'--'}</td>
		 		 	<td>${cs.rating!=null?cs.rating:'--' }</td>
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
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title">编辑报名信息</h4>
	      </div>
	      <div class="modal-body">
	        <form class="form-horizontal" id="courseenrol_edit_form">
			   <table class="table table-striped table-bordered text-center" border="1" id="courseenrol_edit_table">
			   	  
			   </table>
			</form>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
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
			   <table id="courseenrol_view_table" border="1">
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
	   $("#courseenrol_view_table").empty();
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
			   var tr1=$("<tr>"+
					      "<td>课程名称</td>"+
					      "<td>"+cs.courses.title+"</td>"+
					      "<td>老人姓名</td>"+
					      "<td>"+cs.oldman.name+"</td>"+
					      "<td>联系电话</td>"+
					      "<td>"+cs.oldman.phone+"</td>"+
					      "</tr>");
			   var coursecompletion=cs.coursecompletion!=null?cs.coursecompletion:'---';
			   var grade=cs.grade!=null?cs.grade:'---';
			   var tr2=$("<tr>"+
					      "<td>课程完成情况</td>"+
					      "<td>"+coursecompletion+"</td>"+
					      "<td>成绩</td>"+
					      "<td>"+grade+"</td>"+
					      "<td colspan='2'>上课风采</td>"+				       
					      "</tr>");
			   var isnormalclass=cs.isnormalclass!=null?cs.isnormalclass:'---';
			   var rating=cs.rating!=null?cs.rating:'---';
			   var tr3=$("<tr>"+
					      "<td>评价等级</td>"+
					      "<td>"+rating+"</td>"+
					      "<td>正常上课</td>"+
					      "<td>"+isnormalclass+"</td>"+
					      "<td rowspan='3' colspan='2'>"+
					      "<img src='static/images/oldback/images/vedioview.png' alt='图片找不到' class='img-rounded'>"+
					      "</td>"+					   
					      "</tr>");
			   
			   var tr4=$("<tr>"+
					      "<td>报名时间</td>"+
					      "<td>"+cs.timeStr+"</td>"+
					      "<td>报名状态</td>"+
					      "<td>"+cs.enrolstate+"</td>"+			       
					      "</tr>");
			   var remark=cs.remark!=null?cs.remark:'---';
			   var tr5=$("<tr>"+					       
					      "<td>备注</td>"+
					      "<td colspan='3'>"+remark+"</td>"+
					      "</tr>");
			   $("#courseenrol_view_table").append(tr1).append(tr2)
			   				.append(tr3).append(tr4).append(tr5);
			    //table-striped table-bordered text-center
			   $("#courseenrol_view_table").addClass("table table-striped table-bordered text-center");
		   }
	   });
   });
   
 //点击编辑，加载数据，弹出模态框
   $(document).on("click",".edit_btn",function(){
	   $("#courseenrol_edit_table").empty();
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
			   var tr1=$("<tr>"+
					      "<td>课程名称</td>"+
					      "<td>"+cs.courses.title+"</td>"+
					      "<td>老人姓名</td>"+
					      "<td>"+cs.oldman.name+"</td>"+
					      "<td>联系电话</td>"+
					      "<td>"+cs.oldman.phone+"</td>"+
					      "</tr>");
			   
			   //第二行
			   var coursecompletion=cs.coursecompletion!=null?cs.coursecompletion:'';
			   var grade=cs.grade!=null?cs.grade:'';		 
			   var tr2td1 =$("<td>课程完成情况</td>");
			   var tr2td2 =$("<td></td>");
			   var tr2td2input=$("<input type='text' name='coursecompletion'/>");
			   tr2td2input.addClass("form-control").attr("value",coursecompletion);
			   
			   tr2td2.append(tr2td2input);  
			   var tr2td3=$("<td>成绩</td>");
			   var tr2td4 =$("<td></td>");
			   var tr2td4input=$("<input type='text' name='grade'/>");
			   tr2td4input.attr("value",grade).addClass("form-control");
			   tr2td4.append(tr2td4input);
			   var tr2td5 =$("<td colspan='2'></td>");
			   tr2td5.append("上课风采");
			   var tr2=$("<tr></tr>");
			   tr2.append(tr2td1).append(tr2td2).append(tr2td3).append(tr2td4).append(tr2td5);
			   
			  
			   //第三行
			   var isnormalclass=cs.isnormalclass!=null?cs.isnormalclass:'';
			   var rating=cs.rating!=null?cs.rating:'';	 
			   var tr3td1 =$("<td>评价等级</td>");
			   var tr3td2 =$("<td></td>");
			   
			   var tr3td2option0=$("<option>请选择</option>").attr("value","");
			   var tr3td2option1=$("<option>差</option>").attr("value","差");
			   var tr3td2option2=$("<option>中</option>").attr("value","中");
			   var tr3td2option3=$("<option>良</option>").attr("value","良");
			   var tr3td2option4=$("<option>优</option>").attr("value","优");
			   var  tr3td2select=$("<select name='rating'></select>");
			   tr3td2select.append(tr3td2option0).append(tr3td2option1).append(tr3td2option2)
			   .append(tr3td2option3).append(tr3td2option4);
			   tr3td2select.val([cs.rating]);
			   tr3td2.append(tr3td2select);  
			   var tr3td3=$("<td>正常上课</td>");
			   var tr3td4 =$("<td></td>");
			   var tr3td4input=$("<input type='text' name='isnormalclass'/>");
			   tr3td4input.attr("value",isnormalclass).addClass("form-control");
			   tr3td4.append(tr3td4input);
			   var tr3td5 =$("<td colspan='2' rowspan='3'></td>");
			   var tr3td5img=$("<img >");tr3td5img.attr("src","static/images/oldback/images/vedioview.png");
			   tr3td5img.addClass("img-rounded");
			   tr3td5.append(tr3td5img);
			   var tr3=$("<tr></tr>");
			   tr3.append(tr3td1).append(tr3td2).append(tr3td3).append(tr3td4).append(tr3td5);
			    
			   
			   //第四行
			   		 
			   var tr4td1 =$("<td>报名时间</td>");
			   var tr4td2 =$("<td></td>").append(cs.timeStr);		    
			   var tr4td3=$("<td>报名状态</td>");
			   var tr4td4 =$("<td></td>");
			   var tr4td4option1=$("<option>正在审核</option>").attr("value","正在审核");
			   var tr4td4option2=$("<option>报名成功</option>").attr("value","报名成功");
			   var  tr4td4select=$("<select name='enrolstate'></select>");
			   tr4td4select.append(tr4td4option1).append(tr4td4option2);
			   tr4td4select.val([cs.enrolstate]);
			   tr4td4.append(tr4td4select);
			   var tr4=$("<tr></tr>");
			   tr4.append(tr4td1).append(tr4td2).append(tr4td3).append(tr4td4);
			   
			   //第五行
			   var remark=cs.remark!=null?cs.remark:'';
			   var tr5td1 =$("<td>备注</td>");
			   var tr5td2 =$("<td colspan='3'></td>");		    
			   var tr5td2input=$("<input type='text' name='remark'/>");
			   tr5td2input.addClass("form-control").attr("value",remark);
			   tr5td2.append(tr5td2input); 
			   var tr5=$("<tr></tr>");
			   tr5.append(tr5td1).append(tr5td2);
			   
			   //课程报名ID
			   var inputId=$("<input type='hidden' name='id''/>");
			   inputId.attr("value",cs.id);
			   tr5.append(inputId);
			   
			   $("#courseenrol_edit_table").append(tr1).append(tr2)
			   				.append(tr3).append(tr4).append(tr5);
			    //table-striped table-bordered text-center
			   //$("#courseenrol_view_table").addClass("table table-striped table-bordered text-center");
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
				   //2.重新加载当页
				   go(currentPage);
			   }else{
				   alert("修改失败，请再重试一遍吧！");
				   $("#courseenrol_edit_modal").modal('hide');
			   }
		   }
	   });
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

</body>
</html>
