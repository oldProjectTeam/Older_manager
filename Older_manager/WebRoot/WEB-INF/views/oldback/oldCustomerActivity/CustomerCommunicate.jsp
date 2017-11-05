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
	    		<li>沟通老人</li> 
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
	    	
		     <!--分页信息  -->
		    <div class="row" >
		      <div class="col-md-7">
		      	&nbsp;&nbsp;当前第1页，共3页，总计15条记录
		      </div>
			  <div class="col-md-4 col-md-offset-1">
				 <nav aria-label="Page navigation">
					  <ul class="pagination">
					    <li >
					      <a href="recom/skipconmmunctionolder" aria-label="Previous">
					        <span aria-hidden="true">&laquo;</span>
					      </a>
					    </li>
					    <li class="active"><a href="recom/skipconmmunctionolder">1</a></li>
					    <li><a href="recom/skipconmmunctionolder">2</a></li>
					    <li><a href="recom/skipconmmunctionolder">3</a></li>
					    <li><a href="recom/skipconmmunctionolder">4</a></li>
					    <li><a href="recom/skipconmmunctionolder">5</a></li>
					    <li>
					      <a href="recom/skipconmmunctionolder" aria-label="Next">
					        <span aria-hidden="true">&raquo;</span>
					      </a>
					    </li>
					  </ul>
					</nav>
				 
			  </div>
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
