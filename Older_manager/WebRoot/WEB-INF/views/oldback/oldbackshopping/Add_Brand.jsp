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
<link rel="stylesheet" href="${APP_PATH}/static/shop/css/style.css" />
<link rel="stylesheet"
	href="${APP_PATH}/static/shop/assets/css/ace.min.css" />
<link rel="stylesheet"
	href="${APP_PATH}/static/shop/assets/css/font-awesome.min.css" />
<link href="${APP_PATH}/static/shop/Widget/icheck/icheck.css"
	rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="${APP_PATH}/static/shop/assets/css/font-awesome.min.css" />
<script src="${APP_PATH}/static/shop/js/jquery-1.9.1.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/bootstrap.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/typeahead-bs2.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>
<script type="text/javascript"
	src="${APP_PATH}/static/shop/Widget/swfupload/swfupload.js"></script>
<script type="text/javascript"
	src="${APP_PATH}/static/shop/Widget/swfupload/swfupload.queue.js"></script>
<script type="text/javascript"
	src="${APP_PATH}/static/shop/Widget/swfupload/swfupload.speed.js"></script>
<script type="text/javascript"
	src="${APP_PATH}/static/shop/Widget/swfupload/handlers.js"></script>
</head>
<body>
	<form id="add_brand_form">
		<div class=" clearfix">
			<div id="add_brand" class="clearfix">
				<div class="left_add">
					<div class="title_name">添加品牌</div>

					<ul class="add_conent">
						<li id="firstLi" class=" clearfix"><label class="label_name"><i>*</i>品牌名称：</label>
							<input id="name" name="name" type="text" class="add_text" /> <font
							color="red"></font></li>
						<li class=" clearfix"><label class="label_name"><i>*</i>品牌序号：</label>
							<input id="sort" name="sort" type="number" class="add_text"
							style="width:80px" /> <font color="red"></font></li>
						<li class=" clearfix"><label class="label_name">品牌图片：</label>
							<div class="row">
								<div class="col-sm-8">
									<input type="file" class="form-control" id="photofile"
										onchange="showPic()">
								</div>
								<div class="col-sm-2">
									<input class="btn btn-success" type="button" value="上传图片"
										onclick="uploadFile()">
								</div>
							</div>
							<div class="row" style="margin-top:5px">
								<div class="col-md-6 col-md-offset-2" id="imgDiv">
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
								<div class="col-sm-5 col-md-offset-1">
									<img class="img-rounded"
										src="${APP_PATH}/static/shop/images/image.png" id="img"
										width="150" height="150">
								</div>
								<div class="col-sm-4">
									<p>
										图片大小:<b>120px*60px</b>图片大小小于5MB,
									</p>
									<p>支持.jpg;.gif;.png;.jpeg格式的图片</p>
								</div>
							</div></li>
						<li class=" clearfix"><label class="label_name"><i>*</i>所属地区：</label>
							<input id="region" name="region" type="text" class="add_text"
							style="width:120px" /> <font color="red"></font></li>
						<li class=" clearfix"><label class="label_name"><i>*</i>品牌描述：</label>
							<textarea id="description" name="description" cols="" rows=""
								class="textarea" onkeyup="checkLength(this);"></textarea> <span
							class="wordage">剩余字数：<span id="sy" style="color:Red;">500</span>字
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="red"
								id="des_msg"></font>
						</span></li>
						<li class=" clearfix"><label class="label_name"><i>*</i>显示状态：</label>
							<label> <input name="state" type="radio" class="ace"
								value="1" checked="checked" /> <span class="lbl">显示</span>
						</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <label> <input type="radio"
								class="ace" name="state" value="0" /> <span class="lbl">不显示</span></label>
						</li>
					</ul>

				</div>
				<div class="right_add">
					<div class="title_name">添加商品</div>

					<div class="p_select_list">
						<div class="left_produt produt_select_style">
							<div id="select_style"></div>
							<span class="seach_style"><input name="" type="text"
								id="seach" class="seach" /><i class="icon-search"></i></span>
						</div>
						<div class="Switching_btn">

							<span id="add_all" class="Switching"> <input type="button"
								class="btn btn-warning" value=">>" />
							</span> <span id="add" class="Switching"> <input type="button"
								class="btn btn-primary" value=">" />
							</span> <span id="remove" class="Switching"> <input type="button"
								value="<"
							class=" btn btn-primary"  />
							</span> <span id="remove_all" class="Switching"> <input
								value="<<"
							type=" button" class="btn btn-warning" />
							</span>


						</div>
						<div class="right_product produt_select_style">
							<div class="title_name">归类商品</div>
							<select multiple="multiple" id="select2" class="select">
							</select>
						</div>
					</div>
				</div>
			</div>
			<div class="button_brand">
				<input id="add_brand_save_btn" type="button" class="btn btn-warning"
					value="保存" /><input name="" type="button" value="取消" id="control"
					class="btn btn-warning" />
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
		//下拉框交换JQuery
		$(function() {
			//移到右边
			$('#add').click(function() {
				//获取选中的选项，删除并追加给对方
				$('#select1 option:selected').appendTo('#select2');
			});
			//移到左边
			$('#remove').click(function() {
				$('#select2 option:selected').appendTo('#select1');
			});
			//全部移到右边
			$('#add_all').click(function() {
				//获取全部的选项,删除并追加给对方
				$('#select1 option').appendTo('#select2');
			});
			//全部移到左边
			$('#remove_all').click(function() {
				$('#select2 option').appendTo('#select1');
			});
			//双击选项
			$('#select1').dblclick(function() { //绑定双击事件
				//获取全部的选项,删除并追加给对方
				$("option:selected", this).appendTo('#select2'); //追加给对方
			});
			//双击选项
			$('#select2').dblclick(function() {
				$("option:selected", this).appendTo('#select1');
			});
		});
		var user = [ {
			"id" : 1,
			"name" : "贝德玛（Bioderma）温和卸妆水净妍/舒妍洁肤液卸妆水 ",
			"status" : "关闭"
		}, {
			"id" : 2,
			"name" : "欧诗漫 OSM 奢华金萃臻贵娇宠礼盒",
			"status" : "关闭"
		}, {
			"id" : 3,
			"name" : "舒蕾洗发水奢养精油套装",
			"status" : "关闭"
		}, {
			"id" : 4,
			"name" : "雅芳小黑裙香体乳150g",
			"status" : "关闭"
		}, {
			"id" : 5,
			"name" : "嘉媚乐（CAMENAE）玫瑰之爱保",
			"status" : "启用"
		}, {
			"id" : 6,
			"name" : "欧莱雅男士护肤套装 劲能极速活肤液50ml",
			"status" : "启用"
		}, {
			"id" : 7,
			"name" : "美即 面膜 净透亮肤套装面膜贴升级版",
			"status" : "启用"
		}, {
			"id" : 8,
			"name" : "可悠然（KUYURA）美肌沐浴露（欣怡幽香）550ml ",
			"status" : "启用"
		}, {
			"id" : 9,
			"name" : "李施德林漱口水冰蓝口味500ml双包装",
			"status" : "启用"
		}, {
			"id" : 10,
			"name" : "吕(Ryo)滋养韧发密集莹韧[滋润型]洗护套装 ",
			"status" : "启用"
		}, {
			"id" : 11,
			"name" : "美宝莲（MAYBELLINE）气垫BB",
			"status" : "关闭"
		}, {
			"id" : 12,
			"name" : "I'M CONCEALER我爱水润遮瑕液 #02 自然肤色",
			"status" : "启用"
		}, {
			"id" : 13,
			"name" : "Apple iPhone 6s (A1700) 64G 玫瑰金色 移动联通电信4G手机",
			"status" : "启用"
		}, {
			"id" : 14,
			"name" : "小米 Max 全网通 高配版 3GB内存 64GB ROM 金色 移动联通电信4G手机 ",
			"status" : "启用"
		}, {
			"id" : 15,
			"name" : "OPPO R9 4GB+64GB内存版 玫瑰金 全网通4G手机 双卡双待",
			"status" : "启用"
		}, {
			"id" : 16,
			"name" : "华为 P9 全网通 3GB+32GB版 流光金 移动联通电信4G手机 双卡双待 ",
			"status" : "启用"
		}, {
			"id" : 17,
			"name" : "华为 Mate 8 3GB+32GB版 月光银 移动联通电信4G手机 双卡双待",
			"status" : "启用"
		}, {
			"id" : 18,
			"name" : "努比亚(nubia)【3+64GB】小牛5 Z11mini 白色 移动联通电信4G手机 双卡双待",
			"status" : "启用"
		}, {
			"id" : 19,
			"name" : "三星 Galaxy A9 (SM-A9100) 魔幻金 全网通4G手机 双卡双待 ",
			"status" : "启用"
		}, {
			"id" : 20,
			"name" : "华为 畅享5 梦幻金 移动联通电信4G手机 双卡双待",
			"status" : "关闭"
		} ];
		$(document)
				.ready(
						function() {
							var seach = $("#seach");

							seach
									.keyup(function(event) {
										//获取当前文本框的值
										var seachText = $("#seach").val();
										var product = "<div class='title_name'>产品名称</div><select multiple='multiple' id='select1' class='select'>";
										if (seachText != "") {
											$
													.each(
															user,
															function(id, item) {
																//如果包含则为select赋值
																if (item.name
																		.indexOf(seachText) != -1
																		&& item.status
																				.indexOf(seachText) != -1) {
																	product += "<option value="+item.id+">"
																			+ "("
																			+ item.status
																			+ ")"
																			+ item.name
																			+ "</option>";
																}
															})
											$("#select_style").html(product);
										} else {
											$
													.each(
															user,
															function(id, item) {
																name = item.name;
																status = item.status;
																product += "<option value="+item.id+">"
																		+ "("
																		+ item.status
																		+ ")"
																		+ item.name
																		+ "</option>";
															})
											$("#select_style").html(product);
										}
										product + "</select>";
									});

							var product = "<div class='title_name'>产品名称</div>";

							product += "<select multiple='multiple' id='select1' class='select'";
							$
									.each(
											user,
											function(id, item) {
												name = item.name;
												status = item.status;
												product += "<option value="+item.id+" title="+item.name+">"
														+ "("
														+ item.status
														+ ")"
														+ item.name
														+ "</option>";

											})
							product + "</select>";
							$("#select_style").html(product);

						})
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