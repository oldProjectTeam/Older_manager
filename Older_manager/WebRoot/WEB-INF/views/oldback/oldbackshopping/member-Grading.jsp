<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	pageContext.setAttribute("APP_PATH", request.getContextPath());
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>会员等级</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link href="${APP_PATH}/static/shop/assets/css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" href="${APP_PATH}/static/shop/css/style.css" />
<link href="${APP_PATH}/static/shop/assets/css/codemirror.css" rel="stylesheet">
<link rel="stylesheet" href="${APP_PATH}/static/shop/assets/css/ace.min.css" />
<link rel="stylesheet" href="${APP_PATH}/static/shop/font/css/font-awesome.min.css" />
<link rel="stylesheet" href="${APP_PATH}/static/shop/assets/css/font-awesome.min.css" />
<script src="${APP_PATH}/static/shop/js/jquery-1.9.1.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/typeahead-bs2.min.js"></script>
<script src="${APP_PATH}/static/shop/js/lrtk.js" type="text/javascript"></script>
<script src="${APP_PATH}/static/shop/assets/js/jquery.dataTables.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/jquery.dataTables.bootstrap.js"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js" type="text/javascript"></script>
<script src="${APP_PATH}/static/shop/assets/dist/echarts.js"></script>



<%-- <script type="text/javascript" src="${APP_PATH}/static/js/jquery-3.2.1.min.js"></script> --%>
<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<%-- <script src="${APP_PATH}/lib/layer/2.4/layer.js"></script> --%>

</head>

