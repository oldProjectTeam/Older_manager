Sys.MainFlag = true;
Sys.TabFlag = true;
var select_span_wait_id = "#span_wait";
var select_menu_id = "#wnav";
var select_menu_id_p = "#mnavp";
var select_menu_li_div = "#wnav li div";
var select_bgclock_id = "#bgclock";
var select_topmenu_id = "#topmenu";
var select_topmenu_link = "#topmenu a";
var select_topmenu_link_first = "#topmenu a:first";
var topmenu_link_frist_name = "kall";
var select_editpass_id = "#editpass";
var select_loginOut_id = "#loginOut";
var select_firstIframe_id = "#firstIframeID";
var select_tabs_id = "#tabs";
var select_tabs_mm_id = "#mm";



var select_tabs_mm_tabupdate_id = "#mm-tabupdate";
var select_tabs_mm_tabclose_id = "#mm-tabclose";
var select_tabs_mm_tabcloseall_id = "#mm-tabcloseall";
var select_tabs_mm_tabcloseright_id = "#mm-tabcloseright";
var select_tabs_mm_tabcloseleft_id = "#mm-tabcloseleft";
var select_tabs_mm_exit_id = "#mm-exit";
var curIframeID = "ifid";
var loginOut_action_link = '/Home/Index';
var UserPowerList_action_link = '/Authed/LoadUserPowerList';
var winLoad_action_link = '/Authed/LoadView';
var download_action_link = '/Authed/DownLoadView';
var select_download_id = "#divDownLoad";
var select_iframedownload_id = "#iframeDownLoad";
var firstTapName = "系统首页";
var virpath = "";
var loadMenuok = false;
var m_UserSoftList = "";
try {
    m_UserSoftList = UserSoftList || '';
    if (!(m_UserSoftList.length > 0)) {
        m_UserSoftList = '';
    }
}
catch (dd) {
    m_UserSoftList = "";
}
var HubLogoutFlag = false;
var HubActiveFlag = false;
var FailtActiveNum = 0;
var PostFlag = 0;
try {
    PostFlag = DoPostMsgFlag;
}
catch (d) {
}

try {
    if (PostFlag == 1) {
        var hub = $.connection.kingonAppHub;
        hub.client.clientActive = function (ActiveFlag) {
            try {
                ActiveFlag = true
            } catch (d) { }
            return true
        };
        hub.client.sendTelnoCallResult = function (result) {
            try {
                DoRecvTelnoCallResult(top, result)
            } catch (d) { }
        };
        hub.client.recvMsgPopCallState = function (CallID, CallState) {
            try {
                RecvMsgPopCallState(top, CallID, CallState)
            } catch (d) { }
        };
        hub.client.recvMsg = function (message) {
            try {
                RecvAppHubMsg(top, message)
            } catch (d) { }
        };
        hub.client.recvMsgRegSip = function (loginid, loginpass, regserverip, regserverport) {
            try {
                RegisterSip(loginid, loginpass, regserverip, regserverport);
            } catch (d) { }
        };
        hub.client.recvMsgPop = function (UserID, RoleID, CallerID, CallListID) {
            try {
                RecvMsgPopCallState(top, CallerID, '-1');
            } catch (d) { }		
            try {
                var url = "/DynaForm/97/977?op=Add&UserID=" + UserID + "&RoleID=" + RoleID + "&CallerID=" + CallerID + '&CallListID=' + CallListID;
                OpenUrl(KingonUI.Core.getIframeID(), "来电信息", url, "", 0, 1024, 600);
            } catch (d) { }
        };
        hub.client.recvLogout = function () {
            try {
                HubLogoutFlag = true;
                $.messager.alert('系统提示', '该用户已经在其它场合登录进入系统，系统将退出！', '', function (r) {
                    location.href = loginOut_action_link
                })
            } catch (d) { }
        };
        hub.client.joined = function (connectionid, userid) {
            try {
                AppHubUserLogin(top, userid)
            } catch (d) { }
        };
        hub.client.leave = function (connectionid, userid) {
            try {
                AppHubUserLogout(top, userid)
            } catch (d) { }
        };
        hub.client.rejoined = function (connectionid, userid) { };
        $.connection.hub.start().done(function () {
            HubActiveFlag = true;
            FailtActiveNum = 0
        });
        setInterval(HubStart, "12000")
    }
} catch (dd) { }

function HubStart() {
    try {
        if (HubLogoutFlag)
            return;
        if (!HubActiveFlag) {
            try {
                $.connection.hub.start().done(function () {
                    HubActiveFlag = true;
                    FailtActiveNum = 0
                })
            } catch (d) { }
            FailtActiveNum++;
            if (FailtActiveNum > 10) {
                FloginOut()
            }
        } else {
            try {
                var hub = $.connection.kingonAppHub;
                hub.server.clientActive(KingonUI.Core.GetUserID());
                FailtActiveNum = 0
            } catch (d) {
                FailtActiveNum++
            }
            if (FailtActiveNum > 5) {
                FailtActiveNum = 0;
                HubActiveFlag = false
            }
        }
    } catch (d) { }
    try { } catch (d) { }
}

function FloginOut() {
    login()
};


