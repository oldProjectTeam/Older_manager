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

<title>产品列表</title>

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
<link href="${APP_PATH}/static/shop/assets/css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" href="${APP_PATH}/static/shop/css/style.css" />
<link rel="stylesheet" href="${APP_PATH}/static/shop/assets/css/ace.min.css" />
<link rel="stylesheet" href="${APP_PATH}/static/shop/assets/css/font-awesome.min.css" />
<link rel="stylesheet" href="${APP_PATH}/static/shop/Widget/zTree/css/zTreeStyle/zTreeStyle.css"
	type="text/css">
<link href="${APP_PATH}/static/shop/Widget/icheck/icheck.css" rel="stylesheet" type="text/css" />
<!--[if IE 7]>
		  <link rel="stylesheet" href="${APP_PATH}/static/shop/assets/css/font-awesome-ie7.min.css" />
		<![endif]-->
<!--[if lte IE 8]>
		  <link rel="stylesheet" href="${APP_PATH}/static/shop/assets/css/ace-ie.min.css" />
		<![endif]-->
<script src="${APP_PATH}/static/shop/js/jquery-1.9.1.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/bootstrap.min.js"></script>
 <script src="${APP_PATH}/static/shop/assets/js/typeahead-bs2.min.js"></script>
<!-- page specific plugin scripts -->
<script src="${APP_PATH}/static/shop/assets/js/jquery.dataTables.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/jquery.dataTables.bootstrap.js"></script>
<script type="text/javascript" src="${APP_PATH}/static/shop/js/H-ui.js"></script>
<script type="text/javascript" src="${APP_PATH}/static/shop/js/H-ui.admin.js"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js" type="text/javascript"></script>
<script src="${APP_PATH}/static/shop/assets/laydate/laydate.js" type="text/javascript"></script>
<script type="text/javascript"
	src="${APP_PATH}/static/shop/Widget/zTree/js/jquery.ztree.all-3.5.min.js"></script>
<script src="${APP_PATH}/static/shop/js/lrtk.js" type="text/javascript"></script>

</head>

