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
							短信详细
							<button type="button" class="btn back fr" 
							onClick="javascript:history.go(-1);">返回</button>
						</div>
						<!-- 短信列表开始 -->
						<div class="row" style="padding-top:20px" id="list">
							 
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
//默认加载数据
  $(function(){
	 load_info();
 });
//构建短信列表信息
function build_info(result){
	var item=result.extend.sms;
	$("#list").empty();
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
	 div12.append(item.content);
	 div.append(div11).append(div12).appendTo("#list");
}
 
//加载数据
function load_info(){
	layer.msg('加载中', {
		icon : 16,
		shade : 0.01,
		time :100000,
		offset : [ '40%' ],
	});
	$.ajax({
		url:"${APP_PATH}/sms/findSms/${smsId}",
		type:"post",
		success:function(result){ 
			layer.closeAll();	
			//1.构建数据
			build_info(result);	 
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
                         history.go(-1);
                     }
                     else{
                         $.messager.alert('系统消息',"删除失败了");
                     }
                 }
             });
         }
     });
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