function DoRecvTelnoCallResult(win, message) {
    try {
        win.RecvTelnoCallResult(message)
    } catch (d) { }
    for (var i = 0; i < win.frames.length; i++) {
        DoRecvTelnoCallResult(win.frames[i], message)
    }
}
function doRecvMsgPopCallState(CallID, CallState) {
    //alert("电话号码：" + CallID +"状态:"+ CallState);
}
function doRecvAppHubMsg(message) { }

function AppHubUserLogout(win, userid) {
    try {
        win.doAppHubUserLogout(userid)
    } catch (d) { }
    for (var i = 0; i < win.frames.length; i++) {
        AppHubUserLogout(win.frames[i], userid)
    }
}

function AppHubUserLogin(win, userid) {
    try {
        win.doAppHubUserLogin(userid)
    } catch (d) { }
    for (var i = 0; i < win.frames.length; i++) {
        AppHubUserLogin(win.frames[i], userid)
    }
}


function RecvMsgPopCallState(win, CallID, CallState) {
    try {
        win.doRecvMsgPopCallState(CallID, CallState)
    } catch (d) { }
    for (var i = 0; i < win.frames.length; i++) {
        RecvMsgPopCallState(win.frames[i], CallID, CallState)
    }
}

function RecvAppHubMsg(win, message) {
    try {
        win.doRecvAppHubMsg(message)
    } catch (d) { }
    for (var i = 0; i < win.frames.length; i++) {
        RecvAppHubMsg(win.frames[i], message)
    }
}

function SendRegOk(LoginID) {
    try {
        hub.server.sendRegOK(LoginID);
    } catch (d) { }
}
/*
用户拨打电话 telno是坐席编号则打给坐席，如果telno是电话则打给电话
top.SendTelnoCall(telno)
*/
function SendTelnoCall(telno) {
    try {
        SendTelnoCallLink(telno, '', '');
    } catch (d) { }
}
function SendTelnoCallLink(telno, SrcType, SrcLinkID) {
    try {
        hub.server.sendTelnoCall(telno, SrcType, SrcLinkID);
    } catch (d) { }
}
/*
班长监听坐席的电话UserID是通话的用户
top.sendTelnoListen(UserID)
*/
function sendTelnoListen(UserID) {
    try {
        hub.server.sendTelnoListen(UserID);
    } catch (d) { }
}
/*
坐席自己挂断自己的通话，如果只挂自己，则可不提供UserID
top.sendTelnoHangUp()
*/
function sendTelnoHangUp(UserID) {
    try {
        hub.server.sendTelnoHangUp(UserID);
    } catch (d) { }
}
/*
强制挂断对方通话 UserID是通话的用户，用于班长强制挂断坐席通话
top.sendTelnoDestroy(UserID)
*/
function sendTelnoDestroy(UserID) {
    try {
        hub.server.sendTelnoDestroy(UserID);
    } catch (d) { }
}
/*
转移给其它用户 telno如果是用户编号则是转给坐席，如果telno是电话号码，则转给电话
top.sendTelnoTransfer(tleno)
*/
function sendTelnoTransfer(telno) {
    try {
        hub.server.sendTelnoTransfer(telno);
    } catch (d) { }
}

function SendAppHubMsg(UserID) {
    try {
        hub.server.SendAppHubMsg(UserID)
    } catch (d) { }
}

function CheckMenu() {
    if (!loadMenuok) {
        setTimeout("CheckMenu()", 12000);
        try {
            var firstMenuName = topmenu_link_frist_name;
            try {
                if ($(select_topmenu_id).val() != undefined) {
                    firstMenuName = $(select_topmenu_link_first).attr('name')
                }
            } catch (dd) { }
            addNav(_menus[firstMenuName]);
            hoverMenuItem();
            if ($(select_span_wait_id).val() != undefined) {
                $(select_span_wait_id).hide()
            }
        } catch (dd) { }
    }
};

function DoActive() {

    setInterval(active, "8000")
}

function active() {

    try {
        $.ajax({
            type: "POST",
            url: "/Authed/DoActive",
            data: "Type=active&num=" + Math.random()
        })
    } catch (d) { }
}

function ShowTopLogo(flag) {
    try {
        if (flag) {
            $('#toplogo').show()
        } else {
            $('#toplogo').html("");
            $('#toplogo').hide()
        }
    } catch (d) { }
}
$(function () {
    try {
        DoActive()
    } catch (d) { }
    try {
        $('body').layout()
    } catch (d) { }
    try {
        OpenDownLoad("", download_action_link);
        $(select_download_id).window('close')
    } catch (d) { }
    try {
        if (window != top) top.location.href = location.href;
        tabClose();
        tabCloseEven();
        if ($(select_topmenu_id).val() != undefined) {
            $(select_topmenu_link).click(function () {
                $(select_topmenu_link).removeClass('active');
                $(this).addClass('active');
                var d = _menus[$(this).attr('name')];
                Clearnav();
                addNav(d);
                hoverMenuItem()
            })
        }
        $(select_menu_id).accordion({
            animate: false
        });
        if ($(select_bgclock_id).val() != undefined) {
            clockon()
        }
        $(select_editpass_id).click(function () {
            if (Sys.TabFlag) openApp("/Authed/UpdateMyPass", 2, "修改密码", null);
            else openApp("/Authed/UpdateMyPass", 5, "修改密码", null)
        });
        $(select_loginOut_id).click(function () {
            loginOut()
        });
        try {
            var m_CThemeCode = '';
            try {
                m_CThemeCode = CThemeCode || '';
            }
            catch (d) {
                m_CThemeCode = '';
            }
            var cccc = "/Authed/Welcome?CorpCode=" + m_CThemeCode;
            $('#home').html(createFrame(cccc))
        } catch (d) { }
        try {
            $('#divDownLoad').html("<iframe id=\"iframeDownLoad\" scrolling=\"auto\" frameborder=\"0\" style=\"width: 100%;height: 100%;\"></iframe>")
        } catch (d) { }
    } catch (ddd) { }
});

