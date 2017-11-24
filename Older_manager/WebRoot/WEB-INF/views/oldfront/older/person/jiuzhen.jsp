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
							就诊记录
							<button type="button" class="btn back fr" 
							onClick="javascript:history.go(-1);">返回</button>
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
											<div class="col-md-12">
												<form id="add_modal_form">
													<table class="table table-bordered table-hover text-center">
														<tr class="active">
															<td class="col-sm-2"><font color="red">*</font>老人姓名:</td>
															<td class="col-sm-2">
															 	${older.oldman.name}
															 	<input type="hidden" name="oldmanId" value="${older.oldmanId}"/>
															 </td>
															<td class="col-sm-2"><font color="red">*</font>就诊医院:</td>
															<td class="col-sm-2">
															  <input type="text"
															     class="form-control" name="hospital" id="hospital"></td>
															     
															<td class="col-sm-2"><font color="red">*</font>就诊科室:</td>
															<td class="col-sm-2">
															   <input type="text"
																class="form-control" name="department" id="department"></td>
														</tr>
														<tr>
															<td><font color="red">*</font>医生姓名:</td>
															<td class="col-sm-2">
															    <input type="text"
																class="form-control" id="doctor" name="doctor"></td>
															<td><font color="red">*</font>就诊时间:</td>
															<td class="col-sm-2">
															    <input
																class="easyui-datebox datebox-f combo-f textbox-f"
																editable="false" id="clinicaltime" name="clinicaltime"
																style="width:150px; height: 30px;"></td>
															<td>复诊时间:</td>
															<td class="col-sm-2">
															    <input
																class="easyui-datebox datebox-f combo-f textbox-f"
																editable="false" id="appointmenttime" name="appointmenttime"
																style="width: 150px; height: 30px;"></td>
														</tr>
														<tr class="active">
															<td class="">主诉内容:</td>
															<td colspan="2">
														        <textarea class="form-control"
																rows="2" name="medicalrecord1" id="medicalrecord1"></textarea></td>
															<td>体格检查内容:</td>
															<td colspan="2">
															    <textarea class="form-control"
																	rows="2" name="chekcontent" id="chekcontent"></textarea></td>
														</tr>
														<tr>
															<td>辅助检查内容:</td>
															<td colspan="2">
															    <textarea class="form-control"
																	rows="2" name="ancillarycheckcontent" id="ancillarycheckcontent">
																</textarea>
															</td>
															<td>实际检查内容:</td>
															<td colspan="2">
															    <textarea class="form-control"
																	rows="2" name="realcheckcontent" id="realcheckcontent">
																</textarea>
															</td>
														</tr>
														<tr class="active">
															<td>正常使用药物:</td>
															<td colspan="2"><textarea class="form-control"
																	rows="2" name="normalusedrug" id="normalusedrug"></textarea></td>
															<td>本次诊断结果:</td>
															<td colspan="2"><textarea class="form-control"
																	rows="2" name="diagnosis" id="diagnosis"></textarea></td>
														</tr>
														<tr>
															<td width="180">治疗处方和保健处方:</td>
															<td colspan="2">
																<textarea class="form-control"
																	rows="2" name="treatmentcareprescription"
																	id="treatmentcareprescription">
																</textarea>
															</td>
															<td>相关禁忌事项:</td>
															<td colspan="2">
															 	<textarea class="form-control"
																	rows="2" name="tabooltems" id="tabooltems">
																</textarea>
															</td>
														</tr>
													</table>
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
									<th class="col-md-2">就诊时间</th>
									<th class="col-md-3">就诊医院</th>
									<th class="col-md-2">就诊科室</th>
									<th class="col-md-2">医生名称</th>
									<th class="col-md-3">操作</th>
								</tr>
							</thead>
							<tbody id="medicalrecord_tbody">
								 
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
				<h4 class="modal-title">编辑就诊数据</h4>
			</div>
			<div class="modal-body">

				<div class="row">
					<div class="col-md-12">
						<form id="edit_modal_form">
							<table class="table table-bordered table-hover text-center">
								<tr class="active">
									<td class="col-sm-2"><font color="red">*</font>老人姓名:</td>
									<td class="col-sm-2">
									 	${older.oldman.name}
									 	<input type="hidden" name="id" id="medicalrecordId"/>
									 </td>
									<td class="col-sm-2"><font color="red">*</font>就诊医院:</td>
									<td class="col-sm-2">
									  <input type="text"
									     class="form-control" name="hospital" id="hospital1"></td>
									     
									<td class="col-sm-2"><font color="red">*</font>就诊科室:</td>
									<td class="col-sm-2">
									   <input type="text"
										class="form-control" name="department" id="department1"></td>
								</tr>
								<tr>
									<td><font color="red">*</font>医生姓名:</td>
									<td class="col-sm-2">
									    <input type="text"
										class="form-control" id="doctor1" name="doctor"></td>
									<td><font color="red">*</font>就诊时间:</td>
									<td class="col-sm-2">
									    <input
										class="easyui-datebox datebox-f combo-f textbox-f"
										editable="false" id="clinicaltime1" name="clinicaltime"
										style="width:150px; height: 30px;"></td>
									<td>复诊时间:</td>
									<td class="col-sm-2">
									    <input
										class="easyui-datebox datebox-f combo-f textbox-f"
										editable="false" id="appointmenttime1" name="appointmenttime"
										style="width: 150px; height: 30px;"></td>
								</tr>
								<tr class="active">
									<td class="">主诉内容:</td>
									<td colspan="2">
								        <textarea class="form-control"
										rows="2" name="medicalrecord1" id="medicalrecord11"></textarea></td>
									<td>体格检查内容:</td>
									<td colspan="2">
									    <textarea class="form-control"
											rows="2" name="chekcontent" id="chekcontent1"></textarea></td>
								</tr>
								<tr>
									<td>辅助检查内容:</td>
									<td colspan="2">
									    <textarea class="form-control"
											rows="2" name="ancillarycheckcontent" id="ancillarycheckcontent1">
										</textarea>
									</td>
									<td>实际检查内容:</td>
									<td colspan="2">
									    <textarea class="form-control"
											rows="2" name="realcheckcontent" id="realcheckcontent1">
										</textarea>
									</td>
								</tr>
								<tr class="active">
									<td>正常使用药物:</td>
									<td colspan="2"><textarea class="form-control"
											rows="2" name="normalusedrug" id="normalusedrug1"></textarea></td>
									<td>本次诊断结果:</td>
									<td colspan="2"><textarea class="form-control"
											rows="2" name="diagnosis" id="diagnosis1"></textarea></td>
								</tr>
								<tr>
									<td width="180">治疗处方和保健处方:</td>
									<td colspan="2">
										<textarea class="form-control"
											rows="2" name="treatmentcareprescription"
											id="treatmentcareprescription1">
										</textarea>
									</td>
									<td>相关禁忌事项:</td>
									<td colspan="2">
									 	<textarea class="form-control"
											rows="2" name="tabooltems" id="tabooltems1">
										</textarea>
									</td>
								</tr>
							</table>
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

