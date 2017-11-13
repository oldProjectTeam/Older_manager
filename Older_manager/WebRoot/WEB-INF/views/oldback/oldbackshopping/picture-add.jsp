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

<title>添加产品</title>

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
<!--[if lt IE 9]>
<script type="text/javascript" src="${APP_PATH}/static/shop/js/html5.js"></script>
<script type="text/javascript" src="${APP_PATH}/static/shop/js/respond.min.js"></script>
<script type="text/javascript" src="${APP_PATH}/static/shop/js/PIE_IE678.js"></script>
<![endif]-->
<link href="${APP_PATH}/static/shop/assets/css/bootstrap.min.css"
	rel="stylesheet" />
<link rel="stylesheet" href="${APP_PATH}/static/shop/css/style.css" />
<link href="${APP_PATH}/static/shop/assets/css/codemirror.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="${APP_PATH}/static/shop/assets/css/ace.min.css" />
<link rel="stylesheet"
	href="${APP_PATH}/static/shop/Widget/zTree/css/zTreeStyle/zTreeStyle.css"
	type="text/css">
<link rel="stylesheet"
	href="${APP_PATH}/static/shop/assets/css/font-awesome.min.css" />
<!--[if IE 7]>
		  <link rel="stylesheet" href="${APP_PATH}/static/shop/assets/css/font-awesome-ie7.min.css" />
		<![endif]-->
<link href="${APP_PATH}/static/shop/Widget/icheck/icheck.css"
	rel="stylesheet" type="text/css" />
<link
	href="${APP_PATH}/static/shop/Widget/webuploader/0.1.5/webuploader.css"
	rel="stylesheet" type="text/css" />
	<link href="${APP_PATH}/static/shop/assets/css/bootstrap.min.css"
	rel="stylesheet" />
