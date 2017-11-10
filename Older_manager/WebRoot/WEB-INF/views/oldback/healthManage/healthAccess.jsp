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
<body>
	<div class="col-sm-12">
		<!--路劲导航  -->
		<div class="row">
			<div class="col-md-12">
				<ol class="breadcrumb">
					<li><b>位置：<a
							href="static/oldback/oldManInfoMange/index.html">老人档案管理</a></b></li>
					<li class="active">健康评估</li>

				</ol>
			</div>
		</div>

		<div class="row">
			<div class="col-md-6">
				&nbsp;
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
		<div class="row form-inline" style="margin-top:5px">

			<div class="col-md-12">
				老人姓名： <input type="text" class="form-control" id="oldmanname1"
					placeholder="请输入老人名字"> 健康状况：<select id="health1"
					class="form-control">
					<option>请选择</option>
					<option>健康</option>
					<option>亚健康</option>
					<option>不健康</option>
				</select>

				<button class="btn btn-default" id="selectwith">
					<span class="glyphicon glyphicon-search"></span> 查询
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
	<div class="modal fade" tabindex="-1" role="dialog" id="add_modal">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">新增健康评估</h4>
				</div>
				<div class="modal-body">
					<div class="row">
						<div class="col-md-12">
							<form id="formid">
								<table class="table table-bordered table-hover text-center">
									<tr>
										<td><font color="red">*</font>老人姓名</td>
										<td><select id="oldman_name" class="form-control"
											name="oldmanId">
										</select></td>
										<td><font color="red">*</font>医生姓名</td>
										<td><input name="doctor" type="text" class="form-control"
											id="doctorName"></td>
									</tr>
									<tr>

										<td><font color="red">*</font>健康状况</td>
										<td><textarea class="form-control" rows="2" name="health"
												id="healthInfo"></textarea></td>
										<td><font color="red">*</font>健康评估</td>
										<td><textarea class="form-control" rows="2"
												name="healthdataassessment" id="healthUltimate"></textarea></td>
									</tr>
									<tr>
										<td><font color="red">*</font>医生建议</td>
										<td colspan="3"><textarea class="form-control" rows="2"
												name="suggest" id="doctorSuggest"></textarea></td>
									</tr>
								</table>
							</form>
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary" id="save_assess_btn">保存</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<!-- /.modal -->

	<!-- 修改模态框 -->
	<div class="modal fade" tabindex="-1" role="dialog" id="update_modal">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">修改健康评估</h4>
				</div>
				<div class="modal-body">
					<div class="row">
						<div class="col-md-12">
							<form id="form_update">
								<table class="table table-bordered table-hover text-center">
									<tr>
										<td><font color="red">*</font>老人姓名</td>
										<td>
											<p class="form-control-static" id="oldmanid"></p>
										</td>
										<td><font color="red">*</font>医生姓名</td>
										<td><input name="doctor" type="text" class="form-control"
											id="doctorid"></td>
									</tr>
									<tr>

										<td><font color="red">*</font>健康状况</td>
										<td><textarea class="form-control" rows="2" name="health"
												id="healthid"></textarea></td>
										<td><font color="red">*</font>健康评估</td>
										<td><textarea class="form-control" rows="2"
												name="healthdataassessment" id="healthdataassessmentid"></textarea>
										</td>
									</tr>
									<tr>
										<td><font color="red">*</font>医生建议</td>
										<td colspan="3"><textarea class="form-control" rows="2"
												name="suggest" id="suggestid"></textarea></td>
									</tr>

								</table>
							</form>
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="button" class="btn btn-primary"
						id="update_assess_btn">更新</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<!-- /.modal -->

	<!-- 查看模态框 -->
	<div class="modal fade" tabindex="-1" role="dialog" id="selectmodal">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">查看健康评估</h4>
				</div>
				<div class="modal-body">
					<div class="row">
						<div class="col-md-12">
							<form id="">
								<table class="table table-bordered table-hover text-center">
									<tr>
										<td>老人姓名</td>
										<td>
											<p class="form-control-static" id="oldmanid1"></p>
										</td>
										<td>医生姓名</td>
										<td>
											<p class="form-control-static" id="doctorid1"></p>
										</td>
									</tr>
									<tr>

										<td>健康状况</td>
										<td>
											<p class="form-control-static" id="healthid1"></p>
										</td>
										<td>健康评估</td>
										<td>
											<p class="form-control-static" id="healthdataassessmentid1"></p>
										</td>
									</tr>
									<tr>
										<td>医生建议</td>
										<td colspan="3">
											<p class="form-control-static" id="suggestid1">
										</td>
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
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<!-- /.modal -->
	<script type="text/javascript">
		var totalRecord, currentNum, oldmanname = "", healthname = "";
		/* 分页 */
		$(function() {
			go(1, "", "");
			$("#old_delete_all_btn").attr("disabled", true);
		});
		function go(pn, oldmanname, healthname) {
			$("#old_delete_all_btn").attr("disabled", true);
			layer.msg('数据加载中...', {
				icon : 16,
				shade : 0.01
			});
			$.ajax({
				url : "${APP_PATH}/access/selectallhealthassess",
				data : {
					"pn" : pn,
					"oldmanname" : oldmanname,
					"healthname" : healthname,
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
				go(1, oldmanname, healthname);
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
							healthname);
				});
			}
			var nextPageLi = $("<li></li>").append(
					$("<a></a>").append("&raquo;"));
			var lastPageLi = $("<li></li>").append($("<a></a>").append("末页"));
			lastPageLi.click(function() {
				go(result.extend.pageInfo.pages, oldmanname, healthname);
			});
			if (result.extend.pageInfo.hasNextPage == false) {
				nextPageLi.addClass("disabled");
				lastPageLi.addClass("disabled");
			} else {
				//为元素添加点击翻页事件
				nextPageLi.click(function() {
					go(result.extend.pageInfo.pageNum + 1, oldmanname,
							healthname);
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
					go(item, oldmanname, healthname);
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
			var Td3 = $("<td></td>").append("医生姓名");
			var Td4 = $("<td></td>").append("健康状况");
			var Td5 = $("<td></td>").append("健康评估");
			var Td6 = $("<td></td>").append("操作");
			headTR.append(checkBox).append(Td1).append(Td2).append(Td3).append(
					Td4).append(Td5).append(Td6).appendTo($("#head"));

			$
					.each(
							result.extend.pageInfo.list,
							function(index, item) {
								var checkBoxTd = $("<td><input type='checkbox' class='check_item'/></td>");
								var ty1 = $("<td></td>").append(item.id);
								var ty2 = $("<td></td>").append(
										item.oldman.name);
								var ty3 = $("<td></td>").append(item.doctor);
								var ty4 = $("<td></td>").append(item.health);
								var ty5 = $("<td></td>").append(
										item.healthdataassessment);
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
										.append(ty5).append(btnTd).appendTo(
												"#table_data");
							});
		}

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

		//搜索
		$("#selectwith").click(function() {
			oldmanname = $("#oldmanname1").val();
			healthname = $("#health1").val();

			go(1, oldmanname, healthname);

		});

		//点击刪除
		$(document).on("click", ".delete_btn", function() {
			var delid = $(this).attr("del-id");
			var oldername = $(this).parents("tr").find("td:eq(2)").text();
			layer.confirm("确认删除【" + oldername + "】吗", function(index) {
				$.ajax({
					url : "${APP_PATH}/access/deletehealthassess/" + delid,
					type : "DELETE",
					success : function(result) {
						go(currentNum, oldmanname, healthname);
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
							url : "${APP_PATH}/access/deleteallhealthassess/"
									+ del_idstr,
							type : "DELETE",
							success : function(result) {
								//回到当前页面
								go(currentNum, oldmanname, healthname);
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
		$("#save_assess_btn").click(
				function() {
					if ($("#doctorName").val() == ''
							|| $("#healthInfo").val() == ''
							|| $("#healthUltimate").val() == ''
							|| $("#doctorSuggest").val() == '') {
						layer.msg("请填写完必填项再保存");
					} else {
						$.ajax({
							url : "${APP_PATH}/access/addhealthassess",
							type : "POST",
							data : $("#formid").serialize(),
							success : function(result) {

								if (result.code == 100) {
									//1.关闭模态框
									$("#add_modal").modal('hide');
									go(totalRecord, oldmanname, healthname);
									layer.msg("添加成功");
									$("#formid")[0].reset();
								}
							}

						});
					}
				});

		//编辑信息按钮，弹出模态框
		$(document).on(
				"click",
				".edit_btn",
				function() {

					var edit = $(this).attr("edit-id");
					//3.把老人的id传递给模态框的编辑按钮
					$("#update_assess_btn").attr("edit-id",
							$(this).attr("edit-id"));

					//发送请求获取
					$.ajax({
						url : "${APP_PATH}/access/selecthealthassessbyid/"
								+ edit,
						type : "GET",

						success : function(result) {

							if (result.code == 100) {

								//console.log(result);
								var rel = result.extend.assess;
								$("#oldmanid").text(rel.oldman.name);
								$("#doctorid").val(rel.doctor);
								$("#healthid").val(rel.health);
								$("#healthdataassessmentid").val(
										rel.healthdataassessment);
								$("#suggestid").val(rel.suggest);

								//弹出模态框
								$("#update_modal").modal();

							}
						}
					});
				});

		//点击更新
		$("#update_assess_btn").click(function() {
		     if($("#doctorid").val()==''||
		        $("#healthid").val()==''||
		        $("#healthdataassessmentid").val()==''||
		        $("#suggestid").val()==''){
		        layer.msg("请填写完必填项再保存");
		        }else{
		        var edit = $(this).attr("edit-id");
			$.ajax({
				url : "${APP_PATH}/access/updatehealthassess/" + edit,
				type : "POST",
				data : $("#update_modal form").serialize(),
				success : function(result) {

					if (result.code == 100) {
						//1.关闭模态框
						$("#update_modal").modal('hide');
						go(currentNum, oldmanname, healthname);
						layer.msg("更新成功");
					}
				}

			});
		        }
			

		});

		//点击查看
		$(document).on(
				"click",
				".serchBtn",
				function() {
					var serch = $(this).attr("serch-id");
					//发送请求获取
					$.ajax({
						url : "${APP_PATH}/access/selecthealthassessbyid/"
								+ serch,
						type : "GET",

						success : function(result) {

							if (result.code == 100) {

								//console.log(result);
								var rel = result.extend.assess;
								$("#oldmanid1").text(rel.oldman.name);
								$("#doctorid1").text(rel.doctor);
								$("#healthid1").text(rel.health);
								$("#healthdataassessmentid1").text(
										rel.healthdataassessment);
								$("#suggestid1").text(rel.suggest);

								//弹出模态框
								$("#selectmodal").modal();

							}
						}
					});

				});
	</script>
</body>
</html>
