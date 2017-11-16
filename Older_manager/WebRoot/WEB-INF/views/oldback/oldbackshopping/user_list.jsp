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

<title>用户列表</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />



<link href="${APP_PATH}/static/shop/assets/css/codemirror.css" rel="stylesheet">
<link rel="stylesheet" href="${APP_PATH}/static/shop/assets/css/ace.min.css" />
<link rel="stylesheet" href="${APP_PATH}/static/shop/assets/css/font-awesome.min.css" />
<script src="${APP_PATH}/static/shop/assets/js/jquery.min.js"></script>
<script type="text/javascript">
    window.jQuery
            || document.write("<script src='./static/shop/assets/js/jquery-2.0.3.min.js'>"
                    + "<"+"/script>");
</script>
<script type="text/javascript">
    if ("ontouchend" in document)
        document.write("<script src='./static/shop/assets/js/jquery.mobile.custom.min.js'>"
                + "<"+"/script>");
</script>
<script src="${APP_PATH}/static/shop/assets/js/typeahead-bs2.min.js"></script>
<!-- page specific plugin scripts -->
<script src="${APP_PATH}/static/shop/assets/js/jquery.dataTables.min.js"></script>
<script src="${APP_PATH}/static/shop/assets/js/jquery.dataTables.bootstrap.js"></script>
<script type="text/javascript" src="${APP_PATH}/static/shop/js/H-ui.js"></script>
<script type="text/javascript" src="${APP_PATH}/static/shop/js/H-ui.admin.js"></script>
<script src="${APP_PATH}/static/shop/assets/layer/layer.js" type="text/javascript"></script>
<script src="${APP_PATH}/static/shop/assets/laydate/laydate.js" type="text/javascript"></script>

<link rel="stylesheet" href="${APP_PATH}/static/shop/css/style1.css" />
<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script src="${APP_PATH}/lib/layer/2.4/layer.js"></script>
<script src="${APP_PATH}/lib/jquery.validation/1.14.0/validate-methods.js"></script>
<script src="${APP_PATH}/lib/jquery.validation/1.14.0/jquery.validate.js"></script>

<style>
.error {
	color: red;
}
</style>
</head>

