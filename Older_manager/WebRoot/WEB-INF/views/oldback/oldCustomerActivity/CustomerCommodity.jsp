<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%
 pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'CustomerActivity.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<!-- 引入jquery -->
<script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.7.2.min.js"></script>
<!-- 引入样式 -->

<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
 <script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

  </head>
  
  <body style="margin: 15px;">
  <div class="col-sm-12">

   <div class="row">
	  <div class="col-md-12" >
		<ol class="breadcrumb">
		  <li><b>位置：客户关系管理</b></li>
	    		<li>购买商品</li> 
	    	    
		</ol>
	  </div>
    </div>
  
	    	
	   		<table class="table table-hover table-bordered text-center">
	    		<thead>
	    			<tr>
	        			<td><input name="" type="checkbox" value="" id="activity"/></td>
	        			<td>编号<i class="sort"><img src="images/px.gif" /></i></td>
	        			<td>老人的姓名</td>
	        			<td>商品名称</td>
	        			<td>数量</td>
				        <td>共计金额</td>
				        <td>购买时间</td>
				        <td>商品星级</td>
			        </tr>
				</thead>
	        	<tbody>
	        		<tr>
				        <td><input name="" type="checkbox" value="" class="activityid"/></td>
				        <td>20130908</td>
				        <td>王金平</td>
				        <td>游戏皮肤</td>
				        <td>5</td>
				        <td>500</td>
				        <td>20130104</td>
				        <td>5级</td>
			        </tr>
			        <tr>
				        <td><input name="" type="checkbox" value="" class="activityid"/></td>
				        <td>20130908</td>
				        <td>王金平</td>
				        <td>游戏皮肤</td>
				        <td>5</td>
				        <td>500</td>
				        <td>20130104</td>
				        <td>5级</td>
			        </tr>
			        <tr>
				        <td><input name="" type="checkbox" value="" class="activityid"/></td>
				        <td>20130908</td>
				        <td>王金平</td>
				        <td>游戏皮肤</td>
				        <td>5</td>
				        <td>500</td>
				        <td>20130104</td>
				        <td>5级</td>
			        </tr>
	        		<tr>
				        <td><input name="" type="checkbox" value="" class="activityid"/></td>
				        <td>20130908</td>
				        <td>王金平</td>
				        <td>游戏皮肤</td>
				        <td>5</td>
				        <td>500</td>
				        <td>20130104</td>
				        <td>5级</td>
			        </tr>
			        <tr>
				        <td><input name="" type="checkbox" value="" class="activityid"/></td>
				        <td>20130908</td>
				        <td>王金平</td>
				        <td>游戏皮肤</td>
				        <td>5</td>
				        <td>500</td>
				        <td>20130104</td>
				        <td>5级</td>
			        </tr>
			        <tr>
				        <td><input name="" type="checkbox" value="" class="activityid"/></td>
				        <td>20130908</td>
				        <td>王金平</td>
				        <td>游戏皮肤</td>
				        <td>5</td>
				        <td>500</td>
				        <td>20130104</td>
				        <td>5级</td>
			        </tr>
			        <tr>
				        <td><input name="" type="checkbox" value="" class="activityid"/></td>
				        <td>20130908</td>
				        <td>王金平</td>
				        <td>游戏皮肤</td>
				        <td>5</td>
				        <td>500</td>
				        <td>20130104</td>
				        <td>5级</td>
			        </tr>
			        <tr>
				        <td><input name="" type="checkbox" value="" class="activityid"/></td>
				        <td>20130908</td>
				        <td>王金平</td>
				        <td>游戏皮肤</td>
				        <td>5</td>
				        <td>500</td>
				        <td>20130104</td>
				        <td>5级</td>
			        </tr>
	        	</tbody>
	    	</table>
	    	
		    <div class="pagin">
		    	<div class="message">共<i class="blue">258</i>条记录，当前显示第&nbsp;<i class="blue">1&nbsp;</i>页</div>
		         1 2 3 4 5 6 
		    </div>
	    </div>

	    <!-- 查询弹框 -->
	    <div id="myModal" class="modal fade" tabindex="-1" role="dialog">
			<div class="modal-dialog" role="document">
		    	<div class="modal-content">
		      		<div class="modal-header">
		        		<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		        		<h4 class="modal-title">查询</h4>
		      		</div>
		      		<div class="modal-body">
		        		<ul class="forminfo">
		    				<li>
		    					<label>老人的姓名</label>
		    					<input name="" type="text" class="dfinput"  style="width:258px;"/>
		    				</li>
		    				<li>
			    				<label>商品的名称</label>
		    					<input name="" type="text" class="dfinput"  style="width:258px;"/>
		    				</li>
							<li>
								<label>共计金额</label>
								<input name="" type="text" class="dfinput"  style="width:258px;"/>
							</li>
							<li>
								<label>购买时间</label>
								<input name="" type="text" class="dfinput"  style="width:258px;"/>
							</li>
							<li>
								<label>商品的星级</label>
								<input name="" type="text" class="dfinput"  style="width:258px;"/>
							</li>
	    				</ul>
		      		</div>
		      		<div class="modal-footer">
		        		<button type="button" class="btn btn-primary" data-dismiss="modal">查询</button>
		        		<button type="button" class="btn btn-default" data-dismiss="modal">返回</button>
		      		</div>
		    	</div><!-- /.modal-content -->
		  	</div><!-- /.modal-dialog -->
		</div><!-- /.modal -->
	    

		
  </body>
</html>
