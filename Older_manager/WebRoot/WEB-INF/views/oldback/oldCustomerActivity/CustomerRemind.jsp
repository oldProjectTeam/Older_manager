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

<title>My JSP 'CustomerActivity.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<!-- 引入jquery -->
<script type="text/javascript" src="${APP_PATH}/static/js/jquery-3.2.1.min.js"></script>
<!-- 引入样式 -->

<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src="${APP_PATH}/lib/layer/2.4/layer.js"></script>
</head>
<body style="margin: 15px;">
	<div class="col-sm-12">
		<div class="row">
			<div class="col-md-12">
				<ol class="breadcrumb">
					<li>
						<b>位置：客户关系管理</b>
					</li>
					<li>提醒记录</li>
				</ol>
			</div>
		</div>

		<!--条件查询  -->
		<div class="row form-inline" style="margin-top:5px">
			<div class="col-md-12">
				回访人员：
				<input type="text" class="form-control" id="remindPeople" placeholder="请输入回访人员名字" style="margin-right: 10px"
					onchange="checkStr(this.value)">
				未访问天数：
				<input type="text" class="form-control" id="days" onkeydown="onlyNum();" placeholder="请输入未访问天数"
					style=" margin-right: 10px;  ime-mode:Disabled" onchange="checknumber(this.value)">
				<button class="btn btn-info" id="search">
					<span class="glyphicon glyphicon-search"></span> 查询
				</button>

			</div>

		</div>

		<!--提醒信息列表  -->
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
			<div class="col-md-4 col-md-offset-1" id="page_nav"></div>
		</div>





		<script type="text/javascript">
            var totalRecord, currentNum;
            $(function() {
                layer.load(2);
                go(1);
            });
            function go(pn) {
                $.ajax({
                    url : "plan/findAllVisitPlan",
                    data : "pn=" + pn,
                    type : "GET",
                    success : function(result) {
                        setTimeout(function() {
                            layer.closeAll('loading');
                        }, 500);
                        if (result.code == 100) {
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
                        go(result.extend.pageInfo.pageNum - 1);
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
                    if (code == 1) {
                        nextPageLi.click(function() {
                            search(result.extend.pageInfo.pageNum + 1);
                        });
                    } else {
                        nextPageLi.click(function() {
                            go(result.extend.pageInfo.pageNum + 1);
                        });
                    }

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

                var Td1 = $("<td></td>").append("编号");
                var Td2 = $("<td></td>").append("老人的姓名");
                var Td3 = $("<td></td>").append("上次回访的时间");
                var Td4 = $("<td></td>").append("上次回访的内容");
                var Td5 = $("<td></td>").append("上次回访人员");
                var Td6 = $("<td></td>").append("未访问的天数");
                var Td8 = $("<td></td>").append("老人所属服务点");
                var Td7 = $("<td></td>").append("操作");
                headTR.append(checkBox).append(Td1).append(Td2).append(Td3).append(Td4).append(Td5)
                        .append(Td6).append(Td8).append(Td7).appendTo($("#head"));

                $.each(result.extend.pageInfo.list,
                        function(index, item) {

                            var dataTR = $("<tr></tr>");
                            var checkBoxData = $("<td></td>").addClass("text-center").append(
                                    $("<input type='checkbox'/>").addClass("item_check"));
                            var dataTd1 = $("<td></td>").append(item.id);
                            var dataTd2 = $("<td></td>").append(item.oldman.name);
                            var dataTd3 = $("<td></td>").append(ChangeDateFormat(item.actualtime));
                            var dataTd4 = $("<td></td>").append(item.visitrecord);
                            var dataTd5 = $("<td></td>").append(item.remindpeople);
                            var dataTd6 = $("<td></td>").append(timeDifference(item.actualtime));
                            var dataTd8 = $("<td></td>").append(item.oldman.service);
                            var edit_btn = $("<button type='button'></button>").addClass(
                                    "btn btn-sm btn-info courseview-btn").append(
                                    $("<span></span>").addClass("glyphicon glyphicon-pencil"))
                                    .append("修改");
                            var find_btn = $("<button type='button'></button>").addClass(
                                    "btn btn-sm btn-success  courseview-btn").append(
                                    $("<span></span>").addClass("glyphicon glyphicon-search"))
                                    .append("查看");
                            var delet_btn = $("<button type='button'></button>").addClass(
                                    "btn btn-sm btn-danger").append(
                                    $("<span></span>").addClass("glyphicon glyphicon-trash"))
                                    .append("删除");
                            edit_btn.attr("noticeId", item.id);
                            find_btn.attr("noticeId", item.id);
                            delet_btn.attr("noticeId", item.id);
                            delet_btn.attr("noticetitle", item.title);

                            //单个item查看事件,使用模态框弹出信息
                            find_btn.click(function() {
                                window.location.href = "plan/intoVisitPlanDetail?id=" + find_btn.attr("noticeId");
                            });
                            
                            //编辑信息按钮，弹出模态框
                            edit_btn.click(function() {
                                window.location.href = "plan/intoEditVisiPlan?id="
                                        + edit_btn.attr("noticeId");
                            });

                            //单个item删除事件
                            delet_btn.click(function() {
                                if (confirm("确认删除【" + "id=" + delet_btn.attr("noticeId") + ",标题为 "
                                        + delet_btn.attr("noticetitle") + "】的通知吗?")) {
                                    //确认,发送ajax请求即可
                                    $.ajax({
                                        url : "notice/deleteNoticeById/",
                                        data : {
                                            "id" : delet_btn.attr("noticeId")
                                        },
                                        type : "GET",
                                        success : function(result) {
                                            if (result.code == 100) {
                                                layer.open({
                                                    title:'删除提示',
                                                    content:result.extend.msg
                                                });
                                                //回到本页
                                                go(currentNum);
                                            } else {
                                                layer.open({
                                                    title:'删除提示',
                                                    content:result.extend.msg
                                                });
                                            }

                                        }
                                    });
                                }
                            });

                            dataTR.append(checkBoxData).append(dataTd1).append(dataTd2).append(
                                    dataTd3).append(dataTd4).append(dataTd5).append(dataTd6)
                                    .append(dataTd8).append(
                                            $("<td></td>").append(edit_btn).append("&nbsp;&nbsp")
                                                    .append(find_btn).append("&nbsp;&nbsp;")
                                                    .append(delet_btn)).appendTo($("#table_data"));
                        });
            }
            
            //全选
            $(document).on("click", "#check_item_all", function() {
                $(".item_check").prop("checked", $(this).prop("checked"));
            });

            //点击保存按钮，修改通知信息
            $("#editnotice_button").click(
                    function() {
                        var time = $("#time").val();
                        var releasepeople = $("#releasepeople").val();
                        var type = $("#type").val();
                        var content = $("#content").val();
                        var title = $("#title").val();
                        if (title == '' || releasepeople == '' || type == '' || content == ''
                                || time == '') {
                            layer.open({
                                title:'数据填写提示',
                                content:'请填写完整信息再发布'
                            });
                        } else {
                            $.ajax({
                                url : "${APP_PATH}/notice/updateNotice",
                                type : "post",
                                data : $("#noticeForm").serialize(),
                                success : function(result) {
                                    if (result.code == 100) {
                                        layer.open({
                                            title:'修改提示',
                                            content:'修改成功！'
                                        });
                                        //1.关闭模态框
                                        $("#activity_edit_modal").modal('hide');
                                        //2.重新加载当页
                                        go(currentNum);
                                    } else {
                                        layer.open({
                                            title:'修改提示',
                                            content:'修改失败，请再重试一遍吧！'
                                        });
                                        //$("#activity_edit_modal").modal('hide');
                                    }
                                }
                            });
                        }

                    });

            //点击批量删除
            $("#delete_all_but").click(function() {
                var empNames = "";
                var del_idstr = "";
                var del_idshow = "";
                $.each($(".item_check:checked"), function(index, item) {
                    empNames += $(item).parents("tr").find("td:eq(4)").text() + ",";
                    del_idshow += $(item).parents("tr").find("td:eq(1)").text() + ",";
                    del_idstr += $(item).parents("tr").find("td:eq(1)").text() + "-";
                });
                empNames = empNames.substring(0, empNames.length - 1);
                del_idstr = del_idstr.substring(0, del_idstr.length - 1);
                if (empNames != null && empNames.length != 0) {
                    if (confirm("确认删除【id为" + del_idshow + " ，标题为：" + empNames + "】的公告吗?")) {
                        //发送ajax请求删除
                        $.ajax({
                            url : "notice/delectNoticeByListId/",
                            data : {
                                "listId" : del_idstr
                            },
                            type : "GET",
                            success : function(result) {
                                if (result.code == 100) {
                                    layer.open({
                                        title:'修改提示',
                                        content:result.extend.msg
                                    });
                                    go(currentNum);
                                }
                            }
                        });
                    }
                } else {
                    layer.open({
                        title:'修改提示',
                        content:'请选择要删除的公告！'
                    });
                }

            });

            //新增按钮
            $("#addvideo_btn").click(function() {
                location.href = "sendnotice";
            });

            //搜索按钮
            $("#search").click(function() {
                search(1);
            });

            function search(pn) {
                var remindPeople = $('#remindPeople').val();//获取值
                var days = $('#days').val();

                if (remindPeople.length == 0 && days.length == 0) {
                    layer.open({
                        title : '搜索提示',
                        content : '请输入搜索数据！'
                    });
                    go(1);
                } else {
                    layer.load(2);
                    $.ajax({
                        url : "plan/findAllVisitPlanBySearch",
                        data : {
                            "visitPeople" : remindPeople,
                            "days" : days,
                            "pn" : pn
                        },
                        type : "get",
                        success : function(result) {
                            setTimeout(function() {
                                layer.closeAll('loading');
                            }, 500);
                            if (result.code == 100) {
                                if (result.extend.pageInfo.list == '') {
                                    layer.open({
                                        title : '搜索提示',
                                        content : '查询不到相关数据！'
                                    });
                                } else {
                                    //构建分页信息
                                    build_page_text(result);
                                    //构建分页条
                                    build_page_nav(result, 1);
                                    //构建表格数据
                                    build_table_data(result);
                                }

                            } else {
                                layer.open({
                                    title : '搜索提示',
                                    content : result.extend.msg
                                });
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
            function ChangeDateFormat2(d) {
                //将时间戳转为int类型，构造Date类型
                if (d != null) {
                    var date = new Date(parseInt(d));

                    //月份得+1，且只有个位数时在前面+0
                    var month = date.getMonth() + 1 + "-";

                    //日期为个位数时在前面+0
                    var currentDate = date.getDate();

                    var currenthours = date.getHours();

                    var currentminut = date.getMinutes();

                    var currentSeconds = date.getSeconds();
                    //getFullYear得到4位数的年份 ，返回一串字符串
                    return date.getFullYear() + "-" + month + currentDate + " " + currenthours
                            + ":" + currentminut + ":" + currentSeconds;
                } else {
                    return null;
                }
            }
            function timeDifference(str) {
                // Math.ceil(count / pagesize); //向上整除 4/3=2;
                //Math.floor(count / pagesize); //向下整除 4/3=1;
                var timestamp1 = Date.parse(new Date());
                var difference = Math.ceil((timestamp1 - str) / (3600 * 24000));
                return difference + " 天";
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

            function checknumber(str) {
                // [\u4E00-\uFA29]|[\uE7C7-\uE7F3]|[a-zA-Z0-9]汉字编码范围 
                var re1 = new RegExp("^d{0,4}$");
                if (re1.test(str)) {
                    layer.open({
                        title : '输入提示',
                        content : '只能输入1~4位的数字'
                    });
                    return false;
                } else {
                    return true;
                }
            }

            function onlyNum() {
                if (!(event.keyCode == 46) && !(event.keyCode == 8) && !(event.keyCode == 37)
                        && !(event.keyCode == 39))
                    if (!((event.keyCode >= 48 && event.keyCode <= 57) || (event.keyCode >= 96 && event.keyCode <= 105)))
                        event.returnValue = false;
            }
        </script>
</body>
</html>
