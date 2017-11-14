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

<title>分类管理</title>
<!-- 
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" /> -->




<%-- <link rel="stylesheet" href="${APP_PATH}/static/shop/css/style.css" />
 <link href="${APP_PATH}/static/shop/assets/css/codemirror.css"
	rel="stylesheet">
 <link rel="stylesheet"
	href="${APP_PATH}/static/shop/assets/css/ace.min.css" /> 
<link rel="stylesheet"
	href="${APP_PATH}/static/shop/font/css/font-awesome.min.css" />
<link rel="stylesheet"
	href="${APP_PATH}/static/shop/assets/css/font-awesome.min.css" />
<script src="${APP_PATH}/static/shop/js/jquery-1.9.1.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/typeahead-bs2.min.js"></script>
<script src="${APP_PATH}/static/shop/js/lrtk.js" type="text/javascript"></script>
<script src="${APP_PATH}/static/shop/assets/js/jquery.dataTables.min.js"></script>
<script
	src="${APP_PATH}/static/shop/assets/js/jquery.dataTables.bootstrap.js"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>
	
	<link
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script> --%> 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
	<div class="page-content clearfix">
		<div class="sort_style">
							<div style="margin-top:20px">
						      <div class="col-md-4">
								<button type="button" class="btn btn-primary" id="add_btn">
									<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
									添加分类
								</button>
								<button type="button" class="btn btn-danger" id="old_delete_all_btn">
									<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
									批量删除
								</button>
							</div>
								<span style="float:right">共：<b id="totalid"></b>类</span>
							</div>
			<div class="sort_list">
				<!-- <table class="table table-striped table-bordered table-hover"
					id="sample-table">
					<thead>
						<tr>
							<th width="25px"><label><input type="checkbox"
									class="ace"><span class="lbl"></span></label></th>
							<th width="50px">ID</th>
							<th width="100px">分类名称</th>
							<th width="50px">数量</th>
							<th width="350px">描述</th>
							<th width="180px">加入时间</th>
							<th width="70px">状态</th>
							<th width="250px">操作</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><label><input type="checkbox" class="ace"><span
									class="lbl"></span></label></td>
							<td>1</td>
							<td>幻灯片</td>
							<td>5</td>
							<td>首页顶部广告轮播图，大图区别于其他图片</td>
							<td>2016-6-29 12:34</td>
							<td class="td-status"><span
								class="label label-success radius">显示</span></td>
							<td class="td-manage">
							<a onClick="member_stop(this,'10001')" href="javascript:;" title="停用" class="btn btn-xs btn-success">
							         <i class="fa fa-check  bigger-120"></i></a> 
							         
							<a title="编辑" onclick="member_edit('编辑','member-add.html','4','','510')"
								href="javascript:;" class="btn btn-xs btn-info"><i class="fa fa-edit bigger-120"></i></a> 
							<a title="删除"
								href="javascript:;" onclick="member_del(this,'1')"
								class="btn btn-xs btn-warning"><i
									class="fa fa-trash  bigger-120"></i></a> 
							<a href="javascript:ovid()" name="Ads_list"
								class="btn btn-xs btn-pink ads_link"
								onclick="AdlistOrders('561');" title="幻灯片广告列表"><i
									class="fa  fa-bars  bigger-120"></i></a></td>
						</tr>
					</tbody>
				</table> -->
         	
			</div>
		</div>
	</div>
		
			
	<div class="row form-inline" align="left" style="margin-top:10px;">
			<div class="col-md-12">
				      分类名称： <input type="text" class="form-control" id="str1id"
					placeholder="请输入分类名称"> 
					描述： <input type="text"
					class="form-control" id="str2id" placeholder="请输入描述">
			
				  <button class="btn btn-default" id="selectwith">
					<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
					查询
				</button>
				
				  
	       <span style="float:right; margin-right:10px">每页显示:<select id="selectid" class="form-control">
			   <option>5</option>
			   <option>20</option>
			   <option>50</option>
			   <option>100</option>
			</select>条</span> 
	    
	   
			</div>
			
			
		</div>	
			
			
			
			
			
			
			
			
			
			
					 <!-- 表格开始 -->
		<div class="row" style="margin-top:10px;">
			<div class="col-md-12">
				<div class="table-responsive">
					<table class="table table-hover table-bordered text-center table-striped" id="sample-table">
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
	

	
 	<!--添加分类-->
	<!--<div class="sort_style_add margin" id="sort_style_add"
		style="display:none">
		<div class="">
			<ul>
				<li><label class="label_name">分类名称</label>
					<div class="col-sm-9">
						<input name="分类名称" type="text" id="form-field-1" placeholder=""
							class="col-xs-10 col-sm-5">
					</div></li>
				<li><label class="label_name">分类说明</label>
					<div class="col-sm-9">
						<textarea name="分类说明" class="form-control" id="form-field-8"
							placeholder="" onkeyup="checkLength(this);"></textarea>
						<span class="wordage">剩余字数：<span id="sy" style="color:Red;">200</span>字
						</span>
					</div></li>
				<li><label class="label_name">分类状态</label> <span
					class="add_content"> &nbsp;&nbsp;<label><input
							name="form-field-radio1" type="radio" checked="checked"
							class="ace"><span class="lbl">显示</span></label>&nbsp;&nbsp;&nbsp;
						<label><input name="form-field-radio1" type="radio"
							class="ace"><span class="lbl">隐藏</span></label></span></li>
			</ul>
		</div>
	</div> -->
	
	
	
	
	
	<!-- 新增模态框 -->
	<!-- Modal -->
