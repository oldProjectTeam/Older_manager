<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	request.setAttribute("APP_PATH", request.getContextPath());
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>智慧老人系统-课程</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${APP_PATH}/static/css/course.css" rel="stylesheet">
<script src="${APP_PATH}/static/js/jquery-3.2.1.min.js"></script>
<script
	src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js"
	type="text/javascript"></script>
<link rel="stylesheet" href="${APP_PATH}/static/css/index.css" />
<link href="${APP_PATH}/static/oldfront/css/style.css" rel="stylesheet" />
<style type="text/css" media="screen">
#ol {
	list-style: none;
}

body {
	background-color: #F4F9F4 !important;
}
</style>
</head>
<body>
	<div class="container">
		<div class="row ">
			<div class="col-md-12">
				<div class="navbar-collapse collapse">
					<ul id="menu-top"
						class="nav navbar-nav navbar-fixed-top navbar-inverse">
						<li
							style="padding-left: 15px;padding-top: 6px;padding-bottom: 6px;"><img
							src="http://gyadmin-1252357563.file.myqcloud.com/images/oldback/images/logo.png"
							width="200px" style="margin-right:150px;" /></li>
						<li><a href="${APP_PATH}/older/index"
							class="menu-top-active check">首页</a></li>
						<li><a href="${APP_PATH}/course/course_list" class="check">课程专区</a></li>
						<li><a href="${APP_PATH}/older/video_list" class="check ">视频专区</a></li>
						<li><a href="${APP_PATH}/older/activity" class="check">社区活动</a></li>
						<li><a href="${APP_PATH}/older/about" class="check">关于我们</a></li>
						<li><a href="javascript:contact()" id="contact" class="check">联系我们</a></li>
						<li><a href="${APP_PATH}/shop/oldfronthome" class="check">购物商城</a></li>
						<li style="float:right;margin-right:40px">
							<!-- 没有登录--> <c:if test="${empty older}">
								<a href="${APP_PATH}/older/login">登录</a>
							</c:if> <!--已登录  --> <c:if test="${!empty older}">
								<dropdown> <input id="toggle2" type="checkbox">
								<label for="toggle2" class="animate"><i
									class="fa fa-bars float-right" style="margin-top:10px;"></i> </label>
								<ul class="animate">
									<li class="animate" onClick="go_center()">管理中心<i
										class="fa fa-cog float-right"></i>
									</li>
									<li class="animate" onClick="exit()">退出系统<i
										class="fa fa-arrows-alt float-right"></i></li>
								</ul>
								</dropdown>
							</c:if>
						</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<div style="margin-top: 100px;" class="col-md-offset-4">
		<form id="searchForm" class="form-inline">
			<div class="form-group">
				<input type="text" placeholder="搜索课程..." class="form-control"
					id="key" name="key" style="width:400px;">
			</div>
			<button type="button" id="search" class="btn btn-success">搜索</button>
		</form>
	</div>
	<!-- 轮播图结束 -->
	<div class="col-sm-12 margin_div">
		<div class="col-sm-12 border-style">
			<span class="col-sm-12 one-text-style">推荐课程</span>
			<div class="col-sm-12" id="courseContent"></div>
		</div>
		<div class="col-sm-12 div-background">
			<span class="col-sm-6 big-text-style" style="margin-top: 50px;">不一样的线下课程与活动</span>
			<ol class="col-sm-5 ol-style" id="ol">
			</ol>
		</div>
		<!-- 开设课程 -->
		<div>
			<span class="col-sm-12 one-text-style">开设课程</span>
			<div class="col-sm-12" id="course"></div>
		</div>
		<div class="col-sm-offset-5">
			<button class="btn col-md-4" style="font-size: 16px;" id="loading">
				<span class="glyphicon glyphicon-refresh" aria-hidden="true"></span>加载更多...
			</button>
		</div>
	</div>
	<div class="col-sm-12">
		<jsp:include page="footer.jsp"></jsp:include>
	</div>
	<script type="text/javascript">
		$(function() {
			var x = document.getElementsByClassName("check");
			$(x[0]).removeClass("menu-top-active");
			$(x[1]).addClass("menu-top-active");

		});
		var currentNum, total;
		$(function() {
			go(1);
		});

		function go(pn) {
			$.ajax({
				url : "${APP_PATH}/course/queryAllCourse",
				data : {
					"pn" : pn
				},
				type : "GET",
				success : function(result) {
					console.log(result);
					if (result.code == 100) {
						currentNum = result.extend.pageInfo.pageNum;
						total = result.extend.pageInfo.pages;
						build_recommend_course(result);
						build_course(result);
					}
				}
			});
		}
		function build_recommend_course(result) {
			$.each(result.extend.pageInfo.list, function(index, item) {
				if (index < 5) {
					var outDiv = $("<div></div>").addClass("width-text");
					var a = $("<a></a>").addClass("a-style").attr("href",
							"${APP_PATH}/official/courseInfoId/" + item.id);
					var ul = $("<ul></ul>")
							.addClass("list-unstyled ul-li-text");
					var imgLi = $("<li></li>").append(
							$("<img/>").addClass("img-size").attr("src",
									item.photo));
					var title = item.title;
					if (title.length > 10) {
						title = title.substring(0, 10) + "...";
					} else {
						title = title.substring(0, 10);
					}
					var content = item.content;
					if (content.length > 20) {
						content = content.substring(0, 20) + "...";
					} else {
						content = content.substring(0, 20);
					}
					var titleLi = $("<li></li>").addClass(
							"ul_li_style text_style").append(title);
					var timeLi = $("<li></li>").addClass(
							"ul_li_style text_style").append(
							ChangeDateFormat(item.endtime));
					var contentLi = $("<li></li>").addClass(
							"ul_li_style text_style").append(content);

					ul.append(imgLi).append(titleLi).append(timeLi).append(
							contentLi);
					a.append(ul);
					outDiv.append(a).appendTo($("#course"));

					if (index < 4) {
						var olLi = $("<li></li>").addClass(
								"ul_li_style one-style").append(
								$("<a></a>").attr(
										"href",
										"${APP_PATH}/official/courseInfoId/"
												+ item.id).append(
										ChangeDateFormat(item.endtime) + ""
												+ content));
						$("#ol").append(olLi);
					}
				}
			});
		}

		function build_course(result) {
			$.each(result.extend.pageInfo.list, function(index, item) {
				if (index > 4) {
					var outDiv = $("<div></div>").addClass("width-text");
					var a = $("<a></a>").addClass("a-style").attr("href",
							"${APP_PATH}/official/courseInfoId/" + item.id);
					var ul = $("<ul></ul>")
							.addClass("list-unstyled ul-li-text");
					var imgLi = $("<li></li>").append(
							$("<img/>").addClass("img-size").attr("src",
									item.photo));
					var title = item.title;
					if (title.length > 10) {
						title = title.substring(0, 10) + "...";
					} else {
						title = title.substring(0, 10);
					}
					var content = item.content;
					if (content.length > 20) {
						content = content.substring(0, 20) + "...";
					} else {
						content = content.substring(0, 20);
					}
					var titleLi = $("<li></li>").addClass(
							"ul_li_style text_style").append(title);
					var timeLi = $("<li></li>").addClass(
							"ul_li_style text_style").append(
							ChangeDateFormat(item.endtime));
					var contentLi = $("<li></li>").addClass(
							"ul_li_style text_style").append(content);

					ul.append(imgLi).append(titleLi).append(timeLi).append(
							contentLi);
					a.append(ul);
					outDiv.append(a).appendTo($("#courseContent"));
				}
			});
		}

		function ChangeDateFormat(d) {
			//将时间戳转为int类型，构造Date类型
			if (d != null) {
				var date = new Date(parseInt(d));

				//月份得+1，且只有个位数时在前面+0
				var month = date.getMonth() + 1 + "月";

				//日期为个位数时在前面+0
				var currentDate = date.getDate() + "日";

				//getFullYear得到4位数的年份 ，返回一串字符串
				return date.getFullYear() + "年" + month + currentDate;
			} else {
				return null;
			}
		}

		$("#loading").click(function() {
			$("#imgOl").empty();
			if (currentNum + 1 < total || currentNum + 1 == total) {
				$("#ol").empty();
				if ($("#key").val() == '') {
					go(currentNum + 1);
				} else {
					search(currentNum + 1, $("#key").val());
				}
			} else {
				layer.msg("没有更多数据了....", {
					offset : [ '20%' ]
				});
			}
		});

		/* 搜索 */
		$("#search").click(function() {
			if ($("#key").val() == '') {
				layer.msg("请输入关键字再查询...", {
					offset : [ '20%' ]
				});
			} else {
				search(1, $("#key").val());
			}
		});

		function search(pn, key) {
			$.ajax({
				url : "${APP_PATH}/course/queryCourseByKeyWord",
				data : {
					"pn" : pn,
					"key" : key
				},
				type : "GET",
				success : function(result) {
					if (result.code == 100) {
						$("#ol").empty();
						$("#imgOl").empty();
						$("#courseContent").empty();
						$("#course").empty();
						currentNum = result.extend.pageInfo.pageNum;
						total = result.extend.pageInfo.pages;
						build_recommend_course(result);
						build_course(result);
					}
				}
			});
		}
	</script>
</body>
</html>
