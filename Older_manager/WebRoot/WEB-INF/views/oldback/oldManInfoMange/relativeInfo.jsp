<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%
 pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
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
			    		<td><input type="text" required="required" name="name" class="form-control"/>
			    		<br><input type="radio" name="sex" value="男" checked="checked"/>男<input type="radio" name="sex" value="女"/>女
			    		</td>
			    		<td>联系电话</td>
			    		<td><input type="text" name="phone" class="form-control"/>
			    		</td>
			    	</tr>
			    	<tr>
			    		<td>关系</td>
			    		<td>
			    		  <select style="width:70px" name="relation">
							<option>父子</option>
							<option>母子</option>
							<option>兄弟</option>
							<option>儿子</option>						
						  </select>
			    		</td>
			    		<td>是否同住</td>
			    		<td>
			    		  <select style="width:70px" name="islive">
							<option>是</option>
							<option>否</option>							 						
						  </select>
			    		</td>
			    	</tr>
			    	<tr>
			    		<td>联系地址</td>
			    		<td colspan="4">
			    		<input type="text" name="address" class="form-control"/>
			    		</td>
			    		 
			    	</tr>			    	
			    </table>
			    </form>  
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
	        <button type="button" class="btn btn-primary" id="save_old_relaties_btn">保存</button>
	      </div>
	    </div><!-- /.modal-content -->
	</div><!-- /.modal-dialog -->
</div><!-- /.modal -->
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
				<li role="presentation">
				<!-- <button type="button" class="btn btn-info" onClick="javascript :history.back(-1);">返回</button> -->
				<a
					 onClick="javascript :history.back(-1);">老人基本信息</a></li>
				<li role="presentation" class="active"><a href="#">亲属信息</a></li>			 
			</ul>
		</div>
	</div>
    <br>
   <!--内容 -->
   <div>
     <!--操作按钮  -->
  	<div class="row" >
	  <div class="col-md-6">&nbsp;
		 <button type="button" class="btn btn-primary" id="addrelativesbtn">
		 	<span class="glyphicon glyphicon-plus"></span>
		 	新增
		 </button>
		 <button type="button" class="btn btn-danger" id="relatives_delete_all_btn">
		 	<span class="glyphicon glyphicon-trash" aria-hidden="true" ></span>
		 	批量删除
		 </button>
	  </div>
    </div>
     &nbsp;
    <!--亲属信息列表  -->
     <div class="row">
	  <div class="col-md-12">
	    <div class="table-responsive">
		 <table class="table table-hover table-bordered text-center">
		 	<thead id="head">
		 	</thead>
		 	<tbody id="table_data">
		 		
		 		
		 	</tbody>
		 </table>
		</div>
	  </div>
    </div>
    <!--分页信息  -->
    <div class="row" >
      <div class="col-md-7" id="page_text">
      
      </div>
	  <div class="col-md-4 col-md-offset-1" id="page_nav">

	  </div>
    </div>
  </div> 


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
			    		<td><p class="form-control-static" id="update_old_relatives_name"></p>
			    		<br><input type="radio" name="sex" value="男"  id="update_old_relatives_boy"/>男<input type="radio" name="sex" value="女"id="update_old_relatives_girl"/>女
			    		</td>
			    		<td>联系电话</td>
			    		<td><input type="text" class="form-control" id="update_old_relatives_phone" name="phone"/>
			    		</td>
			    	</tr>
			    	<tr>
			    		<td>关系</td>
			    		<td>
			    		  <select style="width:70px" id="update_old_relatives_relation" name="relation">
							<option>父子</option>
							<option>母子</option>
							<option>兄弟</option>
							<option>儿子</option>						
						  </select>
			    		</td>
			    		<td>是否同住</td>
			    		<td>
			    		  <select style="width:70px" id="update_old_relatives_islive" name="islive">
							<option>是</option>
							<option>否</option>							 						
						  </select>
			    		</td>
			    	</tr>
			    	<tr>
			    		<td>联系地址</td>
			    		<td colspan="4">
			    		<input type="text" class="form-control" id="update_old_relatives_address" name="address"/>
			    		</td>
			    		 
			    	</tr>			    	
			    </table>
			    </form>  
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
	        <button type="button" class="btn btn-primary" id="update_save_btn" >修改</button>
	      </div>
	    </div><!-- /.modal-content -->
	</div><!-- /.modal-dialog -->
