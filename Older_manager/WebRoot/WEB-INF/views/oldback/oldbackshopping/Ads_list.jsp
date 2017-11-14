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

<title>列表</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="stylesheet" href="${APP_PATH}/static/shop/css/style.css" />
<link href="${APP_PATH}/static/shop/assets/css/codemirror.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="${APP_PATH}/static/shop/assets/css/colorbox.css">
<!--图片相册-->
<link rel="stylesheet"
	href="${APP_PATH}/static/shop/assets/css/ace.min.css" />
<link rel="stylesheet"
	href="${APP_PATH}/static/shop/font/css/font-awesome.min.css" />
<link rel="stylesheet"
	href="${APP_PATH}/static/shop/assets/css/font-awesome.min.css" />
<script src="${APP_PATH}/static/shop/js/jquery-1.9.1.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/jquery.colorbox-min.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/typeahead-bs2.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/jquery.dataTables.min.js"></script>
<script
	src="${APP_PATH}/static/shop/assets/js/jquery.dataTables.bootstrap.js"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>
<%-- <script type="text/javascript"
	src="${APP_PATH}/static/shop/Widget/swfupload/swfupload.js"></script>
<script type="text/javascript"
	src="${APP_PATH}/static/shop/Widget/swfupload/swfupload.queue.js"></script>
<script type="text/javascript"
	src="${APP_PATH}/static/shop/Widget/swfupload/swfupload.speed.js"></script>
<script type="text/javascript"
	src="${APP_PATH}/static/shop/Widget/swfupload/handlers.js"></script>  --%>
	
	
	
	
	
	
	
	
<!-- 引入jquery -->
<script type="text/javascript"
	src="${APP_PATH}/static/js/jquery-3.2.1.min.js"></script>
<!-- 引入样式 -->

<link
	href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
 <script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>	
<script src="${APP_PATH}/static/layui/css/layui.css"
	type="text/javascript"></script>
<script src="${APP_PATH}/static/layui/layui.js"
	type="text/javascript"></script>
<script language="JavaScript"
	src="${APP_PATH}/static/js/uploadPreview.js"></script>
</head>