//校验结果的提示信息
function show_vaildate_msg(ele,status,msg){
	$(ele).parent().removeClass("has-success has-error");
	if("success"==status){
		$(ele).parent().addClass("has-success");
	}else if("error"==status){
		$(ele).parent().addClass("has-error");
		 layer.msg(msg,{
			 icon:5,
			 time:1000,
			 offset:['40%']
		 });
	}
}
//新增数据局保存按钮
$("#add_save_btn").click(function(){
	
	var hospital=$("#hospital").val();
	var regex = /^([\u4e00-\u9fa5]|[a-zA-Z0-9]){1,100}$/;
	if(hospital==''){
		show_vaildate_msg("#hospital","error","请输入就诊医院!");
		return false;
	}else if(!regex.test(hospital)){
		show_vaildate_msg("#hospital","error","就诊医院可以是1-100的中文、数字、英文组合!");
		return false;
	}else{
		show_vaildate_msg("#hospital","success","");
	}
	var department=$("#department").val();
	var regex1 = /^([\u4e00-\u9fa5]|[a-zA-Z0-9]){1,100}$/;
	if(department==''){
		show_vaildate_msg("#department","error","请输入就诊科室!");
		return false;
	}else if(!regex1.test(department)){
		show_vaildate_msg("#department","error","就诊科室可以是1-100的中文、数字、英文组合!");
		return false;
	}else{
		show_vaildate_msg("#department","success","");
	}
	
	var doctor=$("#doctor").val();
	var regex2= /^([\u4e00-\u9fa5]|[a-zA-Z]){1,30}$/;
	if(doctor==''){
		show_vaildate_msg("#doctor","error","请输入医生姓名!");
		return false;
	}else if(!regex2.test(doctor)){
		show_vaildate_msg("#doctor","error","医生姓名可以是1-30的中文、英文组合!");
		return false;
	}else{
		show_vaildate_msg("#doctor","success","");
	}
	 
	var clinicaltime=$("#clinicaltime").datebox('getValue');
	if(clinicaltime==''){
		show_vaildate_msg("#clinicaltime","error","请选择就诊时间!!");
		return false;
	}else if(clinicaltime>getSysDate()){
		show_vaildate_msg("#clinicaltime","error","就诊时间不能是未来时间!");
		return false;
	}else{
		show_vaildate_msg("#clinicaltime","success","");
	}
	
	//主诉内容
	var medicalrecord1=$("#medicalrecord1").val();
	if(medicalrecord1.length>200){
		show_vaildate_msg("#medicalrecord1","error","主诉内容长度不能超过200!");
		return false;
	}else{
		show_vaildate_msg("#medicalrecord1","success","");
	}
	
	//体格检查内容
	var chekcontent=$("#chekcontent").val();
	if(chekcontent.length>200){
		show_vaildate_msg("#chekcontent","error","体格检查内容长度不能超过200!");
		return false;
	}else{
		show_vaildate_msg("#chekcontent","success","");
	}
	
	//辅助检查内容
	var ancillarycheckcontent=$("#ancillarycheckcontent").val();
	if(ancillarycheckcontent.length>200){
		show_vaildate_msg("#ancillarycheckcontent","error","辅助检查内容长度不能超过200!");
		return false;
	}else{
		show_vaildate_msg("#ancillarycheckcontent","success","");
	}
	
	//实际检查内容
	var realcheckcontent=$("#realcheckcontent").val();
	if(realcheckcontent.length>200){
		show_vaildate_msg("#realcheckcontent","error","实际检查内容长度不能超过200!");
		return false;
	}else{
		show_vaildate_msg("#realcheckcontent","success","");
	}
	
	//正常使用药物
	var normalusedrug=$("#normalusedrug").val();
	if(normalusedrug.length>200){
		show_vaildate_msg("#normalusedrug","error","正常使用药物长度不能超过200!");
		return false;
	}else{
		show_vaildate_msg("#normalusedrug","success","");
	}
	
	//本次诊断结果
	var diagnosis=$("#diagnosis").val();
	if(diagnosis.length>200){
		show_vaildate_msg("#diagnosis","error","本次诊断结果长度不能超过200!");
		return false;
	}else{
		show_vaildate_msg("#diagnosis","success","");
	}
	
	//治疗处方和保健处方
	var treatmentcareprescription=$("#treatmentcareprescription").val();
	if(treatmentcareprescription.length>200){
		show_vaildate_msg("#treatmentcareprescription","error","治疗处方和保健处方长度不能超过200!");
		return false;
	}else{
		show_vaildate_msg("#treatmentcareprescription","success","");
	}
	
	//相关禁忌事项
	var tabooltems=$("#tabooltems").val();
	if(tabooltems.length>200){
		show_vaildate_msg("#tabooltems","error","相关禁忌事项长度不能超过200!");
		return false;
	}else{
		show_vaildate_msg("#tabooltems","success","");
	}
	layer.msg('正在保存', {
		icon : 16,
		shade : 0.01,
		time :200000,
		offset : [ '40%' ],
	});
	 $.ajax({
		 url:"${APP_PATH}/medicalrecord/insertMedicalrecord",
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
	$("#medicalrecord_tbody").empty();
	$.each(result.extend.pageInfo.list,function(index,item){
		var td2=$("<td></td>").append(item.hospital);
		var td1=$("<td></td>").append(ChangeDateFormat(item.clinicaltime));
		var td3=$("<td></td>").append(item.department);
		var td4=$("<td></td>").append(item.doctor);
		var td5=$("<td></td>");
		var div1=$("<div class='jjda-btn'></div>");
		var i1=$("<i class='jjda-btn-editer'></i>");
		div1.append(i1).append("编辑");
		div1.click(function(){
			getMedicalrecord(item.id);
		});
		
		var div2=$("<div class='jjda-btn'></div>");
		var i2=$("<i class='jjda-btn-del'></i>");
		div2.append(i2).append("删除");
		td5.append(div1).append(div2);
		div2.click(function(){
			del(item.id);
		});
		var tr=$("<tr></tr>");
		tr.append(td1).append(td2).append(td3).append(td4).append(td5).appendTo("#medicalrecord_tbody");
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
		time :100000,
		offset : [ '40%' ],
	});
	$.ajax({
		url:"${APP_PATH}/medicalrecord/findAll",
		data:{
			pn:pn,
			oldmanId:'${older.oldmanId}',
			clinicaltime1:$('#h_Time1').datebox('getValue'),
			clinicaltime2:$('#h_Time2').datebox('getValue')
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
	                 url:'${APP_PATH}/medicalrecord/deleteMedicalrecord/'+id,	                       
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
	function getMedicalrecord(id){
		$("#edit_modal").modal();
		layer.msg("加载中",{
			icon:16,
			shade:0.01,
			time:200000,
			offset:['40%']
		});
		$.ajax({
			url:"${APP_PATH}/medicalrecord/findMedicalrecord/"+id,
			type:"POST",
			success:function(result){
				 
				layer.closeAll();
				if(result.code==100){
					var item=result.extend.medicalrecord;
					$("#hospital1").val(item.hospital);
					$("#department1").val(item.department);
					$("#doctor1").val(item.doctor);
					$("#clinicaltime1").datebox('setValue',ChangeDateFormat1(item.clinicaltime));
					$("#appointmenttime1").datebox('setValue',ChangeDateFormat1(item.appointmenttime));
					
					$("#medicalrecord11").val(item.medicalrecord1);
					$("#chekcontent1").val(item.chekcontent);
					$("#ancillarycheckcontent1").val(item.ancillarycheckcontent);
					$("#realcheckcontent1").val(item.realcheckcontent);
					$("#normalusedrug1").val(item.normalusedrug);
					$("#diagnosis1").val(item.diagnosis);
					$("#treatmentcareprescription1").val(item.treatmentcareprescription);
					$("#tabooltems1").val(item.tabooltems);
					$("#medicalrecordId").val(item.id);
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
		
		var hospital=$("#hospital1").val();
		var regex = /^([\u4e00-\u9fa5]|[a-zA-Z0-9]){1,100}$/;
		if(hospital==''){
			show_vaildate_msg("#hospital1","error","请输入就诊医院!");
			return false;
		}else if(!regex.test(hospital)){
			show_vaildate_msg("#hospital1","error","就诊医院可以是1-100的中文、数字、英文组合!");
			return false;
		}else{
			show_vaildate_msg("#hospital1","success","");
		}
		var department=$("#department1").val();
		var regex1 = /^([\u4e00-\u9fa5]|[a-zA-Z0-9]){1,100}$/;
		if(department==''){
			show_vaildate_msg("#department1","error","请输入就诊科室!");
			return false;
		}else if(!regex1.test(department)){
			show_vaildate_msg("#department1","error","就诊科室可以是1-100的中文、数字、英文组合!");
			return false;
		}else{
			show_vaildate_msg("#department1","success","");
		}
		
		var doctor=$("#doctor1").val();
		var regex2= /^([\u4e00-\u9fa5]|[a-zA-Z]){1,30}$/;
		if(doctor==''){
			show_vaildate_msg("#doctor1","error","请输入医生姓名!");
			return false;
		}else if(!regex2.test(doctor)){
			show_vaildate_msg("#doctor1","error","医生姓名可以是1-30的中文、英文组合!");
			return false;
		}else{
			show_vaildate_msg("#doctor1","success","");
		}
		 
		var clinicaltime=$("#clinicaltime1").datebox('getValue');
		if(clinicaltime==''){
			show_vaildate_msg("#clinicaltime1","error","请选择就诊时间!!");
			return false;
		}else if(clinicaltime>getSysDate()){
			show_vaildate_msg("#clinicaltime1","error","就诊时间不能是未来时间!");
			return false;
		}else{
			show_vaildate_msg("#clinicaltime1","success","");
		}
		
		//主诉内容
		var medicalrecord1=$("#medicalrecord11").val();
		if(medicalrecord1.length>200){
			show_vaildate_msg("#medicalrecord11","error","主诉内容长度不能超过200!");
			return false;
		}else{
			show_vaildate_msg("#medicalrecord11","success","");
		}
		
		//体格检查内容
		var chekcontent=$("#chekcontent1").val();
		if(chekcontent.length>200){
			show_vaildate_msg("#chekcontent1","error","体格检查内容长度不能超过200!");
			return false;
		}else{
			show_vaildate_msg("#chekcontent1","success","");
		}
		
		//辅助检查内容
		var ancillarycheckcontent=$("#ancillarycheckcontent1").val();
		if(ancillarycheckcontent.length>200){
			show_vaildate_msg("#ancillarycheckcontent1","error","辅助检查内容长度不能超过200!");
			return false;
		}else{
			show_vaildate_msg("#ancillarycheckcontent1","success","");
		}
		
		//实际检查内容
		var realcheckcontent=$("#realcheckcontent1").val();
		if(realcheckcontent.length>200){
			show_vaildate_msg("#realcheckcontent1","error","实际检查内容长度不能超过200!");
			return false;
		}else{
			show_vaildate_msg("#realcheckcontent1","success","");
		}
		
		//正常使用药物
		var normalusedrug=$("#normalusedrug1").val();
		if(normalusedrug.length>200){
			show_vaildate_msg("#normalusedrug1","error","正常使用药物长度不能超过200!");
			return false;
		}else{
			show_vaildate_msg("#normalusedrug1","success","");
		}
		
		//本次诊断结果
		var diagnosis=$("#diagnosis1").val();
		if(diagnosis.length>200){
			show_vaildate_msg("#diagnosis1","error","本次诊断结果长度不能超过200!");
			return false;
		}else{
			show_vaildate_msg("#diagnosis1","success","");
		}
		
		//治疗处方和保健处方
		var treatmentcareprescription=$("#treatmentcareprescription1").val();
		if(treatmentcareprescription.length>200){
			show_vaildate_msg("#treatmentcareprescription1","error","治疗处方和保健处方长度不能超过200!");
			return false;
		}else{
			show_vaildate_msg("#treatmentcareprescription1","success","");
		}
		
		//相关禁忌事项
		var tabooltems=$("#tabooltems1").val();
		if(tabooltems.length>200){
			show_vaildate_msg("#tabooltems1","error","相关禁忌事项长度不能超过200!");
			return false;
		}else{
			show_vaildate_msg("#tabooltems1","success","");
		}
		layer.msg('修改中', {
			icon : 16,
			shade : 0.01,
			time :100000,
			offset : [ '40%' ],
		});
		 $.ajax({
			 url:"${APP_PATH}/medicalrecord/updateMedicalrecord",
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
		return "clinicaltime1="+time1+"&clinicaltime2="+time2;
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
			url:"${APP_PATH}/medicalrecord/findAll?"+time,
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