<body>
	<div class="grading_style">
		<div id="category">
			<div id="scrollsidebar" class="left_Treeview">
				<div class="show_btn" id="rightArrow">
					<span></span>
				</div>
				<div class="widget-box side_content">
					<div class="side_title">
						<a title="隐藏" class="close_btn">
							<span></span>
						</a>
					</div>
					<div class="side_list">
						<div class="widget-header header-color-green2">
							<h4 class="lighter smaller">会员等级</h4>
						</div>
						<div class="widget-body">
							<ul class="b_P_Sort_list">
								<li>
									<i class="orange  fa fa-user-secret"></i>
									<a onclick="go(1)" id="all">全部(0)</a>
								</li>
								<li>
									<i class="fa fa-diamond pink "></i>
									<a onclick="initLevelShopMembersDate(0,1)" id="regular">普通会员(0)</a>
								</li>
								<li>
									<i class="fa fa-diamond pink "></i>
									<a onclick="initLevelShopMembersDate(1,1)" id="iron">铁牌会员(0)</a>
								</li>
								<li>
									<i class="fa fa-diamond pink "></i>
									<a onclick="initLevelShopMembersDate(2,1)" id="copper">铜牌会员(0)</a>
								</li>
								<li>
									<i class="fa fa-diamond pink "></i>
									<a onclick="initLevelShopMembersDate(3,1)" id="silver">银牌会员(0)</a>
								</li>
								<li>
									<i class="fa fa-diamond pink "></i>
									<a onclick="initLevelShopMembersDate(4,1)" id="gold">金牌会员(0)</a>
								</li>
								<li>
									<i class="fa fa-diamond grey"></i>
									<a onclick="initLevelShopMembersDate(5,1)" id="diamond">钻石会员(0)</a>
								</li>
								<li>
									<i class="fa fa-diamond red"></i>
									<a onclick="initLevelShopMembersDate(6,1)" id="reddiamond">红钻会员(0)</a>
								</li>
								<li>
									<i class="fa fa-diamond blue"></i>
									<a onclick="initLevelShopMembersDate(7,1)" id="bluediamond">蓝钻会员(0)</a>
								</li>
								<li>
									<i class="fa fa-diamond grey"></i>
									<a onclick="initLevelShopMembersDate(8,1)" id="blankdiamond">黑钻会员(0)</a>
								</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
			<!--右侧样式-->
			<div class="page_right_style right_grading">
				<div class="Statistics_style" id="Statistic_pie">
					<div class="type_title">
						等级统计 <span class="top_show_btn Statistic_btn">显示</span> <span class="Statistic_title Statistic_btn"><a
								title="隐藏" class="top_close_btn">隐藏</a></span>
					</div>
					<div id="Statistics" class="Statistics"></div>
				</div>
				<!--列表样式-->
				<div class="grading_list">
					<div class="type_title">全部会员等级列表</div>
					<div class="table_menu_list"></div>

					<!--会员等级列表  -->
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
		</div>
	</div>

	<script type="text/javascript">
        $(function() {

            $("#category").fix({
                float : 'left',
                //minStatue : true,
                skin : 'green',
                durationTime : false,
                spacingw : 20,
                spacingh : 240,
                set_scrollsidebar : '.right_grading',
            });
        });

        $(function() {
            $("#Statistic_pie").fix({
                float : 'top',
                //minStatue : true,
                skin : 'green',
                durationTime : false,
                spacingw : 0,
                spacingh : 0,
                close_btn : '.top_close_btn',
                show_btn : '.top_show_btn',
                side_list : '.Statistics',
                close_btn_width : 80,
                side_title : '.Statistic_title',
            });
        });
        /*用户-查看*/
        function member_show(title, url, id, w, h) {
            layer_show(title, url + '#?=' + id, w, h);
        }
        /*用户-停用*/
        function member_stop(obj, id) {
            layer
                    .confirm(
                            '确认要停用吗？',
                            function(index) {
                                $(obj)
                                        .parents("tr")
                                        .find(".td-manage")
                                        .prepend(
                                                '<a style="text-decoration:none" class="btn btn-xs " onClick="member_start(this,id)" href="javascript:;" title="启用"><i class="fa fa-close bigger-120"></i></a>');
                                $(obj).parents("tr").find(".td-status").html(
                                        '<span class="label label-defaunt radius">已停用</span>');
                                $(obj).remove();
                                layer.msg('已停用!', {
                                    icon : 5,
                                    time : 1000
                                });
                            });
        }
        /*用户-启用*/
        function member_start(obj, id) {
            layer
                    .confirm(
                            '确认要启用吗？',
                            function(index) {
                                $(obj)
                                        .parents("tr")
                                        .find(".td-manage")
                                        .prepend(
                                                '<a style="text-decoration:none" class="btn btn-xs btn-success" onClick="member_stop(this,id)" href="javascript:;" title="停用"><i class="fa fa-check  bigger-120"></i></a>');
                                $(obj).parents("tr").find(".td-status").html(
                                        '<span class="label label-success radius">已启用</span>');
                                $(obj).remove();
                                layer.msg('已启用!', {
                                    icon : 6,
                                    time : 1000
                                });
                            });
        }
    </script>
	<script type="text/javascript">
        ///////////////////////////////////统计图数据加载///////////////////////////////////
        //初始化宽度、高度  
        $(".widget-box").height($(window).height());
        $(".page_right_style").width($(window).width() - 220);
        //$(".table_menu_list").width($(window).width()-240);
        //当文档窗口发生改变时 触发  
        $(window).resize(function() {
            $(".widget-box").height($(window).height());
            $(".page_right_style").width($(window).width() - 220);
            //$(".table_menu_list").width($(window).width()-240);
        })
        /**************/
        require.config({
            paths : {
                echarts : './static/shop/assets/dist'
            }
        });
    </script>
	<script type="text/javascript">
        $(function($) {
            var levelmap;
            go(1);

            InitLevelData();
            var oTable1 = $('#sample-table').dataTable({
                "aaSorting" : [ [ 1, "desc" ] ],//默认第几个排序
                "bStateSave" : true,//状态保存
                "aoColumnDefs" : [
                //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
                {
                    "orderable" : false,
                    "aTargets" : [ 0, 2, 3, 4, 5, 6, 7, 9 ]
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

            /* $('[data-rel="tooltip"]').tooltip({
                placement : tooltip_placement
            }); */
            function tooltip_placement(context, source) {
                var $source = $(source);
                var $parent = $source.closest('table')
                var off1 = $parent.offset();
                var w1 = $parent.width();

                var off2 = $source.offset();
                var w2 = $source.width();

                if (parseInt(off2.left) < parseInt(off1.left) + parseInt(w1 / 2))
                    return 'right';
                return 'left';
            }

        });

        function InitLevelData() {

            $.ajax({
                url : "ShopMember/findAllShopMembersGradeDistribution",
                type : "GET",
                success : function(result) {
                    setTimeout(function() {
                        layer.closeAll('loading');
                    }, 500);
                    if (result.code == 100) {
                        levelmap = result.extend.levelMap;
                        $("#all").html('所有会员(' + levelmap.all + ')');
                        $("#regular").html('普通会员(' + levelmap.regular + ')');
                        $("#iron").html('铁牌会员(' + levelmap.iron + ')');
                        $("#copper").html('铜牌会员(' + levelmap.copper + ')');
                        $("#silver").html('银牌会员(' + levelmap.silver + ')');
                        $("#gold").html('金牌会员(' + levelmap.gold + ')');
                        $("#diamond").html('钻石会员(' + levelmap.diamond + ')');
                        $("#reddiamond").html('红钻会员(' + levelmap.Reddiamond + ')');
                        $("#bluediamond").html('蓝钻会员(' + levelmap.bluediamond + ')');
                        $("#blankdiamond").html('黑钻会员(' + levelmap.blankdiamond + ')');

                        require([ 'echarts', 'echarts/theme/macarons', 'echarts/chart/pie', // 按需加载所需图表，如需动态类型切换功能，别忘了同时加载相应图表
                        'echarts/chart/funnel' ], function(ec, theme) {
                            var myChart = ec.init(document.getElementById('Statistics'), theme);

                            option = {
                                title : {
                                    text : '用户等级统计',
                                    subtext : '实时更新最新等级',
                                    x : 'center'
                                },
                                tooltip : {
                                    trigger : 'item',
                                    formatter : "{a} <br/>{b} : {c} ({d}%)"
                                },
                                legend : {

                                    x : 'center',
                                    y : 'bottom',
                                    data : [ '普通用户', '铁牌用户', '铜牌用户', '银牌用户', '金牌用户', '钻石用户',
                                            '蓝钻用户', '红钻用户', '黑钻用户' ]
                                },
                                toolbox : {
                                    show : true,
                                    feature : {
                                        mark : {
                                            show : false
                                        },
                                        dataView : {
                                            show : false,
                                            readOnly : true
                                        },
                                        magicType : {
                                            show : true,
                                            type : [ 'pie', 'funnel' ],
                                            option : {
                                                funnel : {
                                                    x : '25%',
                                                    width : '50%',
                                                    funnelAlign : 'left',
                                                    max : 6200
                                                }
                                            }
                                        },
                                        restore : {
                                            show : true
                                        },
                                        saveAsImage : {
                                            show : true
                                        }
                                    }
                                },
                                calculable : true,
                                series : [ {
                                    name : '会员数量',
                                    type : 'pie',
                                    radius : '55%',
                                    center : [ '50%', '60%' ],
                                    data : [ {
                                        value : levelmap.regular,
                                        name : '普通用户'
                                    }, {
                                        value : levelmap.iron,
                                        name : '铁牌用户'
                                    }, {
                                        value : levelmap.copper,
                                        name : '铜牌用户'
                                    }, {
                                        value : levelmap.silver,
                                        name : '银牌用户'
                                    }, {
                                        value : levelmap.gold,
                                        name : '金牌用户'
                                    }, {
                                        value : levelmap.diamond,
                                        name : '钻石用户'
                                    }, {
                                        value : levelmap.bluediamond,
                                        name : '蓝钻用户'
                                    }, {
                                        value : levelmap.Reddiamond,
                                        name : '红钻用户'
                                    }, {
                                        value : levelmap.blankdiamond,
                                        name : '黑钻用户'
                                    },

                                    ]
                                } ]
                            };
                            myChart.setOption(option);
                        });
                    } else {
                        layer.open({
                            title : '初始化数据提示',
                            content : '初始化等级分布数据失败!'
                        });
                    }
                }
            });
        };

        function initLevelShopMembersDate(code, pn) {
            layer.load(2);
            $.ajax({
                url : "ShopMember/findAllShopMembersByLevel",
                data : {
                    "code" : code,
                    "pn" : pn
                },
                type : "GET",
                success : function(result) {
                    setTimeout(function() {
                        layer.closeAll('loading');
                    }, 500);
                    if (result.code == 100) {
                        //构建分页信息
                        build_page_text(result);
                        //构建分页条
                        build_page_nav(result, code);
                        //构建表格数据
                        build_table_data(result);
                    }
                }
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
                        build_page_nav(result, 9);
                        //构建表格数据
                        build_table_data(result);
                    }
                }
            });
        }

        //解析显示分页信息
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
            switch (code) {
            case 9:
                firstPageLi = $("<li></li>").append(
                        $("<a></a>").append("首页").attr("href", "javascript:go(1)"));
                break;
            case 0:
                firstPageLi = $("<li></li>").append(
                        $("<a></a>").append("首页").attr("href",
                                "javascript:initLevelShopMembersDate(0,1)"));
                break;
            case 1:
                firstPageLi = $("<li></li>").append(
                        $("<a></a>").append("首页").attr("href",
                                "javascript:initLevelShopMembersDate(1,1)"));
                break;
            case 2:
                firstPageLi = $("<li></li>").append(
                        $("<a></a>").append("首页").attr("href",
                                "javascript:initLevelShopMembersDate(2,1)"));
                break;
            case 3:
                firstPageLi = $("<li></li>").append(
                        $("<a></a>").append("首页").attr("href",
                                "javascript:initLevelShopMembersDate(3,1)"));
                break;
            case 4:
                firstPageLi = $("<li></li>").append(
                        $("<a></a>").append("首页").attr("href",
                                "javascript:initLevelShopMembersDate(4,1)"));
                break;
            case 5:
                firstPageLi = $("<li></li>").append(
                        $("<a></a>").append("首页").attr("href",
                                "javascript:initLevelShopMembersDate(5,1)"));
                break;
            case 6:
                firstPageLi = $("<li></li>").append(
                        $("<a></a>").append("首页").attr("href",
                                "javascript:initLevelShopMembersDate(6,1)"));
                break;
            case 7:
                firstPageLi = $("<li></li>").append(
                        $("<a></a>").append("首页").attr("href",
                                "javascript:initLevelShopMembersDate(7,1)"));
                break;
            case 8:
                firstPageLi = $("<li></li>").append(
                        $("<a></a>").append("首页").attr("href",
                                "javascript:initLevelShopMembersDate(8,1)"));
                break;
            
            }
           

            var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
            if (result.extend.pageInfo.hasPreviousPage == false) {
                firstPageLi.addClass("disabled");
                prePageLi.addClass("disabled");
            } else {
                //为元素添加点击翻页事件
                prePageLi.click(function() {

                    switch (code) {
                    
                    case 9:
                        go(result.extend.pageInfo.pageNum - 1);
                        break;
                    case 0:
                        initLevelShopMembersDate(0, result.extend.pageInfo.pageNum - 1);
                        break;
                    case 1:
                        initLevelShopMembersDate(1, result.extend.pageInfo.pageNum - 1);
                        break;
                    case 2:
                        initLevelShopMembersDate(2, result.extend.pageInfo.pageNum - 1);
                        break;
                    case 3:
                        initLevelShopMembersDate(3, result.extend.pageInfo.pageNum - 1);
                        break;
                    case 4:
                        initLevelShopMembersDate(4, result.extend.pageInfo.pageNum - 1);
                        break;
                    case 5:
                        initLevelShopMembersDate(5, result.extend.pageInfo.pageNum - 1);
                        break;
                    case 6:
                        initLevelShopMembersDate(6, result.extend.pageInfo.pageNum - 1);
                        break;
                    case 7:
                        initLevelShopMembersDate(7, result.extend.pageInfo.pageNum - 1);
                        break;
                    case 8:
                        initLevelShopMembersDate(8, result.extend.pageInfo.pageNum - 1);
                        break;
                    }
                });
            }
            var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));

            switch (code) {
            case 9:
                lastPageLi = $("<li></li>").append(
                        $("<a></a>").append("末页").attr("href",
                                "javascript:go(" + result.extend.pageInfo.pages + ")"));
                break;
            case 0:
                lastPageLi = $("<li></li>").append(
                        $("<a></a>").append("末页").attr(
                                "href",
                                "javascript:initLevelShopMembersDate(0,"
                                        + result.extend.pageInfo.pages + ")"));
                break;
            case 1:
                lastPageLi = $("<li></li>").append(
                        $("<a></a>").append("末页").attr(
                                "href",
                                "javascript:initLevelShopMembersDate(1,"
                                        + result.extend.pageInfo.pages + ")"));
                break;
            case 2:
                lastPageLi = $("<li></li>").append(
                        $("<a></a>").append("末页").attr(
                                "href",
                                "javascript:initLevelShopMembersDate(2,"
                                        + result.extend.pageInfo.pages + ")"));
                break;
            case 3:
                lastPageLi = $("<li></li>").append(
                        $("<a></a>").append("末页").attr(
                                "href",
                                "javascript:initLevelShopMembersDate(3,"
                                        + result.extend.pageInfo.pages + ")"));
                break;
            case 4:
                lastPageLi = $("<li></li>").append(
                        $("<a></a>").append("末页").attr(
                                "href",
                                "javascript:initLevelShopMembersDate(4,"
                                        + result.extend.pageInfo.pages + ")"));
                break;
            case 5:
                lastPageLi = $("<li></li>").append(
                        $("<a></a>").append("末页").attr(
                                "href",
                                "javascript:initLevelShopMembersDate(5,"
                                        + result.extend.pageInfo.pages + ")"));
                break;
            case 6:
                lastPageLi = $("<li></li>").append(
                        $("<a></a>").append("末页").attr(
                                "href",
                                "javascript:initLevelShopMembersDate(6,"
                                        + result.extend.pageInfo.pages + ")"));
                break;
            case 7:
                lastPageLi = $("<li></li>").append(
                        $("<a></a>").append("末页").attr(
                                "href",
                                "javascript:initLevelShopMembersDate(7,"
                                        + result.extend.pageInfo.pages + ")"));
                break;
            case 8:
                lastPageLi = $("<li></li>").append(
                        $("<a></a>").append("末页").attr(
                                "href",
                                "javascript:initLevelShopMembersDate(8,"
                                        + result.extend.pageInfo.pages + ")"));
                break;
            }
           

            if (result.extend.pageInfo.hasNextPage == false) {
                nextPageLi.addClass("disabled");
                lastPageLi.addClass("disabled");
            } else {
                switch (code) {
                case 9:
                    nextPageLi.click(function() {
                        go(result.extend.pageInfo.pageNum + 1);
                    });
                    break;
                case 0:
                    nextPageLi.click(function() {
                        initLevelShopMembersDate(0, result.extend.pageInfo.pageNum + 1);
                    });
                    break;
                case 1:
                    nextPageLi.click(function() {
                        initLevelShopMembersDate(1, result.extend.pageInfo.pageNum + 1);
                    });
                    break;
                case 2:
                    nextPageLi.click(function() {
                        initLevelShopMembersDate(2, result.extend.pageInfo.pageNum + 1);
                    });
                    break;
                case 3:
                    nextPageLi.click(function() {
                        initLevelShopMembersDate(3, result.extend.pageInfo.pageNum + 1);
                    });
                    break;
                case 4:
                    nextPageLi.click(function() {
                        initLevelShopMembersDate(4, result.extend.pageInfo.pageNum + 1);
                    });
                    break;
                case 5:
                    nextPageLi.click(function() {
                        initLevelShopMembersDate(5, result.extend.pageInfo.pageNum + 1);
                    });
                    break;
                case 6:
                    nextPageLi.click(function() {
                        initLevelShopMembersDate(6, result.extend.pageInfo.pageNum + 1);
                    });
                    break;
                case 7:
                    nextPageLi.click(function() {
                        initLevelShopMembersDate(7, result.extend.pageInfo.pageNum + 1);
                    });
                    break;
                case 8:
                    nextPageLi.click(function() {
                        initLevelShopMembersDate(8, result.extend.pageInfo.pageNum + 1);
                    });
                    break;
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
                    switch (code) {
                    case 9:
                        go(item);
                        break;
                    case 0:
                        initLevelShopMembersDate(0, item);
                        break;
                    case 1:
                        initLevelShopMembersDate(1, item);
                        break;
                    case 2:
                        initLevelShopMembersDate(2, item);
                        break;
                    case 3:
                        initLevelShopMembersDate(3, item);
                        break;
                    case 4:
                        initLevelShopMembersDate(4, item);
                        break;
                    case 5:
                        initLevelShopMembersDate(5, item);
                        break;
                    case 6:
                        initLevelShopMembersDate(6, item);
                        break;
                    case 7:
                        initLevelShopMembersDate(7, item);
                        break;
                    case 8:
                        initLevelShopMembersDate(8, item);
                        break;
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

            var Td1 = $("<td></td>").append("ID").addClass("sorting_asc");
            var Td2 = $("<td></td>").append("用户名");
            var Td3 = $("<td></td>").append("性别");
            var Td4 = $("<td></td>").append("手机");
            var Td5 = $("<td></td>").append("邮箱");
            var Td6 = $("<td></td>").append("加入时间");
            var Td7 = $("<td></td>").append("等级");
            var Td8 = $("<td></td>").append("积分");
            var Td9 = $("<td></td>").append("状态");
            var Td10 = $("<td></td>").append("操作");

            headTR.append(checkBox).append(Td1).append(Td2).append(Td3).append(Td4).append(Td5)
                    .append(Td6).append(Td7).append(Td8).append(Td9).append(Td10).appendTo(
                            $("#head"));

            $.each(result.extend.pageInfo.list, function(index, item) {

                var dataTR = $("<tr></tr>");
                var checkBoxData = $("<td></td>")./* addClass("text-center"). */append(
                        $("<input type='checkbox'/>").addClass("item_check"));
                var dataTd1 = $("<td></td>").append(item.id);
                var dataTd2 = $("<td></td>").append(item.users.account);
                var dataTd3 = $("<td></td>").append(item.users.sex);
                var dataTd4 = $("<td></td>").append(item.users.phone);
                var dataTd5 = $("<td></td>").append(item.users.email);
                var dataTd6 = $("<td></td>").append(ChangeDateFormat2(item.jointime));
                var dataTd7 = $("<td></td>").append(item.level);
                var dataTd8 = $("<td></td>").append(item.integral.currentintegral);
               
                if (item.users.column5 == 1) {
                    var dataTd9 = $("<td></td>").append(
                            "<span class='label label-success radius'>已启用</span>");
                } else if(item.users.column5==0) {
                    var dataTd9 = $("<td></td>").append(
                            "<span class='label label-defaunt radius'>禁用</span>");
                    console.log(item.users.column5);
                }else{
                    var dataTd9 = $("<td></td>").append(
                    "<span class='label label-warning radius'>未设置</span>");
                }
              
                var open_btn = $("<button type='button'></button>").addClass(
                        "btn btn-sm btn-success  courseview-btn").append(
                        $("<span></span>").addClass("glyphicon glyphicon-ok")).append("启用");
                var delet_btn = $("<button type='button'></button>").addClass(
                        "btn btn-sm btn-danger").append(
                        $("<span></span>").addClass("glyphicon glyphicon-trash")).append("删除");
               
                open_btn.attr("noticeId", item.users.id);
                delet_btn.attr("noticeId", item.id);
                delet_btn.attr("noticetitle", item.users.account);

              //单个item开启状态
                open_btn.click(function() {
                    if (item.users.column5 == 1) {
                        $("#open_btn").attr("disabled", true);
                        layer.msg("已经是启用状态！", {
                            icon : 6,
                            time : 1000,
                            offset : [ '35%' ]
                        });
                    } else {
                        $.ajax({
                            url : "ShopMember/modifyShopMemberState",
                            data : {
                                id : open_btn.attr("noticeId"),
                                code : 1
                            },
                            type : "get",
                            success : function(result) {
                                if (result.code == 100) {
                                    layer.msg("启用用户成功！", {
                                        icon : 6,
                                        time : 1000,
                                        offset : [ '35%' ]
                                    });
                                    go(currentNum);

                                } else {
                                    alert("获取失败，请重试！");
                                }
                            }
                        });
                    }
                });
               

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
                        dataTd4).append(dataTd5).append(dataTd6).append(dataTd7).append(dataTd8)
                        .append(dataTd9).append(
                                $("<td></td>").append(open_btn).append(delet_btn))
                        .appendTo($("#table_data"));
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


        //新增按钮
        $("#addvideo_btn").click(function() {
            location.href = "sendnotice";
        });

        //搜索按钮
        $("#search").click(function() {
            search(1);
        });

        function search(pn) {
            var dtitle = $('#stitle').val();//获取值
            var dreleasepeople = $('#sreleasepeople').val();

            if (dtitle.length == 0 && dreleasepeople.length == 0) {
                alert("请输入搜索数据！");
                go(1);
            } else {
                $.ajax({
                    url : "notice/findAllNoticeBySearch",
                    data : {
                        "title" : dtitle,
                        "releasepeople" : dreleasepeople,
                        "pn" : pn
                    },
                    type : "get",
                    success : function(result) {
                        if (result.code == 100) {
                            if (result.extend.pageInfo.list == null) {
                                alert("查询不到相关数据！");
                            } else {
                                //构建分页信息
                                build_page_text(result);
                                //构建分页条
                                build_page_nav(result, 1);
                                //构建表格数据
                                build_table_data(result);
                            }

                        } else {
                            alert(result.extend.msg);
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
                var currenthours = date.getHours();
                var currentminut = date.getMinutes();
                //getFullYear得到4位数的年份 ，返回一串字符串
                return date.getFullYear() + "年" + month + currentDate + " " + currenthours + ":"
                        + currentminut;
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
                return date.getFullYear() + "-" + month + currentDate + " " + currenthours + ":"
                        + currentminut + ":" + currentSeconds;
            } else {
                return null;
            }
        }

        function checkStr(str) {
            // [\u4E00-\uFA29]|[\uE7C7-\uE7F3]汉字编码范围 
            var re1 = new RegExp("^([\u4E00-\uFA29]|[\uE7C7-\uE7F3])*$");
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