<body>

    	<!--  广告图片 <input class="form-control" type="file" name="sortphoto">  -->
	<%-- <div class="page-content clearfix">
		<div class="sort_adsadd_style">
			<div class="border clearfix">
				<span class="l_f"> <a href="javascript:ovid()" id="ads_add"
					title="添加品牌" class="btn btn-warning Order_form"><i
						class="fa fa-plus"></i> 添加广告</a> <a href="javascript:ovid()"
					class="btn btn-danger"><i class="fa fa-trash"></i> 批量删除</a> <a
					href="javascript:ovid()" onClick="javascript :history.back(-1);"
					class="btn btn-info"><i class="fa fa-reply"></i> 返回上一步</a>
				</span> <span class="r_f">共：<b>234</b>个品牌
				</span>
			</div>
			<!--列表样式-->
			<div class="sort_Ads_list">
				<table class="table table-striped table-bordered table-hover"
					id="sample-table">
					<thead>
						<tr>
							<th width="25"><label><input type="checkbox"
									class="ace"><span class="lbl"></span></label></th>
							<th width="80px">ID</th>
							<th width="100">分类</th>
							<th width="80px">排序</th>
							<th width="240px">图片</th>
							<th width="150px">尺寸（大小）</th>
							<th width="250px">链接地址</th>
							<th width="180">加入时间</th>
							<th width="70">状态</th>
							<th width="250">操作</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><label><input type="checkbox" class="ace"><span
									class="lbl"></span></label></td>
							<td>1</td>
							<td>幻灯片</td>
							<td><input name="" type="text" style=" width:50px"
								placeholder="1" /></td>
							<td><span class="ad_img"><a
									href="${APP_PATH}/static/shop/products/ad.jpg"
									data-rel="colorbox" data-title="广告图"><img
										src="${APP_PATH}/static/shop/products/ad.jpg" width="100%"
										height="100%" /></a></span></td>
							<td>1890x1080</td>
							<td><a href="#" target="_blank">http://item.jd.com/10443270082.html</a></td>
							<td>2016-6-29 12:34</td>
							<td class="td-status"><span
								class="label label-success radius">显示</span></td>
							<td class="td-manage"><a onClick="member_stop(this,'10001')"
								href="javascript:;" title="停用" class="btn btn-xs btn-success"><i
									class="fa fa-check  bigger-120"></i></a> <a title="编辑"
								onclick="member_edit('编辑','member-add.html','4','','510')"
								href="javascript:;" class="btn btn-xs btn-info"><i
									class="fa fa-edit bigger-120"></i></a> <a title="删除"
								href="javascript:;" onclick="member_del(this,'1')"
								class="btn btn-xs btn-warning"><i
									class="fa fa-trash  bigger-120"></i></a></td>
						</tr>
						<tr>
							<td><label><input type="checkbox" class="ace"><span
									class="lbl"></span></label></td>
							<td>2</td>
							<td>幻灯片</td>
							<td><input name="" type="text" style=" width:50px"
								placeholder="2" /></td>
							<td><span class="ad_img"><a href="products/ad1.jpg"
									data-rel="colorbox" data-title="广告图"><img
										src="${APP_PATH}/static/shop/products/ad1.jpg" width="100%"
										height="100%" /></a></span></td>
							<td>1890x1080</td>
							<td><a href="#" target="_blank">http://item.jd.com/10443270082.html</a></td>
							<td>2016-6-29 12:34</td>
							<td class="td-status"><span
								class="label label-success radius">显示</span></td>
							<td class="td-manage"><a onClick="member_stop(this,'10001')"
								href="javascript:;" title="停用" class="btn btn-xs btn-success"><i
									class="fa fa-check  bigger-120"></i></a> <a title="编辑"
								onclick="member_edit('编辑','member-add.html','4','','510')"
								href="javascript:;" class="btn btn-xs btn-info"><i
									class="fa fa-edit bigger-120"></i></a> <a title="删除"
								href="javascript:;" onclick="member_del(this,'1')"
								class="btn btn-xs btn-warning"><i
									class="fa fa-trash  bigger-120"></i></a></td>
						</tr>
						<tr>
							<td><label><input type="checkbox" class="ace"><span
									class="lbl"></span></label></td>
							<td>2</td>
							<td>幻灯片</td>
							<td><input name="" type="text" style=" width:50px"
								placeholder="2" /></td>
							<td><span class="ad_img"><a
									href="${APP_PATH}/static/shop/products/p_42.jpg"
									data-rel="colorbox" data-title="广告图"><img
										src="${APP_PATH}/static/shop/products/p_42.jpg" width="100%"
										height="100%" /></a></span></td>
							<td>1890x1080</td>
							<td><a href="#" target="_blank">http://item.jd.com/10443270082.html</a></td>
							<td>2016-6-29 12:34</td>
							<td class="td-status"><span
								class="label label-success radius">显示</span></td>
							<td class="td-manage"><a onClick="member_stop(this,'10001')"
								href="javascript:;" title="停用" class="btn btn-xs btn-success"><i
									class="fa fa-check  bigger-120"></i></a> <a title="编辑"
								onclick="member_edit('编辑','member-add.html','4','','510')"
								href="javascript:;" class="btn btn-xs btn-info"><i
									class="fa fa-edit bigger-120"></i></a> <a title="删除"
								href="javascript:;" onclick="member_del(this,'1')"
								class="btn btn-xs btn-warning"><i
									class="fa fa-trash  bigger-120"></i></a></td>
						</tr>
					</tbody>
				</table>
			</div>

		</div>
	</div> --%>
	
	
	
	
 <div class="col-sm-12">
                      <div style="margin-top:20px">
						      <div class="col-md-4">
								<button type="button" class="btn btn-primary" id="add_btn">
									<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
									添加广告
								</button>
								<button type="button" class="btn btn-danger" id="old_delete_all_btn">
									<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
									批量删除
								</button>
								<button type="button" class="btn btn-info" id="goback">
									<span class="glyphicon glyphicon-share-alt" aria-hidden="true"></span>
									返回上一步
								</button>
							</div>
								<span style="float:right">共：<b id="totalid"></b>类</span>
							</div>
							<br/>
           <div class="row form-inline" align="left" style="margin-top:20px;">
			<div class="col-md-12">
				      分类名称： <input type="text" class="form-control" id="str1id"
					placeholder="请输入分类名称"> 
			
				  <button class="btn btn-default" id="selectwith">
					<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
					查询
				</button>
				
				  
	       <span style="float:right; margin-right:10px">每页显示:<select id="selectid" class="form-control">
			   <option>5</option>
			   <option>20</option>
			   <option>50</option>
			   <option>100</option>
			</select>条</span> 
	    
	   
			</div>
			
			
		</div>
 
 
 
 
	 <!-- 表格开始 -->
		<div class="row" style="margin-top:10px;">
			<div class="col-md-12">
				<div class="table-responsive">
					<table class="table table-hover table-bordered text-center table-striped" id="sample-table">
						<thead id="head">
						</thead>
						<tbody id="table_data">


						</tbody>
					</table>
				</div>
			</div>
			
	</div>  
		<!--分页信息  -->
		<div class="row">
			<div class="col-md-7" id="page_text"></div>
			<div class="col-md-5" id="page_nav"></div>
		</div>	
	
	
