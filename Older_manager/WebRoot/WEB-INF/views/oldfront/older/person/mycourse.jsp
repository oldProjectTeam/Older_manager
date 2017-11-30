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

<title>老人管理平台-用户自助中心</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="${APP_PATH}/static/oldfront/older/css/easyui.css"
	rel="stylesheet" type="text/css">
<link href="${APP_PATH}/static/oldfront/older/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${APP_PATH}/static/oldfront/older/css/layout.css"
	rel="stylesheet">
<link href="${APP_PATH}/static/oldfront/older/css/default.css"
	rel="stylesheet">
<link href="${APP_PATH}/static/oldfront/older/css/icon.css"
	rel="stylesheet">

<script src="${APP_PATH}/static/oldfront/older/js/jquery.js"></script>
<script src="${APP_PATH}/static/oldfront/older/js/json2.js"></script>
<script src="${APP_PATH}/static/oldfront/older/js/jquery.cookie.js"></script>
<script src="${APP_PATH}/static/oldfront/older/js/jquery.easyui.js"></script>
<script src="${APP_PATH}/static/oldfront/older/js/easyui-lang-zh_CN.js"></script>
<script src="${APP_PATH}/static/oldfront/older/js/KingonUI.js"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>
</head>
<body style="overflow:auto;" class="layout panel-noscroll">
	<!--头部开始  -->
	<jsp:include page="header.jsp"></jsp:include>
	<!-- 主体部分开始 -->
	<div style="padding:111px 0 0;margin-bottom:15px;">
		<div class="container">
			<div class="row">
				<!-- 左侧导航菜单开始 -->
				<jsp:include page="left.jsp"></jsp:include>
				<!-- 左侧导航菜单结束 -->
				<!-- 右侧内容区开始 -->
				<div class="col-md-9" style="background:#fff;min-height:647px;">
					<!-- 健康数据开始 -->
					<div class="jksj" style="margin-top:15px;">
						<div class="xy-title">
							我的课程
							<button type="button" class="btn back fr"
								onclick="javascript:history.go(-1)">返回</button>
						</div>
						<div class="form-inline" role="form" id="searchForm">
							<div class="form-group col-md-5">
								<label for="" class="control-label">课程开始时间：</label> <input
									id="h_Time1" type="date" class="form-control">
							</div>
							<div class="form-group col-md-5">
								<label for="" class="control-label">课程结束时间：</label> <input
									type="date" id="h_Time2" class="form-control">
							</div>
							<button id="search" type="button"
								class="btn btn-success col-md-2">查询</button>
						</div>


						<!-- 弹出框结束 -->

						<!--我的课程详细模态框开始-->
						<div class="modal fade bs-example-modal-lg" tabindex="-1"
							role="dialog" id="courseenrol_view_modal">
							<div class="modal-dialog modal-lg" role="document">
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal"
											aria-label="Close">
											<span aria-hidden="true">&times;</span>
										</button>
										<h4 class="modal-title">我的课程详细信息</h4>
									</div>
									<div class="modal-body">
										<form class="form-horizontal">
											<table id="courseenrol_view_table"
												class="table table-striped table-bordered text-center">
												<tr>
													<td>课程名称</td>
													<td id="courseTitle1"></td>
													<td>老人姓名</td>
													<td id="oldManName1"></td>
													<td>联系电话</td>
													<td id="oldManphone1"></td>
												</tr>
												<tr>
													<td>课程完成情况</td>
													<td id="coursecompletion1"></td>
													<td>成绩</td>
													<td id="grade1"></td>
													<td colspan="2">上课风采</td>
												</tr>
												<tr>
													<td>评价等级</td>
													<td id="rating1"></td>
													<td>正常上课</td>
													<td id="isnormalclass1"></td>
													<td colspan="2" rowspan="3"><img class="img-rounded"
														id="img1" width="150" height="150"></td>
												</tr>
												<tr>
													<td>报名时间</td>
													<td id="timeStr1"></td>
													<td>报名状态</td>
													<td id="enrolstate1"></td>
												</tr>
												<tr>
													<td>备注</td>
													<td colspan="3" id="remark1"></td>
												</tr>
											</table>
										</form>
									</div>
									<div class="modal-footer">
										<button type="button" class="btn btn-default"
											data-dismiss="modal">关闭</button>
									</div>
								</div>
								<!-- /.modal-content -->
							</div>
							<!-- /.modal-dialog -->
						</div>

						<!--我的课程详细模态框结束-->

						<!-- 添加数据按钮结束 -->
						<!-- 列表开始 -->
						<table
							class="table table-striped table-bordered table-hover text-center yyjl-table"
							style="margin-top: 15px;">
							<thead>
								<tr class="xy-head">
									<th class="col-md-2">课程名称</th>
									<th class="col-md-2">讲师</th>
									<th class="col-md-2">开课时间</th>
									<th class="col-md-2">报名时间</th>
									<th class="col-md-2">报名状态</th>
									<th class="col-md-2">操作</th>
								</tr>
							</thead>
							<tbody id="table_data">
							</tbody>
						</table>
						<nav>
						<ul class="pagination" id="page_list">
						</ul>
						</nav>
						<!-- 列表结束 -->
					</div>
					<!-- 健康数据结束 -->
					<!-- 右侧内容区结束 -->
				</div>
				<!-- 右侧内容区结束 -->
			</div>
		</div>
	</div>
	<!--底部开始  -->
	<jsp:include page="footer.jsp"></jsp:include>
	<!-- 底部结束 -->
	<script src="${APP_PATH}/static/oldfront/older/js/bootstrap.js"></script>
	<script src="${APP_PATH}/static/oldfront/older/js/bootstrap.min.js"></script>
	<script src="${APP_PATH}/static/oldfront/older/js/TableJS.js"
		type="text/javascript"></script>
	<script src="${APP_PATH}/static/oldfront/older/js/md5.js"></script>

	<script type="text/javascript">
		$(function() {
			go(1);
		});

		function go(pn) {
			var oldManId = ${older.oldman.id};
			$.ajax({
				url : "${APP_PATH}/course/queryCourseByOldMan",
				data : {
					"pn" : pn,
					"oldManId" : oldManId
				},
				type : "GET",
				success : function(result) {
					if (result.code == 100) {
						$("#table_data").empty();
						$("#page_list").empty();
						build_data(result);
						nav(result);
					}
				}
			});
		}

		function build_data(result) {
			$.each(result.extend.pageInfo.list, function(index, item) {
				var tr = $("<tr></tr>");
				var td1 = $("<td></td>").append(
						$("<a></a>").attr(
								"href",
								"${APP_PATH}/official/courseInfoId/"
										+ item.courses.id).append(
								$("<font></font>").attr("color", "green")
										.append(item.courses.title)));
				var td2 = $("<td></td>").append(item.courses.teacher);
				var td3 = $("<td></td>").append(
						ChangeDateFormat(item.courses.starttime));
				var td4 = $("<td></td>").append(
						ChangeDateFormat(item.courses.endtime));
				var td5 = $("<td></td>").append(item.enrolstate);
				var div = $("<div></div>").addClass("jjda-btn").attr(
						"data-toggle", "modal").attr("data-target",
						"#courseenrol_view_modal").append(
						$("<i></i>").addClass("jjda-btn-view")).append("课程详细");
				div.attr("item", item.courses.title + "-"
						+ item.coursecompletion + "-" + item.grade + "-"
						+ item.rating + "-" + item.isnormalclass + "-"
						+ item.courses.photo + "-" + item.enroltime + "-"
						+ item.enrolstate + "-" + item.remark);
				var td6 = $("<td></td>").append(div);

				tr.append(td1).append(td2).append(td3).append(td4).append(td5)
						.append(td6).appendTo($("#table_data"));

				//课程详细
				$(document).on(
						"click",
						".jjda-btn",
						function() {
							emptyInfo();
							var c = $(this).attr("item");
							c = c.split("-");
							$("#courseTitle1").append(c[0]);
							$("#oldManName1").append('${older.oldman.name}');
							$("#oldManphone1").append('${older.oldman.phone}');
							if (c[1].length == 4) {
								$("#coursecompletion1").append("无");
							} else {
								$("#coursecompletion1").append(c[1]);
							}
							if (c[2].length == 4) {
								$("#grade1").append("无");
							} else {
								$("#grade1").append(c[2]);
							}
							if (c[3].length == 4) {
								$("#rating1").append("无");
							} else {
								$("#rating1").append(c[3]);
							}
							if (c[4].length == 4) {
								$("#isnormalclass1").append("无");
							} else {
								$("#isnormalclass1").append(c[4]);
							}
							$("#img1").attr("src",
									"http://gyadmin-1252357563.file.myqcloud.com/" + c[5]);
							$("#timeStr1").append(ChangeDateFormat(c[6]));
							$("#enrolstate1").append(c[7]);
							if (c[8].length == 4) {
								$("#remark1").append("无");
							} else {
								$("#remark1").append(c[8]);
							}
						});
			});
		}

		function emptyInfo() {
			$("#courseTitle1").empty();
			$("#oldManName1").empty();
			$("#oldManphone1").empty();
			$("#coursecompletion1").empty();
			$("#grade1").empty();
			$("#rating1").empty();
			$("#isnormalclass1").empty();
			$("#img1").empty();
			$("#timeStr1").empty();
			$("#enrolstate1").empty();
			$("#remark1").empty();
		}

		function search(pn) {
			var oldManId = ${older.oldman.id};
			$
					.ajax({
						url : "${APP_PATH}/course/queryCourseByOldManAndStartTimeAndEndTime",
						data : {
							"pn" : pn,
							"oldManId" : oldManId,
							"startTime" : $("#h_Time1").val(),
							"endTime" : $("#h_Time2").val()
						},
						type : "GET",
						success : function(result) {
							if (result.code == 100) {
								$("#table_data").empty();
								$("#page_list").empty();
								build_data(result);
								nav1(result);
							} else {
								layer.msg("没有查询到相关数据", {
									offset : [ '20%' ]
								});
							}
						}
					});
		}

		$("#search").click(function() {
			if ($("#h_Time1").val() == '' || $("#h_Time2").val() == '') {
				layer.msg("请输入信息再查询", {
					offset : [ '20%' ]
				});
			} else {
				search(1);
			}
		});

		function nav(result) {
			var pre, next;
			if (result.extend.pageInfo.pageNum == 1) {
				pre = $("<li></li>").addClass("disabled").append(
						$("<a></a>").attr("href", "javascript:#")
								.append("&lt;"));
			} else {
				pre = $("<li></li>").append(
						$("<a></a>").attr(
								"href",
								"javascript:go("
										+ (result.extend.pageInfo.pageNum - 1)
										+ ")").append("&lt;"));
			}
			if (result.extend.pageInfo.pageNum == result.extend.pageInfo.lastPage) {
				next = $("<li></li>").addClass("disabled").append(
						$("<a></a>").attr("href", "javascript:#")
								.append("&gt;"));
			} else {
				next = $("<li></li>").append(
						$("<a></a>").attr(
								"href",
								"javascript:go("
										+ (result.extend.pageInfo.pageNum + 1)
										+ ")").append("&gt;"));
			}
			$("#page_list").append(pre);
			$.each(result.extend.pageInfo.navigatepageNums, function(index,
					item) {
				var li = $("<li></li>").append(
						$("<a></a>").attr(
								"href",
								"javascript:go("
										+ (result.extend.pageInfo.pageNum)
										+ ")").append(item));
				$("#page_list").append(li);
			});
			$("#page_list").append(next);
		}

		function nav1(result) {
			var pre, next;
			if (result.extend.pageInfo.pageNum == 1) {
				pre = $("<li></li>").addClass("disabled").append(
						$("<a></a>").attr("href", "javascript:#")
								.append("&lt;"));
			} else {
				pre = $("<li></li>").append(
						$("<a></a>").attr(
								"href",
								"javascript:search("
										+ (result.extend.pageInfo.pageNum - 1)
										+ ")").append("&lt;"));
			}
			if (result.extend.pageInfo.pageNum == result.extend.pageInfo.lastPage) {
				next = $("<li></li>").addClass("disabled").append(
						$("<a></a>").attr("href", "javascript:#")
								.append("&gt;"));
			} else {
				next = $("<li></li>").append(
						$("<a></a>").attr(
								"href",
								"javascript:search("
										+ (result.extend.pageInfo.pageNum + 1)
										+ ")").append("&gt;"));
			}
			$("#page_list").append(pre);
			$.each(result.extend.pageInfo.navigatepageNums, function(index,
					item) {
				var li = $("<li></li>").append(
						$("<a></a>").attr(
								"href",
								"javascript:search("
										+ (result.extend.pageInfo.pageNum)
										+ ")").append(item));
				$("#page_list").append(li);
			});
			$("#page_list").append(next);
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
