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
<script type="text/javascript" src="${APP_PATH}/static/js/jquery-3.2.1.min.js"></script>
<!-- 引入样式 -->

<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
 <script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
  </head>

<body style="margin: 15px;">
	<!-- 头部 -->
	<div class="col-md-12">
		<div>
			<div class="row">

				<ol class="breadcrumb">
					<li><b>位置：健康管理</b>>就诊记录
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
				<button type="button" class="btn btn-danger" id="old_delete_all_btn" >
					<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
					批量删除
				</button>
			</div>
		</div>

		<!--条件查询  -->

		<div class="row form-inline" align="left" style="margin-top:10px;">
			<div class="col-md-12">
				老人姓名： <input type="text" class="form-control" id="oldmanname"
					placeholder="请输入老人姓名"> 就诊医院： <input type="text"
					class="form-control" id="hospital1" placeholder="请输入医院名称"> 医生姓名： <input
					type="text" class="form-control" id="doctor1" placeholder="请输入医生姓名">


				<button class="btn btn-default" id="selectwith">
					<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
					查询
				</button>
			</div>
		</div>


		<!--就诊记录列表  -->
     <div class="row" style="margin-top:10px">
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
    <div class="row" >
      <div class="col-md-7" id="page_text">
      
      </div>
	  <div class="col-md-4 col-md-offset-1" id="page_nav">

	  </div>
    </div>
  </div> 
		
		
<!-- 新增模态框 -->
<div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" id="add_modal">
  <div class="modal-dialog modal-lg" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">新增就诊记录</h4>
           </div>
           
           <div class="modal-body">
      
     
           
           <div class="row">
			<div class="col-md-12">
			   <form id="formid">
				<table class="table table-bordered table-hover text-center">
					<tr class="active">
						<td>老人姓名：</td>
						<td><select class="form-control" id="oldman_name" name="oldmanId" >
						</select></td>
						<td>就诊医院：</td>
						<td><input type="text" class="form-control" name="hospital"></td>
						<td>就诊科室：</td>
						<td><input type="text" class="form-control" name="department"></td>
					</tr>
					<tr>
						<td>医生姓名：</td>
						<td><input type="text" class="form-control" name="doctor"></td>
						<td>就诊时间：</td>
						<td><INPUT type="date" class="form-control" name="clinicaltime"></td>
						<td>复诊时间：</td>
						<td><INPUT type="date" class="form-control" name="appointmenttime"></td>
					</tr>
					<tr class="active">
						<td class="">主诉内容：</td>
						<td colspan="2"><textarea class="form-control" rows="2" name="medicalrecord1"></textarea>
						</td>
						<td>体格检查内容：</td>
						<td colspan="2"><textarea class="form-control" rows="2" name="chekcontent"></textarea></td>
					</tr>
					<tr>
						<td>辅助检查内容：</td>
						<td colspan="2"><textarea class="form-control" rows="2" name="ancillarycheckcontent"></textarea></td>
						<td>实际检查内容：</td>
						<td colspan="2"><textarea class="form-control" rows="2" name="realcheckcontent"></textarea></td>
					</tr>
					<tr class="active">
						<td>正常使用药物：</td>
						<td colspan="2"><textarea class="form-control" rows="2" name="normalusedrug"></textarea></td>
						<td>本次诊断结果：</td>
						<td colspan="2"><textarea class="form-control" rows="2" name="diagnosis"></textarea></td>
					</tr>
					<tr>
						<td>治疗处方和保健处方：</td>
						<td colspan="2"><textarea class="form-control" rows="2" name="treatmentcareprescription"></textarea></td>
						<td>相关禁忌事项：</td>
						<td colspan="2"><textarea class="form-control" rows="2" name="tabooltems"></textarea></td>
					</tr>
				</table></form>
			</div>
		</div>
		</div>
		 <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-primary" id="save_healthrecord_btn">保存</button>
      </div>
    </div>
  </div>
</div>
		
		
		
	<!-- 编辑模态框 -->
