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

<title>品牌管理</title>

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
<script src="${APP_PATH}/static/shop/assets/dist/echarts.js"></script>
<script src="${APP_PATH}/static/shop/js/lrtk.js" type="text/javascript"></script>
</head>
<body>
	<div class="page-content clearfix">
		<div id="brand_style">
			<div class="search_style">
				<div class="title_names">搜索查询</div>
				<ul class="search_content clearfix">
					<li><label class="l_f">品牌名称</label><input name="" type="text"
						class="text_add" placeholder="输入品牌名称" style=" width:250px" /></li>
					<li><label class="l_f">添加时间</label><input
						class="inline laydate-icon" id="start" style=" margin-left:10px;"></li>
					<li><select name="" class="text_add"><option
								value="1">国内品牌</option>
							<option value="2">国外品牌</option></select></li>
					<li style="width:90px;"><button type="button"
							class="btn_search">
							<i class="icon-search"></i>查询
						</button></li>
				</ul>
			</div>
			<div class="border clearfix">
				<span class="l_f"> <a href="Add_Brand" title="添加品牌"
					class="btn btn-warning Order_form"><i class="icon-plus"></i>添加品牌</a>
					<a href="javascript:ovid()" class="btn btn-danger"><i
						class="icon-trash"></i>批量删除</a> <a href="javascript:ovid()"
					class="btn btn-info">国内品牌</a> <a href="javascript:ovid()"
					class="btn btn-success">国外品牌</a>
				</span> <span class="r_f">共：<b>234</b>个品牌
				</span>
			</div>
			<!--品牌展示-->
			<div class="brand_list clearfix" id="category">
				<div class="show_btn" id="rightArrow">
					<span></span>
				</div>
				<div class="chart_style side_content">
					<div class="side_title">
						<a title="隐藏" class="close_btn"><span></span></a>
					</div>
					<div id="main" style="height:300px;" class="side_list"></div>
				</div>
				<!--品牌列表-->
				<div class="table_menu_list">
					<table class="table table-striped table-bordered table-hover"
						id="sample-table">
						<thead>
							<tr>
								<th width="25px"><label><input type="checkbox"
										class="ace"><span class="lbl"></span></label></th>
								<th width="80px">ID</th>
								<th width="50px">排序</th>
								<th width="120px">品牌LOGO</th>
								<th width="120px">品牌名称</th>
								<th width="130px">所属地区/国家</th>
								<th width="350px">描述</th>
								<th width="180px">加入时间</th>
								<th width="70px">状态</th>
								<th width="200px">操作</th>
							</tr>
						</thead>
						<tbody id="brand_table_tbody">
							 
						</tbody>
					</table>
				</div>
			</div>

		</div>
	</div>

<script type="text/javascript">
	//开始进入页面，默认加载数据
	$(function(){
		to_page(1,10);
	});
	function to_page(pageNum,pageSize){
		$.ajax({
			url:"${APP_PATH}/brand/findAllBrand.action?pageNum="+pageNum+"&pageSize="+pageSize,
			type:"POST",
			success:function(result){
				if(result.code==100){
					//构建表格信息
					 build_table(result);
					//构建分页信息
					//build_page_info(result);
				}
			}
		});
	}
   function build_table(result){
	   //先清空表格
	   $("#brand_table_tbody").empty();
	   $.each(result.extend.pageInfo.list,function(index,item){
		   
		   //第一列
		   var input=$("<input type='checkbox' class='ace' />").attr("id",item.id);
		   var lable=$("<label></lable>");
		   var span=$("<span class='lbl'></span>");
		   lable.append(input).append(span);
		   var td1=$("<td width='25px'></td>");
		   td1.append(lable);
		   //第二列
		   var td2=$("<td width='80px'></td>").append(item.brandid);
		   
		   //第三列
		   var input2=$("<input type='text' class='input-text text-c' style='width:60px'>").val(item.sort);
		   var td3=$("<td width='50px'></td>").append(input2);
		   
		   //第四列
		   var td4=$("<td></td>");
		   var img=$("<img width='130' />");
		   if(item.logoimage==undefined||item.logoimage==''||item.logoimage==null){
			   img.attr("src","${APP_PATH}/upload/152.jpg");
		   }else{
			   img.attr("src","${APP_PATH}/"+item.logoimage);
		   }
		   td4.append(img);
		   
		   //第五列
		   var td5=$("<td></td>");
		   var a=$("<a href='javascript:ovid()' name='Brand_detailed.html'"+
					"style='cursor:pointer' class='text-primary brond_name'"+
					"onclick='generateOrders('561');' title='玉兰油OLAY'></a>").append(item.name);
		    td5.append(a);
		    
		  //第六列
		   var td6=$("<td></td>").append(item.region);
		   //第七列
		   var td7=$("<td class='text-l'></td>").append(item.description);
		   //第八列
		   var td8=$("<td></td>").append(ChangeDateFormat2(item.addtime));
		   var td9=$("<td class='td-status'></td>")
		   .append($("<span  class='label label-success radius'>已启用</span>"));
		   
		   var td10=$("<td class='td-manage'></td>");
		   var a1=$("<a onClick='member_stop(this,'10001')' href='javascript:;'"+
			"title='停用' class='btn btn-xs btn-success'><i "+
			"class='icon-ok bigger-120'></i></a>");
		   var a2=$("<a title='编辑' onclick='member_edit('编辑','member-add.html','4','','510')'"+
						"href='javascript:;' class='btn btn-xs btn-info'><i "+
							"class='icon-edit bigger-120'></i></a>");
			 
	 		var a3=$("<a title='删除' href='javascript:;' onclick='member_del(this,'1')' "+
	 					"class='btn btn-xs btn-warning'><i "+
	 						"class='icon-trash  bigger-120'></i></a>");
	 		td10.append(a1).append(a2).append(a3);
	 		
	 		var tr=$("<tr></tr>").append(td1).append(td2).append(td3)
	 		.append(td4).append(td5).append(td6).append(td7).append(td8)
	 		.append(td9).append(td10);
	 		$("#brand_table_tbody").append(tr);
   });
	  	 
   }

