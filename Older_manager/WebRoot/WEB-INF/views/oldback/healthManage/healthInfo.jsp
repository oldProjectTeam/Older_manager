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

<title>My JSP 'healthInfo.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!-- 引入jquery -->
<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery-1.7.2.min.js"></script>
<!-- 引入样式 -->
<link
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>
</head>

<body>
	<!-- 头部 -->
	<div class="col-md-12">
			<div class="row">
		<div class="col-md-12">
			<ol class="breadcrumb">
				<li><b>位置：健康管理</b></li>
				<li class="active">健康数据</li>
			</ol>
		</div>
	</div>
		<!-- 新增按钮 -->

		<div class="row">
			<div class="col-md-4">
			 
				<button type="button" class="btn btn-primary" id="add_healthinfo">
					<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
					新增
				</button>
				<button type="button" class="btn btn-danger" id="old_delete_all_btn">
					<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
					批量删除
				</button>
			</div>
		</div>

		<!--条件查询  -->

		<div class="row form-inline" align="left" style="margin-top:10px;">
			<div class="col-md-12">
				老人姓名： <input type="text" class="form-control" id="name1"
					placeholder="请输入老人姓名"> 
				<button class="btn btn-success" id="selectwith">
					<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
					查询
				</button>
			</div>
		</div>



		<!-- 健康数据 -->
		<div class="row" style="margin-top:10px">
			<div class="col-md-12">
				<div class="table-responsive">
					<table class="table table-hover table-bordered text-center">
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
  

		
		
		
	<SCRIPT type="text/javascript">
	var totalRecord, currentNum,oldmanname="";
	
	/* 分页 */
	$(function() {
		go(${pn}, "");
		$("#old_delete_all_btn").attr("disabled", true);
	});
	function go(pn,oldmanname ) {
		$("#old_delete_all_btn").attr("disabled", true);
		layer.msg('数据加载中...', {
				icon : 16,
				shade : 0.01
			});
		$.ajax({
			url : "${APP_PATH}/healthinfo/selectallhealthinfo/"+pn,
			data : {
			         "pn":pn,
				"oldmanname" : oldmanname
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
		currentNum = result.extend.pageInfo.pageNum;
	}
	//解析显示分页条信息
	function build_page_nav(result) {
		$("#page_nav").empty();
		var ul = $("<ul></ul>").addClass("pagination");
		var firstPageLi = $("<li></li>").append($("<a></a>").append("首页"));
		firstPageLi.click(function() {
			go(1, oldmanname);
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
						go(result.extend.pageInfo.pageNum - 1, oldmanname);
					});
		}
		var nextPageLi = $("<li></li>").append(
				$("<a></a>").append("&raquo;"));
		var lastPageLi = $("<li></li>").append($("<a></a>").append("末页"));
		lastPageLi.click(function() {
			go(result.extend.pageInfo.pages, oldmanname);
		});
		if (result.extend.pageInfo.hasNextPage == false) {
			nextPageLi.addClass("disabled");
			lastPageLi.addClass("disabled");
		} else {
			//为元素添加点击翻页事件
			nextPageLi
					.click(function() {
						go(result.extend.pageInfo.pageNum + 1, oldmanname);
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
				go(item, oldmanname);
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
		var checkBox = $("<td></td>").append(
				$("<input type='checkbox' id='check_item_all'/>"));

		var Td1 = $("<td></td>").append("#");
		var Td2 = $("<td></td>").append("老人姓名");
		var Td3 = $("<td></td>").append("体温");
		var Td4 = $("<td></td>").append("体重");
		var Td5 = $("<td></td>").append("身高");
		var Td6 = $("<td></td>").append("操作");
		headTR.append(checkBox).append(Td1).append(Td2).append(Td3).append(
				Td4).append(Td5).append(Td6).appendTo($("#head"));

		$
				.each(
						result.extend.pageInfo.list,
						function(index, item) {
							var checkBoxTd = $("<td><input type='checkbox' class='check_item'/></td>");
							var ty1 = $("<td></td>").append(item.id);
							var ty2 = $("<td></td>").append(item.oldman.name);
							var ty3 = $("<td></td>").append(item.bodytemperature);
							var ty4 = $("<td></td>").append(item.bodyweight);
							var ty5 = $("<td></td>").append(item.height);
						
						
							var editBtn = $("<button></button>")
									.addClass(
											"btn btn-primary btn-sm edit_btn")
									.append(
											$("<span></span>")
													.addClass(
															"glyphicon glyphicon-pencil"))
									.append("编辑");
							//为编辑按钮添加一个自定义的属性，来表示当前查看老人的id
							editBtn.attr("edit-id", item.id);
							var serchBtn = $("<button></button>")
									.addClass(
											"btn btn-danger btn-sm serchBtn")
									.append(
											$("<span></span>")
													.addClass(
															"glyphicon glyphicon-search"))
									.append("查看");
							//为查看按钮添加一个自定义的属性，来表示当前查看老人的id
							serchBtn.attr("serch-id", item.id);
							var delBtn = $("<button></button>")
									.addClass(
											"btn btn-danger btn-sm delete_btn")
									.append(
											$("<span></span>")
													.addClass(
															"glyphicon glyphicon-trash"))
									.append("删除");

							//为删除按钮添加一个自定义的属性，来表示当前删除员工的id
							delBtn.attr("del-id", item.id);
							var btnTd = $("<td></td>").append(editBtn)
									.append(" ").append(serchBtn).append(
											" ").append(delBtn);
							//append方法执行完成以后还是返回原来的元素							              								              
							$("<tr></tr>").append(checkBoxTd).append(ty1)
									.append(ty2).append(ty3).append(ty4)
									.append(ty5).append(btnTd)
									.appendTo("#table_data");
						});
	}
	
	
	//点击搜索
		$("#selectwith").click(function() {
                  oldmanname=$("#name1").val();
			go(1, oldmanname);    

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
						
						
		//點擊刪除
		$(document).on(
				"click",
				".delete_btn",
				function() {
					var delid = $(this).attr("del-id");
					var oldername = $(this).parents("tr").find("td:eq(2)")
							.text();
					if (confirm("确认删除【" + oldername + "】吗")) {
						$.ajax({
							url : "${APP_PATH}/healthinfo/deletehealthinfo/"+ delid,
							type : "DELETE",
							success : function(result) {
								go(currentNum, oldmanname);  
							}
						});
					}
				});		
		
		
		//点击删除全部，就批量删除
		$("#old_delete_all_btn").click(
				function() {
					//alert();
					var empNames = "";
					var del_idstr = "";
					$.each($(".check_item:checked"), function() {
						//索引为2，就是第3个td.
						empNames += $(this).parents("tr").find("td:eq(2)")
								.text()
								+ ",";
						//alert(empNames);
						//组装员工id字符串
						del_idstr += $(this).parents("tr").find("td:eq(1)")
								.text()
								+ "-";
						//alert($(this).parents("tr").find("td:eq(2)").text());
						//alert(del_idstr);

					});

					//去除empNames多去的逗号
					empNames = empNames.substring(0, empNames.length - 1);
					//去除多余的删除员工-
					del_idstr = del_idstr.substring(0, del_idstr.length - 1);
					if (confirm("确认删除【" + empNames + "】吗")) {
						//发送ajax请求
						$.ajax({
							url : "${APP_PATH}/healthinfo/deleteallhealthinfo/"
									+ del_idstr,
							type : "DELETE",
							success : function(result) {
								//alert(result.msg);
								//回到当前页面
                                go(currentNum, oldmanname);  
							}
						});
					}
				});	
		//点击新增		
	$("#add_healthinfo").click(function(){
	    var pn = currentNum;
	    window.location.href="${APP_PATH}/healthinfo/skipaddhealthinfo/"+ pn;
	});						


   //点击修改
   $(document).on("click",".edit_btn",function(){
      var id=$(this).attr("edit-id");
      var pn = currentNum;
        window.location.href="${APP_PATH}/healthinfo/selecthealthinfobyid/"+id+ "&" + pn;
      });

      //点击查看
  $(document).on("click",".serchBtn",function(){
	
	var id=$(this).attr("serch-id");
	var pn = currentNum;
	 window.location.href="${APP_PATH}/healthinfo/selecthealthinfobyidtwo/"+id+ "&" + pn;
	
	});
</SCRIPT>

</body>
</html>
