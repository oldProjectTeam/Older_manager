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
			<div class="hide_style clearfix">
				<c:forEach items="${list}" var="orderRatio">
					<div class="proportion">
						<div class="easy-pie-chart percentage" data-percent="20"
							data-color="#D15B47">
							<span class="percent">${orderRatio.orderRatio}</span>%
						</div>
						<span class="name">${orderRatio.orderOfType}</span>
					</div>
				</c:forEach>
			</div>
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
								<ul class="b_P_Sort_list">
									<c:forEach items="${list}" var="orderRatio">
										<li><i class="orange  fa fa-reorder"></i><a href="#">${orderRatio.orderOfType}(${orderRatio.orderOfTypeNum})</a></li>
									</c:forEach>
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
							<li><label class="l_f">订单编号</label><input name=""
								type="text" class="text_add" placeholder="订单订单编号"
								style=" width:250px"></li>
							<li><label class="l_f">时间</label><input
								class="inline laydate-icon" id="start"
								style=" margin-left:10px;"></li>
							<li style="width:90px;"><button type="button"
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
								<th width="25px"><label><input type="checkbox" id="check_item_all"
										class="ace"><span class="lbl"></span></label></th>
								<th width="120px">订单编号</th>
								<th width="250px">产品名称</th>
								<th width="100px">总价</th>
								<th width="100px">优惠</th>
								<th width="100px">订单时间</th>
								<th width="180px">所属类型</th>
								<th width="80px">数量</th>
								<th width="70px">状态</th>
								<th width="200px">操作</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${pageInfo.list}" var="order">
								<tr>
									<td><label><input type="checkbox" class="ace check_item" ><span
											class="lbl"></span></label></td>
									<td>${order.id}</td>
									<td class="order_product_name">${order.subject}</td>
									<td>${order.subject}</td>
									<td>${order.cost}</td>
									<td><fmt:formatDate value="${order.creattime}"
											pattern="yyyy-MM-dd" /></td>
									<td>食品</td>
									<td>${order.num}</td>
									<td class="td-status"><span
										class="label label-success radius">${order.state}</span></td>
									<td><a onClick="Delivery_stop(this,'10001')"
										href="javascript:;" title="发货" class="btn btn-xs btn-success"><i
											class="fa fa-cubes bigger-120"></i></a> <a title="订单详细"
										href="order_detailed"
										class="btn btn-xs btn-info order_detailed"><i
											class="fa fa-list bigger-120"></i></a> <a title="删除"
										href="javascript:;" onclick="Order_form_del(this,'1')"
										class="btn btn-xs btn-warning"><i
											class="fa fa-trash  bigger-120"></i></a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
					<!--分页信息  -->
					<div class="row">
						<div class="col-md-7" style="font-size: 18px;">&nbsp;&nbsp;当前第${pageInfo.pageNum }页，共${pageInfo.pages}页，总计${pageInfo.total}条记录</div>
						<div class="col-md-5">
							<nav aria-label="Page navigation">
							<ul class="pagination">
								<c:if test="${pageInfo.hasPreviousPage==false}">
									<li class="disabled"><a>首页</a></li>
									<li class="disabled"><span aria-hidden="true">&laquo;</span>
									</li>
								</c:if>
								<c:if test="${pageInfo.hasPreviousPage==true}">
									<li><a href="${APP_PATH}/order/Orderform?pn=${user.type}">首页</a></li>
									<li><a
										href="${APP_PATH}/order/Orderform?pn=${pageInfo.pageNum-1}">
											<span aria-hidden="true">&laquo;</span>
									</a></li>
								</c:if>
								<c:forEach items="${pageInfo.navigatepageNums}" var="p">
									<c:if test="${p==pageInfo.pageNum}">
										<li class="active"><a
											href="${APP_PATH}/order/Orderform?pn=${pageInfo.pageNum}">${p}</a></li>
									</c:if>
									<c:if test="${p!=pageInfo.pageNum}">
										<li><a href="${APP_PATH}/order/Orderform?pn=${p}">${p}</a></li>
									</c:if>
								</c:forEach>
								<c:if test="${pageInfo.hasNextPage==false}">
									<li class="disabled"><span aria-hidden="true">&raquo;</span>
									</li>
									<li class="disabled"><a>末页</a></li>
								</c:if>
								<c:if test="${pageInfo.hasNextPage!=false}">
									<li><a
										href="${APP_PATH}/order/Orderform?pn=${pageInfo.pageNum+1}"
										aria-label="Next"> <span aria-hidden="true">&raquo;</span></a></li>
									<li><a
										href="${APP_PATH}/order/Orderform?pn=${pageInfo.pages}">末页</a>
									</li>
								</c:if>
							</ul>
							</nav>
						</div>
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
						<div class="col-sm-9">
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

		//订单列表
		/* jQuery(function($) {
			var oTable1 = $('#sample-table').dataTable({
				"aaSorting" : [ [ 1, "desc" ] ],//默认第几个排序
				"bStateSave" : true,//状态保存
				"aoColumnDefs" : [
				//{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
				{
					"orderable" : false,
					"aTargets" : [ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 ]
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
		}); */
	</script>
</body>
</html>