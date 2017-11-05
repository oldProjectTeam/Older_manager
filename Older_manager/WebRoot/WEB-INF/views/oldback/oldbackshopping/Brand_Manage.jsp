<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<%-- <script src="${APP_PATH}/static/shop/assets/js/jquery.dataTables.min.js"></script> --%>
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
				<form id="search_data_form" action="${APP_PATH}/brand/findAllBrand.action" method="post">
				<ul class="search_content clearfix">
					<li>
					  <label class="l_f">品牌名称</label>
					  <input name="name" type="text" class="text_add" placeholder="输入品牌名称" style=" width:250px" /></li>
					<li>
					   <label class="l_f">添加时间</label>
					   <input class="inline laydate-icon" name="addtime" id="start" placeholder="开始时间"
					   style=" margin-left:10px;">
					   <label>-</label>
					   <input class="inline laydate-icon" type="date" name="addtime1" placeholder="结束时间">
					</li>
					<li>
					  <select name="region" class="text_add">
					  	 <option value="">所在区域</option>
					     <option value="国内">国内品牌</option>
						 <option value="国外">国外品牌</option>
					  </select>
					</li>
					<li style="width:90px;">
					    <button type="submit" class="btn_search" id="search_btn">
							<i class="icon-search"></i>查询
						</button>
					</li>
				</ul>
				</form>
			</div>
			<div class="border clearfix">
				<span class="l_f"> <a href="Add_Brand" title="添加品牌"
					class="btn btn-warning Order_form"><i class="icon-plus"></i>添加品牌</a>
					<a href="javascript:ovid()" class="btn btn-danger"><i
						class="icon-trash"></i>批量删除</a>
				</span> <span class="r_f">共：<b>${pageInfo.total }</b>个品牌
				</span>
			</div>
			<!--品牌展示-->
			<div class="row" >
				<div class="col-sm-9">
				每页显示：<select id="pageSize_select">
						<c:forEach var="i" begin="2" step="2" end="30">
							<option  <c:if test="${i==pageInfo.pageSize}"> selected="selected"</c:if>  value="${i}">${i }</option>
						</c:forEach>
				    	  
				    	  
				    </select>
				</div>
				 
			</div>
			<div class="row" style="margin-top:5px">  
				<!--品牌列表-->
				<div class="col-sm-12 table-responsive">
					<table class="table table-striped table-bordered table-hover" 
						id="sample-table">
						<thead>
							<tr>
								<th width="25px"><label><input type="checkbox"
										class="ace"><span class="lbl"></span></label></th>
								<th width="90px">品牌编号</th>
								<th width="50px">排序</th>
								<th width="120px">品牌LOGO</th>
								<th width="120px">品牌名称</th>
								<th width="130px">所属地区/国家</th>
								<th width="340px">描述</th>
								<th width="180px">加入时间</th>
								<th width="70px">状态</th>
								<th width="200px">操作</th>
							</tr>
						</thead>
						<tbody id="brand_table_tbody">
						    <c:if test="${empty pageInfo.list}">
						    	<tr><td colspan="10"><h4>暂无记录</h4></td></tr>
						    </c:if>
							<c:forEach items="${pageInfo.list}" var="b">
							<tr>
					          <td><label><input type="checkbox"  class="ace" ><span class="lbl"></span></label></td>
					          <td>${b.brandid }</td>
					          <td><input type="text" class="form-control" value="${b.sort}" style="width:40px"></td>
					          <td><img src="upload/152.jpg"  width="130"/></td>
					          <td>
					            <u style="cursor:pointer" class="text-primary brond_name" onclick="generateOrders('${b.id}');" title="玉兰油OLAY">
					            ${b.name }</u>
					         </td>
					          <td>${b.region }</td>
					          <td class="text-l">${b.description}</td>
					          <td><fmt:formatDate value="${b.addtime}" pattern='yyyy-MM-dd HH:mm:ss'/></td>
					          <td class="td-status"><span class="label label-success radius">已启用</span></td>
					          <td class="td-manage">
					          <a onClick="member_stop(this,'10001')"  href="javascript:;" title="停用"  class="btn btn-xs btn-success"><i class="icon-ok bigger-120"></i></a> 
					          <a title="编辑" onclick="member_edit('编辑','member-add.html','4','','510')" href="javascript:;"  class="btn btn-xs btn-info" ><i class="icon-edit bigger-120"></i></a> 
					          <a title="删除" href="javascript:;"  onclick="member_del(this,'1')" class="btn btn-xs btn-warning" ><i class="icon-trash  bigger-120"></i></a>
					          </td>
							</tr>
							</c:forEach>
						</tbody>
					</table>
					
				</div>
			</div>
            <!--分页信息  -->
            <div class="row">
			<div class="col-md-7">&nbsp;&nbsp;当前第${pageInfo.pageNum }页，共${pageInfo.pages}页，总计${pageInfo.total}条记录</div>
			<div class="col-md-4 col-md-offset-1">
				<nav aria-label="Page navigation">
					<ul class="pagination">
					    
					   <c:if test="${pageInfo.hasPreviousPage==false}">
					    	<li class="disabled">
					    	   <a>首页</a>
					    	 </li>
					    	<li class="disabled"> 
					           <span aria-hidden="true">&laquo;</span>
					        </li>
					    </c:if>
					    <c:if test="${pageInfo.hasPreviousPage==true}">
					    	<li>
					    	  <a href="${APP_PATH}/brand/findAllBrand.action?pageNum=${1}&pageSize=${pageInfo.pageSize}">首页</a>
					    	</li>
					    	<li> 
					    	   <a href="${APP_PATH}/brand/findAllBrand.action?pageNum=${pageInfo.pageNum-1}&pageSize=${pageInfo.pageSize}">
					           <span aria-hidden="true">&laquo;</span></a>
					        </li>
					    </c:if>		    
					    <c:forEach items="${pageInfo.navigatepageNums}" var="p">
					       <c:if test="${p==pageInfo.pageNum}">
					       		<li class="active"><a href="${APP_PATH}/brand/findAllBrand.action?pageNum=${pageInfo.pageNum}&pageSize=${pageInfo.pageSize}">${p}</a></li>
					       </c:if>
					       <c:if test="${p!=pageInfo.pageNum}">
					       		<li><a href="${APP_PATH}/brand/findAllBrand.action?pageNum=${p}&pageSize=${pageInfo.pageSize}">${p}</a></li>
					       </c:if>
					    </c:forEach>
					    <c:if test="${pageInfo.hasNextPage==false}">
					      <li class="disabled"> 
					         <span aria-hidden="true">&raquo;</span>
					      </li>
					      <li class="disabled"><a>末页</a></li>
					    </c:if>	
					    <c:if test="${pageInfo.hasNextPage!=false}">
					      <li> 
					         <a href="${APP_PATH}/brand/findAllBrand.action?pageNum=${pageInfo.pageNum+1}&pageSize=${pageInfo.pageSize}" aria-label="Next">
					         <span aria-hidden="true">&raquo;</span></a>
					      </li>
					      <li>
					        <a href="${APP_PATH}/brand/findAllBrand.action?pageNum=${pageInfo.pages}&pageSize=${pageInfo.pageSize}">末页</a>
					       </li>
					    </c:if>		
					</ul>
				</nav>
			</div>
		</div>
		</div>
	</div>