</div><!-- /.modal -->
<script type="text/javascript">

   
 var totalRecord, currentNum;
		/* 分页 */
		$(function() {
			go(1,${id});
		});
		function go(pn,id) {
			$.ajax({
				url:"${APP_PATH}/rel/selectAllRelatives",
				data:{"pn":pn,"id":id},
				type:"GET",
				success : function(result) {
					if (result.code == 100) {
						//console.log(result.extend.pageInfo);
						//构建分页信息
						build_page_text(result);
						//构建分页条
						build_page_nav(result);
						//构建表格数据
						build_table_data(result);
					}
				}
			});
		}
		function build_page_text(result) {
			$("#page_text").empty();
			$("#page_text").append(
					"当前第" + result.extend.pageInfo.pageNum + "页，共"
							+ result.extend.pageInfo.pages + "页，总计"
							+ result.extend.pageInfo.total + "条记录");
			totalRecord = result.extend.pageInfo.total;
			currentNum = result.extend.pageInfo.pageNum;
		}
		//解析显示分页条信息
		function build_page_nav(result) {
			$("#page_nav").empty();
			var ul = $("<ul></ul>").addClass("pagination");
			var firstPageLi = $("<li></li>").append(
					$("<a></a>").append("首页"));
					firstPageLi.click(function(){
					go(1,${id});
					});
			var prePageLi = $("<li></li>").append(
					$("<a></a>").append("&laquo;"));
			if (result.extend.pageInfo.hasPreviousPage == false) {
				firstPageLi.addClass("disabled");
				prePageLi.addClass("disabled");
			} else {
				//为元素添加点击翻页事件
				prePageLi.click(function() {
					go(result.extend.pageInfo.pageNum - 1,${id});
				});
			}
			var nextPageLi = $("<li></li>").append(
					$("<a></a>").append("&raquo;"));
			var lastPageLi = $("<li></li>").append(
					$("<a></a>").append("末页"));
					lastPageLi.click(function(){
					go(result.extend.pageInfo.pages,${id});
					});
			if (result.extend.pageInfo.hasNextPage == false) {
				nextPageLi.addClass("disabled");
				lastPageLi.addClass("disabled");
			} else {
				//为元素添加点击翻页事件
				nextPageLi.click(function() {
					go(result.extend.pageInfo.pageNum + 1,${id});
				});
			}
			//添加首页和前一页的提示
			ul.append(firstPageLi).append(prePageLi);
			//遍历给ul中添加页码提示
			$.each(result.extend.pageInfo.navigatepageNums, function(index,
					item) {
				var numLi = $("<li></li>").append($("<a></a>").append(item));
				if (result.extend.pageInfo.pageNum == item) {
					numLi.addClass("active");
				}
				numLi.click(function() {
					go(item,${id});
				});
				ul.append(numLi);
			});
			//添加下一页和末页的提示
			ul.append(nextPageLi).append(lastPageLi);
			//把ul加到nav 
			var navEle = $("<nav></nav>").append(ul);
			navEle.appendTo("#page_nav");
		}

		function build_table_data(result) {
			$("#head").empty();
			$("#table_data").empty();
			var headTR = $("<tr></tr>");
			var checkBox = $("<td></td>").append(
					$("<input type='checkbox' id='check_item_all'/>"));

			var Td1 = $("<td></td>").append("#");
			var Td2 = $("<td></td>").append("姓名");
			var Td3 = $("<td></td>").append("性别");
			var Td4 = $("<td></td>").append("联系电话");
			var Td5 = $("<td></td>").append("与老人关系");
			var Td6 = $("<td></td>").append("是否同住");
			var Td7 = $("<td></td>").append("联系地址");
			var Td8 = $("<td></td>").append("操作");
			headTR.append(checkBox).append(Td1).append(Td2).append(Td3)
			      .append(Td4).append(Td5).append(Td6).append(Td7).append(Td8).appendTo($("#head"));

			 $.each(result.extend.pageInfo.list,function(index,item){
            var checkBoxTd=$("<td><input type='checkbox' class='check_item'/></td>");
            var olderid=$("<td></td>").append(item.id);
            var oldername=$("<td></td>").append(item.name);
            var oldersex=$("<td></td>").append(item.sex);
            var olderphone=$("<td></td>").append(item.phone);
            var olderidcar=$("<td></td>").append(item.relation);
            var olderliveinfo=$("<td></td>").append(item.islive);
            var olderservice=$("<td></td>").append(item.address);
            var editBtn=$("<button></button>").addClass("btn btn-primary btn-sm edit_btn")
				                                  .append($("<span></span>")
				                                  .addClass("glyphicon glyphicon-pencil"))
				                                  .append("编辑");
			//为编辑按钮添加一个自定义的属性，来表示当前查看老人的id
			editBtn.attr("edit-id",item.id);                                                
            var delBtn=$("<button></button>").addClass("btn btn-danger btn-sm delete_btn")
									              .append($("<span></span>")
									              .addClass("glyphicon glyphicon-trash"))
									              .append("删除");	
			
			//为删除按钮添加一个自定义的属性，来表示当前删除员工的id
			delBtn.attr("del-id",item.id);						              
		    var btnTd=$("<td></td>").append(editBtn).append(" ").append(delBtn);
		    //append方法执行完成以后还是返回原来的元素							              								              
			$("<tr></tr>").append(checkBoxTd)
				              .append(olderid)
				              .append(oldername)
				              .append(oldersex)
				              .append(olderphone)
				              .append(olderidcar)
				              .append(olderliveinfo)
				              .append(olderservice)
				              .append(btnTd)
				              .appendTo("#table_data");						              	                                  
         });
		}  
   
   
   //點擊刪除
	$(document).on("click", ".delete_btn", function() {
	      var delid=$(this).attr("del-id");
		  var oldername=$(this).parents("tr").find("td:eq(2)").text();		
		  if(confirm("确认删除【"+oldername+"】吗")){
	       $.ajax({
				url:"${APP_PATH}/rel/deleterelativesbyid/"+delid,
				type:"DELETE",
				success:function(result) {
					 go(currentNum,${id});
				}
			});
	   }
	});
   
   
  //点击保存
  $("#save_old_relaties_btn").click(function(){
	   $.ajax({
			url:"${APP_PATH}/rel/addrelatives/"+${id},
			type:"POST",
			data:$("#add_old_relative_modal form").serialize(),
			success:function(result){
				
				if(result.code==100){
					//1.关闭模态框
					$("#add_old_relative_modal").modal('hide');
					go(totalRecord,${id});
				}
			}

	  }); 

  });
   
	//完成全选、全部选功能
  $(document).on("click","#check_item_all",function(){
	  $(".check_item").prop("checked",$(this).prop("checked"));
  });
	

	   $(document).on("click",".check_item",function(){

		var flag=$(".check_item:checked").length==$(".check_item").length;
		$("#check_item_all").prop("checked",flag);
	}); 
   
	

   
   
   

    
      
   //新增家属信息按钮，弹出模态框
   $("#addrelativesbtn").click(function(){
	   $("#add_old_relative_modal").modal();
   });
 
   //编辑信息按钮，弹出模态框
  $(document).on("click",".edit_btn",function(){
	  
	  var edit=$(this).attr("edit-id");
	   //3.把老人的id传递给模态框的编辑按钮
		$("#update_save_btn").attr("edit-id",$(this).attr("edit-id"));
	  //发送请求获取
	  $.ajax({
			url:"${APP_PATH}/rel/selectrelativesbyid/"+edit,
			type:"GET",
			
			success:function(result){
				
				if(result.code==100){
					$("#update_old_relative_modal").modal();
					//console.log(result);
					var rel=result.extend.relatives;
					$("#update_old_relatives_name").text(rel.name);
					$("#update_old_relative_modal input[name=sex]").val([rel.sex]);
					$("#update_old_relatives_phone").val(rel.phone);
					$("#update_old_relative_modal select").val([rel.islive]);
					
					$("#update_old_relatives_relation").val([rel.relation]);
		
					$("#update_old_relatives_address").val(rel.address);
				}
			   }
			});

	  
	
	  
	  }); 
	  
	  
  //点击修改按钮
  $("#update_save_btn").click(function(){
	  $.ajax({
		    url:"${APP_PATH}/rel/updaterelatives/"+$(this).attr("edit-id"),
			type:"POST",
			data:$("#update_old_relative_modal form").serialize(),
		    success:function(result){
		    	if(result.code==100){
		    		$("#update_old_relative_modal").modal('hide');
					go(currentNum,${id});
		    	}
		    }
	  });
	  
	  
  });
  
//点击删除全部，就批量删除
	$("#relatives_delete_all_btn").click(function(){
		//alert();
		var empNames="";
		var del_idstr="";
		$.each($(".check_item:checked"),function(){
			//索引为2，就是第3个td.
			empNames +=$(this).parents("tr").find("td:eq(2)").text()+",";
			//alert(empNames);
		    //组装员工id字符串
			del_idstr +=$(this).parents("tr").find("td:eq(1)").text()+"-"; 
		    //alert($(this).parents("tr").find("td:eq(2)").text());
			//alert(del_idstr);
		    
		});
		
		  //去除empNames多去的逗号
		empNames=empNames.substring(0,empNames.length-1);
		//去除多余的删除员工-
		del_idstr=del_idstr.substring(0,del_idstr.length-1);
	   	 if(confirm("确认删除【"+empNames+"】吗")){
			//发送ajax请求
		  	 $.ajax({
			url:"${APP_PATH}/rel/deleterelativesall/"+del_idstr,
			type:"DELETE",
			success:function(result){
				//alert(result.msg);
				//回到当前页面
				go(currentNum,${id});
				
			}
			});  
		}    
	});
   
    
</script>
</body>
</html>