</script>



	<script>
		jQuery(function($) {
			var oTable1 = $('#sample-table').dataTable({
				"aaSorting" : [ [ 1, "desc" ] ],//默认第几个排序
				"bStateSave" : true,//状态保存
				"aoColumnDefs" : [
				//{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
				{
					"orderable" : false,
					"aTargets" : [ 0, 1, 3, 4, 5, 6, 8, 9 ]
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
		});

		//初始化宽度、高度  
		$(".chart_style").height($(window).height() - 215);
		$(".table_menu_list").height($(window).height() - 215);
		$(".table_menu_list ").width($(window).width() - 440);
		//当文档窗口发生改变时 触发  
		$(window).resize(function() {
			$(".chart_style").height($(window).height() - 215);
			$(".table_menu_list").height($(window).height() - 215);
			$(".table_menu_list").width($(window).width() - 440);
		});
		//图层隐藏限时参数		 
		$(function() {
			$("#category").fix({
				float : 'left',
				//minStatue : true,
				skin : 'green',
				durationTime : false,
				stylewidth : '400',
				spacingw : 30,//设置隐藏时的距离
				spacingh : 440,//设置显示时间距
			});
		});
		//面包屑返回值
		var index = parent.layer.getFrameIndex(window.name);
		parent.layer.iframeAuto(index);
		$('.Order_form ,.brond_name').on('click', function() {
			var cname = $(this).attr("title");
			var cnames = parent.$('.Current_page').html();
			var herf = parent.$("#iframe").attr("src");
			parent.$('#parentIframe span').html(cname);
			parent.$('#parentIframe').css("display", "inline-block");
			parent.$('.Current_page').attr("name", herf).css({
				"color" : "#4c8fbd",
				"cursor" : "pointer"
			});
			//parent.$('.Current_page').html("<a href='javascript:void(0)' name="+herf+">" + cnames + "</a>");
			parent.layer.close(index);

		});
		function generateOrders(id) {
			window.location.href = "Brand_detailed.html?=" + id;
		};
		/*品牌-查看*/
		function member_show(title, url, id, w, h) {
			layer_show(title, url, w, h);
		}
		/*品牌-停用*/
		function member_stop(obj, id) {
			layer
					.confirm(
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

		/*用户-启用*/
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
		/*品牌-编辑*/
		function member_edit(title, url, id, w, h) {
			layer_show(title, url, w, h);
		}

		/*品牌-删除*/
		function member_del(obj, id) {
			layer.confirm('确认要删除吗？', function(index) {
				$(obj).parents("tr").remove();
				layer.msg('已删除!', {
					icon : 1,
					time : 1000
				});
			});
		}
		laydate({
			elem : '#start',
			event : 'focus'
		});
	</script>
	<script type="text/javascript">
		require.config({
			paths : {
				echarts : './static/shop/assets/dist'
			}
		});
		require([ 'echarts', 'echarts/chart/pie', // 按需加载所需图表，如需动态类型切换功能，别忘了同时加载相应图表
		'echarts/chart/funnel' ], function(ec) {
			var myChart = ec.init(document.getElementById('main'));

			option = {
				title : {
					text : '国内国外品牌比例',
					subtext : '',
					x : 'center'
				},
				tooltip : {
					trigger : 'item',
					formatter : "{a} <br/>{b} : {c} ({d}%)"
				},
				legend : {
					orient : 'vertical',
					x : 'left',
					data : [ '国内品牌', '国外品牌' ]
				},
				toolbox : {
					show : false,
					feature : {
						mark : {
							show : false
						},
						dataView : {
							show : false,
							readOnly : false
						},
						magicType : {
							show : true,
							type : [ 'pie', 'funnel' ],
							option : {
								funnel : {
									x : '25%',
									width : '50%',
									funnelAlign : 'left',
									max : 545
								}
							}
						},
						restore : {
							show : true
						},
						saveAsImage : {
							show : true
						}
					}
				},
				calculable : true,
				series : [ {
					name : '品牌数量',
					type : 'pie',
					radius : '55%',
					center : [ '50%', '60%' ],
					data : [ {
						value : 335,
						name : '国内品牌'
					}, {
						value : 210,
						name : '国外品牌'
					},

					]
				} ]
			};
			myChart.setOption(option);
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