<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>广告管理</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="stylesheet" href="${APP_PATH}/static/shop/css/style.css" />
<link href="${APP_PATH}/static/shop/assets/css/codemirror.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="${APP_PATH}/static/shop/assets/css/ace.min.css" />
<link rel="stylesheet"
	href="${APP_PATH}/static/shop/font/css/font-awesome.min.css" />
<link rel="stylesheet"
	href="${APP_PATH}/static/shop/assets/css/font-awesome.min.css" />
<script src="${APP_PATH}/static/shop/js/jquery-1.9.1.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/typeahead-bs2.min.js"></script>
<script src="${APP_PATH}/static/shop/js/lrtk.js" type="text/javascript"></script> 
 <script src="${APP_PATH}/static/shop/assets/js/jquery.dataTables.min.js"></script> 
 <script
	src="${APP_PATH}/static/shop/assets/js/jquery.dataTables.bootstrap.js"></script>
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
	

<link
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
 <script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>	
<script src="${APP_PATH}/static/layui/css/layui.css"
	type="text/javascript"></script>
<script src="${APP_PATH}/static/layui/layui.js"
	type="text/javascript"></script>
<script language="JavaScript"
	src="${APP_PATH}/static/js/uploadPreview.js"></script>
</head>

<body>
	<div class=" clearfix" id="advertising">
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
						<h4 class="lighter smaller">广告图分类</h4>
					</div>
					<div class="widget-body">
						<ul class="b_P_Sort_list">
							<li><i class="orange  fa fa-user-secret"></i><a id="totaldid">全部(${total})</a></li>
							
							<%-- <c:forEach items="${pageInfo.list }" var="emp">
	        					<tr>
	        						<th>${emp.empId}</th>
	        						<th>${emp.empName}</th> --%>
							<c:forEach items="${map}" var="items">
							<li><i class="fa fa-image pink " ></i> <a onclick="gogo(${items.key})">${items.value}</a></li>
							 
							</c:forEach> 
							
						</ul>
					</div>
				</div>
			</div>
		</div>
		<div class="Ads_list">
	
			 <div style="margin-top:20px">
						      <div class="col-md-4">
								<button type="button" class="btn btn-danger" id="old_delete_all_btn">
									<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
									批量删除
								</button>
							</div>
								<span style="float:right">共：<b id="totalid"></b>类</span>
							</div>
							   <br/>
		   <div class="row form-inline" align="left" style="margin-top:20px;">
			<div class="col-md-12">
				      分类名称： <input type="text" class="form-control" id="str1id"
					placeholder="请输入分类名称"> 
			
				  <button class="btn btn-default" id="selectwith">
					<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
					查询
				</button>
				
				  
	       <span style="float:right; margin-right:10px">每页显示:<select id="selectid" class="form-control">
			   <option>5</option>
			   <option>20</option>
			   <option>50</option>
			   <option>100</option>
			</select>条</span> 
	    
	   
			</div>
			
			
		</div>					
							
							
			<div class="Ads_lists">
				
			 <!-- 表格开始 -->
		<div class="row" style="margin-top:10px;">
			<div class="col-md-12">
				<div class="table-responsive">
					<table class="table table-hover table-bordered text-center table-striped" id="sample-table">
						<thead id="head">
						</thead>
						<tbody id="table_data">


						</tbody>
					</table>
				</div>
			</div>
			
	</div>  
		<!--分页信息  -->
		<div class="row">
			<div class="col-md-7" id="page_text"></div>
			<div class="col-md-5" id="page_nav"></div>
		</div>	
				
			
			
			
				
			</div>
		</div>

	
	


	</div>	




<script type="text/javascript">
	window.onload = function() {
			new uploadPreview({
				UpBtn : "up_img",
				ImgShow : "imgShow"
			});
		};