</div>		
	<!-- 增加模态框 -->
	<div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" id="addmodal">
  <div class="modal-dialog modal-lg" role="document">
    <div class="modal-content">
         <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">添加广告</h4>
      </div>
      <div class="modal-body">
          <form action="" enctype="multipart/form-data">
                <div class="row form-inline">
                   <div class=" col-sm-offset-1">
                                 <font color="red">*</font>所属分类 <select class="form-control" id="soridid" name="sortname">
	                            <option value="">选择分类</option>
								<option value="首页大幻灯片">首页大幻灯片</option>
								<option value="首页小幻灯片">首页小幻灯片</option>
								<option value="单广告图">单广告图</option>
								<option value="其他广告">其他广告</option>
								<option value="板块栏目广告">板块栏目广告</option>
                            </select>
                   </div>                 
                </div>  
                <br/>
              <div class="row form-inline">
                  <input type="hidden" id="sortsize" name="sortsize">
                 <div class="col-sm-offset-1">
                  <font color="red">*</font> 图片尺寸 <input class="form-control" placeholder="0" style="width:60px" id="size1"> * <input class="form-control" placeholder="0" style="width:60px" id="size2">          
                 </div>
              </div>  
              <br/>
              <div class="row form-inline">
                 <div class="col-sm-offset-1">
                  <font color="red">*</font>显示排序 <input class="form-control" placeholder="0" style="width:60px" id="sorid" name="sort"> 
                 </div>
              </div>   
              <br/>    
              <div class="row form-inline">
                 <div class="col-sm-offset-1">
                             <font color="red">*</font>  链接地址 <input class="form-control" placeholder="www.baidu.com" id="hrefid" name="sorthref"> 
                 </div>
              </div>  
              <br/>
              <div class="row form-inline">
                 <div class="col-sm-offset-1">
                              显示状态
                      <label class="radio-inline">
						  <input type="radio" checked="checked" name="sortstate" id="inlineRadio1" value="显示"> 显示
					  </label>
					  <label class="radio-inline">
						  <input type="radio" name="sortstate" id="inlineRadio2" value="隐藏"> 隐藏
					 </label>
                 </div>
              </div>
              <br/>
               <div class="row form-inline">
                 <div class="col-sm-offset-1" >
                  <input type="hidden" name="sortphoto">
                             <font color="red">*</font> 广告图片  <input type="file" multiple="multiple" class="btn btn-info" name="file" id="up_img" class="form-control" />
                 </div>
                 <div class="col-sm-offset-1" style="width:500px;height:100px; border:solid 0px grey">
                   <img src="${pageContext.request.contextPath}/upload/${user.image==null?'default.png':user.image}"
								id="imgShow" width="300" height="100"> 
                 </div>
              </div>
              <div class="row form-inline">
                 <div class="col-sm-offset-1">
                     <p>图片大小小于5MB,支持.jpg;.gif;.png;.jpeg格式的图片</p>       
                 </div>
                 </div>
          </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-primary" id="saveadslistbtn">保存</button>
      </div>
    </div>
  </div>
</div>
	
	
	<!-- 编辑模态框 -->
	<div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" id="updatemodal">
  <div class="modal-dialog modal-lg" role="document">
    <div class="modal-content">
         <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">编辑广告</h4>
      </div>
      <div class="modal-body">
          <form action="" enctype="multipart/form-data">
                <div class="row form-inline">
                   <div class=" col-sm-offset-1">
                                   <font color="red">*</font> 所属分类 <p class="form-control-static" id="sortnameid"></p>
                   </div>                 
                </div>  
                <br/>
              <div class="row form-inline">
                  <input type="hidden" id="updatesortsize" name="sortsize">
                 <div class="col-sm-offset-1">
                              <font color="red">*</font> 图片尺寸 <input class="form-control" placeholder="0" style="width:60px" id="updatesize1"> * <input class="form-control" placeholder="0" style="width:60px" id="updatesize2">          
                 </div>
              </div>  
              <br/>
              <div class="row form-inline">
                 <div class="col-sm-offset-1">
                              <font color="red">*</font> 显示排序 <input class="form-control" placeholder="0" style="width:60px" id="sortid" name="sort"> 
                 </div>
              </div>   
              <br/>    
              <div class="row form-inline">
                 <div class="col-sm-offset-1">
                             <font color="red">*</font> 链接地址 <input class="form-control" placeholder="www.baidu.com" name="sorthref" id="sorthrefid"> 
                 </div>
              </div>  
              <br/>
              <div class="row form-inline">
                 <div class="col-sm-offset-1">
                              显示状态
                      <label class="radio-inline">
						  <input type="radio" checked="checked" name="sortstate" id="inlineRadio1" value="显示"> 显示
					  </label>
					  <label class="radio-inline">
						  <input type="radio" name="sortstate" id="inlineRadio2" value="隐藏"> 隐藏
					 </label>
                 </div>
              </div>
              <br/>
               <div class="row form-inline">
                 <div class="col-sm-offset-1" >
                  <input type="hidden" name="sortphoto">
                            <font color="red">*</font>  广告图片  <input type="file" multiple="multiple" class="btn btn-info" name="file" id="up_img1" class="form-control" />
                 </div>
                 <div class="col-sm-offset-1" style="width:700px;height:100px; border:solid 0px grey">
                   <img  id="imgShow1" width="300" height="100"> 
                 </div>
              </div>
              <div class="row form-inline">
                 <div class="col-sm-offset-1">
                     <p>图片大小小于5MB,支持.jpg;.gif;.png;.jpeg格式的图片</p>       
                 </div>
                 </div>
          </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-primary" id="updateadslistbtn">更新</button>
      </div>
    </div>
  </div>