function loginOut() {
    $.messager.confirm('系统提示', '您确定要退出本次登录吗?', function (r) {
        if (r) {
            location.href = loginOut_action_link
        }
    })
};

function ClickMenu1(varr) {
    try {
        var tabTitle = $(varr).parent().text();
        var url = $(varr).attr("rel");
        var menuid = $(varr).attr("ref");
        var mtype = $(varr).attr("mtype");
        if (!(mtype == 5 || mtype == 4 || mtype == 3 || mtype == 2 || mtype == 1)) {
            mtype = 0
        }
        var icon = getIcon(menuid, icon);
        openApp(url, mtype, tabTitle, icon);
        $(select_menu_li_div).removeClass("selected");
        $(varr).parent().addClass("selected")
    } catch (ddd) { }
};

function ClickMenu2(varr) {
    try {
        $(select_menu_li_div).removeClass("selected");
        $(varr).parent().addClass("selected");
        $(varr).parent().parent().next("ul").toggle()
    } catch (ddd) { }
};

function ClickMenuNav(varr) {
    try {
        var tabTitle = $(varr).attr("ren");
        var url = $(varr).attr("rel");
        var menuid = $(varr).attr("ref");
        var mtype = $(varr).attr("mtype");
        if (!(mtype == 5 || mtype == 4 || mtype == 3 || mtype == 2 || mtype == 1)) {
            mtype = 0
        }
        var icon = getIcon(menuid);
        openApp(url, mtype, tabTitle, icon);
        $(select_menu_li_div).removeClass("selected");
        $(varr).parent().addClass("selected")
    } catch (ddd) { }
};

function ClickMenu(varr) {
    try {
        var tabTitle = $(varr).children('.nav').text();
        var url = $(varr).attr("rel");
        var menuid = $(varr).attr("ref");
        var mtype = $(varr).attr("mtype");
        if (!(mtype == 5 || mtype == 4 || mtype == 3 || mtype == 2 || mtype == 1)) {
            mtype = 0
        }
        var icon = getIcon(menuid);
        openApp(url, mtype, tabTitle, icon);
        $(select_menu_li_div).removeClass("selected");
        $(varr).parent().addClass("selected")
    } catch (ddd) { }
};

