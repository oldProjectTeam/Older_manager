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
<script src="${APP_PATH}/static/js/wySilder.min.js"
	type="text/javascript"></script>
<link rel="stylesheet" href="${APP_PATH}/static/css/index.css" />
<style type="text/css" media="screen">
html,body {
	width: 100%;
}

ul li {
	list-style: none;
}

* {
	margin: 0;
	padding: 0;
}

#box {
	width: 1200px;
	margin: 20px auto;
}

.slide {
	height: 500px;
	position: relative;
}

.slide ul {
	height: 100%;
}

.slide li {
	position: absolute;
	left: 200px;
	top: 0;
}

.slide li img {
	width: 100%;
}

.arraw {
	opacity: 0;
}

.arraw a {
	width: 70px;
	height: 110px;
	display: block;
	position: absolute;
	top: 50%;
	margin-top: -55px;
	z-index: 999;
}

.next {
	background: url(${APP_PATH}/static/images/right.png) no-repeat;
	right: -10px;
	/*opacity: .5;*/
	/*filter: alpha(opacity=50);*/
}

.prev {
	background: url(${APP_PATH}/static/images/left.png) no-repeat;
	left: -10px;
}
</style>
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#"> <img
				src="${APP_PATH}/static/images/oldback/images/logo.png"
				width="160px" />
			</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse"
			style="margin-top: 18px;">
			<form class="navbar-form navbar-right" id="searchForm">
				<div class="form-group">
					<input type="text" placeholder="搜索课程..." class="form-control"
						id="key" name="key">
				</div>
				<button type="button" id="search" class="btn btn-success">搜索</button>
			</form>
		</div>
	</div>
	</nav>

	<div id="box" style="margin-top: 70px;">
		<div class="slide">
			<ul id="imgContent">
				<c:forEach items="${pageInfo.list}" var="course">
					<li><a href="${APP_PATH}/official/courseInfoId/${course.id}"><img
							src="http://gyadmin-1252357563.file.myqcloud.com/${course.photo}"></a></li>
				</c:forEach>
			</ul>
			<div class="arraw">
				<a href="javascript:;" class="next"></a> <a href="javascript:;"
					class='prev'></a>
			</div>
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
	<script>
		var box = document.querySelector('#box');
		var slide = document.querySelector('.slide');
		var arraw = document.querySelector('.arraw');
		var lis = document.querySelectorAll('li');
		var json = [ //  包含了5张图片里面所有的样式
		{ //  1
			width : 400,
			top : 20,
			left : 100,
			opacity : 20,
			z : 2,
			id : 1
		}, { // 2
			width : 600,
			top : 70,
			left : 50,
			opacity : 60,
			z : 3,
			id : 2
		}, { // 3
			width : 800,
			top : 100,
			left : 200,
			opacity : 100,
			z : 4,
			id : 3
		}, { // 4
			width : 600,
			top : 70,
			left : 550,
			opacity : 60,
			z : 3,
			id : 4
		}, { //5
			width : 400,
			top : 20,
			left : 650,
			opacity : 20,
			z : 2,
			id : 5
		} ];
		box.addEventListener('mouseover', function() {
			// console.log('aaa')
			animate(arraw, {
				opacity : 100
			});
		});
		box.addEventListener('mouseout', function() {
			// console.log('aaa')
			animate(arraw, {
				opacity : 0
			});
		});

		var next = document.querySelector('.next');
		var prev = document.querySelector('.prev');
		var timer = null;
		var flag = true;
		next.addEventListener('click', function() {
			// alert('next');
			// console.log(json);
			// console.log('================')
			clearInterval(timer);
			if (flag == true) {
				move(true);
				flag = false;
			}
			//console.log(json);
		});
		next.addEventListener('mouseleave', function() {

			clearInterval(timer);
			//alert('next')
			run();
			//console.log(json);

		});
		prev.addEventListener('click', function() {
			clearInterval(timer);
			// alert('prev')
			if (flag == true) {
				move(false);
				flag = false;
			}
		});
		prev.addEventListener('mouseleave', function() {
			// alert('prev')
			// clearInterva(timer);
			run();
		});

		move();
		run();
		function run() {
			clearInterval(timer);
			timer = setInterval(function() {
				// console.log('run')
				if (flag == true) {
					flag = false;
					move(true);
				}
				// console.log(json)
			}, 500);
		}

		function move(x) {
			if (x != undefined) {
				if (x) {
					json.push(json.shift());
				} else {
					json.unshift(json.pop());
				}
				;
			}
			;

			for (var i = 0; i < json.length; i++) {
				animate(lis[i], {
					width : json[i].width,
					top : json[i].top,
					left : json[i].left,
					opacity : json[i].opacity,
					zIndex : json[i].z
				}, function() {
					flag = true;
				})
			}
			;
		}

		function animate(obj, json, callback) {
			// 先停止定时器
			clearInterval(obj.timers);
			obj.timers = setInterval(function() {
				var stoped = true;
				// console.log('sss')
				for ( var k in json) {
					// var leader = parseInt(getStyle(obj, k));
					var leader = 0;
					if (k == 'opacity') {
						leader = Math.round(getStyle(obj, k) * 100) || 100;
					} else {
						// console.log(json[k]);
						leader = parseInt(getStyle(obj, k)) || 0;
					}
					;
					//         console.log(leader);
					// json[k]是目标位置
					var step = (json[k] - leader) / 10;
					step = step > 0 ? Math.ceil(step) : Math.floor(step);
					leader = leader + step;
					if (k == 'opacity') {
						obj.style[k] = leader / 100;
						obj.style['filter'] = 'alpha(opacity=' + leader + ')';
					} else if (k == 'zIndex') {
						obj.style['zIndex'] = json[k];
					} else {
						obj.style[k] = leader + "px";
					}
					if (leader != json[k]) {
						stoped = false;
					}
				}
				;
				if (stoped) {
					// console.log('stop')
					clearInterval(obj.timers);
					callback && callback();
				}
				;
			}, 50);
		};
		//获取属性值
		function getStyle(obj, attr) {
			if (obj.currentStyle) {
				return obj.currentStyle[attr];
			} else {
				return window.getComputedStyle(obj, null)[attr];
			}
			;
		};
	</script>
	<script type="text/javascript">
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
							$("<img/>").addClass("img-size").attr(
									"src",
									"http://gyadmin-1252357563.file.myqcloud.com/"
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
									"http://gyadmin-1252357563.file.myqcloud.com/"
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
			$("#imgOl").empty();
			if (currentNum + 1 < total || currentNum + 1 == total) {
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
