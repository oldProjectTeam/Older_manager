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
<script src="${APP_PATH}/static/layui/layui.js" type="text/javascript"></script>
<script src="${APP_PATH}/static/shop/js/jquery-1.9.1.min.js"></script>
<%-- <script src="${APP_PATH}/static/shop/assets/js/bootstrap.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/typeahead-bs2.min.js"></script> --%>
<!-- page specific plugin scripts -->
<script src="${APP_PATH}/static/shop/assets/js/jquery.dataTables.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/jquery.dataTables.bootstrap.js"></script>
<script type="text/javascript" src="${APP_PATH}/static/shop/js/H-ui.js"></script>
<script type="text/javascript" src="${APP_PATH}/static/shop/js/H-ui.admin.js"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js" type="text/javascript"></script>
<script type="text/javascript" src="${APP_PATH}/static/shop/Widget/zTree/js/jquery.ztree.all-3.5.min.js"></script>
 
 
<script src="${APP_PATH}/static/shop/js/lrtk.js" type="text/javascript"></script>
<link href="${APP_PATH}/static/layui/css/layui.css" rel="stylesheet" />


</head>

<body>
	<div class=" page-content clearfix">
		<div id="products_style">
			<div class="search_style">
				 <!--搜索部分  -->
					<div class="demoTable">
					 产品名称：
					  <div class="layui-inline">
					    
					    <input class="layui-input" name="name" id="name" autocomplete="off">
					  </div>
				日期时间范围
					  <div class="layui-inline">
					      
					      <div class="layui-input-inline">
					        <input type="text" class="layui-input" id="test10" placeholder=" - ">
					      </div>
					    </div>
					  <button class="layui-btn" data-type="reload">搜索</button>
				</div>
			</div>
			<div class="border clearfix">
				<span class="l_f"> 
					<a href="picture-add" title="添加商品"
					class="btn btn-warning Order_form"><i class="icon-plus"></i>添加商品</a>
				</span> 
				<div class="layui-btn-group demoTable">
					  <button class="layui-btn layui-btn-radius" data-type="getCheckData"><i class="layui-icon"></i>批量删除</button>
				</div>
				 
			</div>
			<div class="row panel" style="border: solid;border-color:#C0C0C0; border-width:1px;">
				<div class="col-md-2" >
					<div id="treeDemo" class="ztree"></div>
				</div>
				<div class="col-md-10" style="border-left: solid;border-color:#C0C0C0; border-width:1px;">
					<table   class="layui-table" id="idTest" lay-filter="demo">
					</table>
				</div>
			</div>	 
		</div>
	</div>
	
<script>
 
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

	/**************/
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
					/* layer.msg('加载中', {
						icon : 16,
						shade : 0.01,
						time : 1000,
						offset : [ '20%' ],
					}); */
					
					//刷新表格
					table1.reload('testReload', {
				        where: {
				            typeId:treeNode.id
				        }
					});
					if (treeNode.isParent) {

						zTree.expandNode(treeNode);

						return false;
					} else {

						return true;
					}
				}
			}
		};
		var zNodes = [];

		function types() {

			$.ajax({
				url : "${APP_PATH}/productType/findAllProductType",
				type : "POST",
				success : function(result) {
					$("#treeDemo").empty();
					zNodes = [];
					$.each(result.extend.productTypes, function(index, item) {
						if (item.id == 1) {
							zNodes.push({
								"id" : item.id,
								"pId" : item.parentid,
								"name" : item.name,
								"open" : true
							});
						} else {
							zNodes.push({
								"id" : item.id,
								"pId" : item.parentid,
								"name" : item.name
							});
						}
					});
					var t = $("#treeDemo");

					t = $.fn.zTree.init(t, setting, zNodes);

					demoIframe = $("#testIframe");
					var zTree = $.fn.zTree.getZTreeObj("tree");
					zTree.selectNode(zTree.getNodeByParam("id", '14'));
				}
			});
		}
		var code;
		function showCode(str) {
			if (!code)
				code = $("#code");
			code.empty();
			code.append("<li>" + str + "</li>");
		}

		$(document).ready(function() {
			types();
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
		parent.layer.close(index);

	});
	
</script>

   <!--表格工具栏  -->
<script type="text/html" id="barDemo">
	  <a class="layui-btn layui-btn-primary layui-btn-mini" lay-event="state">设置状态</a>
	  <a class="layui-btn layui-btn-mini" lay-event="auditstatus">审核通过</a>
	  <a class="layui-btn layui-btn-mini" lay-event="edit">编辑</a>
	  
	  <a class="layui-btn layui-btn-danger layui-btn-mini" lay-event="del">删除</a>
	</script>

<!--产品名称templet模板  -->
<script type="text/html" id="nameTpl">
	  <a href="javascript:;" onClick="to_detail({{d.id}})" class="layui-table-link">{{d.name}}</a>
	</script>
 
