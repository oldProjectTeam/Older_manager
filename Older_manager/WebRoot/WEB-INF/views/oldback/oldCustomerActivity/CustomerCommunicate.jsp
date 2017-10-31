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
		  <li><b>位置：<a href="CustomerActivity.html">客户关系管理</a></b></li>
	    		<li><a href="CustomerActivity.html">沟通老人</a></li> 
		</ol>
	  </div>
    </div>
	    	
	   <div class="col-sm-12">
	    	
	   		<table class="table table-hover table-bordered">
	    		<thead>
	    			<tr>
	        			<th><input name="" type="checkbox" value="" id="activity"/></th>
	        			<th>编号<i class="sort"><img src="images/px.gif" /></i></th>
	        			<th>老人的姓名</th>
	        			<th>沟通的时间</th>
	        			<th>沟通的内容</th>
	        			<th>老人所属服务点</th>
				        <th>沟通的人员</th>
				        <th>操作</th>
			        </tr>
				</thead>
	        	<tbody>
	        		<tr>
				        <td><input name="" type="checkbox" value="" class="activityid"/></td>
				        <td>20130908</td>
				        <td>王金平</td>
				        <td>20130104</td>
				        <td>和老人聊了他的家庭情况</td>
				        <td>天山雪池服务点</td>
				        <td>赵瑞康灵</td>
				        <td>
				        	<a data-toggle="modal" data-target="#Modal">查看</a>
				        	&nbsp;&nbsp;
				        	<a href="CustomerCommunicateM.html">修改</a>
				        	&nbsp;&nbsp;
				        	<a href="#" class="click">删除</a>
				        </td>
			        </tr>
			        <tr>
				        <td><input name="" type="checkbox" value="" class="activityid"/></td>
				        <td>20130908</td>
				        <td>王金平</td>
				        <td>20130104</td>
				        <td>和老人聊了他的家庭情况</td>
				        <td>天山雪池服务点</td>
				        <td>赵瑞康灵</td>
				        <td>
				        	<a data-toggle="modal" data-target="#Modal">查看</a>
				        	&nbsp;&nbsp;
				        	<a href="CustomerCommunicateM.html">修改</a>
				        	&nbsp;&nbsp;
				        	<a href="#" class="click">删除</a>
				        </td>
			        </tr>
			        <tr>
				        <td><input name="" type="checkbox" value="" class="activityid"/></td>
				        <td>20130908</td>
				        <td>王金平</td>
				        <td>20130104</td>
				        <td>和老人聊了他的家庭情况</td>
				        <td>天山雪池服务点</td>
				        <td>赵瑞康灵</td>
				        <td>
				        	<a data-toggle="modal" data-target="#Modal">查看</a>
				        	&nbsp;&nbsp;
				        	<a href="CustomerCommunicateM.html">修改</a>
				        	&nbsp;&nbsp;
				        	<a href="#" class="click">删除</a>
				        </td>
			        </tr>
	        		<tr>
				        <td><input name="" type="checkbox" value="" class="activityid"/></td>
				        <td>20130908</td>
				        <td>王金平</td>
				        <td>20130104</td>
				        <td>和老人聊了他的家庭情况</td>
				        <td>天山雪池服务点</td>
				        <td>赵瑞康灵</td>
				        <td>
				        	<a data-toggle="modal" data-target="#Modal">查看</a>
				        	&nbsp;&nbsp;
				        	<a href="CustomerCommunicateM.html">修改</a>
				        	&nbsp;&nbsp;
				        	<a href="#" class="click">删除</a>
				        </td>
			        </tr>
			        <tr>
				        <td><input name="" type="checkbox" value="" class="activityid"/></td>
				        <td>20130908</td>
				        <td>王金平</td>
				        <td>20130104</td>
				        <td>和老人聊了他的家庭情况</td>
				        <td>天山雪池服务点</td>
				        <td>赵瑞康灵</td>
				        <td>
				        	<a data-toggle="modal" data-target="#Modal">查看</a>
				        	&nbsp;&nbsp;
				        	<a href="CustomerCommunicateM.html">修改</a>
				        	&nbsp;&nbsp;
				        	<a href="#" class="click">删除</a>
				        </td>
			        </tr>
			        <tr>
				        <td><input name="" type="checkbox" value="" class="activityid"/></td>
				        <td>20130908</td>
				        <td>王金平</td>
				        <td>20130104</td>
				        <td>和老人聊了他的家庭情况</td>
				        <td>天山雪池服务点</td>
				        <td>赵瑞康灵</td>
				        <td>
				        	<a data-toggle="modal" data-target="#Modal">查看</a>
				        	&nbsp;&nbsp;
				        	<a href="CustomerCommunicateM.html">修改</a>
				        	&nbsp;&nbsp;
				        	<a href="#" class="click">删除</a>
				        </td>
			        </tr>
			        <tr>
				        <td><input name="" type="checkbox" value="" class="activityid"/></td>
				        <td>20130908</td>
				        <td>王金平</td>
				        <td>20130104</td>
				        <td>和老人聊了他的家庭情况</td>
				        <td>天山雪池服务点</td>
				        <td>赵瑞康灵</td>
				        <td>
				        	<a data-toggle="modal" data-target="#Modal">查看</a>
				        	&nbsp;&nbsp;
				        	<a href="CustomerCommunicateM.html">修改</a>
				        	&nbsp;&nbsp;
				        	<a href="#" class="click">删除</a>
				        </td>
			        </tr>
			        <tr>
				        <td><input name="" type="checkbox" value="" class="activityid"/></td>
				        <td>20130908</td>
				        <td>王金平</td>
				        <td>20130104</td>
				        <td>和老人聊了他的家庭情况</td>
				        <td>天山雪池服务点</td>
				        <td>赵瑞康灵</td>
				        <td>
				        	<a data-toggle="modal" data-target="#Modal">查看</a>
				        	&nbsp;&nbsp;
				        	<a href="CustomerCommunicateM.html">修改</a>
				        	&nbsp;&nbsp;
				        	<a href="#" class="click">删除</a>
				        </td>
			        </tr>
	        	</tbody>
	    	</table>
	    	
		    <div class="pagin">
		    	<div class="message">共<i class="blue">258</i>条记录，当前显示第&nbsp;<i class="blue">1&nbsp;</i>页</div>
		        1 2 3 5
		    </div>
	    

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
			    				<label>沟通的时间</label>
		    					<input name="" type="text" class="dfinput"  style="width:75px;"/>
								年
								<input name="" type="text" class="dfinput"  style="width:72px;"/>
								月
								<input name="" type="text" class="dfinput"  style="width:72px;"/>
								日
		    				</li>
							<li>
								<label>所属服务点</label>
								<input name="" type="text" class="dfinput"  style="width:258px;"/>
							</li>
							<li>
								<label>沟通人员</label>
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
		
		<!-- 查看弹框 -->
	    <div id="Modal" class="modal fade" tabindex="-1" role="dialog">
			<div class="modal-dialog" role="document">
		    	<div class="modal-content">
		      		<div class="modal-header">
		        		<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		        		<h4 class="modal-title">查看</h4>
		      		</div>
		      		<div class="modal-body">
		        		<ul class="forminfo">
		    				<li>
		    					<p>老人的姓名：王金平</p>
		    				</li>
		    				<li>
			    				<p>沟通的时间：2013年01月04日</p>
		    				</li>
							<li>
								<p>沟通的内容：和老人聊了他的家庭情况</p>
							</li>
							<li>
								<p>老人所属服务点：天山雪池服务点</p>
							</li>
							<li>
								<p>沟通的人员：赵瑞康灵</p>
							</li>
							<li>
								<p>图片：<img src="images/t02.png" /></p>
							</li>
							<li>
								<p>视频：<img src="images/t02.png" /></p>
							</li>
							<li>
								<p>录音：<img src="images/t02.png" /></p>
							</li>
	    				</ul>
		      		</div>
		      		<div class="modal-footer">
		        		<button type="button" class="btn btn-default" data-dismiss="modal">返回</button>
		      		</div>
		    	</div><!-- /.modal-content -->
		  	</div><!-- /.modal-dialog -->
		</div><!-- /.modal -->
	    
    	
		
  </body>
</html>