function Clearnav() {
    try {
        var pp = $(select_menu_id).accordion('panels');
        while (pp) {
            $.each(pp, function (i, n) {
                if (n) {
                    var t = n.panel('options').title;
                    $(select_menu_id).accordion('remove', t)
                }
            });
            pp = $(select_menu_id).accordion('panels');
            if (pp == null) break;
            if (pp == '') break;
            if (pp == "") break;
            if (pp.toString() == '') break;
            if (pp.toString() == "") break
        }
        pp = $(select_menu_id).accordion('getSelected');
        if (pp) {
            var title = pp.panel('options').title;
            $(select_menu_id).accordion('remove', title)
        }
    } catch (ddd) { }
};
function GetMenuList(data, menulist) {
    try {
        if (data.menus == null) return menulist;
        else {
            menulist += '<ul>';
            $.each(data.menus, function (i, sm) {
                if (sm.menus == null) {
                    if (sm.url != null) {
                        menulist += '<li ><a onclick="ClickMenu(this);" mtype="' + sm.menutype + '" ref="' + sm.menuid + '" href="#" rel="' + sm.url + '" ><span class="nav"><n id="menu_content_' + sm.menuid + '">' + sm.menuname + '</n></span></a></li>'
                    } else {
                        menulist += '<li state="closed" ><span class="nav"><n id="menu_content_' + sm.menuid + '">' + sm.menuname + '</n></span></li>'
                    }
                } else {
                    if (sm.url != null) {
                        menulist += '<li state="closed"><span ><a onclick="ClickMenu1(this);" mtype="' + sm.menutype + '" ref="' + sm.menuid + '" href="#" rel="' + sm.url + '" ><n id="menu_content_' + sm.menuid + '">' + sm.menuname + '</n></a></span>'
                    } else {
                        menulist += '<li state="closed"><span class="nav"><a onclick="ClickMenu2(this);" mtype="' + sm.menutype + '" ><n id="menu_content_' + sm.menuid + '">' + sm.menuname + '</n></a></span>'
                    }
                    menulist = GetMenuList(sm, menulist);
                    menulist += '</li>'
                }
            });
            menulist += '</ul>'
        }
        return menulist
    } catch (ddd) { }
};
function ClickAccordion(subtitle, url, icon, mtype) {
    if (!(mtype == 5 || mtype == 4 || mtype == 3 || mtype == 2 || mtype == 1)) {
        mtype = 0
    }
    openApp(url, mtype, subtitle, icon)
}
function setShowFE(ShowF, ShowE) {
    //alert('ShowF=' + ShowF + ',ShowE=' + ShowE);
    _ShowF = ShowF;
    _ShowE = ShowE;
    Clearnav();
    var firstMenuName = topmenu_link_frist_name;
    try {
        if ($(select_topmenu_id).val() != undefined) {
            firstMenuName = $(select_topmenu_link_first).attr('name')
        }
    } catch (dd) { };
    Clearnav();
    addNav(_menus[firstMenuName]);
}
var _ShowN = 0;
var _ShowF = 0;
var _ShowE = 0;
var _BakMenuData;
function LoodaddNav() {
    _ShowF = 0;
    _ShowE = _ShowN;
    Clearnav();
    addNav(_BakMenuData);
}
var firstFlag =0;
var selectNodeOK=0;
function addNav(data) {
    try {
        _BakMenuData = data;
        //alert(data.length);
        //if (data.length > (_ShowN + 2)) {
        if (_ShowN > 0 && data.length > (_ShowN + 2)) {

            if (_ShowF > 0) {
                var menulist1 = "";
                menulist1 = "<ul id='tt' data-options=\"lines:true\"></ur>";
                var bn = 0;
                var en = _ShowN;
                if (_ShowF - _ShowN > 0) {
                    var bn = _ShowF - _ShowN;
                    var en = _ShowF;
                }
                //var title = "<a  onmouseover=\"setShowFE(" + bn + "," + en + ")\" onclick=\"setShowFE(" + bn + "," + en + ")\" >更多功能.......</a>";
                var title = "<a  onclick=\"setShowFE(" + bn + "," + en + ")\" >更多功能.......</a>";
                $(select_menu_id).accordion('add', {
                    title: title,
                    content: menulist1,
                    onSelect: function (title, index) {
                        alert('这里');
                    }
                })
            }
            for (var i = _ShowF; i < _ShowE; i++) {
                var sm = data[i];
                var menulist1 = "";
                menulist1 = GetMenuList(sm, menulist1);
                if (menulist1.length > 0) {
                    menulist1 = "<ul id='tt' class='easyui-tree' data-options=\"lines:true\">" + menulist1.substring(4);
                    var title = "<n id='menu_content_" + sm.menuid + "'>" + sm.menuname + "</n>";
                    if (!KingonUI.Core.isNullOrEmpty(sm.url)) title = "<a  onclick=\"ClickAccordion('" + sm.menuname + "','" + sm.url + "','" + sm.bicon + "','" + sm.menutype + "')\" ><n id='menu_content_" + sm.menuid + "'>" + sm.menuname + "</n></a>";
                    $(select_menu_id).accordion('add', {
                        title: title,
                        content: menulist1,
                        iconCls: 'icon ' + sm.bicon,
                        onSelect: function (title, index) {
                            alert(index);
                        }
                    })
                }
                else {
                    var title = "<n id='menu_content_" + sm.menuid + "'>" + sm.menuname + "</n>";
                    if (!KingonUI.Core.isNullOrEmpty(sm.url)) title = "<a  onclick=\"ClickAccordion('" + sm.menuname + "','" + sm.url + "','" + sm.bicon + "','" + sm.menutype + "')\" ><n id='menu_content_" + sm.menuid + "'>" + sm.menuname + "</n></a>";
                    $(select_menu_id).accordion('add', {
                        title: title,
                        content: '',
                        iconCls: 'icon ' + sm.bicon,
                        onSelect: function (title, index) {
                            alert(index);
                        }
                    })
                }
            }

            if (_ShowE < data.length) {
                var menulist1 = "";
                menulist1 = "<ul id='tt' data-options=\"lines:true\"></ur>";
                var bn = 0;
                var en = _ShowN;
                if (_ShowE + _ShowN < data.length) {
                    bn = _ShowE;
                    en = _ShowE + _ShowN;
                }
                else {
                    bn = _ShowE;
                    en = data.length;
                }
                //var title = "<a  onmouseover=\"setShowFE(" + bn + "," + en + ")\" onclick=\"setShowFE(" + bn + "," + en + ")\" >更多功能.......</a>";
                var title = "<a onclick=\"setShowFE(" + bn + "," + en + ")\" >更多功能.......</a>";
                $(select_menu_id).accordion('add', {
                    title: title,
                    content: menulist1,
                    onSelect: function (title, index) {
                        alert('这里');
                    }
                })
            }
            try {
                var pp = $(select_menu_id).accordion('panels');
                var t = pp[0].panel('options').title;
                $(select_menu_id).accordion('select', t);
            }
            catch (d) {

            }
            loadMenuok = true;
            setTimeout(function () {
                $(select_menu_id).accordion({
                    onSelect: function (title, index) {
                        doaccordionClick(title, index);
                    }
                });
            },
            1000);
        }
        else {
            if (data.length > 10) {
                var ll = 20;
                if ((data.length + 5) > 20) {
                    ll = (data.length + 5);
                }
                var mmml = ll * 33;
                $(select_menu_id_p).panel({
                    height: mmml
                });

            }
            else {
                $(select_menu_id_p).panel({
                    width: 200
                });
            }


            $.each(data, function (i, sm) {
				/*
                var menulist1 = "";
                menulist1 = GetMenuList(sm, menulist1);
                if (menulist1.length > 0) {
                    menulist1 = "<ul id='tt' class='easyui-tree' data-options=\"lines:true\">" + menulist1.substring(4);
                    var title = "<n id='menu_content_" + sm.menuid + "'>" + sm.menuname + "</n>";
                    if (!KingonUI.Core.isNullOrEmpty(sm.url)) title = "<a  onclick=\"ClickAccordion('" + sm.menuname + "','" + sm.url + "','" + sm.bicon + "','" + sm.menutype + "')\" ><n id='menu_content_" + sm.id + "'>" + sm.menuname + "</n></a>";
                    $(select_menu_id).accordion('add', {
                        title: title,
                        content: menulist1,
                        iconCls: 'icon ' + sm.bicon,
                        onSelect: function (title, index) {
                            alert(index);
                        }
                    })
                }
                else {
                    var title = "<n id='menu_content_" + sm.menuid + "'>" + sm.menuname + "</n>";
                    if (!KingonUI.Core.isNullOrEmpty(sm.url)) title = "<a  onclick=\"ClickAccordion('" + sm.menuname + "','" + sm.url + "','" + sm.bicon + "','" + sm.menutype + "')\" ><n id='menu_content_" + sm.id + "'>" + sm.menuname + "</n></a>";
                    $(select_menu_id).accordion('add', {
                        title: title,
                        content: '',
                        iconCls: 'icon ' + sm.bicon,
                        onSelect: function (title, index) {
                            alert(index);
                        }
                    })
                }*/
				var pcontent='';
				if(firstFlag==0)
				{
					var menulist1 = "";
					menulist1 = GetMenuList(sm, menulist1);
					if (menulist1.length > 0) {
						pcontent = "<ul id='tt_"+sm.menuid+"' class='easyui-tree' data-options=\"lines:true\">" + menulist1.substring(4);
					}
					else
					{
						pcontent='';
					}
					firstFlag =1;
				}
			    else
				{
				    pcontent=sm.menuid;
				}
                var title = "<n id='menu_content_" + sm.menuid + "'>" + sm.menuname + "</n>";
                if (!KingonUI.Core.isNullOrEmpty(sm.url)) title = "<a  onclick=\"ClickAccordion('" + sm.menuname + "','" + sm.url + "','" + sm.bicon + "','" + sm.menutype + "')\" ><n id='menu_content_" + sm.id + "'>" + sm.menuname + "</n></a>";
                $(select_menu_id).accordion('add', {
                     title: title,
                     content: pcontent,
                      iconCls: 'icon ' + sm.bicon
                })					
            });
               $(select_menu_id).accordion({
                    onSelect: function (title, index) {
						try
						{
						    var pcontent=$(select_menu_id).accordion('getPanel',index).panel('body').html();
							if(!isNaN(pcontent))
							{
								var menulist1 = "";
								var menutop=null;
								$.each(_BakMenuData, function (i, sm) {
								    if(pcontent==sm.menuid)
									{
										menutop = sm;
										return false;
									}
								});
								if(menutop!=null)
								{
									menulist1 = GetMenuList(menutop, menulist1);
									var id=pcontent;
									if (menulist1.length > 0) {
										pcontent = "<ul id='tt"+id+"' class='easyui-tree' data-options=\"lines:true\">" + menulist1.substring(4);
										$(select_menu_id).accordion('getPanel',index).panel('body').html(pcontent);
										$('#tt'+id).tree();
										$('#tt'+id).hide();
										setTimeout(function () {
											$('#tt'+id).show();
										},
										700);
									}
									else
									{
										pcontent='';
										$(select_menu_id).accordion('getPanel',index).panel('body').html(pcontent);
									}		
								}								
							}
						}
						catch(d)
						{
						}
						if(selectNodeOK==1)
						{
							doaccordionClick(title, index);
						}
                    }
                });
				
				setTimeout(function () {
						selectNodeOK = 1;
						try {
							$(select_menu_id).accordion('select', 0);
						}
						catch (d) {

						}
				},
				2000);
            loadMenuok = true;

			/*
				try
				{
					var p = $(select_menu_id).accordion('getSelected');
					if (p){
						var index = $(select_menu_id).accordion('getPanelIndex', p);
						$(select_menu_id).accordion('unselect', index);
					}
					
				}
				catch(dd)
				{
					alert(dd);
				}*/
        }
    } catch (ddd) {
        setTimeout("LoodaddNav()", 200);
    }
};
function changeMenuName(menuidstr, colors)
{
    try
    {
        if (!colors)
            colors = "red";
        var arr = menuidstr.split(';');
        for (var i = 0; i < arr.length; i++) {
            var op = arr[i].split(':');
            var menuid = op[0];
            var menuv = op[1];
            var s = $('#menu_content_' + menuid).html();
            if (s.indexOf('<c style="color:' + colors) > 0)
            {
                s = s.substring(0, s.indexOf('<c style="color:' + colors));
            }
            $('#menu_content_' + menuid).html(s + '<c style="color:' + colors + '">【' + menuv + '】</c>');
        }
    }
    catch(d)
    {
        //alert(d);
    }
}
function doaccordionClick(title, index) {
    if (title.indexOf('ClickAccordion') > 0) {
        try {
            $(title).click();
        }
        catch (d) {
        }
    }
}
function hoverMenuItem() {
    try {
        $(".easyui-accordion").find('a').hover(function () {
            $(this).parent().addClass("hover")
        }, function () {
            $(this).parent().removeClass("hover")
        })
    } catch (ddd) { }
};
function GetMenu(menuid) {
    var menu1 = null;
    var nnnn = 0;
    $.each(_menus, function (i, n) {
        try {
            nnnn = nnnn + 1;
            var menu3 = null;
            menu3 = GetMenuLoop(n, menuid);
            if (menu3 != null) {
                menu1 = menu3;
                return false;
            }

        } catch (dddd) { }
    })
    return menu1;
}
function GetMenuLoop(m_menus, menuid) {
    var menu2 = null;
    $.each(m_menus, function (i, sm) {
        if (sm.menuid == menuid) {
            menu2 = sm;
            return false;
        }
        else
            if (!(sm.menus == null || sm.menus == undefined || sm.menus == 'undefined')) {
                menu2 = GetMenuLoop(sm.menus, menuid);
                if (menu2 != null)
                    return false;
            }
    });
    return menu2;
}
function getIconLoop(m_menus, menuid) {
    var icon = '';
    $.each(m_menus, function (a, b) {
        if (!(b.menuid == null || b.menuid == undefined || b.menuid == 'undefined')) {
            if (b.menuid == menuid) {
                icon = b.icon;
                return false
            } else {
                if (!(b.menus == null || b.menus == undefined || b.menus == 'undefined')) {
                    icon = getIconLoop(b.menus, menuid);
                    if (icon != '') {
                        return false
                    }
                }
            }
        } else {
            if (!(b.menus == null || b.menus == undefined || b.menus == 'undefined')) {
                icon = getIconLoop(b.menus, menuid);
                if (icon != '') {
                    return false
                }
            }
        }
    });
    return icon
};

