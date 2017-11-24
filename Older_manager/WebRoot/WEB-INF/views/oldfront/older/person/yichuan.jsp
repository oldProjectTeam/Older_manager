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
							遗传病史
							<button type="button" class="btn back fr" onClick="javascript:history.go(-1);">返回</button>
						</div>
						<form class="form-inline" role="form">
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
							<input id="search_btn" type="button" 
							class="btn btn-success col-md-2" value="查询" />
						</form>

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
												<form class="form-horizontal " role="form" id="add_modal_form">
													<div class="form-group">
														<label for="" class="col-md-4 control-label">
														<span style="color:red;">*</span>遗传病名：</label>
														<div class="col-md-8" style="padding:0;">
															<input type="text" class="form-control" id="diseasename"
																name="diseasename">
															<span style="color:red;"></span>
															<input type="hidden" name="oldmanId" value="${older.oldmanId}"/>
														</div>
													</div>
													<div class="form-group">
														<label for="" class="col-md-4 control-label">确诊地点：</label>
														<div class="col-md-8" style="padding:0;">
															<input type="text" class="form-control" id="place"
																name="place">
															<span style="color:red;"></span>
														</div>
													</div>
													<div class="form-group">
														<label for="" class="col-md-4 control-label">
														<span style="color:red;">*</span>确诊时间：</label>
														<div class="col-md-5" style="padding:0;">
															<input class="easyui-datebox datebox-f combo-f textbox-f"
																editable="false" id="infectiontime" name="infectiontime"
																style="width:180px; height: 30px; display: none;">
														</div>
														<div class="col-md-3">
															<span style="color:red;" id="add_time_msg"></span>
														</div>
													</div>
													<div class="form-group">
														<label for="" class="col-md-4 control-label">备注：</label>
														<div class="col-md-8" style="padding:0;">
															<input type="text" class="form-control" id="remark"
																name="remark">
															<span style="color:red;"></span>
														</div>
													</div>
												</form>
											</div>
										</div>
									</div>
									<div class="modal-footer">
										<button type="button" class="btn btn-primary" id="add_save_btn">保存</button>
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
									<th class="col-md-3">遗传病名</th>
									<th class="col-md-3">确诊时间</th>
									<th class="col-md-3">确诊地点</th>
									<th class="col-md-3">操作</th>
								</tr>
							</thead>
							<tbody id="genetichistory_tbody">
								 
							</tbody>
						</table>
						<!--分页信息开始  -->
			          <div class="row">
			          	<div class="col-md-10 col-md-offset-1" id="page_info">	          	           
			          	</div>
			          </div>
			          <div class="row">
			          	<div class="col-md-10 col-md-offset-1">
		          	      <nav aria-label="Page navigation" style="float:right">
		          	        <ul class="pagination pagination-sm" id="nav_ul_info">
		          	        	
		          	        </ul>
		          	      </nav>
			          	</div>
			          </div>
			          <!--分页信息结束  -->
						<!-- 列表结束 -->
					</div>
					<!-- 健康数据结束 -->


					<!-- 右侧内容区结束 -->
				</div>
				<!-- 右侧内容区结束 -->
			</div>
		</div>
	</div>
<!-- 编辑弹出框开始 -->
<div id="edit_modal" class="modal fade bs-example-modal-lg"
	tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel"
	aria-hidden="true" style="display: none;">
	<div class="modal-dialog modal-lg">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">
					<span aria-hidden="true">×</span> <span class="sr-only">Close</span>
				</button>
				<h4 class="modal-title">编辑遗传数据</h4>
			</div>
			<div class="modal-body">
				<div class="row">
					<div class="col-md-6 col-md-offset-2">
						<form class="form-horizontal " role="form" id="edit_modal_form">
							<div class="form-group">
								<label for="" class="col-md-4 control-label">
								<span style="color:red;">*</span>遗传病名：</label>
								<div class="col-md-8" style="padding:0;">
									<input type="text" class="form-control" id="diseasename1"
										name="diseasename">
									<span style="color:red;"></span>
									<input type="hidden" name="id" id="genetichistoryId"/>
								</div>
							</div>
							<div class="form-group">
								<label for="" class="col-md-4 control-label">确诊地点：</label>
								<div class="col-md-8" style="padding:0;">
									<input type="text" class="form-control" id="place1"
										name="place">
									<span style="color:red;"></span>
								</div>
							</div>
							<div class="form-group">
								<label for="" class="col-md-4 control-label">
								<span style="color:red;">*</span>确诊时间：</label>
								<div class="col-md-5" style="padding:0;">
									<input class="easyui-datebox datebox-f combo-f textbox-f"
										editable="false" id="infectiontime1" name="infectiontime"
										style="width:180px; height: 30px;">
								</div>
								<div class="col-md-3">
									<span style="color:red;" id="edit_time_msg"></span>
								</div>
							</div>
							<div class="form-group">
								<label for="" class="col-md-4 control-label">备注：</label>
								<div class="col-md-8" style="padding:0;">
									<input type="text" class="form-control" id="remark1"
										name="remark">
									<span style="color:red;"></span>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-primary" id="edit_save_btn">保存</button>
				<button type="button" class="btn btn-default"
					data-dismiss="modal">关闭</button>

			</div>
		</div>
	</div>