</div>
	
	
	
	
	<!--添加广告样式-->
	<%-- <div id="add_ads_style" style="display:none">
		<div class="add_adverts">
			<ul>
				<li><label class="label_name">所属分类</label> <span
					class="cont_style"> <select class="form-control"
						id="form-field-select-1">
							<option value="">选择分类</option>
							<option value="AL">首页大幻灯片</option>
							<option value="AK">首页小幻灯片</option>
							<option value="AZ">单广告图</option>
							<option value="AR">其他广告</option>
							<option value="CA">板块栏目广告</option>
					</select></span></li>
				<li><label class="label_name">图片尺寸</label><span
					class="cont_style"> <input name="长" type="text"
						id="form-field-1" placeholder="0" class="col-xs-10 col-sm-5"
						style="width:80px"> <span class="l_f"
						style="margin-left:10px;">x</span><input name="宽" type="text"
						id="form-field-1" placeholder="0" class="col-xs-10 col-sm-5"
						style="width:80px"></span></li>
				<li><label class="label_name">显示排序</label><span
					class="cont_style"><input name="排序" type="text"
						id="form-field-1" placeholder="0" class="col-xs-10 col-sm-5"
						style="width:50px"></span></li>
				<li><label class="label_name">链接地址</label><span
					class="cont_style"><input name="地址" type="text"
						id="form-field-1" placeholder="地址" class="col-xs-10 col-sm-5"
						style="width:450px"></span></li>
				<li><label class="label_name">状&nbsp;&nbsp;态：</label> <span
					class="cont_style"> &nbsp;&nbsp;<label><input
							name="form-field-radio1" type="radio" checked="checked"
							class="ace"><span class="lbl">显示</span></label>&nbsp;&nbsp;&nbsp;
						<label><input name="form-field-radio1" type="radio"
							class="ace"><span class="lbl">隐藏</span></label></span>
					<div class="prompt r_f"></div></li>
				<li><label class="label_name">图片</label><span
					class="cont_style">
						<div class="demo">
							<div class="logobox">
								<div class="resizebox">
									<img src="${APP_PATH}/static/shop/images/image.png"
										width="100px" alt="" height="100px" />
								</div>
							</div>
							<div class="logoupload">
								<div class="btnbox">
									<a id="uploadBtnHolder" class="uploadbtn" href="javascript:;">上传替换</a>
								</div>
								<div style="clear:both;height:0;overflow:hidden;"></div>
								<div class="progress-box" style="display:none;">
									<div class="progress-num">
										上传进度：<b>0%</b>
									</div>
									<div class="progress-bar">
										<div style="width:0%;" class="bar-line"></div>
									</div>
								</div>
								<div class="prompt">
									<p>图片大小小于5MB,支持.jpg;.gif;.png;.jpeg格式的图片</p>
								</div>
							</div>
						</div>
				</span></li>
			</ul>
		</div>
	</div> --%>



<script type="text/javascript">
	window.onload = function() {
			new uploadPreview({
				UpBtn : "up_img",
				ImgShow : "imgShow"
			});
			
			new uploadPreview({
				UpBtn : "up_img1",
				ImgShow : "imgShow1"
			});
		};
