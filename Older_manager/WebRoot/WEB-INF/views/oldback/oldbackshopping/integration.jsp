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

<title>积分管理</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link href="${APP_PATH}/static/shop/assets/css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" href="${APP_PATH}/static/shop/css/style.css" />
<link href="${APP_PATH}/static/shop/assets/css/codemirror.css" rel="stylesheet">
<link rel="stylesheet" href="${APP_PATH}/static/shop/assets/css/ace.min.css" />
<link rel="stylesheet" href="${APP_PATH}/static/shop/font/css/font-awesome.min.css" />
<link rel="stylesheet" href="${APP_PATH}/static/shop/assets/css/font-awesome.min.css" />
<script src="${APP_PATH}/static/shop/js/jquery-1.9.1.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/bootstrap.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/typeahead-bs2.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/jquery.dataTables.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/jquery.dataTables.bootstrap.js"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js" type="text/javascript"></script>
<script src="${APP_PATH}/static/shop/assets/laydate/laydate.js" type="text/javascript"></script>

<script type="text/javascript" src="${APP_PATH}/static/js/jquery-3.2.1.min.js"></script>
<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src="${APP_PATH}/lib/layer/2.4/layer.js"></script>
</head>

<body>
	<div class="margin clearfix">
		<div class="" id="Other_Management">
			<div class="search_style">
				<div class="title_names">搜索查询</div>
				<ul class="search_content clearfix">
					<li>
						<label class="l_f">会员名称</label>
						<input name="" type="text" onchange="checkStr(this.value)" class="text_add" id="username"
							placeholder="输入会员名称、电话、邮箱" style=" width:400px">
					</li>
					<li style="width:90px;">
						<button type="button" class="btn_search" id="search">
							<i class="fa fa-search"></i>查询
						</button>
					</li>
				</ul>
			</div>
			<div class="border clearfix">
				<span class="l_f"> <a class="btn btn-danger" id="delete_all_but">
						<i class="fa fa-trash"></i>&nbsp;批量删除
					</a>
				</span> <span class="r_f">共：<b id="counts"></b>条
				</span>
			</div>

			<!--会员积分列表  -->
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
				<div class="col-md-4 col-md-offset-1" id="page_nav"></div>
			</div>


		</div>
	</div>
	<!--积分-->
	<div id="integration_history" style="display:none; padding:10px;">
		<table class="table table-striped table-bordered table-hover" id="integration_history_list" width="100%">
			<thead>
				<tr>
					<th width="80">用户</th>
					<th width="100">产品名称</th>
					<th width="80">价格(元)</th>
					<th width="120">积分</th>
					<th width="120">获得时间</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>花海天天</td>
					<td><a href="#">荣耀7i 海岛蓝 移动4G手机 双卡双待 </a></td>
					<td>2565</td>
					<td>1234</td>
					<td>2016-7-12 12:23:34</td>
				</tr>
				<tr>
					<td>花海天天</td>
					<td><a href="#">荣耀7i 海岛蓝 移动4G手机 双卡双待 </a></td>
					<td>2565</td>
					<td>1234</td>
					<td>2016-7-12 12:23:34</td>
				</tr>
				<tr>
					<td>花海天天</td>
					<td><a href="#">荣耀7i 海岛蓝 移动4G手机 双卡双待 </a></td>
					<td>2565</td>
					<td>1234</td>
					<td>2016-7-12 12:23:34</td>
				</tr>
				<tr>
					<td>花海天天</td>
					<td><a href="#">荣耀7i 海岛蓝 移动4G手机 双卡双待 </a></td>
					<td>2565</td>
					<td>1234</td>
					<td>2016-7-12 12:23:34</td>
				</tr>
				<tr>
					<td>花海天天</td>
					<td><a href="#">荣耀7i 海岛蓝 移动4G手机 双卡双待 </a></td>
					<td>2565</td>
					<td>1234</td>
					<td>2016-7-12 12:23:34</td>
				</tr>
				<tr>
					<td>花海天天</td>
					<td><a href="#">荣耀7i 海岛蓝 移动4G手机 双卡双待 </a></td>
					<td>2565</td>
					<td>1234</td>
					<td>2016-7-12 12:23:34</td>
				</tr>
				<tr>
					<td>花海天天</td>
					<td><a href="#">华为 畅享5S 金色 移动联通电信4G手机 </a></td>
					<td>2565</td>
					<td>1234</td>
					<td>2016-7-12 12:23:34</td>
				</tr>
				<tr>
					<td>花海天天</td>
					<td><a href="#">荣耀7i 海岛蓝 移动4G手机 双卡双待 </a></td>
					<td>345</td>
					<td>232</td>
					<td>2016-7-12 12:23:34</td>
				</tr>
				<tr>
					<td>花海天天</td>
					<td><a href="#">乐视（Le）乐2Pro 32GB 金色 移动联通</a></td>
					<td>4566</td>
					<td>3455</td>
					<td>2016-7-12 12:23:34</td>
				</tr>
				<tr>
					<td>花海天天</td>
					<td><a href="#">华为 P9 plus 64GB 琥珀金 移动联通电信卡双待 </a></td>
					<td>231</td>
					<td>11</td>
					<td>2016-7-12 12:23:34</td>
				</tr>
				<tr>
					<td>花海天天</td>
					<td><a href="#">华为 P9 plus 64GB 琥珀金 移动联通电信 </a></td>
					<td>23</td>
					<td>12</td>
					<td>2016-7-12 12:23:34</td>
				</tr>
			</tbody>
		</table>

	</div>
	<!--浏览记录-->
	<div id="Browse_history" style="display:none; padding:10px">
		<table class="table table-striped table-bordered table-hover" id="Browse_history_list" width="100%">
			<thead>
				<tr>
					<th width="80">用户</th>
					<th width="100">产品名称</th>
					<th width="80">价格(元)</th>
					<th width="120">浏览次数</th>
					<th width="120">最新时间</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>花海天天</td>
					<td><a href="#">荣耀7i 海岛蓝 移动4G手机 双卡双待 </a></td>
					<td>2565</td>
					<td>1234</td>
					<td>2016-7-12 12:23:34</td>
				</tr>
				<tr>
					<td>花海天天</td>
					<td><a href="#">荣耀7i 海岛蓝 移动4G手机 双卡双待 </a></td>
					<td>2565</td>
					<td>1234</td>
					<td>2016-7-12 12:23:34</td>
				</tr>
				<tr>
					<td>花海天天</td>
					<td><a href="#">荣耀7i 海岛蓝 移动4G手机 双卡双待 </a></td>
					<td>2565</td>
					<td>1234</td>
					<td>2016-7-12 12:23:34</td>
				</tr>
				<tr>
					<td>花海天天</td>
					<td><a href="#">荣耀7i 海岛蓝 移动4G手机 双卡双待 </a></td>
					<td>2565</td>
					<td>1234</td>
					<td>2016-7-12 12:23:34</td>
				</tr>
				<tr>
					<td>花海天天</td>
					<td><a href="#">荣耀7i 海岛蓝 移动4G手机 双卡双待 </a></td>
					<td>2565</td>
					<td>1234</td>
					<td>2016-7-12 12:23:34</td>
				</tr>
				<tr>
					<td>花海天天</td>
					<td><a href="#">荣耀7i 海岛蓝 移动4G手机 双卡双待 </a></td>
					<td>2565</td>
					<td>1234</td>
					<td>2016-7-12 12:23:34</td>
				</tr>
				<tr>
					<td>花海天天</td>
					<td><a href="#">华为 畅享5S 金色 移动联通电信4G手机 </a></td>
					<td>2565</td>
					<td>1234</td>
					<td>2016-7-12 12:23:34</td>
				</tr>
				<tr>
					<td>花海天天</td>
					<td><a href="#">荣耀7i 海岛蓝 移动4G手机 双卡双待 </a></td>
					<td>345</td>
					<td>232</td>
					<td>2016-7-12 12:23:34</td>
				</tr>
				<tr>
					<td>花海天天</td>
					<td><a href="#">乐视（Le）乐2Pro 32GB 金色 移动联通</a></td>
					<td>4566</td>
					<td>3455</td>
					<td>2016-7-12 12:23:34</td>
				</tr>
				<tr>
					<td>花海天天</td>
					<td><a href="#">华为 P9 plus 64GB 琥珀金 移动联通电信卡双待 </a></td>
					<td>231</td>
					<td>11</td>
					<td>2016-7-12 12:23:34</td>
				</tr>
				<tr>
					<td>花海天天</td>
					<td><a href="#">华为 P9 plus 64GB 琥珀金 移动联通电信 </a></td>
					<td>23</td>
					<td>12</td>
					<td>2016-7-12 12:23:34</td>
				</tr>
			</tbody>
		</table>


	</div>

	<!--购物记录-->
	<div id="Order_history" style="display:none; padding:10px;">

		<table class="table table-striped table-bordered table-hover" id="Order_history_list" width="100%">
			<thead>
				<tr>
					<th width="80">用户</th>
					<th width="100">订单号</th>
					<th width="80">数量</th>
					<th width="120">交易状态</th>
					<th width="120">交易时间</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>花海天天</td>
					<td><a href="#">hd23342354534534 </a></td>
					<td>2</td>
					<td>已完成</td>
					<td>2016-7-12 12:23:34</td>
				</tr>
				<tr>
					<td>花海天天</td>
					<td><a href="#">hd23342354534534</a></td>
					<td>2</td>
					<td>待收货</td>
					<td>2016-7-12 12:23:34</td>
				</tr>
				<tr>
					<td>花海天天</td>
					<td><a href="#">hd23342354534534 </a></td>
					<td>3</td>
					<td>已完成</td>
					<td>2016-7-12 12:23:34</td>
				</tr>
				<tr>
					<td>花海天天</td>
					<td><a href="#">hd2335464544534534</a></td>
					<td>3</td>
					<td>交易失败</td>
					<td>2016-7-12 12:23:34</td>
				</tr>
			</tbody>
		</table>
	</div>

	<script>
        jQuery(function($) {
            go(1);

            var oTable1 = $('#sample-table').dataTable({
                "aaSorting" : [ [ 1, "desc" ] ],//默认第几个排序
                "bStateSave" : true,//状态保存
                "aoColumnDefs" : [
                //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
                {
                    "orderable" : false,
                    "aTargets" : [ 0, 2, 3, 6 ]
                } // 制定列不参与排序
                ]
            });

            $('table th input:checkbox').on(
                    'click',
                    function() {
                        var that = this;
                        $(this).closest('table').find('tr > td:first-child input:checkbox').each(
                                function() {
                                    this.checked = that.checked;
                                    $(this).closest('tr').toggleClass('selected');
                                });

                    });
        });

        /*用户-删除*/
        function member_del(obj, id) {
            layer.confirm('确认要删除吗？', function(index) {
                $(obj).parents("tr").remove();
                layer.msg('已删除!', {
                    icon : 1,
                    time : 1000
                });
            });
        }
        //积分浏览
        function integration_history(id) {
            layer.open({
                type : 1,
                title : '积分获取记录',
                area : [ '800px', '400px' ],
                shadeClose : true,
                content : $('#integration_history'),
            })
            $('#integration_history_list').dataTable({
                "aaSorting" : [ [ 1, "desc" ] ],//默认第几个排序
                "bStateSave" : true,//状态保存
                "aoColumnDefs" : [ {
                    "bSortable" : false,
                    "orderable" : false,
                    "aTargets" : [ 0, 1 ]
                } ]
            });

        };
        //浏览记录

        function Browse_history(id) {
            layer.open({
                type : 1,
                title : '浏览记录',
                area : [ '800px', '400px' ],
                shadeClose : true,
                content : $('#Browse_history'),
            })
            $('#Browse_history_list').dataTable({
                "aaSorting" : [ [ 1, "desc" ] ],//默认第几个排序
                "bStateSave" : true,//状态保存
                "aoColumnDefs" : [ {
                    "bSortable" : false,
                    "orderable" : false,
                    "aTargets" : [ 0, 1 ]
                } ]
            });
        }

        //购物记录
        function Order_history(id) {
            layer.open({
                type : 1,
                title : '购物记录',
                area : [ '800px', '400px' ],
                shadeClose : true,
                content : $('#Order_history'),
            });
            $('#Order_history_list').dataTable({
                "aaSorting" : [ [ 1, "desc" ] ],//默认第几个排序
                "bStateSave" : true,//状态保存
                "aoColumnDefs" : [ {
                    "bSortable" : false,
                    "orderable" : false,
                    "aTargets" : [ 0, 1 ]
                } ]
            });
        }

        var totalRecord, currentNum;

        function go(pn) {
            layer.load(2);
            $.ajax({
                url : "ShopMember/findAllShopMemberByPage",
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
                    "当前第" + result.extend.pageInfo.pageNum + "页，共" + result.extend.pageInfo.pages
                            + "页，总计" + result.extend.pageInfo.total + "条记录");
            totalRecord = result.extend.pageInfo.total;
            currentNum = result.extend.pageInfo.pageNum;
            $("#counts").html(totalRecord);
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
            var checkBox = $("<td></td>").append($("<input type='checkbox' id='check_item_all'/>"));

            var Td1 = $("<td></td>").append("用户id");
            var Td2 = $("<td></td>").append("用户名");
            var Td3 = $("<td></td>").append("积分");
            var Td4 = $("<td></td>").append("浏览(条)");
            var Td5 = $("<td></td>").append("购物(笔)");
            var Td6 = $("<td></td>").append("操作");

            headTR.append(checkBox).append(Td1).append(Td2).append(Td3).append(Td4).append(Td5)
                    .append(Td6).appendTo($("#head"));

            $.each(result.extend.pageInfo.list, function(index, item) {

                var dataTR = $("<tr></tr>");
                var checkBoxData = $("<td></td>")./* addClass("text-center"). */append(
                        $("<input type='checkbox'/>").addClass("item_check"));
                var dataTd1 = $("<td></td>").append(item.users.id);
                var dataTd2 = $("<td></td>").append(item.users.account);
                var dataTd3 = $("<td></td>").append(item.integral.currentintegral);
                var dataTd4 = $("<td></td>").append(item.productsViewsCount);
                var dataTd5 = $("<td></td>").append(item.ordersCount);

                var delet_btn = $("<button type='button'></button>").addClass(
                        "btn btn-sm btn-danger").append(
                        $("<span></span>").addClass("glyphicon glyphicon-trash")).append("删除");
                delet_btn.attr("noticeId", item.id);
                delet_btn.attr("noticetitle", item.users.account);

                //单个item删除事件
                delet_btn.click(function() {
                    if (confirm("确认删除【" + "id=" + delet_btn.attr("noticeId") + ",名为 "
                            + delet_btn.attr("noticetitle") + "】的会员吗?")) {
                        //确认,发送ajax请求即可
                        $.ajax({
                            url : "ShopMember/deleteShopMemberById/",
                            data : {
                                "id" : delet_btn.attr("noticeId")
                            },
                            type : "GET",
                            success : function(result) {
                                if (result.code == 100) {
                                    alert(result.extend.msg);
                                    //回到本页
                                    go(currentNum);
                                } else {
                                    alert(result.extend.msg);
                                }

                            }
                        });
                    }
                });

                dataTR.append(checkBoxData).append(dataTd1).append(dataTd2).append(dataTd3).append(
                        dataTd4).append(dataTd5).append($("<td></td>").append(delet_btn)).appendTo(
                        $("#table_data"));
            });
        }

        //全选
        $(document).on("click", "#check_item_all", function() {
            $(".item_check").prop("checked", $(this).prop("checked"));
        });

        //点击保存按钮，修改通知信息
        $("#editnotice_button").click(function() {
            var time = $("#time").val();
            var releasepeople = $("#releasepeople").val();
            var type = $("#type").val();
            var content = $("#content").val();
            var title = $("#title").val();
            if (title == '' || releasepeople == '' || type == '' || content == '' || time == '') {
                alert("请填写完整信息再发布");
            } else {
                $.ajax({
                    url : "${APP_PATH}/notice/updateNotice",
                    type : "post",
                    data : $("#noticeForm").serialize(),
                    success : function(result) {
                        if (result.code == 100) {
                            alert("修改成功！");
                            //1.关闭模态框
                            $("#activity_edit_modal").modal('hide');
                            //2.重新加载当页
                            go(currentNum);
                        } else {
                            alert("修改失败，请再重试一遍吧！");
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
                empNames += $(item).parents("tr").find("td:eq(2)").text() + ",";
                del_idshow += $(item).parents("tr").find("td:eq(1)").text() + ",";
                del_idstr += $(item).parents("tr").find("td:eq(1)").text() + "-";
            });
            empNames = empNames.substring(0, empNames.length - 1);
            del_idstr = del_idstr.substring(0, del_idstr.length - 1);
            if (empNames != null && empNames.length != 0) {
                if (confirm("确认删除【id为" + del_idshow + " ，用户名为：" + empNames + "】的所有用户积分数据吗?")) {
                    //发送ajax请求删除
                    $.ajax({
                        url : "ShopMember/deleteShopMemberById/",
                        data : {
                            "listId" : del_idstr
                        },
                        type : "GET",
                        success : function(result) {
                            if (result.code == 100) {
                                layer.open({
                                    offset : [ '10%' ],
                                    title : '删除提示',
                                    content : result.extend.msg
                                });
                                go(currentNum);
                            }
                        }
                    });
                }
            } else {
                layer.open({
                    offset : [ '10%' ],
                    title : '多选提示',
                    content : '请选择要选择的用户积分条目！'
                });
            }

        });

        //搜索按钮
        $("#search").click(function() {
            search(1);
        });

        function search(pn) {
            var dtitle = $('#username').val();//获取值

            if (dtitle.length == 0) {
                layer.open({
                    offset : [ '10%' ],
                    title : '搜索提示',
                    content : '请输入搜索数据！'
                });
                go(1);
            } else {
                layer.load(2);
                $.ajax({
                    url : "ShopMember/searchShopMember",
                    data : {
                        "userDetail" : dtitle,
                        "startTime" : null,
                        "pn" : pn
                    },
                    type : "get",
                    success : function(result) {
                        setTimeout(function() {
                            layer.closeAll('loading');
                        }, 500);
                        if (result.code == 100) {
                            if (result.extend.pageInfo.list == null) {
                                layer.open({
                                    offset : [ '10%' ],
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
                                offset : [ '10%' ],
                                title : '搜索提示',
                                content : result.extend.msg
                            });
                        }
                    }
                });
            }

        }

        function checkStr(str) {
            // [\u4E00-\uFA29]|[\uE7C7-\uE7F3]汉字编码范围 
            var re1 = new RegExp("^([\u4E00-\uFA29]|[\uE7C7-\uE7F3]|[a-zA-Z0-9]|@)*$");
            if (!re1.test(str)) {
                alert("请输入中文字符");
                return false;
            } else {
                return true;
            }
        }
    </script>
</body>
</html>