</div>
<!-- 弹出框结束 -->
<!--底部开始  -->
<jsp:include page="footer.jsp"></jsp:include>
<!-- 底部结束 -->
<script src="${APP_PATH}/static/oldfront/older/js/bootstrap.js"></script>
<script src="${APP_PATH}/static/oldfront/older/js/bootstrap.min.js"></script>
<script src="${APP_PATH}/static/oldfront/older/js/TableJS.js"
	type="text/javascript"></script>
<script src="${APP_PATH}/static/oldfront/older/js/md5.js"></script>
<script type="text/javascript">
//默认加载数据
 $(function(){
	 to_page(1);
 });

$("#add_save_btn").click(function(){
	
	var diseasename=$("#diseasename").val();
	var regex = /^([\u4e00-\u9fa5]|[a-zA-Z0-9]){1,50}$/;
	if(diseasename==''){
		$("#diseasename").next("span").html("请输入疾病名称!");
		return false;
	}else if(!regex.test(diseasename)){
		$("#diseasename").next("span").html("疾病名称可以是1-100的中文、数字、英文组合");
		return false;
	}else{
		$("#diseasename").next("span").html("");
	}
	var place=$("#place").val();
	if(place.length>50){
		$("#place").next("span").html("确诊地点长度不可超过50");
		return false;
	}else{
		$("#place").next("span").html("");
	}
	var infectiontime=$("#infectiontime").datebox('getValue');
	if(infectiontime==''){
		$("#add_time_msg").html("请选择确诊时间!");
		return false;
	}else if(infectiontime>getSysDate()){
		$("#add_time_msg").html("确诊时间不能是未来时间!");
		return false;
	}else{
		$("#add_time_msg").html("");
	}
	 
	var remark=$("#remark").val();
	if(remark.length>200){
		$("#remark").next("span").html("备注长度不可超过200");
		return false;
	}else{
		$("#remark").next("span").html("");
	}
	layer.msg('正在保存', {
		icon : 16,
		shade : 0.01,
		time :200000,
		offset : [ '40%' ],
	});
	 $.ajax({
		 url:"${APP_PATH}/genetichistory/insertGenetichistory",
		 data:$("#add_modal_form").serialize(),
		 type:"POST",
		 success:function(result){
			 layer.closeAll();
			 if(result.code==100){
				 to_page(current_pages+1);
				 layer.msg("添加成功!",{
					 icon:6,
					 time:1000,
					 offset:['35%']
				 });
				 $("#jkda").modal('hide');
				 $("#add_modal_form")[0].reset();
			 }else{
				 layer.msg("添加失败!",{
					 icon:5,
					 time:1000,
					 offset:['35%']
				 });
			 }
		 }
	 });
	
});
var current_pageNum="";
var current_pages="";
//构建表格信息
function build_table(result){
	current_pageNum=result.extend.pageInfo.pageNum;
	current_pages=result.extend.pageInfo.pages;
	$("#genetichistory_tbody").empty();
	$.each(result.extend.pageInfo.list,function(index,item){
		var td1=$("<td></td>").append(item.diseasename);
		var td2=$("<td></td>").append(ChangeDateFormat(item.infectiontime));
		var td3=$("<td></td>").append(item.place);
		var td5=$("<td></td>");
		var div1=$("<div class='jjda-btn'></div>");
		var i1=$("<i class='jjda-btn-editer'></i>");
		div1.append(i1).append("编辑");
		div1.click(function(){
			getGenetichistory(item.id);
		});
		
		var div2=$("<div class='jjda-btn'></div>");
		var i2=$("<i class='jjda-btn-del'></i>");
		div2.append(i2).append("删除");
		td5.append(div1).append(div2);
		div2.click(function(){
			del(item.id);
		});
		var tr=$("<tr></tr>");
		tr.append(td1).append(td2).append(td3).append(td5).appendTo("#genetichistory_tbody");
	});
}