function getIcon(menuid) {
    var icon = 'icon ';
    try {
        $.each(_menus, function (i, n) {
            try {
                var icon1 = getIconLoop(n, menuid);
                if (icon1 == '') {
                    icon1 = 'icon'
                }
                icon = icon1
            } catch (dddd) { }
        })
    } catch (ddd) { }
    return icon
};

function getNavMenuDivLoop(m_menus) {
    var div = '';
    $.each(m_menus, function (a, b) {
        try {
            if (b.navflag == '1') {
                if (b.navimg == '') {
                    var div1 = getNaveMenuSubLoop(b.menus);
                    if (div1 != '') {
                        div += '<div style="text-align: left">';
                        div += '<h2>' + b.menuname + '</h2>';
                        div += div1;
                        div += '</div><div style="clear: both"></div>'
                    }
                }
            }
            if (!(b.menus == null || b.menus == undefined || b.menus == 'undefined')) {
                div1 = getNavMenuDivLoop(b.menus);
                div += div1
            }
        } catch (dddd) { }
    });
    return div
};

function getNaveMenuSubLoop(m_menus) {
    var div = '';
    $.each(m_menus, function (a, b) {
        try {
            if (b.navflag == '1') {
                if (b.navimg != '') {
                    div += '<div class="box"><div onmouseover="this.className=\'change\'" onmouseout="this.className=\'normal\'" class="normal">';
                    div += '<a onclick="top.ClickMenuNav(this);" mtype="' + b.menutype + '" ref="' + b.menuid + '" href="#" rel="' + b.url + '" ren="' + b.menuname + '" title=\'' + b.menuname + '\'>';
                    div += '<img id="m_navimg_' + b.menuid + '" src=\'/Content/images/Menu/' + b.navimg + '.png\' alt=\'\' width=\'62\' height=\'62\' border=\'0\' class=\'img01\' /></a></div>';
                    div += '<span>' + KingonUI.Core.ShowStrLen(b.menuname, 8) + '</span></div>'
                }
            } else {
                if (!(b.menus == null || b.menus == undefined || b.menus == 'undefined')) {
                    var div1 = getNaveMenuSubLoop(b.menus);
                    div += div1
                }
            }
        } catch (dddd) { }
    });
    return div
};

