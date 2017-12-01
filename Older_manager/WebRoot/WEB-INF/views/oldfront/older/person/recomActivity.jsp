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
							推荐活动
							<button type="button" class="btn back fr" id="btnclose"
								onClick="javascript :history.back(-1);">返回</button>
						</div>
						<form class="form-inline">
							<div class="form-group col-md-5">
								<label for="" class="control-label">最早推荐时间：</label> <input
									class="easyui-datebox datebox-f combo-f textbox-f"
									editable="false" id="starttime"
									style="width: 180px; height: 30px; display: none;">
							</div>
							<div class="form-group col-md-5">
								<label for="" class="control-label">最晚推荐时间：</label> <input
									class="easyui-datebox datebox-f combo-f textbox-f"
									editable="false" id="endtime"
									style="width: 180px; height: 30px; display: none;">
							</div>
							<button type="button" id="search"
								class="btn btn-success col-md-2">查询</button>
						</form>



						<!-- 查看活动详细弹出框开始 -->
						<div id="jkda" class="modal fade bs-example-modal-lg"
							tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel"
							aria-hidden="true" style="display: none;">
							<div class="modal-dialog modal-lg">
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal">
											<span aria-hidden="true">×</span> <span class="sr-only">Close</span>
										</button>
										<h4 class="modal-title">查看活动详细</h4>
									</div>
									<div class="modal-body">
										<div class="row">
											<div class="col-md-10 col-md-offset-1">
												<div class="panel panel-default">
													<!-- Table -->
													<table class="table table-bordered">
														<tr>
															<td>活动标题</td>
															<td id="title"></td>
														</tr>
														<tr>
															<td>活动时间</td>
															<td id="activitytime"></td>
														</tr>
														<tr>
															<td>活动地点</td>
															<td id="place"></td>
														</tr>
														<tr>
															<td>活动状态</td>
															<td id="state"></td>
														</tr>
														<tr>
															<td>发布时间</td>
															<td id="releasetime"></td>
														</tr>
														<tr>
															<td>发布人</td>
															<td id="releasepeople"></td>
														</tr>

													</table>
													<div class="panel-heading">活动简介</div>
													<div class="panel-body">
														<lable id="content"></lable>
													</div>
													<img id="img" src="images/bmfw.png" width="200"
														height="150">
												</div>
											</div>
										</div>
									</div>
									<div class="modal-footer">

										<button type="button" class="btn btn-default"
											data-dismiss="modal">关闭</button>

									</div>
								</div>
							</div>
						</div>
						<!-- 弹出框结束 -->
						<!-- 添加数据按钮结束 -->
						<!-- 列表开始 -->
						<table
							class="table table-striped table-bordered table-hover text-center yyjl-table">
							<thead>
								<tr class="xy-head">
									<th class="col-md-2">活动名称</th>
									<th class="col-md-1.5">推荐人</th>
									<th class="col-md-1.5">活动时间</th>
									<th class="col-md-1.5">推荐时间</th>
									<th class="col-md-1.5">推荐状态</th>
									<th class="col-md-4">操作</th>
								</tr>
							</thead>
							<tbody id="table_data">
							</tbody>
						</table>
						<nav>
						<ul class="pagination" id="page_list">
							<li class="disabled"><a href="#">&lt;</a></li>
							<li><a href="#">1</a></li>
							<li><a href="#">&gt;</a></li>
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
					url : "${APP_PATH}/activity/findRecomActivityBySearch",
					data : {
						"pn" : pn,
						"oldManId" : oldManId,
						"startTime" : "",
						"endTime" : ""
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
				$
						.each(
								result.extend.pageInfo.list,
								function(index, item) {
									var tr = $("<tr></tr>");
									var td1 = $("<td></td>").append(
											item.recomactivity.activity.title);
									var td2 = $("<td></td>").append(
											item.recomactivity.recompeople);
									var td3 = $("<td></td>")
											.append(
													ChangeDateFormat(item.recomactivity.activity.activitytime));
									var td4 = $("<td></td>").append(
											ChangeDateFormat(item.recomtime));
									var td5 = $("<td></td>");
									if (item.result == null
											|| item.result == "失败") {
										td5.append("未报名");
									} else if (item.result == "成功") {
										td5.append("已报名");
									}
									;

									var div_enrol = $("<div></div>").addClass(
											"jjda-btn").attr("data-toggle",
											"#jkda").append(
											$("<i></i>")
													.addClass("jjda-btn-bm"))
											.append("立即报名");
									div_enrol.attr("enrolData",
											item.recomactivity.activity.id
													+ "-" + ${older.oldman.id}
													+ "-" + item.id);
									div_enrol.click(function() {
										if (item.result == null
												|| item.result == "失败") {
											enrolActivity(div_enrol
													.attr("enrolData"));
										} else if (item.result == "成功") {
											layer.msg("你已经报名过，可以报名参加其他活动。", {
												offset : [ '45%' ]
											});
										}
										;

									});
									var div = $("<div></div>").addClass(
											"jjda-btn").attr("data-toggle",
											"modal").attr("data-target",
											"#courseenrol_view_modal").append(
											$("<i></i>").addClass(
													"jjda-btn-view")).append(
											"课程详细");
									div
											.attr(
													"activity",
													item.recomactivity.activity.title
															+ "-"
															+ item.recomactivity.activity.releasetime
															+ "-"
															+ item.recomactivity.activity.activitytime
															+ "-"
															+ item.recomactivity.activity.place
															+ "-"
															+ item.recomactivity.activity.releasepeople
															+ "-"
															+ item.recomactivity.activity.state
															+ "-"
															+ item.recomactivity.activity.activity1)
											.attr(
													"cont",
													item.recomactivity.activity.content);
									//点击查看模态框
									div.click(function() {
										putActivityInfo(div.attr("activity"),
												div.attr("cont"));
									})
									var td6 = $("<td></td>").append(div_enrol)
											.append(div);
									tr.append(td1).append(td2).append(td3)
											.append(td4).append(td5)
											.append(td6).appendTo(
													$("#table_data"));

								});
			}
			function enrolActivity(result) {
				data = result.split("-");
				$.ajax({
					url : "${APP_PATH}/activity/enrolActivity",
					data : {
						"activityId" : data[0],
						"oldManId" : data[1],
						"recomdActivitydetailId" : data[2]
					},
					type : "GET",
					success : function(result) {
						if (result.code == 100) {
							layer.msg("报名成功！请保持手机通讯通畅，活动举行前我们将会联系您", {
								offset : [ '20%' ]
							});
						} else {
							layer.msg("你已经报名过，不需要报名", {
								offset : [ '20%' ]
							});
						}
					}
				});
			}

			function putActivityInfo(activity, cont) {
				a = activity.split("-");
				$("#jkda").modal();

				$("#title").html(a[0]);
				$("#activitytime").html(ChangeDateFormat(a[2]));
				$("#place").html(a[3]);
				$("#state").html(a[5]);
				$("#releasetime").html(ChangeDateFormat(a[1]));
				$("#releasepeople").html(a[4]);
				$("#content").text(cont);
				$("#img").attr("src", a[6]);
			}
			function search(pn) {
				var oldManId = ${older.oldman.id};
				$.ajax({
					url : "${APP_PATH}/activity/findRecomActivityBySearch",
					data : {
						"pn" : pn,
						"oldManId" : oldManId,
						"startTime" : $("#starttime").datebox('getValue'),
						"endTime" : $("#endtime").datebox('getValue')
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
			$("#search").click(
					function() {
						if ($("#endtime").datebox('getValue') == ''
								&& $("#starttime").datebox('getValue') == '') {
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
							$("<a></a>").attr("href", "javascript:#").append(
									"&lt;"));
				} else {
					pre = $("<li></li>")
							.append(
									$("<a></a>")
											.attr(
													"href",
													"javascript:go("
															+ (result.extend.pageInfo.pageNum - 1)
															+ ")").append(
													"&lt;"));
				}
				if (result.extend.pageInfo.pageNum == result.extend.pageInfo.lastPage) {
					next = $("<li></li>").addClass("disabled").append(
							$("<a></a>").attr("href", "javascript:#").append(
									"&gt;"));
				} else {
					next = $("<li></li>")
							.append(
									$("<a></a>")
											.attr(
													"href",
													"javascript:go("
															+ (result.extend.pageInfo.pageNum + 1)
															+ ")").append(
													"&gt;"));
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
							$("<a></a>").attr("href", "javascript:#").append(
									"&lt;"));
				} else {
					pre = $("<li></li>")
							.append(
									$("<a></a>")
											.attr(
													"href",
													"javascript:search("
															+ (result.extend.pageInfo.pageNum - 1)
															+ ")").append(
													"&lt;"));
				}
				if (result.extend.pageInfo.pageNum == result.extend.pageInfo.lastPage) {
					next = $("<li></li>").addClass("disabled").append(
							$("<a></a>").attr("href", "javascript:#").append(
									"&gt;"));
				} else {
					next = $("<li></li>")
							.append(
									$("<a></a>")
											.attr(
													"href",
													"javascript:search("
															+ (result.extend.pageInfo.pageNum + 1)
															+ ")").append(
													"&gt;"));
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
			s
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
