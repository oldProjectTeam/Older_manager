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

</head>

<body style="margin: 15px;">
	<div class="col-sm-12">
		<div class="row">
			<div class="col-md-12">
				<ol class="breadcrumb">
					<li>
						<b>位置：客户关系管理</b>
					</li>
					<li>沟通老人</li>
				</ol>
			</div>
		</div>

	</div>


	<!--推荐活动列表  -->
	<div class="row">
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

	<!-- 查询弹框 -->
	<div id="myModal" class="modal fade" tabindex="-1" role="dialog">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">查询</h4>
				</div>
				<div class="modal-body">
					<ul class="forminfo">
						<li>
							<label>老人的姓名</label>
							<input name="" type="text" class="dfinput" style="width:258px;" />
						</li>
						<li>
							<label>沟通的时间</label>
							<input name="" type="text" class="dfinput" style="width:75px;" />
							年
							<input name="" type="text" class="dfinput" style="width:72px;" />
							月
							<input name="" type="text" class="dfinput" style="width:72px;" />
							日
						</li>
						<li>
							<label>所属服务点</label>
							<input name="" type="text" class="dfinput" style="width:258px;" />
						</li>
						<li>
							<label>沟通人员</label>
							<input name="" type="text" class="dfinput" style="width:258px;" />
						</li>
					</ul>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary" data-dismiss="modal">查询</button>
					<button type="button" class="btn btn-default" data-dismiss="modal">返回</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<!-- /.modal -->

	<!-- 查看弹框 -->
	<div id="Modal" class="modal fade" tabindex="-1" role="dialog">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
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
							<p>
								图片：<img src="images/t02.png" />
							</p>
						</li>
						<li>
							<p>
								视频：<img src="images/t02.png" />
							</p>
						</li>
						<li>
							<p>
								录音：<img src="images/t02.png" />
							</p>
						</li>
					</ul>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">返回</button>
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
            $("#old_delete_all_btn").attr("disabled", true);
            go(1);
        });
        function go(pn, str) {
            $.ajax({
                url : "${APP_PATH}/RecomActivityDetails/findAllRecomActivityDetailsByPage",
                data : {
                    "pn" : pn
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
                    "当前第" + result.extend.pageInfo.pageNum + "页，共" + result.extend.pageInfo.pages
                            + "页，总计" + result.extend.pageInfo.total + "条记录");
            totalRecord = result.extend.pageInfo.total;
            currentNum = result.extend.pageInfo.pageNum;
        }
        //解析显示分页条信息
        function build_page_nav(result) {
            $("#page_nav").empty();
            var ul = $("<ul></ul>").addClass("pagination");
            var firstPageLi = $("<li></li>").append($("<a></a>").append("首页"));
            firstPageLi.click(function() {
                go(1);
            });
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
            var lastPageLi = $("<li></li>").append($("<a></a>").append("末页"));
            lastPageLi.click(function() {
                go(result.extend.pageInfo.pages);
            });
            if (result.extend.pageInfo.hasNextPage == false) {
                nextPageLi.addClass("disabled");
                lastPageLi.addClass("disabled");
            } else {
                //为元素添加点击翻页事件
                nextPageLi.click(function() {
                    go(result.extend.pageInfo.pageNum + 1);
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
                    go(item);
                });
                ul.append(numLi);
            });
            //添加下一页和末页的提示
            ul.append(nextPageLi).append(lastPageLi);
            //把ul加到nav 
            var navEle = $("<nav></nav>").append(ul);
            navEle.appendTo("#page_nav");
        }

        //构建数据
        function build_table_data(result) {
            $("#head").empty();
            $("#table_data").empty();
            var headTR = $("<tr></tr>");
            var checkBox = $("<td></td>").append($("<input type='checkbox' id='check_item_all'/>"));
            var Td1 = $("<td></td>").append("#");
            var Td2 = $("<td></td>").append("老人的姓名");
            var Td3 = $("<td></td>").append("沟通的时间");
            var Td4 = $("<td></td>").append("沟通的内容");
            var Td5 = $("<td></td>").append("老人所属服务点");
            var Td6 = $("<td></td>").append("沟通的人员");
            var Td7 = $("<td></td>").append("操作");
            headTR.append(checkBox).append(Td1).append(Td2).append(Td3).append(Td4).append(Td5)
                    .append(Td6).append(Td7).appendTo($("#head"));

            $.each(result.extend.pageInfo.list, function(index, item) {
                var checkBoxTd = $("<td><input type='checkbox' class='item_check'/></td>");
                var dataTd1 = $("<td></td>").append(item.id);
                var dataTd2 = $("<td></td>").append(item.recomactivity.activity.title);
                var dataTd3 = $("<td></td>").append(item.oldman.name);
                var dataTd4 = $("<td></td>").append(item.recomactivity.recompeople);
                var dataTd5 = $("<td></td>").append(item.recomactivity.state);
                var dataTd6 = $("<td></td>").append(ChangeDateFormat(item.recomtime));

                var recommandBtn = $("<button></button>").addClass(
                "btn btn-info btn-sm recommand_btn").append(
                $("<span></span>").addClass("glyphicon glyphicon-send")).append("修改");
                
                var edtBtn = $("<button></button>").addClass(
                        "btn btn-info btn-sm recommand_btn").append(
                        $("<span></span>").addClass("glyphicon glyphicon-send")).append("修改");
                var delBtn = $("<button></button>").addClass("btn btn-danger btn-sm delete_btn")
                        .append($("<span></span>").addClass("glyphicon glyphicon-trash")).append(
                                "删除");

                //为删除按钮添加一个自定义的属性，来表示当前删除员工的id
                delBtn.attr("del-id", item.id);
                var btnTd = $("<td></td>").append(recommandBtn).append(" ").append(delBtn);
                //append方法执行完成以后还是返回原来的元素							              								              
                $("<tr></tr>").append(checkBoxTd).append(dataTd1).append(dataTd2).append(dataTd3)
                        .append(dataTd4).append(dataTd5).append(dataTd6).append(btnTd).appendTo(
                                "#table_data");
            });
        }

        //点击删除
        $(document)
                .on(
                        "click",
                        ".delete_btn",
                        function() {
                            var delete_btn = $(this).attr("del-id");
                            var oldername = $(this).parents("tr").find("td:eq(2)").text();
                            if (confirm("确认删除【id为：" + delete_btn + oldername + "】吗")) {
                                $
                                        .ajax({
                                            url : "${APP_PATH}/RecomActivityDetails/deleteRecomActivityDetailsById?id="
                                                    + delete_btn,
                                            type : "DELETE",
                                            success : function(result) {
                                                if (result.code == 100) {
                                                    alert("删除成功");
                                                    go(currentNum);
                                                } else {
                                                    alert("删除失败！");
                                                }

                                            }
                                        });
                            }
                        });
        //全选
        $(document).on("click", "#check_item_all", function() {
            $(".item_check").prop("checked", $(this).prop("checked"));
            if ($("#check_item_all").prop("checked") == true) {
                $("#old_delete_all_btn").attr("disabled", false);
            } else {
                $("#old_delete_all_btn").attr("disabled", true);
            }
        });

        $(document).on("click", ".item_check", function() {
            var flag = $(".item_check:checked").length == $(".item_check").length;
            $("#check_item_all").prop("checked", flag);
            if ($(".item_check:checked").length > 0) {
                $("#old_delete_all_btn").attr("disabled", false);
            } else {
                $("#old_delete_all_btn").attr("disabled", true);
            }
        });

        //点击批量删除
        $("#old_delete_all_btn").click(function() {
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
                        url : "RecomActivityDetails/deleteRecomActivityDetailsByIdListId",
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
    </script>
</body>
</html>