</head>
<body>

	<!--选择品牌模态框开始  -->
    <div class="modal fade" tabindex="-1" role="dialog" id="choose_brand_modal">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title">选择品牌</h4>
	      </div>
	      <div class="modal-body">
	          <div class="row">
	          		<div class="col-md-10 col-md-offset-1">
	          			<table class="table text-center table-hover table-bordered">
	          			     <tr>
	          				 	<td colspan="4">
	          				 	<form class="form-inline" id="modal_search_form">
								  <div class="form-group">
								    <label for="exampleInputEmail2">品牌名称</label>
								    <input type="text" class="input-text" name="name">
								  </div>
								  <button type="button" class="btn btn-default btn-sm" id="modal_search_btn">
								  <span class="icon-search" aria-hidden="true"></span>
								  搜索</button>
								</form>	          				 	
	          				 	</td> 
	          				 </tr>	 
	          				 <tr>
	          				 	<td>品牌编号</td>
	          				 	<td>品牌名称</td>
	          				 	<td>所属地区/国家</td>
	          				 	<td>操作</td>
	          				 </tr>
	          				 <tbody id="modal_table_tbody">
	          				    
	          				 </tbody>
  						</table>
	          		</div>
	          </div>
	          <!--分页信息  -->
	          <div class="row">
	          	<div class="col-md-10 col-md-offset-1" id="page_info">	          	           
	          	</div>
	          </div>
	          <div class="row">
	          	<div class="col-md-10 col-md-offset-1">
          	      <nav aria-label="Page navigation" style="float:right">
          	        <ul class="pagination pagination-sm" id="modal_nav_ul">
          	        	
          	        </ul>
          	      </nav>
	          	</div>
	          </div>
	      </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-default" data-dismiss="modal">
	        <span aria-hidden="true">&larr;</span>返回</button>
	      </div>
	    </div> 
	  </div> 
	</div> 

    <!--主体内容开始  -->
	<div class="clearfix" id="add_picture">
		<div id="scrollsidebar" class="left_Treeview">
			<div class="show_btn" id="rightArrow">
				<span></span>
			</div>
			<div class="widget-box side_content">
				<div class="side_title">
					<a title="隐藏" class="close_btn"><span></span></a>
				</div>
				<div class="side_list">
					<div class="widget-header header-color-green2">
						<h4 class="lighter smaller">选择产品类型</h4>
					</div>
					<div class="widget-body">
						<div class="widget-main padding-8">
							<div id="treeDemo" class="ztree"></div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="page_right_style">
			<div class="type_title">添加商品</div>
			<form  method="post" class="form form-horizontal"
				id="form-article-add">
				<div class="clearfix cl">
					<label class="form-label col-2"><font color="red">*</font>图片标题：</label>
					<div class="formControls col-10">
						<input type="text" class="input-text" name="imagetitle" placeholder="最多可输入50个字符"
							id="imagetitle">
					</div>
				</div>
				<div class=" clearfix cl">
					<label class="form-label col-2"><font color="red">*</font>简略标题：</label>
					<div class="formControls col-10">
						<input type="text" class="input-text" placeholder="最多可输入100个字符"
							id="name" name="name">
					</div>
				</div>
				<div class=" clearfix cl">

					<div class="Add_p_s">
						<label class="form-label col-2">产品编号：</label>
						<div class="formControls col-2">
							<input type="text" class="input-text" placeholder="可输入30个字符"
								id="number" name="number">
						</div>
					</div>
					<div class="Add_p_s">
						<label class="form-label col-2">产&nbsp;&nbsp;&nbsp;&nbsp;地：</label>
						<div class="formControls col-2">
							<input type="text" class="input-text" placeholder="可输入100个字符"
								id="placeorigin" name="placeorigin"> 
						</div>
					</div>
					<div class="Add_p_s">
						<label class="form-label col-2">材&nbsp;&nbsp;&nbsp;&nbsp;质：</label>
						<div class="formControls col-2">
							<input type="text" class="input-text" placeholder="可输入100个字符"
								id="texture" name="texture">
						</div>
					</div>
					
					<div class="Add_p_s">
						<label class="form-label col-2">产品重量：</label>
						<div class="formControls col-2">
							<input type="number" class="input-text" value="" placeholder=""
								id="weight" name="weight">kg
						</div>
					</div>
					<div class="Add_p_s">
						<label class="form-label col-2">单位：</label>
						<div class="formControls col-2">
							<span class="select-box"> <select class="select" name="unit">
									<option value="">请选择</option>
									<option value="件">件</option>
									<option value="斤">斤</option>
									<option value="KG">KG</option>
									<option value="吨">吨</option>
									<option value="套">套</option>
							</select>
							</span>
						</div>
					</div>
					<div class="Add_p_s">
						<label class="form-label col-2"><font color="red">*</font>现在价格：</label>
						<div class="formControls col-2">
							<input type="number" class="input-text" id="nowprice" name="nowprice">元
						</div>
					</div>
					<div class="Add_p_s">
						<label class="form-label col-2"><font color="red">*</font>原来价格：</label>
						<div class="formControls col-2">
							<input type="number" class="input-text" 
								id="orprice" name="orprice">元
						</div>
					</div>
					<div class="Add_p_s">
						<label class="form-label col-2"><font color="red">*</font>库存量：</label>
						<div class="formControls col-2">
							<input type="number" class="input-text" id="inventory" name="inventory">
						</div>
					</div>
					 <div class="Add_p_s">
						<label class="form-label col-2"><font color="red">*</font>产品类型：</label>
						<div class="formControls col-2">
							 <input type="text" id="typeName" class="input-text" readonly="readonly">
							<input type="hidden" id="typeId" name="typeId"/>
						</div>
					</div>
					<div class="Add_p_s">
						<label class="form-label col-2">品&nbsp;&nbsp;&nbsp;&nbsp;牌：</label>
						<div class="formControls col-2">
							<button id="choose_brand_btn" type="button" class="btn btn-primary btn-sm">
							<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
							选择品牌</button>
						</div>
					</div>
					<div class="Add_p_s">
						<label class="form-label col-2"><font color="red">*</font>品牌名称：</label>
						<div class="formControls col-2">
							 <input type="text" id="brandName" class="input-text" readonly="readonly">
							<input type="hidden" id="brandId" name="brandId" readonly="readonly">
						</div>
					</div>
				    <div class="Add_p_s">
						<label class="form-label col-2"><font color="red">*</font>地区/国家：</label>
						<div class="formControls col-2">
							<input type="text" class="input-text" id="region" name="region">
						</div>
					</div>
				</div>

				<div class="clearfix cl">
					<label class="form-label col-2"><font color="red">*</font>关键词：</label>
					<div class="formControls col-10">
						<input type="text" class="input-text" 
						 placeholder="关键词之间请用空格隔开 例如：智能手机 vivo 手机"
							id="keyword" name="productKeyword.keyword">
					</div>
				</div>
				<div class="clearfix cl">
					<label class="form-label col-2"><font color="red">*</font>内容摘要：</label>
					<div class="formControls col-10">
						<textarea id="synopsis" name="synopsis" cols="" rows="" class="textarea"
							placeholder="说点什么...最少输入10个字符" datatype="*10-100"
							dragonfly="true" nullmsg="备注不能为空！"
							onKeyUp="textarealength(this,200)"></textarea>
						<p class="textarea-numberbar">
							<em class="textarea-length">0</em>/200
						</p>
					</div>
				</div>

				
				 <div class="clearfix cl">
					<label class="form-label col-2">图片上传：</label>
					<div class="formControls col-10">
						<div class="uploader-list-container">
							<div class="queueList">
								<div id="dndArea" class="placeholder">
									<div id="filePicker-2"></div>
									<p>或将照片拖到这里，单次最多可选300张</p>
								</div>
							</div>
							<div class="statusBar" style="display:none;">
								<div class="progress">
									<span class="text">0%</span> <span class="percentage"></span>
								</div>
								<div class="info"></div>
								<div class="btns">
									<div id="filePicker2"></div>
									<div class="uploadBtn">开始上传</div>
								</div>
							</div>
						</div>
					</div>
				</div> 
				<div class="clearfix cl">
					<label class="form-label col-2"><font color="red">*</font>详细内容：</label>
					<div class="formControls col-10">
						<textarea id="description" name="description" cols="" rows="" class="textarea"
							placeholder="说点什么...最少输入10个字符" datatype="*10-100"
							dragonfly="true" nullmsg="备注不能为空！"
							onKeyUp="checkLength(this,1000)"></textarea>
						<p class="textarea-numberbar">
							<em class="textarea-length" id="sy">0/1000</em>
						</p>
						<!--<script id="editor" type="text/plain" style="width:100%;height:400px;">
						</script> -->
					</div> 
				</div>
				 
				<div class="clearfix cl">
					<div class="Button_operation">
						<button  
							class="btn btn-primary radius" type="button" id="save_btn">
							<i class="icon-save "></i>保存并提交审核
						</button>
						<button onClick="layer_close();" class="btn btn-default radius"
							type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
					</div>
				</div>
			</form>
		</div>
	</div>
	 
	<script src="${APP_PATH}/static/shop/js/jquery-1.9.1.min.js"></script>
	<script src="${APP_PATH}/static/shop/assets/js/bootstrap.min.js"></script>
	<script src="${APP_PATH}/static/shop/assets/js/typeahead-bs2.min.js"></script>
	<script src="${APP_PATH}/static/shop/assets/layer/layer.js" type="text/javascript"></script>
	<script src="${APP_PATH}/static/shop/assets/laydate/laydate.js" type="text/javascript"></script>
	<script type="text/javascript"
		src="${APP_PATH}/static/shop/Widget/My97DatePicker/WdatePicker.js"></script>
	<script type="text/javascript" src="${APP_PATH}/static/shop/Widget/icheck/jquery.icheck.min.js"></script>
	<script type="text/javascript"
		src="${APP_PATH}/static/shop/Widget/zTree/js/jquery.ztree.all-3.5.min.js"></script>
	<script type="text/javascript"
		src="${APP_PATH}/static/shop/Widget/Validform/5.3.2/Validform.min.js"></script>
	<script type="text/javascript"
		src="${APP_PATH}/static/shop/Widget/webuploader/0.1.5/webuploader.min.js"></script>
	<script type="text/javascript"
		src="${APP_PATH}/static/shop/Widget/ueditor/1.4.3/ueditor.config.js"></script>
	<script type="text/javascript"
		src="${APP_PATH}/static/shop/Widget/ueditor/1.4.3/ueditor.all.min.js">
	</script>
	<script type="text/javascript"
		src="${APP_PATH}/static/shop/Widget/ueditor/1.4.3/lang/zh-cn/zh-cn.js"></script>
	<script src="${APP_PATH}/static/shop/js/lrtk.js" type="text/javascript"></script>
	<script type="text/javascript" src="${APP_PATH}/static/shop/js/H-ui.js"></script>
	<script type="text/javascript" src="${APP_PATH}/static/shop/js/H-ui.admin.js"></script>
	<script>
	
	//构建模态框表格信息
	function build_modal_table(result){
		$("#modal_table_tbody").empty();
		$.each(result.extend.pageInfo.list,function(index,item){
			var tr=$("<tr></tr>");
			var td1=$("<td></td>").append(item.id);
			var td2=$("<td></td>").append(item.name);
			var td3=$("<td></td>").append(item.region);
			var span=$("<span class='icon-ok' aria-hidden='true'></span>");
			var button=$("<button type='button' class='btn btn-success modal_choose_btn'></button>")
			.append(span).append("选择");
			var td4=$("<td></td>").append(button);
			tr.append(td1).append(td2).append(td3).append(td4).appendTo("#modal_table_tbody");
		});
	}
	//为模态框选择品牌按钮设置点击事件
	$(document).on("click",".modal_choose_btn",function(){
		var brandId=$(this).parents("tr").find("td:eq(0)").text();
		var brandName=$(this).parents("tr").find("td:eq(1)").text();
		$("#brandName").prop("value",brandName);
		$("#brandId").prop("value",brandId);
		$("#choose_brand_modal").modal('hide');
	});
	
	//模态框搜索按钮
	$("#modal_search_btn").click(function(){
		$.ajax({
			url:"${APP_PATH}/brand/getAllBrand",
			data:$("#modal_search_form").serialize(),
			type:"post",
			success:function(result){
				//console.log(result);
				//1.构建表格数据
				build_modal_table(result);
				//2.构建页信息
				buil_modal_pageInfo(result);
			}
		});
	});
	//模态框去哪页加载数据
	function to_page(pn){
		$.ajax({
			url:"${APP_PATH}/brand/getAllBrand",
			data:"pn="+pn,
			type:"post",
			success:function(result){
				//console.log(result);
				//1.构建表格数据
				build_modal_table(result);
				//2.构建页信息
				buil_modal_pageInfo(result);
			}
		});
	}
	
	//构建模态框分页信息
	function buil_modal_pageInfo(result){
		$("#modal_nav_ul").empty();
		$("#page_info").empty();
		//左边分页信息
		var pageInfo=result.extend.pageInfo;
		$("#page_info").append(" 当前第 "+pageInfo.pageNum+" 页，共 "+pageInfo.pages+"页，共计 "+pageInfo.total+" 条数据")
		
		//右边分页导航
		var firstPage=$("<li></li>").append($("<a></a>").append("首页"));
		var prePage=$("<li></li>").append($("<a></a>").append("&laquo;"));
		var nextPage=$("<li></li>").append($("<a></a>").append("&raquo;"));
		var lastPage=$("<li></li>").append($("<a></a>").append("末页"));
		if(result.extend.pageInfo.hasPreviousPage==false){
			firstPage.addClass("disabled");
			prePage.addClass("disabled");
		}else{
			firstPage.click(function(){
				to_page(1);
			});
			prePage.click(function(){
				to_page(result.extend.pageInfo.pageNum-1);
			});
		}
		if(result.extend.pageInfo.hasNextPage==false){
			nextPage.addClass("disabled");
			lastPage.addClass("disabled");
		}else{
			nextPage.click(function(){
				to_page(result.extend.pageInfo.pageNum+1);
			});
			lastPage.click(function(){
				to_page(result.extend.pageInfo.pages);
			});
		}
		$("#modal_nav_ul").append(firstPage).append(prePage);
		$.each(result.extend.pageInfo.navigatepageNums,function(index,item){
			var numLi=$("<li></li>").append($("<a></a>").append(item));
			if(result.extend.pageInfo.pageNum==item){
				numLi.addClass("active");	
			}
			numLi.click(function(){
				to_page(item);
			});
			$("#modal_nav_ul").append(numLi);
		});
		$("#modal_nav_ul").append(nextPage).append(lastPage);
		
	}
	
	 //选择品牌按钮
	$("#choose_brand_btn").click(function(){
		//默认打开模态框去第一页
		//加载数据
		to_page(1);
		//打开模态框
		$("#choose_brand_modal").modal();
	});
	
	 
	 
	//校验结果的提示信息
	function show_vaildate_msg(ele,status,msg){
		$(ele).parent().removeClass("has-success has-error");
		if("success"==status){
			$(ele).parent().addClass("has-success"); 
		}else if("error"==status){
			layer.msg(msg, {icon: 5,time : 1000,offset: ['35%']});
			$(ele).parent().addClass("has-error");
		}
		
	}
	 //增加产品表单校验
	 function vail_product_form(){
		 
		 //1.图片标题
		 var imagetitle=$("#imagetitle").val();
		 if(imagetitle.length<1){
			 show_vaildate_msg("#imagetitle","error","图片标题不能为空！");
			 return false;
		 }else if(imagetitle.length>50){
			 show_vaildate_msg("#imagetitle","error","图片标题字数超出限制！");
			 return false;
		 }else{
			 show_vaildate_msg("#imagetitle","success","");
		 }
		  
		 //2.简略标题
		 var name=$("#name").val();
		 if(name.length<1){
			 show_vaildate_msg("#name","error","简略标题不能为空！");
			 return false;
		 }else if(name.length>100){
			 show_vaildate_msg("#name","error","简略标题字数超出限制！");
			 return false;
		 }else{
			 show_vaildate_msg("#name","success","");
		 }
		 
		 //3.产品编号
		  var regex0=/^([0-9a-zA-Z]{0,30})$/;
		 var number=$("#number").val();
		 if(!regex0.test(number)){
			 show_vaildate_msg("#number","error","产品编号必须是30位以内的数字或字母！");
			 return false;
		 }
		 if(number.length>30){
			 show_vaildate_msg("#number","error","产品编号字数超出限制！");
			 return false;
		 }else{
			 show_vaildate_msg("#number","success","");
		 }  
		 //4.产地 
		 var placeorigin=$("#placeorigin").val();
		 if(placeorigin.length>100){
			 show_vaildate_msg("#placeorigin","error","产地字数超出限制！");
			 return false;
		 }else{
			 
			 show_vaildate_msg("#placeorigin","success","");
		 }
		 //5.材质
		 var texture=$("#texture").val();
		 if(texture.length>100){
			 show_vaildate_msg("#texture","error","材质字数超出限制！");
			 return false;
		 }else{
			 
			 show_vaildate_msg("#texture","success","");
		 }
		 
		 //6.产品重量
		 var regex1=/^([\d.]{0,7})$/;
		 var weight=$("#weight").val();
		 if(!regex1.test(weight)){
			 show_vaildate_msg("#weight","error","产品重量不能为负数！");
			 return false;
		 }else{
			 show_vaildate_msg("#weight","success","");
		 }
  
		 //7.现在价格
		 var regex2=/^([\d.]{1,8})$/;
		 var nowprice=$("#nowprice").val();	 
		 if(!regex2.test(nowprice)){
			 show_vaildate_msg("#nowprice","error","现在价格不能为空或不能为负数！");
			 return false;
		 }else{
			 show_vaildate_msg("#nowprice","success","");
		 }
		 
		//8.原来价格
		 var regex3=/^([\d.]{1,8})$/;
		 var orprice=$("#orprice").val();
		 if(!regex3.test(orprice)){
			 show_vaildate_msg("#orprice","error","原来价格不能为空或不能为负数！");
			 return false;
		 }else{
			 show_vaildate_msg("#orprice","success","");
		 }
		 
		//9.库存量
		 var regex4=/^([\d]{1,8})$/;
		 var inventory=$("#inventory").val();
		 if(!regex4.test(inventory)){
			 show_vaildate_msg("#inventory","error","库存量不能为空或不能为负数！");
			 return false;
		 }else{
			 show_vaildate_msg("#inventory","success","");
		 }
		  //10.产品类型
		  var typeId=$("#typeId").val();
		  if(typeId==''||typeId==null){
			  show_vaildate_msg("#typeId","error","您还没选择产品类型！");
			   return false;
		  }
		  //11.品牌
		  var brandId=$("#brandId").val();
		  if(brandId==''||brandId==null){
			  show_vaildate_msg("#brandId","error","您还没选择产品品牌！");
			   return false;
		  }
		 
		//13.地区/国家
		 var region=$("#region").val();
		 if(region.length<1){
			 show_vaildate_msg("#region","error","所属地区/国家不能为空！");
			 return false;
		 }else if(region.length>100){
			 show_vaildate_msg("#region","error","所属地区/国家字数不能超过一百！");
			 return false;
		 }else{
			 show_vaildate_msg("#region","success","");
		 }
		 
		 //10.关键词
		 var keyword=$("#keyword").val();
		 if(keyword.length<1){
			 show_vaildate_msg("#keyword","error","关键词不能为空！");
			 return false;
		 }else if(keyword.length>200){
			 show_vaildate_msg("#keyword","error","关键词字数不能超过两百！");
			 return false;
		 }else{
			 show_vaildate_msg("#keyword","success","");
		 }
		 
		 //11.内容摘要
		 var synopsis=$("#synopsis").val();
		 if(synopsis.length<1){
			 show_vaildate_msg("#synopsis","error","内容摘要不能为空！");
			 return false;
		 }else if(synopsis.length>200){
			 show_vaildate_msg("#synopsis","error","内容摘要字数不能超过两百！");
			 return false;
		 }else{
			 show_vaildate_msg("#synopsis","success","");
		 }
		 
		//12.详细内容
		 var description=$("#description").val();
		 if(description.length<1){
			 show_vaildate_msg("#description","error","详细内容不能为空！");
			 return false;
		 }else if(description.length>1000){
			 show_vaildate_msg("#description","error","详细内容字数不能超过一千！");
			 return false;
		 }else{
			 show_vaildate_msg("#description","success","");
		 }
		 
		 
		 
		 return true;
	 }
	 
	 
	 
	 
	 //保存按钮，保存数据
	$("#save_btn").click(function(){
		if(!vail_product_form()){
			return false;
		}
		layer.msg('正在保存', {
			   icon: 16
			   ,shade: 0.01,
			   time:2000,
			   offset:['30%'],
		}); 
		$.ajax({
			url:"${APP_PATH}/shopping/insertProduct",
			type:"POST",
			data:$("#form-article-add").serialize(),
			success:function(result){
				if(result.code==100){
					//清空表单
					$("#form-article-add")[0].reset();
					layer.msg("添加成功！",{
						offset:['30%'],
						icon : 6,
						time : 1000,
					});
				}else{
					layer.msg("添加失败！",{
						offset:['30%'],
						icon : 5,
						time : 1000,
					});
				}
			}
			
		});
	});
	function checkLength(which,maxChars) {
		if (which.value.length > maxChars) {
			layer.open({
				icon : 2,
				title : '提示框',
				offset:['25%'],
				content : '您输入的字数超多限制!',
			});
			// 超过限制的字数了就将 文本框中的内容按规定的字数 截取
			which.value = which.value.substring(0, maxChars);
			return false;
		} else {
			var curr = maxChars - which.value.length; // 减去 当前输入的
			document.getElementById("sy").innerHTML =which.value.length.toString()+"/"+curr.toString();
			return true;
		}
	}
	
	
		$(function() {
			$("#add_picture").fix({
				float : 'left',
				skin : 'green',
				durationTime : false,
				stylewidth : '220',
				spacingw : 0,
				spacingh : 260,
			});
		});
		$(document).ready(function() {
			//初始化宽度、高度

			$(".widget-box").height($(window).height());
			$(".page_right_style").height($(window).height());
			$(".page_right_style").width($(window).width() - 220);
			//当文档窗口发生改变时 触发  
			$(window).resize(function() {

				$(".widget-box").height($(window).height());
				$(".page_right_style").height($(window).height());
				$(".page_right_style").width($(window).width() - 220);
			});
		});
		$(function() {
			var ue = UE.getEditor('editor');
		});
		/******树状图********/
		var setting = {
			view : {
				dblClickExpand : false,
				showLine : false,
				selectedMulti : false
			},
			data : {
				simpleData : {
					enable : true,
					idKey : "id",
					pIdKey : "pId",
					rootPId : ""
				}
			},
			callback : {
				beforeClick : function(treeId, treeNode) {
					var zTree = $.fn.zTree.getZTreeObj("tree");
					$("#typeName").prop("value",treeNode.name);
					 $("#typeId").prop("value",treeNode.id);
					if (treeNode.isParent) {
						zTree.expandNode(treeNode);
						return false;
					} else {
						 
						return true;
					}
				}
			}
		};
 
		var code;

		function showCode(str) {
			if (!code)
				code = $("#code");
			code.empty();
			code.append("<li>" + str + "</li>");
		}
		
		
		var zNodes=[];
		
		function types(){
			$.ajax({
				url:"${APP_PATH}/productType/findAllProductType",
				type:"POST",
				success:function(result){
					$("#treeDemo").empty();
					zNodes=[];
					$.each(result.extend.productTypes,function(index,item){
						 if(item.id==1){
							 zNodes.push({"id":item.id,"pId":item.parentid,"name":item.name,"open":true});
						 }else{
							 zNodes.push({"id":item.id,"pId":item.parentid,"name":item.name});
						 }
					});
					var t = $("#treeDemo");
					
					t = $.fn.zTree.init(t, setting, zNodes);
					
					demoIframe = $("#testIframe");
					//demoIframe.bind("load", loadReady);
					var zTree = $.fn.zTree.getZTreeObj("tree");
					zTree.selectNode(zTree.getNodeByParam("id", '14'));
				}
			});
		}
		$(document).ready(function() {
			types();
		});
	</script>
	<script type="text/javascript">
		$(function() {
			$('.skin-minimal input').iCheck({
				checkboxClass : 'icheckbox-blue',
				radioClass : 'iradio-blue',
				increaseArea : '20%'
			});

			$list = $("#fileList"), $btn = $("#btn-star"), state = "pending",
					uploader;

			var uploader = WebUploader
					.create({
						auto : true,
						swf : 'lib/webuploader/0.1.5/Uploader.swf',

						// 文件接收服务端。
						server :"${APP_PATH}/file/batchUpload",

						// 选择文件的按钮。可选。
						// 内部根据当前运行是创建，可能是input元素，也可能是flash.
						pick : '#filePicker',

						// 不压缩image, 默认如果是jpeg，文件上传前会压缩一把再上传！
						resize : false,
						// 只允许选择图片文件。
						accept : {
							title : 'Images',
							extensions :'gif,jpg,jpeg,bmp,png',
							mimeTypes : 'image/*'
						},
						 
						
					});
			uploader
					.on('fileQueued',function(file) {
								var $li = $('<div id="' + file.id + '" class="item">'
										+ '<div class="pic-box"><img></div>'
										+ '<div class="info">'
										+ file.name
										+ '</div>'
										+ '<p class="state">等待上传...</p>'
										+ '</div>'), $img = $li.find('img');
								$list.append($li);

								// 创建缩略图
								// 如果为非图片文件，可以不用调用此方法。
								// thumbnailWidth x thumbnailHeight 为 100 x 100
								uploader.makeThumb(file, function(error, src) {
									if (error) {
										$img.replaceWith('<span>不能预览</span>');
										return;
									}

									$img.attr('src', src);
								}, thumbnailWidth, thumbnailHeight);
							});
			// 文件上传过程中创建进度条实时显示。
			uploader.on('uploadProgress',function(file, percentage) {
								var $li = $('#' + file.id), $percent = $li
										.find('.progress-box .sr-only');

								// 避免重复创建
								if (!$percent.length){
									$percent = $(
											'<div class="progress-box"><span class="progress-bar radius"><span class="sr-only" style="width:0%"></span></span></div>')
											.appendTo($li).find('.sr-only');
								}
								$li.find(".state").text("上传中");
								$percent.css('width', percentage * 100 + '%');
							});

			// 文件上传成功，给item添加成功class, 用样式标记上传成功。
			uploader.on('uploadSuccess', function(file) {
				
				$('#' + file.id).addClass('upload-state-success')
						.find(".state").text("已上传");
				 
			});

			// 文件上传失败，显示上传出错。
			uploader.on('uploadError', function(file) {
				
				$('#' + file.id).addClass('upload-state-error').find(".state")
						.text("上传出错");
			});

			// 完成上传完了，成功或者失败，先删除进度条。
			uploader.on('uploadComplete', function(file) {
				
				$('#' + file.id).find('.progress-box').fadeOut();
			});
			uploader.on('all', function(type) {
				if (type === 'startUpload') {
					state = 'uploading';
				} else if (type === 'stopUpload') {
					state = 'paused';
				} else if (type === 'uploadFinished') {
					state = 'done';
				}

				if (state === 'uploading') {
					$btn.text('暂停上传');
				} else {
					$btn.text('开始上传');
				}
			});

			$btn.on('click', function() {
				if (state === 'uploading') {
					uploader.stop();
				} else {
					uploader.upload();
				}
			});

		});

		(function($) {
			// 当domReady的时候开始初始化
			$(function() {
				var $wrap = $('.uploader-list-container'),

				// 图片容器
				$queue = $('<ul class="filelist"></ul>').appendTo(
						$wrap.find('.queueList')),

				// 状态栏，包括进度和控制按钮
				$statusBar = $wrap.find('.statusBar'),

				// 文件总体选择信息。
				$info = $statusBar.find('.info'),

				// 上传按钮
				$upload = $wrap.find('.uploadBtn'),

				// 没选择文件之前的内容。
				$placeHolder = $wrap.find('.placeholder'),

				$progress = $statusBar.find('.progress').hide(),

				// 添加的文件数量
				fileCount = 0,

				// 添加的文件总大小
				fileSize = 0,

				// 优化retina, 在retina下这个值是2
				ratio = window.devicePixelRatio || 1,

				// 缩略图大小
				thumbnailWidth = 110 * ratio, thumbnailHeight = 110 * ratio,

				// 可能有pedding, ready, uploading, confirm, done.
				state = 'pedding',

				// 所有文件的进度信息，key为file id
				percentages = {},
				// 判断浏览器是否支持图片的base64
				isSupportBase64 = (function() {
					var data = new Image();
					var support = true;
					data.onload = data.onerror = function() {
						if (this.width != 1 || this.height != 1) {
							support = false;
						}
					}
					data.src = "data:image/gif;base64,R0lGODlhAQABAIAAAAAAAP///ywAAAAAAQABAAACAUwAOw==";
					return support;
				})(),

				// 检测是否已经安装flash，检测flash的版本
				flashVersion = (function() {
					var version;

					try {
						version = navigator.plugins['Shockwave Flash'];
						version = version.description;
					} catch (ex) {
						try {
							version = new ActiveXObject(
									'ShockwaveFlash.ShockwaveFlash')
									.GetVariable('$version');
						} catch (ex2) {
							version = '0.0';
						}
					}
					version = version.match(/\d+/g);
					return parseFloat(version[0] + '.' + version[1], 10);
				})(),

				supportTransition = (function() {
					var s = document.createElement('p').style, r = 'transition' in s
							|| 'WebkitTransition' in s
							|| 'MozTransition' in s
							|| 'msTransition' in s || 'OTransition' in s;
					s = null;
					return r;
				})(),

				// WebUploader实例
				uploader;

				if (!WebUploader.Uploader.support('flash')
						&& WebUploader.browser.ie) {

					// flash 安装了但是版本过低。
					if (flashVersion) {
						(function(container) {
							window['expressinstallcallback'] = function(state) {
								switch (state) {
								case 'Download.Cancelled':
									alert('您取消了更新！')
									break;

								case 'Download.Failed':
									alert('安装失败')
									break;

								default:
									alert('安装已成功，请刷新！');
									break;
								}
								delete window['expressinstallcallback'];
							};

							var swf = 'expressInstall.swf';
							// insert flash object
							var html = '<object type="application/'
									+ 'x-shockwave-flash" data="' + swf + '" ';

							if (WebUploader.browser.ie) {
								html += 'classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000" ';
							}

							html += 'width="100%" height="100%" style="outline:0">'
									+ '<param name="movie" value="' + swf + '" />'
									+ '<param name="wmode" value="transparent" />'
									+ '<param name="allowscriptaccess" value="always" />'
									+ '</object>';

							container.html(html);

						})($wrap);

						// 压根就没有安转。
					} else {
						$wrap
								.html('<a href="http://www.adobe.com/go/getflashplayer" target="_blank" border="0"><img alt="get flash player" src="http://www.adobe.com/macromedia/style_guide/images/160x41_Get_Flash_Player.jpg" /></a>');
					}

					return;
				} else if (!WebUploader.Uploader.support()) {
					alert('Web Uploader 不支持您的浏览器！');
					return;
				}

				// 实例化
				uploader = WebUploader.create({
							pick : {
								id : '#filePicker-2',
								label : '点击选择图片'
							},
							formData : {
								uid : 123
							},
							dnd : '#dndArea',
							paste : '#uploader',
							swf : 'lib/webuploader/0.1.5/Uploader.swf',
							chunked : false,
							chunkSize : 512 * 1024,
							server : "${APP_PATH}/file/batchUpload",							 
							// 禁掉全局的拖拽功能。这样不会出现图片拖进页面的时候，把图片打开。
							disableGlobalDnd : true,
							fileNumLimit : 300,
							fileSizeLimit : 200 * 1024 * 1024, // 200 M
							fileSingleSizeLimit : 50 * 1024 * 1024// 50 M	
						     
						});

				// 拖拽时不接受 js, txt 文件。
				uploader.on('dndAccept', function(items) {
					var denied = false, len = items.length, i = 0,
					// 修改js类型
					unAllowed = 'text/plain;application/javascript ';

					for (; i < len; i++) {
						// 如果在列表里面
						if (~unAllowed.indexOf(items[i].type)) {
							denied = true;
							break;
						}
					}

					return !denied;
				});

				uploader.on('dialogOpen', function() {
					
					console.log('here');
				});

				// uploader.on('filesQueued', function() {
				//     uploader.sort(function( a, b ) {
				//         if ( a.name < b.name )
				//           return -1;
				//         if ( a.name > b.name )
				//           return 1;
				//         return 0;
				//     });
				// });

				// 添加“添加文件”的按钮，
				uploader.addButton({
					id : '#filePicker2',
					label : '继续添加'
				});

				uploader.on('ready', function() {
					window.uploader = uploader;
				});

				// 当有文件添加进来时执行，负责view的创建
				function addFile(file) {
					var $li = $('<li id="' + file.id + '">'
							+ '<p class="title">' + file.name + '</p>'
							+ '<p class="imgWrap"></p>'
							+ '<p class="progress"><span></span></p>' + '</li>'),

					$btns = $(
							'<div class="file-panel">'
									+ '<span class="cancel">删除</span>'
									+ '<span class="rotateRight">向右旋转</span>'
									+ '<span class="rotateLeft">向左旋转</span></div>')
							.appendTo($li), $prgress = $li
							.find('p.progress span'), $wrap = $li
							.find('p.imgWrap'), $info = $('<p class="error"></p>'),

					showError = function(code) {
						switch (code) {
						case 'exceed_size':
							text = '文件大小超出';
							break;

						case 'interrupt':
							text = '上传暂停';
							break;

						default:
							text = '上传失败，请重试';
							break;
						}

						$info.text(text).appendTo($li);
					};

					if (file.getStatus() === 'invalid') {
						showError(file.statusText);
					} else {
						// @todo lazyload
						$wrap.text('预览中');
						uploader.makeThumb(file,function(error, src) {
							 
							var img;
							if (error) {
								$wrap.text('不能预览');
								return;
							}
						
							if (isSupportBase64) {
								img = $('<img src="'+src+'">');
								$wrap.empty().append(img);
							} else {
								$.ajax('lib/webuploader/0.1.5/server/preview.php',{
									method : 'POST',
									data : src,
									dataType : 'json'
								}).done(
						function(
								response) {
							if (response.result) {
								img = $('<img src="'+response.result+'">');
								$wrap
										.empty()
										.append(
												img);
							} else {
								$wrap
										.text("预览出错");
							}
						});
							}
						}, thumbnailWidth, thumbnailHeight);

						percentages[file.id] = [ file.size, 0 ];
						file.rotation = 0;
					}

					file.on('statuschange', function(cur, prev) {
						 
						if (prev === 'progress') {
							$prgress.hide().width(0);
						} else if (prev === 'queued') {
							$li.off('mouseenter mouseleave');
							$btns.remove();
						}

						// 成功
						if (cur=== 'error' || cur === 'invalid') {
							console.log(file.statusText);
							showError(file.statusText);
							percentages[file.id][1] = 1;
						} else if (cur === 'interrupt') {
							showError('interrupt');
						} else if (cur === 'queued') {
							percentages[file.id][1] = 0;
						} else if (cur === 'progress') {
							$info.remove();
							$prgress.css('display', 'block');
						} else if (cur === 'complete') {
							$li.append('<span class="success"></span>');
						}

						$li.removeClass('state-' + prev).addClass(
								'state-' + cur);
					});

					$li.on('mouseenter', function() {
						$btns.stop().animate({
							height : 30
						});
					});

					$li.on('mouseleave', function() {
						$btns.stop().animate({
							height : 0
						});
					});

					$btns.on('click',
									'span',
									function() {
										var index = $(this).index(), deg;

										switch (index) {
										case 0:
											uploader.removeFile(file);
											return;

										case 1:
											file.rotation += 90;
											break;

										case 2:
											file.rotation -= 90;
											break;
										}

										if (supportTransition) {
											deg = 'rotate(' + file.rotation
													+ 'deg)';
											$wrap.css({
												'-webkit-transform' : deg,
												'-mos-transform' : deg,
												'-o-transform' : deg,
												'transform' : deg
											});
										} else {
											$wrap.css('filter','progid:DXImageTransform.Microsoft.BasicImage(rotation='
																	+ (~~((file.rotation / 90) % 4 + 4) % 4)
																	+ ')');											 											 
										}

									});

					$li.appendTo($queue);
				}

				// 负责view的销毁
				function removeFile(file) {
					var $li = $('#' + file.id);

					delete percentages[file.id];
					updateTotalProgress();
					$li.off().find('.file-panel').off().end().remove();
				}

				function updateTotalProgress() {
					var loaded = 0, total = 0, spans = $progress.children(), percent;

					$.each(percentages, function(k, v) {
						total += v[0];
						loaded += v[0] * v[1];
					});

					percent = total ? loaded / total : 0;

					spans.eq(0).text(Math.round(percent * 100) + '%');
					spans.eq(1).css('width', Math.round(percent * 100) + '%');
					updateStatus();
				}

				function updateStatus() {
					var text ='',stats;

					if (state === 'ready') {
						text = '选中' + fileCount + '张图片，共'
								+ WebUploader.formatSize(fileSize) + '。';
					} else if (state === 'confirm') {
						stats = uploader.getStats();
						if (stats.uploadFailNum) {
							text = '已成功上传'
									+ stats.successNum
									+ '张照片至XX相册，'
									+ stats.uploadFailNum
									+ '张照片上传失败，<a class="retry" href="#">重新上传</a>失败图片或<a class="ignore" href="#">忽略</a>'
						}

					} else {
						stats = uploader.getStats();
						text = '共' + fileCount + '张（'
								+ WebUploader.formatSize(fileSize) + '），已上传'
								+ stats.successNum + '张';

						if (stats.uploadFailNum) {
							text += '，失败' + stats.uploadFailNum + '张';
						}
					}

					$info.html(text);
				}

				function setState(val) {
					var file, stats;

					if (val === state) {
						return;
					}

					$upload.removeClass('state-' + state);
					$upload.addClass('state-' + val);
					state = val;

					switch (state) {
					case 'pedding':
						$placeHolder.removeClass('element-invisible');
						$queue.hide();
						$statusBar.addClass('element-invisible');
						uploader.refresh();
						break;

					case 'ready':
						$placeHolder.addClass('element-invisible');
						$('#filePicker2').removeClass('element-invisible');
						$queue.show();
						$statusBar.removeClass('element-invisible');
						uploader.refresh();
						break;

					case 'uploading':
						$('#filePicker2').addClass('element-invisible');
						$progress.show();
						$upload.text('暂停上传');
						break;

					case 'paused':
						$progress.show();
						$upload.text('继续上传');
						break;

					case 'confirm':
						$progress.hide();
						$('#filePicker2').removeClass('element-invisible');
						$upload.text('开始上传');

						stats = uploader.getStats();
						if (stats.successNum && !stats.uploadFailNum) {
							setState('finish');
							return;
						}
						break;
					case 'finish':
						stats = uploader.getStats();
						if (stats.successNum) {
							layer.open({
						        type: 1
						        ,offset:['35%']
						        ,content:"上传成功"
						        ,btn: '关闭'
						        ,shade: 0 //不显示遮罩
						        ,yes: function(){
						          layer.closeAll();
						        }
						    });
							
						} else {
							// 没有成功的图片，重设
							state = 'done';
							location.reload();
						}
						break;
					}

					updateStatus();
				}

				uploader.onUploadProgress = function(file, percentage) {
					
					var $li = $('#' + file.id), $percent = $li
							.find('.progress span');

					$percent.css('width', percentage * 100 + '%');
					percentages[file.id][1] = percentage;
					updateTotalProgress();
				};

				uploader.onFileQueued = function(file) {
					fileCount++;
					fileSize += file.size;

					if (fileCount === 1) {
						$placeHolder.addClass('element-invisible');
						$statusBar.show();
					}

					addFile(file);
					setState('ready');
					updateTotalProgress();
				};

				uploader.onFileDequeued = function(file) {
					fileCount--;
					fileSize -= file.size;

					if (!fileCount) {
						setState('pedding');
					}

					removeFile(file);
					updateTotalProgress();

				};

				uploader.on('all', function(type) {
					var stats;
					switch (type) {
					case 'uploadFinished':
						setState('confirm');
						break;

					case 'startUpload':
						setState('uploading');
						break;

					case 'stopUpload':
						setState('paused');
						break;

					}
				});

				uploader.onError = function(code) {
					alert('Eroor: ' + code);
				};

				$upload.on('click', function() {
					if ($(this).hasClass('disabled')) {
						return false;
					}

					if (state === 'ready') {
						uploader.upload();
					} else if (state === 'paused') {
						uploader.upload();
					} else if (state === 'uploading') {
						uploader.stop();
					}
				});

				$info.on('click', '.retry', function() {
					uploader.retry();
				});

				$info.on('click', '.ignore', function() {
					alert('todo');
				});

				$upload.addClass('state-' + state);
				updateTotalProgress();
			});

		})(jQuery);
	</script>
</body>
</html>