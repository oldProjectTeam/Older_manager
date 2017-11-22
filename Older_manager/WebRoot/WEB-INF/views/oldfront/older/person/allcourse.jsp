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

					<div class="main1">
						<!-- 健康数据开始 -->
						<div class="jksj">
							<div class="xy-title">
								查找课程
								<button type="button" class="btn back fr"
									onclick="javascript:history.go(-1)">返回</button>
							</div>
							<div class="row"
								style="border-bottom:solid 1px green;margin-bottom:15px;padding-bottom:10px">
								<form class="form-inline" role="form">
									<div class="form-group col-md-5">
										<label for="" class="control-label">查询条件：</label> <input
											type="text" class="form-control" placeholder="课程名称/讲师">
									</div>
									<div class="form-group col-md-3">
										<label for="" class="control-label">授课方式：</label> <select
											class="form-control">
											<option value="">请选择</option>
											<option value="线上授课">线上授课</option>
											<option value="线下授课">线下授课</option>
										</select>
									</div>
									<button id="chaxun" class="btn btn-success col-md-1">查询</button>
									<div class="form-group col-md-3">
										<button id="wjx_btn" class="btn btn-default col-md-1.5">未进行</button>
										<button id="yjk_btn" class="btn btn-default col-md-1.5">已结课</button>
									</div>

								</form>
							</div>
							<div>
								<div class="jksj">
									<div class="row" style="margin-top:20px;">
										<div class="col-md-3 text-center" id="xueya">
											<div class="course-box" style="margin-top:30px">
												<div class="course_img">
													<img src="${APP_PATH}/static/oldfront/older/images/course_img.jpg">
												</div>

												<ul class=" list-paddingleft-2">
													<li>
														<h4>
															java后端开发
															</h3>
													</li>
													<li>授课方式：<span id="diya">线上授课</span>
													</li>
													<li>讲师：<span id="gaoya">高总</span> &nbsp;开课时间：<span
														id="diya">2017-12-1</span>
													</li>
												</ul>

											</div>
										</div>
										<div class="col-md-3 text-center" id="xueya"
											style="margin-top:30px">
											<div class="course-box">
												<div class="course_img">
													<img src="${APP_PATH}/static/oldfront/older/images/course_img.jpg">
												</div>

												<ul class=" list-paddingleft-2">
													<li>
														<h4>
															java后端开发
															</h3>
													</li>
													<li>授课方式：<span id="diya">线上授课</span>
													</li>
													<li>讲师：<span id="gaoya">高总</span> &nbsp;开课时间：<span
														id="diya">2017-12-1</span>
													</li>
												</ul>

											</div>
										</div>
										<div class="col-md-3 text-center" id="xueya"
											style="margin-top:30px">
											<div class="course-box">
												<div class="course_img">
													<img src="${APP_PATH}/static/oldfront/older/images/course_img.jpg">
												</div>

												<ul class=" list-paddingleft-2">
													<li>
														<h4>
															java后端开发
															</h3>
													</li>
													<li>授课方式：<span id="diya">线上授课</span>
													</li>
													<li>讲师：<span id="gaoya">高总</span> &nbsp;开课时间：<span
														id="diya">2017-12-1</span>
													</li>
												</ul>

											</div>
										</div>
										<div class="col-md-3 text-center" id="xueya"
											style="margin-top:30px">
											<div class="course-box">
												<div class="course_img">
													<img src="${APP_PATH}/static/oldfront/older/images/course_img.jpg">
												</div>

												<ul class=" list-paddingleft-2">
													<li>
														<h4>
															java后端开发
															</h3>
													</li>
													<li>授课方式：<span id="diya">线上授课</span>
													</li>
													<li>讲师：<span id="gaoya">高总</span> &nbsp;开课时间：<span
														id="diya">2017-12-1</span>
													</li>
												</ul>
											</div>

										</div>
										<div class="col-md-3 text-center" id="xueya"
											style="margin-top:30px">
											<div class="course-box">
												<div class="course_img">
													<img src="${APP_PATH}/static/oldfront/older/images/course_img.jpg">
												</div>

												<ul class=" list-paddingleft-2">
													<li>
														<h4>
															java后端开发
															</h3>
													</li>
													<li>授课方式：<span id="diya">线上授课</span>
													</li>
													<li>讲师：<span id="gaoya">高总</span> &nbsp;开课时间：<span
														id="diya">2017-12-1</span>
													</li>
												</ul>

											</div>
										</div>
										<div class="col-md-3 text-center" id="xueya"
											style="margin-top:30px">
											<div class="course-box">
												<div class="course_img">
													<img src="${APP_PATH}/static/oldfront/older/images/course_img.jpg">
												</div>

												<ul class=" list-paddingleft-2">
													<li>
														<h4>
															java后端开发
															</h3>
													</li>
													<li>授课方式：<span id="diya">线上授课</span>
													</li>
													<li>讲师：<span id="gaoya">高总</span> &nbsp;开课时间：<span
														id="diya">2017-12-1</span>
													</li>
												</ul>

											</div>
										</div>
										<div class="col-md-3 text-center" id="xueya"
											style="margin-top:30px">
											<div class="course-box">
												<div class="course_img">
													<img src="${APP_PATH}/static/oldfront/older/images/course_img.jpg">
												</div>

												<ul class=" list-paddingleft-2">
													<li>
														<h4>
															java后端开发
															</h3>
													</li>
													<li>授课方式：<span id="diya">线上授课</span>
													</li>
													<li>讲师：<span id="gaoya">高总</span> &nbsp;开课时间：<span
														id="diya">2017-12-1</span>
													</li>
												</ul>

											</div>
										</div>
										<div class="col-md-3 text-center" id="xueya"
											style="margin-top:30px">
											<div class="course-box">
												<div class="course_img">
													<img src="${APP_PATH}/static/oldfront/older/images/course_img.jpg">
												</div>

												<ul class=" list-paddingleft-2">
													<li>
														<h4>
															java后端开发
															</h3>
													</li>
													<li>授课方式：<span id="diya">线上授课</span>
													</li>
													<li>讲师：<span id="gaoya">高总</span> &nbsp;开课时间：<span
														id="diya">2017-12-1</span>
													</li>
												</ul>
											</div>

										</div>
									</div>
									<div class="row"
										style="margin-top:40px;border-bottom:solid 1px gray">
										<div class="col-md-5">当前第 1 页，共 20 页：共计 100 条记录</div>
										<div class="col-md-7">
											<nav aria-label="Page navigation" style="float:right">
											<ul class="pagination">
												<li><a href="#" aria-label="Previous"> <span
														aria-hidden="true">&laquo;</span>
												</a></li>
												<li class="active"><a href="#">1</a></li>
												<li><a href="#">2</a></li>
												<li><a href="#">3</a></li>
												<li><a href="#">4</a></li>
												<li><a href="#">5</a></li>
												<li><a href="#" aria-label="Next"> <span
														aria-hidden="true">&raquo;</span>
												</a></li>
											</ul>
											</nav>
										</div>
									</div>
								</div>

								<!-- 健康数据结束 -->
							</div>
						</div>
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

//改变鼠标形状
  $(document).on("mousemove",".course-box",function(){
      $(this).css("cursor","pointer"); 
  });
  
   $(document).on("click",".course-box",function(){
      window.location.href="${APP_PATH}/older/course_detail" ;
  });
   
  function Login_Out() { 
      if( confirm('您确定要退出本次登录吗?')) {
         location.href = '/index.html';
       }
  };
  
</script>

</body>
</html>
