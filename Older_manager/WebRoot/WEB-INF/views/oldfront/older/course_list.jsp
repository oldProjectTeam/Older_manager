<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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

<title>课程</title>

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
<script src="${APP_PATH}/static/js/wySilder.min.js"
	type="text/javascript"></script>
<link rel="stylesheet" href="${APP_PATH}/static/css/index.css" />
</head>

<body>
	<!-- 搜索 -->
	<div style="height:300px">
		<div class="col-sm-12" style="margin-bottom:20px;">
			<ul class="list-inline">
				<li class="col-sm-4"><a href="${APP_PATH}/older/index"><img
						src="${APP_PATH}/static/images/oldback/images/logo.png"
						width="200px" style="margin-right: 240px;" /></a></li>
				<li class="col-sm-7" style="margin-top:20px"><input type="text"
					class="col-sm-8" id="key" /> <input type="button"
					class="cource_search" id="search" value="搜&nbsp;&nbsp;索"></li>
			</ul>
		</div>
		<!-- 轮播图 -->
		<div id="carousel-example-generic" class="carousel slide col-sm-12"
			data-ride="carousel">
			<ol class="carousel-indicators" id="imgOl">
			</ol>
			<div class="carousel-inner" id="imgContent"
				style="height: 360px !important;"></div>
			<a class="left carousel-control" href="#carousel-example-generic"
				role="button" data-slide="prev"> <span
				class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
				<span class="sr-only">Previous</span>
			</a> <a class="right carousel-control" href="#carousel-example-generic"
				role="button" data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				<span class="sr-only">Next</span>
			</a>
		</div>
	</div>
	<!-- 轮播图结束 -->
	<div class="col-sm-12 margin_div">
		<div class="col-sm-12 border-style">
			<span class="col-sm-12 one-text-style">推荐课程</span>
			<div class="col-sm-12" id="courseContent"></div>
		</div>
		<div class="col-sm-12 div-background">
			<span class="col-sm-6 big-text-style" style="margin-top: 50px;">不一样的线下课程与活动!!!!!</span>
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
		var currentNum, flag;
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
					currentNum = result.extend.pageInfo.pageNum;
					flag = result.extend.pageInfo.hasNextPage;
					build_img(result);
					build_recommend_course(result);
					build_course(result);
				}
			});
		}
		//轮播图
		function build_img(result) {
			$.each(result.extend.pageInfo.list, function(index, item) {
				if (index < 3) {
					var imgDiv = $("<div></div>").append(
							$("<img/>").attr(
									"src",
									"http://123.207.93.53/Older_back/"
											+ item.photo).attr("width", "100%")
									.attr("height", "150px"));
					var imgLi = $("<li></li>").attr("data-target",
							"#carousel-example-generic").attr("data-slide-to",
							index);
					if (index == 0) {
						imgDiv.addClass("item active");
						imgLi.addClass("active");
					} else {
						imgDiv.addClass("item");
					}
					$("#imgOl").append(imgLi);
					$("#imgContent").append(imgDiv);
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
							$("<img/>").addClass("img-size").attr(
									"src",
									"http://123.207.93.53/Older_back/"
											+ item.photo));
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
							$("<img/>").addClass("img-size").attr(
									"src",
									"http://123.207.93.53/Older_back/"
											+ item.photo));
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
			if (flag) {
				$("#ol").empty();
				$("#imgOl").empty();
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
						flag = result.extend.pageInfo.hasNextPage;
						build_img(result);
						build_recommend_course(result);
						build_course(result);
					}
				}
			});
		}
	</script>
</body>
</html>
