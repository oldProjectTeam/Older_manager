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

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>添加品牌</title>
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link href="${APP_PATH}/static/shop/assets/css/bootstrap.min.css"
	rel="stylesheet" />
<script src="${APP_PATH}/static/shop/js/jquery-1.9.1.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/bootstrap.min.js"></script>

<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>
 <style type="text/css">
 	.input{
 		width:160px
 	}
 	.title_name{
 		width:100%;
 		height:40px;
 		background:rgb(245,245,245);
 		border: solid;border-color:#C0C0C0; border-width:1px;
 		size:1.1em;
 		line-height:35px;
 		margin-bottom:20px
 	}
 </style>
</head>
<body>
<div class="title_name">&nbsp;添加品牌</div>
	<form id="add_brand_form" class="form-inline">
		<div class="row">
			<div class="col-md-10 col-md-offset-1" style="padding:10px;border: solid;border-color:#C0C0C0; border-width:1px;">
			   
			   <!--第一行  -->
			   <div class="row" style="margin-bottom:10px">
			      <div class="col-md-6">
			      	<div class="form-group">
			  		  <label><font color="red">*</font>品牌名称：</label>
					  <input id="name" name="name" type="text" class="input"  />
					  <font	color="red"></font> 
				    </div>
			      </div>
			   	  <div class="col-md-6">
			      	<div class="form-group">
			  		  <label><font color="red">*</font>品牌序号：</label>
					  <input id="sort" name="sort" type="number" class="input"  />
					  <font color="red"></font> 
				    </div>
			      </div>  
			   </div>
			   <!--第二行  -->
			   <div class="row" style="margin-bottom:10px">
			      	 <div class="col-md-8 col-md-offset-2" style="border: solid;border-color:#C0C0C0; border-width:1px;">
			      	 	<div class="row">
			      	 		<div class="col-sm-5">
								<input type="file" class="form-control" id="photofile"
											onchange="showPic()">
							 </div>
							 <div class="col-sm-5">
							 <input class="btn btn-success" type="button" value="上传图片"
									onclick="uploadFile()">
							</div>
			      	 	</div>
			      	    <div class="row" style="margin-top:5px">
							<div class="col-md-6" id="imgDiv">
								<div class="progress" id="parent">
									<div id="son"
										class="progress-bar progress-bar-success progress-bar-striped"
										role="progressbar" aria-valuenow="40" aria-valuemin="0"
										aria-valuemax="100" style="width: 40%">
										<span class="sr-only"></span>
									</div>
								</div>
							</div>
						 </div>
						 <div class="row">
								<div class="col-md-3">
									<img class="img-rounded"
										src="${APP_PATH}/static/shop/images/image.png" id="img"
										width="150" height="150">
								</div>
								<div class="col-md-4">
									<p>
										图片大小:<b>120px*60px</b>图片大小小于5MB,
									</p>
									<p>支持.jpg;.gif;.png;.jpeg格式的图片</p>
								</div>
						</div>
			      	 </div>
			   </div> 
			   
			    <!--第三行  -->
			   <div class="row" style="margin-bottom:10px">
			   		<div class="col-md-6">
			      	<div class="form-group">
			  		  <label><font color="red">*</font>所属地区：</label>
					  <input id="region" name="region" type="text" class="input" />
					<font color="red"></font> 
				    </div>
			      </div>
			   	  <div class="col-md-6">
			      	<div class="form-group">
			      	      <label><font color="red">*</font>显示状态：</label>
				  		  <label>
				  		    <input name="state" type="radio" class="ace"
								value="1" checked="checked" /> 
							<span class="lbl">显示</span>
						  </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
						  <label> 
						    <input type="radio" class="ace" name="state" value="0" />
						    <span class="lbl">不显示</span>
						  </label>
					 </div>
			      </div>  
			   </div>
			   <!--第四行  -->
			    <div class="row" style="margin-bottom:10px">
			    	<div class="col-md-10">
			    		<div class="form-group">
				  		  <label><font color="red">*</font>品牌描述：</label>
						  <textarea id="description" name="description" 
						  rows="4"  style="width:600px"
							   onkeyup="checkLength(this);">
						  </textarea><br>
						  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<span class="wordage">剩余字数：<span id="sy" style="color:Red;">500</span>字
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<font color="red" id="des_msg"></font>
							</span>
					    </div>
				    </div>
			    </div>
			    <!--第五行  -->
			    <div class="row" style="margin-bottom:10px">
				    <div class="col-md-6 col-md-offset-4">
			    		<div class="form-group">
				  		  <input id="add_brand_save_btn" type="button" class="btn btn-warning"
					        value="保存" />
					      <input name="" type="button" value="取消" id="control"
							class="btn btn-warning" />
					    </div>
				    </div>
			    </div>
		   </div>
		</div>
	</form>
	
	<script type="text/javascript">
		//保存品牌信息
		$("#add_brand_save_btn")
				.click(
						function() {
							var name = $("#name").val();
							if (name.length < 1) {
								layer.msg('品牌名称不能为空！', {
									icon : 5,
									time : 1000,
								});
								$("#name").next("font").html("品牌名称不能为空！");
								return false;
							} else if (name.length > 50) {
								layer.msg('品牌名称长度不能超过50！', {
									icon : 5,
									time : 1000,
								});
								$("#name").next("font").html("品牌名称长度不能超过50！");
								return false;
							} else {
								$("#name").next("font").html("");
							}
							var sort = $("#sort").val();
							if (sort == '' || sort < 0) {
								layer.msg('排序不能为空且不能为负数！', {
									icon : 5,
									time : 1000,
								});
								$("#sort").next("font").html("排序不能为空！");
								return false;
							} else {
								$("#sort").next("font").html("");
							}
							var region = $("#region").val();
							if (region.length < 1) {
								layer.msg('地区不能为空！', {
									icon : 5,
									time : 1000,
								});
								$("#region").next("font").html("地区不能为空！");
								return false;
							} else if (region.length > 100) {
								layer.msg('地区不能超过100！', {
									icon : 5,
									time : 1000,
								});
								$("#region").next("font").html("地区不能超过100！");
								return false;
							} else {
								$("#region").next("font").html("");
							}
							var remark = $("#description").val();
							if (remark.length < 1) {
								layer.msg('品牌描述不能为空！', {
									icon : 5,
									time : 1000,
								});
								$("#des_msg").html("品牌描述不能为空！");
								return false;
							} else if (remark.length > 500) {
								layer.msg('描述长度不能超过500！', {
									icon : 5,
									time : 1000,
								});
								$("#des_msg").html("描述长度不能超过500！");
								return false;
							} else {
								$("#des_msg").html("");
							}

							$
									.ajax({
										url : "${APP_PATH}/brand/insertBrand",
										type : "post",
										data : $("#add_brand_form").serialize(),
										success : function(result) {
											if (result.code == 100) {
												$("#add_brand_form")[0].reset();
												var isImg = $("#cs1").val();
												$("#imgDiv").hide();
												if (isImg != undefined
														&& isImg != '') {//如果图片已上传，那么创建之前将图片删除
													$("#cs1").remove();
												}
												$("#img")
														.prop("src",
																"${APP_PATH}/static/shop/images/image.png");
												layer.msg('添加成功', {
													icon : 6,
													time : 1000,
												});
											}
										}
									});
						});

		//取消按钮
		$("#control").click(function() {
			$("#add_brand_form")[0].reset();
			var isImg = $("#cs1").val();
			$("#imgDiv").hide();
			if (isImg != undefined && isImg != '') {//如果图片已上传，那么创建之前将图片删除

				$("#cs1").remove();
				removeImg(isImg);
			}
			$("#img").prop("src", "${APP_PATH}/static/shop/images/image.png");
		});

		$(document).ready(function() {
			$(".left_add").height($(window).height() - 60);
			$(".right_add").width($(window).width() - 600);
			$(".right_add").height($(window).height() - 60);
			$(".select").height($(window).height() - 195);
			$("#select_style").height($(window).height() - 220);
			//当文档窗口发生改变时 触发  
			$(window).resize(function() {
				$(".right_add").width($(window).width() - 600);
				$(".left_add").height($(window).height() - 60);
				$(".right_add").height($(window).height() - 60);
				$(".select").height($(window).height() - 195);
				$("#select_style").height($(window).height() - 220);
			});
		})
		function checkLength(which) {
			var maxChars = 500;
			if (which.value.length > maxChars) {
				layer.open({
					icon : 2,
					title : '提示框',
					offset : [ '25%' ],
					content : '您出入的字数超多限制!',
				});
				// 超过限制的字数了就将 文本框中的内容按规定的字数 截取
				which.value = which.value.substring(0, maxChars);
				return false;
			} else {
				var curr = maxChars - which.value.length; // 减去 当前输入的
				document.getElementById("sy").innerHTML = curr.toString();
				return true;
			}
		}
	 
	</script>
	<script type="text/javascript">
		//首先隐藏进度条
		$(function() {
			$("#imgDiv").hide();
		});

		//删除上传但没保存的图片
		function removeImg(imgName) {
			$.ajax({
				url : "${APP_PATH}/file/checkImg.action?isImg=" + imgName,
				type : "post",
				success : function(result) {
				}
			});
		}

		//上传图片，加载进度条
		function showPic() {
			var pic = $("#photofile").get(0).files[0];
			var regImg = /\.(gif|jpg|jpeg|png|GIF|JPG|PNG)$/;
			if (!regImg.test($("#photofile").val())) {
				layer.msg("图片类型必须是.gif,jpeg,jpg,png中的一种");
				//清空文件域
				var file = $("#photofile");
				file.after(file.clone().val(""));
				file.remove();
				return false;
			}
			$("#son").css("width", "0%");
			$("#imgDiv").hide();
			$("#img").prop("src", window.URL.createObjectURL(pic));
			// uploadFile();
		}
		function uploadFile() {
			var pic = $("#photofile").get(0).files[0];
			if (pic == undefined) {
				layer.msg("您还没选择上传的文件！");
				return false;
			}
			//显示进度条
			$("#imgDiv").show();
			var formData = new FormData();
			formData.append("file", pic);
			/** 
			 * 必须false才会避开jQuery对 formdata 的默认处理 
			 * XMLHttpRequest会对 formdata 进行正确的处理 
			 */
			$
					.ajax({
						type : "POST",
						url : "${APP_PATH}/file/upload.action",
						data : formData,
						processData : false,
						//必须false才会自动加上正确的Content-Type 
						contentType : false,
						xhr : function() {
							var xhr = $.ajaxSettings.xhr();
							if (onprogress && xhr.upload) {
								xhr.upload.addEventListener("progress",
										onprogress, false);
								return xhr;
							}
						},
						success : function(result) {
							if (result.code == 100) {
								//返回图片路径创建文本框之前，先判断之前是否已经上传过了，如果是，先删除再创建
								var isImg = $("#cs1").val();
								if (isImg != undefined && isImg != '') {//如果图片已上传，那么创建之前将图片删除
									$("#cs1").remove();
									removeImg(isImg);
								}
								//清空文件域
								var file = $("#photofile");
								file.after(file.clone().val(""));
								file.remove();
								//存放文件名
								var inputPath = $("<input type='hidden' name='logoimage' id='cs1'/>");
								inputPath.attr("value", result.extend.fileName);
								inputPath.appendTo("#firstLi");
							} else {
								$("#son").html("上传失败");
								$("#son").css("font-size", "0.6em");
								$("#son").css("color", "red");
							}
						}
					});
		}

		/**
		 * 侦查附件上传情况 ,这个方法大概0.05-0.1秒执行一次
		 */
		function onprogress(evt) {
			var loaded = evt.loaded; //已经上传大小情况 
			var tot = evt.total; //附件总大小 
			var per = Math.floor(100 * loaded / tot); //已经上传的百分比 
			$("#son").html(per + "%");
			$("#son").css("width", per + "%");
			if ($("#son").text() == "100%") {
				$("#son").html("上传成功");
			}
		}
	</script>

</body>
</html>

