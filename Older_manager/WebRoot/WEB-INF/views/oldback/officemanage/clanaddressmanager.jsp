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

<title>My JSP 'clanaddressmanager.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta name="" viewport content="width=device-width,initial-scale=1">
<!-- 引入jquery -->
<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery-3.2.1.min.js"></script>
<!-- 引入样式 -->
<link
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>
</head>

<body style="margin: 15px;">
	<!--路径导航  -->
	<div>
		<div class="row">
			<div class="col-md-12">
				<ol class="breadcrumb">
					<li><b>位置：<a href="page">办公管理</a></b></li>
					<li class="active">通讯录管理</li>
				</ol>
			</div>
		</div>
	</div>



	<div style="width:98%;margin-left:4px">
		<ul class="list-unstyle list-inline nav nav-tabs"
			style="margin-top:10px">
			<li style="font-size:20px;"><a href="addressbookmanager">老人</a></li>
			<li class="active" style="font-size:20px;"><a
				href="clanaddressmanager">亲属</a></li>
		</ul>
		<!--通讯录信息列表  -->
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


	<!--修改亲属模态框  -->
	<div class="modal fade" tabindex="-1" role="dialog"
		id="update_old_relative_modal">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">修改家属信息</h4>
				</div>
				<div class="modal-body">
					<form class="form-inline">
						<table class="table table-striped table-bordered text-center">
							<tr>
								<td><font color=red>*</font>姓名</td>
								<td><p class="form-control-static"
										id="update_old_relatives_name"></p> <br></td>
								<td class="text-center">性别</td>
								<td class="text-center"><input type="radio" name="sex"
									value="男" id="update_old_relatives_boy" />男<input type="radio"
									name="sex" value="女" id="update_old_relatives_girl" />女</td>
							</tr>
							<tr>
								<td class="text-center">关系</td>
								<td class="text-center"><select style="width:70px"
									id="update_old_relatives_relation" name="relation">
										<option>父子</option>
										<option>母子</option>
										<option>兄弟</option>
										<option>儿子</option>
								</select></td>
								<td>是否同住</td>
								<td><select style="width:70px"
									id="update_old_relatives_islive" name="islive">
										<option>是</option>
										<option>否</option>
								</select></td>
							</tr>
							<tr>
								<td class="text-center">联系电话</td>
								<td colspan="4"><input type="text" class="form-control"
									id="update_old_relatives_phone" name="phone" /></td>
							</tr>
							<tr>
								<td>联系地址</td>
								<td colspan="4"><input type="text" class="form-control"
									id="update_old_relatives_address" name="address" /></td>
							</tr>
						</table>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" id="update_save_btn">修改</button>
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
			layer.msg('数据加载中...', {
				icon : 16,
				shade : 0.01
			});
			$.ajax({
				url : "rel/selectallrelativesIncludeOldManNameByPage",
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
			var Td2 = $("<td></td>").append("亲属姓名");
			var Td3 = $("<td></td>").append("与老人关系");
			var Td4 = $("<td></td>").append("电话");
			var Td5 = $("<td></td>").append("老人姓名");
			var Td7 = $("<td></td>").append("操作");
			headTR.append(checkBox).append(Td1).append(Td2).append(Td3).append(
					Td4).append(Td5).append(Td7).appendTo($("#head"));

			$
					.each(
							result.extend.pageInfo.list,
							function(index, item) {

								var dataTR = $("<tr></tr>");
								var checkBoxData = $("<td></td>").addClass(
										"text-center").append(
										$("<input type='checkbox'/>").addClass(
												"item_check"));
								var dataTd1 = $("<td></td>").append(item.id);
								var dataTd2 = $("<td></td>").append(item.name);
								var dataTd3 = $("<td></td>").append(
										item.relation);
								var dataTd4 = $("<td></td>").append(item.phone);
								var dataTd5 = $("<td></td>").append(
										item.oldman.name);

								var edit_btn = $(
										"<button type='button'></button>")
										.addClass(
												"btn btn-sm btn-success  courseview-btn")
										.append(
												$("<span></span>")
														.addClass(
																"glyphicon glyphicon-search"))
										.append("修改 ");
								var sent_btn = $(
										"<button type='button'></button>")
										.addClass("btn btn-sm btn-info")
										.append(
												$("<span></span>")
														.addClass(
																"glyphicon glyphicon-comment"))
										.append("发送短信");
								edit_btn.attr("SmsId", item.id);
								sent_btn.attr("SmsId", item.id);
								sent_btn.attr("receiverphone", item.phone);

								//编辑信息按钮，弹出模态框

								edit_btn
										.click(function() {
											var edit = $(this).attr("SmsId");
											//3.把老人的id传递给模态框的编辑按钮
											$("#update_save_btn").attr(
													"edit-id",
													$(this).attr("SmsId"));
											//发送请求获取
											$
													.ajax({
														url : "${APP_PATH}/rel/selectrelativesbyid/"
																+ edit,
														type : "GET",

														success : function(
																result) {

															if (result.code == 100) {
																$(
																		"#update_old_relative_modal")
																		.modal();
																//console.log(result);
																var rel = result.extend.relatives;
																$(
																		"#update_old_relatives_name")
																		.text(
																				rel.name);
																$(
																		"#update_old_relative_modal input[name=sex]")
																		.val(
																				[ rel.sex ]);
																$(
																		"#update_old_relatives_phone")
																		.val(
																				rel.phone);
																$(
																		"#update_old_relative_modal select")
																		.val(
																				[ rel.islive ]);

																$(
																		"#update_old_relatives_relation")
																		.val(
																				[ rel.relation ]);

																$(
																		"#update_old_relatives_address")
																		.val(
																				rel.address);
															}
														}
													});
										});

								//单个item发送短信事件
								sent_btn
										.click(function() {
											window.location.href = "Sms/intoSendSms?phone="
													+ sent_btn
															.attr("receiverphone");
										});
								dataTR
										.append(checkBoxData)
										.append(dataTd1)
										.append(dataTd2)
										.append(dataTd3)
										.append(dataTd4)
										.append(dataTd5)
										.append(
												$("<td></td>")
														.append(edit_btn)
														.append(
																"&nbsp;&nbsp;&nbsp;&nbsp;")
														.append(sent_btn))
										.appendTo($("#table_data"));
							});
		}

		//点击修改按钮
		$("#update_save_btn").click(
				function() {
					$
							.ajax({
								url : "${APP_PATH}/rel/updaterelatives/"
										+ $(this).attr("edit-id"),
								type : "POST",
								data : $("#update_old_relative_modal form")
										.serialize(),
								success : function(result) {
									if (result.code == 100) {
										$("#update_old_relative_modal").modal(
												'hide');
										go(currentNum, ${id});
									}
								}
							});

				});

		//全选
		$(document).on("click", "#check_item_all", function() {
			$(".item_check").prop("checked", $(this).prop("checked"));
		});

		//点击批量删除
		$("#sms_delete_all_btn").click(
				function() {
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
								url : "Sms/delectSmsByListId/",
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
						alert("请选择要删除的视频！");
					}

				});

		//新增按钮
		$("#addvideo_btn").click(function() {
			location.href = "${APP_PATH }/video/intoAddVideo/";
		});

		//搜索按钮
		$("#search").click(function() {
			var sender = $('#sender').val();//获取值
			var receiverphone = $('#receiverphone').val();
			var receivername = $('#receivername').val();

			search(sender, receiverphone, receivername);

		});

		function search(dsender, dreceiverphone, dreceivername) {
			$.ajax({
				url : "Sms/findAllSmsBySearch",
				data : {
					"sender" : dsender,
					"receiverphone" : dreceiverphone,
					"receivername" : dreceivername
				},
				type : "get",
				success : function(result) {
					if (result.code == 100) {
						if (result.extend.list == null) {
							alert("查询不到相关数据！");
						} else {
							//构建分页信息
							build_page_text(result);
							//构建分页条
							build_page_nav(result);
							//构建表格数据
							build_table_data(result);
						}

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
