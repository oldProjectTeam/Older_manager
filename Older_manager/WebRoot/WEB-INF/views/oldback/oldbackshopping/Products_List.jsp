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

<%-- <script src="${APP_PATH}/static/shop/assets/js/bootstrap.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/typeahead-bs2.min.js"></script> --%>
<!-- page specific plugin scripts -->
<script src="${APP_PATH}/static/shop/assets/js/jquery.dataTables.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/jquery.dataTables.bootstrap.js"></script>
<script type="text/javascript" src="${APP_PATH}/static/shop/js/H-ui.js"></script>
<script type="text/javascript" src="${APP_PATH}/static/shop/js/H-ui.admin.js"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js" type="text/javascript"></script> 
<script src="${APP_PATH}/static/shop/assets/laydate/laydate.js" type="text/javascript"></script>
<script src="${APP_PATH}/static/shop/js/lrtk.js" type="text/javascript"></script>
<link href="${APP_PATH}/static/layui/css/layui.css" rel="stylesheet" />

         
<script type="text/javascript" src="${APP_PATH}/static/shop/Widget/zTree/js/jquery.ztree.all-3.5.min.js"></script>
	
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
					<div class="layui-btn-group demoTable">
					  <button class="layui-btn" data-type="getCheckData">批量删除</button>
					</div>
					 
					<table   class="layui-table" id="idTest" lay-filter="demo">
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
		 
		var t = $("#treeDemo");
		t = $.fn.zTree.init(t, setting, zNodes);
		demoIframe = $("#testIframe");
		demoIframe.bind("load", loadReady);
		var zTree = $.fn.zTree.getZTreeObj("tree");
		zTree.selectNode(zTree.getNodeByParam("id", '11'));
	});
		
		
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
	
	 
	 
	 
	
</script>
   
	<script type="text/html" id="barDemo">
	  <a class="layui-btn layui-btn-primary layui-btn-mini" lay-event="state">设置状态</a>
	  <a class="layui-btn layui-btn-mini" lay-event="state">审核通过</a>
	  <a class="layui-btn layui-btn-mini" lay-event="edit">编辑</a>
	  
	  <a class="layui-btn layui-btn-danger layui-btn-mini" lay-event="del">删除</a>
	</script>
	<script type="text/html" id="nameTpl">
	  <a href="javascript:;" onClick="to_detail({{d.id}})" class="layui-table-link">{{d.name}}</a>
	</script>
	           
	<script src="${APP_PATH}/static/layui/layui.js" type="text/javascript"></script>
<script src="${APP_PATH}/static/shop/js/jquery-1.9.1.min.js"></script>

	
	<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
	<script>
	
	function to_detail(id){
		 
		layer.open({
			  type: 2,
			  area: ['700px', '550px'],
			  fixed: false, //不固定
			  maxmin: true,
			  offset: 't',
			  content: 'shopping/productDetail.action?id='+id
		});
	}
	
	
	
	layui.use(['laydate', 'laypage', 'table'], function(){
	  var table = layui.table;
	//方法级渲染
	  table.render({
	    elem: '#idTest'
	    ,url:'shopping/getAllproduct'
	    ,cols: [[
	      {checkbox: true, fixed: true}
	      ,{field:'id', title: 'ID', width:80, sort: true}
	      ,{field:'number', width:135,title:'编号'}
	      ,{field:'name', width:150,templet: '#nameTpl',title:'名称'}
	      ,{field:'orprice', width:70, sort: true,title:'原价'}
	      ,{field:'orprice', width:70, sort: true,title:'现价'}
	      ,{field:'region', width:125,title:'所属地区/国家'}
	      ,{field:'addtime', width:135, sort: true,title:'加入时间'}
	      ,{field:'auditstatus', width:100, sort: true,title:'审核状态'}
	      ,{field:'state', width:100, sort: true,title:'状态'}
	      ,{fixed: 'right', width:250, align:'center', toolbar: '#barDemo',title:'操作'}
	    ]]
	    ,id: 'testReload'
	    ,page: true
	    ,height:500
	    ,width:850
	  });
	  
	  
	  
	  table.on('tool(demo)', function(obj){ //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
		    var data = obj.data //获得当前行数据
		    ,layEvent = obj.event; //获得 lay-event 对应的值
		    if(layEvent === 'detail'){
		      layer.msg('查看操作');
		    } else if(layEvent === 'del'){
		      layer.confirm('真的要删除么',{offset:['30%']}, function(index){
		        obj.del(); //删除对应行（tr）的DOM结构
		        layer.close(index);
		        //向服务端发送删除指令
		        $.ajax({
		        	url:"${APP_PATH}/shopping/deleteProduct.action?ids="+data.id,
		        	type:"get",
		        	success:function(result){
		        		if(result.code==100){
		        			 layer.msg('删除成功！',{
		        				 icon:6,
		        				 time:1000,
		        				 offset:['30%']
		        			 });
		        			 
		        		}else{
		        			layer.msg('删除失败！',{
		        				 icon:5,
		        				 time:1000,
		        				 offset:['30%']
		        			 });
		        		}
		        	}
		        });
		      });
		    } else if(layEvent === 'edit'){
		      layer.msg('编辑操作');
		    }
		  });

	  //监听表格复选框选择
	  table.on('checkbox(demo)', function(obj){
	    console.log(obj);
	  });
	  var $ = layui.$, active = {
			  reload: function(){
			      var demoReload = $('#demoReload');
			      table.reload('testReload', {
			        where: {
			          key: {
			            id: demoReload.val()
			          }
			        }
			   });
			}
		  ,
	      getCheckData: function(){ //获取选中数据
	      var checkStatus = table.checkStatus('testReload')
	      ,data = checkStatus.data;
	      if(data.length<1)return false;
	      layer.confirm("真要批量删除吗？",{offset:['30%']},function(index){ 
		      layer.close(index);
	    	  var ids="";
			  var d=JSON.stringify(data);
	    	  $.each(eval("("+d+")"),function(index,item){ 
	    		  ids+=item.id+"-";
	    	  });
	    	  ids=ids.substring(0,ids.length-1);
	    	  
	    	  //向服务器发送批量删除请求
	    	  $.ajax({
		        	url:"${APP_PATH}/shopping/deleteProduct.action?ids="+ids,
		        	type:"get",
		        	success:function(result){
		        		if(result.code==100){
		        			 layer.msg('删除成功！',{
		        				 icon:6,
		        				 time:1000,
		        				 offset:['30%']
		        			 });
		        			 table.reload('testReload');
		        		}else{
		        			layer.msg('删除失败！',{
		        				 icon:5,
		        				 time:1000,
		        				 offset:['30%']
		        			 });
		        		}
		        	}
		        });
	      });
	    }
	    
	  };
	  
	   
	  
	  $('.demoTable .layui-btn').on('click', function(){
	    var type = $(this).data('type');
	    active[type] ? active[type].call(this) : '';
	  });
	});

	      
	</script>
 
</body>
</html>