<div class="modal fade" id="savesortadsform" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">添加广告分类</h4>
      </div>
      <div class="modal-body">
          <form action="">
           <table class="table table-bordered table-hover text-center">
              <tr>
                <td><font color="red">*</font>分类名称</td>
                  <td>
                      <input name="sortname" type="text" id="sortnameid" placeholder="分类名称"
							class="form-control">
                  </td>
              </tr>
              <tr>
                  <td><font color="red">*</font>分类说明</td>
                  <td>
                     <textarea name="sortcontent" class="form-control" id="sortcontentid"
							placeholder="说点什么，不要超过200字！"></textarea>
					
                  </td>
              </tr>
              <tr>
                  <td>分类状态</td>
                  <td> <label class="radio-inline">
						  <input type="radio" checked="checked" name="sortstate" id="inlineRadio1" value="显示"> 显示
					  </label>
					  <label class="radio-inline">
						  <input type="radio" name="sortstate" id="inlineRadio2" value="隐藏"> 隐藏
					 </label>
		         </td>
              </tr>
           </table></form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-primary" id="savesortads">保存</button>
      </div>
    </div>
  </div>
</div>
	
	
	
	
	<!-- 编辑模态框 -->
	<!-- Modal -->
<div class="modal fade" id="updatesortadsform" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">编辑广告分类</h4>
      </div>
      <div class="modal-body">
          <form action="">
           <table class="table table-bordered table-hover text-center">
              <tr>
                <td><font color="red">*</font>分类名称</td>
                  <td>
                      <input name="sortname" type="text" id="sorid" placeholder="分类名称"
							class="form-control">
                  </td>
              </tr>
              <tr>
                  <td><font color="red">*</font>分类说明</td>
                  <td>
                     <textarea name="sortcontent" class="form-control" id="sortid"
							placeholder="说点什么，不要超过200字！"></textarea>
					
                  </td>
              </tr>
              <tr>
                  <td>分类状态</td>
                  <td> <label class="radio-inline">
						  <input type="radio" checked="checked" name="sortstate" id="sortstate1" value="显示"> 显示
					  </label>
					  <label class="radio-inline">
						  <input type="radio" name="sortstate" id="sortstate2" value="隐藏"> 隐藏
					 </label>
		         </td>
              </tr>
           </table></form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-primary" id="updatesortads">更新</button>
      </div>
    </div>
  </div>
</div>
	
	
	</div>
	<script type="text/javascript">
