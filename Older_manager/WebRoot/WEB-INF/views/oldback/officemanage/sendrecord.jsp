<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	pageContext.setAttribute("APP_PATH", request.getContextPath());
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'sendrecord.jsp' starting page</title>

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
					<li class="active">发送记录</li>
				</ol>
			</div>
		</div>
	</div>
	<div style="width:98%;margin-left:5px">
		<!--条件查询  -->
		<form class="form-inline">
			<div class="form-group">
				<label for="exampleInputName2">发送人:</label> <input type="text"
					class="form-control" placeholder="发送人" id="sender"
					onchange="checkStr(this.value)">
			</div>
			<div class="form-group">
				<label for="exampleInputName2">收信人号码:</label> <input type="text"
					class="form-control" placeholder="收信人号码" id="receiverphone"
					onchange="checkPhone(this.value)">
			</div>
			<div class="form-group">
				<label for="exampleInputEmail2">收信人姓名:</label> <input type="text"
					class="form-control" placeholder="收信人姓名" id="receivername"
					onchange="checkStr(this.value)">
			</div>
			<button type="button" class="btn btn-info" id="search">查询</button>
			<button type="reset" class="btn btn-warning">重置</button>
			<button type="button" class="btn btn-danger" id="sms_delete_all_btn">批量删除</button>
		</form>


		<!--短信信息列表  -->
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

	<!--查看模态框  -->
	<div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog"
		id="activity_view_modal">
		<div class="modal-dialog modal-lg" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">查看短信信息</h4>
				</div>
				<div class="modal-body">
					<div class="row">
						<div class="col-md-10 col-md-offset-1">
							<div class="panel panel-default">
								<!-- Table -->
								<table class="table table-bordered">
									<tr>
										<td>收信人姓名</td>
										<td id="Sreceivername"></td>
									</tr>
									<tr>
										<td>收信人电话</td>
										<td id="Sreceiverphone"></td>
									</tr>
									<tr>
										<td>发送人</td>
										<td id="Ssender"></td>
									</tr>
									<tr>
										<td>发送时间</td>
										<td id="Ssendtime"></td>
									</tr>

								</table>
								<div class="panel-heading">发送内容</div>
								<div class="panel-body">
									<b id="Scontent"></b>
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
		/* 分页 */
		$(function() {
			go(1);
		});

		function go(pn) {
			layer.msg('数据加载中...', {
				icon : 16,
				shade : 0.01
			});
			$.ajax({
				url : "Sms/findAllSmsByPage",
				data : "pn=" + pn,
				type : "GET",
				success : function(result) {
					if (result.code == 100) {
						//构建分页信息
						build_page_text(result);
						//构建分页条
						build_page_nav(result, 0);
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
		function build_page_nav(result, code) {
			var firstPageLi;
			var lastPageLi;
			$("#page_nav").empty();
			var ul = $("<ul></ul>").addClass("pagination");
			if (code == 1) {
				firstPageLi = $("<li></li>").append(
						$("<a></a>").append("首页").attr("href",
								"javascript:search(1)"));
			} else {
				firstPageLi = $("<li></li>").append(
						$("<a></a>").append("首页").attr("href",
								"javascript:go(1)"));
			}

			var prePageLi = $("<li></li>").append(
					$("<a></a>").append("&laquo;"));
			if (result.extend.pageInfo.hasPreviousPage == false) {
				firstPageLi.addClass("disabled");
				prePageLi.addClass("disabled");
			} else {
				//为元素添加点击翻页事件
				prePageLi.click(function() {

					if (code == 1) {
						search(result.extend.pageInfo.pageNum - 1);
					} else {
						go(result.extend.pageInfo.pageNum - 1);
					}
				});
			}
			var nextPageLi = $("<li></li>").append(
					$("<a></a>").append("&raquo;"));
			if (code == 1) {
				lastPageLi = $("<li></li>").append(
						$("<a></a>").append("末页").attr(
								"href",
								"javascript:search("
										+ result.extend.pageInfo.pages + ")"));
			} else {
				lastPageLi = $("<li></li>").append(
						$("<a></a>").append("末页").attr(
								"href",
								"javascript:go(" + result.extend.pageInfo.pages
										+ ")"));
			}

			if (result.extend.pageInfo.hasNextPage == false) {
				nextPageLi.addClass("disabled");
				lastPageLi.addClass("disabled");
			} else {
				//为元素添加点击翻页事件
				nextPageLi.click(function() {
					if (code == 1) {
						search(result.extend.pageInfo.pageNum + 1);
					} else {
						go(result.extend.pageInfo.pageNum + 1);
					}

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
					if (code == 1) {
						search(item);
					} else {
						go(item);
					}
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
			var Td2 = $("<td></td>").append("发布人号码");
			var Td3 = $("<td></td>").append("发送人");
			var Td4 = $("<td></td>").append("接收人号码");
			var Td5 = $("<td></td>").append("收信人");
			var Td6 = $("<td></td>").append("发送时间");
			var Td7 = $("<td></td>").append("操作");
			headTR.append(checkBox).append(Td1).append(Td2).append(Td3).append(
					Td4).append(Td5).append(Td6).append(Td7).appendTo(
					$("#head"));

			$.each(result.extend.pageInfo.list, function(index, item) {

				var dataTR = $("<tr></tr>");
				var checkBoxData = $("<td></td>").addClass("text-center")
						.append(
								$("<input type='checkbox'/>").addClass(
										"item_check"));
				var dataTd1 = $("<td></td>").append(item.id);
				var dataTd2 = $("<td></td>").append(item.sender);
				var dataTd3 = $("<td></td>").append(item.sender);
				var dataTd4 = $("<td></td>").append(item.receiverphone);
				var dataTd5 = $("<td></td>").append(item.receivername);

				var dataTd6 = $("<td></td>").append(
						ChangeDateFormat(item.sendtime));

				var find_btn = $("<button type='button'></button>").addClass(
						"btn btn-info btn-sm courseview-btn").append(
						$("<span></span>").addClass(
								"glyphicon glyphicon-search")).append("查看");
				var del_btn = $("<button type='button'></button>").addClass(
						"btn btn-danger btn-sm").append(
						$("<span></span>")
								.addClass("glyphicon glyphicon-trash")).append(
						"删除");
				find_btn.attr("SmsId", item.id);
				del_btn.attr("SmsId", item.id);
				del_btn.attr("receiverphone", item.receiverphone);

				//单个item查看事件,使用模态框弹出信息
				find_btn.click(function() {
					/* window.location.href = "Sms/findSmsById?id="
							+ find_btn.attr("SmsId"); */
					var id = $(this).parents("tr").find("td:eq(1)").text();
					$("#activity_view_modal").modal();
					$.ajax({
						url : "Sms/findSmsById?id=" + find_btn.attr("SmsId"),
						type : "get",
						success : function(result) {
							if (result.code == 100) {
								var SMS = result.extend.Sms;
								$("#Sreceivername").html(SMS.receivername);
								$("#Sreceiverphone").html(SMS.receiverphone);
								$("#Ssender").html(SMS.sender);
								$("#Ssendtime").html(
										ChangeDateFormat(SMS.sendtime));
								$("#Scontent").html(SMS.content);

							} else {
								layer.msg("获取失败，请重试！");
							}
						}
					});

				});

				//单个item删除事件
				del_btn.click(function() {
					layer.confirm("确认删除【" + "id=" + del_btn.attr("SmsId")
							+ ",短信接收方为 " + del_btn.attr("receiverphone")
							+ "】的短信数据吗?", function(index) {
						//确认,发送ajax请求即可
						$.ajax({
							url : "Sms/deleteSmsById/",
							data : {
								"id" : del_btn.attr("SmsId")
							},
							type : "GET",
							success : function(result) {
								//回到本页
								go(currentNum);
								layer.msg(result.msg);
							}
						});
					});
				});
				dataTR.append(checkBoxData).append(dataTd1).append(dataTd2)
						.append(dataTd3).append(dataTd4).append(dataTd5)
						.append(dataTd6).append(
								$("<td></td>").append(find_btn).append(
										"&nbsp;&nbsp;&nbsp;&nbsp;").append(
										del_btn)).appendTo($("#table_data"));
			});
		}

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
						layer.confirm("确认删除【" + empNames + "】吗?", function(
								index) {
							//发送ajax请求删除
							$.ajax({
								url : "Sms/delectSmsByListId/",
								data : {
									"listId" : del_idstr
								},
								type : "GET",
								success : function(result) {
									if (result.code == 100) {
										go(currentNum);
										layer.msg(result.msg);
									}
									//回到当前页
								}
							});
						});
					} else {
						layer.msg("请选择要删除的记录");
					}

				});

		//新增按钮
		$("#addvideo_btn").click(function() {
			location.href = "${APP_PATH }/video/intoAddVideo/";
		});

		//搜索按钮
		$("#search").click(function() {

			search(1);
		});

		function search(pn) {
			var dsender = $('#sender').val();//获取值
			var dreceiverphone = $('#receiverphone').val();
			var dreceivername = $('#receivername').val();
			if (dsender.length == 0 && dreceiverphone.length == 0
					&& dreceivername.length == 0) {
				layer.msg("请输入数据后再查询");
			} else {
				layer.msg('数据加载中...', {
					icon : 16,
					shade : 0.01
				});
				$.ajax({
					url : "Sms/findAllSmsBySearch",
					data : {
						"sender" : dsender,
						"receiverphone" : dreceiverphone,
						"receivername" : dreceivername,
						"pn" : pn
					},
					type : "get",
					success : function(result) {
						if (result.code == 100) {
							if (result.extend.pageInfo.list == null) {
								layer.msg("查询不到相关数据！");
							} else {
								//构建分页信息
								build_page_text(result);
								//构建分页条
								build_page_nav(result, 1);
								//构建表格数据
								build_table_data(result);
							}

						}
					}
				});
			}

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

		function checkPhone(val) {
			if (val.length == 0) {
				layer.msg('请输入手机号码！');
				$("#receiverphone").focus();
				return false;
			}
			if (val.length != 11) {
				layer.msg('请输入有效的手机号码！');
				$("#receiverphone").focus();
				return false;
			}

			var myreg = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\d{8})$/;
			if (!myreg.test(val)) {
				layer.msg('请输入有效的手机号码！');
				$("#receiverphone").focus();
				return false;
			}
		}

		function checkStr(str) {
			// [\u4E00-\uFA29]|[\uE7C7-\uE7F3]汉字编码范围 
			var re1 = new RegExp("^([\u4E00-\uFA29]|[\uE7C7-\uE7F3])*$");
			if (!re1.test(str)) {
				layer.msg("请输入中文字符");
				return false;
			} else {
				return true;
			}
		}
	</script>
</body>
</html>