var totalRecord, currentNum,str="",ta=5;
	/* 分页 */
	$(function() {
		go(1, "",5,${id});
		
		$("#old_delete_all_btn").attr("disabled", true);
	});
	function go(pn,str,ta,id) {
		$("#old_delete_all_btn").attr("disabled", true);
		layer.msg('数据加载中...', {
				icon : 16,
				shade : 0.01
			});
		$.ajax({
			url : "${APP_PATH}/adslist/selectalladslist",
			data : {
				"pn" : pn,
				"str" : str,
				"ta" : ta,
				"id" : id,
			},
			type : "GET",
			success : function(result) {
				if (result.code == 100) {
					//console.log(result.extend.pageInfo);
					//构建分页信息
					build_page_text(result);
					//构建分页条
					build_page_nav(result);
					//构建表格数据
					build_table_data(result);
				}
			}
		});
	}
	function build_page_text(result) {
		$("#page_text").empty();
		$("#page_text").append(
				"当前第" + result.extend.pageInfo.pageNum + "页，共"
						+ result.extend.pageInfo.pages + "页，总计"
						+ result.extend.pageInfo.total + "条记录");
		totalRecord = result.extend.pageInfo.total;
		$("#totalid").text(totalRecord);
		currentNum = result.extend.pageInfo.pageNum;
	}
	//解析显示分页条信息
	function build_page_nav(result) {
		$("#page_nav").empty();
		var ul = $("<ul></ul>").addClass("pagination");
		var firstPageLi = $("<li></li>").append($("<a></a>").append("首页"));
		firstPageLi.click(function() {
			go(1, str,ta,${id});
		});
		var prePageLi = $("<li></li>").append(
				$("<a></a>").append("&laquo;"));
		if (result.extend.pageInfo.hasPreviousPage == false) {
			firstPageLi.addClass("disabled");
			prePageLi.addClass("disabled");
		} else {
			//为元素添加点击翻页事件
			prePageLi
					.click(function() {
						go(result.extend.pageInfo.pageNum - 1, str,ta,${id});
					});
		}
		var nextPageLi = $("<li></li>").append(
				$("<a></a>").append("&raquo;"));
		var lastPageLi = $("<li></li>").append($("<a></a>").append("末页"));
		lastPageLi.click(function() {
			go(result.extend.pageInfo.pages, str,ta,${id});
		});
		if (result.extend.pageInfo.hasNextPage == false) {
			nextPageLi.addClass("disabled");
			lastPageLi.addClass("disabled");
		} else {
			//为元素添加点击翻页事件
			nextPageLi
					.click(function() {
						go(result.extend.pageInfo.pageNum + 1,str,ta,${id});
					});
		}
		//添加首页和前一页的提示
		ul.append(firstPageLi).append(prePageLi);
		//遍历给ul中添加页码提示
		$.each(result.extend.pageInfo.navigatepageNums, function(index,
				item) {
			var numLi = $("<li></li>").append($("<a></a>").append(item));
			if (result.extend.pageInfo.pageNum == item) {
				numLi.addClass("active");
			}
			numLi.click(function() {
				go(item,str,ta,${id});
			});
			ul.append(numLi);
		});
		//添加下一页和末页的提示
		ul.append(nextPageLi).append(lastPageLi);
		//把ul加到nav 
		var navEle = $("<nav></nav>").append(ul);
		navEle.appendTo("#page_nav");
	}

	function build_table_data(result) {
		$("#head").empty();
		$("#table_data").empty();
		var headTR = $("<tr></tr>");
		
		var checkBox = $("<td width='25px'></td>").append(
				$("<input type='checkbox' id='check_item_all'/>"));
		var Td1 = $("<td width='80px'></td>").append("ID");
		var Td2 = $("<td width='130px'></td>").append("分类");
		var Td3 = $("<td width='60px'></td>").append("排序");
		var Td4 = $("<td width='240px'></td>").append("图片");
		var Td5 = $("<td width='150px'></td>").append("尺寸（大小）");
		var Td6 = $("<td width='250px'></td>").append("链接地址");
		var Td7 = $("<td width='180px'></td>").append("加入时间");
		var Td8 = $("<td width='70px'></td>").append("状态");
		var Td9 = $("<td width='250px'></td>").append("操作");
		headTR.append(checkBox).append(Td1).append(Td2).append(Td3).append(
				Td4).append(Td5).append(Td6).append(Td7).append(Td8).append(Td9).appendTo($("#head"));

		$
				.each(
						result.extend.pageInfo.list,
						function(index, item) {
							var checkBoxTd = $("<td><input type='checkbox' class='check_item'/></td>");
							var ty1 = $("<td></td>").append(item.id);
							var ty2 = $("<td></td>").append(item.sortname);
							var ty3 = $("<td></td>").append("<input type='text' id='sortchangeid' style='width:50px'>");
							
							 ty3.find("input").attr("value", item.sort);
							 ty3.find("input").attr("inputid",item.id);
							var ty4 = $("<td></td>").append("<img  width='240' height='100'/>");
							 ty4.find("img").attr("src",item.sortphoto);
							var ty5 = $("<td></td>").append(item.sortsize);
						    var ty6 = $("<td></td>").append("<a id='aid'></a>");
						   
						     ty6.find("a").attr("href",item.sorthref);
						     ty6.find("a").append(item.sorthref);
						    var ty7 = $("<td></td>").append(ChangeDateFormat(item.sortjointime));
						    var ty8 = $("<td></td>").append(item.sortstate);
						            
							var Stopstart = $("<button></button>")
									.addClass(
											"stopright")
									.append(
											$("<span></span>"));
											
							// $(this).parents("tr").find(".spanclass").removeClass("glyphicon glyphicon-check bigger-120");
							//				
								if(item.sortstate=="显示"){
								   Stopstart.addClass("btn btn-xs btn-success");
								   Stopstart.find("span").addClass("glyphicon glyphicon-check  bigger-120  spanclass");
								   Stopstart.attr("stateid", "显示");
								}else{
								    Stopstart.addClass("btn btn-xs btn-default");
								    Stopstart.find("span").addClass("glyphicon glyphicon-remove  bigger-120  spanclass"); 
								    Stopstart.attr("stateid", "隐藏");
								}							

							//为启动与关闭按钮添加一个自定义的属性，
							Stopstart.attr("edit-id", item.id);
							var editBetn = $("<button></button>")
									.addClass(
											"btn btn-xs btn-info editbtn")
									.append(
											$("<span></span>")
													.addClass(
															"glyphicon glyphicon-edit bigger-120"));
							//为编辑按钮添加一个自定义的属性，来表示当前查看老人的id
							 editBetn.attr("editad-id", item.id);
							 editBetn.attr("src",item.sortphoto);
							var delBtn = $("<button></button>")
									.addClass(
											"btn btn-xs btn-danger delete_btn")
									.append(
											$("<span></span>")
													.addClass(
															"glyphicon glyphicon-trash  bigger-120"));
                                  
							//为删除按钮添加一个自定义的属性，来表示当前删除员工的id
							delBtn.attr("del-id", item.id);
						
							var btnTd = $("<td class='td-manage'></td>").append(Stopstart)
									.append(" ").append(editBetn).append(
											" ").append(delBtn);
							//append方法执行完成以后还是返回原来的元素							              								              
							$("<tr></tr>").append(checkBoxTd).append(ty1)
									.append(ty2).append(ty3).append(ty4)
									.append(ty5).append(ty6).append(ty7).append(ty8).append(btnTd)
									.appendTo("#table_data");
						});
	}


		function ChangeDateFormat(d) {
			//将时间戳转为int类型，构造Date类型
			if (d != null) {
				var date = new Date(parseInt(d));

				//月份得+1，且只有个位数时在前面+0
				var month = date.getMonth() + 1 + "-";

				//日期为个位数时在前面+0
				var currentDate = date.getDate();
				
				var house=date.getHours();
				var min=date.getMinutes();
                 if(min<10){
                   min="0"+min;
                 }
				//getFullYear得到4位数的年份 ，返回一串字符串
				return date.getFullYear() + "-" + month + currentDate+"  "+house+":"+min;
			} else {
				return null;
			}

		}



   //点击搜索
		$("#selectwith").click(function() {
                  str=$("#str1id").val();
			  go(1,str,ta,${id});
                
		});
		  //每页显示条数
    $("#selectid").change(function(){
           ta=$("#selectid").val();
           str=$("#str1id").val();
           go(1,str,ta,${id});
    
    });
		
		//全选
		$(document).on("click", "#check_item_all", function() {
			$(".check_item").prop("checked", $(this).prop("checked"));

			if ($("#check_item_all").prop("checked") == true) {
				$("#old_delete_all_btn").attr("disabled", false);
			} else {
				$("#old_delete_all_btn").attr("disabled", true);
			}
		});

		$(document)
				.on(
						"click",
						".check_item",
						function() {

							var flag = $(".check_item:checked").length == $(".check_item").length;
							$("#check_item_all").prop("checked", flag);
							if ($(".check_item:checked").length > 0) {
								$("#old_delete_all_btn")
										.attr("disabled", false);
							} else {
								$("#old_delete_all_btn").attr("disabled", true);
							}
						});
						
	//点击删除   
		$(document).on("click", ".delete_btn", function() {
			var delid = $(this).attr("del-id");
			var oldername = $(this).parents("tr").find("td:eq(2)").text();
			layer.confirm("确认删除【" + oldername + "】吗", function(index) {
				$.ajax({
					url : "${APP_PATH}/adslist/deleteadslistbyid/" + delid,
					type : "DELETE",
					success : function(result) {
						
						  go(currentNum,str,ta,${id});
						layer.msg(result.msg);
					}
				});
			});
		});