<!--审核auditstatus模板  -->
<script type="text/html" id="auditstatusTpl">
	    {{#  if(d.auditstatus==0){ }}
          <span class="layui-bg-gray">正在审核</span>
        {{#  } else if(d.auditstatus==1) { }}
          <span class="layui-bg-blue">审核通过</span>
        {{#  } }}
	</script>
<!--产品状态state templet模板  --> 
<script type="text/html" id="stateTpl">
		{{# if(d.state==0){ }}
         <span class="layui-bg-red">停用</span>
        {{# } else if(d.state==1){ }}
		 <span class="layui-bg-green">启用</span>
        {{# } }}

</script>

<!--添加时间 templet模板  --> 
<script type="text/javascript" id="addtimeTpl">
	 {{ChangeDateFormat2(d.addtime)}}
</script>    

<script>
	
	//产品详细跳转事件
function to_detail(id){
		 
		layer.open({
			  title:"产品信息详细",
			  type: 2,
			  area: ['700px', '550px'],
			  fixed: false, //不固定
			  maxmin: true,
			  offset: 't',
			  content: 'shopping/productDetail.action?id='+id
		});
	}
	var table1;
	
layui.use(['laydate', 'laypage', 'table'], function(){
	  var table = layui.table;
	  table1=table;
	  
	  var laydate=layui.laydate;
	  
	  
	//日期时间范围
	  laydate.render({
	    elem: '#test10'
	    ,type: 'datetime'
	    ,range: true
	  });
	//方法级渲染
	  table.render({
	    elem: '#idTest'
	    ,url:'shopping/getAllproduct'
	    ,cols: [[
	      {checkbox: true, fixed: true}
	      ,{field:'id', title: 'ID', width:70, sort: true}
	      ,{field:'number', width:135,title:'编号'}
	      ,{field:'name', width:150,templet: '#nameTpl',title:'名称'}
	      ,{field:'orprice', width:65, sort: true,title:'原价'}
	      ,{field:'orprice', width:65, sort: true,title:'现价'}
	      ,{field:'region', width:118,title:'所属地区/国家'}
	      ,{field:'addtime', width:160,templet:'#addtimeTpl', sort: true,title:'加入时间'}
	      ,{field:'auditstatus', width:100,templet:'#auditstatusTpl', sort: true,title:'审核状态'}
	      ,{field:'state', width:80,templet:'#stateTpl', sort: true,title:'状态'}
	      ,{fixed: 'right', width:250, align:'center', toolbar: '#barDemo',title:'操作'}
	    ]]
	    ,id: 'testReload'
	    ,page: true
	    ,height:500
	     
	  });
	  
	
	  table.on('tool(demo)', function(obj){ //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
		    var data = obj.data //获得当前行数据
		    ,layEvent = obj.event; //获得 lay-event 对应的值
		    if(layEvent === 'state'){
		    	var value=data.state;
		    	if(value==1){
		    		value=0;
		    	}else{
		    		value=1;
		    	} 
		    	//像服务器发送更改状态指令
		    	$.ajax({
		        	url:"${APP_PATH}/shopping/updateState.action?id="+data.id,
		        	data:"state="+value,
		        	type:"get",
		        	success:function(result){
		        		if(result.code==100){
		        			//修改列中状态显示
		    		    	obj.update({
		    		    		state:value
		    		    	});
		        		}else{
		        			layer.msg('设置失败！',{
		        				 icon:5,
		        				 time:1000,
		        				 offset:['30%']
		        			 });
		        		}
		        	}
		        });
		    	
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
		       window.location.href="${APP_PATH}/shopping/product_edit.action?id="+data.id;
		    }else if(layEvent==='auditstatus'){
		    	var value=data.auditstatus;
		    	if(value==1){
		    		value=0;
		    	}else{
		    		value=1;
		    	} 
		    	//像服务器发送更改状态指令
		    	$.ajax({
		        	url:"${APP_PATH}/shopping/updateState.action?id="+data.id,
		        	data:"auditstatus="+value,
		        	type:"get",
		        	success:function(result){
		        		if(result.code==100){
		        			//修改列中状态显示
		    		    	obj.update({
		    		    		auditstatus:value
		    		    	});
		        		}else{
		        			layer.msg('设置失败！',{
		        				 icon:5,
		        				 time:1000,
		        				 offset:['30%']
		        			 });
		        		}
		        	}
		        });
		    }
		  });

	  //监听表格复选框选择
	  /* table.on('checkbox(demo)', function(obj){
	    console.log(obj);
	  }); */
	  var $ = layui.$, active = {
			  reload: function(){
			      var name=$('#name');
			      var time=$("#test10").val();
			      var addtime=time.substring(0,20);
			      var addtime1=time.substring(21,time.length);
			       
			      table.reload('testReload', {
			        where: {
			            name:name.val(),
			            addtime:addtime,
			            addtime1:addtime1,
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
     
	function ChangeDateFormat2(d) {
		//将时间戳转为int类型，构造Date类型
		if (d != null) {
			var date = new Date(parseInt(d));

			//月份得+1，且只有个位数时在前面+0
			var month = date.getMonth() + 1 + "-";

			//日期为个位数时在前面+0
			var currentDate = date.getDate();
			
			var currenthours=date.getHours();
			
			var currentminut=date.getMinutes();
			
			var currentSeconds=date.getSeconds();
			//getFullYear得到4位数的年份 ，返回一串字符串
			return date.getFullYear() + "-" + month + currentDate+" "+currenthours+":"+currentminut+":"+currentSeconds;
		} else {
			return null;
		}
	}
	      
</script>
 
</body>
</html>