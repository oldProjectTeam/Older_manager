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

<title>My JSP 'addressbookmanager.jsp' starting page</title>

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
			<li class="active" style="font-size:20px;"><a
				href="addressbookmanager">老人</a></li>
			<li style="font-size:20px;"><a
				href="${APP_PATH}/clanaddressmanager">亲属</a></li>
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
			<div class="col-md-4 col-md-offset-1" id="page_nav"></div>
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
				url : "old/findAllOldManPhone",
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

			var Td2 = $("<td></td>").append("姓名");
			var Td3 = $("<td></td>").append("地址");
			var Td4 = $("<td></td>").append("电话");
			var Td6 = $("<td></td>").append("所属服务区");
			var Td7 = $("<td></td>").append("操作");
			headTR.append(checkBox).append(Td2).append(Td3).append(Td4).append(
					Td6).append(Td7).appendTo($("#head"));

			$.each(result.extend.pageInfo.list, function(index, item) {

				var dataTR = $("<tr></tr>");
				var checkBoxData = $("<td></td>").addClass("text-center")
						.append(
								$("<input type='checkbox'/>").addClass(
										"item_check"));
				var dataTd2 = $("<td></td>").append(item.name);
				var dataTd3 = $("<td></td>").append(item.address);
				var dataTd4 = $("<td></td>").append(item.phone);
				var dataTd6 = $("<td></td>").append(item.service);

				var edit_btn = $("<button type='button'></button>").addClass(
						"btn btn-sm btn-success  update-btn").append(
						$("<span></span>").addClass(
								"glyphicon glyphicon-pencil")).append("修改");
				var sent_btn = $("<button type='button'></button>").addClass(
						"btn btn-sm btn-info").append(
						$("<span></span>").addClass(
								"glyphicon glyphicon-comment")).append("发送短信");
				edit_btn.attr("SmsId", item.id);
				sent_btn.attr("SmsId", item.id);
				sent_btn.attr("receiverphone", item.phone);

				//单个item发送事件
				sent_btn.click(function() {
					window.location.href = "Sms/intoSendSms?phone="
							+ sent_btn.attr("receiverphone");
				});
				
				//单个item修改事件
				edit_btn.click(function() {
					window.location.href = "old/intoUpdateOldManInfo?id="
							+ edit_btn.attr("SmsId"); 
				});


				dataTR.append(checkBoxData).append(dataTd2).append(dataTd3)
						.append(dataTd4).append(dataTd6).append(
								$("<td></td>").append(edit_btn).append(
										"&nbsp;&nbsp;&nbsp;&nbsp;").append(
										sent_btn)).appendTo($("#table_data"));
			});
		}

		//全选
		$(document).on("click", "#check_item_all", function() {
			$(".item_check").prop("checked", $(this).prop("checked"));
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
