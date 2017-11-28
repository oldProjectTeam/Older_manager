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

<style type="text/css">
.controller{
	 white-space:nowrap; overflow:hidden; text-overflow:ellipsis;
}
.rightFloat{
	float:right;
	 
}
</style>
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



					<!--短信数据开始 -->
					<div class="jksj" style="margin-top:15px;">
						<div class="xy-title">
							短信记录
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

						<!-- 短信列表开始 -->
						<div class="row" style="padding-top:20px" id="list">

						</div>
						 
						<!--分页信息开始  -->
			          <div class="row">
			          	<div class="col-md-6" id="page_info">	          	           
			          	</div>
			          	<div class="col-md-6">
			          		<button type="button" 
			          		 class="btn btn-danger btn-xs rightFloat" id="clear_sms_btn">清空短信</button>
			          	</div>
			          </div>
			          <div class="row">
			          	<div class="col-md-12">
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
//默认加载数据
  $(function(){
	 load_sms(1);
 });

//清空所用短信记录
  $("#clear_sms_btn").click(function(){
	  layer.confirm("确定删除所有短信记录？",{
		  offset:["30%"]
	  },function(index){
		  layer.close(index);
		  layer.msg('正在删除', {
				icon : 16,
				shade : 0.01,
				time :200000,
				offset : [ '40%' ],
		   });
		  $.ajax({
	          type:'POST',
	          url:'${APP_PATH}/sms/batchDelSms/'+'${older.account}',	                       
	          success: function (result) { 
	         	 layer.closeAll();
	              if (result.code==100) {
	                  $.messager.alert('系统消息', '删除成功!');
						 load_sms(current_pageNum);
						 getSmsCount();
	              }
	              else{
	                  $.messager.alert('系统消息',"删除失败了");
	              }
	          }
	      });
	  });
	  
  });
  
var current_pageNum="";
var current_pages="";
//构建短信列表信息
function build_list(result){
	if(result.extend.pageInfo.list.length==0){
		$("#clear_sms_btn").attr("disabled","disabled");
	}
	current_pageNum=result.extend.pageInfo.pageNum;
	current_pages=result.extend.pageInfo.pages;
	$("#list").empty();
	$.each(result.extend.pageInfo.list,function(index,item){
		 var div=$("<div></div>").addClass("panel panel-info");
		 var div11=$("<div></div>").addClass("panel-heading");
		 var div12=$("<div></div>").addClass("panel-body");
		 
		 //标题部分
		 var span111=$("<span></span>").addClass("label label-info")
		 .append("发件人："+item.sender);
		 var span112=$("<span></span>").addClass("label label-success col-md-offset-3")
		 .append("时间："+ChangeDateFormat(item.sendtime));
		 var button111=$("<button type='button' class='btn btn-danger btn-xs rightFloat'>删除</button>");
		 button111.click(function(){
			 del(item.id);
		 });
		 div11.append(span111).append(span112).append(button111);
		 
		 //内容部分
		 var div121=$("<div></div>").addClass("controller col-md-10");
		 var a1211=$("<a></a>").attr("href","${APP_PATH}/older/sms_detail/"+item.id)
		 .append(item.content);
		 div121.append(a1211);
		 div12.append(div121);
		 
		 div.append(div11).append(div12).appendTo("#list");
		 
	});
}

//构建分页信息
function buil_list_pageInfo(result){
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
			load_sms(1);
		});
		prePage.click(function(){
			load_sms(result.extend.pageInfo.pageNum-1);
		});
	}
	if(result.extend.pageInfo.hasNextPage==false){
		nextPage.addClass("disabled");
		lastPage.addClass("disabled");
	}else{
		nextPage.click(function(){
			load_sms(result.extend.pageInfo.pageNum+1);
		});
		lastPage.click(function(){
			load_sms(result.extend.pageInfo.pages);
		});
	}
	$("#nav_ul_info").append(firstPage).append(prePage);
	$.each(result.extend.pageInfo.navigatepageNums,function(index,item){
		var numLi=$("<li></li>").append($("<a></a>").append(item));
		if(result.extend.pageInfo.pageNum==item){
			numLi.addClass("active");	
		}
		numLi.click(function(){
			load_sms(item);
		});
		$("#nav_ul_info").append(numLi);
	});
	$("#nav_ul_info").append(nextPage).append(lastPage);
	
}

//去哪页加载数据
function load_sms(pn){
	layer.msg('加载中', {
		icon : 16,
		shade : 0.01,
		time :100000,
		offset : [ '40%' ],
	});
	$.ajax({
		url:"${APP_PATH}/sms/findAll",
		data:{
			pn:pn,
			receiverphone:'${older.account}',
			sendtime1:$('#h_Time1').datebox('getValue'),
			sendtime2:$('#h_Time2').datebox('getValue')
		},
		type:"post",
		success:function(result){
			 
			layer.closeAll();
			//console.log(result);
			//1.构建表格数据
			build_list(result);
			//2.构建页信息
			buil_list_pageInfo(result);
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
	                 url:'${APP_PATH}/sms/delSms/'+id,	                       
	                 success: function (result) { 
	                	 layer.closeAll();
	                     if (result.code==100) {
	                         $.messager.alert('系统消息', '删除成功!!');
							 load_sms(current_pageNum);
							 getSmsCount();
	                     }
	                     else{
	                         $.messager.alert('系统消息',"删除失败了");
	                     }
	                 }
	             });
	         }
	     });
	}
 
	 
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
		return "sendtime1="+time1+"&sendtime2="+time2;
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
			url:"${APP_PATH}/sms/findAll?"+time,
			data:{
				receiverphone:'${older.account}'
			},
			type:"post",
			success:function(result){
				layer.closeAll();
				//1.构建表格数据
				build_list(result);
				//2.构建页信息
				buil_list_pageInfo(result);
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
