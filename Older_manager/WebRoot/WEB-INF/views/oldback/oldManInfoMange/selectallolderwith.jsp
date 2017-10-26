<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'addnewolder.jsp' starting page</title>

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
</head>

<body>
	<div class="col-sm-12">
		<!--路劲导航  -->
		<div class="row">
			<div class="col-md-12">
				<ol class="breadcrumb">
					<li><b>位置：<a
							href="static/oldback/oldManInfoMange/index.html">老人档案管理</a></b></li>
					<li class="active">老人列表</li>
				</ol>
			</div>
		</div>
		<!--内容 -->
		<div>
			<!--操作按钮  -->
			<div class="row">
				<div class="col-md-6">
					&nbsp;
					<button type="button" class="btn btn-primary" id="add_old_btn">
						<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
						新增
					</button>
					<button type="button" class="btn btn-danger">
						<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
						批量删除
					</button>

				</div>
			</div>
			<!--条件查询  -->
			<div class="row form-inline" style="margin-top:5px">

				<div class="col-md-12">
					老人姓名： <input type="text" class="form-control" id="name"
						placeholder="请输入老人名字"> 身份证号：<input type="text"
						class="form-control" id="idcar" placeholder="请输入身份证号">
					联系电话： <input type="text" class="form-control" id="phone"
						placeholder="请输入联系电话"> 性别: <select class="form-control"
						id="sex">
						<option>请选择</option>
						<option value="男">男</option>
						<option value="女">女</option>
					</select>

					<button class="btn btn-default">
						<span class="glyphicon glyphicon-search" id="selectwith"></span>
						查询
					</button>

				</div>
			</div>
			<br>
			<!--老人信息列表  -->
			<div class="row">
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
				<div class="col-md-4 col-md-offset-1" id="page_nav"></div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		var totalRecord, currentNum;
		/* 分页 */
		$(function() {
			go(1, "");
		});
		function go(pn, str) {
			$.ajax({
				url : "${APP_PATH}/old/selectallolderwith",
				data : {
					"pn" : pn,
					"str" : str
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
				go(1, "");
			});
			var prePageLi = $("<li></li>").append(
					$("<a></a>").append("&laquo;"));
			if (result.extend.pageInfo.hasPreviousPage == false) {
				firstPageLi.addClass("disabled");
				prePageLi.addClass("disabled");
			} else {
				//为元素添加点击翻页事件
				prePageLi.click(function() {
					go(result.extend.pageInfo.pageNum - 1, "");
				});
			}
			var nextPageLi = $("<li></li>").append(
					$("<a></a>").append("&raquo;"));
			var lastPageLi = $("<li></li>").append($("<a></a>").append("末页"));
			lastPageLi.click(function() {
				go(result.extend.pageInfo.pages, "");
			});
			if (result.extend.pageInfo.hasNextPage == false) {
				nextPageLi.addClass("disabled");
				lastPageLi.addClass("disabled");
			} else {
				//为元素添加点击翻页事件
				nextPageLi.click(function() {
					go(result.extend.pageInfo.pageNum + 1, "");
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
					go(item, "");
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
			var Td3 = $("<td></td>").append("性别");
			var Td4 = $("<td></td>").append("年龄");
			var Td5 = $("<td></td>").append("老人手机号码");
			var Td6 = $("<td></td>").append("身份证号");
			var Td7 = $("<td></td>").append("居住情况");
			var Td8 = $("<td></td>").append("所在服务区");
			var Td9 = $("<td></td>").append("操作");
			headTR.append(checkBox).append(Td1).append(Td2).append(Td3).append(
					Td4).append(Td5).append(Td6).append(Td7).append(Td8)
					.append(Td9).appendTo($("#head"));

			$
					.each(
							result.extend.pageInfo.list,
							function(index, item) {
								var checkBoxTd = $("<td><input type='checkbox' class='check_item'/></td>");
								var olderid = $("<td></td>").append(item.id);
								all_olderid = olderid;
								var oldername = $("<td></td>")
										.append(item.name);
								var oldersex = $("<td></td>").append(item.sex);
								var olderage = $("<td></td>").append(item.age);
								var olderphone = $("<td></td>").append(
										item.phone);
								var olderidcar = $("<td></td>").append(
										item.idcar);
								var olderliveinfo = $("<td></td>").append(
										item.liveinfo);
								var olderservice = $("<td></td>").append(
										item.service);
								var editBtn = $("<button></button>")
										.addClass(
												"btn btn-primary btn-sm edit_btn")
										.append(
												$("<span></span>")
														.addClass(
																"glyphicon glyphicon-pencil"))
										.append("编辑");
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
								$("<tr></tr>").append(checkBoxTd).append(
										olderid).append(oldername).append(
										oldersex).append(olderage).append(
										olderphone).append(olderidcar).append(
										olderliveinfo).append(olderservice)
										.append(btnTd).appendTo("#table_data");
							});
		}

		//全选
		$(document).on("click", ".check_item_all", function() {
			$(".item_check").prop("checked", $(this).prop("checked"));
		});
		//搜索
		$("#selectwith").click(
				function() {
					var str = null;
					str = $("#name").val() + $("#idcar").val()
							+ $("#phone").val() + $("#sex").val();
					if ($("#name").val() != null) {
						go(1, $("#name").val());
					}

					if ($("#idcar").val() != null) {
						go(1, $("#idcar").val());
					}
					if ($("#phone").val() != null) {
						go(1, $("#phone").val());
					}
					if ($("#sex").val() != null) {
						go(1, $("#sex").val());
					}

				});
		//點擊刪除
		$(document).on("click", ".delete_btn", function() {
			var delid = $(this).attr("del-id");
			var oldername = $(this).parents("tr").find("td:eq(2)").text();
			if (confirm("确认删除【" + oldername + "】吗")) {
				$.ajax({
					url : "${APP_PATH}/old/deleteolder/" + delid,
					type : "DELETE",
					success : function(result) {
						go(currentNum, "");
					}
				});
			}
		});

		//点击查看详细
		$(document).on("click", ".serchBtn", function() {
			var serchid = $(this).attr("serch-id");
			window.location.href = "${APP_PATH}/old/selectolder/" + serchid;

		});
		//点击新增按钮
		$("#add_old_btn").click(function() {
			window.location.href = "${APP_PATH}/old/insertnewolder";
		});
	</script>
</body>
</html>
