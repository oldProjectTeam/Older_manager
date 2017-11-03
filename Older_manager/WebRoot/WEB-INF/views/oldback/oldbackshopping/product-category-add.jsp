<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>添加产品分类</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link href="${APP_PATH}/static/shop/assets/css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" href="${APP_PATH}/static/shop/css/style.css" />
<link rel="stylesheet" href="${APP_PATH}/static/shop/assets/css/ace.min.css" />
<link rel="stylesheet" href="${APP_PATH}/static/shop/assets/css/font-awesome.min.css" />
<link href="${APP_PATH}/static/shop/Widget/icheck/icheck.css" rel="stylesheet" type="text/css" />
<!--[if IE 7]>
		  <link rel="stylesheet" href="${APP_PATH}/static/shop/assets/css/font-awesome-ie7.min.css" />
		<![endif]-->
<!--[if lte IE 8]>
		  <link rel="stylesheet" href="${APP_PATH}/static/shop/assets/css/ace-ie.min.css" />
		<![endif]-->
<script src="${APP_PATH}/static/shop/js/jquery-1.9.1.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/bootstrap.min.js"></script>
<title>添加产品分类</title>
</head>

<body>
	<div class="type_style" >
		<div class="type_title">产品类型信息</div>
		<div class="type_content">
			<div class="Operate_btn">
				<a class="btn  btn-warning" id="add_btn"><i
					class="icon-edit align-top bigger-125"></i>新增子类型</a>
					<a class="btn" id="stop_add"><i id="stop_icon"
					class="align-top bigger-125"></i><span id="flag">禁用该类型</span></a><!--  禁用该类型-->
					<a class="btn  btn-danger" id="del_btn">
					  <i class="icon-trash align-top bigger-125"></i>删除该类型</a>
					
			</div>
			<!--显示类型信息及编辑表单  -->
			<form method="post" class="form form-horizontal" id="form-type-data">
				<div class="Operate_cont clearfix">
					<label class="form-label"><font color="red">*</font>分类名称：</label>
					<div class="formControls ">
						<input type="text" class="input-text" value="${productType.name}"
							id="name" name="name"  placeholder="长度不超过50个字符">
						 <span class="help-block"></span>
						 <input type="hidden" name="parentid" value="${productType.parentid}">
						<input type="hidden" name="id" value="${productType.id}" id="typeId">
					</div>
				</div>
				<div class="Operate_cont clearfix">
					<label class="form-label"><font color="red">*</font>排序：</label>
					<div class="formControls ">
						<input type="number" class="input-text" value="${productType.sort}" 
							id="sort" name="sort" placeholder="请输入排序数字">
						<span class="help-block"></span>
					</div>
				</div>
				<div class="Operate_cont clearfix">
					<label class="form-label"><font color="red">*</font>备注：</label>
					<div class="formControls">
						<textarea name="remark" rows="" class="textarea" id="remark"
							placeholder="说点什么...最少输入10个字符" datatype="*10-100"
							dragonfly="true" nullmsg="备注不能为空！"
							onKeyUp="textarealength(this,100)">${productType.remark}</textarea>			 
						<p class="textarea-numberbar">
							<em class="textarea-length">0</em>/100
							<span class="help-block" id="remark_msg"></span>
						</p>
					</div>
				</div>
				<div class="">
					<div class="" style=" text-align:center">
						<input class="btn btn-primary radius" type="button" value="确定修改" id="edit_btn">
						<br><br><font id="msg"></font>
					</div>
				</div>
			</form>
			
			<!--新增子类型表单 -->
			<form action="" method="post" class="form form-horizontal" id="add_type_form">
				
				<ul class="list-group">
				  <li class="list-group-item">
				  <input type="button" class="btn  btn-warning" value="返回" id="control_btn">
				  	 请填写类型<span class="label label-default">${productType.name}</span>的子类型信息：
				 </li>
				</ul>
				 
				<div class="Operate_cont clearfix">
					<label class="form-label"><font color="red">*</font>分类名称：</label>
					<div class="formControls ">
						<input type="text" class="input-text" placeholder="不能超过50个字符"
							 name="name" id="name1">
					    <span class="help-block"></span>
						<input type="hidden" name="parentid" id="parentid" value="${productType.id}">
						<input type="hidden" name="grade" value="${productType.grade+1}">
					</div>
				</div>
				<div class="Operate_cont clearfix">
					<label class="form-label"><font color="red">*</font>排序：</label>
					<div class="formControls ">
						<input type="number" class="input-text" placeholder="请输入排序数字"
						  name="sort" id="sort1">
						<span class="help-block"></span>
					</div>
				</div>
				<div class="Operate_cont clearfix">
					<label class="form-label"><font color="red">*</font>备注：</label>
					<div class="formControls">
						<textarea name="remark" id="remark1" rows="" class="textarea"
							placeholder="说点什么...最少输入10个字符" datatype="*10-100"
							dragonfly="true" nullmsg="备注不能为空！"
							onKeyUp="textarealength(this,100)"></textarea>
						<p class="textarea-numberbar">
							<em class="textarea-length">0</em>/100
							<span class="help-block" id="remark1_msg"></span>
						</p>
					</div>
				</div>
				<div class="">
					<div class="" style=" text-align:center">
						<input class="btn btn-primary radius" type="button" value="确定新增" id="add_childType_btn">
						<br><br><font id="add_msg"></font>
					</div>
				</div>
			</form>
			 
		</div>
	</div>
	<script type="text/javascript" src="${APP_PATH}/static/shop/Widget/icheck/jquery.icheck.min.js"></script>
	<script type="text/javascript"
		src="${APP_PATH}/static/shop/Widget/Validform/5.3.2/Validform.min.js"></script>
	<script type="text/javascript" src="${APP_PATH}/static/shop/assets/layer/layer.js"></script>
	<script type="text/javascript" src="${APP_PATH}/static/shop/js/H-ui.js"></script>
	<script type="text/javascript" src="${APP_PATH}/static/shop/js/H-ui.admin.js"></script>
	<script type="text/javascript">
		$(function() {
			$('.skin-minimal input').iCheck({
				checkboxClass : 'icheckbox-blue',
				radioClass : 'iradio-blue',
				increaseArea : '20%'
			});
			stop_btn();
			$("#add_type_form").hide();
			$("#form-type-data").Validform({
				tiptype : 2,
				callback : function(form) {
					form[0].submit();
					var index = parent.layer.getFrameIndex(window.name);
					parent.$('.btn-refresh').click();
					parent.layer.close(index);
					
				}
			});
		});
		//设置删除按钮，点击删除类型信息
		$("#del_btn").click(function(){
			var id=$("#typeId").val();
			if(id==undefined||id==''){
				alert("请先选择产品类型！");
				return false;
			}
			$.ajax({
				url:"${APP_PATH}/productType/deleteProductType",
				data:"id="+id,
				type:"POST",
				success:function(result){
					if(result.code==100){
						 alert("删除成功！"); 
						 window.location.href="Category_Manage";
					}
				}
			});
			
		});
		
		
		//初始化禁用按钮状态
		var state=0;
		function stop_btn(){
			state="${productType.state}";
			if(state==1){
				$("#flag").html("禁用该类型");
				$("#stop_icon").addClass("icon-ok");
				$("#stop_add").addClass("btn-success");
			}else{
				$("#flag").html("启用该类型"); 
				$("#stop_icon").addClass("icon-remove");
				$("#stop_add").removeClass("btn-success");
			}
		}
		
		//设置禁用按钮，修改禁用状态
		$("#stop_add").click(function(){
			var id=$("#typeId").val();
			if(id==undefined||id==''){
				alert("请先选择产品类型！");
				return false;
			}
			 
			$.ajax({
				url:"${APP_PATH}/productType/banProductType",
				data:"id="+id,
				type:"POST",
				success:function(result){
					if(result.code==100){
						 if(state==0){
							 state=1;
							$("#flag").html("禁用该类型");
							$("#stop_icon").removeClass("icon-remove");
							$("#stop_icon").addClass("icon-ok");
							$("#stop_add").addClass("btn-success");
						 }else if(state==1){
							 state=0;
							 $("#flag").html("启用该类型"); 
							 $("#stop_icon").removeClass("icon-ok");
							 $("#stop_icon").addClass("icon-remove");
							 $("#stop_add").removeClass("btn-success");
						 }
					}
				}
			});
		});
		
		//修改类型：校验类型名称是否可用
		$("#name").change(function(){
			var name=$(this).val();
			$("#name").next("span").html("");
			var id=$("#typeId").val();
			if(name==undefined||name==''||id==undefined||id==''){
				$("#name").attr("flag","fail");
				return false;
			}
			$.ajax({
				url:"${APP_PATH}/productType/update_checkName.action?name="+name+"&id="+id,
				type:"POST",
				success:function(result){
					 if(result.code!=100){
						 $("#name").next("span").css("color","red");
						 $("#name").next("span").html("此类型已存在，不可用！");
						 $("#name").attr("flag","fail");
					 }else{
						 $("#name").attr("flag","success");
						 $("#name").next("span").html("");
					 }
				 }
			});
		});
		
		//修改表单数据校验
		function vail_update_form(){
			
			var id=$("#typeId").val();
			if(id==undefined ||id==''){
				alert("此类型ID已失效，重新选择类型！");
				return false;
				
			}
			var name=$("#name").val();
			if($("#name").attr("flag")=="fail"){
				$("#name").next("span").css("color","red");
				$("#name").next("span").html("和其它类型冲突，不可用！");
				return false;
			}
			if(name==undefined ||name==''||name.length>50){
				$("#name").next("span").css("color","red");
				$("#name").next("span").html("分类名称不能为空或长度不能超过50！");
				return false;
			}else{
				$("#name").next("span").html("");
			}
			var sort=$("#sort").val();
			var regx=/^([\d.]{1,2})$/;
			if(!regx.test(sort)){
				$("#sort").next("span").css("color","red");
				$("#sort").next("span").html("排序不能为空！");
				return false;
			}else{
				$("#sort").next("span").html("");
			}
			var remark=$("#remark").val();
			if(remark.length==undefined||remark==''){
				$("#remark_msg").css("color","red");
				$("#remark_msg").html("备注不能为空！");
				return false;
			}else if(remark.length<10){
				$("#remark_msg").css("color","red");
				$("#remark_msg").html("备注至少输入10个字符！");
				return false;
			}else if(remark.length>100){
				$("#remark_msg").css("color","red");
				$("#remark_msg").html("备注不能超过100个字符！");
				return false;
			}else{
				$("#remark_msg").html("");
			}
			return true;
		}
		
		//修改保存按钮
		$("#edit_btn").click(function(){
			var id=$("#typeId").val();
			$("#msg").html("");
			if(id==undefined ||id==''){
				$("#msg").css("color","red");
				$("#msg").html("请先选择产品类型！");
				return false;
			}
			//校验表单数据合法性
			if(!vail_update_form()){
				return false;
			}		
			$.ajax({
				url:"${APP_PATH}/productType/updateProductType",
				data:$("#form-type-data").serialize(),
				type:"POST",
				success:function(result){
					if(result.code==100){
						$("#msg").css("color","green");
						$("#msg").html("修改成功！");
					}else{
						$("#msg").css("color","red");
						$("#msg").html("修改失败！");
					}
				}
			});
		});
		
		//新增子类型：校验类型名称是否可用
		$("#name1").change(function(){
			var name=$(this).val();
			$("#name1").next("span").html("");
			if(name==undefined||name==''){
				$("#name1").attr("flag","fail");
				return false;
			}
			$.ajax({
				url:"${APP_PATH}/productType/add_checkName.action?name="+name,
				type:"POST",
				success:function(result){
					 if(result.code!=100){
						 $("#name1").next("span").css("color","red");
						 $("#name1").next("span").html("此类型已存在，不可用！");
						 $("#name1").attr("flag","fail");
					 }else{
						 $("#name1").attr("flag","success");
						 $("#name1").next("span").html("");
					 }
				 }
			});
		})
		//新增子类型表单数据校验
		function vail_add_form(){
			var pId=$("#parentid").val();
			if(pId==undefined ||pId==''){
				 alert("产品父类型Id失效,请重新选择类型！");
				return false;
			}
			var name=$("#name1").val();
			if($("#name1").attr("flag")=="fail"){
				$("#name1").next("span").css("color","red");
				$("#name1").next("span").html("此类型已存在，不可用！");
				return false;
			}
			if(name==undefined ||name==''||name.length>50){
				$("#name1").next("span").css("color","red");
				$("#name1").next("span").html("分类名称不能为空或长度不能超过50！");
				return false;
			}else{
				$("#name1").next("span").html("");
			}
			var sort=$("#sort1").val();
			var regx=/^([\d.]{1,2})$/;
			if(!regx.test(sort)){
				$("#sort1").next("span").css("color","red");
				$("#sort1").next("span").html("排序不能为空！");
				return false;
			}else{
				$("#sort1").next("span").html("");
			}
			var remark=$("#remark1").val();
			if(remark.length==undefined||remark==''){
				$("#remark1_msg").css("color","red");
				$("#remark1_msg").html("备注不能为空！");
				return false;
			}else if(remark.length<10){
				$("#remark1_msg").css("color","red");
				$("#remark1_msg").html("备注至少输入10个字符！");
				return false;
			}else if(remark.length>100){
				$("#remark1_msg").css("color","red");
				$("#remark1_msg").html("备注不能超过100个字符！");
				return false;
			}else{
				$("#remark1_msg").html("");
			}
			return true;
		}
		//新增子类型保存按钮
		$("#add_childType_btn").click(function(){
			$("#add_msg").html("");
			 if(!vail_add_form()){
				 return false;
			 }
			$.ajax({
				url:"${APP_PATH}/productType/insertProductType",
				data:$("#add_type_form").serialize(),
				type:"POST",
				success:function(result){
					if(result.code==100){
						$("#add_msg").css("color","green");
						$("#add_msg").html("新增子类型成功！");
						$("#add_type_form")[0].reset();
					}else{
						$("#add_msg").css("color","red");
						$("#add_msg").html("新增子类型失败！");
						 
					}
				}
			});
		});
		
		//新增子类型按钮
		$("#add_btn").click(function(){
			var pId=$("#parentid").val();
			if(pId==undefined ||pId==''){
				alert("请先选择产品类型！");
				return false;
			}
			
			$("#form-type-data").hide();
			$("#add_type_form").show();
		});
		//返回按钮
		$("#control_btn").click(function(){
			$("#add_type_form").hide();
			$("#form-type-data").show();
		});
	</script>
</body>
</html>