function getNavDivFromIDLoop(m_menus, id) {
    var div = '';
    $.each(m_menus, function (a, b) {
        try {
            if (b.menuid == id) {
                var div1 = getNaveMenuSubLoop(b.menus);
                div += div1
            } else {
                if (!(b.menus == null || b.menus == undefined || b.menus == 'undefined')) {
                    var div1 = getNavDivFromIDLoop(b.menus, id);
                    div += div1
                }
            }
        } catch (dddd) { }
    });
    return div
};

function getNavDivFromID(id) {
    var div = '';
    try {
        $.each(_menus, function (i, n) {
            try {
                div1 = getNavDivFromIDLoop(n, id);
                div += div1
            } catch (dddd) { }
        })
    } catch (ddd) { }
    return div
};

function CheckMenuUrlLoop(m_menus, url) {
    var flag = false;
    try {
        if (m_menus.url == url) {
            return true
        }
    } catch (d) { }
    try {
        $.each(m_menus, function (i, n) {
            var i = CheckMenuUrlLoop(n, url);
            if (i) {
                flag = true;
                return true
            }
        })
    } catch (ddd) { }
    return flag
};

function CheckMenuUrl(url) {
    var flag = false;
    try {
        $.each(_menus, function (i, n) {
            var i = CheckMenuUrlLoop(n, url);
            if (i) {
                flag = true;
                return true
            }
        })
    } catch (ddd) { }
    return flag
};

