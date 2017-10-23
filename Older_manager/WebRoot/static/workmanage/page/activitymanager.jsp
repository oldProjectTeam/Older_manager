<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>活动管理</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta name="viewport" content="width=device-width,initial-scale=1">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css">
  	<link rel="stylesheet" href="static/workmanage/css/informnotice.css">
  	<script src="static/js/jquery-3.2.1.min.js"></script>
  	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  	<script >
  		function del(){
  			var text="你确定要删除吗";
  			if(confirm(text)==true){
  				return true;
  			}else{
  				return false;
  			}
  		}
  	</script>
  </head>
  
  <body>
  
  	<div style="width:98%;margin-left:5px">
  		<span class="col-sm-12 backstyle">活动管理</span><br>
  		<br>
  		<br>
    	<ul class="list-unstyle list-inline">
    		<li ><a href="/Older_manager/static/workmanage/page/sendactivity.jsp"><button type="button" class="btn btn-default">发布活动</button></a></li>
    		<li ><a href=""><button type="button" class="btn btn-default">删除活动</button></a></li>
    		<li ><a href=""><button type="button" class="btn btn-default">推送到手机</button></a></li>
    	</ul>
    		<form action="" method="post" class="form-inline">
    		&nbsp;&nbsp;&nbsp;活动标题：<input type="text" placeholder="通告标题">&nbsp;&nbsp;&nbsp;
    		活动地点：
    		<select style="width:150px">
    			<option>上海</option>
    			<option>北京</option>
    		</select>&nbsp;&nbsp;&nbsp;
    		活动时间：<input type="text" placeholder="发布人">&nbsp;&nbsp;&nbsp;
    		<input type="submit" value="查询">&nbsp;&nbsp;&nbsp;
    		<input type="submit" value="重置">
    	</form>
    	<table class="table table-bordered table-hover">
    		<tr>
    			<th></th>
    			<th class="col-sm-2"><input id="activity" type="checkbox">&nbsp;&nbsp;&nbsp;&nbsp;活动编号</th>
    			<th class="col-sm-2 text-center">活动题目</th>
    			<th class="col-sm-3 text-center">活动地点</th>
    			<th class="col-sm-2 text-center">发布部门</th>
    			<th class="col-sm-1 text-center">发布时间</th>
    			<th class="col-sm-2 text-center">操作</th>
    		</tr>
    		<tr>
    			<td>1</td>
    			<td><input class="activityid" type="checkbox">&nbsp;&nbsp;buijdcn1234</td>
    			<td>羽毛球比赛</td>
    			<td>贵州省贵阳市黔灵山公园</td>
    			<td>办公室</td>
    			<td>2017-10-21</td>
    			<td>
    				<ul class="list-unstyle list-inline">
    					<li class="col-sm-4 text-center"><a href="" data-toggle="modal" data-target="#alter" >修改</a></li>
    					<li class="col-sm-4 text-center"><a href="" onclick="javascript:return del()">删除</a></li>
    					<li class="col-sm-4 text-center"><a href="/Older_manager/static/workmanage/page/activityinformation.jsp">查看</a></li>
    				</ul>
    			</td>
    		</tr>
    		<tr>
    			<td>2</td>
    			<td><input class="activityid" type="checkbox">&nbsp;&nbsp;buijdcn1234</td>
    			<td>羽毛球比赛</td>
    			<td>贵州省贵阳市黔灵山公园</td>
    			<td>办公室</td>
    			<td>2017-10-21</td>
    			<td>
    				<ul class="list-unstyle list-inline">
    					<li class="col-sm-4 text-center"><a href="" data-toggle="modal" data-target="#alter">修改</a></li>
    					<li class="col-sm-4 text-center"><a href="" onclick="javascript:return del()">删除</a></li>
    					<li class="col-sm-4 text-center"><a href="/Older_manager/static/workmanage/page/activityinformation.jsp">查看</a></li>
    				</ul>
    			</td>
    		</tr>
    		<tr>
    			<td>3</td>
    			<td><input class="activityid" type="checkbox">&nbsp;&nbsp;buijdcn1234</td>
    			<td>羽毛球比赛</td>
    			<td>贵州省贵阳市黔灵山公园</td>
    			<td>办公室</td>
    			<td>2017-10-21</td>
    			<td>
    				<ul class="list-unstyle list-inline">
    					<li class="col-sm-4 text-center"><a href="" data-toggle="modal" data-target="#alter">修改</a></li>
    					<li class="col-sm-4 text-center"><a href="" onclick="javascript:return del()">删除</a></li>
    					<li class="col-sm-4 text-center"><a href="/Older_manager/static/workmanage/page/activityinformation.jsp">查看</a></li>
    				</ul>
    			</td>
    		</tr>
    		<tr>
    			<td>4</td>
    			<td><input class="activityid" type="checkbox">&nbsp;&nbsp;buijdcn1234</td>
    			<td>羽毛球比赛</td>
    			<td>贵州省贵阳市黔灵山公园</td>
    			<td>办公室</td>
    			<td>2017-10-21</td>
    			<td>
    				<ul class="list-unstyle list-inline">
    					<li class="col-sm-4 text-center"><a href="" data-toggle="modal" data-target="#alter">修改</a></li>
    					<li class="col-sm-4 text-center"><a href="" onclick="javascript:return del()">删除</a></li>
    					<li class="col-sm-4 text-center"><a href="/Older_manager/static/workmanage/page/activityinformation.jsp">查看</a></li>
    				</ul>
    			</td>
    		</tr>
    	</table>
    	<div style="height:90px">
    		跳转至：
    		<select style="width:60px;height:30px">
    			<option>1</option>
    			<option>2</option>
    			<option>3</option>
    			<option>4</option>
    		</select> &nbsp;页&nbsp;&nbsp;&nbsp;
    		&nbsp;&nbsp;&nbsp;&nbsp;<a href=""><span class="glyphicon glyphicon-step-backward"></span></a>
    		&nbsp;&nbsp;第&nbsp;<input type="text"  style="width:50px" placeholder="1">&nbsp;页
    		&nbsp;&nbsp;<a href=""><span class="glyphicon glyphicon-step-forward"></span></a>
    		&nbsp;&nbsp;&nbsp;&nbsp;<a href=""><span class="glyphicon glyphicon-repeat"></span></a>
    	</div>
    	
    	<div class="modal fade" id="alter" aria-hidden="true">
    		<div class="modal-dialog">
    			<div class="modal-content">
    				<div class="modal-body">
    					<form action="" method="post" class="form-horizontal">
    						<div class="form-group">
    							&nbsp;&nbsp;&nbsp;&nbsp;活动名称：<input type="text" style="width:300px">
    						</div>
    						<div class="form-group">
    							&nbsp;&nbsp;&nbsp;&nbsp;活动时间：<input type="text" style="width:300px">
    						</div>
    						<div class="form-group">
    							&nbsp;&nbsp;&nbsp;&nbsp;活动地点：<input type="text" style="width:300px">
    						</div>
    						<div class="form-group">
    							&nbsp;&nbsp;&nbsp;&nbsp;发&nbsp;布&nbsp;人&nbsp;：<input type="text" style="width:300px">
    						</div>
    						<div class="form-group">
    							&nbsp;&nbsp;&nbsp;&nbsp;活动类型：<input type="text" style="width:300px">
    						</div>
    						<div class="form-group">
    							&nbsp;&nbsp;&nbsp;&nbsp;活动状态：
								<select>
									<option>正在进行中</option>
									<option>已经结束</option>
									<option>未到时间</option>
								</select>
    						</div>
    						活动介绍：<br>
    						<textarea rows="8" cols="80"></textarea>
    					</form>
    				</div>
    				<div class="modal-footer">
    					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
    					<button type="button" class="btn btn-primary">提交更改内容</button>
    				</div>
    			</div>    		
    		</div>
    	</div>
    	
  	</div>
  <script type="text/javascript">
  	$("#activity").click(function(){
  		$(".activityid").prop("checked",$(this).prop("checked"));
  	});
  </script>
  </body>
</html>
