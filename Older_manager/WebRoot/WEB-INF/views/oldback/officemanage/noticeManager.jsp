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

<title>My JSP 'informnotice.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta content="width=device-width,initial-scale=1">
<!-- 引入jquery -->
<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery-3.2.1.min.js"></script>
<!-- 引入样式 -->
<link
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>

<body style="margin: 15px;">

	<!--路径导航  -->
	<div>
		<div class="row">
			<div class="col-md-12">
				<ol class="breadcrumb">
					<li><b>位置：<a href="page">办公管理</a></b></li>
					<li class="active">通知公告</li>
				</ol>
			</div>
		</div>
	</div>
	<div style="width:98%;margin-left:4px"">
		<div style="background:#fdfdfd;margin-top:15px;">
			<ul class="list-unstyle list-inline">
				<li><a
					href="sendnotice"><button
							type="button" class="btn btn-info">发布新公告</button></a></li>
				<li><button type="button" id="delete_all_but" class="btn btn-danger">批量删除公告</button></li>
				<li><a href=""><button type="button"
							class="btn btn-success">推送到手机</button></a></li>
			</ul>
			<form class="form-inline">
				<div class="form-group">
					<label for="exampleInputName2">通告标题:</label> <input type="text"
						class="form-control" placeholder="通告标题" id="stitle" onchange="checkStr(this.value)">
				</div>
				<div class="form-group">
					<label for="exampleInputEmail2">发布人:</label> <input type="email"
						class="form-control" placeholder="发布人" id="sreleasepeople" onchange="checkStr(this.value)">
				</div>
				<button type="button" class="btn btn-info" id="search">搜索</button>
			</form>
			<!--通知信息列表  -->
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
				<div class="col-md-4 col-md-offset-1" id="page_nav"></div>
			</div>



			<!--修改模态框  -->
			<div class="modal fade" id="alter" tabindex="-1" role="dialog"
				aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
							<h4 class="modal-title">修改通知信息</h4>
						</div>
						<div class="modal-body">
							<div class="col-md-10 col-md-offset-1">
							<form action="" id="noticeForm">
								<div class="panel panel-default">
									<!-- Table -->
									<table class="table table-bordered">
										<tr>
											<td>通知标题</td>
											<td><input type="text" class="form-control" id="title"
												name="title"></td>
										</tr>
										<tr>
											<td>发布时间</td>
											<td>
												<label class="col-sm-7 control-label" id="timet"></label>
												<div class="col-sm-1">
													<input type="hidden" class="form-control" id="time"
														name="time">
													
												</div> 
											</td>
										</tr>
										<tr>
											<td>发布人</td>
											<td><input type="text" 
												id="releasepeople" name="releasepeople" onchange="checkStr(this.value)"></td>
										</tr>
										<tr>
											<td>通知类型</td>
											<td><select id="type" name="type">
													<option value="通知类型">通知类型</option>
													<option value="会议通知">会议通知</option>
													<option value="指示通知">指示通知</option>
													<option value="转发通知">转发通知</option>
													<option value="重大通知">重大通知</option>
											</select></td>
										</tr>
									</table>
									<div class="panel-heading">通告内容</div>
									<div class="panel-body">
										<textarea class="form-control" rows="5" id="content"
											name="content" id="content"></textarea>
									</div>
								</div>
								<input type="hidden" id="id" name="id">
								</form>
							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-default"
									data-dismiss="modal">关闭</button>
								<button type="button" class="btn btn-primary"
									id="editnotice_button">提交更改</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<!--查看模态框  -->
		<div class="modal fade bs-example-modal-lg" tabindex="-1"
			role="dialog" id="activity_view_modal">
			<div class="modal-dialog modal-lg" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h4 class="modal-title">查看通知信息</h4>
					</div>
					<div class="modal-body">
						<div class="row">
							<div class="col-md-10 col-md-offset-1">
								<div class="panel panel-default">
									<!-- Table -->
									<table class="table table-bordered">
										<tr>
											<td>发送人</td>
											<td id="sendname"></td>
										</tr>
										<tr>
											<td>发送时间</td>
											<td id="sendtime"></td>
										</tr>
										<tr>
											<td>通知类型</td>
											<td id="sendtype"></td>
										</tr>
										<tr>
											<td>通知标题</td>
											<td id="sendtitle"></td>
										</tr>
									</table>
									<div class="panel-heading">通知内容</div>
									<div class="panel-body">
										<b id="sentcontent"></b>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					</div>
				</div>
			</div>
		</div>
		<script type="text/javascript">
			var totalRecord, currentNum;
			$(function() {
				go(1);
			});
			function go(pn) {
				$.ajax({
					url : "notice/findAllNoticeByPage",
					data : "pn=" + pn,
					type : "GET",
					success : function(result) {
						if (result.code == 100) {
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
						$("<a></a>").append("首页").attr("href",
								"javascript:go(1)"));
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
					nextPageLi.click(function() {
						go(result.extend.pageInfo.pageNum + 1);
					});
				}
				//添加首页和前一页的提示
				ul.append(firstPageLi).append(prePageLi);
				//遍历给ul中添加页码提示
				$.each(result.extend.pageInfo.navigatepageNums, function(index,
						item) {
					var numLi = $("<li></li>")
							.append($("<a></a>").append(item));
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
				/* var Td2 = $("<td></td>").append("通告编号");
				var Td3 = $("<td></td>").append("发布部门"); */
				var Td4 = $("<td></td>").append("发布人");
				var Td5 = $("<td></td>").append("发布时间");
				var Td6 = $("<td></td>").append("通告标题");
				var Td7 = $("<td></td>").append("操作");
				headTR.append(checkBox).append(Td1)
						.append(Td4).append(Td5)
						.append(Td6).append(Td7).appendTo($("#head"));

				$.each(result.extend.pageInfo.list, function(index, item) {

					var dataTR = $("<tr></tr>");
					var checkBoxData = $("<td></td>").addClass("text-center")
							.append(
									$("<input type='checkbox'/>").addClass(
											"item_check"));
					var dataTd1 = $("<td></td>").append(item.id);
					var dataTd4 = $("<td></td>").append(item.releasepeople);
					var dataTd5 = $("<td></td>").append(
							ChangeDateFormat(item.time));
					var dataTd6 = $("<td></td>").append(item.title);
					var edit_btn = $("<button type='button'></button>")
							.addClass("btn btn-sm btn-info courseview-btn")
							.append(
									$("<span></span>").addClass(
											"glyphicon glyphicon-pencil"))
							.append("修改");
					var find_btn = $("<button type='button'></button>")
							.addClass("btn btn-sm btn-success  courseview-btn")
							.append(
									$("<span></span>").addClass(
											"glyphicon glyphicon-search"))
							.append("查看");
					var delet_btn = $("<button type='button'></button>")
							.addClass("btn btn-sm btn-danger").append(
									$("<span></span>").addClass(
											"glyphicon glyphicon-trash"))
							.append("删除");
					edit_btn.attr("noticeId", item.id);
					find_btn.attr("noticeId", item.id);
					delet_btn.attr("noticeId", item.id);
					delet_btn.attr("noticetitle", item.title);

					//单个item查看事件,使用模态框弹出信息
					find_btn.click(function() {
						$("#activity_view_modal").modal();
						$.ajax({
							url : "notice/findNoticeByid?id="
									+ find_btn.attr("noticeId"),
							type : "get",
							success : function(result) {
								if (result.code == 100) {
									var notice = result.extend.notice;
									$("#sendname").html(notice.releasepeople);
									$("#sendtime").html(
											ChangeDateFormat(notice.time));
									$("#sendtype").html(notice.type);
									$("#sendtitle").html(notice.title);
									$("#sentcontent").html(notice.content);

								} else {
									alert("获取失败，请重试！");
								}
							}
						});

					});
					//编辑信息按钮，弹出模态框
					edit_btn.click(function() {
						$("#alter").modal();
						$.ajax({
							url : "notice/findNoticeByid?id="
									+ edit_btn.attr("noticeId"),
							type : "get",
							success : function(result) {
								if (result.code == 100) {
									var notice = result.extend.notice;
									$("#releasepeople").val(notice.releasepeople);
									$("#time").val(ChangeDateFormat2(notice.time));
									$("#timet").html(ChangeDateFormat2(notice.time));
									$("#title").val(notice.title);
									$("#content").val(notice.content);
									$("#id").val(notice.id);
								} else {
									alert("获取失败，请重试！");
								}
							}
						});

					});

					//单个item删除事件
					delet_btn.click(function() {
						if (confirm("确认删除【" + "id="
								+ delet_btn.attr("noticeId") + ",标题为 "
								+ delet_btn.attr("noticetitle") + "】的通知吗?")) {
							//确认,发送ajax请求即可
							$.ajax({
								url : "notice/deleteNoticeById/",
								data : {
									"id" : delet_btn.attr("noticeId")
								},
								type : "GET",
								success : function(result) {
									if (result.code == 100) {
										alert(result.extend.msg);
										//回到本页
										go(currentNum);
									} else {
										alert(result.extend.msg);
									}

								}
							});
						}
					});
					
					
					
					dataTR.append(checkBoxData).append(dataTd1).append(
							dataTd4).append(dataTd5).append(dataTd6).append(
							$("<td></td>").append(edit_btn).append(
									"&nbsp;&nbsp").append(find_btn).append(
									"&nbsp;&nbsp;").append(delet_btn))
							.appendTo($("#table_data"));
				});
			}

		

		

			//全选
			$(document).on("click", "#check_item_all", function() {
				$(".item_check").prop("checked", $(this).prop("checked"));
			});
			
			//点击保存按钮，修改通知信息
			$("#editnotice_button").click(function() {
				var time=$("#time").val();
				var releasepeople=$("#releasepeople").val();
				var type=$("#type").val();
				var content=$("#content").val();
				var title=$("#title").val();
				if(title==''||releasepeople==''||type==''||content=='' ||time==''){
					alert("请填写完整信息再发布");
				}else{
					$.ajax({
						url : "${APP_PATH}/notice/updateNotice",
						type : "post",
						data : $("#noticeForm").serialize(),
						success : function(result) {
							if (result.code == 100) {
								alert("修改成功！");
								//1.关闭模态框
								$("#activity_edit_modal").modal('hide');
								//2.重新加载当页
								go(currentNum);
							} else {
								alert("修改失败，请再重试一遍吧！");
								//$("#activity_edit_modal").modal('hide');
							}
						}
					});
				}
				
				
			});
			
			//点击批量删除
			$("#delete_all_but").click(
					function() {
						var empNames = "";
						var del_idstr = "";
						var del_idshow = "";
						$.each($(".item_check:checked"), function(index, item) {
							empNames += $(item).parents("tr").find("td:eq(4)")
									.text()
									+ ",";
							del_idshow += $(item).parents("tr").find("td:eq(1)")
									.text()
									+ ",";
							del_idstr += $(item).parents("tr").find("td:eq(1)")
									.text()
									+ "-";
						});
						empNames = empNames.substring(0, empNames.length - 1);
						del_idstr = del_idstr
								.substring(0, del_idstr.length - 1);
						if (empNames != null && empNames.length != 0) {
							if (confirm("确认删除【id为"+del_idshow+" ，标题为："+ empNames + "】的公告吗?")) {
								//发送ajax请求删除
								$.ajax({
									url : "notice/delectNoticeByListId/",
									data : {
										"listId" : del_idstr
									},
									type : "GET",
									success : function(result) {
										if (result.code == 100) {
											alert(result.extend.msg);
											go(currentNum);
										}
									}
								});
							}
						} else {
							alert("请选择要删除的公告！");
						}

					});
			
			//新增按钮
			$("#addvideo_btn").click(function() {
				location.href = "sendnotice";
			});

			//搜索按钮
			$("#search").click(function() {
				var title = $('#stitle').val();//获取值
				var releasepeople = $('#sreleasepeople').val();
				
				if (title.length == 0 && releasepeople.length == 0) {
					alert("请输入搜索数据！");
					go(1);
				} else {
					search(title, releasepeople);
				}
				

			});

			function search(dtitle, dreleasepeople) {
				$.ajax({
					url : "notice/findAllNoticeBySearch",
					data : {
						"title" : dtitle,
						"releasepeople" : dreleasepeople
					},
					type : "get",
					success : function(result) {
						if (result.code == 100) {
							if (result.extend.pageInfo.list == null) {
								alert("查询不到相关数据！");
							} else {
								
								//构建分页信息
								build_page_text(result);
								//构建分页条
								build_page_nav(result);
								//构建表格数据
								build_table_data(result);
							}

						}else{
							alert(result.extend.msg);
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
                    var currenthours=date.getHours();
					var currentminut=date.getMinutes();
					//getFullYear得到4位数的年份 ，返回一串字符串
					return date.getFullYear() + "年" + month + currentDate+" "+currenthours+":"+currentminut;
				} else {
					return null;
				}

			}
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
			
			function checkStr(str) {
				// [\u4E00-\uFA29]|[\uE7C7-\uE7F3]汉字编码范围 
				var re1 = new RegExp(
						"^([\u4E00-\uFA29]|[\uE7C7-\uE7F3])*$");
				if (!re1.test(str)) {
					alert("请输入中文字符");
					
					return false;
				} else {
					return true;
				}
			}
		</script>
</body>

</html>