<body>
	<div class="page-content clearfix">
		<div id="Member_Ratings">
			<div class="d_Confirm_Order_style">
				<div class="search_style">
					<div class="title_names">搜索查询</div>
					<ul class="search_content clearfix">
						<li>
							<label class="l_f">会员名称</label>
							<input name="" type="text" class="text_add" placeholder="输入会员名称、电话、邮箱" style=" width:400px" id="username" />
						</li>
						<li>
							<label class="l_f">添加时间</label>
							<input class="inline laydate-icon" id="start" style=" margin-left:10px;">
						</li>
						<li style="width:90px;">
							<button type="button" class="btn_search" id="search">
								<i class="icon-search"></i>查询
							</button>
						</li>
					</ul>
				</div>
				<!---->
				<div class="border clearfix">
					<span class="l_f"> <a href="javascript:ovid()" id="member_add" class="btn btn-warning">
							<i class="icon-plus"></i>添加用户
						</a> <a class="btn btn-danger" id="delete_all_but">
							<i class="icon-trash"></i>批量删除
						</a>
					</span> <span class="r_f">共：<b id="counts"></b>条
					</span>
				</div>
				<!---->
				<!-- <div class="table_menu_list">
					
				</div> -->
				<!--会员列表  -->
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
					<div class="col-md-5 " id="page_nav"></div>
				</div>
			</div>
		</div>
	</div>
	<!--添加用户图层-->
	<div class="add_menber" id="add_menber_style" style="display:none">
		<form id="add_users_form" class="form-inline">
			<div class="">
				<table class="table table-bordered table-hover">
					<tr>
						<input type="hidden" name="id" id="id">
						<td><label for="account">
								用户名：
								<label style="color: red">*</label>
							</label></td>
						<td colspan="1" float="left"><input id="account" name="account" type="text" /></td>
						<td><label for="nickname">
								昵称：
								<label style="color: red">*</label>
							</label></td>
						<td><input type="text" name="nickname" id="nickname" /></td>
					</tr>
					<tr>
						<td><label for="password">
								密码：
								<label style="color: red">*</label></td>
						<td><input name="password" id="password" type="password" /></td>
						<td><label for="password2">
								再次输入密码：
								<label style="color: red">*</label></td>
						<td><input name="password2" id="password2" type="password" /></td>

					</tr>
					<tr>
						<td><label for="realname">
								真实姓名：
								<label style="color: red">*</label></td>
						<td><input name="realname" id="realname" type="text" /></td>
						<td><label for="sex">
								性别：
								<label style="color: red">*</label>
							</label></td>
						<td><label>
								<input name="sex" id="sexman" type="radio" value="男" checked="checked">
								<span class="lbl">男</span>
							</label>&nbsp; <label>
								<input name="sex" id="sexwomen" value="女" type="radio" class="ace">
								<span class="lbl">女</span>
							</label>&nbsp;<label>
								<input name="sex" id="sexno" value="保密" type="radio" class="ace">
								<span class="lbl">保密</span>
							</label></td>

					</tr>
					<tr>
						<td><label for="phone">
								移动电话：
								<label style="color: red">*</label></td>
						<td><input name="phone" id="phone" type="text" /></td>
						<td><label for="email">
								电子邮箱：
								<label style="color: red">*</label></td>
						<td><input name="email" id="email" type="text" /></td>

					</tr>
					<tr>
						<td><label for="idcard">
								身份证：
								<label style="color: red">*</label></td>
						<td><input name="idcard" id="idcard" type="text" /></td>

					</tr>
					<td><label for="sex">
							状态：
							<label style="color: red">*</label>
						</label></td>
					<td><label>
							<input name="column5" id="open" type="radio" value="1" checked="checked">
							<span class="lbl">开启</span>
						</label>&nbsp; <label>
							<input name="column5" id="diss" value="0" type="radio" class="ace">
							<span class="lbl">禁用</span>
						</label></td>
				</table>
			</div>
		</form>
	</div>


	<script type="text/javascript">
        jQuery(function($) {
            go(1);
            $('[data-rel="tooltip"]').tooltip({
                placement : tooltip_placement
            });
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
        })
        /*用户-添加*/
        $('#member_add').on('click', function() {
            layer.open({
                type : 1,
                title : '添加用户',
                maxmin : true,
                offset : [ '5%' ],
                shadeClose : true, //点击遮罩关闭层
                area : [ '800px', '' ],
                content : $('#add_menber_style'),
                btn : [ '提交', '取消' ],
                yes : function(index, layero) {
                    if (validateForm().form()) {
                        $.ajax({
                            url : "${APP_PATH}/ShopMember/addShopMember",
                            type : "post",
                            data : $("#add_users_form").serialize(),
                            success : function(result) {
                                if (result.code == 100) {

                                    layer.msg("添加用户会员成功！", {
                                        icon : 6,
                                        time : 1000,
                                        offset : [ '35%' ]
                                    });
                                    //layer.close();
                                    $("#add_users_form")[0].reset();
                                    //2.重新加载当页
                                    go(currentNum);

                                } else {
                                    layer.open({
                                        title : '添加提示',
                                        content : '添加用户会员失败！'
                                    });
                                }
                            }
                        });
                    } else {

                    }
                },
                btn2 : function(index, layero) {
                    $("#add_users_form")[0].reset();
                },
            });
        });

        function validateForm() {
            return $("#add_users_form").validate({
                debug : true, //调试模式取消submit的默认提交功能   
                //errorClass: "label.error", //默认为错误的样式类为：error   
                onfocusout : true,
                onkeyup : false,
                rules : {
                    account : {
                        required : true
                    },
                    password : {
                        required : true,
                        rangelength : [ 5, 10 ]
                    },
                    password2 : {
                        required : true,
                        equalTo : "#password"
                    },
                    realname : {
                        required : true,
                        isChinese : true
                    },
                    sex : {
                        required : true,
                    },
                    idcard : {
                        required : true,
                        isIdCardNo : true
                    },
                    phone : {
                        required : true,
                        isMobile : true
                    },
                    email : {
                        required : true,
                        email : true
                    },
                    column5 : {
                        required : true,
                    }
                },
                messages : {
                    account : {
                        required : "必填"
                    },
                    password : {
                        required : "必填",
                        rangelength : "密码必须大于5位，小于10位"
                    },
                    password2 : {
                        required : "必填",
                        equalTo : "两次输入密码不相同!",
                    },
                    nickname : {
                        required : "必填",
                    },
                    realname : {
                        required : "必填",
                        isChinese : "请输入中文!"
                    },
                    sex : {
                        required : "必填"
                    },
                    idcard : {
                        required : "必填",
                        isIdCardNo : "请输入正确的身份证!"
                    },
                    phone : {
                        required : "必填",
                        isMobile : "请输入正确的电话号码!"
                    },
                    email : {
                        required : "必填",
                        email : "请输入正确的邮箱格式!"
                    },
                    column5 : {
                        required : "必填"
                    }
                }
            });
        };

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

            var Td1 = $("<td></td>").append("id").addClass("sorting_asc");
            var Td2 = $("<td></td>").append("用户名");
            var Td3 = $("<td></td>").append("性别");
            var Td4 = $("<td></td>").append("手机");
            var Td5 = $("<td></td>").append("邮箱");
            var Td6 = $("<td></td>").append("地址");
            var Td7 = $("<td></td>").append("加入时间");
            var Td8 = $("<td></td>").append("等级");
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
                if (item.shippingaddress == null) {
                    var dataTd6 = $("<td></td>").append('无');
                } else {
                    var dataTd6 = $("<td></td>").append(item.shippingaddress.detailaddress);
                }
                ;

                var dataTd7 = $("<td></td>").append(ChangeDateFormat2(item.jointime));
                var dataTd8 = $("<td></td>").append(item.level);
                if (item.users.column5 == 1) {
                    var dataTd9 = $("<td></td>").append(
                            "<span class='label label-success radius'>已启用</span>");
                } else if (item.users.column5 == 0) {
                    var dataTd9 = $("<td></td>").append(
                            "<span class='label label-defaunt radius'>禁用</span>");
                    console.log(item.users.column5);
                } else {
                    var dataTd9 = $("<td></td>").append(
                            "<span class='label label-warning radius'>未设置</span>");
                }

                var open_btn = $("<button type='button'></button>").addClass(
                        "btn btn-sm btn-success courseview-btn").append(
                        $("<span></span>").addClass("glyphicon glyphicon-search")).append("启用");
                var edit_btn = $("<button type='button'></button>").addClass(
                        "btn btn-sm btn-success  courseview-btn").append(
                        $("<span></span>").addClass("glyphicon glyphicon-pencil")).append("修改");
                var delet_btn = $("<button type='button'></button>").addClass(
                        "btn btn-sm btn-danger").append(
                        $("<span></span>").addClass("glyphicon glyphicon-trash")).append("删除");
                edit_btn.attr("noticeId", item.users.id);
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

                //编辑信息按钮，弹出模态框
                edit_btn.click(function() {
                    $.ajax({
                        url : "ShopMember/findUserByid?id=" + edit_btn.attr("noticeId"),
                        type : "get",
                        success : function(result) {
                            if (result.code == 100) {
                                var users = result.extend.user;
                                $("#id").val(users.id);
                                $("#account").val(users.account);
                                $("#password").val(users.password);
                                $("#password2").val(users.password);
                                $("#nickname").val(users.nickname);
                                $("#realname").val(users.realname);
                                $("#idcard").val(users.idcard);
                                $("#phone").val(users.phone);
                                $("#email").val(users.email);
                                $("#add_users_form input[name='sex']").val([ users.sex ]);
                                $("#add_users_form input[name='column5']").val([ users.column5 ]);
                                layer.open({
                                    type : 1,
                                    title : '修改用户',
                                    maxmin : true,
                                    offset : [ '5%' ],
                                    shadeClose : true, //点击遮罩关闭层
                                    area : [ '800px', '' ],
                                    content : $('#add_menber_style'),
                                    btn : [ '修改', '取消' ],
                                    yes : function(index, layero) {
                                        if (validateForm().form()) {
                                            $.ajax({
                                                url : "${APP_PATH}/ShopMember/modifyShopMember",
                                                type : "post",
                                                data : $("#add_users_form").serialize(),
                                                success : function(result) {
                                                    if (result.code == 100) {

                                                        layer.msg("修改用户信息成功！", {
                                                            icon : 6,
                                                            time : 1000,
                                                            offset : [ '35%' ]
                                                        });
                                                        //layer.close();
                                                        $("#add_users_form")[0].reset();
                                                        //2.重新加载当页
                                                        go(currentNum);

                                                    } else {
                                                        layer.open({
                                                            title : '修改提示',
                                                            content : '修改用户失败！'
                                                        });
                                                    }
                                                }
                                            });
                                        } else {

                                        }
                                    },
                                    btn2 : function(index, layero) {
                                        $("#add_users_form")[0].reset();
                                    },
                                });
                            } else {
                                layer.open({
                                    title : '获取数据提示',
                                    content : '没有相关数据！'
                                });
                            }
                        }
                    });

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
                                $("<td></td>").append(edit_btn).append(open_btn).append(delet_btn))
                        .appendTo($("#table_data"));
            });
        }

        //全选
        $(document).on("click", "#check_item_all", function() {
            $(".item_check").prop("checked", $(this).prop("checked"));
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
                if (confirm("确认删除【id为" + del_idshow + " ，姓名为：" + empNames + "】的所有会员吗?")) {
                    //发送ajax请求删除
                    $.ajax({
                        url : "notice/delectNoticeByListI/",
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
                            }
                        }
                    });
                }
            } else {
                layer.open({
                    offset : [ '10%' ],
                    title : '批量删除提示',
                    content : '请选择要删除的会员！'
                });
            }
        });

        //搜索按钮
        $("#search").click(function() {
            search(1);
        });

        function search(pn) {
            var dtitle = $('#username').val();//获取值
            var dreleasepeople = $('#start').val();

            if (dtitle.length == 0 && dreleasepeople.length == 0) {
                //alert("请输入搜索数据！");
                layer.open({
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
                        "startTime" : dreleasepeople,
                        "pn" : pn
                    },
                    type : "get",
                    success : function(result) {
                        setTimeout(function() {
                            layer.closeAll('loading');
                        }, 500);
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