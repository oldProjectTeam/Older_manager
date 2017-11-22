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
							疾病记录
							<button type="button" class="btn back fr" id="btnclose">返回</button>
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
							<button id="chaxun" class="btn btn-success col-md-2">查询</button>
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
												<form class="form-horizontal " role="form">
													<div class="form-group">
														<label for="" class="col-md-4 control-label">疾病名称：</label>
														<div class="col-md-8" style="padding:0;">
															<input type="text" class="form-control" id="yaoname"
																placeholder="">
														</div>
													</div>
													<div class="form-group">
														<label for="" class="col-md-4 control-label">确诊地点：</label>
														<div class="col-md-8" style="padding:0;">
															<input type="text" class="form-control" id="zuoyong"
																placeholder="">
														</div>
													</div>
													<div class="form-group">
														<label for="" class="col-md-4 control-label">确诊时间：</label>
														<input class="easyui-datebox datebox-f combo-f textbox-f"
															editable="false" id="h_kaishi"
															style="width: 280px; height: 30px; display: none;">
													</div>

													<div class="form-group">
														<label for="" class="col-md-4 control-label">现在状态：</label>
														<div class="col-md-8" style="padding:0;">
															<input type="text" class="form-control" id="jiliang"
																placeholder="">
														</div>
													</div>
													<div class="form-group">
														<label for="" class="col-md-4 control-label">备注：</label>
														<div class="col-md-8" style="padding:0;">
															<input type="text" class="form-control" id="jiliang"
																placeholder="">
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
						<!-- 列表开始 -->
						<table
							class="table table-striped table-bordered table-hover text-center yyjl-table">
							<thead>
								<tr class="xy-head">
									<th class="col-md-2">疾病名称</th>
									<th class="col-md-2">确诊时间</th>
									<th class="col-md-2">确诊地点</th>
									<th class="col-md-3">现在状态</th>
									<th class="col-md-3">操作</th>
								</tr>
							</thead>
							<tbody id="disease_tbody">
								 
							</tbody>
						</table>
						<!--分页信息  -->
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
						<!-- 列表结束 -->
					</div>
					<!-- 健康数据结束 -->


					<!-- 右侧内容区结束 -->
				</div>
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
 $(function(){
	 layer.msg('加载中', {
			icon : 16,
			shade : 0.01,
			time : 2000,
			offset : [ '40%' ],
	});
	 to_page(1);
 });

//构建表格信息
function build_table(result){
	$("#disease_tbody").empty();
	$.each(result.extend.pageInfo.list,function(index,item){
		var td1=$("<td></td>").append(item.diseasename);
		var td2=$("<td></td>").append(ChangeDateFormat(item.confirmedtime));
		var td3=$("<td></td>").append(item.place);
		var td4=$("<td></td>").append(item.nowstate);
		var td5=$("<td></td>");
		var div1=$("<div class='jjda-btn' data-toggle='modal' data-target='#jkda'></div>");
		var i1=$("<i class='jjda-btn-editer'></i>");
		div1.append(i1).append("编辑");
		div1.click(function(){
			getDisease(item.id);
		});
		
		var div2=$("<div class='jjda-btn'></div>");
		var i2=$("<i class='jjda-btn-del'></i>");
		div2.append(i2).append("删除");
		td5.append(div1).append(div2);
		div2.click(function(){
			del(item.id);
		});
		var tr=$("<tr></tr>");
		tr.append(td1).append(td2).append(td3).append(td4).append(td5).appendTo("#disease_tbody");
	});
}

//构建分页信息
function buil_modal_pageInfo(result){
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
	$.ajax({
		url:"${APP_PATH}/disease/findAll",
		data:"pn="+pn+"&oldmanId="+'${older.oldmanId}',
		type:"post",
		success:function(result){
			//console.log(result);
			//1.构建表格数据
			build_table(result);
			//2.构建页信息
			buil_modal_pageInfo(result);
		}
	});
}
	//删除
	 function del(id) {
	     $.messager.confirm('删除记录信息', '您确定要删除该记录吗?', function (r) {
	         if (r) {
	             var m_CommInfo = new KingonUI.CommInfo();
	             m_CommInfo.dataSource='1';
	             m_CommInfo.tableName='kf_Drug';
	             m_CommInfo.guid=guid;
	             var Postdata= m_CommInfo.getJson()
	             $.ajax({
	                 type: 'POST',
	                 url: '/DynaTable/delTableModelFromGuid',
	                 dataType: 'html',
	                 data: { commInfo: Postdata },
	                 success: function (msg) {
	                     var CommonPageReturnJSon = JSON.parse(msg);
	                     if (CommonPageReturnJSon.Type == 'ok') {
	                         $('#datagrid').datagrid('reload');
	                         $.messager.alert('系统消息', '删除成功!!');
							 getliebiao();
	                     }
	                     else{
	                         $.messager.alert('系统消息', CommonPageReturnJSon.ModelJSON);
	                     }
	                 }
	             });
	         }
	     });
	}
	
	//获得疾病信息
	function getDisease(id){
		
	}
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
</script>
</body>
</html>
