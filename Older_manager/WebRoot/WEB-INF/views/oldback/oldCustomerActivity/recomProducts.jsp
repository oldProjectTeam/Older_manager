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
					<li>推荐商品</li>
				</ol>
			</div>
		</div>


		<!-- 老人列表弹窗 -->
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h4 class="modal-title" id="myModalLabel">老人列表</h4>
					</div>
					<div>
						<table class="tablelist">
							<thead>
								<tr>
									<th><input name="" type="checkbox" value="" id="active" /></th>
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
									<td><input name="" type="checkbox" value="" class="actived" /></td>
									<td>12345</td>
									<td>王金平</td>
									<td>男</td>
									<td>78岁</td>
									<td>独居老人</td>
									<td>无</td>
									<td>无</td>
									<td>无</td>
									<td>5级</td>
									<td><a href="#" class="tablelink">查看</a></td>
								</tr>
								<tr>
									<td><input name="" type="checkbox" value="" class="actived" /></td>
									<td>12345</td>
									<td>王金平</td>
									<td>男</td>
									<td>78岁</td>
									<td>独居老人</td>
									<td>无</td>
									<td>无</td>
									<td>无</td>
									<td>5级</td>
									<td><a href="#" class="tablelink">查看</a></td>
								</tr>
								<tr>
									<td><input name="" type="checkbox" value="" class="actived" /></td>
									<td>12345</td>
									<td>王金平</td>
									<td>男</td>
									<td>78岁</td>
									<td>独居老人</td>
									<td>无</td>
									<td>无</td>
									<td>无</td>
									<td>5级</td>
									<td><a href="#" class="tablelink">查看</a></td>
								</tr>
								<tr>
									<td><input name="" type="checkbox" value="" class="actived" /></td>
									<td>12345</td>
									<td>王金平</td>
									<td>男</td>
									<td>78岁</td>
									<td>独居老人</td>
									<td>无</td>
									<td>无</td>
									<td>无</td>
									<td>5级</td>
									<td><a href="#" class="tablelink">查看</a></td>
								</tr>
								<tr>
									<td><input name="" type="checkbox" value="" class="actived" /></td>
									<td>12345</td>
									<td>王金平</td>
									<td>男</td>
									<td>78岁</td>
									<td>独居老人</td>
									<td>无</td>
									<td>无</td>
									<td>无</td>
									<td>5级</td>
									<td><a href="#" class="tablelink">查看</a></td>
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

	<div class="row">
		<div class="col-md-6">
			&nbsp;
			<button type="button" class="btn btn-primary" id="add_old_btn">
				<span class="glyphicon glyphicon-plus" aria-hidden="true"></span> 新增
			</button>
			<button type="button" class="btn btn-danger" id="delete_all_btn">
				<span class="glyphicon glyphicon-trash" aria-hidden="true"></span> 批量删除
			</button>

		</div>
	</div>
	<!--条件查询  -->
	<div class="row form-inline" style="margin-top:5px">

		<div class="col-md-12">
			推荐人：
			<input type="text" class="form-control" id="recomPeople" placeholder="请输入推荐人名字" style="margin-right: 10px"
				onchange="checkStr(this.value)">
			老人名称：
			<input type="text" class="form-control" id="recomOldManName" placeholder="请输入老人姓名" style="margin-right: 10px"
				onchange="checkStr(this.value)">
			推荐状态：
			<select id="recomResult" class="form-control" style="margin-right: 10px">
				<option>请选择</option>
				<option>未推荐</option>
				<option>已推荐</option>
			</select>
			<!-- 老人星级：
			<select id="type1" class="form-control" style="margin-right: 10px">
				<option>请选择</option>
				<option>1</option>
				<option>2</option>
				<option>3</option>
				<option>4</option>
				<option>5</option>
			</select> -->
			<button class="btn btn-info" id="search">
				<span class="glyphicon glyphicon-search"></span> 查询
			</button>

		</div>

	</div>

	<!--推荐商品列表  -->
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

	<!-- 查询弹框 -->
	<div id="Modal" class="modal fade" tabindex="-1" role="dialog">
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
							<label>商品名称</label>
							<input name="" type="text" class="dfinput" style="width:258px;" />
						</li>
						<li>
							<label>老人的姓名</label>
							<input name="" type="text" class="dfinput" style="width:258px;" />
						</li>
						<li>
							<label>商品的星级</label>
							<input name="" type="text" class="dfinput" style="width:58px;" />
							&nbsp;级
						</li>
						<li>
							<label>老人的星级</label>
							<input name="" type="text" class="dfinput" style="width:58px;" />
							&nbsp;级
						</li>
						<li>
							<label>推荐人</label>
							<input name="" type="text" class="dfinput" style="width:258px;" />
						</li>
						<li>
							<label>推荐状态</label>
							<label class="radio-inline">
								<input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1">
								已推荐
							</label>
							<label class="radio-inline">
								<input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2">
								未推荐
							</label>
							<label class="radio-inline">
								<input type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option3">
								所有
							</label>
							<!-- <label>推荐状态</label>
								<input name="" type="text" class="dfinput"  style="width:258px;"/> -->
						</li>
						<li>
							<label>推荐时间</label>
							<input name="" type="text" class="dfinput" style="width:75px;" />
							年
							<input name="" type="text" class="dfinput" style="width:72px;" />
							月
							<input name="" type="text" class="dfinput" style="width:72px;" />
							日
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

	<script type="text/javascript">
        var totalRecord, currentNum;
        /* 分页 */
        $(function() {
            layer.load(2);
            go(1);
        });
        function go(pn) {
            $.ajax({
                url : "RecomProductsDetails/findAllRecomProductsDetailsByPage",
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
                    "当前第" + result.extend.pageInfo.pageNum + "页，共" + result.extend.pageInfo.pages
                            + "页，总计" + result.extend.pageInfo.total + "条记录");
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
            var checkBox = $("<td></td>").append($("<input type='checkbox' id='check_item_all'/>"));

            var Td1 = $("<td></td>").append("id");
            var Td2 = $("<td></td>").append("商品名称");
            var Td3 = $("<td></td>").append("老人的姓名");
            var Td4 = $("<td></td>").append("商品的星级");
            var Td5 = $("<td></td>").append("老人的星级");
            var Td6 = $("<td></td>").append("推荐人");
            var Td7 = $("<td></td>").append("推荐状态");
            var Td8 = $("<td></td>").append("推荐时间");
            var Td9 = $("<td></td>").append("操作");
            headTR.append(checkBox).append(Td1).append(Td2).append(Td3).append(Td4).append(Td5)
                    .append(Td6).append(Td7).append(Td8).append(Td9).appendTo($("#head"));

            $.each(result.extend.pageInfo.list, function(index, item) {

                var dataTR = $("<tr></tr>");
                var checkBoxData = $("<td></td>").addClass("text-center").append(
                        $("<input type='checkbox'/>").addClass("item_check"));
                var dataTd1 = $("<td></td>").append(item.id);
                var dataTd2 = $("<td></td>").append(item.recomProducts.products.name);
                var dataTd3 = $("<td></td>").append(item.oldman.name);
                var dataTd4 = $("<td></td>").append(item.recomProducts.products.state);
                var dataTd5 = $("<td></td>").append(item.oldman.type);
                var dataTd6 = $("<td></td>").append(item.recomProducts.recompeople);
                var dataTd7 = $("<td></td>").append(item.result);
                var dataTd8 = $("<td></td>").append(ChangeDateFormat2(item.recomtime));

                var edit_btn = $("<button type='button'></button>").addClass(
                        "btn btn-success btn-sm update-btn").append(
                        $("<span></span>").addClass("glyphicon glyphicon-pencil")).append("修改");
                var find_btn = $("<button type='button'></button>").addClass(
                        "btn btn-info btn-sm courseview-btn").append(
                        $("<span></span>").addClass("glyphicon glyphicon-search")).append("查看");
                var del_btn = $("<button type='button'></button>")
                        .addClass("btn btn-danger btn-sm").append(
                                $("<span></span>").addClass("glyphicon glyphicon-trash")).append(
                                "删除");
                find_btn.attr("RecomProductsDetailsId", item.id);

                del_btn.attr("RecomProductsDetailsId", item.id);
                del_btn.attr("RecomProductsDetailsTitle", item.recomProducts.products.name);
                //单个item查看事件
                find_btn.click(function() {
                    window.location.href = "Course/findCoursesByid?id=" + find_btn.attr("courseId")
                            + "&way=0";

                });

                //单个item修改事件
                edit_btn.click(function() {
                    window.location.href = "Course/findCoursesByid?id=" + find_btn.attr("courseId")
                            + "&way=1";

                });

                //单个item删除事件
                del_btn
                        .click(function() {
                            if (confirm("确认删除【" + "id=" + del_btn.attr("RecomProductsDetailsId")
                                    + ",商品名称为 " + del_btn.attr("RecomProductsDetailsTitle")
                                    + "】的推荐商品数据吗?")) {
                                //确认,发送ajax请求即可
                                $.ajax({
                                    url : "RecomProductsDetails/deleteRecomProductsDetailsById/",
                                    data : {
                                        "id" : del_btn.attr("RecomProductsDetailsId")
                                    },
                                    type : "GET",
                                    success : function(result) {
                                        layer.open({
                                            title : '删除提示',
                                            content : result.msg
                                        });
                                        //回到本页
                                        go(currentNum);
                                    }
                                });
                            }
                        });
                dataTR.append(checkBoxData).append(dataTd1).append(dataTd2).append(dataTd3).append(
                        dataTd4).append(dataTd5).append(dataTd6).append(dataTd7).append(dataTd8)
                        .append(
                                $("<td></td>").append(edit_btn).append("&nbsp;&nbsp;&nbsp;&nbsp;")
                                        .append(find_btn).append("&nbsp;&nbsp;&nbsp;&nbsp;")
                                        .append(del_btn)).appendTo($("#table_data"));
                edit_btn.click(function() {

                });
            });
        }

        //全选
        $(document).on("click", "#check_item_all", function() {
            $(".item_check").prop("checked", $(this).prop("checked"));
        });
        //点击批量删除
        $("#delete_all_btn").click(function() {
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
                if (confirm("确认删除商品名为：【" + empNames + "】的推荐商品信息吗?")) {
                    //发送ajax请求删除
                    $.ajax({
                        url : "RecomProductsDetails/deleteRecomProductsDetailsByListId",
                        data : {
                            "listId" : del_idstr
                        },
                        type : "GET",
                        success : function(result) {
                            if (result.code == 100) {
                                layer.open({
                                    title : '批量删除提示',
                                    content : result.extend.msg
                                });
                                go(currentNum);
                            } else {
                                layer.open({
                                    title : '批量删除提示',
                                    content : result.extend.msg
                                });
                            }
                            //回到当前页

                        }
                    });
                }
            } else {
                layer.open({
                    title : '批量删除提示',
                    content : '请选择要删除的条目！'
                });
            }
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
            var recomPeople = $('#recomPeople').val();//获取值
            var recomOldManName = $('#recomOldManName').val();//获取值
            var recomResult = $('#recomResult').val();

            if (recomPeople.length == 0 && recomOldManName.length == 0 && recomResult == '请选择') {
                layer.open({
                    title : '搜索提示',
                    content : '请输入数据'
                });
                go(1);
            } else {
                layer.load(2);
                $.ajax({
                    url : "RecomProductsDetails/findAllRecomProductsDetailsBySearch",
                    data : {
                        "recomPeople" : recomPeople,
                        "oldManName" : recomOldManName,
                        "result" : recomResult,
                        "pn" : pn
                    },
                    type : "get",
                    success : function(result) {
                        setTimeout(function() {
                            layer.closeAll('loading');
                        }, 500);
                        if (result.code == 100) {
                            if(result.extend.pageInfo.list!=''&& result.extend.pageInfo.list!=null){
                                //console.log(result.extend.pageInfo);
                                //构建分页信息
                                build_page_text(result);
                                //构建分页条
                                build_page_nav(result, 1);
                                //构建表格数据
                                build_table_data(result);
                            }else{
                                layer.open({
                                    title : '搜索通知',
                                    content : '抱歉，没有相关数据'
                                })
                            }
                          

                        } else {
                            layer.open({
                                title : '搜索通知',
                                content : result.extend.msg
                            })
                        }
                    }
                });
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
                return date.getFullYear() + "-" + month + currentDate + " " + currenthours + ":"
                        + currentminut + ":" + currentSeconds;
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
