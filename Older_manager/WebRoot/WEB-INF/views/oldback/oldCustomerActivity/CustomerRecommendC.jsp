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
	    		<li>推荐商品</li> 
		</ol>
	  </div>
    </div>
   
		
				<!-- 老人列表弹窗 -->
				<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
					<div class="modal-dialog" role="document">
				    	<div class="modal-content">
				      		<div class="modal-header">
				        		<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
				        		<h4 class="modal-title" id="myModalLabel">老人列表</h4>
				      		</div>
				      		<div >
								<table class="tablelist">
					        		<thead>
				    					<tr>
				        					<th><input name="" type="checkbox" value="" id="active"/></th>
				        					<th>编号<i class="sort"><img src="images/px.gif" /></i></th>
				        					<th>姓名</th>
				        					<th>性别</th>
				        					<th>年龄</th>
							        		<th>类别</th>
							        		<th>慢性病</th>
							        		<th>失能情况</th>
							        		<th>残疾情况</th>
							        		<th>老人星级</th>
							        		<th>操作</th>
						        		</tr>
									</thead>
									<tbody>
						        		<tr>
									        <td><input name="" type="checkbox" value="" class="actived"/></td>
									        <td>12345</td>
									        <td>王金平</td>
									        <td>男</td>
									        <td>78岁</td>
									        <td>独居老人</td>
									        <td>无</td>
									        <td>无</td>
									        <td>无</td>
									        <td>5级</td>
									        <td>
									        	<a href="#" class="tablelink">查看</a>
									        </td>
								        </tr>
								        <tr>
									        <td><input name="" type="checkbox" value="" class="actived"/></td>
									        <td>12345</td>
									        <td>王金平</td>
									        <td>男</td>
									        <td>78岁</td>
									        <td>独居老人</td>
									        <td>无</td>
									        <td>无</td>
									        <td>无</td>
									        <td>5级</td>
									        <td>
									        	<a href="#" class="tablelink">查看</a>
									        </td>
								        </tr>
								        <tr>
									        <td><input name="" type="checkbox" value="" class="actived"/></td>
									        <td>12345</td>
									        <td>王金平</td>
									        <td>男</td>
									        <td>78岁</td>
									        <td>独居老人</td>
									        <td>无</td>
									        <td>无</td>
									        <td>无</td>
									        <td>5级</td>
									        <td>
									        	<a href="#" class="tablelink">查看</a>
									        </td>
								        </tr>
								        <tr>
									        <td><input name="" type="checkbox" value="" class="actived"/></td>
									        <td>12345</td>
									        <td>王金平</td>
									        <td>男</td>
									        <td>78岁</td>
									        <td>独居老人</td>
									        <td>无</td>
									        <td>无</td>
									        <td>无</td>
									        <td>5级</td>
									        <td>
									        	<a href="#" class="tablelink">查看</a>
									        </td>
								        </tr>
								        <tr>
									        <td><input name="" type="checkbox" value="" class="actived"/></td>
									        <td>12345</td>
									        <td>王金平</td>
									        <td>男</td>
									        <td>78岁</td>
									        <td>独居老人</td>
									        <td>无</td>
									        <td>无</td>
									        <td>无</td>
									        <td>5级</td>
									        <td>
									        	<a href="#" class="tablelink">查看</a>
									        </td>
								        </tr>
						        	</tbody>
				        		</table>
				      		</div>
						    <div class="modal-footer">
						    	<button type="button" class="btn btn-primary">推荐</button>
						        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
						    </div>
				    	</div>
				  	</div>
				</div>
	    	</div>
	
	    	
	   		<table class="table table-hover table-bordered">
	    		<thead>
	    			<tr>
	        			<th><input name="" type="checkbox" value="" id="activity"/></th>
	        			<th>编号<i class="sort"><img src="images/px.gif" /></i></th>
	        			<th>商品名称</th>
	        			<th>老人的姓名</th>
	        			<th>商品的星级</th>
	        			<th>老人的星级</th>
	        			<th>推荐人</th>
				        <th>推荐状态</th>
	        			<th>推荐时间</th>
			        </tr>
				</thead>
	        	<tbody>
			        <tr>
				        <td><input name="" type="checkbox" value="" class="activityid"/></td>
				        <td>20130908</td>
				        <td>众星之子的皮肤</td>
				        <td>王金平</td>
				        <td>5级</td>
				        <td>2级</td>
				        <td>员工1102</td>
				        <td>未推荐</td>
				        <td>20130104</td>
			        </tr> 
			        <tr>
				        <td><input name="" type="checkbox" value="" class="activityid"/></td>
				        <td>20130908</td>
				        <td>众星之子的皮肤</td>
				        <td>王金平</td>
				        <td>5级</td>
				        <td>2级</td>
				        <td>员工1102</td>
				        <td>未推荐</td>
				        <td>20130104</td>
			        </tr> 
	        		<tr>
				        <td><input name="" type="checkbox" value="" class="activityid"/></td>
				        <td>20130908</td>
				        <td>众星之子的皮肤</td>
				        <td>王金平</td>
				        <td>5级</td>
				        <td>2级</td>
				        <td>员工1102</td>
				        <td>未推荐</td>
				        <td>20130104</td>
			        </tr> 
			        <tr>
				        <td><input name="" type="checkbox" value="" class="activityid"/></td>
				        <td>20130908</td>
				        <td>众星之子的皮肤</td>
				        <td>王金平</td>
				        <td>5级</td>
				        <td>2级</td>
				        <td>员工1102</td>
				        <td>未推荐</td>
				        <td>20130104</td>
			        </tr> 
			        <tr>
				        <td><input name="" type="checkbox" value="" class="activityid"/></td>
				        <td>20130908</td>
				        <td>众星之子的皮肤</td>
				        <td>王金平</td>
				        <td>5级</td>
				        <td>2级</td>
				        <td>员工1102</td>
				        <td>未推荐</td>
				        <td>20130104</td>
			        </tr> 
			        <tr>
				        <td><input name="" type="checkbox" value="" class="activityid"/></td>
				        <td>20130908</td>
				        <td>众星之子的皮肤</td>
				        <td>王金平</td>
				        <td>5级</td>
				        <td>2级</td>
				        <td>员工1102</td>
				        <td>未推荐</td>
				        <td>20130104</td>
			        </tr> 
			        <tr>
				        <td><input name="" type="checkbox" value="" class="activityid"/></td>
				        <td>20130908</td>
				        <td>众星之子的皮肤</td>
				        <td>王金平</td>
				        <td>5级</td>
				        <td>2级</td>
				        <td>员工1102</td>
				        <td>未推荐</td>
				        <td>20130104</td>
			        </tr> 
			        <tr>
				        <td><input name="" type="checkbox" value="" class="activityid"/></td>
				        <td>20130908</td>
				        <td>众星之子的皮肤</td>
				        <td>王金平</td>
				        <td>5级</td>
				        <td>2级</td>
				        <td>员工1102</td>
				        <td>未推荐</td>
				        <td>20130104</td>
			        </tr> 
	        	</tbody>
	    	</table>
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
		    
	    <!-- 查询弹框 -->
	    <div id="Modal" class="modal fade" tabindex="-1" role="dialog">
			<div class="modal-dialog" role="document">
		    	<div class="modal-content">
		      		<div class="modal-header">
		        		<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
		        		<h4 class="modal-title">查询</h4>
		      		</div>
		      		<div class="modal-body">
		        		<ul class="forminfo">
		        			<li>
		    					<label>商品名称</label>
		    					<input name="" type="text" class="dfinput"  style="width:258px;"/>
		    				</li>
		    				<li>
		    					<label>老人的姓名</label>
		    					<input name="" type="text" class="dfinput"  style="width:258px;"/>
		    				</li>
							<li>
								<label>商品的星级</label>
								<input name="" type="text" class="dfinput"  style="width:58px;"/>&nbsp;级
							</li>
							<li>
								<label>老人的星级</label>
								<input name="" type="text" class="dfinput"  style="width:58px;"/>&nbsp;级
							</li>
							<li>
		    					<label>推荐人</label>
		    					<input name="" type="text" class="dfinput"  style="width:258px;"/>
		    				</li>
							<li>
								<label>推荐状态</label>
								<label class="radio-inline">
								  	<input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1">已推荐
								</label>
								<label class="radio-inline">
								  	<input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2">未推荐
								</label>
								<label class="radio-inline">
								  	<input type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option3">所有
								</label>
								<!-- <label>推荐状态</label>
								<input name="" type="text" class="dfinput"  style="width:258px;"/> -->
							</li>
		    				<li>
			    				<label>推荐时间</label>
		    					<input name="" type="text" class="dfinput"  style="width:75px;"/>
								年
								<input name="" type="text" class="dfinput"  style="width:72px;"/>
								月
								<input name="" type="text" class="dfinput"  style="width:72px;"/>
								日
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
