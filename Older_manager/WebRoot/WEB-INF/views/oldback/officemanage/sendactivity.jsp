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

<title>My JSP 'sendactivity.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta name="viewport" content="width=device-width,initial-scale=1">
<!-- 引入jquery -->
<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery-3.2.1.js"></script>
<!-- 引入样式 -->
<link
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>

<body>

<!--路劲导航  -->
	<div class="row">
		<div class="col-md-12">
			<ol class="breadcrumb">
				<li><b>位置：<a
						href="officemanage/officemanageIndex">办公管理</a></b></li>
				<li class="active">发布活动</li>
			</ol>
		</div>
	</div>
	<div style="width:98%;margin-left:10px">		 
		 
		<form class="form-inline" id="activity_data_form">
		  <div class="form-group">
		    <label for="exampleInputName2">活动标题</label>
		    <input type="text" class="form-control" id="title" name="title" placeholder="活动标题">
		  </div>
		  <div class="form-group">
		    <label for="exampleInputName2">活动地点</label>
		    <input type="text" class="form-control" id="place" name="place" placeholder="活动地点">
		  </div>
		  <div class="form-group">
		    <label for="exampleInputName2">发布部门</label>
		    <input type="text" class="form-control" id="releasepeople" name="releasepeople" placeholder="发布部门">
		  </div>
		  <div class="form-group">
		    <label for="exampleInputName2">活动时间</label>
		    <input type="date" class="form-control" id="activitytime" name="activitytime" placeholder="活动时间">
		  </div>
		  <div class="form-group">
		    <label for="exampleInputName2">活动内容：</label><br>
		    <textarea rows="12" cols="129" placeholder="活动的内容"
			style="margin-top:10px;margin-bottom:10px" id="content" name="content" required="required"></textarea>
		    <input type="hidden" value="未进行" name="state">
		  </div>
		<div class="row">
			<div class="col-md-6 text-center">
			<h5><font color=red><span id="errorMsg"></span></font></h5>
			</div>
			<div class="col-md-6">
				<button type="button" class=" btn btn-success" style="font-size:20px" id="save_btn">确定发布</button>
	    <span  id="msg"></span>
			</div>
		</div>
		
	    </form>
	</div>
	
<script type="text/javascript">
	//校验结果的提示信息
	function show_vaildate_msg(ele,status,msg){
		$(ele).parent().removeClass("has-success has-error");
		$("#errorMsg").html("");
		if("success"==status){
			$(ele).parent().addClass("has-success");
			$("#errorMsg").html(msg);
		}else if("error"==status){
			$(ele).parent().addClass("has-error");
			$("#errorMsg").html(msg);
		}
		
	}
	//校验活动标题
	$("#title").mouseleave(function(){
		var title=$("#title").val();
		var regex=/^[\u4e00-\u9fa5]{2,100}|[a-zA-Z0-9]{2,100}$/;
		if(!regex.test(title)){
			show_vaildate_msg("#title","error","活动标题可以是2-100个中文、英文和数字的组合");
			$("#title").attr("title_check","fail");
			 
		}else{
			show_vaildate_msg("#title","success","");
			$("#title").attr("title_check","success");
		}
	});
	//校验活动地点
	$("#place").mouseleave(function(){
		var place=$("#place").val();
		var regex=/^[\u4e00-\u9fa5]{2,100}|[a-zA-Z0-9]{2,100}$/;
		if(!regex.test(place)){
			show_vaildate_msg("#place","error","活动地点可以是2-100个中文、英文和数字的组合");
			$("#place").attr("place_check","fail");
			 
		}else{
			show_vaildate_msg("#place","success","");
			$("#place").attr("place_check","success");
		}
	});
	//校验发布部门
	$("#releasepeople").mouseleave(function(){
		var releasepeople=$("#releasepeople").val();
		var regex=/^[\u4e00-\u9fa5]{2,50}|[a-zA-Z0-9]{2,50}$/;
		if(!regex.test(releasepeople)){
			show_vaildate_msg("#releasepeople","error","发布部门可以是2-50个中文、英文和数字的组合");
			$("#releasepeople").attr("releasepeople_check","fail");
			 
		}else{
			show_vaildate_msg("#releasepeople","success","");
			$("#releasepeople").attr("releasepeople_check","success");
		}
	});
	//校验活动时间
	$("#activitytime").mouseleave(function(){
		var activitytime=$("#activitytime").val();
		 
		if(activitytime==undefined||activitytime==''){
			show_vaildate_msg("#activitytime","error","请选择活动时间！");
			$("#activitytime").attr("activitytime_check","fail");
			 
		}else{
			show_vaildate_msg("#activitytime","success","");
			$("#activitytime").attr("activitytime_check","success");
		}
	});
	//校验活动内容
	$("#content").mouseleave(function(){
		var content=$("#content").val();
		 
		if(content==undefined||content==''){
			show_vaildate_msg("#content","error","活动内容不能为空！");
			$("#content").attr("content_check","fail");
			 
		}else if(content.length>1000){
			show_vaildate_msg("#content","error","活动内容不能大于1000个字符！");
			$("#content").attr("content_check","fail");
		}else{
			show_vaildate_msg("#content","success","");
			$("#content").attr("content_check","success");
		}
	});
	
	//确定发布按钮，保存数据
	$("#save_btn").click(function(){
		if($("#title").attr("title_check")!="success"){
			show_vaildate_msg("#title","error","活动标题可以是2-100个中文、英文和数字的组合");
			return false;
		}
		if($("#place").attr("place_check")!="success"){
			show_vaildate_msg("#place","error","活动地点可以是2-100个中文、英文和数字的组合");
			return false;
		}
		if($("#releasepeople").attr("releasepeople_check")!="success"){
			show_vaildate_msg("#releasepeople","error","发布部门可以是2-50个中文、英文和数字的组合");
			return false;
		}
		if($("#activitytime").attr("activitytime_check")!="success"){
			show_vaildate_msg("#activitytime","error","请选择活动时间！");
			return false;
		}
		if($("#content").attr("content_check")!="success"){
			show_vaildate_msg("#contente","error","活动内容不能为空或不能超出1000个字符!");
			return false;
		}
		$.ajax({
			url:"${APP_PATH}/activity/insertActivity",
			type:"post",
			data:$("#activity_data_form").serialize(),
			success:function(result){
				$("#msg").html(result.msg);
				if(result.code==100){
					$("#msg").css("color","green");
				}else{
					$("#msg").css("color","red");
				}
				//清空表单
				$("#activity_data_form")[0].reset();
				$("#title").removeAttr("title_check");
				$("#place").removeAttr("place_check");
				$("#releasepeople").removeAttr("releasepeople_check");
				$("#activitytime").removeAttr("activitytime_check");
				$("#content").removeAttr("content_check");
			}
		});
	});
	
</script>
</body>
</html>
