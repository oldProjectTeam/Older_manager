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

<title>分类管理</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="${APP_PATH}/static/shop/assets/css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" href="${APP_PATH}/static/shop/css/style.css" />
<link href="${APP_PATH}/static/shop/assets/css/codemirror.css" rel="stylesheet">
<link rel="stylesheet" href="${APP_PATH}/static/shop/assets/css/ace.min.css" />
<link rel="stylesheet" href="${APP_PATH}/static/shop/Widget/zTree/css/zTreeStyle/zTreeStyle.css"
	type="text/css">
<link rel="stylesheet" href="${APP_PATH}/static/shop/assets/css/font-awesome.min.css" />

<!--[if IE 7]>
		  <link rel="stylesheet" href="${APP_PATH}/static/shop/assets/css/font-awesome-ie7.min.css" />
		<![endif]-->
<!--[if lte IE 8]>
		  <link rel="stylesheet" href="${APP_PATH}/static/shop/assets/css/ace-ie.min.css" />
		<![endif]-->
<script src="${APP_PATH}/static/shop/assets/js/jquery.min.js"></script>
<!-- <![endif]-->
<!--[if IE]>
       <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        <![endif]-->
<!--[if !IE]> -->
<script type="text/javascript">
	window.jQuery
			|| document.write("<script src='./static/shop/assets/js/jquery-2.0.3.min.js'>"
					+ "<"+"/script>");
</script>
<!-- <![endif]-->
<!--[if IE]>
<script type="text/javascript">
 window.jQuery || document.write("<script src='./static/shop/assets/js/jquery-1.10.2.min.js'>"+"<"+"/script>");
</script>
<![endif]-->
<script src="${APP_PATH}/static/shop/assets/js/ace-elements.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/ace.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/bootstrap.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/typeahead-bs2.min.js"></script>
<script type="text/javascript"
	src="${APP_PATH}/static/shop/Widget/zTree/js/jquery.ztree.all-3.5.min.js"></script>
<script src="${APP_PATH}/static/shop/js/lrtk.js" type="text/javascript"></script>
</head>

<body>
	<div class=" clearfix">
		<div id="category">
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
			<!---->
			<iframe ID="testIframe" Name="testIframe" FRAMEBORDER=0
				SCROLLING=AUTO SRC="product-category-add"
				class="page_right_style">
			</iframe>
		</div>
	</div>

	<script type="text/javascript">
		$(function() {
			$("#category").fix({
				float : 'left',
				//minStatue : true,
				skin : 'green',
				durationTime : false
			});
		});
	</script>
	<script type="text/javascript">
		//初始化宽度、高度  
		$(".widget-box").height($(window).height());
		$(".page_right_style").width($(window).width() - 220);
		//当文档窗口发生改变时 触发  
		$(window).resize(function() {
			$(".widget-box").height($(window).height());
			$(".page_right_style").width($(window).width() - 220);
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
					 
					demoIframe.attr("src","productType/product-category-add.action?id="+treeNode.id);
					 
					if (treeNode.isParent) {
						
						zTree.expandNode(treeNode);
						
						return false;
					} else {
						 
						return true;
					}
				}
			}
		};
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
		
		 
		var code;

		function showCode(str) {
			if (!code)
				code = $("#code");
			code.empty();
			code.append("<li>" + str + "</li>");
		}

		$(document).ready(function() {
			types();
			
			/* var t = $("#treeDemo");
			t = $.fn.zTree.init(t, setting, zNodes);
			demoIframe = $("#testIframe");
			demoIframe.bind("load", loadReady);
			var zTree = $.fn.zTree.getZTreeObj("tree");
			zTree.selectNode(zTree.getNodeByParam("id", '14')); */
			
		});
	</script>
</body>
</html>