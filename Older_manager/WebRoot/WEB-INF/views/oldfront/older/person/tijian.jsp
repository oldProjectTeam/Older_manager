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

<script src="${APP_PATH}/static/js/jquery-3.2.1.min.js"></script>
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
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
						<div class="xy-title">体检记录</div>
						<form class="form-inline" role="form">
							<div class="form-group col-md-5">
								<label for="" class="control-label">体检医院:</label> <input
									type="text" editable="false" id="hospital" class="pe_hosp"
									style="width: 200px; height: 32px; ">
							</div>

							<input id="search_btn" type="button"
								class="btn btn-success col-md-2" value="查询" />

						</form>

						<!-- 添加数据按钮开始 -->
						<button type="button" class="tjsj" data-toggle="modal"
							data-target="#jkda" id="add_info">+添加数据录入</button>
						<!-- 弹出框开始 -->
						<div id="add_modal" class="modal fade bs-example-modal-lg"
							tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel"
							aria-hidden="true" style="display: none;">
							<div class="modal-dialog modal-lg">
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal">
											<span aria-hidden="true">×</span> <span class="sr-only">Close</span>
										</button>
										<h4 class="modal-title">添加新数据</h4>
									</div>
									<div class="modal-body">
										<div class="row">
											<div class="col-md-6 col-md-offset-2">
												<form class="form-horizontal " role="form" id="form_list">
													<div class="form-group">
														<label for="" class="col-md-4 control-label">体检医院：</label>
														<div class="col-md-8" style="padding:0;">
															<input type="text" class="form-control  hospital"
																name="hospital" placeholder="">
															<p style="color:red"></p>
															<input type="hidden" name="oldmanId"
																value="${older.oldmanId}" />
														</div>
													</div>
													<div class="form-group">
														<label for="" class="col-md-4 control-label">体检项目：</label>
														<div class="col-md-8" style="padding:0;">
															<input type="text" class="form-control peproject"
																name="peproject" placeholder="体检项目">
															<p style="color:red"></p>
														</div>
													</div>
													<div class="form-group">
														<label for="" class="col-md-4 control-label">体检时间：</label>
														<input
															class="easyui-datebox datebox-f combo-f textbox-f petime"
															editable="false" type="date" name="petime"
															style="width: 280px; height: 30px; display: none;">
														<p style="color:red" id="pe_time"></p>
													</div>
													<div class="form-group">
														<label for="" class="col-md-4 control-label">下次体检时间：</label>
														<input
															class="easyui-datebox datebox-f combo-f textbox-f nexttime"
															editable="false" name="nexttime" type="date"
															style="width: 280px; height: 30px; display: none;">
														<p style="color:red" id="next_time"></p>
													</div>

													<div class="form-group">
														<label for="" class="col-md-4 control-label">体检值：</label>
														<div class="col-md-8" style="padding:0;">
															<input type="text" class="form-control pevalue"
																name="pevalue" placeholder="">
															<p style="color:red"></p>
														</div>
													</div>
													<div class="form-group">
														<label for="" class="col-md-4 control-label">体检结果：</label>
														<div class="col-md-8" style="padding:0;">
															<input type="text" class="form-control peresult"
																name="peresult" placeholder="">
															<p style="color:red"></p>
														</div>
													</div>
													<div class="form-group">
														<label for="" class="col-md-4 control-label">结果分析：</label>
														<div class="col-md-8" style="padding:0;">
															<input type="text" class="form-control resultanalysis"
																name="resultanalysis" placeholder="">
															<p style="color:red"></p>
														</div>
													</div>
													<div class="form-group">
														<label for="" class="col-md-4 control-label">备注：</label>
														<div class="col-md-8" style="padding:0;">
															<input type="text" class="form-control remark"
																name="remark" placeholder="">
															<p style="color:red"></p>
														</div>
													</div>


												</form>
											</div>
										</div>
									</div>
									<div class="modal-footer">
										<button type="button" class="btn btn-primary" id="save">保存</button>
										<button type="button" class="btn btn-default"
											data-dismiss="modal">关闭</button>

									</div>
								</div>
							</div>
						</div>
						<!-- 弹出框结束 -->
						<!-- 添加数据按钮结束 -->
						<!-- 编辑模态框 -->
						<div id="model_list" class="modal fade bs-example-modal-lg"
							tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel"
							aria-hidden="true" style="display: none;">
							<div class="modal-dialog modal-lg">
								<div class="modal-content">
									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal">
											<span aria-hidden="true">×</span> <span class="sr-only">Close</span>
										</button>
										<h4 class="modal-title">修改数据</h4>
									</div>
									<div class="modal-body">
										<div class="row">
											<div class="col-md-6 col-md-offset-2">
												<form class="form-horizontal " role="form" id="update_list">
													<div class="form-group">
														<label for="" class="col-md-4 control-label">体检医院：</label>
														<div class="col-md-8" style="padding:0;">
															<input type="text" class="form-control hospital1"
																name="hospital" id="peinfo_hospital" placeholder="">
															<p style="color:red"></p>
															<input type="hidden" name="id" id="peinfo_id" /> <input
																type="hidden" name="oldmanId" id="peinfo_oldmanId">
														</div>
													</div>
													<div class="form-group">
														<label for="" class="col-md-4 control-label">体检项目：</label>
														<div class="col-md-8" style="padding:0;">
															<input type="text" class="form-control peproject1"
																name="peproject" id="pedetails_peproject"
																placeholder="体检项目">
															<p style="color:red"></p>
														</div>
													</div>
													<div class="form-group">
														<label for="" class="col-md-4 control-label">体检时间：</label>
														<input
															class="easyui-datebox datebox-f combo-f textbox-f petime1"
															editable="false" id="peinfo_petime11" type="date"
															name="petime"
															style="width: 280px; height: 30px; display: none;">
														<p style="color:red" id="pe_time1"></p>
													</div>
													<div class="form-group">
														<label for="" class="col-md-4 control-label">下次体检时间：</label>
														<input
															class="easyui-datebox datebox-f combo-f textbox-f nexttime1"
															editable="false" id="peinfo_nexttime11" name="nexttime"
															type="date"
															style="width: 280px; height: 30px; display: none;">
														<p style="color:red" id="next_time1"></p>
													</div>
													<div class="form-group">
														<label for="" class="col-md-4 control-label">体检值：</label>
														<div class="col-md-8" style="padding:0;">
															<input type="text" class="form-control pevalue1"
																id="pedetails_pevalue" name="pevalue" placeholder="">
															<p style="color:red"></p>
														</div>
													</div>
													<div class="form-group">
														<label for="" class="col-md-4 control-label">体检结果：</label>
														<div class="col-md-8" style="padding:0;">
															<input type="text" class="form-control peresult1"
																id="pedetails_peresult" name="peresult" placeholder="">
															<p style="color:red"></p>
														</div>
													</div>
													<div class="form-group">
														<label for="" class="col-md-4 control-label">结果分析：</label>
														<div class="col-md-8" style="padding:0;">
															<input type="text" class="form-control resultanalysis1"
																id="pedetails_resultanalysis" name="resultanalysis"
																placeholder="">
															<p style="color:red"></p>
														</div>
													</div>
													<div class="form-group">
														<label for="" class="col-md-4 control-label">备注：</label>
														<div class="col-md-8" style="padding:0;">
															<input type="text" class="form-control remark1"
																id="peinfo_remark" name="remark" placeholder="">
															<p style="color:red"></p>
														</div>
													</div>
												</form>
											</div>
										</div>
									</div>
									<div class="modal-footer">
										<button type="button" class="btn btn-primary" id="update_save">保存</button>
										<button type="button" class="btn btn-default"
											data-dismiss="modal">关闭</button>

									</div>
								</div>
							</div>
						</div>

						<!-- 列表开始 -->
						<table
							class="table table-striped table-bordered table-hover text-center yyjl-table">
							<thead>
								<tr class="xy-head">
									<th class="col-md-2">时间</th>
									<th class="col-md-2">体检医院</th>
									<th class="col-md-2">项目</th>
									<th class="col-md-1">体检值</th>
									<th class="col-md-2">结果</th>
									<th class="col-md-3">操作</th>
								</tr>
							</thead>
							<tbody id="peinfo_list_info">

							</tbody>
						</table>
						<nav id="page_number"> </nav>
						<!-- 列表结束 -->
					</div>
					<!-- 健康数据结束 -->
					<!-- 右侧内容区结束 -->
				</div>
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
			page_peinfos(1);
		});

		var pagenumber;
		var pagetotal;

		//加载体检信息
		function peinfo_list(result) {
			$("#peinfo_list_info").empty();
			$.each(result.extend.pageInfo.list, function(index, item) {
				var list_tr = $("<tr></tr>");
				var list_td1 = $("<td></td>").append(
						ChangeDateFormat(item.petime));
				var list_td2 = $("<td></td>").append(item.hospital);
				var list_td3 = $("<td></td>").append(item.pedetails.peproject);
				var list_td4 = $("<td></td>").append(item.pedetails.pevalue);
				var list_td5 = $("<td></td>").append(item.pedetails.peresult);
				var list_but = $("<div></div>").append(
						$("<i></i>").addClass("jjda-btn-editer")).append("编辑")
						.addClass("jjda-btn").attr("data-toggle", "modal")
						.attr("peinfo_id", item.id).attr("id", "compile")
						.addClass("data-target", "#jkda");
				var list_butt = $("<div></div>").append(
						$("<i></i>").addClass("jjda-btn-del")).attr(
						"peinfo_id", item.id).attr("id", "delete").append("删除")
						.addClass("jjda-btn");
				var list_td6 = $("<td></td>").append(list_but)
						.append(list_butt);
				list_tr.append(list_td1).append(list_td2).append(list_td3)
						.append(list_td4).append(list_td5).append(list_td6)
						.appendTo($("#peinfo_list_info"));
			});

		}

		//分页条
		function page_list(result) {
			$("#page_number").empty();
			pagetotal = result.extend.pageInfo.total;
			var pageul = $("<ul></ul>").addClass("pagination");
			var pageli1 = $("<li></li>").append($("<a></a>").append("&lt;"));
			if (!result.extend.pageInfo.hasPreviousPage) {
				pageli1.addClass("disabled");
			}
			if (result.extend.pageInfo.hasPreviousPage) {
				pageli1.click(function() {
					page_peinfos(result.extend.pageInfo.pageNum - 1);
				});
			}

			pageul.append(pageli1);

			$.each(result.extend.pageInfo.navigatepageNums, function(index,
					item) {
				var pageli2 = $("<li></li>").append($("<a></a>").append(item));
				pageli2.click(function() {
					page_peinfos(item);
				});
				pagenumber = result.extend.pageInfo.pageNum;
				if (result.extend.pageInfo.pageNum == item) {
					pageli2.addClass("active");
				}

				pageul.append(pageli2);
			});
			var pageli3 = $("<li></li>").append($("<a></a>").append("&gt;"));
			if (!result.extend.pageInfo.hasNextPage) {
				pageli3.addClass("disabled");
			}
			if (result.extend.pageInfo.hasNextPage) {
				pageli3.click(function() {
					page_peinfos(result.extend.pageInfo.pageNum + 1);
				});
			}

			pageul.append(pageli3).appendTo($("#page_number"));
		}

		//分页加载体检信息
		function page_peinfos(pn) {
			var index = layer.load();
			$.ajax({
				url : "${APP_PATH}/peinfo/select",
				type : "POST",
				data : {
					pn : pn,
					userId : ${older.oldman.id}
				},
				success : function(result) {
					if (result.code == 100) {
						peinfo_list(result);
						page_list(result);
						layer.close(index);
					}
				}
			});
		}

		//根据id删除体检记录
		$(document).on("click", "#delete", function() {
			var id = $(this).attr("peinfo_id");
			layer.confirm("你确定要删除该条数据吗？", {
				offset : [ '32%', '48%' ]
			}, function(index) {
				$.ajax({
					url : "${APP_PATH}/peinfo/delete/" + id,
					type : "GET",
					success : function(result) {
						if (result.code == 100) {
							layer.msg("删除成功", {
								offset : [ '32%', '48%' ]
							});
							page_peinfos(pagenumber);
						}
					}
				});
			});
		});

		//根据id编辑体检记录
		$(document).on("click", "#compile", function() {
			$("#update_list").find("p").html("");
			$("#model_list").modal();
			$.ajax({
				url : "${APP_PATH}/peinfo/selectbyid",
				type : "POST",
				data : {
					id : $(this).attr("peinfo_id")
				},
				success : function(result) {
					update_list_info(result);
				}
			});
		});

		//加载需要更改的信息
		function update_list_info(result) {
			$("#peinfo_hospital").val(result.extend.peinfo.hospital);
			$("#peinfo_id").val(result.extend.peinfo.id);
			$("#peinfo_oldmanId").val(result.extend.peinfo.oldmanId);
			$("#pedetails_peproject").val(
					result.extend.peinfo.pedetails.peproject);
			$("#peinfo_petime11").datebox('setValue',
					ChangeDateFormat1(result.extend.peinfo.petime));
			$("#peinfo_nexttime11").datebox('setValue',
					ChangeDateFormat1(result.extend.peinfo.nexttime));
			$("#pedetails_pevalue").val(result.extend.peinfo.pedetails.pevalue);
			$("#pedetails_peresult").val(
					result.extend.peinfo.pedetails.peresult);
			$("#pedetails_resultanalysis").val(
					result.extend.peinfo.pedetails.resultanalysis);
			$("#peinfo_remark").val(result.extend.peinfo.remark);
		}

		//根据id更改数据请求
		var updateinfo = "fail";
		$("#update_save").click(
				function() {
					if ($(".hospital1").val() == '') {
						$(".hospital1").next("p").html("请输入4-16个英文组或者2-5个汉字");
						updateinfo = "fail";
						return false;
					}
					else{
						$(".hospital1").next("p").html("");
						updateinfo = "success";
					} if ($(".peproject1").val() == '') {
						$(".peproject1").next("p").html("请输入英文与汉字");
						updateinfo = "fail";
						return false;
					} else{
						$(".peproject1").next("p").html("");
						updateinfo = "success";
					} 
					var petime1= $(".petime1").datebox("getValue")	
					if (petime1== '') {
						$("#pe_time1").html("请输入体检时间");
						updateinfo = "fail";
						return false;
					} else{
						$("#pe_time1").html("");
						updateinfo = "success";
					}
					var nexttime1=$(".nexttime1").datebox("getValue");	
					if (nexttime1== '') {
						$("#next_time1").html("请输入下次体检时间");
						updateinfo = "fail";
						return false;
					} 
					else if (petime1>nexttime1) {
						$("#next_time1").html("请输入在体检时间之后的时间");
						updateinfo = "fail";
						return false;
					}else{
						$("#next_time1").html("");
						updateinfo = "success";
					} 
					if ($(".pevalue1").val() == '') {
						$(".pevalue1").next("p").html("请输入数字");
						updateinfo = "fail";
						return false;
					}else{
						$(".pevalue1").next("p").html("");
						updateinfo = "success";
					}
					
					if ($(".peresult1").val() == '') {
						$(".peresult1").next("p").html("请输入内容");
						updateinfo = "fail";
						return false;
					} else{
						$(".peresult1").next("p").html("");
						updateinfo = "success";
					}
					if ($(".resultanalysis1").val() == '') {
						$(".resultanalysis1").next("p").html("请输入内容");
						updateinfo = "fail";
						return false;
					} else{
						$(".resultanalysis1").next("p").html("");
						updateinfo = "success";
					} 
					if ($(".remark1").val() == '') {
						$(".remark1").next("p").html("请输入内容");
						updateinfo = "fail";
					}else{
						$(".remark1").next("p").html("");
						updateinfo = "success";
					}
					if(updateinfo=="success"){
						$.ajax({
							url : "${APP_PATH}/peinfo/update",
							type : "POST",
							data : $("#update_list").serialize(),
							success : function(result) {
								if (result.code == 100) {
									layer.msg("修改成功", {
										icon : 6,
										time : 1000,
										offset : [ '40%' ]
									});
									$("#model_list").modal("hide");
									page_peinfos(pagenumber);
								} else {
									layer.msg("修改失败", {
										icon : 5,
										time : 1000,
										offset : [ '32%', '48%' ]
									});
								}
							}
						});
					}

				});

		//模糊查询分页
		function dim_page_peinfos(pn) {
			var index = layer.load();
			$.ajax({
				url : "${APP_PATH}/peinfo/dimselect",
				type : "GET",
				data : {
					"pn" : pn,
					"hospital" : $("#hospital").val(),
					"oldmanId" : ${older.oldman.id}
				},
				success : function(result) {
					if (result.code == 100) {
						peinfo_list(result);
						page_list(result);
						layer.close(index);
					}
				}
			});
		}
		//模糊查询
		$("#search_btn").click(function() {
			dim_page_peinfos(1);
		});

		//打开增加数据的模态框
		$("#add_info").click(function() {
			clear_form_info("#form_list");
			$("#add_modal").modal();
		});

		//增加体检数据
		var save = "fail";
		$("#save").click(
				function() {

					if ($(".hospital").val() == '') {
						$(".hospital").next("p").html("请输入4-16个英文组或者2-5个汉字");
						save = "fail";
						return false;
					}else{
						$(".hospital").next("p").html("");
					}
					if ($(".peproject").val() == '') {
						$(".peproject").next("p").html("请输入英文与汉字");
						save = "fail";
						return false;
					}else{
						$(".peproject").next("p").html("");
					}
					var petime=$(".petime").datebox("getValue");
					if (petime=='') {
						$("#pe_time").html("请输入体检时间");
						save = "fail";
						return false;
					}else if(new Date(petime)>new Date()){
						$("#pe_time").html("体检时间不能是未来时间！");
						save = "fail";
						return false;
					}else{
						$("#pe_time").html("");
					}
					var nexttime=$(".nexttime").datebox("getValue");
					if (nexttime=='') {
						$("#next_time").html("请输入下次体检时间");
						save = "fail";
						return false;
					}
					if (new Date(petime)>new Date(nexttime)) {
						$("#next_time").html("下次体检时间不能小于体检时间!");
						save = "fail";
						return false;
					} else {
						$("#next_time").html("");
						save = "success";
					}
					
					if ($(".pevalue").val()=='') {
						$(".pevalue").next("p").html("请输入数字");
						save = "fail";
						return false;
					}  
					else{
						$(".pevalue").next("p").html("");
						save ="success";
					}
					if ($(".peresult").val() == '') {
						$(".peresult").next("p").html("请输入内容");
						save = "fail";
						return false;
					}else{
						$(".peresult").next("p").html("");
						save = "success";
					}
					if ($(".resultanalysis").val() == '') {
						$(".resultanalysis").next("p").html("请输入内容");
						save = "fail";
						return false;
					}else{
						$(".resultanalysis").next("p").html("");
						save = "success";
					}
					if ($(".remark").val() == '') {
						$(".remark").next("p").html("请输入内容");
						save = "fail";
						return false;
					}else{
						$(".remark").next("p").html("");
						save = "success";
					}
					if (save == "success") {
						$.ajax({
							url : "${APP_PATH}/peinfo/addpeinfo",
							type : "POST",
							data : $("#form_list").serialize(),
							success : function(result) {
								if (result.code == 100) {
									layer.msg("添加成功！", {
										icon : 6,
										time : 1000,
										offset : [ '32%', '48%' ]
									});
									$("#add_modal").modal("hide");
									page_peinfos(pagetotal);
								} else {
									layer.msg("添加失败！", {
										icon : 5,
										time : 1000,
										offset : [ '32%', '48%' ]
									});
									$("#model_list").modal("hide");
								}
								layer.msg(result.msg);
							}
						});
					}
				});
		//加载模态框之前清楚数据与样式
		function clear_form_info(element) {
			//清除表单内容
			$(element)[0].reset();
			//清空提示信息
			$(element).find("p").html("");
		}

		//对添加数据进行校验
		$(".hospital")
				.change(
						function() {
							var hospital = $(".hospital").val();
							var reghospital = /(^[a-zA-Z0-9_-]{4,16}$)|(^[\u2E80-\u9FFF]{2,5})/;
							if (!reghospital.test(hospital)) {
								$(this).next("p").html("请输入4-16个英文组或者2-5个汉字");
								save = "fail";
								return false;
							} else {
								$(this).next("p").html(" ");
								save = "success";
							}
						});

		$(".peproject").change(function() {
			var peproject = $(".peproject").val();
			var regpeproject = /^[A-Z|a-z|\u4e00-\u9fa5]*$/;
			if (!regpeproject.test(peproject)) {
				$(this).next("p").html("请输入英文与汉字");
				save = "fail";
			} else {
				$(this).next("p").html(" ");
				save = "success";
			}
		});
		/* $(".petime").change(function() {
			if ($(".petime").datebox("getValue") == '') {
				$("#pe_time").html("请输入体检时间");
				save = "fail";
			} else {
				$("#pe_time").html(" ");
				save = "success";
			}
		});
		$(".nexttime").change(function() {
			if ($(".nexttime").datebox("getValue") == '') {
				$("#next_time").html("请输入下次体检时间");
				save = "fail";
			} else {
				$("#next_time").html(" ");
				save = "success";
			}
		});
 */
		$(".pevalue").change(function() {
			var pevalue = $(".pevalue").val();
			var regpevalue =/^[0-9]+(.[0-9]{0,2})?$/;
			if (!regpevalue.test(pevalue)) {
				$(this).next("p").html("请输入数字");
				save = "fail";
			} else {
				$(this).next("p").html(" ");
				save = "success";
			}
		});
		//对更改数据信息校验
		$(".hospital1")
				.change(
						function() {
							var hospital = $(".hospital1").val();
							var reghospital = /(^[a-zA-Z0-9_-]{4,16}$)|(^[\u2E80-\u9FFF]{2,5})/;
							if (!reghospital.test(hospital)) {
								$(this).next("p").html("请输入4-16个英文组或者2-5个汉字");
								updateinfo = "fail";
							} else {
								$(this).next("p").html(" ");
								updateinfo = "success";
							}
						});
		$(".peproject1").change(function() {
			var peproject = $(".peproject1").val();
			var regpeproject = /^[A-Z|a-z|\u4e00-\u9fa5]*$/;
			if (!regpeproject.test(peproject)) {
				$(this).next("p").html("请输入英文与汉字");
				updateinfo = "fail";
			} else {
				$(this).next("p").html(" ");
				updateinfo = "success";
			}
		});
		/* $(".petime1").change(function() {
			if ($(".petime1").datebox("getValue") == '') {
				$("#pe_time1").html("请输入体检时间");
				updateinfo = "fail";
			} else {
				$("#pe_time1").html(" ");
				updateinfo = "success";
			}
		});
		$(".nexttime1").change(function() {
			if ($(".nexttime1").datebox("getValue") == '') {
				$("#next_time1").html("请输入下次体检时间");
				updateinfo = "fail";
			} else {
				$("#next_time1").html(" ");
				updateinfo = "success";
			}
		}); */

		$(".pevalue1").change(function() {
			var pevalue = $(".pevalue1").val();
			var regpevalue =/^[0-9]+(.[0-9]{0,2})?$/;
			if (!regpevalue.test(pevalue)) {
				$(this).next("p").html("请输入数字");
				updateinfo = "fail";
			} else {
				$(this).next("p").html(" ");
				updateinfo = "success";
			}
		});

		//时间格式转换
		function ChangeDateFormat1(d) {
			//将时间戳转为int类型，构造Date类型
			if (d != null) {
				var date = new Date(parseInt(d));

				//月份得+1，且只有个位数时在前面+0
				var month = date.getMonth() + 1 + "-";

				//日期为个位数时在前面+0
				var currentDate = date.getDate() + "-";

				//getFullYear得到4位数的年份 ，返回一串字符串
				return date.getFullYear() + "-" + month + currentDate;
			} else {
				return null;
			}
		}
		//时间格式转换
		function ChangeDateFormat(p) {
			if (p != null) {
				var date = new Date(parseInt(p));
				//获得月份
				var month = date.getMonth() + 1 + "月";
				//获得天
				var currentDate = date.getDate() + "日";
				//getFullYear得到4位数的年份 ，返回一串字符串
				return date.getFullYear() + "年" + month + currentDate;
			}
		}
	</script>

</body>
</html>
