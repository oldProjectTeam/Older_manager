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
<meta name="keywords" content="keyword1,keyword2,keyword3">
<meta name="description" content="this is my page">
<meta name="content-type" content="text/html; charset=UTF-8">
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
	<!-- 头部 -->
	<div class="col-md-12">
		<div>
			<div class="row">

				<ol class="breadcrumb">
					<li><b>位置：健康管理</b>>体检记录
				</ol>

			</div>
		</div>

		<!-- 新增按钮 -->

		<div class="row">
			<div class="col-md-4">
				<button type="button" class="btn btn-primary" id="add_btn">
					<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
					新增
				</button>
				<button type="button" class="btn btn-danger" id="old_delete_all_btn">
					<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
					批量删除
				</button>
			</div>
		</div>

		<!--条件查询  -->

		<div class="row form-inline" align="left" style="margin-top:10px;">
			<div class="col-md-12">
				老人姓名： <input type="text" class="form-control" id="oldmanname"
					placeholder="请输入老人姓名"> 体检医院： <input type="text"
					class="form-control" id="hospitalname" placeholder="请输入体检医院名称">


				<button class="btn btn-default" id="selectwith">
					<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
					查询
				</button>
			</div>
		</div>


		<!-- 表格开始 -->
		<div class="row" style="margin-top:10px;">
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



	<!-- 新增模态框 -->
	<div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog"
		aria-labelledby="myLargeModalLabel" id="add_modal">
		<div class="modal-dialog modal-lg" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">新增体检记录</h4>
				</div>

				<div class="modal-body">



					<div class="row">
						<div class="col-md-12">
							<form id="formid">
								<table class="table table-bordered table-hover text-center">
									<tr>
										<td>老人姓名</td>
										<td><select id="oldman_name" class="form-control"
											name="oldman.id">
										</select></td>
										<td>体检医院</td>
										<td><input name="peinfo.hospital" type="text"
											class="form-control"></td>
									</tr>
									<tr>

										<td>体检时间</td>
										<td><input name="peinfo.petime" type="date"
											class="form-control"></td>
										<td>下次体检时间</td>
										<td><input name="peinfo.nexttime" type="date"
											class="form-control"></td>
									</tr>
									<tr>

										<td>体检项目</td>
										<td><textarea class="form-control" rows="2"
												name="peproject"></textarea></td>
										<td>体检值</td>
										<td><textarea class="form-control" rows="2"
												name="pevalue"></textarea></td>
									</tr>
									<tr>

										<td>体检结果</td>
										<td><textarea class="form-control" rows="2"
												name="peresult"></textarea></td>
										<td>结果分析</td>
										<td><textarea class="form-control" rows="2"
												name="resultanalysis"></textarea></td>
									</tr>
									<tr>
										<td>备注</td>
										<td colspan="3"><textarea class="form-control" rows="2"
												name="peinfo.remark"></textarea></td>
									</tr>

								</table>
							</form>
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">返回</button>
					<button type="button" class="btn btn-primary" id="save_pe_btn">保存</button>
				</div>
			</div>
		</div>
	</div>

	<!-- 修改模态框 -->
	<div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog"
		aria-labelledby="myLargeModalLabel" id="update_modal">
		<div class="modal-dialog modal-lg" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">修改体检记录</h4>
				</div>

				<div class="modal-body">



					<div class="row">
						<div class="col-md-12">
							<form id="form_update">
								<table class="table table-bordered table-hover text-center">
									<tr>
										<td>老人姓名</td>
										<td>
											<p class="form-control-static" id="oldmanid"></p>
										</td>
										<td>体检医院</td>
										<td><input name="peinfo.hospital" type="text"
											class="form-control" id="hospitalid"></td>
									</tr>
									<tr>

										<td>体检时间</td>
										<td><input name="peinfo.petime" type="date"
											class="form-control" id="petimeid"></td>
										<td>下次体检时间</td>
										<td><input name="peinfo.nexttime" type="date"
											class="form-control" id="nexttimeid"></td>
									</tr>
									<tr>

										<td>体检项目</td>
										<td><textarea class="form-control" rows="2"
												name="peproject" id="peprojectid"></textarea></td>
										<td>体检值</td>
										<td><textarea class="form-control" rows="2"
												name="pevalue" id="pevalueid"></textarea></td>
									</tr>
									<tr>

										<td>体检结果</td>
										<td><textarea class="form-control" rows="2"
												name="peresult" id="peresultid"></textarea></td>
										<td>结果分析</td>
										<td><textarea class="form-control" rows="2"
												name="resultanalysis" id="resultanalysisid"></textarea></td>
									</tr>
									<tr>
										<td>备注</td>
										<td colspan="3"><textarea class="form-control" rows="2"
												name="peinfo.remark" id="remarkid"></textarea></td>
									</tr>

								</table>
							</form>
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">返回</button>
					<button type="button" class="btn btn-primary" id="update_pe_btn">更新</button>
				</div>
			</div>
		</div>
	</div>

	<!-- 查看模态框 -->
	<div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog"
		aria-labelledby="myLargeModalLabel" id="select_modal">
		<div class="modal-dialog modal-lg" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">查看体检记录</h4>
				</div>

				<div class="modal-body">



					<div class="row">
						<div class="col-md-12">
							<form id="form_update">
								<table class="table table-bordered table-hover text-center">
									<tr>
										<td>老人姓名</td>
										<td>
											<p class="form-control-static" id="oldmanid1"></p>
										</td>
										<td>体检医院</td>
										<td>
											<p class="form-control-static" id="hospitalid1"></p>
										</td>
									</tr>
									<tr>

										<td>体检时间</td>
										<td><p class="form-control-static" id="petimeid1"></p></td>
										<td>下次体检时间</td>
										<td>
											<p class="form-control-static" id="nexttimeid1"></p>
										</td>
									</tr>
									<tr>

										<td>体检项目</td>
										<td>
											<p class="form-control-static" id="peprojectid1"></p>
										</td>
										<td>体检值</td>
										<td>
											<p class="form-control-static" id="pevalueid1"></p>
										</td>
									</tr>
									<tr>

										<td>体检结果</td>
										<td><p class="form-control-static" id="peresultid1"></p></td>
										<td>结果分析</td>
										<td>
											<p class="form-control-static" id="resultanalysisid1"></p>
										</td>
									</tr>
									<tr>
										<td>备注</td>
										<td colspan="3"><p class="form-control-static"
												id="remarkid1"></p></td>
									</tr>

								</table>
							</form>
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">返回</button>
				</div>
			</div>
		</div>
	</div>

	<SCRIPT type="text/javascript">
		var totalRecord, currentNum, oldmanname = "", hospitalname = "";
		/* 分页 */
		$(function() {
			go(1, "", "");
			$("#old_delete_all_btn").attr("disabled", true);
		});
		function go(pn, oldmanname, hospitalname) {
			$("#old_delete_all_btn").attr("disabled", true);
			layer.msg('数据加载中...', {
				icon : 16,
				shade : 0.01
			});
			$.ajax({
				url : "${APP_PATH}/pe/selectallpe",
				data : {
					"pn" : pn,
					"oldmanname" : oldmanname,
					"hospitalname" : hospitalname,
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
				go(1, oldmanname, hospitalname);
			});
			var prePageLi = $("<li></li>").append(
					$("<a></a>").append("&laquo;"));
			if (result.extend.pageInfo.hasPreviousPage == false) {
				firstPageLi.addClass("disabled");
				prePageLi.addClass("disabled");
			} else {
				//为元素添加点击翻页事件
				prePageLi.click(function() {
					go(result.extend.pageInfo.pageNum - 1, oldmanname,
							hospitalname);
				});
			}
			var nextPageLi = $("<li></li>").append(
					$("<a></a>").append("&raquo;"));
			var lastPageLi = $("<li></li>").append($("<a></a>").append("末页"));
			lastPageLi.click(function() {
				go(result.extend.pageInfo.pages, oldmanname, hospitalname);
			});
			if (result.extend.pageInfo.hasNextPage == false) {
				nextPageLi.addClass("disabled");
				lastPageLi.addClass("disabled");
			} else {
				//为元素添加点击翻页事件
				nextPageLi.click(function() {
					go(result.extend.pageInfo.pageNum + 1, oldmanname,
							hospitalname);
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
					go(item, oldmanname, hospitalname);
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
			var Td3 = $("<td></td>").append("体检医院");
			var Td4 = $("<td></td>").append("体检时间");
			var Td5 = $("<td></td>").append("下次体检时间");
			var Td6 = $("<td></td>").append("体检结果");
			var Td7 = $("<td></td>").append("操作");
			headTR.append(checkBox).append(Td1).append(Td2).append(Td3).append(
					Td4).append(Td5).append(Td6).append(Td7).appendTo(
					$("#head"));

			$
					.each(
							result.extend.pageInfo.list,
							function(index, item) {
								var checkBoxTd = $("<td><input type='checkbox' class='check_item'/></td>");
								var ty1 = $("<td></td>").append(item.id);
								var ty2 = $("<td></td>").append(
										item.oldman.name);
								var ty3 = $("<td></td>").append(
										item.peinfo.hospital);
								var ty4 = $("<td></td>").append(
										ChangeDateFormat(item.peinfo.petime));
								var ty5 = $("<td></td>").append(
										ChangeDateFormat(item.peinfo.nexttime));
								var ty6 = $("<td></td>").append(item.peresult);

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
								var serchBtn = $("<button></button>").addClass(
										"btn btn-info btn-sm serchBtn").append(
										$("<span></span>").addClass(
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
								$("<tr></tr>").append(checkBoxTd).append(ty1)
										.append(ty2).append(ty3).append(ty4)
										.append(ty5).append(ty6).append(btnTd)
										.appendTo("#table_data");
							});
		}

		function ChangeDateFormat(d) {
			//将时间戳转为int类型，构造Date类型
			if (d != null) {
				var date = new Date(parseInt(d));

				//月份得+1，且只有个位数时在前面+0
				var month = date.getMonth() + 1 + "-";

				//日期为个位数时在前面+0
				var currentDate = date.getDate();

				//getFullYear得到4位数的年份 ，返回一串字符串
				return date.getFullYear() + "-" + month + currentDate;
			} else {
				return null;
			}

		}

		//点击搜索
		$("#selectwith").click(function() {
			oldmanname = $("#oldmanname").val();
			hospitalname = $("#hospitalname").val();

			go(1, oldmanname, hospitalname);

		});

		//全选
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

		//点击刪除
		$(document).on("click", ".delete_btn", function() {
			var delid = $(this).attr("del-id");
			var oldername = $(this).parents("tr").find("td:eq(2)").text();
			layer.confirm("确认删除【" + oldername + "】吗", function(index) {
				$.ajax({
					url : "${APP_PATH}/pe/deletepe/" + delid,
					type : "DELETE",
					success : function(result) {
						go(currentNum, oldmanname, hospitalname);
						layer.msg(result.msg);
					}
				});
			});
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
					layer.confirm("确认删除【" + empNames + "】吗", function(index) {
						//发送ajax请求
						$.ajax({
							url : "${APP_PATH}/pe/deleteallpe/" + del_idstr,
							type : "DELETE",
							success : function(result) {
								//回到当前页面
								go(currentNum, oldmanname, hospitalname);
								layer.msg(result.msg);
							}
						});
					});
				});

		//点击新增
		$("#add_btn").click(
				function() {

					//获取老人的名字
					$.ajax({
						url : "${APP_PATH}/old/selectallolderskiptakeactivity",
						type : "GET",
						success : function(result) {
							$.each(result.extend.oldman, function() {
								var optionoldmanid = $("<option></option>")
										.append(this.name).attr("value",
												this.id);
								//这个是通过id的形式
								//optionEle.appendTo("#dept_add_select");
								//这个通过模态框的形式  模态框的id
								optionoldmanid.appendTo("#oldman_name");
							});
						}
					});

					$("#add_modal").modal();

				});

		//点击保存	
		$("#save_pe_btn").click(function() {
			// alert($("#formid").serialize());
			$.ajax({
				url : "${APP_PATH}/pe/addpe",
				type : "POST",
				data : $("#formid").serialize(),
				success : function(result) {

					if (result.code == 100) {
						//1.关闭模态框
						$("#add_modal").modal('hide');
						go(totalRecord, oldmanname, hospitalname);
					}
				}

			});

		});

		//点击编辑
		//编辑信息按钮，弹出模态框
		$(document).on(
				"click",
				".edit_btn",
				function() {

					var edit = $(this).attr("edit-id");
					//3.把老人的id传递给模态框的编辑按钮
					$("#update_pe_btn")
							.attr("edit-id", $(this).attr("edit-id"));

					//发送请求获取
					$.ajax({
						url : "${APP_PATH}/pe/selectpebyid/" + edit,
						type : "GET",

						success : function(result) {

							if (result.code == 100) {

								//console.log(result);
								var rel = result.extend.pedetails;
								$("#oldmanid").text(rel.oldman.name);
								//alert(rel.oldman.name);
								$("#hospitalid").val(rel.peinfo.hospital);
								$("#petimeid").val(
										ChangeDateFormat(rel.peinfo.petime));
								$("#nexttimeid").val(
										ChangeDateFormat(rel.peinfo.nexttime));
								$("#peprojectid").val(rel.peproject);
								$("#pevalueid").val(rel.pevalue);
								$("#peresultid").val(rel.peresult);
								$("#resultanalysisid").val(rel.resultanalysis);
								$("#remarkid").val(rel.peinfo.remark);

								//弹出模态框
								$("#update_modal").modal();

							}
						}
					});
				});

		//点击更新
		$("#update_pe_btn").click(function() {
			var edit = $(this).attr("edit-id");
			$.ajax({
				url : "${APP_PATH}/pe/updatepe/" + edit,
				type : "POST",
				data : $("#update_modal form").serialize(),
				success : function(result) {

					if (result.code == 100) {
						//1.关闭模态框
						$("#update_modal").modal('hide');
						go(currentNum, oldmanname, hospitalname);
					}
				}

			});

		});

		//点击查看
		$(document).on(
				"click",
				".serchBtn",
				function() {

					var serch = $(this).attr("serch-id");
					//发送请求获取
					$.ajax({
						url : "${APP_PATH}/pe/selectpebyid/" + serch,
						type : "GET",

						success : function(result) {

							if (result.code == 100) {

								//console.log(result);
								var rel = result.extend.pedetails;
								$("#oldmanid1").text(rel.oldman.name);
								//alert(rel.oldman.name);
								$("#hospitalid1").text(rel.peinfo.hospital);
								$("#petimeid1").text(
										ChangeDateFormat(rel.peinfo.petime));
								$("#nexttimeid1").text(
										ChangeDateFormat(rel.peinfo.nexttime));
								$("#peprojectid1").text(rel.peproject);
								$("#pevalueid1").text(rel.pevalue);
								$("#peresultid1").text(rel.peresult);
								$("#resultanalysisid1")
										.text(rel.resultanalysis);
								$("#remarkid1").text(rel.peinfo.remark);

								//弹出模态框
								$("#select_modal").modal();
							}
						}
					});

				});
	</SCRIPT>
</body>
</html>
