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
							用药记录
							<button type="button" class="btn back fr" id="btnclose"
								onClick="javascript:history.go(-1);">返回</button>
						</div>

						<div class="form-group col-md-5">
							<label for="" class="control-label">开始时间：</label> <input
								class="easyui-datebox datebox-f combo-f textbox-f"
								editable="false" id="h_Time1"
								style="width: 180px; height: 30px; display: none;">
						</div>
						<div class="form-group col-md-5">
							<label for="" class="control-label">结束时间：</label> <input
								class="easyui-datebox datebox-f combo-f textbox-f"
								editable="false" id="h_Time2"
								style="width: 180px; height: 30px; display: none;">
						</div>
						<button id="chaxun" class="btn btn-success col-md-2">查询</button>


						<!-- 添加数据按钮开始 -->
						<button type="button" class="tjsj" data-toggle="modal"
							data-target="#jkda">+添加数据录入</button>
						<!-- 弹出框开始 -->
						<div id="jkda" class="modal fade bs-example-modal-lg"
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
												<form class="form-horizontal " role="form" id="addformid">
													<div class="form-group">
														<label for="" class="col-md-4 control-label">药名：</label>
														<div class="col-md-8" style="padding:0;">
															<input type="text" class="form-control" id="yaoname"
																placeholder="" name="medicines">
														</div>
													</div>
													<div class="form-group">
														<label for="" class="col-md-4 control-label">作用：</label>
														<div class="col-md-8" style="padding:0;">
															<input type="text" class="form-control" name="role"
																id="zuoyong" placeholder="">
														</div>
													</div>
													<!-- 开始时间与结束时间 -->
													<input type="hidden" name="starttakingdate" id="startid">
													<input type="hidden" name="endtakingdate" id="endid">
													<!-- 使用方法 -->
													<input type="hidden" id="mehtodid" name="methoduse">
													<input type="hidden" name="oldmanId"
														value="${older.oldmanId}">
													<div class="form-group">
														<label for="" class="col-md-4 control-label">开始日期：</label>
														<input class="easyui-datebox datebox-f combo-f textbox-f"
															editable="false" id="h_kaishi"
															style="width: 280px; height: 30px; display: none;">
													</div>
													<div class="form-group">
														<label for="" class="col-md-4 control-label">结束日期：</label>
														<input class="easyui-datebox datebox-f combo-f textbox-f"
															editable="false" id="h_jieshu"
															style="width: 280px; height: 30px; display: none;">
													</div>
													<div class="form-group">
														<label for="" class="col-md-4 control-label">用药剂量：</label>
														<div class="col-md-8" style="padding:0;">
															<input type="text" class="form-control" id="jiliang"
																placeholder="" name="dosage">
														</div>
													</div>

													<div class="form-group ">
														<label for="" class="col-md-4 control-label">使用方法：</label>
														<div class="col-md-3 " style="padding:0;">
															<select class="form-control" id="fangfa">
																<option value="口服">口服</option>
																<option value="外用">外用</option>

															</select>
														</div>
														<div class="col-md-2 " style="padding:0;">
															<select class="form-control" id="danwei1">
																<option value="1">1</option>
																<option value="2">2</option>
																<option value="3">3</option>
																<option value="4">4</option>
																<option value="5">5</option>
															</select>
														</div>
														<div class="col-md-3 " style="padding:0;">
															<select class="form-control" id="danwei">
																<option value="次/天">次/天</option>
																<option value="次/周">次/周</option>
																<option value="次/月">次/月</option>
															</select>
														</div>
													</div>
													<div class="form-group ">
														<label for="" class="col-md-4 control-label">服用疗程：</label>
														<div class="col-md-8 " style="padding:0;">
															<select class="form-control" id="liaocheng"
																name="takedrugdetails2">

																<option value="两个月">两个月</option>
																<option value="一个月">一个月</option>
																<option value="半个月">半个月</option>
																<option value="一周">一周</option>
															</select>
														</div>
													</div>

												</form>
											</div>
										</div>
									</div>
									<div class="modal-footer">
										<button type="button" class="btn btn-primary" id="saveid">保存</button>
										<button type="button" class="btn btn-default"
											data-dismiss="modal">关闭</button>

									</div>
								</div>
							</div>
						</div>
						<!-- 弹出框结束 -->
						<!-- 弹出框编辑开始 -->
						<div id="updateformid" class="modal fade bs-example-modal-lg"
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
												<form class="form-horizontal " role="form" id="upformid">
													<div class="form-group">
														<label for="" class="col-md-4 control-label">药名：</label>
														<div class="col-md-8" style="padding:0;">
															<input type="text" class="form-control" id="upyaoname"
																placeholder="" name="medicines" readonly="readonly">
														</div>
													</div>
													<div class="form-group">
														<label for="" class="col-md-4 control-label">作用：</label>
														<div class="col-md-8" style="padding:0;">
															<input type="text" class="form-control" name="role"
																id="upzuoyong" placeholder="">
														</div>
													</div>
													<!-- 开始时间与结束时间 -->
													<input type="hidden" name="starttakingdate" id="upstartid">
													<input type="hidden" name="endtakingdate" id="upendid">
													<!-- 使用方法 -->
													<input type="hidden" id="upmehtodid" name="methoduse">
													<input type="hidden" name="upoldmanId"
														value="${older.oldmanId}">
													<div class="form-group">
														<label for="" class="col-md-4 control-label">开始日期：</label>
														<input class="easyui-datebox datebox-f combo-f textbox-f"
															editable="false" id="uph_kaishi"
															style="width: 280px; height: 30px; display: none;">
													</div>
													<div class="form-group">
														<label for="" class="col-md-4 control-label">结束日期：</label>
														<input class="easyui-datebox datebox-f combo-f textbox-f"
															editable="false" id="uph_jieshu"
															style="width: 280px; height: 30px; display: none;">
													</div>
													<div class="form-group">
														<label for="" class="col-md-4 control-label">用药剂量：</label>
														<div class="col-md-8" style="padding:0;">
															<input type="text" class="form-control" id="upjiliang"
																placeholder="" name="dosage">
														</div>
													</div>

													<div class="form-group ">
														<label for="" class="col-md-4 control-label">使用方法：</label>
														<div class="col-md-3 " style="padding:0;">
															<select class="form-control" id="upfangfa">
																<option value="口服">口服</option>
																<option value="外用">外用</option>

															</select>
														</div>
														<div class="col-md-2 " style="padding:0;">
															<select class="form-control" id="updanwei1">
																<option value="1">1</option>
																<option value="2">2</option>
																<option value="3">3</option>
																<option value="4">4</option>
																<option value="5">5</option>
															</select>
														</div>
														<div class="col-md-3 " style="padding:0;">
															<select class="form-control" id="updanwei">
																<option value="次/天">次/天</option>
																<option value="次/周">次/周</option>
																<option value="次/月">次/月</option>
															</select>
														</div>
													</div>
													<div class="form-group ">
														<label for="" class="col-md-4 control-label">服用疗程：</label>
														<div class="col-md-8 " style="padding:0;">
															<select class="form-control" id="upliaocheng"
																name="takedrugdetails2">

																<option value="两个月">两个月</option>
																<option value="一个月">一个月</option>
																<option value="半个月">半个月</option>
																<option value="一周">一周</option>
															</select>
														</div>
													</div>

												</form>
											</div>
										</div>
									</div>
									<div class="modal-footer">
										<button type="button" class="btn btn-primary" id="updaateid">更新</button>
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
									<th class="col-md-3">药名</th>
									<th class="col-md-3">作用</th>
									<th class="col-md-3">时间</th>
									<th class="col-md-3">操作</th>
								</tr>
							</thead>

							<tbody id="disease_tbody">

							</tbody>
						</table>
						<!--分页信息  -->
						<div class="row">
							<div class="col-md-10 col-md-offset-1" id="page_info"></div>
						</div>
						<div class="row">
							<div class="col-md-10 col-md-offset-1">
								<nav aria-label="Page navigation" style="float:right">
								<ul class="pagination pagination-sm" id="nav_ul_info">

								</ul>
								</nav>
							</div>
						</div>
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
			to_page(1, null, null);
		});

		var current_pageNum = "";
		var current_pages = "";
		var time1 = null, time2 = null;
		//构建表格信息
		function build_table(result) {
			current_pageNum = result.extend.pageInfo.pageNum;
			current_pages = result.extend.pageInfo.pages;
			$("#disease_tbody").empty();
			$.each(result.extend.pageInfo.list, function(index, item) {
				var td1 = $("<td></td>").append(item.medicines);
				var td2 = $("<td></td>").append(item.role);
				var td3 = $("<td></td>").append(
						ChangeDateFormat(item.starttakingdate) + "至"
								+ ChangeDateFormat(item.endtakingdate));
				var editbtn = $("<div class='jjda-btn editbtn'></div>").append(
						"<i class='jjda-btn-editer'></i>").append("编辑");
				editbtn.attr("edid", item.id);
				var deletebtn = $("<div class='jjda-btn deleteid'></div>")
						.append("<i class='jjda-btn-del'></i>").append("删除");
				deletebtn.attr("delid", item.id);
				var td4 = $("<td></td>").append(editbtn).append(" ").append(
						deletebtn);
				var tr = $("<tr></tr>");
				tr.append(td1).append(td2).append(td3).append(td4).appendTo(
						"#disease_tbody");
			});
		}

		//构建分页信息
		function buil_table_pageInfo(result) {
			$("#nav_ul_info").empty();
			$("#page_info").empty();
			//左边分页信息
			var pageInfo = result.extend.pageInfo;
			$("#page_info").append(
					" 当前第 " + pageInfo.pageNum + " 页，共 " + pageInfo.pages
							+ "页，共计 " + pageInfo.total + " 条数据")

			//右边分页导航
			var firstPage = $("<li></li>").append($("<a></a>").append("首页"));
			var prePage = $("<li></li>").append($("<a></a>").append("&laquo;"));
			var nextPage = $("<li></li>")
					.append($("<a></a>").append("&raquo;"));
			var lastPage = $("<li></li>").append($("<a></a>").append("末页"));
			if (result.extend.pageInfo.hasPreviousPage == false) {
				firstPage.addClass("disabled");
				prePage.addClass("disabled");
			} else {
				firstPage.click(function() {
					to_page(1, time1, time2);
				});
				prePage.click(function() {
					to_page(result.extend.pageInfo.pageNum - 1, time1, time2);
				});
			}
			if (result.extend.pageInfo.hasNextPage == false) {
				nextPage.addClass("disabled");
				lastPage.addClass("disabled");
			} else {
				nextPage.click(function() {
					to_page(result.extend.pageInfo.pageNum + 1, time1, time2);
				});
				lastPage.click(function() {
					to_page(result.extend.pageInfo.pages, time1, time2);
				});
			}
			$("#nav_ul_info").append(firstPage).append(prePage);
			$.each(result.extend.pageInfo.navigatepageNums, function(index,
					item) {
				var numLi = $("<li></li>").append($("<a></a>").append(item));
				if (result.extend.pageInfo.pageNum == item) {
					numLi.addClass("active");
				}
				numLi.click(function() {
					to_page(item, time1, time2);
				});
				$("#nav_ul_info").append(numLi);
			});
			$("#nav_ul_info").append(nextPage).append(lastPage);

		}

		//去哪页加载数据
		function to_page(pn, time1, time2) {
			layer.msg('加载中', {
				icon : 16,
				shade : 0.01,
				time : 100000,
				offset : [ '40%' ],
			});
			$.ajax({
				url : "${APP_PATH}/takedrug/selectalltakedrug",
				data : {
					pn : pn,
					time1 : time1,
					time2 : time2,
					id : ${older.oldmanId},
				},
				type : "post",
				success : function(result) {
					layer.closeAll();
					//console.log(result);
					//1.构建表格数据
					build_table(result);
					//2.构建页信息
					buil_table_pageInfo(result);
				}
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

		//搜索
		$("#chaxun").click(
				function() {
					if ($('#h_Time1').datebox('getValue') != ''
							&& $('#h_Time2').datebox('getValue') != '') {
						time1 = $('#h_Time1').datebox('getValue');
						time2 = $('#h_Time2').datebox('getValue');
						if (time1 < time2) {
							to_page(1, time1, time2);
						} else {
							layer.msg("结束时间应该在开始时间之后");
						}

					} else if ($('#h_Time1').datebox('getValue') != ''
							|| $('#h_Time2').datebox('getValue') != '') {
						layer.msg("请选择正确的开始时间与结束时间");
					} else if ($('#h_Time1').datebox('getValue') == ''
							|| $('#h_Time2').datebox('getValue') == '') {

						time1 = $('#h_Time1').datebox('getValue');
						time2 = $('#h_Time2').datebox('getValue');
						to_page(1, time1, time2);

					}

				});

		//删除

		$(document).on("click", ".deleteid", function() {
			var id = $(this).attr("delid");

			layer.confirm("确认删除吗？", function() {
				$.ajax({
					url : "${APP_PATH}/takedrug/deletetakedrug/" + id,
					type : "POST",
					success : function(result) {
						if (result.code = 100) {
							layer.msg("删除成功");
							to_page(current_pageNum, time1, time2);
						}
					}

				});
			});

		});

		$("#saveid")
				.click(
						function() {

							$("#mehtodid").val(
									$("#fangfa").val() + "-"
											+ $("#danwei1").val() + "-"
											+ $("#danwei").val());

							if ($("#yaoname").val() == null
									|| $("#yaoname").val() == ''
									|| $("#zuoyong").val() == null
									|| $("#zuoyong").val() == ''
									|| $('#h_jieshu').datebox('getValue') == null
									|| $('#h_jieshu').datebox('getValue') == ''
									|| $('#h_kaishi').datebox('getValue') == null
									|| $('#h_kaishi').datebox('getValue') == ''
									|| $("#jiliang").val() == null
									|| $("#jiliang").val() == '') {
								layer.msg("填完所有类容在保存！");
							} else {
								if ($('#h_jieshu').datebox('getValue') > $(
										'#h_kaishi').datebox('getValue')) {
									$("#startid").val(
											$('#h_kaishi').datebox('getValue'));
									$("#endid").val(
											$('#h_jieshu').datebox('getValue'));

									var dd = /^[\u4E00-\u9FA5A-Za-z0-9]{2,20}$/;
									var num = /^[A-Za-z0-9]{1,20}$/;
									if (!dd.test($("#yaoname").val())){
									  layer.msg("输入的药名不规范");
									}else{
									         if(!dd.test($("#zuoyong").val())){
									            layer.msg("输入的作用不规范");
									         }else{
									              if(!num.test($("#jiliang").val())){
									              
									              layer.msg("输入的药量不规范");
									              }else{
									              
									                $
												.ajax({
													url : "${APP_PATH}/takedrug/addtakedrug",
													type : "POST",
													data : $("#addformid")
															.serialize(),
													success : function(result) {
														if (result.code == 100) {

															$("#jkda").modal(
																	'hide');
															$("#addformid")[0]
																	.reset();
															to_page(1, time1,
																	time2);
															layer.msg("添加成功");
														}
													}
												});
									                
									              }
									         }
									}
											
								} else {
									layer.msg("结束时间应该在开始时间之后");
								}

							}

						});

		//点击编辑

		$(document)
				.on(
						"click",
						".editbtn",
						function() {
							$("#updaateid").attr("upid", $(this).attr("edid"));

							$
									.ajax({
										url : "${APP_PATH}/takedrug/selettakedrugbyid/"
												+ $(this).attr("edid"),
										type : "GET",
										success : function(result) {
											if (result.code == 100) {
												$("#updateformid").modal();
												var rel = result.extend.tdd;
												$("#upyaoname").val(
														rel.medicines);
												$("#upzuoyong").val(rel.role);
												$("#uph_kaishi")
														.datebox(
																'setValue',
																ChangeDateFormat(rel.starttakingdate));
												$("#uph_jieshu")
														.datebox(
																'setValue',
																ChangeDateFormat(rel.endtakingdate));
												$("#upjiliang").val(rel.dosage);
												var a = rel.methoduse
														.split("-");
												$("#upfangfa").val([ a[0] ]);
												$("#updanwei1").val([ a[1] ]);
												$("#updanwei").val([ a[2] ]);
												$("#upliaocheng")
														.val(
																[ rel.takedrugdetails2 ]);

											}
										}
									});

						});

		//点击更新					
		$("#updaateid")
				.click(
						function() {

							$("#upmehtodid").val(
									$("#upfangfa").val() + "-"
											+ $("#updanwei1").val() + "-"
											+ $("#updanwei").val());

							if ($("#upyaoname").val() == null
									|| $("#upyaoname").val() == ''
									|| $("#upzuoyong").val() == null
									|| $("#upzuoyong").val() == ''
									|| $('#uph_jieshu').datebox('getValue') == null
									|| $('#uph_jieshu').datebox('getValue') == ''
									|| $('#uph_kaishi').datebox('getValue') == null
									|| $('#uph_kaishi').datebox('getValue') == ''
									|| $("#upjiliang").val() == null
									|| $("#upjiliang").val() == '') {
								layer.msg("填完所有类容在保存！");
							} else {
								if ($('#uph_jieshu').datebox('getValue') > $(
										'#uph_kaishi').datebox('getValue')) {
									$("#upstartid").val(
											$('#uph_kaishi')
													.datebox('getValue'));
									$("#upendid").val(
											$('#uph_jieshu')
													.datebox('getValue'));

									var dd = /^[\u4E00-\u9FA5A-Za-z0-9]{2,20}$/;
									var num = /^[A-Za-z0-9]{1,20}$/;
									if (!dd.test($("#upyaoname").val())
											|| !dd.test($("#upzuoyong").val())
											|| !num.test($("#upjiliang").val())) {
										layer.msg("输入的内容不规范");
									} else {
										$
												.ajax({
													url : "${APP_PATH}/takedrug/updatetakedrug/"
															+ $(this).attr(
																	"upid"),
													type : "POST",
													data : $("#upformid")
															.serialize(),
													success : function(result) {
														if (result.code == 100) {
															$("#updateformid")
																	.modal(
																			'hide');
															to_page(
																	current_pageNum,
																	time1,
																	time2);
															layer.msg("更新成功");
														}
													}
												});

									}
								} else {
									layer.msg("结束时间应该在开始时间之后");
								}

							}

						});
	</script>
</body>
</html>