//构建分页信息
function buil_table_pageInfo(result){
	$("#nav_ul_info").empty();
	$("#page_info").empty();
	//左边分页信息
	var pageInfo=result.extend.pageInfo;
	$("#page_info").append(" 当前第 "+pageInfo.pageNum+" 页，共 "+pageInfo.pages+"页，共计 "+pageInfo.total+" 条数据")
	
	//右边分页导航
	var firstPage=$("<li></li>").append($("<a></a>").append("首页"));
	var prePage=$("<li></li>").append($("<a></a>").append("&laquo;"));
	var nextPage=$("<li></li>").append($("<a></a>").append("&raquo;"));
	var lastPage=$("<li></li>").append($("<a></a>").append("末页"));
	if(result.extend.pageInfo.hasPreviousPage==false){
		firstPage.addClass("disabled");
		prePage.addClass("disabled");
	}else{
		firstPage.click(function(){
			to_page(1);
		});
		prePage.click(function(){
			to_page(result.extend.pageInfo.pageNum-1);
		});
	}
	if(result.extend.pageInfo.hasNextPage==false){
		nextPage.addClass("disabled");
		lastPage.addClass("disabled");
	}else{
		nextPage.click(function(){
			to_page(result.extend.pageInfo.pageNum+1);
		});
		lastPage.click(function(){
			to_page(result.extend.pageInfo.pages);
		});
	}
	$("#nav_ul_info").append(firstPage).append(prePage);
	$.each(result.extend.pageInfo.navigatepageNums,function(index,item){
		var numLi=$("<li></li>").append($("<a></a>").append(item));
		if(result.extend.pageInfo.pageNum==item){
			numLi.addClass("active");	
		}
		numLi.click(function(){
			to_page(item);
		});
		$("#nav_ul_info").append(numLi);
	});
	$("#nav_ul_info").append(nextPage).append(lastPage);
	
}