var totalRecord, currentNum,str1="", str2="",ta=5;
	/* 分页 */
	$(function() {
		go(1, "", "",5);
		
		$("#old_delete_all_btn").attr("disabled", true);
	});
	function go(pn,str1,str2,ta) {
		$("#old_delete_all_btn").attr("disabled", true);
		layer.msg('数据加载中...', {
				icon : 16,
				shade : 0.01
			});
		$.ajax({
			url : "${APP_PATH}/sortad/selectallsortads",
			data : {
				"pn" : pn,
				"str1" : str1,
				"str2" : str2,
				"ta" : ta,
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
		$("#totalid").text(totalRecord);
		currentNum = result.extend.pageInfo.pageNum;
	}
	//解析显示分页条信息
	function build_page_nav(result) {
		$("#page_nav").empty();
		var ul = $("<ul></ul>").addClass("pagination");
		var firstPageLi = $("<li></li>").append($("<a></a>").append("首页"));
		firstPageLi.click(function() {
			go(1, str1,str2,ta);
		});
		var prePageLi = $("<li></li>").append(
				$("<a></a>").append("&laquo;"));
		if (result.extend.pageInfo.hasPreviousPage == false) {
			firstPageLi.addClass("disabled");
			prePageLi.addClass("disabled");
		} else {
			//为元素添加点击翻页事件
			prePageLi
					.click(function() {
						go(result.extend.pageInfo.pageNum - 1, str1,str2,ta);
					});
		}
		var nextPageLi = $("<li></li>").append(
				$("<a></a>").append("&raquo;"));
		var lastPageLi = $("<li></li>").append($("<a></a>").append("末页"));
		lastPageLi.click(function() {
			go(result.extend.pageInfo.pages, str1,str2,ta);
		});
		if (result.extend.pageInfo.hasNextPage == false) {
			nextPageLi.addClass("disabled");
			lastPageLi.addClass("disabled");
		} else {
			//为元素添加点击翻页事件
			nextPageLi
					.click(function() {
						go(result.extend.pageInfo.pageNum + 1,str1,str2,ta);
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
				go(item,str1,str2,ta);
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
		
		var checkBox = $("<td width='25px'></td>").append(
				$("<input type='checkbox' id='check_item_all'/>"));
		var Td1 = $("<td width='50px'></td>").append("ID");
		var Td2 = $("<td width='100px'></td>").append("分类名称");
		var Td3 = $("<td width='50px'></td>").append("数量");
		var Td4 = $("<td width='350px'></td>").append("描述");
		var Td5 = $("<td width='180px'></td>").append("加入时间");
		var Td6 = $("<td width='70px'></td>").append("状态");
		var Td7 = $("<td width='250px'></td>").append("操作");
		headTR.append(checkBox).append(Td1).append(Td2).append(Td3).append(
				Td4).append(Td5).append(Td6).append(Td7).appendTo($("#head"));

		$
				.each(
						result.extend.pageInfo.list,
						function(index, item) {
							var checkBoxTd = $("<td><input type='checkbox' class='check_item'/></td>");
							var ty1 = $("<td></td>").append(item.id);
							var ty2 = $("<td></td>").append(item.sortname);
							var ty3 = $("<td></td>").append(item.sortnum);
							var ty4 = $("<td></td>").append(item.sortcontent);
							var ty5 = $("<td></td>").append(ChangeDateFormat(item.sortjointime));
						    var ty6 = $("<td></td>").append(item.sortstate);
						            
							var Stopstart = $("<button></button>")
									.addClass(
											"stopright")
									.append(
											$("<span></span>"));
											
							// $(this).parents("tr").find(".spanclass").removeClass("glyphicon glyphicon-check bigger-120");
							//				
								if(item.sortstate=="显示"){
								   Stopstart.addClass("btn btn-xs btn-success");
								   Stopstart.find("span").addClass("glyphicon glyphicon-check  bigger-120  spanclass");
								   Stopstart.attr("stateid", "显示");
								}else{
								    Stopstart.addClass("btn btn-xs btn-default");
								    Stopstart.find("span").addClass("glyphicon glyphicon-remove  bigger-120  spanclass"); 
								    Stopstart.attr("stateid", "隐藏");
								}							

							//为启动与关闭按钮添加一个自定义的属性，
							Stopstart.attr("edit-id", item.id);
							var editBetn = $("<button></button>")
									.addClass(
											"btn btn-xs btn-info editbtn")
									.append(
											$("<span></span>")
													.addClass(
															"glyphicon glyphicon-edit bigger-120"));
							//为编辑按钮添加一个自定义的属性，来表示当前查看老人的id
							editBetn.attr("editad-id", item.id);
							var delBtn = $("<button></button>")
									.addClass(
											"btn btn-xs btn-danger delete_btn")
									.append(
											$("<span></span>")
													.addClass(
															"glyphicon glyphicon-trash  bigger-120"));
                                  
							//为删除按钮添加一个自定义的属性，来表示当前删除员工的id
							delBtn.attr("del-id", item.id);
							var Serchbtn = $("<button></button>")
									.addClass(
											"btn btn-xs btn-warning ads_link")
									.append(
											$("<span></span>")
													.addClass(
															"glyphicon glyphicon-menu-hamburger  bigger-120"));
							//为连接.....
							Serchbtn.attr("link-id", item.id);
							var btnTd = $("<td class='td-manage'></td>").append(Stopstart)
									.append(" ").append(editBetn).append(
											" ").append(delBtn).append(" ").append(Serchbtn);
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
				
				var house=date.getHours();
				var min=date.getMinutes();
                 if(min<10){
                   min="0"+min;
                 }
				//getFullYear得到4位数的年份 ，返回一串字符串
				return date.getFullYear() + "-" + month + currentDate+"  "+house+":"+min;
			} else {
				return null;
			}

		}


//搜索change事件

   //每页显示条数
    $("#selectid").change(function(){
           ta=$("#selectid").val();
           str1=$("#str1id").val();
		   str2=$("#str2id").val();
           go(1,str1,str2,ta);
    
    });

      //点击搜索
		$("#selectwith").click(function() {
                  str1=$("#str1id").val();
		          str2=$("#str2id").val();

			  go(1,str1,str2,ta);
                
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

//点击删除   
		$(document).on("click", ".delete_btn", function() {
			var delid = $(this).attr("del-id");
			var oldername = $(this).parents("tr").find("td:eq(2)").text();
			layer.confirm("确认删除【" + oldername + "】吗", function(index) {
				$.ajax({
					url : "${APP_PATH}/sortad/deletesortadbyid/" + delid,
					type : "DELETE",
					success : function(result) {
						
						 go(currentNum,str1,str2,ta);
						layer.msg(result.msg);
					}
				});
			});
		});

//点击删除全部，就批量删除
		$("#old_delete_all_btn")
				.click(
						function() {
							//alert();
							var empNames = "";
							var del_idstr = "";
							$.each($(".check_item:checked"), function() {
								//索引为2，就是第3个td.
								empNames += $(this).parents("tr").find(
										"td:eq(2)").text()
										+ ",";
								//alert(empNames);
								//组装员工id字符串
								del_idstr += $(this).parents("tr").find(
										"td:eq(1)").text()
										+ "-";
								//alert($(this).parents("tr").find("td:eq(2)").text());
								//alert(del_idstr);

							});

							//去除empNames多去的逗号
							empNames = empNames.substring(0,
									empNames.length - 1);
							//去除多余的删除员工-
							del_idstr = del_idstr.substring(0,
									del_idstr.length - 1);
							layer
									.confirm(
											"确认删除【" + empNames + "】吗",
											function(index) {
												//发送ajax请求
												$
														.ajax({
															url : "${APP_PATH}/sortad/deleteallsortads/"
																	+ del_idstr,
															type : "DELETE",
															success : function(
																	result) {
																//回到当前页面
																 go(currentNum,str1,str2,ta);
																$(
																		"#old_delete_all_btn")
																		.attr(
																				"disabled",
																				true);
																layer
																		.msg(result.msg);

															}
														});
											});
						});

 





//新增
$("#add_btn").click(function(){
  $("#savesortadsform").modal();
 
});

	//点击保存
		$("#savesortads").click(
				function() {
					if ($("#sortnameid").val() == ''
					 || $("#sortcontentid").val() == '') {
						layer.msg("请先填写必填项");
					} else {
						var ch=/^[\u4E00-\u9FA5A-Za-z0-9_]+$/;
						    if(!ch.test($("#sortnameid").val())){
						       layer.msg("请输入正确的分类名称");
						    } else if(!ch.test($("#sortcontentid").val())){
						        layer.msg("请输入由中文、数字与英文组成的内容");
						        }else{
						        
						           if($("#sortcontentid").val().length>200){
						               layer.msg("内容过长");
						           }else{
	 					        
						             $.ajax({
								url : "${APP_PATH}/sortad/addsortads",
								type : "POST",
								data : $("#savesortadsform form").serialize(),
								success : function(result) {

									if (result.code == 100) {
										//1.关闭模态框
										$("#savesortadsform").modal('hide');
										go(totalRecord,str1,str2,ta);
										layer.msg("添加成功");
										$("#savesortadsform")[0].reset();
									}
								}

							});
						        }
						         }
						    
						    
						  
							}
				});


//编辑信息按钮，弹出模态框
		$(document).on(
				"click",
				".editbtn",
				function() {

					var edit = $(this).attr("editad-id");
					//3.把老人的id传递给模态框的编辑按钮
					$("#updatesortads").attr("edit-id",
							$(this).attr("editad-id"));

					//发送请求获取
					$.ajax({
						url : "${APP_PATH}/sortad/selectsortadbyid/" + edit,
						type : "GET",

						success : function(result) {

							if (result.code == 100) {
								$("#updatesortadsform").modal();
								//console.log(result);
								var rel = result.extend.sortads;
								$("#sorid").val(rel.sortname);
								$("#sortid").val(rel.sortcontent);
								$("#updatesortadsform input[name=sortstate]").val([rel.sortstate]);
							}
						}
					});
				});




//点击修改
		
		$("#updatesortads").click(function() {
			if ($("#sorid").val() == ''
					 || $("#sortid").val() == '') {
						layer.msg("请先填写必填项");
					} else {
						var ch=/^[\u4E00-\u9FA5A-Za-z0-9_]+$/;
						    if(!ch.test($("#sorid").val())){
						       layer.msg("请输入正确的分类名称");
						    } else if(!ch.test($("#sortid").val())){
						        layer.msg("请输入由中文、数字与英文组成的内容");
						        }else{
						        
						           if($("#sortid").val().length>200){
						               layer.msg("内容过长");
						           }else{

						var edit = $(this).attr("edit-id");
						$.ajax({
							url : "${APP_PATH}/sortad/updatesortads/" + edit,
							type : "POST",
							data : $("#updatesortadsform form").serialize(),
							success : function(result) {

								if (result.code == 100) {
									//1.关闭模态框
									$("#updatesortadsform").modal('hide');
									go(currentNum, str1, str2, ta);
									layer.msg("更新成功");
								}
							}

						});
					}
				}
			}
		});

		//停用与启用

		$(document)
				.on(
						"click",
						".stopright",
						function() {
							var delid = $(this).attr("edit-id");
							var stateid = $(this).attr("stateid");
							if (stateid == "显示") {

								layer
										.confirm(
												'确认要隐藏吗？',
												{
													icon : 0,
												},
												function() {

													layer.msg('隐藏!', {
														icon : 5,
														time : 2000
													});
													$
															.ajax({
																url : "${APP_PATH}/sortad/updatesortadswithstop/"
																		+ delid,
																type : "POST",
																success : function() {

																	go(
																			currentNum,
																			str1,
																			str2,
																			ta);

																}

															});

												});

							} else {

								layer
										.confirm(
												'确认要显示吗？',
												{
													icon : 0,
												},
												function() {

													layer.msg('显示!', {
														icon : 6,
														time : 2000
													});
													$
															.ajax({
																url : "${APP_PATH}/sortad/updatesortadswithstop/"
																		+ delid,
																type : "POST",
																success : function() {

																	go(
																			currentNum,
																			str1,
																			str2,
																			ta);

																}

															});

												});

							}

						});

		//跳转	
		$(document).on(
				"click",
				".ads_link",
				function() {
					var link = $(this).attr("link-id");
					window.location.href = "${APP_PATH}/sortad/skipadslist/"
							+ link + "&" + currentNum;

				});
	</script>
	<!-- <script type="text/javascript">
		$('#sort_add').on(
				'click',
				function() {
					layer.open({
						type : 1,
						title : '添加分类',
						maxmin : true,
						shadeClose : false, //点击遮罩关闭层
						area : [ '750px', '' ],
						content : $('#sort_style_add'),
						btn : [ '提交', '取消' ],
						yes : function(index, layero) {
							var num = 0;
							var str = "";
							$(".sort_style_add input[type$='text']").each(
									function(n) {
										if ($(this).val() == "") {

											layer.alert(str += ""
													+ $(this).attr("name")
													+ "不能为空！\r\n", {
												title : '提示框',
												icon : 0,
											});
											num++;
											return false;
										}
									});
							if (num > 0) {
								return false;
							} else {
								layer.alert('添加成功！', {
									title : '提示框',
									icon : 1,
								});
								layer.close(index);
							}
						}
					});
				})

		function checkLength(which) {
			var maxChars = 200; //
			if (which.value.length > maxChars) {
				layer.open({
					icon : 2,
					title : '提示框',
					content : '您出入的字数超多限制!',
				});
				// 超过限制的字数了就将 文本框中的内容按规定的字数 截取
				which.value = which.value.substring(0, maxChars);
				return false;
			} else {
				var curr = maxChars - which.value.length; //250 减去 当前输入的
				document.getElementById("sy").innerHTML = curr.toString();
				return true;
			}
		};
		/*广告图片-停用*/
		function member_stop(obj, id) {
			layer
					.confirm(
							'确认要关闭吗？',
							{
								icon : 0,
							},
							function(index) {
								$(obj)
										.parents("tr")
										.find(".td-manage")
										.prepend(
												'<a style="text-decoration:none" class="btn btn-xs " onClick="member_start(this,id)" href="javascript:;" title="显示"><i class="fa fa-close bigger-120"></i></a>');
								$(obj)
										.parents("tr")
										.find(".td-status")
										.html(
												'<span class="label label-defaunt radius">已关闭</span>');
								$(obj).remove();
								layer.msg('关闭!', {
									icon : 5,
									time : 1000
								});
							});
		}
		/*广告图片-启用*/
		function member_start(obj, id) {
			layer
					.confirm(
							'确认要显示吗？',
							{
								icon : 0,
							},
							function(index) {
								$(obj)
										.parents("tr")
										.find(".td-manage")
										.prepend(
												'<a style="text-decoration:none" class="btn btn-xs btn-success" onClick="member_stop(this,id)" href="javascript:;" title="关闭"><i class="fa fa-check  bigger-120"></i></a>');
								$(obj)
										.parents("tr")
										.find(".td-status")
										.html(
												'<span class="label label-success radius">显示</span>');
								$(obj).remove();
								layer.msg('显示!', {
									icon : 6,
									time : 1000
								});
							});
		}
		/*广告图片-删除*/
		function member_del(obj, id) {
			layer.confirm('确认要删除吗？', {
				icon : 0,
			}, function(index) {
				$(obj).parents("tr").remove();
				layer.msg('已删除!', {
					icon : 1,
					time : 1000
				});
			});
		}
		//面包屑返回值
		var index = parent.layer.getFrameIndex(window.name);
		parent.layer.iframeAuto(index);
		$('.Order_form ,.ads_link').on('click', function() {
			var cname = $(this).attr("title");
			var cnames = parent.$('.Current_page').html();
			var herf = parent.$("#iframe").attr("src");
			parent.$('#parentIframe span').html(cname);
			parent.$('#parentIframe').css("display", "inline-block");
			parent.$('.Current_page').attr("name", herf).css({
				"color" : "#4c8fbd",
				"cursor" : "pointer"
			});
			//parent.$('.Current_page').html("<a href='javascript:void(0)' name="+herf+">" + cnames + "</a>");
			parent.layer.close(index);

		});
		function AdlistOrders(id) {
			window.location.href = "Ads_list.html?=" + id;
		};
	</script>
	<script type="text/javascript">
		jQuery(function($) {
			var oTable1 = $('#sample-table').dataTable({
				"aaSorting" : [ [ 1, "desc" ] ],//默认第几个排序
				"bStateSave" : true,//状态保存
				"aoColumnDefs" : [
				//{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
				{
					"orderable" : false,
					"aTargets" : [ 0, 2, 4, 6, 7, ]
				} // 制定列不参与排序
				]
			});
			$('table th input:checkbox').on(
					'click',
					function() {
						var that = this;
						$(this).closest('table').find(
								'tr > td:first-child input:checkbox').each(
								function() {
									this.checked = that.checked;
									$(this).closest('tr').toggleClass(
											'selected');
								});

					});
			$('[data-rel="tooltip"]').tooltip({
				placement : tooltip_placement
			});
			function tooltip_placement(context, source) {
				var $source = $(source);
				var $parent = $source.closest('table')
				var off1 = $parent.offset();
				var w1 = $parent.width();

				var off2 = $source.offset();
				var w2 = $source.width();

				if (parseInt(off2.left) < parseInt(off1.left)
						+ parseInt(w1 / 2))
					return 'right';
				return 'left';
			}
		})
	</script> 
	
	 -->
	
</body>
</html>
