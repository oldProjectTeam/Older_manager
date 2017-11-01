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
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
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
					<li><b>位置：老人档案管理</b></li>
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
					<button type="button" class="btn btn-danger"
						id="old_delete_all_btn">
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

					<button class="btn btn-default" id="selectwith">
						<span class="glyphicon glyphicon-search"></span> 查询
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
				<div class="col-md-5" id="page_nav"></div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		var totalRecord, currentNum, strs = "";
		/* 分页 */
		$(function(pn) {
			$("#old_delete_all_btn").attr("disabled", true);
			go(${pn}, "");
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
								$("<tr></tr>").append(checkBoxTd).append(
										olderid).append(oldername).append(
										oldersex).append(olderage).append(
										olderphone).append(olderidcar).append(
										olderliveinfo).append(olderservice)
										.append(btnTd).appendTo("#table_data");
							});
		}
		//點擊刪除
		$(document).on("click", ".delete_btn", function() {
			var delid = $(this).attr("del-id");
			var oldername = $(this).parents("tr").find("td:eq(2)").text();
			if (confirm("确认删除【" + oldername + "】吗")) {
				$.ajax({
					url : "${APP_PATH}/old/deleteolder/" + delid,
					type : "DELETE",
					success : function(result) {
						go(currentNum, strs);
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

		//点击编辑按钮
		$(document)
				.on(
						"click",
						".edit_btn",
						function() {
							var serchid = $(this).attr("edit-id");
							var pn = currentNum;
							window.location.href = "${APP_PATH}/old/selectolderwithedit/"
									+ serchid + "&" + pn;

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
		$("#nameck").change(function() {
			var namestr = /^[\u2E80-\u9FFF]{2,5}/;
			var name = $("#nameck").val();
			if (!namestr.test(name)) {
				alert("姓名不符合要求");
				$("#nameck").addClass("has-error");
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
						$
								.ajax({
									url : "${APP_PATH}/old/deleteallolder/"
											+ del_idstr,
									type : "DELETE",
									success : function(result) {
										//alert(result.msg);
										//回到当前页面
										go(currentNum, strs);

									}
								});
					}
				});

		//搜索
		$("#selectwith").click(function() {
			strs = "";
			//名字表达式
			var regNamezz = /^[\u4e00-\u9fa5]{1,}$/;
			//身份证
			// var idcarzz=/^\d{15}|\d{18}$/;
			var idcarzz = /^(5[0-9]*$)/;
			//电话
			var phonezz = /^(1[358][0-9]*$)/;
			if (regNamezz.test($("#name").val())) {
				strs = $("#name").val() + "-";
				alert("名字证符合" + strs);
			}
			if (idcarzz.test($("#idcar").val())) {

				alert("身份证符合" + strs);
				strs = strs + $("#idcar").val() + "-";
			}
			if (phonezz.test($("#phone").val())) {
				strs = strs + $("#phone").val() + "-";
				alert("电话符合" + strs);
			}
			if ($("#sex").val().length == 1) {
				strs = strs + $("#sex").val() + "-";
				alert("性别符合" + strs);
			}

			strs = strs.substring(0, strs.length - 1);
			go(1, strs);

		});
	</script>
</body>
</html>