//去哪页加载数据
function to_page(pn){
	layer.msg('加载中', {
		icon : 16,
		shade : 0.01,
		time :1000000,
		offset : [ '40%' ],
	});
	$.ajax({
		url:"${APP_PATH}/genetichistory/findAll",
		data:{
			pn:pn,
			oldmanId:'${older.oldmanId}',
			infectiontime1:$('#h_Time1').datebox('getValue'),
			infectiontime2:$('#h_Time2').datebox('getValue')
		},
		type:"post",
		success:function(result){
			layer.closeAll();
			//console.log(result);
			//1.构建表格数据
			build_table(result);
			//2.构建页信息
			buil_table_pageInfo(result);
		}
	});
}
	//删除
	 function del(id) {
	     $.messager.confirm('删除记录信息', '您确定要删除该记录吗?', function (r) {
	         if (r) {
	        	 layer.msg("正在删除",{
	     			icon:16,
	     			shade:0.01,
	     			time:200000,
	     			offset:['40%']
	     		});
	             $.ajax({
	                 type:'POST',
	                 url:'${APP_PATH}/genetichistory/deleteGenetichistory/'+id,	                       
	                 success: function (result) { 
	                	 layer.closeAll();
	                     if (result.code==100) {
	                         $.messager.alert('系统消息', '删除成功!!');
							 to_page(current_pageNum);
	                     }
	                     else{
	                         $.messager.alert('系统消息',"删除失败了");
	                     }
	                 }
	             });
	         }
	     });
	}
	
	//获得疾病信息
	function getGenetichistory(id){
		$("#edit_modal").modal();
		layer.msg("加载中",{
			icon:16,
			shade:0.01,
			time:200000,
			offset:['40%']
		});
		$.ajax({
			url:"${APP_PATH}/genetichistory/findGenetichistory/"+id,
			type:"POST",
			success:function(result){
				 
				layer.closeAll();
				if(result.code==100){
					var item=result.extend.genetichistory;
					$("#diseasename1").val(item.diseasename);
					$("#place1").val(item.place);
					$("#infectiontime1").datebox('setValue',ChangeDateFormat1(item.infectiontime));
					$("#remark1").val(item.remark);
					$("#genetichistoryId").val(item.id);
				}else{
					layer.msg("获取数据失败了",{
						icon:5,
						time:1000,
						offset:['40%']
					});
				}
			}
		});
	}
 	
	//编辑保存按钮，点击保存，更新相应数据
	$("#edit_save_btn").click(function(){
		var diseasename=$("#diseasename1").val();
		var regex = /^([\u4e00-\u9fa5]|[a-zA-Z0-9]){1,100}$/;
		if(diseasename==''){
			$("#diseasename1").next("span").html("请输入疾病名称!");
			return false;
		}else if(!regex.test(diseasename)){
			$("#diseasename1").next("span").html("疾病名称可以是1-100的中文、数字、英文组合");
			return false;
		}else{
			$("#diseasename1").next("span").html("");
		}
		var place=$("#place1").val();
		if(place.length>50){
			$("#place1").next("span").html("确诊地点长度不可超过50");
			return false;
		}else{
			$("#place1").next("span").html("");
		}
		var infectiontime=$("#infectiontime1").datebox('getValue');
		if(infectiontime==''){
			$("#edit_time_msg").html("请选择确诊时间!");
			return false;
		}else if(infectiontime>getSysDate()){
			$("#edit_time_msg").html("确诊时间不能是未来时间!");
			return false;
		}else{
			$("#edit_time_msg").html("");
		}
		
		var remark=$("#remark1").val();
		if(remark.length>200){
			$("#remark1").next("span").html("备注长度不可超过200");
			return false;
		}else{
			$("#remark1").next("span").html("");
		}
		layer.msg('修改中', {
			icon : 16,
			shade : 0.01,
			time :100000,
			offset : [ '40%' ],
		});
		 $.ajax({
			 url:"${APP_PATH}/genetichistory/updateGenetichistory",
			 data:$("#edit_modal_form").serialize(),
			 type:"POST",
			 success:function(result){
				 layer.closeAll();
				 if(result.code==100){
					 to_page(current_pageNum);
					 layer.msg("修改成功!",{
						 icon:6,
						 time:1000,
						 offset:['35%']
					 });
					 $("#edit_modal").modal('hide');
					 $("#edit_modal_form")[0].reset();
				 }else{
					 layer.msg("修改失败了!",{
						 icon:5,
						 time:1000,
						 offset:['35%']
					 });
				 }
			 }
		 });
	});
	
	
	
	//获取查询条件
	function getSearch(){
		 
		var time1=$('#h_Time1').datebox('getValue');
		var time2=$("#h_Time2").datebox('getValue');
		if(time1==''){
			layer.msg("请选择开始时间!",{
				offset:['35%']
			});
			return false;
		}
		
		if(time2==''){
			layer.msg("请选择结束时间!",{
				offset:['35%']
			});
			return false;
		}
		if(time1>time2){
			layer.msg("结束时间不能小于开始时间!",{
				offset:['35%']
			});
			return false;
		}
		return "infectiontime1="+time1+"&infectiontime2="+time2;
	}
	
	//查询按钮
	$("#search_btn").click(function(){
		var time=getSearch();
		if(time==''){
			return false;
		}
		layer.msg('正在查询', {
			icon : 16,
			shade : 0.01,
			time:200000,
			offset : [ '40%' ],
		});
		$.ajax({
			url:"${APP_PATH}/genetichistory/findAll?"+time,
			data:{
				oldmanId:'${older.oldmanId}'
			},
			type:"post",
			success:function(result){
				layer.closeAll();
				//1.构建表格数据
				build_table(result);
				//2.构建页信息
				buil_table_pageInfo(result);
			}
		});
	});
	
	//时间转换器
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
	//获取当前系统时间
	function getSysDate() {
		var myDate = new Date();
		//获取当前年
		var year=myDate.getFullYear();
		//获取当前月
		var month=myDate.getMonth()+1;
		//获取当前日
		var date=myDate.getDate(); 
		return year+"-"+month+"-"+date;
	}
</script>
</body>
</html>