function getNavMenuDiv() {
    var div = '';
    try {
        $.each(_menus, function (i, n) {
            try {
                div1 = getNavMenuDivLoop(n);
                div += div1
            } catch (dddd) { }
        })
    } catch (ddd) { }
    return div
};

function OpenDownLoad(subtitle, url) {
    $(select_iframedownload_id).attr('src', url);
    $(select_download_id).window({
        width: 400,
        modal: true,
        title: subtitle,
        minimizable: false,
        draggable: true,
        height: 200,
        onClose: function () {
            $(select_iframedownload_id).attr('src', download_action_link)
        }
    })
};

function addTab(subtitle, url, icon) {
    try {
        if (subtitle == '来电弹屏'||'来电信息'==subtitle) {
            subtitle = '<c style="color:red">'+subtitle+'</c>';
        }		
        if (!$(select_tabs_id).tabs('exists', subtitle)) {
            $(select_tabs_id).tabs('add', {
                title: subtitle,
                content: createFrame(url),
                closable: true,
                icon: icon
            })
        } else {
            $(select_tabs_id).tabs('close', subtitle);
            $(select_tabs_id).tabs('add', {
                title: subtitle,
                content: createFrame(url),
                closable: true,
                icon: icon
            })
        }
        tabClose()
    } catch (ddd) { }
};

function tabCloseCur(id) {
    try {
        var currTab = $('#tabs').tabs('getSelected');
        var idc = $(currTab.panel('options').content).attr('id');
        if (idc == id) {
            $(select_tabs_id).tabs('close', currTab.panel('options').title)
        }
    } catch (d) { }
};

function tabClose() {
    try {
        $(".tabs-inner").dblclick(function () {
            var subtitle = $(this).children(".tabs-closable").text();
            $(select_tabs_id).tabs('close', subtitle)
        });
        $(".tabs-inner").bind('contextmenu', function (e) {
            $(select_tabs_mm_id).menu('show', {
                left: e.pageX,
                top: e.pageY
            });
            var subtitle = $(this).children(".tabs-closable").text();
            $(select_tabs_mm_id).data("currtab", subtitle);
            $(select_tabs_id).tabs('select', subtitle);
            return false
        })
    } catch (ddd) { }
};

function tabCloseEven() {
    $(select_tabs_mm_tabupdate_id).click(function () {
        var currTab = $(select_tabs_id).tabs('getSelected');
        var url = $(currTab.panel('options').content).attr('src');
        $(select_tabs_id).tabs('update', {
            tab: currTab,
            options: {
                content: createFrame(url)
            }
        })
    });
    $(select_tabs_mm_tabclose_id).click(function () {
        var t = $(select_tabs_mm_id).data("currtab");
        if (t != firstTapName) $(select_tabs_id).tabs('close', t)
    });
    $(select_tabs_mm_tabcloseall_id).click(function () {
        $('.tabs-inner span').each(function (i, n) {
            var t = $(n).text();
            if (t != firstTapName) $(select_tabs_id).tabs('close', t)
        })
    });
    $('#mm-tabcloseother').click(function () {
        $(select_tabs_mm_tabcloseright_id).click();
        $(select_tabs_mm_tabcloseleft_id).click()
    });
    $(select_tabs_mm_tabcloseright_id).click(function () {
        var nextall = $('.tabs-selected').nextAll();
        if (nextall.length == 0) {
            return false
        }
        nextall.each(function (i, n) {
            var t = $('a:eq(0) span', $(n)).text();
            if (t != firstTapName) $(select_tabs_id).tabs('close', t)
        });
        return false
    });
    $(select_tabs_mm_tabcloseleft_id).click(function () {
        var prevall = $('.tabs-selected').prevAll();
        if (prevall.length == 0) {
            return false
        }
        prevall.each(function (i, n) {
            var t = $('a:eq(0) span', $(n)).text();
            if (t != firstTapName) $(select_tabs_id).tabs('close', t)
        });
        return false
    });
    $(select_tabs_mm_exit_id).click(function () {
        $(select_tabs_mm_id).menu('hide');
        loginOut()
    })
};

function tabCloseEven11() {
    try {
        $(select_tabs_mm_tabupdate_id).click(function () {
            var currTab = $(select_tabs_id).tabs('getSelected');
            var url = $(currTab.panel('options').content).attr('src');
            $(select_tabs_id).tabs('update', {
                tab: currTab,
                options: {
                    content: createFrame(url)
                }
            })
        });
        $(select_tabs_mm_tabclose_id).click(function () {
            var currtab_title = $(select_tabs_mm_id).data("currtab");
            $(select_tabs_id).tabs('close', currtab_title)
        });
        $(select_tabs_mm_tabcloseall_id).click(function () {
            $('.tabs-inner span').each(function (i, n) {
                var t = $(n).text();
                if (t != firstTapName) $(select_tabs_id).tabs('close', t)
            })
        });
        $('#mm-tabcloseother').click(function () {
            $(select_tabs_mm_tabcloseright_id).click();
            $(select_tabs_mm_tabcloseleft_id).click()
        });
        $(select_tabs_mm_tabcloseright_id).click(function () {
            var nextall = $('.tabs-selected').nextAll();
            if (nextall.length == 0) {
                return false
            }
            nextall.each(function (i, n) {
                var t = $('a:eq(0) span', $(n)).text();
                if (t != firstTapName) $(select_tabs_id).tabs('close', t)
            });
            return false
        });
        $(select_tabs_mm_tabcloseleft_id).click(function () {
            var prevall = $('.tabs-selected').prevAll();
            if (prevall.length == 0) {
                return false
            }
            prevall.each(function (i, n) {
                var t = $('a:eq(0) span', $(n)).text();
                if (t != firstTapName) $(select_tabs_id).tabs('close', t)
            });
            return false
        });
        $(select_tabs_mm_exit_id).click(function () {
            $(select_tabs_mm_id).menu('hide');
            loginOut()
        })
    } catch (ddd) { }
};

