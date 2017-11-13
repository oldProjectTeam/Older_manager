<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String path = request.getContextPath();
	pageContext.setAttribute("APP_PATH", request.getContextPath());
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>订单管理</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link href="${APP_PATH}/static/shop/assets/css/bootstrap.min.css"
	rel="stylesheet" />
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
<script src="${APP_PATH}/static/shop/assets/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${APP_PATH}/static/shop/js/H-ui.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/typeahead-bs2.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/jquery.dataTables.min.js"></script>
<script
	src="${APP_PATH}/static/shop/assets/js/jquery.dataTables.bootstrap.js"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>
<script src="${APP_PATH}/static/shop/assets/dist/echarts.js"></script>
<script src="${APP_PATH}/static/shop/assets/laydate/laydate.js"
	type="text/javascript"></script>
<script
	src="${APP_PATH}/static/shop/assets/js/jquery.easy-pie-chart.min.js"></script>
<script src="${APP_PATH}/static/shop/js/lrtk.js" type="text/javascript"></script>
</head>

<body>
	<div class="margin clearfix">
		<div class="Order_form clearfix" id="Order_form_style">
			<div class="title_name">
				购物产品所占比例 <span class="top_show_btn Statistic_btn">显示</span> <span
					class="Statistic_title Statistic_btn"><a title="隐藏"
					class="top_close_btn">隐藏</a></span>
			</div>
			<div class="hide_style clearfix" id="ratioDiv"></div>
		</div>

		<!--订单表格-->
		<div class="order_list" id="order_list">
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
								<h4 class="lighter smaller">订单类型分类</h4>
							</div>
							<div class="widget-body">
								<ul class="b_P_Sort_list" id="sort_type">
								</ul>
							</div>
						</div>
					</div>
				</div>
				<!--订单列表-->
				<div class="table_menu_list order_style" id="table_order_list">
					<div class="search_style">
						<div class="title_names">搜索查询</div>
						<ul class="search_content clearfix">
							<li><label class="l_f">订单编号</label><input id="text_id"
								type="text" class="text_add" placeholder="订单订单编号"
								style=" width:250px"></li>
							<li><label class="l_f">时间</label><input
								class="inline laydate-icon" id="start" style="margin-left:10px;" /></li>
							<li style="width:90px;"><button type="button" id="search"
									class="btn_search">
									<i class="fa fa-search"></i>查询
								</button></li>
						</ul>
					</div>
					<!--订单列表展示-->
					<table class="table table-striped table-bordered table-hover"
						id="sample-table">
						<thead>
							<tr>
								<!-- <th width="25px"><label><input type="checkbox"
										id="check_item_all" class="ace"><span class="lbl"></span></label></th> -->
								<th width="120px">订单编号</th>
								<th width="250px">产品名称</th>
								<th width="100px">总价</th>
								<th width="100px">订单时间</th>
								<th width="80px">数量</th>
								<th width="70px">状态</th>
								<th width="200px">操作</th>
							</tr>
						</thead>
						<tbody id="table_data">
						</tbody>
					</table>
					<!--分页信息  -->
					<div class="row">
						<div class="col-md-7" id="page_text">&nbsp;&nbsp;</div>
						<div class="col-md-5" id="page_nav"></div>
					</div>
				</div>
			</div>
		</div>
		<!--发货-->
		<div id="Delivery_stop" style=" display:none">
			<div class="">
				<div class="content_style">
					<div class="form-group">
						<label class="col-sm-2 control-label no-padding-right"
							for="form-field-1">快递公司 </label>
						<div class="col-sm-9">
							<select class="form-control" id="form-field-select-1">
								<option value="">--选择快递--</option>
								<option value="1">天天快递</option>
								<option value="2">圆通快递</option>
								<option value="3">中通快递</option>
								<option value="4">顺丰快递</option>
								<option value="5">申通快递</option>
								<option value="6">邮政EMS</option>
								<option value="7">邮政小包</option>
								<option value="8">韵达快递</option>
							</select>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label no-padding-right"
							for="form-field-1"> 快递号 </label>
						<div class="col-sm-9">
							<input type="text" id="form-field-1" placeholder="快递号"
								class="col-xs-10 col-sm-5" style="margin-left:0px;">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label no-padding-right"
							for="form-field-1">货到付款 </label>
						<div class="col-sm-9" style="margin-top: 8px;">
							<label><input name="checkbox" type="checkbox" class="ace"
								id="checkbox"><span class="lbl"></span></label>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		//左侧显示隐藏
		$(function() {
			$("#order_list").fix({
				float : 'left',
				//minStatue : true,
				skin : 'green',
				durationTime : false,
				spacingw : 50,//设置隐藏时的距离
				spacingh : 270,//设置显示时间距
				close_btn : '.close_btn',
				show_btn : '.show_btn',
				side_list : '.side_list',
			});
		});
		//顶部隐藏显示
		$(function() {
			$("#Order_form_style").fix({
				float : 'top',
				//minStatue : true,
				skin : 'green',
				durationTime : true,
				spacingw : 0,
				spacingh : 0,
				close_btn : '.top_close_btn',
				show_btn : '.top_show_btn',
				side_list : '.hide_style',
				close_btn_width : 80,
				side_title : '.Statistic_title',
			});
		});
		//时间选择
		laydate({
			elem : '#start',
			event : 'focus'
		});
		/*订单-删除*/
		function Order_form_del(obj, id) {
			layer.confirm('确认要删除吗？', function(index) {
				$(obj).parents("tr").remove();
				layer.msg('已删除!', {
					icon : 1,
					time : 1000
				});
			});
		}
		/**发货**/
		function Delivery_stop(obj, id) {
			layer
					.open({
						type : 1,
						title : '发货',
						maxmin : true,
						shadeClose : false,
						area : [ '500px', '' ],
						content : $('#Delivery_stop'),
						btn : [ '确定', '取消' ],
						yes : function(index, layero) {
							if ($('#form-field-1').val() == "") {
								layer.alert('快递号不能为空！', {
									title : '提示框',
									icon : 0,
								})

							} else {
								layer
										.confirm(
												'提交成功！',
												function(index) {
													$(obj)
															.parents("tr")
															.find(".td-manage")
															.prepend(
																	'<a style=" display:none" class="btn btn-xs btn-success" onClick="member_stop(this,id)" href="javascript:;" title="已发货"><i class="fa fa-cubes bigger-120"></i></a>');
													$(obj)
															.parents("tr")
															.find(".td-status")
															.html(
																	'<span class="label label-success radius">已发货</span>');
													$(obj).remove();
													layer.msg('已发货!', {
														icon : 6,
														time : 1000
													});
												});
								layer.close(index);
							}

						}
					})
		};
		//面包屑返回值
		var index = parent.layer.getFrameIndex(window.name);
		parent.layer.iframeAuto(index);
		$('.Order_form,.order_detailed').on('click', function() {
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

		//初始化宽度、高度
		$(".hide_style").height($(".hide_style").height());
		var heights = $(".hide_style").outerHeight(true) + 90;
		$(".widget-box").height($(window).height() - heights);
		$(".table_menu_list").width($(window).width() - 250);
		$(".table_menu_list").height($(window).height() - heights);
		//当文档窗口发生改变时 触发  
		$(window).resize(function() {
			$(".widget-box").height($(window).height() - heights);
			$(".table_menu_list").width($(window).width() - 250);
			$(".table_menu_list").height($(window).height() - heights);
		})
		//比例
		var oldie = /msie\s*(8|7|6)/.test(navigator.userAgent.toLowerCase());
		$('.easy-pie-chart.percentage').each(function() {
			$(this).easyPieChart({
				barColor : $(this).data('color'),
				trackColor : '#EEEEEE',
				scaleColor : false,
				lineCap : 'butt',
				lineWidth : 10,
				animate : oldie ? false : 1000,
				size : 103
			}).css('color', $(this).data('color'));
		});

		$('[data-rel=tooltip]').tooltip();
		$('[data-rel=popover]').popover({
			html : true
		});
	</script>
	<script type="text/javascript">
		//完成全选/全不选
		//完成全选、全部选功能
		$(document).on("click", "#check_item_all", function() {
			$(".check_item").prop("checked", $(this).prop("checked"));

			if ($("#check_item_all").prop("checked") == true) {
				$("#add").attr("disabled", false);
			} else {
				$("#add").attr("disabled", true);
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
								$("#add").attr("disabled", false);
							} else {
								$("#add").attr("disabled", true);
							}
						});

		//加载订单占比
		layer.msg('数据加载中...', {
			icon : 16,
			shade : 0.01
		});
		$(function() {
			$
					.ajax({
						url : "order/orderRatio",
						type : "GET",
						success : function(result) {
							$
									.each(
											result.extend.list,
											function(index, item) {
												var outDiv = $("<div></div>")
														.addClass("proportion");
												var inDiv = $("<div></div>")
														.attr("data-percent",
																"20").attr(
																"data-color",
																"#D15B47");
												inDiv
														.append(
																$(
																		"<span></span>")
																		.addClass(
																				"percent")
																		.append(
																				item.orderRatio))
														.append("%");
												var inSpan = $("<span></span>")
														.addClass("name")
														.append(
																item.orderOfType);
												outDiv.append(inDiv).append(
														inSpan).appendTo(
														$("#ratioDiv"));

												var li = $("<li></li>")
														.append(
																$("<i></i>")
																		.addClass(
																				"orange  fa fa-reorder"))
														.append(
																$("<a></a>")
																		.append(
																				item.orderOfType
																						+ (item.orderOfTypeNum)));
												$("#sort_type").append(li);
											});
						}
					});
			go(1);
		});

		function go(pn, id) {
			$.ajax({
				url : "order/queryAllOrderWithJson",
				data : {
					"pn" : pn
				},
				type : "GET",
				success : function(result) {
					build_page_text(result);
					//构建分页条
					build_page_nav(result);
					//构建表格数据
					build_table_data(result);
				}
			});
		}
		function build_table_data(result) {
			$("#table_data").empty();
			$.each(result.extend.pageInfo.list,
					function(index, item) {
						var dataTR = $("<tr></tr>");
						var checkBoxData = $("<td></td>").addClass(
								"text-center").append(
								$("<lable></lable>").append(
										$("<input type='checkbox'/>").addClass(
												"ace check_item")).append(
										$("<span></span>").addClass("lbl")));
						var dataTd1 = $("<td></td>").append(item.orderNo);
						var dataTd2 = $("<td></td>").addClass(
								"order_product_name").append(item.subject);
						var dataTd3 = $("<td></td>").append(item.cost);
						var dataTd4 = $("<td></td>").append(
								ChangeDateFormat(item.creattime));

						var dataTd5 = $("<td></td>").append(item.num);
						var dataTd6 = $("<td></td>").addClass("td-status")
								.append(
										$("<span></span>").addClass(
												"label label-success radius")
												.append(item.state));

						var send_btn = $("<a></a>")
								.attr("href", "javascript:;").attr("title",
										"发货")
								.addClass("btn btn-xs btn-success").append(
										$("<i></i>").addClass(
												"fa fa-cubes bigger-120"));
						var find_btn = $("<a></a>")
								.attr("href", "javascript:;").attr("title",
										"订单详细").addClass(
										"btn btn-xs btn-info order_detailed")
								.append(
										$("<i></i>").addClass(
												"fa fa-list bigger-120"));
						var del_btn = $("<a></a>").attr("href", "javascript:;")
								.attr("title", "删除").addClass(
										"btn btn-xs btn-warning").append(
										$("<i></i>").addClass(
												"fa fa-trash  bigger-120"));
						send_btn.attr("orderId", item.id);
						send_btn.attr("state", item.state);
						find_btn.attr("orderId", item.id);
						del_btn.attr("orderId", item.id);

						//发货
						send_btn.click(function() {
							if(send_btn.attr("state")=='待发货'){
								Delivery_stop($(this), send_btn.attr("orderId"));
							}else if(send_btn.attr("state")=='待付款'){
								layer.msg("这个订单还没有付款呢,不能发货");
							}else{
								layer.msg("这个订单已经发过货了");
							}
						});

						//单个item删除事件
						del_btn.click(function() {
							Order_form_del($(this), del_btn.attr("orderId"));
						});
						dataTR.append(dataTd1).append(
								dataTd2).append(dataTd3).append(dataTd4)
								.append(dataTd5).append(dataTd6).append(
										$("<td></td>").append(send_btn).append(del_btn))
								.appendTo($("#table_data"));
						send_btn.click(function() {

						});
					});
		}
		//解析显示分页条信息
		function build_page_nav(result) {
			$("#page_nav").empty();
			var ul = $("<ul></ul>").addClass("pagination");
			var firstPageLi = $("<li></li>").append($("<a></a>").append("首页"));
			firstPageLi.click(function() {
				go(1);
			});
			var prePageLi = $("<li></li>").append(
					$("<a></a>").append("&laquo;"));
			if (result.extend.pageInfo.hasPreviousPage == false) {
				firstPageLi.addClass("disabled");
				prePageLi.addClass("disabled");
			} else {
				//为元素添加点击翻页事件
				prePageLi.click(function() {
					go(result.extend.pageInfo.pageNum - 1);
				});
			}
			var nextPageLi = $("<li></li>").append(
					$("<a></a>").append("&raquo;"));
			var lastPageLi = $("<li></li>").append($("<a></a>").append("末页"));
			lastPageLi.click(function() {
				go(result.extend.pageInfo.pages);
			});
			if (result.extend.pageInfo.hasNextPage == false) {
				nextPageLi.addClass("disabled");
				lastPageLi.addClass("disabled");
			} else {
				//为元素添加点击翻页事件
				nextPageLi.click(function() {
					go(result.extend.pageInfo.pageNum + 1);
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
					go(item);
				});
				ul.append(numLi);
			});
			//添加下一页和末页的提示
			ul.append(nextPageLi).append(lastPageLi);
			//把ul加到nav 
			var navEle = $("<nav></nav>").append(ul);
			navEle.appendTo("#page_nav");
		}
		function build_page_text(result) {
			$("#page_text").empty();
			$("#page_text").append(
					"当前第" + result.extend.pageInfo.pageNum + "页，共"
							+ result.extend.pageInfo.pages + "页，总计"
							+ result.extend.pageInfo.total + "条记录");
			totalRecord = result.extend.pageInfo.total;
			currentNum = result.extend.pageInfo.pageNum;
		}
		function ChangeDateFormat(d) {
			//将时间戳转为int类型，构造Date类型
			if (d != null) {
				var date = new Date(parseInt(d));

				//月份得+1，且只有个位数时在前面+0
				var month = date.getMonth() + 1 + "月";

				//日期为个位数时在前面+0
				var currentDate = date.getDate() + "日";

				//getFullYear得到4位数的年份 ，返回一串字符串
				return date.getFullYear() + "年" + month + currentDate;
			} else {
				return null;
			}

		}

		$("#search").click(function() {
			if ($("#text_id").val() == '') {
				layer.msg("请输入订单编号");
			} else if ($("#start").val() == '') {
				layer.msg("请输入时间");
			} else {
				search(1, $("#text_id").val(), $("#start").val());
			}
		});

		function search(pn, id, time) {
			layer.msg('数据加载中...', {
				icon : 16,
				shade : 0.01
			});
			$.ajax({
				url : "order/search",
				data : {
					"pn" : pn,
					"id" : id,
					"time" : time
				},
				type : "GET",
				success : function(result) {
					//console.log(result);
					if (result.code == 100) {
						build_page_text(result);
						//构建分页条
						build_page_nav_search(result);
						//构建表格数据
						build_table_data(result);
					} else {
						$("#table_data").empty();
						$("#page_nav").empty();
						$("#page_text").empty();
						layer.msg("没有查到数据");
					}
				}
			});
		}
		
		//解析显示分页条信息
		function build_page_nav_search(result) {
			$("#page_nav").empty();
			var ul = $("<ul></ul>").addClass("pagination");
			var firstPageLi = $("<li></li>").append($("<a></a>").append("首页"));
			firstPageLi.click(function() {
				search(1,$("#text_id").val(),$("#start").val());
			});
			var prePageLi = $("<li></li>").append(
					$("<a></a>").append("&laquo;"));
			if (result.extend.pageInfo.hasPreviousPage == false) {
				firstPageLi.addClass("disabled");
				prePageLi.addClass("disabled");
			} else {
				//为元素添加点击翻页事件
				prePageLi.click(function() {
					search(result.extend.pageInfo.pageNum - 1,$("#text_id").val(),$("#start").val());
				});
			}
			var nextPageLi = $("<li></li>").append(
					$("<a></a>").append("&raquo;"));
			var lastPageLi = $("<li></li>").append($("<a></a>").append("末页"));
			lastPageLi.click(function() {
				search(result.extend.pageInfo.pages,$("#text_id").val(),$("#start").val());
			});
			if (result.extend.pageInfo.hasNextPage == false) {
				nextPageLi.addClass("disabled");
				lastPageLi.addClass("disabled");
			} else {
				//为元素添加点击翻页事件
				nextPageLi.click(function() {
					search(result.extend.pageInfo.pageNum + 1,$("#text_id").val(),$("#start").val());
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
					search(item,$("#text_id").val(),$("#start").val());
				});
				ul.append(numLi);
			});
			//添加下一页和末页的提示
			ul.append(nextPageLi).append(lastPageLi);
			//把ul加到nav 
			var navEle = $("<nav></nav>").append(ul);
			navEle.appendTo("#page_nav");
		}
	</script>
</body>
</html>