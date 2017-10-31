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
	<script type="text/javascript" src="${APP_PATH}/static/js/upload1.js"></script>
</head>

<body style="margin: 15px;">
	<!--路劲导航  -->
	<div>
		<div class="row">
			<div class="col-md-12">
				<ol class="breadcrumb">
					<li><b>位置：<a
							href="${APP_PATH}/oldmanaccount/accountManageindex">老人账户管理</a></b></li>
					<li class="active">老人礼品管理</li>
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
				<button type="button" class="btn btn-primary" id="add_gift_btn">
					<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
					新增礼品
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
				<form class="form-inline" action="${APP_PATH}/giftmanagement/queryAllGift.action" method="post">
					<div class="form-group">
						&nbsp;&nbsp;<label>礼品名称</label> <input type="text"
							class="form-control" name="giftname" placeholder="请输入礼品名称">
					</div>
					<div class="form-group">
						<label>礼品编号</label> <input type="text"  name="giftnumber" class="form-control"
							placeholder="请输入礼品编号">
					</div>
					<div class="form-group">
						<label>礼品状态</label> <select class="form-control" name="giftstate">
							<option value="">请选择</option>
							<option value="上架">上架</option>
							<option value="下架">下架</option>
						</select>
					</div>
					<button type="submit" class="btn btn-default">
						<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
						查询
					</button>
				</form>
			</div>
		</div>
		<br>
		<!--礼品信息列表  -->
		<div class="row">
			<div class="col-md-12">
				<div class="table-responsive">
					<table class="table table-hover table-bordered text-center">
						<thead>
							<tr class="text-center">
								<td><input type="checkbox" id='gift_all_check'></td>
								<td>#</td>
								<td>礼品名称</td>
								<td>礼品编号</td>
								<td>礼品类型</td>
								<td>礼品状态</td>
								<td>礼品单位</td>
								<td>礼品单价（元）</td>
								<td>所需积分</td>
								<td>库存数量</td>
								<td>兑换数量</td>
								<td>操作</td>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${pageInfo.list}" var="g">
								<tr>
								<td class="text-center"><input type="checkbox"
									class="gift_item_check"></td>
								<td>${g.id }</td>
								<td>${g.giftname }</td>
								<td>${g.giftnumber }</td>
								<td>${g.gifttype }</td>
								<td>${g.giftstate }</td>
								<td>${g.giftunit }</td>
								<td>${g.giftprice }</td>
								<td>${g.integral }</td>
								<td>${g.inventory }</td>
								<td>${g.lowernumber}</td>
								<td>
									<button type="button"
										class="btn btn-success btn-sm gift_update_btn">
										<span class="glyphicon glyphicon-pencil " aria-hidden="true"></span>
										修改
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
					    	  <a href="${APP_PATH}/giftmanagement/queryAllGift.action?pn=${1}">首页</a>
					    	</li>
					    	<li> 
					    	   <a href="${APP_PATH}/giftmanagement/queryAllGift.action?pn=${pageInfo.pageNum-1}">
					           <span aria-hidden="true">&laquo;</span></a>
					        </li>
					    </c:if>		    
					    <c:forEach items="${pageInfo.navigatepageNums}" var="p">
					       <c:if test="${p==pageInfo.pageNum}">
					       		<li class="active">
					       		<a href="${APP_PATH}/giftmanagement/queryAllGift.action?pn=${pageInfo.pageNum}">${p}</a></li>
					       </c:if>
					       <c:if test="${p!=pageInfo.pageNum}">
					       		<li><a href="${APP_PATH}/giftmanagement/queryAllGift.action?pn=${p}">${p}</a></li>
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
					         <a href="${APP_PATH}/giftmanagement/queryAllGift.action?pn=${pageInfo.pageNum+1}" aria-label="Next">
					         <span aria-hidden="true">&raquo;</span></a>
					      </li>
					      <li>
					        <a href="${APP_PATH}/giftmanagement/queryAllGift.action?pn=${pageInfo.pages}">末页</a>
					       </li>
					    </c:if>		
					</ul>
				</nav>
			</div>
		</div>
	</div>

	<!--新增礼品模态框  -->
	<div class="modal fade" tabindex="-1" role="dialog" id="add_gift_modal">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">新增礼品信息</h4>
				</div>
				<div class="modal-body">
				 <form id="add_gift_form">
					<table class="table-striped table-bordered text-center">
						<tr>
							<td class="col-xs-2">礼品名称</td>
							<td>
							 <input type="text" name="giftname" class="form-control" required="required">
							 </td>
							<td rowspan="7" class="col-xs-7">
								<input class="btn btn-default" type="file" id="photofile" onchange="showPic()">
								<input class="btn btn-primary" type="button" value="上传图片" onclick="uploadFile()">&nbsp;<br>
								<div class="col-md-8 col-md-offset-2" id="imgDiv">
				   	  		   		<div class="progress" id="parent">
								  		<div id="son" class="progress-bar progress-bar-success progress-bar-striped" 
								  		 role="progressbar" aria-valuenow="40" aria-valuemin="0" 
								  		 aria-valuemax="100" style="width: 100%">
								    	<span class="sr-only"></span>
								   	</div>
									</div>
								</div>
			   	  		        <img class="img-rounded" id="img" width="150px" height="145px">
							</td>
						</tr>
						 
						<tr>
							<td>礼品类型</td>
							<td><input type="text" name="gifttype" class="form-control"
								required="required"></td>
						</tr>
						<tr>
							<td>礼品状态</td>
							<td>
							 <select class="form-control" name="giftstate">
									<option value="下架">下架</option>
									<option value="上架">上架</option>
							 </select>
							</td>
						</tr>
						<tr>
							<td>礼品单位</td>
							<td>
							  <input type="text" name="giftunit" class="form-control" required="required">
							</td>
						</tr>
						<tr>
							<td>礼品单价</td>
							<td>
							  <input type="text" name="giftprice" class="form-control" required="required">
							</td>
						</tr>
						<tr>
							<td>所需积分</td>
							<td>
							  <input type="number" name="integral" class="form-control" required="required"></td>
						</tr>
						<tr>
							<td>库存数量</td>
							<td>
							  <input type="number" name="inventory" class="form-control" required="required">
							  <input type="hidden" name="lowernumber" value="0" class="form-control" required="required">
							 </td>
						</tr>
						 
						<tr id="tr8">
							<td>备注</td>
							<td colspan="2">
							  <textarea class="form-control" rows="2" name="remake"
									required="required"></textarea>
							 </td>
						</tr>
					</table>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal" id="add_gift_close_btn">关闭</button>
					<button type="button" class="btn btn-primary" id="add_gift_save_btn">保存</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<!-- /.modal -->

	<!--修改礼品模态框  -->
	<div class="modal fade" tabindex="-1" role="dialog"
		id="update_gift_modal">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">修改礼品信息</h4>
				</div>
				<div class="modal-body">
				 <form id="update_gift_form">
					<table class="table-striped table-bordered text-center">
						<tr>
							<td class="col-xs-2">礼品名称</td>
							<td>
							  <input type="text" class="form-control" name="giftname" id="giftname"
								required="required">
							</td>
							<td rowspan="9" class="col-xs-7">
							   <input class="btn btn-default" type="file" id="photofile1" onchange="showPic1()">
								<input class="btn btn-primary" type="button" value="上传图片" onclick="uploadFile1()">&nbsp;<br>
								<div class="col-md-8 col-md-offset-2" id="imgDiv1">
				   	  		   		<div class="progress" id="parent1">
								  		<div id="son1" class="progress-bar progress-bar-success progress-bar-striped" 
								  		 role="progressbar" aria-valuenow="40" aria-valuemin="0" 
								  		 aria-valuemax="100" style="width: 100%">
								    	<span class="sr-only"></span>
								   	</div>
									</div>
								</div>
			   	  		        <img class="img-rounded" id="img1" width="150px" height="145px">
							</td>
						</tr>
						<tr>
							<td>礼品编号</td>
							<td id="giftnumber"></td>
						</tr>
						<tr>
							<td>礼品类型</td>
							<td>
							 <input type="text" class="form-control" id="gifttype" name="gifttype"
								required="required">
							</td>
						</tr>
						<tr>
							<td>礼品状态</td>
							<td><select class="form-control" name="giftstate">
									<option value="下架">下架</option>
									<option value="上架">上架</option>
							</select></td>
						</tr>
						<tr>
							<td>礼品单位</td>
							<td>
							 <input type="text" class="form-control" name="giftunit" id="giftunit"
								required="required">
							</td>
						</tr>
						<tr>
							<td>礼品单价</td>
							<td><input type="text" class="form-control" name="giftprice" id="giftprice"
								required="required"></td>
						</tr>
						<tr>
							<td>所需积分</td>
							<td><input type="number" class="form-control" name="integral" id="integral"
								required="required">
								</td>
						</tr>
						<tr>
							<td>库存数量</td>
							<td><input type="number" class="form-control" name="inventory" id="inventory"
								required="required">
							</td>
						</tr>
						<tr>
							<td>兑换数量</td>
							<td><input type="text" class="form-control" name="lowernumber" id="lowernumber"
								required="required">
							</td>
						</tr>
						<tr id="tr10">
							<td>备注</td>
							<td colspan="2">
							   <textarea class="form-control" rows="2" name="remake" id="remake"
									required="required"></textarea>
								<input type="hidden"  name="id" id="giftId">
							</td>
						</tr>
					</table>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal" id="update_close_btn">关闭</button>
					<button type="button" class="btn btn-primary" id="update_gift_btn">修改</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<!-- /.modal -->
	<script type="text/javascript">
		var pages="${pageInfo.pages}";
		var currentPage="${pageInfo.pageNum}";
		//显示信息全选
		$("#gift_all_check").click(function() {
			$(".gift_item_check").prop("checked", $(this).prop("checked"));
		});
        $(document).on("click",".gift_item_check",function(){
        	var flag=$(".gift_item_check:checked").length==$(".gift_item_check").length;
        	$("#gift_all_check").prop("checked",flag);
        });
        
		//新增按钮
		$("#add_gift_btn").click(function() {
			//清空表单
			$("#add_gift_form")[0].reset();
			//1.删除图片文本框
			var isImg=$("#image").val();
		    if(isImg!=undefined&&isImg!=''){//将图片文本框组建删除
		    	$("#image").remove();
		    }
		    $("#img").removeAttr("src");
		    //2.隐藏进度条
		    $("#imgDiv").hide();
		    //3.清空图片文件域
			 var file = $("#photofile") ;
			 file.after(file.clone().val(""));      
			 file.remove();
			 //4.显示新增模态框
			$("#add_gift_modal").modal({
				backdrop : "static"
			});
		});
		
		//新增礼品保存按钮
		$("#add_gift_save_btn").click(function(){
			
			$.ajax({
				url:"${APP_PATH}/giftmanagement/insertGift",
				data:$("#add_gift_form").serialize(),
				type:"POST",
				success:function(result){
					if(result.code==100){
						var isImg=$("#image").val();
					    if(isImg!=undefined&&isImg!=''){//将图片文本框组建删除
					    	$("#image").remove();
					    }
					    window.location.href="${APP_PATH}/giftmanagement/queryAllGift.action?pn="+pages+1;
						alert("添加成功！");
					}else{
						var isImg=$("#image").val();
					    if(isImg!=undefined&&isImg!=''){//如果图片已上传，那么关闭之前将图片删除
					    	$("#image").remove();
					    	removeImg(isImg);
					    }
					    alert("添加失败！");
					}
					$("#add_gift_modal").modal('hide');
						 
				}
			});
		});
		//修改按钮,加载数据，弹出模态框
		$(document).on("click",".gift_update_btn",function(){
			
			//1.删除图片文本框
			var isImg=$("#image1").val();
		    if(isImg!=undefined&&isImg!=''){//将图片文本框组建删除
		    	$("#image1").remove();
		    }
		    //2.隐藏进度条
		    $("#imgDiv1").hide();
		    //3.清空图片文件域
			 var file = $("#photofile1") ;
			 file.after(file.clone().val(""));      
			 file.remove();
			
			
			//3.加载数据
			var id=$(this).parents("tr").find("td:eq(1)").text();
			$.ajax({
				url:"${APP_PATH}/giftmanagement/findGift.action?id="+id,
				type:"POST",
				success:function(result){
					var g=result.extend.giftmanagement;
					$("#giftId").val(g.id);
					$("#giftname").val(g.giftname);
					$("#giftnumber").html(g.giftnumber);
					$("#gifttype").val(g.gifttype);
					$("#giftstate").val([g.giftstate]);
					$("#giftunit").val(g.giftunit);
					$("#giftprice").val(g.giftprice);
					$("#integral").val(g.integral);
					$("#inventory").val(g.inventory);
					$("#lowernumber").val(g.lowernumber);
					$("#remake").val(g.remake);
					if(g.image!=null&&g.image!=''){
						$("#img1").attr("src","${APP_PATH}/upload/oldmanback/accountmanage/giftmanage/"+g.image);
					}else{
						$("#img1").removeAttr("src");
					}
				}
			});
			//4.弹出模态框
			$("#update_gift_modal").modal({
				backdrop : "static"
			});
			
		});
		
		//修改模态框，保存按钮
		 $("#update_gift_btn").click(function(){
			 $.ajax({
				 url:"${APP_PATH}/giftmanagement/updateGift",
				 type:"POST",
				 data:$("#update_gift_form").serialize(),
				 success:function(result){
					 if(result.code==100){
						 var isImg=$("#image1").val();
						    if(isImg!=undefined&&isImg!=''){//如果图片已上传，那么关闭之前将图片文本删除
						    	$("#image1").remove();  	 
						    }
						 window.location.href="${APP_PATH}/giftmanagement/queryAllGift.action?pn="+currentPage;
						 alert("修改成功！");
					 }else{
						 var isImg=$("#image1").val();
						    if(isImg!=undefined&&isImg!=''){//如果图片已上传，那么关闭之前将图片删除
						    	$("#image1").remove();
						    	removeImg(isImg);
						    }
						 alert("修改失败！");
					 }
					 $("#update_gift_modal").modal('hide');
				 }
			 });
		 });
		
		//修改模态框，关闭按钮
		$("#update_close_btn").click(function(){
			var isImg=$("#image1").val();
		    if(isImg!=undefined&&isImg!=''){//如果图片已上传，那么关闭之前将图片删除，以免占用空间
		    	$("#image1").remove();
		    	removeImg(isImg);
		    }
		});
		
		
		//单选删除按钮
		   $(document).on("click",".del_btn",function(){
			   var id=$(this).parents("tr").find("td:eq(1)").text();
			   var name=$(this).parents("tr").find("td:eq(2)").text();
			   if(!confirm("您确定要删除礼品【"+name+"】吗？")){
				   return false;
			   }else{
				   $.ajax({
					   url:"${APP_PATH}/giftmanagement/deleteGift/"+id,
					   type:"delete",
					   success:function(result){
						   if(result.code==100){
							   alert("删除成功！");
							   window.location.href="${APP_PATH}/giftmanagement/queryAllGift.action?pn=1";
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
			   $.each($(".gift_item_check:checked"),function(){
				   oldManStr+=$(this).parents("tr").find("td:eq(2)").text()+",";
				   Ids_str+=$(this).parents("tr").find("td:eq(1)").text()+"-";
			   });
			   oldManStr=oldManStr.substring(0,oldManStr.length-1);
			   Ids_str=Ids_str.substring(0,Ids_str.length-1);
			   if(Ids_str.length<1){
				   alert("您还没选中要删除的记录！");
				   return false;
			   }
			   if(!confirm("您确定要删除礼品【"+oldManStr+"】吗？")){
				   return false;
			   }
			   
			   $.ajax({
				   url:"${APP_PATH}/giftmanagement/deleteGift/"+Ids_str,
				   type:"delete",
				   success:function(result){
					   if(result.code==100){
						   alert("删除成功！");
						   window.location.href="${APP_PATH}/giftmanagement/queryAllGift.action?pn=1";
					   }else{
						   alert("删除失败，请再重试一遍吧！");
					   }	
				   }
			   });
		   });
		   
		   //新增模态框，关闭按钮，判断是否有图片上传，有则删除掉
		   $("#add_gift_close_btn").click(function(){
				 
				var isImg=$("#image").val();
			    if(isImg!=undefined&&isImg!=''){//如果图片已上传，那么关闭之前将图片删除，以免占用空间
			    	$("#image").remove();
			    	removeImg(isImg);
			    }
		 });
	</script>
	
</body>
</html>