<div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" id="update_modal">
  <div class="modal-dialog modal-lg" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">编辑就诊记录</h4>
           </div>
           
           <div class="modal-body">
      
     
           
           <div class="row">
			<div class="col-md-12">
			   <form id="formid">
				<table class="table table-bordered table-hover text-center">
					<tr class="active">
						<td>老人姓名：</td>
						<td><p class="form-control-static" id="select_name"></p></td>
						<td>就诊医院：</td>
						<td><input type="text" class="form-control" name="hospital" id="select_hospital" ></td>
						<td>就诊科室：</td>
						<td><input type="text" class="form-control" name="department" id="select_department" ></td>
					</tr>
					<tr>
						<td>医生姓名：</td>
						<td><input type="text" class="form-control" name="doctor" id="select_doctor" ></td>
						<td>就诊时间：</td>
						<td><INPUT type="date" class="form-control" name="clinicaltime" id="select_clinicaltime" ></td>
						<td>复诊时间：</td>
						<td><INPUT type="date" class="form-control" name="appointmenttime" id="select_appointmenttime" ></td>
					</tr>
					<tr class="active">
						<td class="">主诉内容：</td>
						<td colspan="2"><textarea class="form-control" rows="2" name="medicalrecord1" id="select_medicalrecord1" ></textarea>
						</td>
						<td>体格检查内容：</td>
						<td colspan="2"><textarea class="form-control" rows="2" name="chekcontent" id="select_chekcontent" ></textarea></td>
					</tr>
					<tr>
						<td>辅助检查内容：</td>
						<td colspan="2"><textarea class="form-control" rows="2" name="ancillarycheckcontent" id="select_ancillarycheckcontent" ></textarea></td>
						<td>实际检查内容：</td>
						<td colspan="2"><textarea class="form-control" rows="2" name="realcheckcontent" id="select_realcheckcontent" ></textarea></td>
					</tr>
					<tr class="active">
						<td>正常使用药物：</td>
						<td colspan="2"><textarea class="form-control" rows="2" name="normalusedrug" id="select_normalusedrug" ></textarea></td>
						<td>本次诊断结果：</td>
						<td colspan="2"><textarea class="form-control" rows="2" name="diagnosis" id="select_diagnosis" ></textarea></td>
					</tr>
					<tr>
						<td>治疗处方和保健处方：</td>
						<td colspan="2"><textarea class="form-control" rows="2" name="treatmentcareprescription" id="select_treatmentcareprescription" ></textarea></td>
						<td>相关禁忌事项：</td>
						<td colspan="2"><textarea class="form-control" rows="2" name="tabooltems" id="select_tabooltems" ></textarea></td>
					</tr>
				</table></form>
			</div>
		</div>
		</div>
		 <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-primary" id="update_healthrecord_btn">更新</button>
      </div>
    </div>
  </div>
</div>	
		
		
	<!-- 查看模态框模态框 -->