//点击删除全部，就批量删除
		$("#old_delete_all_btn")
				.click(
						function() {
							//alert();
							var empNames = "";
							var del_idstr = "";
							$.each($(".check_item:checked"), function() {
								//索引为2，就是第3个td.
								empNames += $(this).parents("tr").find(
										"td:eq(2)").text()
										+ ",";
								//alert(empNames);
								//组装员工id字符串
								del_idstr += $(this).parents("tr").find(
										"td:eq(1)").text()
										+ "-";
								//alert($(this).parents("tr").find("td:eq(2)").text());
								//alert(del_idstr);

							});

							//去除empNames多去的逗号
							empNames = empNames.substring(0,
									empNames.length - 1);
							//去除多余的删除员工-
							del_idstr = del_idstr.substring(0,
									del_idstr.length - 1);
							layer
									.confirm(
											"确认删除【" + empNames + "】吗",
											function(index) {
												//发送ajax请求
												$
														.ajax({
															url : "${APP_PATH}/adslist/deletealladslist/"
																	+ del_idstr,
															type : "DELETE",
															success : function(
																	result) {
																//回到当前页面
																  go(currentNum,str,ta,${id});
																layer.msg(result.msg);

															}
														});
											});
						});	
						
						
//停用与启用
	
	$(document).on("click", ".stopright", function() {
	var delid = $(this).attr("edit-id");
	var  stateid=$(this).attr("stateid");
	if(stateid=="显示"){
		
	layer.confirm('确认要隐藏吗？',
								{
								icon : 0,
							},
				function() {

				  layer.msg('隐藏!', {
							icon : 5,
							time : 2000
						});
		         $.ajax({
					url : "${APP_PATH}/adslist/updatesortadswithstop/" + delid,
					type : "POST",
					success : function() {
				 
						 go(currentNum,str,ta,${id});
					}

				});

			});
	
	}else{
	
	layer.confirm('确认要显示吗？',
								{
								icon : 0,
							},
				function() {

				  layer.msg('显示!', {
							icon : 6,
							time : 2000
						});
		         $.ajax({
					url : "${APP_PATH}/adslist/updatesortadswithstop/" + delid,
					type : "POST",
					success : function() {
				 
						 go(currentNum,str,ta,${id});

					}

				});

			});
	
	
	}
	


		});		
		
		
	//新增
	$("#add_btn").click(function(){
	    $("#addmodal").modal();
	
	});	
	
		
	//点击保存
		$("#saveadslistbtn").click(
				function() {
				 $("#sortsize").val($("#size1").val()+"*"+$("#size2").val());


                 if( $("#soridid").val()=="选择分类"||$("#soridid").val()==""||
                     $("#size1").val()==null|| $("#size1").val()==""||
                     $("#size2").val()==null|| $("#size2").val()==""||
                     $("#sorid").val()==null|| $("#sorid").val()==""||
                     $("#hrefid").val()==null|| $("#hrefid").val()==""||
                     $("#up_img").val()==null|| $("#up_img").val()=="" ){
                 
                     layer.msg("必填项填完在保存");
                 
                 }else{
                 var num=/^[0-9]{1,4}$/;
                 var bit=/[a-zA-Z0-9][-a-zA-Z0-9]{0,62}(.[a-zA-Z0-9][-a-zA-Z0-9]{0,62})+.?/;
                     if(!num.test($("#size1").val())){
                       layer.msg("请输入正确的图片尺寸");
                     }else if(!num.test($("#size2").val())){
                       layer.msg("请输入正确的图片尺寸");
                     }else if(!num.test($("#sorid").val())){
                     layer.msg("请输入正确的排序");
                     }else if(!bit.test($("#hrefid").val())){
                     layer.msg("请输入正确的链接地址");
                     }else {
                     



			$.ajax({
				url : "${APP_PATH}/adslist/addadslist/" + ${id},
				type : "POST",
				data :  new FormData($("#addmodal form")[0]),
				cache : false,
				processData : false,
				contentType : false,
				success : function(result) {

					if (result.code == 100) {
						//1.关闭模态框
						$("#addmodal").modal('hide');
						go(totalRecord, str, ta, ${id});
						layer.msg("添加成功");
						$("#addmodal form")[0].reset();
					}
				}

			});
		
                     
                     }
                   
                 }

	});
	//点击编辑按钮
	$(document).on("click",".editbtn",function() {

					var edit = $(this).attr("editad-id");
					//3.把老人的id传递给模态框的编辑按钮
					$("#updateadslistbtn").attr("edit-id",
							$(this).attr("editad-id"));
               
					//发送请求获取
					$.ajax({
						url : "${APP_PATH}/adslist/selectadslistbyid/" + edit,
						type : "GET",

						success : function(result) {

							if (result.code == 100) {
							
								$("#updatemodal").modal();
								//console.log(result);
								var rel = result.extend.adslist;
								$("#sortnameid").text(rel.sortname);
								var str=rel.sortsize.split("*");
								$("#updatesize1").val(str[0]);
								$("#updatesize2").val(str[1]);
								$("#sortid").val(rel.sort);
								$("#sorthrefid").val(rel.sorthref);
								$("#updatemodal input[name=sortstate]").val([rel.sortstate]);
								$("#imgShow1").attr("src",rel.sortphoto);
								$("#imgid").find("img").attr("src",rel.sortphoto);
								
							}
						}
					});
					
				});
	
	 
	 //更新
	 $("#updateadslistbtn").click(function() {
		       
		        $("#updatesortsize").val($("#updatesize1").val()+"*"+$("#updatesize2").val());
			var edit = $(this).attr("edit-id");
			  if( $("#updatesize1").val()==null|| $("#updatesize1").val()==""||
                     $("#updatesize2").val()==null|| $("#updatesize2").val()==""||
                     $("#sortid").val()==null|| $("#sortid").val()==""||
                     $("#sorthrefid").val()==null|| $("#sorthrefid").val()==""){
                 
                     layer.msg("必填项填完在保存");
                 
                 }else{
                 var num=/^[0-9]*$/;
                 var bit=/[a-zA-Z0-9][-a-zA-Z0-9]{0,62}(.[a-zA-Z0-9][-a-zA-Z0-9]{0,62})+.?/;
                     if(!num.test($("#updatesize1").val())){
                       layer.msg("请输入正确的图片尺寸");
                     }else if(!num.test($("#updatesize2").val())){
                       layer.msg("请输入正确的图片尺寸");
                     }else if(!num.test($("#sortid").val())){
                     layer.msg("请输入正确的排序");
                     }else if(!bit.test($("#sorthrefid").val())){
                     layer.msg("请输入正确的链接地址");
                     }else {
                     
			
			
			
			$.ajax({
				url : "${APP_PATH}/adslist/updateadslist/" + edit,
				type : "POST",
				data :  new FormData($("#updatemodal form")[0]),
				cache : false,
				processData : false,
				contentType : false,
				success : function(result) {

					if (result.code == 100) {
						//1.关闭模态框
						$("#updatemodal").modal('hide');
						go(currentNum, str, ta, ${id});
						layer.msg("更新成功");
					}
				}

			});
}}
		});   

	
	
	
	
	$("#goback").click(function(){
	    window.location.href="Sort_ads";
	});
	
	
	//排序
	
	$(document).on("change","#sortchangeid",function() {
	      var num=$("#sortchangeid").val();
	      var inputid = $(this).attr("inputid");
	   $.ajax({
						url : "${APP_PATH}/adslist/updatesortnum/" + inputid+"&"+num,
						type : "POST",

						success : function(result) {

							if (result.code == 100) {
							
								layer.msg("排序成功！");
							}
						}
					});

	});




