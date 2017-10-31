<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta name="keywords" content="keyword1,keyword2,keyword3">
<meta name="description" content="this is my page">
<meta name="content-type" content="text/html; charset=UTF-8">

<!-- 引入jquery -->
<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery-3.2.1.min.js"></script>
<!-- 引入样式 -->
<link
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>

<body style="margin: 15px;">
	<!--路劲导航  -->
	<div>
		<div class="row">
			<div class="col-md-12">
				<ol class="breadcrumb">
					<li><b>位置：<a
							href="${APP_PATH}/oldmanaccount/accountManageindex">老人账户管理</a></b></li>
					<li class="active">老人账户列表</li>
				</ol>
			</div>
		</div>
	</div>
	<!--内容 -->
	<div>
		<!--操作按钮  -->
		<div class="row">
			<div class="col-md-6">
				&nbsp;
				<button type="button" class="btn btn-primary"
					id="add_old_account_btn">
					<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
					新增
				</button>
				<button type="button" class="btn btn-danger" id="batch_del_btn">
					<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
					批量删除
				</button>
			</div>
		</div>
		<!--条件查询  -->
		<div class="row" style="margin-top:5px">
			<div class="col-md-12">
				<form class="form-inline" action="${APP_PATH}/oldmanaccount/queryAllAccount.action" method="post">
					<div class="form-group">
						&nbsp;&nbsp;<label for="exampleInputName2">老人名字</label> 
						<input type="text" class="form-control" name="oldman.name" placeholder="请输入老人名字">
					</div>
					<div class="form-group">
						<label for="exampleInputEmail2">登录账户</label>
						<input type="text" class="form-control" name="account" placeholder="请输入登录账户">
					</div>
					<button type="submit" class="btn btn-default">
						<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
						查询
					</button>
				</form>
			</div>
		</div>
		<br>
		<!--账户信息列表  -->
		<div class="row">
			<div class="col-md-12">
				<div class="table-responsive">
					<table class="table table-hover table-bordered text-center">
						<thead>
							<tr class="text-center">
								<td><input type="checkbox" id='check_item_all'></td>
								<td>#</td>
								<td>老人姓名</td>
								<td>登录账户</td>
								<td>最近登录时间</td>
								<td>最近登录IP</td>
								<td>服务状态</td>
								<td>登录次数</td>
								<td>操作</td>
							</tr>
						</thead>
						<tbody>
						 <c:forEach items="${pageInfo.list}" var="ac">
						 	<tr>
								<td class="text-center"><input type="checkbox"
									class="item_check"></td>
								<td>${ac.id }</td>
								<td>${ac.oldman.name }</td>
								<td>${ac.account }</td>
								<td>${ac.logintime}</td>
								<td>${ac.loginip}</td>
								<td>${ac.oldman.servicestatu }</td>
								<td>${ac.logincount}</td>
								<td>
									<button type="button" class="btn btn-success btn-sm psrest_btn">
										<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
										密码重置
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
		<div class="row">
			<div class="col-md-7">&nbsp;&nbsp;当前第${pageInfo.pageNum }页，共${pageInfo.pages}页，总计${pageInfo.total}条记录</div>
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
					    	  <a href="${APP_PATH}/oldmanaccount/queryAllAccount.action?pn=${1}">首页</a>
					    	</li>
					    	<li> 
					    	   <a href="${APP_PATH}/oldmanaccount/queryAllAccount.action?pn=${pageInfo.pageNum-1}">
					           <span aria-hidden="true">&laquo;</span></a>
					        </li>
					    </c:if>		    
					    <c:forEach items="${pageInfo.navigatepageNums}" var="p">
					       <c:if test="${p==pageInfo.pageNum}">
					       		<li class="active"><a href="${APP_PATH}/oldmanaccount/queryAllAccount.action?pn=${pageInfo.pageNum}">${p}</a></li>
					       </c:if>
					       <c:if test="${p!=pageInfo.pageNum}">
					       		<li><a href="${APP_PATH}/oldmanaccount/queryAllAccount.action?pn=${p}">${p}</a></li>
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
					         <a href="${APP_PATH}/oldmanaccount/queryAllAccount.action?pn=${pageInfo.pageNum+1}" aria-label="Next">
					         <span aria-hidden="true">&raquo;</span></a>
					      </li>
					      <li>
					        <a href="${APP_PATH}/oldmanaccount/queryAllAccount.action?pn=${pageInfo.pages}">末页</a>
					       </li>
					    </c:if>		
					</ul>
				</nav>
			</div>
		</div>
	</div>

	<!--新增账户模态框  -->
	<div class="modal fade" tabindex="-1" role="dialog"
		id="add_old_account_modal">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">新增老人账户</h4>
				</div>
				<div class="modal-body">
					<table class="table table-striped table-bordered text-center" id="add_oldman_table">
						<tr>
							<td colspan="5">
								<form class="form-inline" id="addacount_form">
									<div class="form-group">
										&nbsp;&nbsp;<label for="exampleInputName2">老人姓名</label> 
										<input type="text" name="name" class="form-control" placeholder="请输入老人姓名">
									</div>
									<button type="button" class="btn btn-default" id="search_oldman_btn">
										<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
										查询
									</button>
								</form>
							</td>
						</tr>
						
						<tr>
							<td><input type="checkbox" id="add_all_check"></td>
							<td>老人姓名</td>
							<td>联系电话</td>
							<td>所属服务点</td>
							<td>默认密码</td>
						</tr>
						<tbody id="add_oldman_table_body"></tbody>
					</table>
					<nav aria-label="Page navigation">
						<ul class="pager" id="navUl">						  
						  	
						</ul>
					</nav>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" id="add_account_btn">确定</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<!-- /.modal -->
	<script type="text/javascript">
	    //新增模态框信息最后一页
		var pages="";
		//显示信息全选
		$("#check_item_all").click(function() {
			$(".item_check").prop("checked", $(this).prop("checked"));
		});
		$(document).on("click",".item_check",function(){
			var flag=$(".item_check:checked").length==$(".item_check").length;
			$("#check_item_all").prop("checked",flag);
		});
		
		//单选删除按钮
		   $(document).on("click",".del_btn",function(){
			   var id=$(this).parents("tr").find("td:eq(1)").text();
			   var name=$(this).parents("tr").find("td:eq(2)").text();
			   if(!confirm("您确定要删除老人【"+name+"】的账户信息吗？")){
				   return false;
			   }else{
				   $.ajax({
					   url:"${APP_PATH}/oldmanaccount/deleteAccount/"+id,
					   type:"delete",
					   success:function(result){
						   if(result.code==100){
							   alert("删除成功！");
							   window.location.href="${APP_PATH}/oldmanaccount/queryAllAccount.action?pn=1";
						   }else{
							   alert("删除失败，请再重试一遍吧！");
						   }		   
					   }
					   
				   });
			   }
		   });
		   
		   //批量删除按钮
		   $("#batch_del_btn").click(function(){
			   var oldManStr="";
			   var Ids_str="";
			   $.each($(".item_check:checked"),function(){
				   oldManStr+=$(this).parents("tr").find("td:eq(2)").text()+",";
				   Ids_str+=$(this).parents("tr").find("td:eq(1)").text()+"-";
			   });
			   oldManStr=oldManStr.substring(0,oldManStr.length-1);
			   Ids_str=Ids_str.substring(0,Ids_str.length-1);
			   if(Ids_str.length<1){
				   alert("您还没选中要删除的记录！");
				   return false;
			   }
			   if(!confirm("您确定要删除老人【"+oldManStr+"】的账户信息吗？")){
				   return false;
			   }
			   
			   $.ajax({
				   url:"${APP_PATH}/oldmanaccount/deleteAccount/"+Ids_str,
				   type:"delete",
				   success:function(result){
					   if(result.code==100){
						   alert("删除成功！");
						   window.location.href="${APP_PATH}/oldmanaccount/queryAllAccount.action?pn=1";
					   }else{
						   alert("删除失败，请再重试一遍吧！");
					   }	
				   }
			   });
		   });
		
		$(document).on("click",".psrest_btn",function(){
			var id=$(this).parents("tr").find("td:eq(1)").text();
			$.ajax({
				url:"${APP_PATH}/oldmanaccount/psReset/"+id,
				type:"POST",
				success:function(result){
					if(result.code==100){
						alert("重置成功！");
					}else{
						alert("重置失败，请再重试一遍！");
					}
				}
			});
		});
		
		
		//新增账户全选
		$("#add_all_check").click(function() {
			$(".add_item_check").prop("checked", $(this).prop("checked"));
		});
		$(document).on("click",".add_item_check",function(){
			var flag=$(".add_item_check:checked").length==$(".add_item_check").length;
			$("#add_all_check").prop("checked",flag);
		});

		//构建模态框老人表格
		function build_oldman_table(result){
			//清空表格
			$("#add_oldman_table_body").empty();
			var oldmans=result.extend.pageInfo.list;				 
			$.each(oldmans,function(index,items){
				var tr=$("<tr></tr>");
				var td1=$("<td></td>");
				var input=$("<input type='checkbox' class='add_item_check'>");
				input.attr("id",items.id);
				td1.append(input);
				var td2=$("<td></td>");
				td2.html(items.name);
				var td3=$("<td></td>"); 
				td3.html(items.phone);
				var td4=$("<td></td>");
				td4.html(items.service);
				var td5=$("<td>123456</td>");
				tr.append(td1).append(td2).append(td3).append(td4).append(td5).appendTo($("#add_oldman_table_body"));
			});	
		}
		//构建模态框分页信息
		function build_nav_page(result){
			//构建之前先清空分页
			 $("#navUl").empty();
			
			var li1=$("<li class='previous'></li>").append($("<a></a>")
					.append($("<span>&larr;</span>").attr("aria-hidden","true")).append("上一页"));
			var li2=$("<li class='next'></li>").append($("<a></a>")
					.append($("<span>&rarr;</span>").attr("aria-hidden","true")).append("下一页"));
			if(result.extend.pageInfo.hasPreviousPage==false){
				li1.addClass("disabled");
			}else{
				li1.click(function(){
					addAccount_to_page(result.extend.pageInfo.pageNum-1)
				});
			}
			if(result.extend.pageInfo.hasNextPage==false){
				li2.addClass("disabled");
			}else{
				li2.click(function(){
					addAccount_to_page(result.extend.pageInfo.pageNum+1)
				});
			}
			$("#navUl").append(li1).append(li2);
		}
		
		//新增模态框，去哪页
		function addAccount_to_page(pn){
			$.ajax({
				url:"${APP_PATH}/oldmanaccount/selectOldManNotAccount.action",
				type:"post",
				data:"pn="+pn,
				success:function(result){
					pages=result.extend.pageInfo.pages;
					if(result.code==100){
						//显示老人信息
						build_oldman_table(result);	
						build_nav_page(result);
					}else{
						alert("查询失败，请重试！");
					}	
				}
			}); 
		}
		
		//新增账户模态框查询老人按钮
		$("#search_oldman_btn").click(function(){
			$.ajax({
				url:"${APP_PATH}/oldmanaccount/selectOldManNotAccount.action",
				type:"post",
				data:$("#addacount_form").serialize(),
				success:function(result){
					if(result.code==100){
						//显示老人信息
						build_oldman_table(result);	
						build_nav_page(result);
					}else{
						alert("查询失败，请重试！");
					}	
				}
			}); 
		});
		
		//新增账户按钮
		$("#add_old_account_btn").click(function() {
			//1.弹出模态框
			$("#add_old_account_modal").modal({
				backdrop : "static"
			});
			 //2加载数据
			addAccount_to_page(1); 
		});
		
		//新增账户保存按钮
		$("#add_account_btn").click(function(){
			var ids="";
			$.each($(".add_item_check:checked"),function(){
				ids+=$(this).attr("id")+"-";
			});
			ids=ids.substring(0,ids.length-1);
			if(ids.length<1){
				alert("您还没选择要添加的老人！");
				return false;
			}
			$.ajax({
				url:"${APP_PATH}/oldmanaccount/batchAddAcount.action?ids="+ids,
				type:"POST",
				success:function(result){
					if(result.code==100){
						window.location.href="${APP_PATH}/oldmanaccount/queryAllAccount.action?pn=1";
						alert("添加成功！");
					}else{
						alert("添加失败，再重试一遍吧！");
					}
					//1.关闭模态框
					$("#add_old_account_modal").modal('hide');
				}
			});
		});
		
		
		
	</script>
</body>
</html>