function clockon() {
    try {
        var now = new Date();
        var year = now.getFullYear();
        var month = now.getMonth();
        var date = now.getDate();
        var day = now.getDay();
        var hour = now.getHours();
        var minu = now.getMinutes();
        var sec = now.getSeconds();
        var week;
        month = month + 1;
        if (month < 10) month = "0" + month;
        if (date < 10) date = "0" + date;
        if (hour < 10) hour = "0" + hour;
        if (minu < 10) minu = "0" + minu;
        if (sec < 10) sec = "0" + sec;
        var arr_week = new Array("星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六");
        week = arr_week[day];
        var time = "";
        time = year + "年" + month + "月" + date + "日 " + hour + ":" + minu + ":" + sec + " " + week;
        $(select_bgclock_id).html(time);
        var timer = setTimeout("clockon()", 200)
    } catch (ddd) { }
};
function getMenuData() {
    if (getMenuFlag == 1) {
        return;
    }
    Clearnav();
    setTimeout("getMenuData()", 200)
    $.ajax({
        type: 'POST',
        url: UserPowerList_action_link,
        data: {
            UserSoftList: m_UserSoftList
        },
        beforeSend: function () {
            if ($(select_span_wait_id).val() != undefined) {
                $(select_span_wait_id).show()
            }
        },
        success: function (msg) {
            var ok = false;
            try {
                //alert(msg);
                _menus = JSON.parse(msg);
                ok = true
            } catch (dd_) { /*alert(dd)*/ }
            if (ok) {
                var firstMenuName = topmenu_link_frist_name;
                try {
                    if ($(select_topmenu_id).val() != undefined) {
                        firstMenuName = $(select_topmenu_link_first).attr('name')
                    }
                } catch (dd) { /*alert(dd)*/ }

                if (msg == '{}' || _menus[firstMenuName].length == 0) {
                    var JoinFlag = CorpJoin();
                    if (JoinFlag != '0') {
                        if (JoinFlag != "1") {//未申请企业认证
                            $.messager.confirm('系统消息', '您还没有企业认证，企业认证才可以免费试用功能模块，需要认证么?', function (r) {
                                if (r) {
                                    location.href = '/BAction/RegisterCorp?op=Create&UserGuid=' + JoinFlag
                                } else {
                                    location.href = loginOut_action_link;
                                }
                            });
                        } else {
                            $.messager.confirm('系统消息', '您没有使用该平台的权限！是否查看企业认证审核情况？', function (r) {
                                if (r) {
                                    location.href = '/BAction/RegisterCorpa?UserID=' + KingonUI.Core.GetUserID();
                                } else {
                                    location.href = loginOut_action_link;
                                }
                            });
                        }


                    } else {
                        $.messager.alert('系统消息', '您没有使用该平台的权限！', '', function (r) {
                            location.href = loginOut_action_link;
                        });
                    }

                }
                else {
                    try {
                        Clearnav();
                        addNav(_menus[firstMenuName]);
                        getMenuFlag = 1;
                    } catch (d) {
                    }
                }
                hoverMenuItem();
                if ($(select_span_wait_id).val() != undefined) {
                    $(select_span_wait_id).hide()
                }
                //alert(_menus[firstMenuName].length);
            } else {
                $.messager.alert('系统消息', '您获取系统权限时出错，请和管理员进行联系！', '', function (r) {
                    //location.href = loginOut_action_link
                })
            }
        }
    });
}
var getMenuFlag = 0;
var _menus = null;
getMenuData();
//获取企业认证信息
function CorpJoin() {
    var JoinFlag = '0';

    var sql = "select *,isnull((select state from Base_Corp_Join where userid=" + KingonUI.Core.GetUserID() + "),-1)as state from base_user where types=1 and id =" + KingonUI.Core.GetUserID();

    var m_SearchInfo = new KingonUI.SearchInfo();
    m_SearchInfo.dataSource = '1';
    m_SearchInfo.tableName = sql;
    m_SearchInfo.pageSize = 0;//(等于0时为获取全部符合条件的记录)
    m_SearchInfo.tablePreKey = 'ID';
    m_SearchInfo.strOrder = 'ID desc';
    m_SearchInfo.strFieldList = '*';

    var Postdata = m_SearchInfo.getJson();
    $.ajax({
        type: 'POST',
        async: false,
        url: '/DynaTable/getListJson',
        dataType: 'html',
        data: { searchInfo: Postdata },
        success: function (Towndata) {

            var a = JSON.parse(Towndata);
            if (a.length > 0) {
                JoinFlag = '1';
                if (a[0]['state'] == '-1') {
                    JoinFlag = a[0]['guid'];
                }
            }
        }
    });

    return JoinFlag;
}