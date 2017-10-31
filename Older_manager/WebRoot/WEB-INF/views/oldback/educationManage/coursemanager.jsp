<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta name="keywords" content="keyword1,keyword2,keyword3">
<meta name="description" content="this is my page">
<meta name="content-type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css"
	href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script type="text/javascript"
	src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script language="JavaScript" src="static/js/jquery-3.2.1.min.js"></script>
</head>

<body style="margin: 15px;">
	<!--路劲导航  -->
	<div>
		<div class="row">
			<div class="col-md-12">
				<ol class="breadcrumb">
					<li><b>位置：<a
							href="static/oldback/educationManage/educationIndex.html">教育管理</a></b></li>
					<li class="active">课程管理</li>
				</ol>
			</div>
		</div>
	</div>
	<!--内容 -->
	<div>
		<!--操作按钮  -->
		<div class="row">
			<div class="col-md-6">
				&nbsp;
				<button type="button" class="btn btn-primary" id="addcourse_btn">
					<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
					新增
				</button>
				<button type="button" class="btn btn-danger"
					id="course_delete_all_btn">
					<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
					批量删除
				</button>
			</div>
		</div>
		<!--条件查询  -->
		<div class="row" style="margin-top:5px">
			<div class="col-md-12">
				<form class="form-inline">
					<div class="form-group">
						&nbsp;&nbsp;<label for="exampleInputName2">课程名称</label> <input
							type="text" class="form-control" placeholder="请输入课程名称"
							id="coursename">
					</div>
					<div class="form-group">
						<label for="exampleInputEmail2">讲师</label> <input type="text"
							class="form-control" placeholder="请输入讲师姓名" id="teacher">
					</div>
					<button type="button" class="btn btn-default" id="search">
						<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
						查询
					</button>
				</form>
			</div>
		</div>
		<br>
		<!--课程信息列表  -->
		<div class="row">
			<div class="col-md-12">
				<div class="table-responsive">
					<table class="table table-hover table-bordered text-center">
						<thead id="head">
						</thead>
						<tbody id="table_data">
						</tbody>
						<thead>
					</table>
				</div>
			</div>
		</div>
		<!--分页信息  -->
		<div class="row">
			<div class="col-md-7" id="page_text">&nbsp;&nbsp;</div>
			<div class="col-md-5" id="page_nav"></div>
		</div>
	</div>

	<script type="text/javascript">
		var totalRecord, currentNum;
		/* 分页 */
		$(function() {
			go(1);
		});
		function go(pn) {
			$.ajax({
				url : "Course/getCoursePage",
				data : "pn=" + pn,
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
			var firstPageLi = $("<li></li>").append(
					$("<a></a>").append("首页").attr("href", "javascript:go(1)"));
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
			var lastPageLi = $("<li></li>").append(
					$("<a></a>").append("末页").attr(
							"href",
							"javascript:go(" + result.extend.pageInfo.pages
									+ ")"));
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

		function build_table_data(result) {
			$("#head").empty();
			$("#table_data").empty();
			var headTR = $("<tr></tr>");
			var checkBox = $("<td></td>").append(
					$("<input type='checkbox' id='check_item_all'/>"));

			var Td1 = $("<td></td>").append("id");
			var Td2 = $("<td></td>").append("课程名称");
			var Td3 = $("<td></td>").append("授课方式");
			var Td4 = $("<td></td>").append("讲师");
			var Td5 = $("<td></td>").append("限定人数");
			var Td6 = $("<td></td>").append("截止时间");
			var Td7 = $("<td></td>").append("开课时间");
			var Td8 = $("<td></td>").append("结课时间");
			var Td9 = $("<td></td>").append("操作");
			headTR.append(checkBox).append(Td1).append(Td2).append(Td3).append(
					Td4).append(Td5).append(Td6).append(Td7).append(Td8)
					.append(Td9).appendTo($("#head"));

			$.each(result.extend.pageInfo.list, function(index, item) {

				var dataTR = $("<tr></tr>");
				var checkBoxData = $("<td></td>").addClass("text-center")
						.append(
								$("<input type='checkbox'/>").addClass(
										"item_check"));
				var dataTd1 = $("<td></td>").append(item.id);
				var dataTd2 = $("<td></td>").append(item.title);
				var dataTd3 = $("<td></td>").append(item.teachingway);
				var dataTd4 = $("<td></td>").append(item.teacher);
				var dataTd5 = $("<td></td>").append(item.limitnumber);

				var dataTd6 = $("<td></td>").append(
						ChangeDateFormat(item.bytime));
				var dataTd7 = $("<td></td>").append(
						ChangeDateFormat(item.starttime));
				var dataTd8 = $("<td></td>").append(
						ChangeDateFormat(item.endtime));

				var edit_btn = $("<button type='button'></button>").addClass(
						"btn btn-success btn-sm update-btn").append(
						$("<span></span>").addClass(
								"glyphicon glyphicon-pencil")).append("修改");
				var find_btn = $("<button type='button'></button>").addClass(
						"btn btn-info btn-sm courseview-btn").append(
						$("<span></span>").addClass(
								"glyphicon glyphicon-search")).append("查看");
				var del_btn = $("<button type='button'></button>").addClass(
						"btn btn-danger btn-sm").append(
						$("<span></span>")
								.addClass("glyphicon glyphicon-trash")).append(
						"删除");
				find_btn.attr("courseId", item.id);

				del_btn.attr("courseId", item.id);
				del_btn.attr("courseTitle", item.title);
				//单个item查看事件
				find_btn.click(function() {
					window.location.href = "Course/findCoursesByid?id="
							+ find_btn.attr("courseId") + "&way=0";

				});

				//单个item修改事件
				edit_btn.click(function() {
					window.location.href = "Course/findCoursesByid?id="
							+ find_btn.attr("courseId") + "&way=1";

				});

				//单个item删除事件
				del_btn.click(function() {
					if (confirm("确认删除【" + "id=" + del_btn.attr("courseId")
							+ ",课程名称为 " + del_btn.attr("courseTitle")
							+ "】的课程数据吗?")) {
						//确认,发送ajax请求即可
						$.ajax({
							url : "Course/delectCourseById/",
							data : {
								"id" : del_btn.attr("courseId")
							},
							type : "GET",
							success : function(result) {
								alert(result.msg);
								//回到本页
								go(currentNum);
							}
						});
					}
				});
				dataTR.append(checkBoxData).append(dataTd1).append(dataTd2)
						.append(dataTd3).append(dataTd4).append(dataTd5)
						.append(dataTd6).append(dataTd7).append(dataTd8)
						.append(
								$("<td></td>").append(edit_btn).append(
										"&nbsp;&nbsp;&nbsp;&nbsp;").append(
										find_btn).append(
										"&nbsp;&nbsp;&nbsp;&nbsp;").append(
										del_btn)).appendTo($("#table_data"));
				edit_btn.click(function() {

				});
			});
		}
		
	
		//全选
		$(document).on("click", "#check_item_all", function() {
			$(".item_check").prop("checked", $(this).prop("checked"));
		});

		//点击批量删除
		$("#course_delete_all_btn").click(
				function() {
					//$(".check_item:checked")
					var empNames = "";
					var del_idstr = "";
					$.each($(".item_check:checked"), function(index, item) {
						empNames += $(item).parents("tr").find("td:eq(2)")
								.text()
								+ ",";
						//组装员工ID的字符串
						del_idstr += $(item).parents("tr").find("td:eq(1)")
								.text()
								+ "-";
					});
					//去除empNames多余的,
					empNames = empNames.substring(0, empNames.length - 1);
					del_idstr = del_idstr.substring(0, del_idstr.length - 1);
					if (empNames != null && empNames.length != 0) {
						if (confirm("确认删除【" + empNames + "】吗?")) {
							//发送ajax请求删除
							$.ajax({
								url : "Course/delectCourseByListId/",
								data : {
									"listId" : del_idstr
								},
								type : "GET",
								success : function(result) {
									if (result.code == 100) {
										alert(result.msg);
										go(currentNum);
									}
									//回到当前页

								}
							});
						}
					} else {
						alert("请选择要删除的课程！");
					}

				});

		//新增按钮
		$("#addcourse_btn").click(function() {
			location.href = "${APP_PATH }/Course/addcourse/";
		});
		//修改按钮
		$(".update-btn")
				.click(
						function() {
							window.location.href = "static/oldback/educationManage/updatecourse.jsp";
						});
		//查看按钮
		$(".courseview-btn")
				.click(
						function() {
							window.location.href = "static/oldback/educationManage/courseview.jsp";
						});

		//搜索按钮
		$("#search").click(function() {
			var coursename = $('#coursename').val();//获取值
			var teacher = $('#teacher').val();
			if (coursename.length == 0 && teacher.length == 0) {
				alert("请输入数据");
			} else {
				search(coursename, teacher);
			}

		});
		function search(coursename, Teacher) {
			$.ajax({
				url : "Course/findAllCoursesByCourseName",
				data : {
					"CoursesName" : coursename,
					"teacher" : Teacher
				},
				type : "get",
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
