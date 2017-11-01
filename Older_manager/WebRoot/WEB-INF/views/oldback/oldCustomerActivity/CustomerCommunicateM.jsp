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
  
    <div class="row">
	  <div class="col-md-12" >
		<ol class="breadcrumb">
		  <li><b>位置：客户关系管理</b></li>
	    		<li>沟通老人</li> 
	    		<li>修改沟通老人资料</li>
		</ol>
	  </div>
    </div>
	    
	     <div class="col-sm-6 col-sm-offset-3">
	          <table class="table table-bordered table-hover">
	                <tr>
	                   <td colspan="6"> Hi，<b>admin</b>，欢迎您填写沟通老人信息！</td>
	                </tr>
	               <tr>
	                 <td><label>老人的姓名</label></td>
	                 <td><input name="" type="text" class="form-control"></td>
	                 <td><label>沟通的时间</label></td>
	                 <td ><input name="" type="text" class="form-control"></td>
	               </tr>
					<tr>
						<td><label>沟通的类容</label></td>
						<td colspan="4"><textarea class="form-control" rows="3"></textarea></td>
		
					</tr>
			       <tr>
	                 <td><label>所属服务点</label></td>
	                 <td><input name="" type="text" class="form-control"></td>
	                 <td><label>参加的时间</label></td>
	                 <td><input name="" type="date" class="form-control"></td>
	               </tr>
	        
	               <tr>
	                 <td><label>沟通过人员</label></td>
	                 <td><input name="" type="text" class="form-control"></td>
	                  <td><label>上传图片</label></td>
	                 <td><input name="" type="file" class="form-control"></td>
	               </tr>
	               <tr>
	                 <td><label>上传视频</label></td>
	                 <td><input name="" type="file" class="form-control"></td>
	                  <td><label>上传录音</label></td>
	                 <td><input name="" type="file" class="form-control"></td>
	               </tr>
	          </table>
	</div>
	      <div class="row">
	          <div class="col-sm-4 col-sm-offset-4 text-center" >
	              <button class="btn btn-success">保存</button>
	              <button class="btn btn-default">返回</button>
	          </div>
	      </div>
	    

		<!-- 模态框 -->
		<div id="myModal" class="modal fade bs-example-modal-sm" tabindex="-1" role="dialog">
  			<div class="modal-dialog modal-sm" role="document">
			    <div class="modal-content">
			    	<div class="modal-header">
			        	<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
			        	<h3 class="modal-title">保存成功！</h3>
			      	</div>
				</div><!-- /.modal-content -->
			</div><!-- /.modal-dialog -->
		</div><!-- /.modal -->
		
      
	
  </body>
</html>
