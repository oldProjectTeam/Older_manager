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
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'CustomerActivity.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
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

<body style="margin: 15px;">
	<div class="col-sm-12">
		<div class="row">
			<div class="col-md-12">
				<ol class="breadcrumb">
					<li><b>位置：<a href="CustomerActivity.html">客户关系管理</a></b></li>
					<li><a href="CustomerActivity.html">推荐活动</a></li>
				</ol>
			</div>
		</div>

		<table class="table table-hover table-bordered">
			<thead>
				<tr>
					<th>编号</th>
					<th>活动名称</th>
					<th>老人的姓名</th>
					<th>推荐人</th>
					<th>推荐状态</th>
					<th>推荐时间</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>20130908</td>
					<td>围棋比赛</td>
					<td>王金平</td>
					<td>员工1102</td>
					<td>未推荐</td>
					<td>20130104</td>
					<td><a href="#" class="click"> 删除</a></td>
				</tr>
			</tbody>
		</table>

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

	<script type="text/javascript">
		var totalRecord, currentNum;
		/* 分页 */
		$(function() {
			$("#old_delete_all_btn").attr("disabled", true);
			go(1);
		});
		function go(pn, str) {
			$.ajax({
				url : "${APP_PATH}",
				data : {
					"pn" : pn
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

		function build_table_data(result) {
			$("#head").empty();
			$("#table_data").empty();
			var headTR = $("<tr></tr>");

			var Td1 = $("<td></td>").append("#");
			var Td2 = $("<td></td>").append("活动名称");
			var Td3 = $("<td></td>").append("老人的姓名");
			var Td4 = $("<td></td>").append("推荐人");
			var Td5 = $("<td></td>").append("推荐状态");
			var Td6 = $("<td></td>").append("推荐时间");
			var Td7 = $("<td></td>").append("操作");
			headTR.append(Td1).append(Td2).append(Td3).append(Td4).append(Td5)
					.append(Td6).append(Td7).appendTo($("#head"));

			$.each(result.extend.pageInfo.list, function(index, item) {
				var olderid = $("<td></td>").append(item.id);
				all_olderid = olderid;
				var oldername = $("<td></td>").append(item.name);
				var oldersex = $("<td></td>").append(item.sex);
				var olderage = $("<td></td>").append(item.age);
				var olderphone = $("<td></td>").append(item.phone);
				var olderidcar = $("<td></td>").append(item.idcar);
				var olderliveinfo = $("<td></td>").append(item.liveinfo);
				var delBtn = $("<button></button>").addClass(
						"btn btn-danger btn-sm delete_btn").append(
						$("<span></span>")
								.addClass("glyphicon glyphicon-trash")).append(
						"删除");

				//为删除按钮添加一个自定义的属性，来表示当前删除员工的id
				delBtn.attr("del-id", item.id);
				var btnTd = $("<td></td>").append(" ").append(delBtn);
				//append方法执行完成以后还是返回原来的元素							              								              
				$("<tr></tr>").append(olderid).append(oldername).append(
						oldersex).append(olderage).append(olderphone).append(
						olderidcar).append(olderliveinfo).append(btnTd)
						.appendTo("#table_data");
			});
		}
		//点击删除
		$(document).on("click", ".delete_btn", function() {
			var delid = $(this).attr("del-id");
			var oldername = $(this).parents("tr").find("td:eq(2)").text();
			if (confirm("确认删除【" + oldername + "】吗")) {
				$.ajax({
					url : "${APP_PATH}/" + delid,
					type : "DELETE",
					success : function(result) {
						go(currentNum);
					}
				});
			}
		});
	</script>
</body>
</html>