var totalRecord, currentNum,str="",ta=5,adsid=0;
	/* 分页 */
	$(function() {
		go(1, "",5,0);
		
		$("#old_delete_all_btn").attr("disabled", true);
	});
	function go(pn,str,ta,id) {
		$("#old_delete_all_btn").attr("disabled", true);
		layer.msg('数据加载中...', {
				icon : 16,
				shade : 0.01
			});
		$.ajax({
			url : "${APP_PATH}/adslist/selectalladslist",
			data : {
				"pn" : pn,
				"str" : str,
				"ta" : ta,
				"id" : id,
			},
			type : "GET",
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
		$("#totalid").text(totalRecord);
		currentNum = result.extend.pageInfo.pageNum;
	}
	//解析显示分页条信息
	function build_page_nav(result) {
		$("#page_nav").empty();
		var ul = $("<ul></ul>").addClass("pagination");
		var firstPageLi = $("<li></li>").append($("<a></a>").append("首页"));
		firstPageLi.click(function() {
			go(1, str,ta,adsid);
		});
		var prePageLi = $("<li></li>").append(
				$("<a></a>").append("&laquo;"));
		if (result.extend.pageInfo.hasPreviousPage == false) {
			firstPageLi.addClass("disabled");
			prePageLi.addClass("disabled");
		} else {
			//为元素添加点击翻页事件
			prePageLi
					.click(function() {
						go(result.extend.pageInfo.pageNum - 1, str,ta,adsid);
					});
		}
		var nextPageLi = $("<li></li>").append(
				$("<a></a>").append("&raquo;"));
		var lastPageLi = $("<li></li>").append($("<a></a>").append("末页"));
		lastPageLi.click(function() {
			go(result.extend.pageInfo.pages, str,ta,adsid);
		});
		if (result.extend.pageInfo.hasNextPage == false) {
			nextPageLi.addClass("disabled");
			lastPageLi.addClass("disabled");
		} else {
			//为元素添加点击翻页事件
			nextPageLi
					.click(function() {
						go(result.extend.pageInfo.pageNum + 1,str,ta,adsid);
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
				go(item,str,ta,adsid);
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
		
		var checkBox = $("<td width='25px'></td>").append(
				$("<input type='checkbox' id='check_item_all'/>"));
		var Td1 = $("<td width='80px'></td>").append("ID");
		var Td2 = $("<td width='130px'></td>").append("分类");
		var Td3 = $("<td width='60px'></td>").append("排序");
		var Td4 = $("<td width='240px'></td>").append("图片");
		var Td5 = $("<td width='150px'></td>").append("尺寸（大小）");
		var Td6 = $("<td width='250px'></td>").append("链接地址");
		var Td7 = $("<td width='180px'></td>").append("加入时间");
		var Td8 = $("<td width='70px'></td>").append("状态");
		var Td9 = $("<td width='250px'></td>").append("操作");
		headTR.append(checkBox).append(Td1).append(Td2).append(Td3).append(
				Td4).append(Td5).append(Td6).append(Td7).append(Td8).append(Td9).appendTo($("#head"));

		$
				.each(
						result.extend.pageInfo.list,
						function(index, item) {
							var checkBoxTd = $("<td><input type='checkbox' class='check_item'/></td>");
							var ty1 = $("<td></td>").append(item.id);
							var ty2 = $("<td></td>").append(item.sortname);
							var ty3 = $("<td></td>").append("<input type='text' id='sortchangeid' style='width:50px'>");
							
							 ty3.find("input").attr("value", item.sort);
							 ty3.find("input").attr("inputid",item.id);
							var ty4 = $("<td></td>").append("<img  width='240' height='100'/>");
							 ty4.find("img").attr("src",item.sortphoto);
							var ty5 = $("<td></td>").append(item.sortsize);
						    var ty6 = $("<td></td>").append("<a id='aid'></a>");
						   
						     ty6.find("a").attr("href",item.sorthref);
						     ty6.find("a").append(item.sorthref);
						    var ty7 = $("<td></td>").append(ChangeDateFormat(item.sortjointime));
						    var ty8 = $("<td></td>").append(item.sortstate);
						            
							var Stopstart = $("<button></button>")
									.addClass(
											"stopright")
									.append(
											$("<span></span>"));
											
							// $(this).parents("tr").find(".spanclass").removeClass("glyphicon glyphicon-check bigger-120");
							//				
								if(item.sortstate=="显示"){
								   Stopstart.addClass("btn btn-xs btn-success");
								   Stopstart.find("span").addClass("glyphicon glyphicon-check  bigger-120  spanclass");
								   Stopstart.attr("stateid", "显示");
								}else{
								    Stopstart.addClass("btn btn-xs btn-default");
								    Stopstart.find("span").addClass("glyphicon glyphicon-remove  bigger-120  spanclass"); 
								    Stopstart.attr("stateid", "隐藏");
								}							

							//为启动与关闭按钮添加一个自定义的属性，
							Stopstart.attr("edit-id", item.id);
							var delBtn = $("<button></button>")
									.addClass(
											"btn btn-xs btn-danger delete_btn")
									.append(
											$("<span></span>")
													.addClass(
															"glyphicon glyphicon-trash  bigger-120"));
                                  
							//为删除按钮添加一个自定义的属性，来表示当前删除员工的id
							delBtn.attr("del-id", item.id);
						
							var btnTd = $("<td class='td-manage'></td>").append(Stopstart)
									.append(" ").append(delBtn);
							//append方法执行完成以后还是返回原来的元素							              								              
							$("<tr></tr>").append(checkBoxTd).append(ty1)
									.append(ty2).append(ty3).append(ty4)
									.append(ty5).append(ty6).append(ty7).append(ty8).append(btnTd)
									.appendTo("#table_data");
						});
	}


		function ChangeDateFormat(d) {
			//将时间戳转为int类型，构造Date类型
			if (d != null) {
				var date = new Date(parseInt(d));

				//月份得+1，且只有个位数时在前面+0
				var month = date.getMonth() + 1 + "-";

				//日期为个位数时在前面+0
				var currentDate = date.getDate();
				
				var house=date.getHours();
				var min=date.getMinutes();
                 if(min<10){
                   min="0"+min;
                 }
				//getFullYear得到4位数的年份 ，返回一串字符串
				return date.getFullYear() + "-" + month + currentDate+"  "+house+":"+min;
			} else {
				return null;
			}

		}



   //点击搜索
		$("#selectwith").click(function() {
                  str=$("#str1id").val();
			  go(1,str,ta,adsid);
                
		});
		  //每页显示条数
    $("#selectid").change(function(){
           ta=$("#selectid").val();
           str=$("#str1id").val();
           go(1,str,ta,adsid);
    
    });
		
		//全选
		$(document).on("click", "#check_item_all", function() {
			$(".check_item").prop("checked", $(this).prop("checked"));

			if ($("#check_item_all").prop("checked") == true) {
				$("#old_delete_all_btn").attr("disabled", false);
			} else {
				$("#old_delete_all_btn").attr("disabled", true);
			}
		});

		$(document)
				.on(
						"click",
						".check_item",
						function() {

							var flag = $(".check_item:checked").length == $(".check_item").length;
							$("#check_item_all").prop("checked", flag);
							if ($(".check_item:checked").length > 0) {
								$("#old_delete_all_btn")
										.attr("disabled", false);
							} else {
								$("#old_delete_all_btn").attr("disabled", true);
							}
						});
						
	//点击删除   
		$(document).on("click", ".delete_btn", function() {
			var delid = $(this).attr("del-id");
			var oldername = $(this).parents("tr").find("td:eq(2)").text();
			layer.confirm("确认删除【" + oldername + "】吗", function(index) {
				$.ajax({
					url : "${APP_PATH}/adslist/deleteadslistbyid/" + delid,
					type : "DELETE",
					success : function(result) {
						
						  go(currentNum,str,ta,adsid);
						layer.msg(result.msg);
					}
				});
			});
		});

//点击删除全部，就批量删除
		$("#old_delete_all_btn")
				.click(
						function() {
							//alert();
							var empNames = "";
							var del_idstr = "";
							$.each($(".check_item:checked"), function() {
								//索引为2，就是第3个td.
								empNames += $(this).parents("tr").find(
										"td:eq(2)").text()
										+ ",";
								//alert(empNames);
								//组装员工id字符串
								del_idstr += $(this).parents("tr").find(
										"td:eq(1)").text()
										+ "-";
								//alert($(this).parents("tr").find("td:eq(2)").text());
								//alert(del_idstr);

							});

							//去除empNames多去的逗号
							empNames = empNames.substring(0,
									empNames.length - 1);
							//去除多余的删除员工-
							del_idstr = del_idstr.substring(0,
									del_idstr.length - 1);
							layer
									.confirm(
											"确认删除【" + empNames + "】吗",
											function(index) {
												//发送ajax请求
												$
														.ajax({
															url : "${APP_PATH}/adslist/deletealladslist/"
																	+ del_idstr,
															type : "DELETE",
															success : function(
																	result) {
																//回到当前页面
																  go(currentNum,str,ta,adsid);
																layer.msg(result.msg);

															}
														});
											});
						});	
						
						
//停用与启用
	
	$(document).on("click", ".stopright", function() {
	var delid = $(this).attr("edit-id");
	var  stateid=$(this).attr("stateid");
	if(stateid=="显示"){
		
	layer.confirm('确认要隐藏吗？',
								{
								icon : 0,
							},
				function() {

				  layer.msg('隐藏!', {
							icon : 5,
							time : 2000
						});
		         $.ajax({
					url : "${APP_PATH}/adslist/updatesortadswithstop/" + delid,
					type : "POST",
					success : function() {
				 
						 go(currentNum,str,ta,adsid);
					}

				});

			});
	
	}else{
	
	layer.confirm('确认要显示吗？',
								{
								icon : 0,
							},
				function() {

				  layer.msg('显示!', {
							icon : 6,
							time : 2000
						});
		         $.ajax({
					url : "${APP_PATH}/adslist/updatesortadswithstop/" + delid,
					type : "POST",
					success : function() {
				 
						 go(currentNum,str,ta,adsid);

					}

				});

			});
	
	
	}
	


		});		
		
	
		
	
	//排序
	
	$(document).on("change","#sortchangeid",function() {
	      var num=$("#sortchangeid").val();
	      var inputid = $(this).attr("inputid");
	   $.ajax({
						url : "${APP_PATH}/adslist/updatesortnum/" + inputid+"&"+num,
						type : "POST",

						success : function(result) {

							if (result.code == 100) {
							
								layer.msg("排序成功！");
							}
						}
					});

	});
//点击总数
  $("#totaldid").click(function(){
       adsid=0;
  go(1,str,ta,adsid);
  
  
  });
       


function gogo(n){
adsid= n;
  go(1,str,ta,adsid);
  
}



</script>






   <script>
		//初始化宽度、高度  
		$(".widget-box").height($(window).height());
		$(".Ads_list").width($(window).width() - 220);
		//当文档窗口发生改变时 触发  
		$(window).resize(function() {
			$(".widget-box").height($(window).height());
			$(".Ads_list").width($(window).width() - 220);
		});
		$(function() {
			$("#advertising").fix({
				float : 'left',
				//minStatue : true,
				skin : 'green',
				durationTime : false,
				stylewidth : '220',
				spacingw : 30,//设置隐藏时的距离
				spacingh : 250,//设置显示时间距
				set_scrollsidebar : '.Ads_style',
				table_menu : '.Ads_list'
			});
		});
		
	</script>
	<!-- <script type="text/javascript">
		function updateProgress(file) {
			$('.progress-box .progress-bar > div').css('width',
					parseInt(file.percentUploaded) + '%');
			$('.progress-box .progress-num > b').html(
					SWFUpload.speed.formatPercent(file.percentUploaded));
			if (parseInt(file.percentUploaded) == 100) {
				// 如果上传完成了
				$('.progress-box').hide();
			}
		}

		function initProgress() {
			$('.progress-box').show();
			$('.progress-box .progress-bar > div').css('width', '0%');
			$('.progress-box .progress-num > b').html('0%');
		}

		function successAction(fileInfo) {
			var up_path = fileInfo.path;
			var up_width = fileInfo.width;
			var up_height = fileInfo.height;
			var _up_width, _up_height;
			if (up_width > 120) {
				_up_width = 120;
				_up_height = _up_width * up_height / up_width;
			}
			$(".logobox .resizebox").css({
				width : _up_width,
				height : _up_height
			});
			$(".logobox .resizebox > img").attr('src', up_path);
			$(".logobox .resizebox > img").attr('width', _up_width);
			$(".logobox .resizebox > img").attr('height', _up_height);
		}

		var swfImageUpload;
		$(document)
				.ready(
						function() {
							var settings = {
								flash_url : "./static/shop/Widget/swfupload/swfupload.swf",
								flash9_url : "./static/shop/Widget/swfupload/swfupload_fp9.swf",
								upload_url : "upload.php",// 接受上传的地址
								file_size_limit : "5MB",// 文件大小限制
								file_types : "*.jpg;*.gif;*.png;*.jpeg;",// 限制文件类型
								file_types_description : "图片",// 说明，自己定义
								file_upload_limit : 100,
								file_queue_limit : 0,
								custom_settings : {},
								debug : false,
								// Button settings
								button_image_url : "./static/shop/Widget/swfupload/upload-btn.png",
								button_width : "95",
								button_height : "30 ",
								button_placeholder_id : 'uploadBtnHolder',
								button_window_mode : SWFUpload.WINDOW_MODE.TRANSPARENT,
								button_cursor : SWFUpload.CURSOR.HAND,
								button_action : SWFUpload.BUTTON_ACTION.SELECT_FILE,

								moving_average_history_size : 40,

								// The event handler functions are defined in handlers.js
								swfupload_preload_handler : preLoad,
								swfupload_load_failed_handler : loadFailed,
								file_queued_handler : fileQueued,
								file_dialog_complete_handler : fileDialogComplete,
								upload_start_handler : function(file) {
									initProgress();
									updateProgress(file);
								},
								upload_progress_handler : function(file,
										bytesComplete, bytesTotal) {
									updateProgress(file);
								},
								upload_success_handler : function(file, data,
										response) {
									// 上传成功后处理函数
									var fileInfo = eval("(" + data + ")");
									successAction(fileInfo);
								},
								upload_error_handler : function(file,
										errorCode, message) {
									alert('上传发生了错误！');
								},
								file_queue_error_handler : function(file,
										errorCode, message) {
									if (errorCode == -110) {
										alert('您选择的文件太大了。');
									}
								}
							};
							swfImageUpload = new SWFUpload(settings);
						});
	</script>  -->
<!-- <script>
		jQuery(function($) {
			var oTable1 = $('#sample-table').dataTable({
				"aaSorting" : [ [ 1, "desc" ] ],//默认第几个排序
				"bStateSave" : true,//状态保存
				"aoColumnDefs" : [
				//{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
				{
					"orderable" : false,
					"aTargets" : [ 0, 2, 3, 4, 5, 7, 8, ]
				} // 制定列不参与排序
				]
			});

			$('table th input:checkbox').on(
					'click',
					function() {
						var that = this;
						$(this).closest('table').find(
								'tr > td:first-child input:checkbox').each(
								function() {
									this.checked = that.checked;
									$(this).closest('tr').toggleClass(
											'selected');
								});

					});

			$('[data-rel="tooltip"]').tooltip({
				placement : tooltip_placement
			});
			function tooltip_placement(context, source) {
				var $source = $(source);
				var $parent = $source.closest('table')
				var off1 = $parent.offset();
				var w1 = $parent.width();

				var off2 = $source.offset();
				var w2 = $source.width();

				if (parseInt(off2.left) < parseInt(off1.left)
						+ parseInt(w1 / 2))
					return 'right';
				return 'left';
			}
		})
	</script> -->
</body>
</html>