</script>















	<!-- <script>
		/*******添加广告*********/
		$('#ads_add').on(
				'click',
				function() {
					layer.open({
						type : 1,
						title : '添加广告',
						maxmin : true,
						shadeClose : false, //点击遮罩关闭层
						area : [ '800px', '' ],
						content : $('#add_ads_style'),
						btn : [ '提交', '取消' ],
						yes : function(index, layero) {
							var num = 0;
							var str = "";
							$(".add_adverts input[type$='text']").each(
									function(n) {
										if ($(this).val() == "") {

											layer.alert(str += ""
													+ $(this).attr("name")
													+ "不能为空！\r\n", {
												title : '提示框',
												icon : 0,
											});
											num++;
											return false;
										}
									});
							if (num > 0) {
								return false;
							} else {
								layer.alert('添加成功！', {
									title : '提示框',
									icon : 1,
								});
								layer.close(index);
							}
						}
					});
				});
	</script>
	<script type="text/javascript">
		function updateProgress(file) {
			$('.progress-box .progress-bar > div').css('width',
					parseInt(file.percentUploaded) + '%');
			$('.progress-box .progress-num > b').html(
					SWFUpload.speed.formatPercent(file.percentUploaded));
			if (parseInt(file.percentUploaded) == 100) {
				// 如果上传完成了
				$('.progress-box').hide();
			}
		}

		function initProgress() {
			$('.progress-box').show();
			$('.progress-box .progress-bar > div').css('width', '0%');
			$('.progress-box .progress-num > b').html('0%');
		}

		function successAction(fileInfo) {
			var up_path = fileInfo.path;
			var up_width = fileInfo.width;
			var up_height = fileInfo.height;
			var _up_width, _up_height;
			if (up_width > 120) {
				_up_width = 120;
				_up_height = _up_width * up_height / up_width;
			}
			$(".logobox .resizebox").css({
				width : _up_width,
				height : _up_height
			});
			$(".logobox .resizebox > img").attr('src', up_path);
			$(".logobox .resizebox > img").attr('width', _up_width);
			$(".logobox .resizebox > img").attr('height', _up_height);
		}

		var swfImageUpload;
		$(document)
				.ready(
						function() {
							var settings = {
								flash_url : "./static/shop/Widget/swfupload/swfupload.swf",
								flash9_url : "./static/shop/Widget/swfupload/swfupload_fp9.swf",
								upload_url : "upload.php",// 接受上传的地址
								file_size_limit : "5MB",// 文件大小限制
								file_types : "*.jpg;*.gif;*.png;*.jpeg;",// 限制文件类型
								file_types_description : "图片",// 说明，自己定义
								file_upload_limit : 100,
								file_queue_limit : 0,
								custom_settings : {},
								debug : false,
								// Button settings
								button_image_url : "./static/shop/Widget/swfupload/upload-btn.png",
								button_width : "95",
								button_height : "30 ",
								button_placeholder_id : 'uploadBtnHolder',
								button_window_mode : SWFUpload.WINDOW_MODE.TRANSPARENT,
								button_cursor : SWFUpload.CURSOR.HAND,
								button_action : SWFUpload.BUTTON_ACTION.SELECT_FILE,

								moving_average_history_size : 40,

								// The event handler functions are defined in handlers.js
								swfupload_preload_handler : preLoad,
								swfupload_load_failed_handler : loadFailed,
								file_queued_handler : fileQueued,
								file_dialog_complete_handler : fileDialogComplete,
								upload_start_handler : function(file) {
									initProgress();
									updateProgress(file);
								},
								upload_progress_handler : function(file,
										bytesComplete, bytesTotal) {
									updateProgress(file);
								},
								upload_success_handler : function(file, data,
										response) {
									// 上传成功后处理函数
									var fileInfo = eval("(" + data + ")");
									successAction(fileInfo);
								},
								upload_error_handler : function(file,
										errorCode, message) {
									alert('上传发生了错误！');
								},
								file_queue_error_handler : function(file,
										errorCode, message) {
									if (errorCode == -110) {
										alert('您选择的文件太大了。');
									}
								}
							};
							swfImageUpload = new SWFUpload(settings);
						});
		jQuery(function($) {
			var colorbox_params = {
				reposition : true,
				scalePhotos : true,
				scrolling : false,
				previous : '<i class="fa fa-chevron-left"></i>',
				next : '<i class="fa fa-chevron-right"></i>',
				close : '&times;',
				current : '{current} of {total}',
				maxWidth : '100%',
				maxHeight : '100%',
				onOpen : function() {
					document.body.style.overflow = 'hidden';
				},
				onClosed : function() {
					document.body.style.overflow = 'auto';
				},
				onComplete : function() {
					$.colorbox.resize();
				}
			};

			$('.table-striped [data-rel="colorbox"]').colorbox(colorbox_params);
			$("#cboxLoadingGraphic").append(
					"<i class='icon-spinner orange'></i>");

		});
	</script>
	<script type="text/javascript">
		jQuery(function($) {
			var oTable1 = $('#sample-table').dataTable({
				"aaSorting" : [ [ 1, "desc" ] ],//默认第几个排序
				"bStateSave" : true,//状态保存
				"aoColumnDefs" : [
				//{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
				{
					"orderable" : false,
					"aTargets" : [ 0, 2, 3, 4, 5, 7, 8, ]
				} // 制定列不参与排序
				]
			});

			$('table th input:checkbox').on(
					'click',
					function() {
						var that = this;
						$(this).closest('table').find(
								'tr > td:first-child input:checkbox').each(
								function() {
									this.checked = that.checked;
									$(this).closest('tr').toggleClass(
											'selected');
								});

					});

			$('[data-rel="tooltip"]').tooltip({
				placement : tooltip_placement
			});
			function tooltip_placement(context, source) {
				var $source = $(source);
				var $parent = $source.closest('table')
				var off1 = $parent.offset();
				var w1 = $parent.width();

				var off2 = $source.offset();
				var w2 = $source.width();

				if (parseInt(off2.left) < parseInt(off1.left)
						+ parseInt(w1 / 2))
					return 'right';
				return 'left';
			}
		});
	</script> -->
</body>
</html>