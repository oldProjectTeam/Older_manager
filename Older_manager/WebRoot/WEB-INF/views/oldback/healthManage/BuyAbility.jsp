<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<meta name="keywords" content="keyword1,keyword2,keyword3">
<meta name="description" content="this is my page">
<meta name="content-type" content="text/html; charset=UTF-8">
<!-- 引入jquery -->
<script type="text/javascript" src="${APP_PATH}/static/js/jquery-3.2.1.min.js"></script>
<!-- 引入样式 -->
<script src="${APP_PATH}/lib/layer/2.4/layer.js"></script>
<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="col-sm-12">
		<!--路劲导航  -->
		<div class="row">
			<div class="col-md-12">
				<ol class="breadcrumb">
					<li>
						<b>位置：客户关系管理</b>
					</li>
					<li class="active">购买能力</li>

				</ol>
			</div>
		</div>

		<!--条件查询  -->
		<div class="row form-inline" style="margin-top:5px">

			<div class="col-md-12">
				老人姓名：
				<input type="text" class="form-control" id="oldManName" placeholder="请输入老人名字" style="margin-right: 10px"
					onchange="checkStr(this.value)">
				购买能力：
				<select class="form-control" style="margin-right: 10px" id="buyAblity">
					<option>请选择</option>
					<option>高</option>
					<option>中</option>
					<option>低</option>
				</select>

				<button class="btn btn-info" id="search">
					<span class="glyphicon glyphicon-search"></span> 查询
				</button>

			</div>

		</div>

		<!--老人购买列表  -->
		<div class="row" style="margin-top:10px">
			<div class="col-md-12">
				<div class="table-responsive">
					<table class="table table-hover table-bordered text-center">
						<thead id="head">
						</thead>
						<tbody id="table_data">
						</tbody>
						<thead>
					</table>
				</div>
			</div>
		</div>
		<!--分页信息  -->
		<div class="row">
			<div class="col-md-7" id="page_text">&nbsp;&nbsp;</div>
			<div class="col-md-5" id="page_nav"></div>
		</div>

		<!-- 新增模态框 -->
		<div class="modal fade" tabindex="-1" role="dialog" id="add_modal">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h4 class="modal-title">新增手术信息</h4>
					</div>
					<div class="modal-body">
						<form class="form-inline" id="add_activity_form">
							<div class="">
								<table class="table table-bordered table-hover">

									<tr>
										<td>老人姓名</td>
										<td><select id="oldman_name" class="form-control" name="oldmanId">
												<option>张三</option>
												<option>李四</option>
											</select></td>
										<td>手术名称</td>
										<td><input name="remak" type="text" class="form-control"></td>
									</tr>
									<tr>

										<td>手术时间</td>
										<td><input name="taketime" type="date" class="form-control"></td>
										<td>医院名称</td>
										<td><input name="taketime" type="date" class="form-control"></td>
									</tr>
									<tr>
										<td>备注</td>
										<td colspan="3"><input name="remak" type="text" class="form-control"></td>
									</tr>


								</table>
							</div>
						</form>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
						<button type="button" class="btn btn-primary" id="save_activities_btn">保存</button>
					</div>
				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal-dialog -->
		</div>
		<!-- /.modal -->

		<!-- 修改模态框 -->
		<div class="modal fade" tabindex="-1" role="dialog" id="update_modal">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h4 class="modal-title">修改手术信息</h4>
					</div>
					<div class="modal-body">
						<form class="form-inline" id="add_activity_form">
							<div class="">
								<table class="table table-bordered table-hover">

									<tr>
										<td>老人姓名</td>
										<td>张三</td>
										<td>手术名称</td>
										<td><input name="remak" type="text" class="form-control"></td>
									</tr>
									<tr>

										<td>手术时间</td>
										<td><input name="taketime" type="date" class="form-control"></td>
										<td>医院名称</td>
										<td><input name="taketime" type="text" class="form-control"></td>
									</tr>
									<tr>

										<td>备注</td>
										<td colspan="3"><input name="remak" type="text" class="form-control"></td>
									</tr>


								</table>
							</div>
						</form>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
						<button type="button" class="btn btn-primary" id="save_activities_btn">更新</button>
					</div>
				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal-dialog -->
		</div>
		<!-- /.modal -->



		<script type="text/javascript">
            var totalRecord, currentNum;
            /* 分页 */
            $(function() {
                layer.load(2);
                go(1);
            });
            function go(pn) {
                $.ajax({
                    url : "Course/getCoursePage",
                    data : "pn=" + pn,
                    type : "GET",
                    success : function(result) {
                        setTimeout(function() {
                            layer.closeAll('loading');
                        }, 500);
                        if (result.code == 100) {
                            //console.log(result.extend.pageInfo);
                            //构建分页信息
                            build_page_text(result);
                            //构建分页条
                            build_page_nav(result, 0);
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
                currentNum = result.extend.pageInfo.pageNum;
            }
            //解析显示分页条信息
            function build_page_nav(result, code) {
                var firstPageLi;
                var lastPageLi;
                $("#page_nav").empty();
                var ul = $("<ul></ul>").addClass("pagination");
                if (code == 1) {
                    firstPageLi = $("<li></li>").append(
                            $("<a></a>").append("首页").attr("href", "javascript:search(1)"));
                } else {
                    firstPageLi = $("<li></li>").append(
                            $("<a></a>").append("首页").attr("href", "javascript:go(1)"));
                }

                var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
                if (result.extend.pageInfo.hasPreviousPage == false) {
                    firstPageLi.addClass("disabled");
                    prePageLi.addClass("disabled");
                } else {
                    //为元素添加点击翻页事件
                    prePageLi.click(function() {
                        if (code == 1) {
                            search(result.extend.pageInfo.pageNum - 1);
                        } else {
                            go(result.extend.pageInfo.pageNum - 1);
                        }

                    });
                }
                var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
                if (code == 1) {
                    lastPageLi = $("<li></li>").append(
                            $("<a></a>").append("末页").attr("href",
                                    "javascript:search(" + result.extend.pageInfo.pages + ")"));
                } else {
                    lastPageLi = $("<li></li>").append(
                            $("<a></a>").append("末页").attr("href",
                                    "javascript:go(" + result.extend.pageInfo.pages + ")"));
                }

                if (result.extend.pageInfo.hasNextPage == false) {
                    nextPageLi.addClass("disabled");
                    lastPageLi.addClass("disabled");
                } else {
                    //为元素添加点击翻页事件
                    nextPageLi.click(function() {
                        if (code == 1) {
                            search(result.extend.pageInfo.pageNum + 1);
                        } else {
                            go(result.extend.pageInfo.pageNum + 1);
                        }

                    });
                }
                //添加首页和前一页的提示
                ul.append(firstPageLi).append(prePageLi);
                //遍历给ul中添加页码提示
                $.each(result.extend.pageInfo.navigatepageNums, function(index, item) {
                    var numLi = $("<li></li>").append($("<a></a>").append(item));
                    if (result.extend.pageInfo.pageNum == item) {
                        numLi.addClass("active");
                    }
                    numLi.click(function() {
                        if (code == 1) {
                            search(item);
                        } else {
                            go(item);
                        }

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
                var checkBox = $("<td></td>").append(
                        $("<input type='checkbox' id='check_item_all'/>"));

                var Td1 = $("<td></td>").append("id");
                var Td2 = $("<td></td>").append("老人姓名");
                var Td3 = $("<td></td>").append("当前积分");
                var Td4 = $("<td></td>").append("每月平均消费金额");
                var Td5 = $("<td></td>").append("老人的星级");
                var Td6 = $("<td></td>").append("购买能力");
                var Td7 = $("<td></td>").append("活跃状态");
                var Td8 = $("<td></td>").append("备注");
                var Td9 = $("<td></td>").append("操作");
                headTR.append(checkBox).append(Td1).append(Td2).append(Td3).append(Td4).append(Td5)
                        .append(Td6).append(Td7).append(Td8).append(Td9).appendTo($("#head"));

                $
                        .each(
                                result.extend.pageInfo.list,
                                function(index, item) {

                                    var dataTR = $("<tr></tr>");
                                    var checkBoxData = $("<td></td>").addClass("text-center")
                                            .append(
                                                    $("<input type='checkbox'/>").addClass(
                                                            "item_check"));
                                    var dataTd1 = $("<td></td>").append(item.id);
                                    var dataTd2 = $("<td></td>").append(item.title);
                                    var dataTd3 = $("<td></td>").append(item.teachingway);
                                    var dataTd4 = $("<td></td>").append(item.teacher);
                                    var dataTd5 = $("<td></td>").append(item.limitnumber);
                                    var dataTd6 = $("<td></td>").append(
                                            ChangeDateFormat(item.bytime));
                                    var dataTd7 = $("<td></td>").append(
                                            ChangeDateFormat(item.starttime));
                                    var dataTd8 = $("<td></td>").append(
                                            ChangeDateFormat(item.endtime));

                                    var edit_btn = $("<button type='button'></button>").addClass(
                                            "btn btn-success btn-sm update-btn").append(
                                            $("<span></span>").addClass(
                                                    "glyphicon glyphicon-pencil")).append("修改");
                                    var find_btn = $("<button type='button'></button>").addClass(
                                            "btn btn-info btn-sm courseview-btn").append(
                                            $("<span></span>").addClass(
                                                    "glyphicon glyphicon-search")).append("查看");
                                    /*  var del_btn = $("<button type='button'></button>").addClass(
                                             "btn btn-danger btn-sm").append(
                                             $("<span></span>").addClass("glyphicon glyphicon-trash"))
                                             .append("删除"); */
                                    find_btn.attr("courseId", item.id);

                                    /*  del_btn.attr("courseId", item.id); */
                                    /* del_btn.attr("courseTitle", item.title); */
                                    //单个item查看事件
                                    find_btn.click(function() {
                                        window.location.href = "Course/findCoursesByid?id="
                                                + find_btn.attr("courseId") + "&way=0";

                                    });

                                    //单个item修改事件
                                    edit_btn.click(function() {
                                        window.location.href = "Course/findCoursesByid?id="
                                                + find_btn.attr("courseId") + "&way=1";

                                    });

                                    //单个item删除事件
                                    /*  del_btn.click(function() {
                                         if (confirm("确认删除【" + "id=" + del_btn.attr("courseId") + ",课程名称为 "
                                                 + del_btn.attr("courseTitle") + "】的课程数据吗?")) {
                                             //确认,发送ajax请求即可
                                             $.ajax({
                                                 url : "Course/delectCourseById/",
                                                 data : {
                                                     "id" : del_btn.attr("courseId")
                                                 },
                                                 type : "GET",
                                                 success : function(result) {
                                                     alert(result.msg);
                                                     //回到本页
                                                     go(currentNum);
                                                 }
                                             });
                                         }
                                     }); */
                                    dataTR
                                            .append(checkBoxData)
                                            .append(dataTd1)
                                            .append(dataTd2)
                                            .append(dataTd3)
                                            .append(dataTd4)
                                            .append(dataTd5)
                                            .append(dataTd6)
                                            .append(dataTd7)
                                            .append(dataTd8)
                                            .append(
                                                    $("<td></td>").append(edit_btn).append(
                                                            "&nbsp;&nbsp;&nbsp;&nbsp;").append(
                                                            find_btn).append(
                                                            "&nbsp;&nbsp;&nbsp;&nbsp;")/* .append(
                                                                                                                                                                                                                                            del_btn) */)
                                            .appendTo($("#table_data"));
                                    edit_btn.click(function() {

                                    });
                                });
            }

            //全选
            $(document).on("click", "#check_item_all", function() {
                $(".item_check").prop("checked", $(this).prop("checked"));
            });
            //点击批量删除
            $("#course_delete_all_btn").click(function() {
                //$(".check_item:checked")
                var empNames = "";
                var del_idstr = "";
                $.each($(".item_check:checked"), function(index, item) {
                    empNames += $(item).parents("tr").find("td:eq(2)").text() + ",";
                    //组装员工ID的字符串
                    del_idstr += $(item).parents("tr").find("td:eq(1)").text() + "-";
                });
                //去除empNames多余的,
                empNames = empNames.substring(0, empNames.length - 1);
                del_idstr = del_idstr.substring(0, del_idstr.length - 1);
                if (empNames != null && empNames.length != 0) {
                    if (confirm("确认删除【" + empNames + "】吗?")) {
                        //发送ajax请求删除
                        $.ajax({
                            url : "Course/delectCourseByListId/",
                            data : {
                                "listId" : del_idstr
                            },
                            type : "GET",
                            success : function(result) {
                                if (result.code == 100) {
                                    alert(result.msg);
                                    go(currentNum);
                                }
                                //回到当前页

                            }
                        });
                    }
                } else {
                    alert("请选择要删除的课程！");
                }
            });

            //新增模态框
            $("#add_btn").click(function() {
                $("#add_modal").modal();
            });

            //编辑模态框
            $("#update-btn").click(function() {
                $("#update_modal").modal();
            });

            //新增按钮
            $("#addcourse_btn").click(function() {
                location.href = "${APP_PATH }/Course/addcourse/";
            });
            //修改按钮
            $(".update-btn").click(function() {
                window.location.href = "static/oldback/educationManage/updatecourse.jsp";
            });
            //查看按钮
            $(".courseview-btn").click(function() {
                window.location.href = "static/oldback/educationManage/courseview.jsp";
            });

            //搜索按钮
            $("#search").click(function() {
                search(1);
            });
            function search(pn) {
                var oldManName = $('#oldManName').val();//获取值
                var buyAblity = $('#buyAblity').val();
                if (oldManName.length == 0 && buyAblity == '请选择') {
                    layer.open({
                        title : '搜索提示',
                        content : '没有输入数据，无法进行查询操作，请填写数据'
                    });
                    go(1);
                } else {
                    layer.load(2);
                    $.ajax({
                        url : "Course/findAllCoursesByCourseName",
                        data : {
                            "CoursesName" : coursename,
                            "teacher" : Teacher,
                            "pn" : pn
                        },
                        type : "get",
                        success : function(result) {
                            setTimeout(function() {
                                layer.closeAll('loading');
                            }, 500);
                            if (result.code == 100) {
                                //console.log(result.extend.pageInfo);
                                //构建分页信息
                                build_page_text(result);
                                //构建分页条
                                build_page_nav(result, 1);
                                //构建表格数据
                                build_table_data(result);

                            }
                        }
                    });
                }

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

            function checkStr(str) {
                // [\u4E00-\uFA29]|[\uE7C7-\uE7F3]|[a-zA-Z0-9]汉字编码范围 
                var re1 = new RegExp("^([\u4E00-\uFA29]|[\uE7C7-\uE7F3])*$");
                if (!re1.test(str)) {
                    layer.open({
                        title : '输入提示',
                        content : '请输入中文'
                    });
                    return false;
                } else {
                    return true;
                }
            }
        </script>
</body>
</html>
