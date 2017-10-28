<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
pageContext.setAttribute("APP_PATH", request.getContextPath());
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'sendrecord.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta content="width=device-width,initial-scale=1">
<!-- 引入jquery -->
<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery-1.7.2.min.js"></script>
<!-- 引入样式 -->
<link
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script type="text/javascript">
 		function del(){
 			var text="你确定要删除吗？";
 			if(confirm(text)==true){
 				return true;
 			}else{
 				return false;
 			}
 		}
 	</script>

</head>
  
  <body style="margin: 15px;">
  	<div style="width:98%;margin-left:5px">
  	<br>
    	<span>发送记录</span>
    	<form action="" method="post" style="margin-top:10px" >
    		发送人:<input type="text">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    		号码:<input type="text">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    		收信人:<input type="text">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    		<button type="button" value="查询">查询</button>&nbsp;&nbsp;&nbsp;
    		<button type="button" value="重置">重置</button>&nbsp;&nbsp;&nbsp;
    		<button type="button" value="删除">批量删除</button>
    	</form>
    	<table class="table table-bordered table-hover">
    		<tr>
    			<th class="col-sm-1"></th>
    			<th class="col-sm-2"><input id="phone" type="checkbox">&nbsp;&nbsp;电话号码</th>
    			<th class="col-sm-2">发送人</th>
    			<th class="col-sm-2">收信人</th>
    			<th class="col-sm-2">发送时间</th>
    			<th class="col-sm-2 text-center">操作</th>
    		</tr>
    		<tr>
    			<td>1</td>
    			<td><input class="phoneid" type="checkbox">&nbsp;&nbsp;18785681234</td>
    			<td>赵琴琴</td>
    			<td>18785681235</td>
    			<td>2017-10-22</td>
    			<td>
    				<ul class="list-unstyle list-inline text-center">
    					<li class="col-sm-6"><a href="/Older_manager/static/oldback/officemanage/noteinformation.jsp">查看详细</a></li>
    					<li class="col-sm-6"><a href="" onclick="javascript:return del()" >删除</a></li>
    				</ul>
    			</td>
    		</tr>
    		<tr>
    			<td>2</td>
    			<td><input class="phoneid" type="checkbox">&nbsp;&nbsp;18785681234</td>
    			<td>赵琴琴</td>
    			<td>18785681235</td>
    			<td>2017-10-22</td>
    			<td>
    				<ul class="list-unstyle list-inline text-center">
    					<li class="col-sm-6"><a href="/Older_manager/static/oldback/officemanage/noteinformation.jsp">查看详细</a></li>
    					<li class="col-sm-6"><a href="" onclick="javascript:return del()">删除</a></li>
    				</ul>
    			</td>
    		</tr>
    		<tr>
    			<td>3</td>
    			<td><input class="phoneid" type="checkbox">&nbsp;&nbsp;18785681234</td>
    			<td>赵琴琴</td>
    			<td>18785681235</td>
    			<td>2017-10-22</td>
    			<td>
    				<ul class="list-unstyle list-inline text-center">
    					<li class="col-sm-6"><a href="/Older_manager/static/oldback/officemanage/noteinformation.jsp">查看详细</a></li>
    					<li class="col-sm-6"><a href="" onclick="javascript:return del()">删除</a></li>
    				</ul>
    			</td>
    		</tr>
    		<tr>
    			<td>4</td>
    			<td><input class="phoneid" type="checkbox">&nbsp;&nbsp;18785681234</td>
    			<td>赵琴琴</td>
    			<td>18785681235</td>
    			<td>2017-10-22</td>
    			<td>
    				<ul class="list-unstyle list-inline text-center">
    					<li class="col-sm-6"><a href="/Older_manager/static/oldback/officemanage/noteinformation.jsp">查看详细</a></li>
    					<li class="col-sm-6"><a href="" onclick="javascript:return del()">删除</a></li>
    				</ul>
    			</td>
    		</tr>
    	</table>
    	<div>
    		跳转至：
    		<select style="width:60px">
    			<option>1</option>
    			<option>2</option>
    			<option>3</option>
    			<option>4</option>
    		</select>
    		&nbsp;&nbsp;&nbsp;&nbsp;<a href=""><span class="glyphicon glyphicon-step-backward"></span></a>
    		&nbsp;&nbsp;第&nbsp;<input type="text"  style="width:50px" placeholder="1">&nbsp;页
    		&nbsp;&nbsp;<a href=""><span class="glyphicon glyphicon-step-forward"></span></a>
    		&nbsp;&nbsp;&nbsp;&nbsp;<a href=""><span class="glyphicon glyphicon-repeat"></span></a>
    	</div>
    </div>
    
    <script type="text/javascript">
    	$("#phone").click(function(){
    		$(".phoneid").prop("checked",$(this).prop("checked"));
    	});
    </script>
  </body>
</html>