<div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" id="select_modal">
  <div class="modal-dialog modal-lg" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">查看就诊记录</h4>
           </div>
           
           <div class="modal-body">
      
     
           
           <div class="row">
			<div class="col-md-12">
			   <form id="formid">
				<table class="table table-bordered table-hover text-center">
					<tr class="active">
						<td>老人姓名：</td>
						<td><p class="form-control-static" id="select_name1"></p></td>
						<td>就诊医院：</td>
						<td><p class="form-control-static" id="select_hospital1"></p></td>
						<td>就诊科室：</td>
						<td><p class="form-control-static" id="select_department1"></td>
					</tr>
					<tr>
						<td>医生姓名：</td>
						<td><p class="form-control-static" id="select_doctor1"></td>
						<td>就诊时间：</td>
						<td><p class="form-control-static" id="select_clinicaltime1"></td>
						<td>复诊时间：</td>
						<td><p class="form-control-static" id="select_appointmenttime1"></td>
					</tr>
					<tr class="active">
						<td class="">主诉内容：</td>
						<td colspan="2"><p class="form-control-static" id="select_medicalrecord11">
						</td>
						<td>体格检查内容：</td>
						<td colspan="2"><p class="form-control-static" id="select_chekcontent1"></td>
					</tr>
					<tr>
						<td>辅助检查内容：</td>
						<td colspan="2"><p class="form-control-static" id="select_ancillarycheckcontent1"></td>
						<td>实际检查内容：</td>
						<td colspan="2"><p class="form-control-static" id="select_realcheckcontent1"></td>
					</tr>
					<tr class="active">
						<td>正常使用药物：</td>
						<td colspan="2"><p class="form-control-static" id="select_normalusedrug1"></td>
						<td>本次诊断结果：</td>
						<td colspan="2"><p class="form-control-static" id="select_diagnosis1"></td>
					</tr>
					<tr>
						<td>治疗处方和保健处方：</td>
						<td colspan="2"><p class="form-control-static" id="select_treatmentcareprescription1"></td>
						<td>相关禁忌事项：</td>
						<td colspan="2"><p class="form-control-static" id="select_tabooltems1"></td>
					</tr>
				</table></form>
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
	
		var totalRecord, currentNum,hospital1="",oldmanname="",doctor1="";
		/* 分页 */
		$(function() {
			go(1,"","","");
			$("#old_delete_all_btn").attr("disabled", true);
		});
		function go(pn,hospital1,oldmanname,doctor1) {
			$.ajax({
				url:"${APP_PATH}/health/selectallhealthrecord",
				data : { "pn":pn,
					"hospital1" : hospital1,
					"oldmanname" : oldmanname,
					"doctor1" : doctor1,
					
				},
				type:"GET",
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
			var firstPageLi = $("<li></li>").append(
					$("<a></a>").append("首页"));
					firstPageLi.click(function(){
					go(1,hospital1,oldmanname,doctor1);
					});
			var prePageLi = $("<li></li>").append(
					$("<a></a>").append("&laquo;"));
			if (result.extend.pageInfo.hasPreviousPage == false) {
				firstPageLi.addClass("disabled");
				prePageLi.addClass("disabled");
			} else {
				//为元素添加点击翻页事件
				prePageLi.click(function() {
					go(result.extend.pageInfo.pageNum - 1,hospital1,oldmanname,doctor1);
				});
			}
			var nextPageLi = $("<li></li>").append(
					$("<a></a>").append("&raquo;"));
			var lastPageLi = $("<li></li>").append(
					$("<a></a>").append("末页"));
					lastPageLi.click(function(){
					go(result.extend.pageInfo.pages,hospital1,oldmanname,doctor1);
					});
			if (result.extend.pageInfo.hasNextPage == false) {
				nextPageLi.addClass("disabled");
				lastPageLi.addClass("disabled");
			} else {
				//为元素添加点击翻页事件
				nextPageLi.click(function() {
					go(result.extend.pageInfo.pageNum + 1,hospital1,oldmanname,doctor1);
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
					go(item,hospital1,oldmanname,doctor1);
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
			var Td3 = $("<td></td>").append("就诊医院");
			var Td4 = $("<td></td>").append("就诊科室");
			var Td5 = $("<td></td>").append("医生姓名");
			var Td6 = $("<td></td>").append("就诊时间");
			var Td7 = $("<td></td>").append("复查时间");
			var Td8 = $("<td></td>").append("操作");
			headTR.append(checkBox).append(Td1).append(Td2).append(Td3)
			      .append(Td4).append(Td5).append(Td6).append(Td7).append(Td8).appendTo($("#head"));

			 $.each(result.extend.pageInfo.list,function(index,item){
            var checkBoxTd=$("<td><input type='checkbox' class='check_item'/></td>");
            var olderid=$("<td></td>").append(item.id);
            var oldername=$("<td></td>").append(item.oldman.name);
            var oldersex=$("<td></td>").append(item.hospital);
            var olderphone=$("<td></td>").append(item.department);
            var olderidcar=$("<td></td>").append(item.doctor);
            var olderliveinfo=$("<td></td>").append(ChangeDateFormat(item.clinicaltime));
            var olderservice=$("<td></td>").append(ChangeDateFormat(item.appointmenttime));
            var editBtn=$("<button></button>").addClass("btn btn-primary btn-sm edit_btn")
				                                  .append($("<span></span>")
				                                  .addClass("glyphicon glyphicon-pencil"))
				                                  .append("编辑");
			//为编辑按钮添加一个自定义的属性，来表示当前查看老人的id
			editBtn.attr("edit-id",item.id);
			 var serchBtn=$("<button></button>").addClass("btn btn-danger btn-sm serchBtn")
									              .append($("<span></span>")
									              .addClass("glyphicon glyphicon-search"))
									              .append("查看");
			//为查看按钮添加一个自定义的属性，来表示当前查看老人的id
			serchBtn.attr("serch-id",item.id);					                                                
            var delBtn=$("<button></button>").addClass("btn btn-danger btn-sm delete_btn")
									              .append($("<span></span>")
									              .addClass("glyphicon glyphicon-trash"))
									              .append("删除");	
			
			//为删除按钮添加一个自定义的属性，来表示当前删除员工的id
			delBtn.attr("del-id",item.id);						              
		    var btnTd=$("<td></td>").append(editBtn).append(" ").append(serchBtn).append(" ").append(delBtn);
		    //append方法执行完成以后还是返回原来的元素							              								              
			$("<tr></tr>").append(checkBoxTd)
				              .append(olderid)
				              .append(oldername)
				              .append(oldersex)
				              .append(olderphone)
				              .append(olderidcar)
				              .append(olderliveinfo)
				              .append(olderservice)
				              .append(btnTd)
				              .appendTo("#table_data");						              	                                  
         });
		}
		
		
		
			//搜索
     $("#selectwith").click(function(){
      
        go(1,$("#hospital1").val(),$("#oldmanname").val(),$("#doctor1").val());
      
        hospital1=$("#hospital1").val();
        oldmanname=$("#oldmanname").val();
        doctor1=$("#doctor1").val(); 
        
     });  
     
  //点击删除   
   	$(document).on("click", ".delete_btn", function() {
	      var delid=$(this).attr("del-id");
		  var oldername=$(this).parents("tr").find("td:eq(2)").text();		
		  if(confirm("确认删除【"+oldername+"】吗")){
	       $.ajax({
				url:"${APP_PATH}/health/deletehealthrecord/"+delid,
				type:"DELETE",
				success:function(result) {
					 go(currentNum, hospital1,oldmanname,doctor1);
				}
			});
	   }
	});	  
    
   //点击删除全部，就批量删除
	$("#old_delete_all_btn").click(function(){
		//alert();
		var empNames="";
		var del_idstr="";
		$.each($(".check_item:checked"),function(){
			//索引为2，就是第3个td.
			empNames +=$(this).parents("tr").find("td:eq(2)").text()+",";
			//alert(empNames);
		    //组装员工id字符串
			del_idstr +=$(this).parents("tr").find("td:eq(1)").text()+"-"; 
		    //alert($(this).parents("tr").find("td:eq(2)").text());
			//alert(del_idstr);
		    
		});
		
		  //去除empNames多去的逗号
		empNames=empNames.substring(0,empNames.length-1);
		//去除多余的删除员工-
		del_idstr=del_idstr.substring(0,del_idstr.length-1);
	   	 if(confirm("确认删除【"+empNames+"】吗")){
			//发送ajax请求
		  	 $.ajax({
			url:"${APP_PATH}/health/deleteallhealthrecord/"+del_idstr,
			type:"DELETE",
			success:function(result){
				//alert(result.msg);
				//回到当前页面
				go(currentNum, hospital1,oldmanname,doctor1);
				$("#old_delete_all_btn").attr("disabled", true);
				
			}
			});  
		}    
	});
	
    //全选
		$(document).on("click","#check_item_all",function(){
	  $(".check_item").prop("checked",$(this).prop("checked"));
	  
	  if($("#check_item_all").prop("checked")==true){
	      $("#old_delete_all_btn").attr("disabled", false);
	  }else{
	     $("#old_delete_all_btn").attr("disabled", true);
	  }
  });
	

	   $(document).on("click",".check_item",function(){

		var flag=$(".check_item:checked").length==$(".check_item").length;
		$("#check_item_all").prop("checked",flag);
		 if($(".check_item:checked").length>0){
	      $("#old_delete_all_btn").attr("disabled", false);
	  }else{
	     $("#old_delete_all_btn").attr("disabled", true);
	  }
	}); 
     
   //点击新增
   $("#add_btn").click(function(){
   //获取老人的名字
   $.ajax({
           url:"${APP_PATH}/old/selectallolderskiptakeactivity",
           type:"GET",
           success:function(result){
              $.each(result.extend.oldman,function(){
						var optionoldmanid=$("<option></option>").append(this.name).attr("value",this.id);
						//这个是通过id的形式
						//optionEle.appendTo("#dept_add_select");
						//这个通过模态框的形式  模态框的id
						optionoldmanid.appendTo("#oldman_name");
					});
           }
          });
   
   
     $("#add_modal").modal();
    
   });  
     
     
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
     
       //点击保存
	 $("#save_healthrecord_btn").click(function(){
	 // alert($("#formid").serialize());
	   $.ajax({
			url:"${APP_PATH}/health/addhealthrecord",
			type:"POST",
			data:$("#formid").serialize(),
			success:function(result){
				
				if(result.code==100){
					//1.关闭模态框
					$("#add_modal").modal('hide');
					go(totalRecord, hospital1,oldmanname,doctor1);
				}
			}

	  }); 

  });
  
   //编辑信息按钮，弹出模态框
  $(document).on("click",".edit_btn",function(){
	  
	  var edit=$(this).attr("edit-id");
	   //3.把老人的id传递给模态框的编辑按钮
		$("#update_healthrecord_btn").attr("edit-id",$(this).attr("edit-id"));
		
		

	  //发送请求获取
	  $.ajax({
			url:"${APP_PATH}/health/selecthealthrecord/"+edit,
			type:"GET",
			
			success:function(result){
				
				if(result.code==100){
					$("#update_modal").modal();
					//console.log(result);
					var rel=result.extend.medicalrecord;
					$("#select_name").text(rel.oldman.name);
					//alert(rel.oldman.name);
					$("#select_hospital").val([rel.hospital]);
					$("#select_department").val(rel.department);
					$("#select_doctor").val(rel.doctor);
					$("#select_clinicaltime").val(ChangeDateFormat(rel.clinicaltime));
					$("#select_appointmenttime").val(ChangeDateFormat(rel.appointmenttime));
					$("#select_medicalrecord1").val(rel.medicalrecord1);
					$("#select_chekcontent").val(rel.chekcontent);
					$("#select_ancillarycheckcontent").val(rel.ancillarycheckcontent);
					$("#select_realcheckcontent").val(rel.realcheckcontent);
					$("#select_normalusedrug").val(rel.normalusedrug);
					$("#select_diagnosis").val(rel.diagnosis);
					$("#select_treatmentcareprescription").val(rel.treatmentcareprescription);
					$("#select_tabooltems").val(rel.tabooltems);
				}
			   }
			});
	  }); 

	  //点击修改
	  $("#update_healthrecord_btn").click(function(){
       var edit=$(this).attr("edit-id");
	   $.ajax({
			url:"${APP_PATH}/health/updatehealthrecord/"+edit,
			type:"POST",
			data:$("#update_modal form").serialize(),
			success:function(result){
				
				if(result.code==100){
					//1.关闭模态框
					$("#update_modal").modal('hide');
					go(currentNum, hospital1,oldmanname,doctor1);
				}
			}

	  }); 

  });
	
	
	//点击查看
	
	$(document).on("click",".serchBtn",function(){
	
	var serch=$(this).attr("serch-id");
	
	//发送请求获取
	  $.ajax({
			url:"${APP_PATH}/health/selecthealthrecord/"+serch,
			type:"GET",
			
			success:function(result){
				
				if(result.code==100){
					$("#select_modal").modal();
					//console.log(result);
					var rel=result.extend.medicalrecord;
					$("#select_name1").text(rel.oldman.name);
					//alert(rel.oldman.name);
					$("#select_hospital1").text(rel.hospital);
					$("#select_department1").text(rel.department);
					$("#select_doctor1").text(rel.doctor);
					$("#select_clinicaltime1").text(ChangeDateFormat(rel.clinicaltime));
					$("#select_appointmenttime1").text(ChangeDateFormat(rel.appointmenttime));
					$("#select_medicalrecord11").text(rel.medicalrecord1);
					$("#select_chekcontent1").text(rel.chekcontent);
					$("#select_ancillarycheckcontent1").text(rel.ancillarycheckcontent);
					$("#select_realcheckcontent1").text(rel.realcheckcontent);
					$("#select_normalusedrug1").text(rel.normalusedrug);
					$("#select_diagnosis1").text(rel.diagnosis);
					$("#select_treatmentcareprescription1").text(rel.treatmentcareprescription);
					$("#select_tabooltems1").text(rel.tabooltems);
				}
			   }
	});
	
	});
	  
	  
	</SCRIPT>
</body>
</html>
