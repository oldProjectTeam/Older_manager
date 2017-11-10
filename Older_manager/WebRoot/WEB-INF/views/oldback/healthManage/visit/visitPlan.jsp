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

<title>My JSP 'healthattend.jsp' starting page</title>

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
<STYLE type="text/css">
.table th,.table td {
	text-align: center;
	vertical-align: middle !important;
}
</STYLE>
</head>

<body style="margin: 15px;">
	<!-- 头部 -->
	<div class="col-md-12">
			<div class="row">
		<div class="col-md-12">
			<ol class="breadcrumb">
				<li><b>位置：数据统计</b></li>
				<li class="active">回访记录</li>
			</ol>
		</div>
	</div>

		<!-- 新增按钮 -->

		<div class="row">
			<div class="col-md-4">
				<button type="button" class="btn btn-primary" id="addvedio_btn">
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
			<div class="col-md-12" id="searchDiv">
				老人姓名： <input type="text" class="form-control" id="oldName"
					placeholder="请输入老人姓名"> 老人身份证： <input type="text"
					id="idcard" class="form-control" id="" placeholder="请输入老人身份证号码">
				<button class="btn btn-info" id="search">
					<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
					查询
				</button>
				<span id="helpBlock" class="help-block"></span>
			</div>
		</div>


		<div class="row" style="margin-top:10px;">
			<div>
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
		//新增按钮
		$("#addvedio_btn").click(function() {
			window.location.href = "visit/addvisitPlan";
		});
		//查看按钮
		$(".vedioview-btn").click(function() {
			window.location.href = "visit/selectvisitPlan";
		});
	</SCRIPT>
	<script type="text/javascript">
		var totalRecord, currentNum, strs = "";
		/* 分页 */
		$(function() {
			$("#old_delete_all_btn").attr("disabled", true);
			go(1, "");
		});
		function go(pn, str) {
			layer.msg('数据加载中...', {
				icon : 16,
				shade : 0.01
			});
			$.ajax({
				url : "${APP_PATH}/plan/selectAllOldBackPlan",
				data : {
					"pn" : pn,
					"str" : str
				},
				type : "GET",
				success : function(result) {
					if (result.code == 100) {
						console.log(result.extend.pageInfo);
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
				go(1, strs);
			});
			var prePageLi = $("<li></li>").append(
					$("<a></a>").append("&laquo;"));
			if (result.extend.pageInfo.hasPreviousPage == false) {
				firstPageLi.addClass("disabled");
				prePageLi.addClass("disabled");
			} else {
				//为元素添加点击翻页事件
				prePageLi.click(function() {
					go(result.extend.pageInfo.pageNum - 1, strs);
				});
			}
			var nextPageLi = $("<li></li>").append(
					$("<a></a>").append("&raquo;"));
			var lastPageLi = $("<li></li>").append($("<a></a>").append("末页"));
			lastPageLi.click(function() {
				go(result.extend.pageInfo.pages, strs);
			});
			if (result.extend.pageInfo.hasNextPage == false) {
				nextPageLi.addClass("disabled");
				lastPageLi.addClass("disabled");
			} else {
				//为元素添加点击翻页事件
				nextPageLi.click(function() {
					go(result.extend.pageInfo.pageNum + 1, strs);
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
					go(item, strs);
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
			var Td3 = $("<td></td>").append("身份证号码");
			var Td4 = $("<td></td>").append("计划回访时间");
			var Td5 = $("<td></td>").append("计划回访事务");
			var Td6 = $("<td></td>").append("状态");
			var Td7 = $("<td></td>").append("创建时间");
			var Td8 = $("<td></td>").append("操作");
			headTR.append(checkBox).append(Td1).append(Td2).append(Td3).append(
					Td4).append(Td5).append(Td6).append(Td7).append(Td8)
					.appendTo($("#head"));

			$
					.each(
							result.extend.pageInfo.list,
							function(index, item) {
								var checkBoxTd = $("<td><input type='checkbox' class='check_item'/></td>");
								var id = $("<td></td>").append(item.id);
								var oldName = $("<td></td>").append(
										item.oldman.name);
								var oldID = $("<td></td>").append(
										item.oldman.idcar);
								var oldBackTime = $("<td></td>").append(
										ChangeDateFormat(item.visiplantime));
								var oldBackTraction = $("<td></td>").append(
										item.plannedvisits);
								var state = $("<td></td>").append(item.state);
								var createTime = $("<td></td>").append(
										ChangeDateFormat(item.createtime));
								var serchBtn = $("<button></button>").addClass(
										"btn btn-info btn-sm serchBtn").append(
										$("<span></span>").addClass(
												"glyphicon glyphicon-search"))
										.append("查看");
								//为查看按钮添加一个自定义的属性，来表示当前查看老人的id
								var itemPlan = item.id + ":" + item.oldman.name
										+ ":" + item.oldman.idcar;
								serchBtn.attr("itemPlan", itemPlan);
								var delBtn = $("<button></button>")
										.addClass(
												"btn btn-danger btn-sm delete_btn")
										.append(
												$("<span></span>")
														.addClass(
																"glyphicon glyphicon-trash"))
										.append("删除");

								//为删除按钮添加一个自定义的属性，来表示当前删除id
								delBtn.attr("del-id", item.id);
								var btnTd = $("<td></td>").append(serchBtn)
										.append(" ").append(delBtn);
								//append方法执行完成以后还是返回原来的元素							              								              
								$("<tr></tr>").append(checkBoxTd).append(id)
										.append(oldName).append(oldID).append(
												oldBackTime).append(
												oldBackTraction).append(state)
										.append(createTime).append(btnTd)
										.appendTo("#table_data");
							});
		}
		//点击删除
		$(document).on("click", ".delete_btn", function() {
			var delid = $(this).attr("del-id");
			var oldername = $(this).parents("tr").find("td:eq(2)").text();
			layer.confirm("确认删除【" + oldername + "】吗", function(index) {
				$.ajax({
					url : "${APP_PATH}/plan/deleteAllVisitPlan/" + delid,
					type : "DELETE",
					success : function(result) {
						go(currentNum, strs);
						layer.msg(result.msg);
					}
				});
			});
		});

		//点击查看详细
		$(document).on(
				"click",
				".serchBtn",
				function() {
					var itemPlan = $(this).attr("itemPlan");
					window.location.href = "${APP_PATH}/plan/selectvisitPlan/"
							+ itemPlan;

				});
		//点击新增按钮
		$("#add_old_btn").click(function() {
			window.location.href = "${APP_PATH}/visit/addvisitPlan";
		});
		//完成全选、全部选功能
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
						del_idstr += $(this).parents("tr").find("td:eq(1)")
								.text()
								+ "-";
					});

					empNames = empNames.substring(0, empNames.length - 1);
					//去除多余的删除员工-
					del_idstr = del_idstr.substring(0, del_idstr.length - 1);
					layer.confirm("确认删除【" + empNames + "】吗", function(index) {
						//发送ajax请求
						$.ajax({
							url : "${APP_PATH}/plan/deleteAllVisitPlan/"
									+ del_idstr,
							type : "DELETE",
							success : function(result) {
								//回到当前页面
								go(currentNum, strs);
								layer.msg(result.msg);
							}
						});
					});
				});

		//搜索
		$("#search").click(function() {
			strs = "";
			//名字表达式
			var regNamezz = /^[\u4e00-\u9fa5]{1,}$/;
			//身份证
			var idcarzz = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
			$("#searchDiv").removeClass("has-error");
			$("#helpBlock").text("");
			if ($("#oldName").val() != '') {
				if (!regNamezz.test($("#oldName").val())) {
					$("#searchDiv").addClass("has-error");
					$("#helpBlock").append("这不是一个名字的格式");
				} else {
					strs = $("#oldName").val() + "-";
				}
			}
			if ($("#idcard").val() != '') {
				if (!idcarzz.test($("#idcard").val())) {
					$("#searchDiv").addClass("has-error");
					$("#helpBlock").append("身份证号码格式不正确");
				} else {
					strs = strs + $("#idcard").val() + "-";
				}
			}
			strs = strs.substring(0, strs.length - 1);
			go(1, strs);
		});

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
	</script>
</body>
</html>