<script type="text/javascript">
  $("#pageSize_select").change(function(){
	   
	  window.location.href="${APP_PATH}/brand/findAllBrand.action?pageSize="+$(this).val();
  });

</script>



<script type="text/javascript">
	 
    



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

			$('table th input:checkbox').on('click',
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
			layer.confirm('确认要停用吗？',function(index) {
					$(obj).parents("tr").find(".td-manage")
						.prepend('<a style="text-decoration:none" class="btn btn-xs " onClick="member_start(this,id)" href="javascript:;" title="启用"><i class="icon-ok bigger-120"></i></a>');
					$(obj).parents("tr").find(".td-status")
							.html('<span class="label label-defaunt radius">已停用</span>');
					$(obj).remove();
					layer.msg('已停用!', {
						icon : 5,
						time : 1000
					});
				});
		}

		/*用户-启用*/
		function member_start(obj, id) {
			layer.confirm('确认要启用吗？',function(index) {
								$(obj).parents("tr").find(".td-manage")
									.prepend('<a style="text-decoration:none" class="btn btn-xs btn-success" onClick="member_stop(this,id)" href="javascript:;" title="停用"><i class="icon-ok bigger-120"></i></a>');
								$(obj).parents("tr").find(".td-status")
									.html('<span class="label label-success radius">已启用</span>');
								$(obj).remove();
								layer.msg('已启用!',{
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
		/* require.config({
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
		}); */
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