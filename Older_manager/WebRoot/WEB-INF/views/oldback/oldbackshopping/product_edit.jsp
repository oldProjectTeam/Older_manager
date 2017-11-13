<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>编辑产品</title>

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
<link rel="stylesheet" href="${APP_PATH }/static/manyUpload/css/upload.css">
<style type="text/css">
        .imgDiv {
            display: inline-block;
            position: relative;
            margin-top:5px;
            margin-left:5px
        }
 
         .imgDiv .delete {
             position: absolute;
             top: 0px;
             right: 0px;
             width:40px;
             height:40px;
             display: none;
             background:#300000;
             border: solid;border-color:#C0C0C0; border-width:1px;
         }
</style>

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
			<div class="type_title">编辑产品</div>
			<form  method="post" class="form form-horizontal"
				id="form-article-add">
				<div class="clearfix cl">
					<label class="form-label col-2"><font color="red">*</font>图片标题：</label>
					<div class="formControls col-10">
						<input type="text" class="input-text" value="${product.imagetitle }"
						name="imagetitle" placeholder="最多可输入50个字符" id="imagetitle">
					</div>
				</div>
				<div class=" clearfix cl">
					<label class="form-label col-2"><font color="red">*</font>简略标题：</label>
					<div class="formControls col-10">
						<input type="text" class="input-text"  value="${product.name }"
						placeholder="最多可输入100个字符"
							id="name" name="name">
						<input type="hidden" name="id"  value="${product.id}" />
					</div>
				</div>
				<div class=" clearfix cl">
					<div class="Add_p_s">
						<label class="form-label col-2">产品编号：</label>
						<div class="formControls col-2">
							<input type="text" class="input-text"
								id="number" name="number" value="${product.number }" readonly="readonly">
							<input type="hidden" name="auditstatus"  value="0" />
						</div>
					</div>
					<div class="Add_p_s">
						<label class="form-label col-2">产&nbsp;&nbsp;&nbsp;&nbsp;地：</label>
						<div class="formControls col-2">
							<input type="text" class="input-text" placeholder="可输入100个字符"
								id="placeorigin" name="placeorigin" value="${product.placeorigin }"> 
						</div>
					</div>
					<div class="Add_p_s">
						<label class="form-label col-2">材&nbsp;&nbsp;&nbsp;&nbsp;质：</label>
						<div class="formControls col-2">
							<input type="text" class="input-text" placeholder="可输入100个字符"
								id="texture" name="texture" value="${product.texture }">
						</div>
					</div>
					
					<div class="Add_p_s">
						<label class="form-label col-2">产品重量：</label>
						<div class="formControls col-2">
							<input type="number" class="input-text"
								id="weight" name="weight" value="${product.weight }"/>kg
						</div>
					</div>
					<div class="Add_p_s">
						<label class="form-label col-2">单位：</label>
						<div class="formControls col-2">
							<span class="select-box">
							   <select class="select" name="unit">
									<option value="">请选择</option>
									<option <c:if test="${product.unit=='件'}">selected="selected"</c:if> value="件" >件</option>
									<option <c:if test="${product.unit=='斤'}">selected="selected"</c:if> value="斤">斤</option>
									<option <c:if test="${product.unit=='KG'}">selected="selected"</c:if> value="KG">KG</option>
									<option <c:if test="${product.unit=='吨'}">selected="selected"</c:if> value="吨">吨</option>
									<option <c:if test="${product.unit=='套'}">selected="selected"</c:if> value="套">套</option>
									<option <c:if test="${product.unit=='盒'}">selected="selected"</c:if> value="盒">盒</option>
									<option <c:if test="${product.unit=='张'}">selected="selected"</c:if> value="张">张</option>
							</select>
							</span>
						</div>
					</div>
					<div class="Add_p_s">
						<label class="form-label col-2"><font color="red">*</font>现在价格：</label>
						<div class="formControls col-2">
							<input type="number" class="input-text" id="nowprice" 
							name="nowprice" value="${product.nowprice }" >元
						</div>
					</div>
					<div class="Add_p_s">
						<label class="form-label col-2"><font color="red">*</font>原来价格：</label>
						<div class="formControls col-2">
							<input type="number" class="input-text" 
								id="orprice" name="orprice" value="${product.orprice }" >元
						</div>
					</div>
					<div class="Add_p_s">
						<label class="form-label col-2"><font color="red">*</font>库存量：</label>
						<div class="formControls col-2">
							<input type="number" class="input-text" id="inventory" 
							name="inventory" value="${product.inventory }" >
						</div>
					</div>
					 <div class="Add_p_s">
						<label class="form-label col-2">产品类型：</label>
						<div class="formControls col-2">
							 <input type="text" id="typeName" class="input-text" 
							 readonly="readonly" value="${product.productType.name}" >
							<input type="hidden" id="typeId" name="typeId" value="${product.productType.id}"/>
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
						<label class="form-label col-2">品牌名称：</label>
						<div class="formControls col-2">
							 <input type="text" id="brandName" class="input-text" value="${product.brand.name}" 
							 readonly="readonly">
							<input type="hidden" id="brandId" name="brandId" value="${product.brand.id}" readonly="readonly">
						</div>
					</div>
				    <div class="Add_p_s">
						<label class="form-label col-2"><font color="red">*</font>地区/国家：</label>
						<div class="formControls col-2">
							<input type="text" class="input-text" id="region" 
							name="region" value="${product.region}">
						</div>
					</div>
				</div>

				<div class="clearfix cl">
					<label class="form-label col-2"><font color="red">*</font>关键词：</label>
					<div class="formControls col-10">
						<input type="text" class="input-text" 
						 placeholder="关键词之间请用空格隔开 例如：智能手机 vivo 手机"
							id="keyword" name="productKeyword.keyword" value="${product.productKeyword.keyword}">
						<input type="hidden" name="productKeyword.id"  value="${product.productKeyword.id}" />
					</div>
				</div>
				<div class="clearfix cl">
					<label class="form-label col-2"><font color="red">*</font>内容摘要：</label>
					<div class="formControls col-10">
						<textarea id="synopsis" name="synopsis" cols="" rows="" class="textarea"
							placeholder="说点什么...最少输入10个字符" datatype="*10-100"
							dragonfly="true" nullmsg="备注不能为空！"
							onKeyUp="textarealength(this,200)">${product.synopsis}</textarea>
						<p class="textarea-numberbar">
							<em class="textarea-length">0</em>/200
						</p>
					</div>
				</div>
				<div class="clearfix cl">
					<label class="form-label col-2">图片上传：</label>
					<div class="formControls col-10" style="height:150px;border: solid;border-color:#C0C0C0; border-width:1px;">
						
				 		<div class="col-md-5 col-md-offset-5" style="margin-top:10px;">
				 			<a id="zwb_upload" class="btn btn-primary btn-lg" style="height:30px;width:100px">
						    <input type="file" class="add" multiple>点击上传
						</a>
						<input type="hidden" name="images" id="callbackPath2">
						<p>单次最多可选10张</p>
				 		</div>
					</div>
				</div>  
				<div class="clearfix cl">
					<label class="form-label col-2">已有图片：</label>
					<div class="formControls col-10" style="border: solid;border-color:#C0C0C0; border-width:1px;">						 
						<c:if test="${empty product.imgList }">
							<center><h5>空空如也</h5></center>
						</c:if>
						<c:forEach items="${product.imgList }" var="img">
						<div class="imgDiv">
					        <img src="${APP_PATH }/${img}" width="150px" height="150px" 
					        onerror="onerror=null;src='${APP_PATH }/static/images/f9b49612f9d78f425c77eae488b9c1ad.jpg'"
					        />
					        <a href="javasrcipt:;" onClick="del_img(this,'${product.id}','${img}')">
					              <img src="${APP_PATH}/static/shop/images/del_icon.png" class="delete" />  
					        </a>
					    </div>
						
						</c:forEach>
					</div>
				</div> 
				<div class="clearfix cl">
					<label class="form-label col-2"><font color="red">*</font>详细内容：</label>
					<div class="formControls col-10">
						<textarea id="description" name="description" cols="" rows="" class="textarea"
							placeholder="说点什么...最少输入10个字符" datatype="*10-100"
							dragonfly="true" nullmsg="备注不能为空！"
							onKeyUp="checkLength(this,1000)">${product.description}</textarea>
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
						<button onClick="back();" class="btn btn-default radius"
							type="button">&nbsp;&nbsp;返回&nbsp;&nbsp;</button>
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
	
	//删除上传但没保存的图片
	function removeImg(imgName) {
		$.ajax({
			url : "${APP_PATH}/file/checkImg.action?isImg=" + imgName,
			type : "post",
			success : function(result) {
			}
		});
	}
	//返回按钮
	function back(){
		//删除已上传的图片
		var images=$("#callbackPath2").val();
		if(images!=''&&images!=null){
			images=images.substring(1);
			var img=images.split(",");
			 $.each(img,function(){
				 removeImg(this);
			 });
			 $("#callbackPath2").removeAttr("value");
		}
		window.history.back(); 
	}
	
	
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
		 if(synopsis.length<10){
			 show_vaildate_msg("#synopsis","error","内容摘要不能少于10个字符！");
			 return false;
		 }else if(synopsis.length>200){
			 show_vaildate_msg("#synopsis","error","内容摘要字数不能超过两百！");
			 return false;
		 }else{
			 show_vaildate_msg("#synopsis","success","");
		 }
		 
		//12.详细内容
		 var description=$("#description").val();
		 if(description.length<10){
			 show_vaildate_msg("#description","error","详细内容不能少于10个字符！");
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
			url:"${APP_PATH}/shopping/updateProduct",
			type:"POST",
			data:$("#form-article-add").serialize(),
			success:function(result){
				if(result.code==100){
					 //删除图片保存路径
					$("#callbackPath2").removeAttr("value");
					layer.msg("修改成功！",{
						offset:['30%'],
						icon : 6,
						time : 1000,
					});
				}else{
					layer.msg("修改失败！",{
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
				offset:['30%'],
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
					if (treeNode.isParent) {
						zTree.expandNode(treeNode);
						return false;
					} else {
						 $("#typeName").prop("value",treeNode.name);
						 $("#typeId").prop("value",treeNode.id);
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
<!-- 多图片上传 -->
<script src="${APP_PATH }/static/manyUpload/js/upload.min.js"></script>
<script>
    //配置需要引入jq 1.7.2版本以上
    //服务器端成功返回 {state:1,path:文件保存路径}
    //服务器端失败返回 {state:0,errmsg:错误原因}
    //默认做了文件名不能含有中文,后端接收文件的变量名为file
    $("#zwb_upload").bindUpload({
        url:"file/batchUpload.action",//上传服务器地址
        callbackPath:"#callbackPath2",//绑定上传成功后 图片地址的保存容器的id或者class 必须为input或者textarea等可以使用$(..).val()设置之的表单元素
        // ps:值返回上传成功的 默认id为#callbackPath  保存容器为位置不限制,id需要加上#号,class需要加上.
        // 返回格式为:
        // 原来的文件名,服务端保存的路径|原来的文件名,服务端保存的路径|原来的文件名,服务端保存的路径|原来的文件名,服务端保存的路径....
        num:10,//上传数量的限制 默认为空 无限制
        type:"jpg|png|gif|svg|jpeg",//上传文件类型 默认为空 无限制
        size:20,//上传文件大小的限制,默认为5单位默认为mb
    });
</script>
<script type="text/javascript">

//删除原来已有图片事件		
function del_img(obj,id,imgName){
	$.ajax({
		url : "${APP_PATH}/shopping/deleteImg.action?id=" +id+"&imgName="+imgName,
		type : "post",
		success : function(result) {
			if(result.code==100){
				$(obj).parent(".imgDiv").remove();
				layer.msg("图片已删除",{
					icon:6,
					time:1000,
					offset:['45%']
				});
			}else{
				layer.msg("删除失败",{
					icon:5,
					time:1000,
					offset:['45%']
				});
			}
		}
	});
}


  $(document).ready(init);
  function init() {
      $(".imgDiv").mouseenter(function () {
          $(this).find(".delete").show();

      });

      $(".imgDiv").mouseleave(function () {
          $(this).find(".delete").hide();
      });

  }
</script>
</body>
</html>