<body>
	<div class=" page-content clearfix">
		<div id="products_style">
			<div class="search_style">
				<div class="title_names">搜索查询</div>
				<form  id="select_produts_form" method="post">
					<label>产品名称</label>
					<input name="name" type="text" class="text_add" placeholder="输入品牌名称" style=" width:250px" />
					<label>添加时间区为</label>
					<input class="inline laydate-icon " name="addtime" type="date" id="start" style=" margin-left:10px;">
					<label>—></label>
					<input class="inline laydate-icon " name="addtime1" type="date"  style=" margin-left:10px;">
					<button type="button" id="btn_select" >
							<i class="icon-search"></i>查询
					</button>
				</form>
			</div>
			<div class="border clearfix">
				<span class="l_f"> 
					<a href="picture-add" title="添加商品"
					class="btn btn-warning Order_form"><i class="icon-plus"></i>添加商品</a>
					<a  class="btn btn-danger" id="delete_products_info">
					<i class="icon-trash"></i>批量删除</a>
				</span> 
				<span class="r_f" id="shopNum"></span>
			</div>
			<!--产品列表展示-->
			<div class="h_products_list clearfix" id="products_list">
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
								<h4 class="lighter smaller">产品类型列表</h4>
							</div>
							<div class="widget-body">
								<div class="widget-main padding-8">
									<div id="treeDemo" class="ztree"></div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="table_menu_list" id="testIframe">
					<table class="table table-striped table-bordered table-hover"
						id="sample-table">
						<thead>
							<tr>
								<th width="25px"><label><input type="checkbox" class="all_check"
										class="ace"><span class="lbl"></span></label></th>
								<th width="80px">产品编号</th>
								<th width="250px">产品名称</th>
								<th width="100px">原价格</th>
								<th width="100px">现价</th>
								<th width="100px">所属地区/国家</th>
								<th width="180px">加入时间</th>
								<th width="80px">审核状态</th>
								<th width="70px">状态</th>
								<th width="200px">操作</th>
							</tr>
						</thead>
						<tbody>
					
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	
	<script>
	jQuery(function($) {
		var oTable1 = $('#sample-table').dataTable({
			"aaSorting" : [ [ 1, "desc" ] ],//默认第几个排序
			"bStateSave" : true,//状态保存
			"aoColumnDefs" : [
			//{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
			{
				"orderable" : false,
				"aTargets" : [ 0, 2, 3, 4, 5, 8, 9 ]
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
								$(this).closest('tr').toggleClass('selected');
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

			if (parseInt(off2.left) < parseInt(off1.left) + parseInt(w1 / 2))
				return 'right';
			return 'left';
		}
	});
	laydate({
		elem : '#start',
		event : 'focus'
	});
	$(function() {
		$("#products_style").fix({
			float : 'left',
			//minStatue : true,
			skin : 'green',
			durationTime : false,
			spacingw : 30,//设置隐藏时的距离
			spacingh : 260,//设置显示时间距
		});
		
		
	});
</script>
<script type="text/javascript">
	//初始化宽度、高度  
	$(".widget-box").height($(window).height() - 215);
	$(".table_menu_list").width($(window).width() - 260);
	$(".table_menu_list").height($(window).height() - 215);
	//当文档窗口发生改变时 触发  
	$(window).resize(function() {
		$(".widget-box").height($(window).height() - 215);
		$(".table_menu_list").width($(window).width() - 260);
		$(".table_menu_list").height($(window).height() - 215);
	})

	/*******树状图*******/
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
					demoIframe.attr("src", treeNode.file + ".html");
					return true;
				}
			}
		}
	};

	var zNodes = [ {
		id : 1,
		pId : 0,
		name : "商城分类列表",
		open : true
	}, {
		id : 11,
		pId : 1,
		name : "蔬菜水果"
	}, {
		id : 111,
		pId : 11,
		name : "蔬菜"
	}, {
		id : 112,
		pId : 11,
		name : "苹果"
	}, {
		id : 113,
		pId : 11,
		name : "大蒜"
	}, {
		id : 114,
		pId : 11,
		name : "白菜"
	}, {
		id : 115,
		pId : 11,
		name : "青菜"
	}, {
		id : 12,
		pId : 1,
		name : "手机数码"
	}, {
		id : 121,
		pId : 12,
		name : "手机 "
	}, {
		id : 122,
		pId : 12,
		name : "照相机 "
	}, {
		id : 13,
		pId : 1,
		name : "电脑配件"
	}, {
		id : 131,
		pId : 13,
		name : "手机 "
	}, {
		id : 122,
		pId : 13,
		name : "照相机 "
	}, {
		id : 14,
		pId : 1,
		name : "服装鞋帽"
	}, {
		id : 141,
		pId : 14,
		name : "手机 "
	}, {
		id : 42,
		pId : 14,
		name : "照相机 "
	}, ];

	var code;

	function showCode(str) {
		if (!code)
			code = $("#code");
		code.empty();
		code.append("<li>" + str + "</li>");
	}

	$(document).ready(function() {
		$("#sample-table_info").empty();
		$("#sample-table_paginate").empty();
		$("#sample-table_length").empty();
		var t = $("#treeDemo");
		t = $.fn.zTree.init(t, setting, zNodes);
		demoIframe = $("#testIframe");
		demoIframe.bind("load", loadReady);
		var zTree = $.fn.zTree.getZTreeObj("tree");
		zTree.selectNode(zTree.getNodeByParam("id", '11'));
	});
		
		
	/*产品-停用*/
	function member_stop(obj, id) {
		layer.confirm(
						'确认要停用吗？',
						function(index) {
							$(obj)
									.parents("tr")
									.find(".td-manage")
									.prepend(
											'<a style="text-decoration:none" class="btn btn-xs " onClick="member_start(this,id)" href="javascript:;" title="启用"><i class="icon-ok bigger-120"></i></a>');
							$(obj)
									.parents("tr")
									.find(".td-status")
									.html(
											'<span class="label label-defaunt radius">已停用</span>');
							$(obj).remove();
							layer.msg('已停用!', {
								icon : 5,
								time : 1000
							});
						});
	}

	/*产品-启用*/
	function member_start(obj, id) {
		layer
				.confirm(
						'确认要启用吗？',
						function(index) {
							$(obj)
									.parents("tr")
									.find(".td-manage")
									.prepend(
											'<a style="text-decoration:none" class="btn btn-xs btn-success" onClick="member_stop(this,id)" href="javascript:;" title="停用"><i class="icon-ok bigger-120"></i></a>');
							$(obj)
									.parents("tr")
									.find(".td-status")
									.html(
											'<span class="label label-success radius">已启用</span>');
							$(obj).remove();
							layer.msg('已启用!', {
								icon : 6,
								time : 1000
							});
						});
	}
	/*产品-编辑*/
	function member_edit(title, url, id, w, h) {
		layer_show(title, url, w, h);
	}

	/*产品-删除*/
	function member_del(obj, id) {
		layer.confirm('确认要删除吗？', function(index) {
			$(obj).parents("tr").remove();
			layer.msg('已删除!', {
				icon : 1,
				time : 1000
			});
		});
	}
	//面包屑返回值
	var index = parent.layer.getFrameIndex(window.name);
	parent.layer.iframeAuto(index);
	$('.Order_form').on('click', function() {
		var cname = $(this).attr("title");
		var chref = $(this).attr("href");
		var cnames = parent.$('.Current_page').html();
		var herf = parent.$("#iframe").attr("src");
		parent.$('#parentIframe').html(cname);
		parent.$('#iframe').attr("src", chref).ready();
		;
		parent.$('#parentIframe').css("display", "inline-block");
		parent.$('.Current_page').attr({
			"name" : herf,
			"href" : "javascript:void(0)"
		}).css({
			"color" : "#4c8fbd",
			"cursor" : "pointer"
		});
		//parent.$('.Current_page').html("<a href='javascript:void(0)' name="+herf+" class='iframeurl'>" + cnames + "</a>");
		parent.layer.close(index);

	});
	
	//加载商品信息
	var pageNum="";
	function products_info(result){
		$("#sample-table tbody").empty();
		pageNum=result.extend.pageInfo.pageNum;
		$.each(result.extend.pageInfo.list,function(index,item){
			var checktd=$("<td><input type='checkbox' class='item_check'/></td>");
			var proNum=$("<td></td>").append(item.number).attr("state_num",item.state);
			var proName=$("<td></td>").append(item.name);
			var proOrPrice=$("<td></td>").append(item.orprice);
			var proNowPrice=$("<td></td>").append(item.nowprice);
			var proRegion=$("<td></td>").append(item.region);
			var proAddtime=$("<td></td>").append(item.addtime);
			var proAuditStatus=$("<td></td>").append(item.auditstatus==1?"通过":"等待审核");
			var	proState=$("<td></td>").append(item.state==1?"已启用":"已停用");
			var startBtn='';
			if(item.state==1){
				startBtn=$("<button title='停用'></button>").addClass("btn btn-success btn-sm block_btn")
				.append("<span class='icon-ok' aria-hidden='true'></span>");
				 
				startBtn.click(function(){
					product_stop(this,item.number);
				});
			}else{
				startBtn=$("<button title='启用'></button>").addClass("btn btn-default btn-sm block_btn")
				.append("<span class='icon-remove' aria-hidden='true'></span>");
				 
				startBtn.click(function(){
					product_start(this,item.number);
				});
				
			}
			
			var updatBtn=$("<button title='编辑'></button>").addClass("btn btn-warning btn-sm compile_btn")
			.append("<span class='icon-edit' aria-hidden='true'></span>");
			var deleteBtn=$("<button title='删除'></button>").addClass("btn btn-danger btn-sm delet_produt_btn")
			.append("<span class='icon-trash' aria-hidden='true'></span>");;
			var btntd=$("<td></td>").append(startBtn).append(updatBtn).append(deleteBtn);
			$("<tr></tr>").append(checktd).append(proNum).append(proName)
					  .append(proOrPrice).append(proNowPrice)
					  .append(proRegion).append(proAddtime)
					  .append(proAuditStatus).append(proState)
					  .append(btntd)
					  .appendTo("#sample-table tbody");
		});
	}
	//分页信息
	function page_info(result){
		$("#sample-table_info").empty();
		$("#shopNum").empty();
		$("#sample-table_info").append("第&nbsp;&nbsp;"+result.extend.pageInfo.pageNum+"&nbsp;&nbsp;页");
		$("#shopNum").append("共：<b>"+result.extend.pageInfo.total+"</b>件商品");
	}
	//分页条
	function prod_page_num(result){
		$("#sample-table_paginate").empty();
		var pageUl=$("<ul></ul>").addClass("pagination");
		var firsPage=$("<li></li>").append($("<a></a>").append("首页"));
		var prePage=$("<li></li>").append($("<a></a>").append("&laquo;"));
		
		if(result.extend.pageInfo.hasPreviousPage==false){
			firsPage.addClass("disabled");
			prePage.addClass("disabled");
		}else{//点击跳到上一页或首页
			firsPage.click(function(){
				page_send_info(1);
			});
			prePage.click(function(){
				page_send_info(result.extend.pageInfo.pageNum-1);
			});
		}
		
		pageUl.append(firsPage).append(prePage);
		$.each(result.extend.pageInfo.navigatepageNums,function(index,item){
			var pagenumli=$("<li></li>").append($("<a></a>").append(item));
			if(result.extend.pageInfo.pageNum==item){
				pagenumli.addClass("active");
			}
			//点击跳到该页
			pagenumli.click(function(){
				page_send_info(item);
			});
		   pageUl.append(pagenumli);
		});
		
		var lastPrePage=$("<li></li>").append($("<a></a>").append("&raquo;"));
		var lastPage=$("<li></li>").append($("<a></a>").append("末页"));
		if(result.extend.pageInfo.hasNextPage==false){
			lastPrePage.addClass("disabled");
			lastPage.addClass("disabled");
		}else{
			//点击跳到下一页或尾页
			lastPrePage.click(function(){
				page_send_info(result.extend.pageInfo.pageNum+1);
				page_send_info(result.extend.pageInfo.pages);
			});
		}
		pageUl.append(lastPrePage).append(lastPage).appendTo("#sample-table_paginate");
	}
	
	//产品停用
	function product_stop(obj,produtNumber){
		 
		layer.confirm("你确定要停用吗",{
			offset:['25%']
		},function(index){
			layer.msg('正在停用', {
				  icon: 16,
				  offset:['25%']
				  ,shade: 0.01
				});
			$.ajax({
				url:"${APP_PATH}/shopping/updateProduct/"+produtNumber,
				data:"state=0",
				type:"POST",
				success:function(result){	
					if(result.code==100){
						layer.msg('已停用!', {
							icon : 5,
							offset:['25%'],
							time : 1000
						});
					  $(obj).parents("tr").find("td:eq(8)").html("已停用");
					  $(obj).unbind("click");
					  $(obj).find("span").removeClass("icon-ok");
					  $(obj).find("span").addClass("icon-remove");
					  $(obj).removeClass("btn-success");
					  $(obj).addClass("btn-default");
					   
					  
					  $(obj).click(function(){
						  product_start(obj,produtNumber);
					  });
						
					}else{
						layer.msg('修改失败!', {
							icon : 5,
							offset:['25%'],
							time : 1000
						});
					}
								
				}
			});
			
		});
	}
	
	//产品启用
	function product_start(obj,produtNumber){
		layer.confirm("你确定要启用吗?",{
			offset:['25%']
		},function(index){
			layer.msg('正在启用', {
				  icon: 16
				  ,shade: 0.01,
				  offset:['25%'],
			 });
			$.ajax({
				url:"${APP_PATH}/shopping/updateProduct/"+produtNumber,
				data:"state=1",
				type:"POST",
				success:function(result){
					if(result.code==100){
						$(obj).parents("tr").find("td:eq(8)").html("已启用");
						$(obj).addClass("btn-success");
						$(obj).removeClass("btn-default");
						$(obj).find("span").removeClass("icon-remove");
					    $(obj).find("span").addClass("icon-ok");
						$(obj).unbind("click");
						$(obj).click(function(){
							  product_stop(obj,produtNumber);
						  });
						layer.msg('已启用!', {
							icon :6,
							offset:['25%'],
							time : 1000
						});
					}else{
						layer.msg('修改失败!', {
							icon : 5,
							offset:['25%'],
							time : 1000
						});
					}
				}
			});
		});
	}
	
	 
	 
	//页面打开就加载数据
	 $.ajax({
		url:"${APP_PATH}/shopping/products",
		type:"GET",
		success:function(result){
			//console.log(result);
			//加载商品信息
			products_info(result);
			//分页信息
			page_info(result);
			//分页条
			prod_page_num(result);
		}
	}); 
	//点击分页发送ajax
	function page_send_info(pn){
		 $.ajax({
				url:"${APP_PATH}/shopping/products",
				type:"GET",
				data:"pn="+pn,
				success:function(result){
					//console.log(result);
					//加载商品信息
					products_info(result);
					//分页信息
					page_info(result);
					//分页条
					prod_page_num(result);
				}
			}); 
	}
	
	//点击查询提交信息并查询
	$("#btn_select").click(function(){
		 
		$.ajax({
			url:"${APP_PATH}/shopping/proCondition.action?pn=1",
			type:"POST",
			data: $("#select_produts_form").serialize(),
			success:function(result){
				 
				console.log(result);
			 	 //加载商品信息
				products_info(result);
				//分页信息
				page_info(result);
				//分页条
				prod_page_num(result);  
			}
		});
	});
	//全选或全不选
	$(".all_check").click(function(){
		$(".item_check").prop("checked",$(".all_check").prop("checked"));
	});
	//当有一个复选框没有被选中就不全选，全选时复选框为全选
	$(document).on("click",".item_check",function(){
		var flag=$(".item_check:checked").length==$(".item_check").length;
		
		$(".all_check").prop("checked",flag);
		
	});
	
	//批量删除
	$("#delete_products_info").click(function(){
		if($(".item_check:checked").length!=0){
			var prodName="";
			var prodNumber="";
			$.each($(".item_check:checked"),function(){
				prodName+=$(this).parents("tr").find("td:eq(2)").text()+",";
				prodNumber+=$(this).parents("tr").find("td:eq(1)").text()+"-";
			});
			prodName.substring(0,prodName.length-1);
			prodNumber.substring(0,prodNumber.length-1);
			
			if(confirm("你确定要删除{"+prodName+"}吗？")){
				$.ajax({
					url:"${APP_PATH}/shopping/deleteProduct/"+prodNumber,
					type:"DELETE",
					success:function(result){
						if(result.code==100){
							layer.msg("删除成功！",{
								icon:6,
								offset:["25%"],
								time:1000
							});
							
						}else{
							layer.msg('删除失败!', {
								icon : 5,
								offset:['25%'],
								time : 1000
							});
						}
					}
				});
			}
		}else{
			layer.msg("亲，请选择要删除的产品！",{
				icon:6,
				offset:["25%"],
				time:1000
			});
			 
		}
	});
	
	//点击删除
	$(document).on("click",".delet_produt_btn",function(){
		var produName=$(this).parents("tr").find("td:eq(2)").text();
		var produNumber=$(this).parents("tr").find("td:eq(1)").text();
		layer.confirm("你确定要删除{"+produName+"}吗?",{
			offset:['20%']
		},function(index){
			$.ajax({
				url:"${APP_PATH}/shopping/deleteProduct/"+produNumber,
				type:"DELETE",
				success:function(result){
					if(result.code==100){
						layer.msg("删除成功！",{
							icon:6,
							offset:["25%"],
							time:1000
						});
						
					}else{
						layer.msg('删除失败!', {
							icon : 5,
							offset:['25%'],
							time : 1000
						});
					}
				}
			});
		});
		
	});
</script>
</body>
</html>