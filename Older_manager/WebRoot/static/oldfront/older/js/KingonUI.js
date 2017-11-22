var Sys = {};
var LoginPageMode = {};
var PageMode = {};
Sys.InitPageInfoFlag = false;
PageMode.token = '';
PageMode.Page_UserIP = '';
PageMode.Page_AreaName = '';
PageMode.Page_ControllerName = '';
PageMode.Page_ActionName = '';
PageMode.Page_MenuID = '';
PageMode.Page_ActionList = '';
PageMode.Page_PActionList = '';
PageMode.Page_PNotActionList = '';
PageMode.FlowID = '';
PageMode.FlowNodeList = [];
PageMode.TableID = '';
PageMode.TableGuid = '';
PageMode.CurNodeID = '';
PageMode.CurNodeName = '';
PageMode.OpType = '';
PageMode.ModuleID = '';
PageMode.HFormID = '';
LoginPageMode.LocalUserID = '';
LoginPageMode.LocalUserType = '';
LoginPageMode.LocalDeptID = '';
LoginPageMode.LocalUserName = '';
LoginPageMode.LocalDeptName = '';
LoginPageMode.LocalCorpID = '';
LoginPageMode.LocalAreaID = '';
LoginPageMode.LocalPreDeptID = '';
LoginPageMode.LocalUserIP = '';
LoginPageMode.LocalPostID = '';
LoginPageMode.LocalPostName = '';
LoginPageMode.LocalPrePostID = '';
LoginPageMode.LocalPrePostName = '';
LoginPageMode.LocalPrePostIDList = '';
LoginPageMode.LocalPrePostNameList = '';
LoginPageMode.UserLevel = '';
LoginPageMode.DeptLevel = '';
LoginPageMode.PreUserLevelStr = '';
LoginPageMode.Rootdir = '';
LoginPageMode.LocalCorpName = '';
LoginPageMode.BaseCurAreaID = '0';
LoginPageMode.BaseSAreaID = '0';
LoginPageMode.BaseCAreaID = '0';
LoginPageMode.BaseXAreaID = '0';

LoginPageMode.BaseSDAreaID = '0';
LoginPageMode.BaseCDAreaID = '0';
LoginPageMode.BaseXDAreaID = '0';



var ua = navigator.userAgent.toLowerCase();
var s; (s = ua.match(/msie ([\d.]+)/)) ? Sys.IE = s[1] : (s = ua.match(/firefox\/([\d.]+)/)) ? Sys.Firefox = s[1] : (s = ua.match(/chrome\/([\d.]+)/)) ? Sys.Chrome = s[1] : (s = ua.match(/opera.([\d.]+)/)) ? Sys.Opera = s[1] : (s = ua.match(/version\/([\d.]+).*safari/)) ? Sys.Safari = s[1] : (s = ua.match(/qqbrowser\/([\d.]+)/)) ? Sys.QQBrowser = s[1] : (!!window.ActiveXObject || "ActiveXObject" in window) ? ((s = ua.match(/rv:([\d.]+)/)) ? Sys.IE = s[1] : (Sys.IE = '_')) : 0;
Sys.MainFlag = false;
Sys.TopFlag = false;
Sys.TabFlag = false;
Sys.LoginUrl = '"/Login/Login?session=1"';
Sys.OnlineTakePhotoUrl = '/Authed/OnlineTakePhoto';
Sys.getUpLoaderFileListUrl = '/Authed/getUpLoaderFileList';
Sys.ChartManUrl = '/Authed/ChartMan';
Sys.FilesManUrl = '/Authed/FilesMan';
Sys.FilesDownUrl = '/Authed/FilesDown';
Sys.getOrgNameListUrl = '/Authed/getOrgNameList';
Sys.SelectDeptUrl = '/Authed/SelectDept';
Sys.SelectDeptUserUrl = '/Authed/SelectDeptUser';
Sys.SelectPostUrl = '/Authed/SelectPost';
Sys.SelectRoleUrl = '/Authed/SelectRole';
Sys.SelectAreaUrl = '/Authed/SelectArea';
Sys.SelectUserUrl = '/Authed/SelectUser';
Sys.getFlowButtonsUrl = '/Flow/FHome/getFlowButtons';
Sys.getFlowSelectUserUrl = '/Authed/FlowSelectUser';
Sys.getFlowSelectMsgUrl = '/Authed/FlowSelectMsg';
Sys.getFlowSelectStepUrl = '/Authed/FlowSelectSetp';
Sys.getFlowTaskedListUrl = '/Authed/FlowTaskedList';
(function ($) { });
$(function () { });
function InitEasyuiFiles(n) {
    try {
        $file = $(n);
        var id = $file.attr("id") || "";
        var name = $file.attr("name") || "";
        var showbutton = $file.attr("showbutton") || "1";
        var filetype = $file.attr("filetype") || ".*";
        var filenumber = $file.attr("filenumber") || "5";
        var filesize = $file.attr("filesize") || "10";
        var value = $file.val();
        var $hide = $('<input type="hidden" id="' + id + '" name="' + name + '" value="" />');
        var $but = $('<input type="button" style="border-left:none;margin:0;" value="附件" />');
        var $down = $('<input type="button" style="border-left:none;margin:0;" value="下载" />');
        var $div = $('<div></div>');
        $div.attr("id", id + "_div");
        $file.attr("id", id + "_text");
        $file.attr("name", name + "_text");
        $file.removeClass();
        $file.attr('readonly');
        $hide.val(value);
        if (value.length > 0) {
            try {
                $.ajax({
                    type: "POST",
                    url: Sys.getUpLoaderFileListUrl,
                    dataType: "html",
                    data: {
                        ID: id + "_text",
                        Guid: value
                    },
                    cache: false,
                    success: function (msg) {
                        try {
                            var CommonPageReturnJSon = JSON.parse(msg);
                            if (CommonPageReturnJSon.Type == "ok") {
                                var ModelJSON = JSON.parse(CommonPageReturnJSon.ModelJSON);
                                $Mfile = $('#' + ModelJSON.ID);
                                var FileList = JSON.parse(ModelJSON.FileList);
                                var ss = '<table width="100%" border="0" cellspacing="1" cellpadding="0" style="background-color:#C3D7EE; text-align:left; ">';
                                ss += '<tr style="background-color:#FAFAFA; font-weight:600; color:#666;text-align:center;">';
                                ss += '<td width="60%" height="25">名称</td>';
                                ss += '<td width="20%">大小</td>';
                                ss += '<td width="20%">操作</td>';
                                ss += '</tr>';
                                for (var i = 0; i < FileList.length; i++) {
                                    var dataArray = FileList[i].filemsg.split('|');
                                    ss += '<tr style="background-color:#FAFAFA; font-weight:600; color:#666;text-align:center;">';
                                    ss += '<td height="25"><a href="' + dataArray[1] + '" target="_blank">' + dataArray[3] + '</a></td>';
                                    ss += '<td>' + dataArray[2] + '</td>';
                                    if (KingonUI.Core.isOfficeFie(dataArray[3])) {
                                        ss += '<td ><a href="/Ntko/EditOffice?guid=' + dataArray[0] + '" target="_blank">修改</a></td>'
                                    } else {
                                        ss += '<td></td>'
                                    }
                                    ss += '</tr>'
                                }
                                ss += '</table>';
                                $div.html(ss);
                                $Mfile.val('共' + FileList.length + '个文件')
                            }
                        } catch (dd) { }
                    }
                })
            } catch (d) {
                $file.val('共0个文件')
            }
        }
        if (showbutton == "1") {
            $but.bind("click",
            function () {
                var val = $(this).prev().prev().prev().val();
                var filetype1 = KingonUI.Core.replaceAll(filetype, ',', ';');
                var url = Sys.FilesManUrl + '?size=' + filesize + '&num=' + filenumber + '&type=' + filetype1 + '&val=' + val + '&eid=' + id;
                top.OpenUrl(KingonUI.Core.getIframeID(), "附件管理", url, "", 1, 530, 400, 9900)
            });
            $down.bind("click",
            function () {
                var val = $(this).prev().prev().val();
                var url = Sys.FilesDownUrl + '?Guid=' + val;
                top.OpenUrl(KingonUI.Core.getIframeID(), "附件下载", url, "", 1, 530, 400, 9900)
            });
            $file.after($div).before($hide).after($but).after($down)
        } else {
            $file.bind("click",
            function () {
                var val = $(this).prev().val();
                var filetype1 = KingonUI.Core.replaceAll(filetype, ',', ';');
                var url = Sys.FilesManUrl + '?size=' + filesize + '&num=' + filenumber + '&type=' + filetype1 + '&val=' + val + '&eid=' + id;
                top.OpenUrl(KingonUI.Core.getIframeID(), "附件管理", url, "", 1, 530, 400, 9900)
            });
            $file.after($div).before($hide)
        }
    } catch (dd) { }
}
function InitEasyuiChart(n)
{
    try {
        $file = $(n);
        var id = $file.attr("id") || "";
        var name = $file.attr("name") || "";
        var showbutton = $file.attr("showbutton") || "1";
        var filetype = $file.attr("filetype") || "*.jpg";
        var filenumber = $file.attr("filenumber") || "5";
        var filesize = $file.attr("filesize") || "10";
        var filewidth = $file.attr("filewidth") || "200";
        var fileheight = $file.attr("fileheight") || "100";
        var value = $file.val();
        var $div = $('<div id="' + id + '_div"></div>');
        var $hide = $('<input type="hidden" id="' + id + '" name="' + name + '" value="" />');
        var $but = $('<input type="button" style="border-left:none;margin:0;" value="图片管理" />');
        $file.attr("id", id + "_text");
        $file.attr("name", name + "_text");
        $file.removeClass();
        $file.attr('readonly');
        $file.hide();
        $hide.val(value);
        if (value.length > 0) {
            try {
                $.ajax({
                    type: "POST",
                    url: Sys.getUpLoaderFileListUrl,
                    dataType: "html",
                    data: {
                        ID: id + "_div",
                        Guid: value
                    },
                    cache: false,
                    success: function (msg) {
                        try {
                            var CommonPageReturnJSon = JSON.parse(msg);
                            if (CommonPageReturnJSon.Type == "ok") {
                                var ModelJSON = JSON.parse(CommonPageReturnJSon.ModelJSON);
                                $Mfile = $('#' + ModelJSON.ID);
                                var FileList = JSON.parse(ModelJSON.FileList);
                                var ss = '';
                                for (var i = 0; i < FileList.length; i++) {
                                    var dataArray = FileList[i].filemsg.split('|');
                                    if (i == 0) {
                                        ss = '<img id="' + dataArray[0] + '" onclick="KingonUI.Core.dopicZoom(this.id)" src="' + dataArray[1] + '" alt="" btype="0"  bwidth="' + filewidth + '" bheight="' + fileheight + '"  width="' + filewidth + '" height="' + fileheight + '" />'
                                    } else {
                                        ss += '&nbsp;&nbsp;<img id="' + dataArray[0] + '" onclick="KingonUI.Core.dopicZoom(this.id)" src="' + dataArray[1] + '" alt="" btype="0"  bwidth="' + filewidth + '" bheight="' + fileheight + '"  width="' + filewidth + '" height="' + fileheight + '" />'
                                    }
                                }
                                $Mfile.html(ss)
                            }
                        } catch (dd) {
                            alert(dd)
                        }
                    }
                })
            } catch (d) {
                alert(d)
            }
        }
        $but.bind("click",
        function () {
            try {
                var val = $(this).prev().prev().prev().val();
                var filetype1 = KingonUI.Core.replaceAll(filetype, ',', ';');
                var url = Sys.ChartManUrl + '?height=' + fileheight + '&width=' + filewidth + '&size=' + filesize + '&num=' + filenumber + '&type=' + filetype1 + '&val=' + val + '&eid=' + id;
                top.OpenUrl(KingonUI.Core.getIframeID(), "图片管理", url, "", 1, 600, 430, 9900)
            } catch (d) {
                alert(d)
            }
        });
        if (showbutton == "0") $file.before($hide).before($div);
        else $file.after($but).before($hide).before($div)
    } catch (dd) {
        alert(dd)
    }
}
function AjaxIfram(url) {
    try {
        $.ajax({
            async: false,
            url: url,
            type: 'Post',
            contentType: "application/json; charset=utf-8",
            dataType: 'jsonp',
            jsonp: 'jsoncallback',
            timeout: 5000,
            success: function (a) { }
        })
    } catch (dd) {
        alert(dd)
    }
}
function getNodeID(NodeName) {
    try {
        for (var i = 0; i < PageMode.FlowNodeList.length; i++) {
            if (PageMode.FlowNodeList[i].NodeName == NodeName) return PageMode.FlowNodeList[i].ID
        }
    } catch (d) { }
    return ''
}
function getNodeName(NodeID) {
    try {
        for (var i = 0; i < PageMode.FlowNodeList.length; i++) {
            if (PageMode.FlowNodeList[i].ID == NodeID) return PageMode.FlowNodeList[i].NodeName
        }
    } catch (d) { }
    return ''
}
function CheckFlowData(FlowID, CurNodeID, NextNodeID) {
    return true
}
function HiddenFlowNoteName(NodeName) {

    try {
        for (var i = 0; i < PageMode.FlowNodeList.length; i++) {
            if (PageMode.FlowNodeList[i].NodeName == NodeName) {
                $('#btn' + PageMode.FlowNodeList[i].ID).hide()
            }
        }
    } catch (d) { }
}
function HiddenFlowNoteID(NodeID) {
    try {
        $('#btn' + NodeID).hide()
    } catch (d) { }
}
function NextFlowStepWin(formUrl) {
    try {
        var param = {};
        param.FlowID = FlowID;
        param.TableID = TableID;
        param.Guid = guid;
        var paramstr = JSON.stringify(param);
        var url = Sys.getFlowTaskedListUrl + '?FlowID=' + FlowID + '&TableID=' + TableID + '&Guid=' + guid + '&FormUrl=' + escape(formUrl);
        top.OpenUrl(KingonUI.Core.getIframeID(), "流程提交与查看", url, "", 1, 1224, 620, 9900)
    } catch (dd) {
        alert(dd)
    }
}

function FlowStepMenuHandler(item) {
    if (item.name == 'end')
    {
        NextFlowAuto(item.FlowID, item.TableID, item.UserID, item.TableGuid, item.UserID, item.CurNodeID, item.NextNodeID, item.formUrl);
    }
    else if (item.name == 'auto') {
        NextFlowAuto(item.FlowID, item.TableID, item.UserID, item.TableGuid, item.UserID, item.CurNodeID, item.NextNodeID, item.formUrl);
    }
    else if (item.name == 'normal') {
        NextFlowSave(item.FlowID, item.TableID, item.UserID, item.TableGuid, item.UserID, item.CurNodeID, item.NextNodeID, item.formUrl);
    }
    else if (item.name == 'back') {
        PrevFlowSave(item.FlowID, item.TableID, item.UserID, item.TableGuid, item.UserID, item.CurNodeID, item.NextNodeID, item.formUrl, item.toUserID);
    }
}
function NextFlowStep(FlowID, TableID, UserID, guid, FormUrl) {
    var dook = true;
    try {
        dook = CheckFlowData(FlowID, CurNodeID, NextNodeID)
    } catch (d) { }
    if (!dook) return;
    var url = Sys.getFlowSelectStepUrl + '?FlowID=' + FlowID + '&TableID=' + TableID + '&UserID=' + UserID + '&Guid=' + guid + '&FormUrl=' + escape(FormUrl)
    top.OpenUrl(KingonUI.Core.getIframeID(), "步骤选择", url, "", 1, 730, 500, 9900)
}
function NextFlowAuto(FlowID, TableID, UserID, guid, CurNodeID, NextNodeID, FormUrl) {
    try {
        var dook = true;
        try {
            dook = CheckFlowData(FlowID, CurNodeID, NextNodeID)
        } catch (d) { }
        if (!dook) return;
        var m_CommInfo = getFormSaveData();
        if (m_CommInfo != null) {
            var m_FormUrl = new KingonUI.CommItemInfo();
            m_FormUrl.dbName = 'DoFormUrl';
            m_FormUrl.strValue = FormUrl;
            m_CommInfo.addCommItem(m_FormUrl);
            var m_DoSysFlow = new KingonUI.CommItemInfo();
            m_DoSysFlow.dbName = 'DoSysFlow';
            m_DoSysFlow.strValue = FlowID;
            m_CommInfo.addCommItem(m_DoSysFlow);
            var m_DoFlowTableID = new KingonUI.CommItemInfo();
            m_DoFlowTableID.dbName = 'DoFlowTableID';
            m_DoFlowTableID.strValue = TableID;
            m_CommInfo.addCommItem(m_DoFlowTableID);
            var m_DoFlowUserID = new KingonUI.CommItemInfo();
            m_DoFlowUserID.dbName = 'DoFlowUserID';
            m_DoFlowUserID.strValue = UserID;
            m_CommInfo.addCommItem(m_DoFlowUserID);
            var m_DoFlowType = new KingonUI.CommItemInfo();
            m_DoFlowType.dbName = 'DoFlowType';
            m_DoFlowType.strValue = 2;
            m_CommInfo.addCommItem(m_DoFlowType);
            var m_DoFlowTableGuid = new KingonUI.CommItemInfo();
            m_DoFlowTableGuid.dbName = 'DoFlowTableGuid';
            m_DoFlowTableGuid.strValue = guid;
            m_CommInfo.addCommItem(m_DoFlowTableGuid);
            var m_DoFlowCurNodeID = new KingonUI.CommItemInfo();
            m_DoFlowCurNodeID.dbName = 'DoFlowCurNodeID';
            m_DoFlowCurNodeID.strValue = CurNodeID;
            m_CommInfo.addCommItem(m_DoFlowCurNodeID);
            var m_DoFlowNextNodeID = new KingonUI.CommItemInfo();
            m_DoFlowNextNodeID.dbName = 'DoFlowNextNodeID';
            m_DoFlowNextNodeID.strValue = NextNodeID;
            m_CommInfo.addCommItem(m_DoFlowNextNodeID);
            var Postdata = m_CommInfo.getJson();
            if (optype == "Edit") {
                EditSavePost(Postdata)
            } else if (optype == "Create") {
                CreateSavePost(Postdata)
            }
        }
    } catch (dd) {
        alert(dd)
    }
}
function NextFlowSave(FlowID, TableID, UserID, guid, CurNodeID, NextNodeID, FormUrl) {
    try {
        var dook = true;
        try {
            dook = CheckFlowData(FlowID, CurNodeID, NextNodeID)
        } catch (d) { }
        if (!dook) return;
        var param = {};
        param.FlowID = FlowID;
        param.TableID = TableID;
        param.UserID = UserID;
        param.Guid = guid;
        param.CurNodeID = CurNodeID;
        param.NextNodeID = NextNodeID;
        param.FormUrl = FormUrl;
        var paramstr = JSON.stringify(param);
        var url = Sys.getFlowSelectUserUrl + '?FlowID=' + FlowID + '&TableID=' + TableID + '&UserID=' + UserID + '&Guid=' + guid + '&CurNodeID=' + CurNodeID + '&NextNodeID=' + NextNodeID + '&FormUrl=' + escape(FormUrl);
        top.OpenUrl(KingonUI.Core.getIframeID(), "流程处理", url, "", 1, 730, 500, 9900)
    } catch (dd) {
        alert(dd)
    }
};
function ShowFlowList(FlowID, TableID, guid) {
    try {
        var param = {};
        param.FlowID = FlowID;
        param.TableID = TableID;
        param.Guid = guid;
        var paramstr = JSON.stringify(param);
        var url = Sys.getFlowTaskedListUrl + '?FlowID=' + FlowID + '&TableID=' + TableID + '&Guid=' + guid;
        top.OpenUrl(KingonUI.Core.getIframeID(), "流程查看", url, "", 1, 1224, 620, 9900)
    } catch (dd) {
        alert(dd)
    }
};
function DoNextFlowSave(FlowID, TableID, UserID, guid, CurNodeID, NextNodeID, CurNodeMsg, NextUserID, FormUrl,SendSms) {
    try {
        var m_CommInfo = getFormSaveData();
        if (m_CommInfo != null) {
            var m_FormUrl = new KingonUI.CommItemInfo();
            m_FormUrl.dbName = 'DoFormUrl';
            m_FormUrl.strValue = FormUrl;
            m_CommInfo.addCommItem(m_FormUrl);
            var m_DoSysFlow = new KingonUI.CommItemInfo();
            m_DoSysFlow.dbName = 'DoSysFlow';
            m_DoSysFlow.strValue = FlowID;
            m_CommInfo.addCommItem(m_DoSysFlow);
            var m_DoFlowTableID = new KingonUI.CommItemInfo();
            m_DoFlowTableID.dbName = 'DoFlowTableID';
            m_DoFlowTableID.strValue = TableID;
            m_CommInfo.addCommItem(m_DoFlowTableID);
            var m_DoFlowUserID = new KingonUI.CommItemInfo();
            m_DoFlowUserID.dbName = 'DoFlowUserID';
            m_DoFlowUserID.strValue = UserID;
            m_CommInfo.addCommItem(m_DoFlowUserID);
            var m_DoFlowType = new KingonUI.CommItemInfo();
            m_DoFlowType.dbName = 'DoFlowType';
            m_DoFlowType.strValue = 2;
            m_CommInfo.addCommItem(m_DoFlowType);
            var m_DoFlowTableGuid = new KingonUI.CommItemInfo();
            m_DoFlowTableGuid.dbName = 'DoFlowTableGuid';
            m_DoFlowTableGuid.strValue = guid;
            m_CommInfo.addCommItem(m_DoFlowTableGuid);
            var m_DoFlowCurNodeID = new KingonUI.CommItemInfo();
            m_DoFlowCurNodeID.dbName = 'DoFlowCurNodeID';
            m_DoFlowCurNodeID.strValue = CurNodeID;
            m_CommInfo.addCommItem(m_DoFlowCurNodeID);
            var m_DoFlowNextNodeID = new KingonUI.CommItemInfo();
            m_DoFlowNextNodeID.dbName = 'DoFlowNextNodeID';
            m_DoFlowNextNodeID.strValue = NextNodeID;
            m_CommInfo.addCommItem(m_DoFlowNextNodeID);
            var m_DoFlowCurNodeMsg = new KingonUI.CommItemInfo();
            m_DoFlowCurNodeMsg.dbName = 'DoFlowCurNodeMsg';
            m_DoFlowCurNodeMsg.strValue = CurNodeMsg;
            m_CommInfo.addCommItem(m_DoFlowCurNodeMsg);
            var m_DoFlowNextUserID = new KingonUI.CommItemInfo();
            m_DoFlowNextUserID.dbName = 'DoFlowNextUserID';
            m_DoFlowNextUserID.strValue = NextUserID;
            m_CommInfo.addCommItem(m_DoFlowNextUserID);

            var m_SendSms = new KingonUI.CommItemInfo();
            m_SendSms.dbName = 'DoFlowSendSms';
            m_SendSms.strValue = SendSms;
            m_CommInfo.addCommItem(m_SendSms);

            var Postdata = m_CommInfo.getJson();
            if (optype == "Edit") {
                EditSavePost(Postdata)
            } else if (optype == "Create") {
                CreateSavePost(Postdata)
            }
        }
    } catch (dd) {
        alert(dd)
    }
};
function PrevFlowSave(FlowID, TableID, UserID, guid, CurNodeID, PrevNodeID, FormUrl, PrevUserID) {
    try {
        var dook = true;
        try {
            dook = CheckFlowData(FlowID, CurNodeID, NextNodeID)
        } catch (d) { }
        if (!dook) return;
        var url = Sys.getFlowSelectMsgUrl + '?FlowID=' + FlowID + '&TableID=' + TableID + '&UserID=' + UserID + '&Guid=' + guid + '&CurNodeID=' + CurNodeID + '&PrevNodeID=' + PrevNodeID + '&FormUrl=' + escape(FormUrl) + '&PrevUserID=' + PrevUserID;
        top.OpenUrl(KingonUI.Core.getIframeID(), "流程处理", url, "", 1, 730, 500, 9900)
    } catch (dd) {
        alert(dd)
    }
};
function doPrevFlowSave(FlowID, TableID, UserID, guid, CurNodeID, PrevNodeID, FormUrl, PrevUserID, CurNodeMsg, SendSms) {
    try {
        var dook = true;
        try {
            dook = CheckFlowData(FlowID, CurNodeID, PrevNodeID)
        } catch (d) { }
        if (!dook) return;
        var m_CommInfo = getFormSaveData();
        if (m_CommInfo != null) {
            var m_FormUrl = new KingonUI.CommItemInfo();
            m_FormUrl.dbName = 'DoFormUrl';
            m_FormUrl.strValue = FormUrl;
            m_CommInfo.addCommItem(m_FormUrl);
            var m_DoSysFlow = new KingonUI.CommItemInfo();
            m_DoSysFlow.dbName = 'DoSysFlow';
            m_DoSysFlow.strValue = FlowID;
            m_CommInfo.addCommItem(m_DoSysFlow);
            var m_DoFlowTableID = new KingonUI.CommItemInfo();
            m_DoFlowTableID.dbName = 'DoFlowTableID';
            m_DoFlowTableID.strValue = TableID;
            m_CommInfo.addCommItem(m_DoFlowTableID);
            var m_DoFlowUserID = new KingonUI.CommItemInfo();
            m_DoFlowUserID.dbName = 'DoFlowUserID';
            m_DoFlowUserID.strValue = UserID;
            m_CommInfo.addCommItem(m_DoFlowUserID);
            var m_DoFlowType = new KingonUI.CommItemInfo();
            m_DoFlowType.dbName = 'DoFlowType';
            m_DoFlowType.strValue = 1;
            m_CommInfo.addCommItem(m_DoFlowType);
            var m_DoFlowTableGuid = new KingonUI.CommItemInfo();
            m_DoFlowTableGuid.dbName = 'DoFlowTableGuid';
            m_DoFlowTableGuid.strValue = guid;
            m_CommInfo.addCommItem(m_DoFlowTableGuid);
            var m_DoFlowCurNodeID = new KingonUI.CommItemInfo();
            m_DoFlowCurNodeID.dbName = 'DoFlowCurNodeID';
            m_DoFlowCurNodeID.strValue = CurNodeID;
            m_CommInfo.addCommItem(m_DoFlowCurNodeID);
            var m_DoFlowPrevNodeID = new KingonUI.CommItemInfo();
            m_DoFlowPrevNodeID.dbName = 'DoFlowPrevNodeID';
            m_DoFlowPrevNodeID.strValue = PrevNodeID;
            m_CommInfo.addCommItem(m_DoFlowPrevNodeID);
            var m_DoFlowPrevUserID = new KingonUI.CommItemInfo();
            m_DoFlowPrevUserID.dbName = 'DoFlowPrevUserID';
            m_DoFlowPrevUserID.strValue = PrevUserID;
            m_CommInfo.addCommItem(m_DoFlowPrevUserID);

            var m_DoFlowCurNodeMsg = new KingonUI.CommItemInfo();
            m_DoFlowCurNodeMsg.dbName = 'DoFlowCurNodeMsg';
            m_DoFlowCurNodeMsg.strValue = CurNodeMsg;
            m_CommInfo.addCommItem(m_DoFlowCurNodeMsg);


            var Postdata = m_CommInfo.getJson();
            if (optype == "Edit") {
                EditSavePost(Postdata)
            } else if (optype == "Create") {
                CreateSavePost(Postdata)
            }
        }
    } catch (dd) {
        alert(dd)
    }
};
function CurFlowSave(FlowID, TableID, UserID, guid, CurNodeID, FormUrl) {
    try {
        var dook = true;
        try {
            dook = CheckFlowData(FlowID, CurNodeID, 0);
            if (dook == '' || dook == undefined) dook = true
        } catch (d) { }
        if (!dook) return;
        var m_CommInfo = getFormSaveData();
        if (m_CommInfo != null) {
            var m_FormUrl = new KingonUI.CommItemInfo();
            m_FormUrl.dbName = 'DoFormUrl';
            m_FormUrl.strValue = FormUrl;
            m_CommInfo.addCommItem(m_FormUrl);
            var m_DoSysFlow = new KingonUI.CommItemInfo();
            m_DoSysFlow.dbName = 'DoSysFlow';
            m_DoSysFlow.strValue = FlowID;
            m_CommInfo.addCommItem(m_DoSysFlow);
            var m_DoFlowTableID = new KingonUI.CommItemInfo();
            m_DoFlowTableID.dbName = 'DoFlowTableID';
            m_DoFlowTableID.strValue = TableID;
            m_CommInfo.addCommItem(m_DoFlowTableID);
            var m_DoFlowType = new KingonUI.CommItemInfo();
            m_DoFlowType.dbName = 'DoFlowType';
            m_DoFlowType.strValue = 0;
            m_CommInfo.addCommItem(m_DoFlowType);
            var m_DoFlowUserID = new KingonUI.CommItemInfo();
            m_DoFlowUserID.dbName = 'DoFlowUserID';
            m_DoFlowUserID.strValue = UserID;
            m_CommInfo.addCommItem(m_DoFlowUserID);
            var m_DoFlowTableGuid = new KingonUI.CommItemInfo();
            m_DoFlowTableGuid.dbName = 'DoFlowTableGuid';
            m_DoFlowTableGuid.strValue = guid;
            m_CommInfo.addCommItem(m_DoFlowTableGuid);
            var m_DoFlowCurNodeID = new KingonUI.CommItemInfo();
            m_DoFlowCurNodeID.dbName = 'DoFlowCurNodeID';
            m_DoFlowCurNodeID.strValue = CurNodeID;
            m_CommInfo.addCommItem(m_DoFlowCurNodeID);
            var Postdata = m_CommInfo.getJson();
            if (optype == "Edit") {
                EditSavePost(Postdata)
            } else if (optype == "Create") {
                CreateSavePost(Postdata)
            }
        }
    } catch (dd) {
        alert(dd)
    }
};
function getPageGuid() {
    return Sys.PageGuid
};
function InitPageInfo() {
    if (Sys.PageGuid == top.getPageGuid()) {
        Sys.TopFlag = true
    } else {
        Sys.TopFlag = false
    }
    if (Sys.MainFlag) {
        try {
            LoginPageMode.LocalCorpName = LocalCorpName
        } catch (d) { }
        try {
            LoginPageMode.LocalUserID = LocalUserID
        } catch (d) { }
        try {
            LoginPageMode.LocalUserType = LocalUserType
        } catch (d) { }
        try {
            LoginPageMode.LocalDeptID = LocalDeptID
        } catch (d) { }
        try {
            LoginPageMode.LocalUserName = LocalUserName
        } catch (d) { };
        try {
            LoginPageMode.LocalDeptName = LocalDeptName
        } catch (d) { }
        try {
            LoginPageMode.LocalCorpID = LocalCorpID
        } catch (d) { }
        try {
            LoginPageMode.LocalAreaID = LocalAreaID
        } catch (d) { }
        try {
            LoginPageMode.LocalPreDeptID = LocalPreDeptID
        } catch (d) { }
        try {
            LoginPageMode.LocalUserIP = LocalUserIP
        } catch (d) { }
        try {
            LoginPageMode.LocalPostID = LocalPostID
        } catch (d) { }
        try {
            LoginPageMode.LocalPostName = LocalPostName
        } catch (d) { }
        try {
            LoginPageMode.LocalPrePostID = LocalPrePostID
        } catch (d) { }
        try {
            LoginPageMode.LocalPrePostName = LocalPrePostName
        } catch (d) { }
        try {
            LoginPageMode.LocalPrePostIDList = LocalPrePostIDList
        } catch (d) { }
        try {
            LoginPageMode.LocalPrePostNameList = LocalPrePostNameList
        } catch (d) { }
        try {
            LoginPageMode.UserLevel = UserLevel
        } catch (d) { }
        try {
            LoginPageMode.DeptLevel = DeptLevel
        } catch (d) { }
        try {
            LoginPageMode.PreUserLevelStr = PreUserLevelStr
        } catch (d) { }
        try {
            LoginPageMode.Rootdir = rootdir
        } catch (d) { }
        try {
            LoginPageMode.BaseCurAreaID = BaseCurAreaID
        } catch (d) { }
        try {
            LoginPageMode.BaseSAreaID = BaseSAreaID
        } catch (d) { }
        try {
            LoginPageMode.BaseCAreaID = BaseCAreaID
        } catch (d) { }
        try {
            LoginPageMode.BaseXAreaID = BaseXAreaID
        } catch (d) { }
            try {
                LoginPageMode.BaseSDAreaID = BaseSDAreaID
            } catch (d) { }
            try {
                LoginPageMode.BaseCDAreaID = BaseCDAreaID
            } catch (d) { }
            try {
                LoginPageMode.BaseXDAreaID = BaseXDAreaID
            } catch (d) { }

    } else {
        if (Sys.TopFlag) {
            try {
                LoginPageMode = window.opener.window.getLoginPageMode()
            } catch (d) { }
        } else {
            try {
                LoginPageMode = top.getLoginPageMode()
            } catch (d) { }
        }
    }
    try {
        PageMode.FlowID = FlowID
    } catch (d) { }
    try {
        PageMode.TableID = TableID
    } catch (d) { }
    try {
        PageMode.TableGuid = guid
    } catch (d) { }
    try {
        PageMode.CurNodeID = 0
    } catch (d) { }
    try {
        PageMode.CurNodeName = ''
    } catch (d) { }
    try {
        PageMode.OpType = optype
    } catch (d) { }
    try {
        PageMode.ModuleID = ModuleID
    } catch (d) { }
    try {
        PageMode.HFormID = HFormID
    } catch (d) { }
    try {
        PageMode.token = token
    } catch (d) { }
    try {
        PageMode.Page_UserIP = Page_UserIP
    } catch (d) { }
    try {
        PageMode.Page_AreaName = Page_AreaName
    } catch (d) { }
    try {
        PageMode.Page_ControllerName = Page_ControllerName
    } catch (d) { }
    try {
        PageMode.Page_ActionName = Page_ActionName
    } catch (d) { }
    try {
        PageMode.Page_MenuID = Page_MenuID
    } catch (d) { }
    try {
        PageMode.Page_ActionList = Page_ActionList
    } catch (d) { }
    try {
        PageMode.Page_PActionList = Page_PActionList
    } catch (d) { }
    try {
        PageMode.Page_PNotActionList = (',' + Page_PNotActionList + ',')
    } catch (d) { }
    Sys.InitPageInfoFlag = true
};
function getLoginPageMode() {
    return LoginPageMode
};
function openApp(url, model, title, icon, width, height) {
    try {
        if (!url || url.toString().length == 0) {
            return
        }
        if (title.indexOf('【') > 0) {
            title = title.substring(0, title.indexOf('【'));
        }
        url = KingonUI.Core.getRootdir() + (url.substr(0, 1) == "/" ? url : "/" + url);
        OpenUrl(KingonUI.Core.getIframeID(), title, url, icon, model, width, height)
    } catch (d) { }
};
function ClosePage() {
    try {
        if (Sys.IE) {
            if (Sys.IE == '6.0') {
                window.opener = null;
                window.close()
            } else {
                window.open('', '_top');
                window.top.close()
            }
        } else if (Sys.Firefox) {
            window.location.href = 'about:blank '
        } else {
            if (window.opener == null) {
                window.location.href = 'about:blank '
            } else {
                window.opener = null;
                window.open('', '_self', '');
                window.close()
            }
        }
    } catch (d) { }
};
function login() {
    openApp(Sys.LoginUrl, 1, "用户登录", "login", 400, 230)
};
function CloseWin(id) {
    try {
        var iwin = Sys.MainDialog.getIframe(top, id + '_iframe');
        if (iwin != null) {
            try {
                top.tabCloseCur(id + '_iframe')
            } catch (d) { }
            Sys.MainDialog.close(id)
        } else {
            ClosePage()
        }
    } catch (d) { }
};
function CurLocationOpenUrl(curlocation, url) {
    try {
        var oifrid = KingonUI.Core.getCurQueryStringValue(curlocation, 'oifrid');
        var wifrid = KingonUI.Core.getCurQueryStringValue(curlocation, 'wifrid');
        if (!(wifrid == '' || wifrid == undefined || wifrid == null || wifrid == 'undefined' || wifrid == 'null')) {
            if (url.indexOf('?') >= 0) {
                url += "&wifrid=" + wifrid
            } else {
                url += "?wifrid=" + wifrid
            }
        }
        if (!(oifrid == '' || oifrid == undefined || oifrid == null || oifrid == 'undefined' || oifrid == 'null')) {
            if (url.indexOf('?') >= 0) {
                url += "&oifrid=" + oifrid
            } else {
                url += "?oifrid=" + oifrid
            }
        }
        curlocation.href = url
    } catch (d_) {
        curlocation.href = url
    }
};
function OpenUrl(openerid, subtitle, url, icon, oType, oWidth, oHeight, zindex) {
    var id = "kw_" + Math.random().toString();
    if (zindex == null || zindex == undefined) zindex = 8888;
    if (oWidth == 0 || oWidth == undefined) oWidth = ($(window).width() * 2) / 3;
    if (oHeight == 0 || oHeight == undefined) oHeight = ($(window).height() * 2) / 3;
    if (oType == 0) {
        if (!KingonUI.Core.isNullOrEmpty(openerid)) {
            if (!url.indexOf('oifrid') >= 0) {
                if (url.indexOf('?') >= 0) {
                    url += "&oifrid=" + openerid
                } else {
                    url += "?oifrid=" + openerid
                }
            }
        }
        if (Sys.TabFlag) {
            try {
                addTab(subtitle, url, icon)
            } catch (d) {
                window.open(url)
            }
        } else {
            window.open(url)
        }
    } else if (oType == 1) {
        var y = (window.screen.availHeight - 30 - oHeight) / 2;
        var x = (window.screen.availWidth - 10 - oWidth) / 2;
        Sys.MainDialog.open({
            url: url,
            top: y,
            left: x,
            width: oWidth,
            height: oHeight,
            showico: false,
            title: subtitle,
            resize: false,
            ismodal: true,
            showclose: true,
            zindex: zindex,
            openerid: openerid
        })
    } else if (oType == 2) {
        Sys.MainDialog.open({
            id: "window_" + KingonUI.Core.replaceAll(id, '-', ''),
            title: subtitle,
            url: url,
            width: oWidth,
            height: oHeight,
            ismodal: true,
            openerid: openerid
        })
    } else if (oType == 3) {
        if (!KingonUI.Core.isNullOrEmpty(openerid)) {
            if (!url.indexOf('oifrid') >= 0) {
                if (url.indexOf('?') >= 0) {
                    url += "&oifrid=" + openerid
                } else {
                    url += "?oifrid=" + openerid
                }
            }
        }
        KingonUI.Core.open(url, oWidth, oHeight, subtitle)
    } else if (oType == 4) {
        if (Sys.IE) {
            if (!KingonUI.Core.isNullOrEmpty(openerid)) {
                if (!url.indexOf('oifrid') >= 0) {
                    if (url.indexOf('?') >= 0) {
                        url += "&oifrid=" + openerid
                    } else {
                        url += "?oifrid=" + openerid
                    }
                }
            }
            window.showModalDialog(url, null, "dialogWidth=" + oWidth + "px;dialogHeight=" + oHeight + "px;center=1")
        } else Sys.MainDialog.open({
            id: "window_" + KingonUI.Core.replaceAll(id, '-', ''),
            title: subtitle,
            url: url,
            width: oWidth,
            height: oHeight,
            ismodal: true,
            openerid: openerid
        })
    } else {
        if (!KingonUI.Core.isNullOrEmpty(openerid)) {
            if (!url.indexOf('oifrid') >= 0) {
                if (url.indexOf('?') >= 0) {
                    url += "&oifrid=" + openerid
                } else {
                    url += "?oifrid=" + openerid
                }
            }
        }
        window.open(url)
    }
};
function createWinUrlOther(url) {
    var id = "kw_" + Math.random().toString();
    id = KingonUI.Core.replaceAll(id, '.', '');
    if (url.indexOf('?') >= 0) {
        url += "&wifrid=" + id
    } else {
        url += "?wifrid=" + id
    }
    return url
};
function createWinUrlNew(url) {
    var id = "kw_" + Math.random().toString();
    id = KingonUI.Core.replaceAll(id, '.', '');
    if (url.indexOf('?') >= 0) {
        url += "&wifrid=" + id
    } else {
        url += "?wifrid=" + id
    }
    return url
};
function createWinUrl(url, id) {
    if (url.indexOf('?') >= 0) {
        url += "&wifrid=" + id
    } else {
        url += "?wifrid=" + id
    }
    return url
};
function createFrame(url) {
    var id = "kw_" + Math.random().toString();
    id = KingonUI.Core.replaceAll(id, '.', '');
    var s = '<iframe id="' + id + '_iframe" scrolling="auto" name="' + id + '_iframe" src="' + createWinUrl(url, id) + '" frameborder="0" marginheight="0" marginwidth="0" border="0" style="border:none 0;margin:0;padding:0;width:100%;height:100%;"></iframe>';
    return s
};
function msgShow(title, msgString, msgType) {
    $.messager.alert(title, msgString, msgType)
};
KingonUI = function () { };
KingonUI.Core = {

    BaseCurAreaID: function () {
        try {
            if (!Sys.InitPageInfoFlag) InitPageInfo();
            if (LoginPageMode.BaseCurAreaID == '') {
                try {
                    LoginPageMode.BaseCurAreaID = BaseCurAreaID
                } catch (d) { }
            }
            return LoginPageMode.BaseCurAreaID
        } catch (d) { }
        return '0'
    },
    BaseSAreaID: function () {
        try {
            if (!Sys.InitPageInfoFlag) InitPageInfo();
            if (LoginPageMode.BaseSAreaID == '') {
                try {
                    LoginPageMode.BaseSAreaID = BaseSAreaID
                } catch (d) { }
            }
            return LoginPageMode.BaseSAreaID
        } catch (d) { }
        return '0'
    },
    BaseCAreaID: function () {
        try {
            if (!Sys.InitPageInfoFlag) InitPageInfo();
            if (LoginPageMode.BaseCAreaID == '') {
                try {
                    LoginPageMode.BaseCAreaID = BaseCAreaID
                } catch (d) { }
            }
            return LoginPageMode.BaseCAreaID
        } catch (d) { }
        return '0'
    },
    BaseXAreaID: function () {
        try {
            if (!Sys.InitPageInfoFlag) InitPageInfo();
            if (LoginPageMode.BaseXAreaID == '') {
                try {
                    LoginPageMode.BaseXAreaID = BaseXAreaID
                } catch (d) { }
            }
            return LoginPageMode.BaseXAreaID
        } catch (d) { }
        return '0'
    },


    BaseSDAreaID: function () {
        try {
            if (!Sys.InitPageInfoFlag) InitPageInfo();
            if (LoginPageMode.BaseSDAreaID == '') {
                try {
                    LoginPageMode.BaseSDAreaID = BaseSDAreaID
                } catch (d) { }
            }
            return LoginPageMode.BaseSDAreaID
        } catch (d) { }
        return '0'
    },
    BaseCDAreaID: function () {
        try {
            if (!Sys.InitPageInfoFlag) InitPageInfo();
            if (LoginPageMode.BaseCDAreaID == '') {
                try {
                    LoginPageMode.BaseCDAreaID = BaseCDAreaID
                } catch (d) { }
            }
            return LoginPageMode.BaseCDAreaID
        } catch (d) { }
        return '0'
    },
    BaseXDAreaID: function () {
        try {
            if (!Sys.InitPageInfoFlag) InitPageInfo();
            if (LoginPageMode.BaseXDAreaID == '') {
                try {
                    LoginPageMode.BaseXDAreaID = BaseXDAreaID
                } catch (d) { }
            }
            return LoginPageMode.BaseXDAreaID
        } catch (d) { }
        return '0'
    },



    ShowDocPLoader: function (pguid, filedlist) {
        var t = $('#plshowdoc_' + pguid).html();
        if (t.indexOf("收起") > 0) {
            $('#' + filedlist).hide();

            $('#plshowdoc_' + pguid).html(t.replace("收起", "展开").replace("-32px 0", "-16px 0"));
        }
        else {
            $('#' + filedlist).show();
            $('#plshowdoc_' + pguid).html(t.replace("展开", "收起").replace("-16px 0", "-32px 0"));
        }
    },
    ShowPLoader: function (pguid, filedlist) {
        var t = $('#plshow_' + pguid).html();
        if (t.indexOf("收起") > 0) {
            $('#' + filedlist).hide();

            $('#plshow_' + pguid).html(t.replace("收起", "展开").replace("-32px 0","-16px 0"));
        }
        else {
            $('#' + filedlist).show();
            $('#plshow_' + pguid).html(t.replace("展开", "收起").replace("-16px 0", "-32px 0"));
        }
    },
    ExpPLoader: function (pguid)
    {
        var url = '/Authed/DownBaseFiles?Guid=' + pguid;
        window.open(url);
    },
    DelPLoader: function (pguid, fguid, browse_button, filedlist, showdoclistid, editdocflag, delflag) {
        $.ajax({
            type: "POST",
            url: '/Authed/delUpLoaderFile',
            dataType: "html",
            data: { AGuid: pguid, Guid: fguid },
            cache: false,
            success: function (msg) {
                try {
                    var CommonPageReturnJSon = JSON.parse(msg);
                    if (CommonPageReturnJSon.Type == "ok") {
                        setTimeout(function () {
                            KingonUI.Core.KinitloaderList(pguid, browse_button, filedlist, showdoclistid, editdocflag, delflag);
                        },
                        3000);
                        alert("删除成功！！！");
                    }
                    else {
                        alert(CommonPageReturnJSon.ModelJSON);
                    }
                }
                catch (dd) {
                    alert(dd);
                }
            }
        });
    },
    KinitloaderList: function (pguid, browse_button, filedlist, showdoclistid, editdocflag, delflag) {
        if (pguid != '' && pguid != null && filedlist != '' && filedlist != null) {
            document.getElementById(filedlist).innerHTML = '';
            if (showdoclistid != '' && showdoclistid != null) {
               document.getElementById(showdoclistid).innerHTML = '';
            }
            try {
                $.ajax({
                    type: "POST",
                    url: '/Authed/getUpLoaderFileList',
                    dataType: "html",
                    data: {
                        ID: filedlist,
                        Guid: pguid
                    },
                    cache: false,
                    success: function (msg) {
                        try {
                            var CommonPageReturnJSon = JSON.parse(msg);
                            if (CommonPageReturnJSon.Type == "ok") {
                                var ModelJSON = JSON.parse(CommonPageReturnJSon.ModelJSON);
                                var FileList = JSON.parse(ModelJSON.FileList);
                                var ss = '<table width="100%" border="0" cellspacing="1" cellpadding="0" style="background-color:#C3D7EE; text-align:left; ">';
                                ss += '<tr style="background-color:#FAFAFA; font-weight:600; color:#666;text-align:center;">';
                                ss += '<td width="50%" height="25">名称</td>';
                                ss += '<td width="20%">大小</td>';
                                ss += '<td width="30%">操作</td>';
                                ss += '</tr>';
                                var ssdoc = '';
                                for (var i = 0; i < FileList.length; i++) {
                                    var dataArray = FileList[i].filemsg.split('|');
                                    ss += '<tr style="background-color:#FAFAFA; font-weight:600; color:#666;text-align:center;">';
                                    ss += '<td height="25"><a href="' + dataArray[1] + '" target="_blank">' + dataArray[3] + '</a></td>';
                                    ss += '<td>' + dataArray[2] + '</td>';
                                    if (KingonUI.Core.isOfficeFie(dataArray[3])) {
                                        if (editdocflag) {
                                            if (delflag) {
                                                ss += '<td ><a href="javascript:KingonUI.Core.DelPLoader(\'' + pguid + '\',\'' + dataArray[0] + '\',\'' + browse_button + '\',\'' + filedlist + '\',\'' + showdoclistid + '\',' + editdocflag + ',' + delflag + ')" target="_blank">删除</a>  <a href="/Ntko/EditOffice?guid=' + dataArray[0] + '" target="_blank">修改</a></td>'
                                            }
                                            else {
                                                ss += '<td ><a href="/Ntko/EditOffice?guid=' + dataArray[0] + '" target="_blank">修改</a></td>'
                                            }
                                        }
                                        else {
                                            if (delflag) {
                                                ss += '<td ><a href="javascript:KingonUI.Core.DelPLoader(\'' + pguid + '\',\'' + dataArray[0] + '\',\'' + browse_button + '\',\'' + filedlist + '\',\'' + showdoclistid + '\',' + editdocflag + ',' + delflag + ')" target="_blank">删除</a></td>'
                                            }
                                            else {
                                                ss += '<td></td>'
                                            }

                                        }

                                    } else {
                                        if (delflag) {
                                            ss += '<td ><a href="javascript:KingonUI.Core.DelPLoader(\'' + pguid + '\',\'' + dataArray[0] + '\',\'' + browse_button + '\',\'' + filedlist + '\',\'' + showdoclistid + '\',' + editdocflag + ',' + delflag + ')" target="_blank">删除</a></td>'
                                        }
                                        else {
                                            ss += '<td></td>'
                                        }
                                    }
                                    if (KingonUI.Core.isOfficeFie(dataArray[3])) {
                                        if (showdoclistid != '' && showdoclistid != null) {
                                            ssdoc = ssdoc + '<iframe src=\"/Home/getBaseFilesToHtml?guid=' + dataArray[0] + '\" style=\"width:100%;height: 400px;padding:10px 0;border:none;border-bottom:1px solid #ddd;\"></iframe>';
                                        }
                                    }
                                    ss += '</tr>'
                                }
                                ss += '</table>';
                                $('#' + filedlist).html(ss);
                                if (showdoclistid != '' && showdoclistid != null) {
                                    $('#' + showdoclistid).html(ssdoc);
                                }
                            }
                        } catch (dd) { alert(dd) }
                    }
                })
            } catch (d) {

            }
        }
    },
    //KingonUI.Core.Kuploader('处理url','附件guid','选择文件按键id','显示上传状态id','显示文件列表id','显示doc文件内容id','是否可传多个文件','文件的大小','文件类型','是否可修改doc文件','是否可删除文件','开始时否展开文件列表','开始是否展开文档列表');
    Kuploader: function (url, pguid, sbuttonid, statelistid, showlistid, showdoclistid, filenumber, filesize, filestype, editdocfllag, deleflag, showlistflag, showdoclistflag, ubuttonid, errlistid) {

        //alert(url + '_' + pguid + '_' + sbuttonid + '_' + statelistid + '_' + showlistid + '_' + showdoclistid + '_' + filenumber + '_' + filesize + '_' + filestype + '_' + editdocfllag + '_' + deleflag + '_' + showlistflag + '_' + showdoclistflag + '_' + ubuttonid + '_' + errlistid);
        var multiflag = true;
        if (filenumber == '1')
            multiflag = false;
        var newflag = false;
        if (!(pguid != '' && pguid != null)) {
            pguid = KingonUI.Core.getGuid();
            newflag = true;
        }
        if (url == '' || url == null) {
            if (!(pguid != '' && pguid != null)) {
                alert('上传控件必需提供附件的guid,及按键编号');
                return;
            }
            url = '/Authed/PlupLoad?CurGuid=' + pguid;
        }
        try {
            if (multiflag != false)
                multiflag = true;
            else
                multiflag = false;
        }
        catch (e) {
            multiflag = false;
        }
        if (filesize == '' || filesize == null) {
            filesize = "50mb";
        }
        else {
            if(!isNaN(filesize))
            {
                filesize = filesize + 'mb';
            }
        }
        if (!(sbuttonid != '' && sbuttonid != null)) {
            alert('上传控件必需提供附件的guid,及按键编号');
            return;
        }

        var imagefiles = '';
        var zipfiles = filestype.toLowerCase();
        if (zipfiles == '.*' || zipfiles == '*.*')
            zipfiles = '*';
        else
        {
            var filestypes = zipfiles.split(',');
            zipfiles = '';
            for (var i = 0; i < filestypes.length; i++) {
                var fy = filestypes[i];
                if (fy.indexOf('.') == 0)
                {
                    fy=fy.substring(1);
                }
                else if (fy.indexOf('*.') == 0) {
                    fy = fy.substring(2);
                }
                if (fy == 'jpeg2000' || fy == 'jpeg' || fy == 'jpg' || fy == 'gif' || fy == 'png' || fy == 'bmp')
                {
                    if (imagefiles=='') {
                        imagefiles = fy;
                    }
                    else
                    {
                        imagefiles =imagefiles+","+ fy;
                    }
                }
                else {
                    if(zipfiles=='')
                    {
                        zipfiles = fy;
                    }
                    else {
                        zipfiles = zipfiles + "," + fy;
                    }
                }
            }
        }

        var mime_types = [
                    { title: "Image files", extensions: imagefiles },
                    { title: "Zip files", extensions: zipfiles }
        ];

        var extensionsFlag = false;
        if (imagefiles != '' && imagefiles != null) {
            extensionsFlag = true;
            mime_types.push({ title: "Image files", extensions: imagefiles });
        }

        if (zipfiles != '' && zipfiles != null) {
            extensionsFlag = true;
            mime_types.push({ title: "Zip files", extensions: zipfiles });
        }
        if (!extensionsFlag) {
            mime_types.push({ title: "Zip files", extensions: '*' });
        }
        var uploader = new plupload.Uploader({
            runtimes: 'html5,flash,silverlight,html4',
            multi_selection: multiflag,
            browse_button: sbuttonid,
            url: url,
            flash_swf_url: '/Content/plupload30/js/Moxie.swf',
            silverlight_xap_url: '/Content/plupload30/js/Moxie.xap',
            filters: {
                max_file_size: filesize,
                mime_types: mime_types
            },
            init: {
                PostInit: function () {
                    if (statelistid != '' && statelistid != null) {
                        document.getElementById(statelistid).innerHTML = '';
                    }
                    if (ubuttonid != '' && ubuttonid != null) {
                        document.getElementById(ubuttonid).onclick = function () {
                            uploader.start();
                            return false;
                        };
                    }
                    if (!newflag)
                        KingonUI.Core.KinitloaderList(pguid, sbuttonid, showlistid, showdoclistid, editdocfllag, deleflag);
                    if (pguid != '' && pguid != null && showlistid != '' && showlistid != null) {
                        $file = $('#' + sbuttonid);
                        if (deleflag) {
                            var $del = $('<a href="javascript:KingonUI.Core.DelPLoader(\'' + pguid + '\',\'\',\'' + sbuttonid + '\',\'' + showlistid + '\',\'' + showdoclistid + '\',' + editdocfllag + ',' + deleflag + ')" target="_blank" style="text-decoration: none;color: #2a586f;display:inline-block;margin-right: 8px; "><i style="width: 16px; height: 16px; background: url(/Content/images/uploadbtn_icon.png); border: none; float: left; margin-top: 6px; margin-right: 4px; background-position: -48px 0"></i>[删除文件]</a>');
                            var $down = $('<a href="javascript:KingonUI.Core.ExpPLoader(\'' + pguid + '\')"  target="_blank" style="text-decoration: none;color: #2a586f;display:inline-block;margin-right: 8px; "><i style="width: 16px; height: 16px; background: url(/Content/images/uploadbtn_icon.png); border: none; float: left; margin-top: 6px; margin-right: 4px; background-position:0 16px"></i>[下载文件]</a>');
                            var $show = $('<a href="javascript:KingonUI.Core.ShowPLoader(\'' + pguid + '\',\'' + showlistid + '\')"  id="plshow_' + pguid + '" style="text-decoration: none;color: #2a586f;display:inline-block; margin-right: 8px; "><i style="width: 16px; height: 16px; background: url(/Content/images/uploadbtn_icon.png); border: none; float: left; margin-top: 6px; margin-right: 4px; background-position: -32px 0"></i>[收起文件]</a>');
                            if (!showlistflag)
                                $show = $('<a href="javascript:KingonUI.Core.ShowPLoader(\'' + pguid + '\',\'' + showlistid + '\')"  id="plshow_' + pguid + '" style="text-decoration: none;color: #2a586f;display:inline-block; margin-right: 8px; "><i style="width: 16px; height: 16px; background: url(/Content/images/uploadbtn_icon.png); border: none; float: left; margin-top: 6px; margin-right: 4px; background-position: -16px 0"></i>[展开文件]</a>');
                            if (showdoclistid != '' && showdoclistid!=null)
                            {
                                var $showdoc = $('<a href="javascript:KingonUI.Core.ShowDocPLoader(\'' + pguid + '\',\'' + showdoclistid + '\')"  id="plshowdoc_' + pguid + '" style="text-decoration: none;color: #2a586f;display:inline-block; margin-right: 8px; "><i style="width: 16px; height: 16px; background: url(/Content/images/uploadbtn_icon.png); border: none; float: left; margin-top: 6px; margin-right: 4px; background-position: -32px 0"></i>[收起文档]</a>');
                                if (!showdoclistflag)
                                    $showdoc = $('<a href="javascript:KingonUI.Core.ShowDocPLoader(\'' + pguid + '\',\'' + showdoclistid + '\')"  id="plshowdoc_' + pguid + '" style="text-decoration: none;color: #2a586f;display:inline-block; margin-right: 8px; "><i style="width: 16px; height: 16px; background: url(/Content/images/uploadbtn_icon.png); border: none; float: left; margin-top: 6px; margin-right: 4px; background-position: -16px 0"></i>[展开文档]</a>');
                                $file.after($showdoc).after($del).after($down).after($show);
                            }
                            else {
                                $file.after($del).after($down).after($show);
                            }
                            
                        }
                        else {
                            var $down = $('<a href="javascript:KingonUI.Core.ExpPLoader(\'' + pguid + '\')"  target="_blank" style="text-decoration: none;color: #2a586f;display:inline-block;margin-right: 8px;  "><i style="width: 16px; height: 16px; background: url(/Content/images/uploadbtn_icon.png); border: none; float: left; margin-top: 6px; margin-right: 4px; background-position: 0 16px"></i>[下载文件]</a>');
                            var $show = $('<a href="javascript:KingonUI.Core.ShowPLoader(\'' + pguid + '\',\'' + showlistid + '\')"  id="plshow_' + pguid + '" style="text-decoration: none;color: #2a586f;display:inline-block;margin-right: 8px;  "><i style="width: 16px; height: 16px; background: url(/Content/images/uploadbtn_icon.png); border: none; float: left; margin-top: 6px; margin-right: 4px; background-position: -32px 0"></i>[收起文件]</a>');
                            if (!showlistflag)
                                $show = $('<a href="javascript:KingonUI.Core.ShowPLoader(\'' + pguid + '\',\'' + showlistid + '\')"  id="plshow_' + pguid + '" style="text-decoration: none;color: #2a586f;display:inline-block; margin-right: 8px; "><i style="width: 16px; height: 16px; background: url(/Content/images/uploadbtn_icon.png); border: none; float: left; margin-top: 6px; margin-right: 4px; background-position: -16px 0"></i>[展开文件]</a>');
                            if (showdoclistid != '' && showdoclistid != null) {
                                var $showdoc = $('<a href="javascript:KingonUI.Core.ShowDocPLoader(\'' + pguid + '\',\'' + showdoclistid + '\')"  id="plshowdoc_' + pguid + '" style="text-decoration: none;color: #2a586f;display:inline-block; margin-right: 8px; "><i style="width: 16px; height: 16px; background: url(/Content/images/uploadbtn_icon.png); border: none; float: left; margin-top: 6px; margin-right: 4px; background-position: -32px 0"></i>[收起文档]</a>');
                                if (!showdoclistflag)
                                    $showdoc = $('<a href="javascript:KingonUI.Core.ShowDocPLoader(\'' + pguid + '\',\'' + showdoclistid + '\')"  id="plshowdoc_' + pguid + '" style="text-decoration: none;color: #2a586f;display:inline-block; margin-right: 8px; "><i style="width: 16px; height: 16px; background: url(/Content/images/uploadbtn_icon.png); border: none; float: left; margin-top: 6px; margin-right: 4px; background-position: -16px 0"></i>[展开文档]</a>');
                                $file.after($showdoc).after($down).after($show);
                            }
                            else {
                                $file.after($down).after($show);
                            }
                            
                        }
                    }
                },
                FilesAdded: function (up, files) {
                    plupload.each(files, function (file) {
                        if (statelistid != '' && statelistid != null) {
                            document.getElementById(statelistid).innerHTML += '<div id="' + file.id + '">' + file.name + ' (' + plupload.formatSize(file.size) + ') <b></b></div>';
                        }
                    });
                    if (!(ubuttonid != '' && ubuttonid != null)) {
                        uploader.start();
                    }
                },
                UploadComplete: function (up, files) {
                    if (statelistid != '' && statelistid != null) {
                        document.getElementById(statelistid).innerHTML = '';
                    }
                    KingonUI.Core.KinitloaderList(pguid, sbuttonid, showlistid, showdoclistid, editdocfllag, deleflag);
                },
                FileUploaded: function (up, file, responseObject) {
                    try {
                        var CommonPageReturnJSon = JSON.parse(responseObject.response);
                        if (CommonPageReturnJSon.Type != 'ok') {
                            alert('文件[' + file.name + ']上传失败,原因是[' + CommonPageReturnJSon.ModelJSON + ']');
                        }
                    }
                    catch (d) {
                        alert('文件[' + file.name + ']上传失败');
                    }
                },
                UploadProgress: function (up, file) {
                    if (statelistid != '' && statelistid != null) {
                        document.getElementById(file.id).getElementsByTagName('b')[0].innerHTML = '<span>' + file.percent + "%</span>";
                    }
                },
                Error: function (up, err) {
                    if (errlistid != '' && consoleid != null) {
                        document.getElementById(errlistid).appendChild(document.createTextNode("\nError #" + err.code + ": " + err.message));
                    }
                }
            }
        });
        uploader.init();
    },
    CheckPActionList: function (PowerName) {
        try {
            if (PageMode.Page_ActionList.indexOf(PowerName) != -1) {
                if (PageMode.Page_PActionList.indexOf(PowerName) != -1) return true;
                else return false
            } else return true
        } catch (dd) {
            return false
        }
    },
    dopicZoom: function (vv) {
        try {
            if ($('#' + vv).attr("btype") == "0") {
                $('#' + vv).removeAttr("width");
                $('#' + vv).removeAttr("height");
                $('#' + vv).attr("btype", "1")
            } else {
                $('#' + vv).attr("width", $('#' + vv).attr("bwidth"));
                $('#' + vv).attr("height", $('#' + vv).attr("bheight"));
                $('#' + vv).attr("btype", "0")
            }
        } catch (dd) { }
    },
    getRootdir: function () {
        try {
            if (LoginPageMode.Rootdir) {
                if (LoginPageMode.Rootdir.substring(LoginPageMode.Rootdir.length - 1, 1) == '/') return LoginPageMode.Rootdir.substring(0, LoginPageMode.Rootdir.length - 1);
                else return LoginPageMode.Rootdir
            }
        } catch (d) { }
        return ''
    },
    each: function (obj, iterator, context) {
        if (obj == null) return;
        if (obj.length === +obj.length) {
            for (var i = 0,
            l = obj.length; i < l; i++) {
                if (iterator.call(context, obj[i], i, obj) === false) return false
            }
        } else {
            for (var key in obj) {
                if (obj.hasOwnProperty(key)) {
                    if (iterator.call(context, obj[key], key, obj) === false) return false
                }
            }
        }
    },
    GetCookie: function (Nave) {
        var v = '';
        try {
            v = $.cookie(Nave);
            if (v == undefined || v == 'undefined') v = ''
        } catch (d) { }
        return v
    },
    ShowStrLen: function (str, len) {
        if (str.length > len) return str.substring(0, len - 1) + '..';
        else return str
    },
    SaveCookie: function (Nave, Value) {
        try {
            $.cookie(Nave, Value)
        } catch (d) { }
    },
    SaveSession: function (Nave, Value) {
        try {
            $.ajax({
                type: "POST",
                url: '/Authed/SaveSession',
                dataType: "html",
                data: {
                    SessionName: Nave,
                    SessionValue: Value
                },
                cache: false
            })
        } catch (d) { }
    },
    GetUserIP: function () {
        try {
            if (!Sys.InitPageInfoFlag) InitPageInfo();
            return LoginPageMode.LocalUserIP
        } catch (d) { }
        return ''
    },
    GetUserLevel: function () {
        try {
            if (!Sys.InitPageInfoFlag) InitPageInfo();
            return LoginPageMode.UserLevel
        } catch (d) { }
        return ''
    },
    GetDeptLevel: function () {
        try {
            if (!Sys.InitPageInfoFlag) InitPageInfo();
            return LoginPageMode.DeptLevel
        } catch (d) { }
        return ''
    },
    GetPreUserLevelStr: function () {
        try {
            if (!Sys.InitPageInfoFlag) InitPageInfo();
            return LoginPageMode.PreUserLevelStr
        } catch (d) { }
        return ''
    },
    GetCorpID: function () {
        try {
            if (!Sys.InitPageInfoFlag) InitPageInfo();
            if (LoginPageMode.LocalCorpID == '') {
                try {
                    LoginPageMode.LocalCorpID = LocalCorpID
                } catch (d) { }
            }
            return LoginPageMode.LocalCorpID
        } catch (d) { }
        return ''
    },
    GetCorpName: function () {
        try {
            if (!Sys.InitPageInfoFlag) InitPageInfo();
            if (LoginPageMode.LocalCorpName == '') {
                try {
                    LoginPageMode.LocalCorpName = LocalCorpName
                } catch (d) { }
            }
            return LoginPageMode.LocalCorpName
        } catch (d) { }
        return ''
    },
    GetPreDeptID: function () {
        try {
            if (!Sys.InitPageInfoFlag) InitPageInfo();
            if (LoginPageMode.LocalPreDeptID == '') {
                try {
                    LoginPageMode.LocalPreDeptID = LocalPreDeptID
                } catch (d) { }
            }
            return LoginPageMode.LocalPreDeptID
        } catch (d) { }
        return ''
    },
    GetPreDeptName: function () {
        try {
            if (!Sys.InitPageInfoFlag) InitPageInfo();
            if (LoginPageMode.LocalPreDeptID == '') {
                try {
                    LoginPageMode.LocalPreDeptID = LocalPreDeptID
                } catch (d) { }
            }
            return LoginPageMode.LocalPreDeptID
        } catch (d) { }
        return ''
    },
    GetPreDeptIDList: function () {
        try {
            if (!Sys.InitPageInfoFlag) InitPageInfo();
            if (LoginPageMode.LocalPreDeptID == '') {
                try {
                    LoginPageMode.LocalPreDeptID = LocalPreDeptID
                } catch (d) { }
            }
            return LoginPageMode.LocalPreDeptID
        } catch (d) { }
        return ''
    },
    GetPreDeptNameList: function () {
        try {
            if (!Sys.InitPageInfoFlag) InitPageInfo();
            if (LoginPageMode.LocalPreDeptID == '') {
                try {
                    LoginPageMode.LocalPreDeptID = LocalPreDeptID
                } catch (d) { }
            }
            return LoginPageMode.LocalPreDeptID
        } catch (d) { }
        return ''
    },
    GetDeptID: function () {
        try {
            if (!Sys.InitPageInfoFlag) InitPageInfo();
            if (LoginPageMode.LocalDeptID == '') {
                try {
                    LoginPageMode.LocalDeptID = LocalDeptID
                } catch (d) { }
            }
            return LoginPageMode.LocalDeptID
        } catch (d) { }
        return ''
    },
    GetDeptName: function () {
        try {
            if (!Sys.InitPageInfoFlag) InitPageInfo();
            if (LoginPageMode.LocalDeptName == '') {
                try {
                    LoginPageMode.LocalDeptName = LocalDeptName
                } catch (d) { }
            }
            return LoginPageMode.LocalDeptName
        } catch (d) { }
        return ''
    },
    GetPrePostID: function () {
        try {
            if (!Sys.InitPageInfoFlag) InitPageInfo();
            if (LoginPageMode.LocalPrePostID == '') {
                try {
                    LoginPageMode.LocalPrePostID = LocalPrePostID
                } catch (d) { }
            }
            return LoginPageMode.LocalPrePostID
        } catch (d) { }
        return ''
    },
    GetPrePostName: function () {
        try {
            if (!Sys.InitPageInfoFlag) InitPageInfo();
            if (LoginPageMode.LocalPrePostName == '') {
                try {
                    LoginPageMode.LocalPrePostName = LocalPrePostName
                } catch (d) { }
            }
            return LoginPageMode.LocalPrePostName
        } catch (d) { }
        return ''
    },
    GetPrePostIDList: function () {
        try {
            if (!Sys.InitPageInfoFlag) InitPageInfo();
            if (LoginPageMode.LocalPrePostIDList == '') {
                try {
                    LoginPageMode.LocalPrePostIDList = LocalPrePostIDList
                } catch (d) { }
            }
            return LoginPageMode.LocalPrePostIDList
        } catch (d) { }
        return ''
    },
    GetPrePostNameList: function () {
        try {
            if (!Sys.InitPageInfoFlag) InitPageInfo();
            if (LoginPageMode.LocalPrePostNameList == '') {
                try {
                    LoginPageMode.LocalPrePostNameList = LocalPrePostNameList
                } catch (d) { }
            }
            return LoginPageMode.LocalPrePostNameList
        } catch (d) { }
        return ''
    },
    GetPostID: function () {
        try {
            if (!Sys.InitPageInfoFlag) InitPageInfo();
            if (LoginPageMode.LocalPostID == '') {
                try {
                    LoginPageMode.LocalPostID = LocalPostID
                } catch (d) { }
            }
            return LoginPageMode.LocalPostID
        } catch (d) { }
        return ''
    },
    GetPostName: function () {
        try {
            if (!Sys.InitPageInfoFlag) InitPageInfo();
            if (LoginPageMode.LocalPostName == '') {
                try {
                    LoginPageMode.LocalPostName = LocalPostName
                } catch (d) { }
            }
            return LoginPageMode.LocalPostName
        } catch (d) { }
        return ''
    },
    GetUserID: function () {
        try {
            if (!Sys.InitPageInfoFlag) InitPageInfo();
            if (LoginPageMode.LocalUserID == '') {
                try {
                    LoginPageMode.LocalUserID = LocalUserID
                } catch (d) { }
            }
            return LoginPageMode.LocalUserID
        } catch (d) { }
        return ''
    },
    GetUserName: function () {
        try {
            if (!Sys.InitPageInfoFlag) InitPageInfo();
            if (LoginPageMode.LocalUserID == '') {
                try {
                    LoginPageMode.LocalUserName = LocalUserName
                } catch (d) { }
            }
            return LoginPageMode.LocalUserName
        } catch (d) { }
        return ''
    },
    getGuid: function () {
        return KingonUI.Core.newid(false)
    },
    getaddDayStr: function (str, day) {
        str = str.replace(/-/g, "/");
        var date = new Date(Date.parse(str));
        date.setDate(date.getDate() + day);
        return KingonUI.Core.getDateStr(date)
    },
    addDayDate: function (d, day) {
        d.setDate(d.getDate() + day);
        return d
    },
    addDayGurDate: function (day) {
        var d = new Date();
        d.setDate(d.getDate() + day);
        return d
    },
    getGurDate: function () {
        return new Date()
    },
    getStrDateFromStr: function (str) {
        str = str.replace(/-/g, "/");
        var date = new Date(Date.parse(str));
        return date
    },
    getDateFromStr: function (str) {
        str = str.replace(/-/g, "/");
        var date = new Date(Date.parse(str));
        return KingonUI.Core.getDateStr(date)
    },
    getGurDateStr: function () {
        var curr_time = new Date();
        var strDate = curr_time.getFullYear() + "-";
        var m = curr_time.getMonth() + 1;
        if (m < 10) strDate += '0' + m + "-";
        else strDate += m + "-";
        var d = curr_time.getDate();
        if (d < 10) strDate += '0' + d + " ";
        else strDate += d + " ";
        var h = curr_time.getHours();
        if (h < 10) strDate += '0' + h + ":";
        else strDate += h + ":";
        var m = curr_time.getMinutes();
        if (m < 10) strDate += '0' + m + ":";
        else strDate += m + ":";
        var s = curr_time.getSeconds();
        if (s < 10) strDate += '0' + s;
        else strDate += s;
        return strDate
    },
    getDateStr: function (curr_time) {
        var strDate = curr_time.getFullYear() + "-";
        var m = curr_time.getMonth() + 1;
        if (m < 10) strDate += '0' + m + "-";
        else strDate += m + "-";
        var d = curr_time.getDate();
        if (d < 10) strDate += '0' + d + " ";
        else strDate += d + " ";
        var h = curr_time.getHours();
        if (h < 10) strDate += '0' + h + ":";
        else strDate += h + ":";
        var m = curr_time.getMinutes();
        if (m < 10) strDate += '0' + m + ":";
        else strDate += m + ":";
        var s = curr_time.getSeconds();
        if (s < 10) strDate += '0' + s;
        else strDate += s;
        return strDate
    },
    getGurDateTimeStr: function () {
        var curr_time = new Date();
        var strDate = curr_time.getFullYear().toString();
        strDate += (curr_time.getMonth() + 1).toString();
        strDate += curr_time.getDate().toString();
        strDate += curr_time.getHours().toString();
        strDate += curr_time.getMinutes().toString();
        strDate += curr_time.getSeconds().toString();
        return strDate
    },
    GetToken: function () {
        try {
            return LoginPageMode.token
        } catch (d) { }
        return ''
    },
    newid: function (isMiddline) {
        var guid = "";
        isMiddline = isMiddline == undefined ? true : isMiddline;
        for (var i = 1; i <= 32; i++) {
            var n = Math.floor(Math.random() * 16.0).toString(16);
            guid += n;
            if (isMiddline && (i == 8 || i == 12 || i == 16 || i == 20)) {
                guid += "-"
            }
        }
        return guid
    },
    getIframeID: function () {
        try {
            var id = KingonUI.Core.getQueryStringValue("wifrid");
            if (id == null) return "";
            else return id
        } catch (dd) { }
        return ""
    },
    getOIframeID: function () {
        try {
            var id = KingonUI.Core.getQueryStringValue("oifrid");
            if (id == null) return "";
            else return id
        } catch (dd) { }
        return ""
    },
    getStyleValue: function (style, key) {
        var arr = style.split(';');
        for (var i = 0; i < arr.length; i++) {
            var op = arr[i].split(':');
            if (op[0].toLowerCase() == key.toLowerCase()) return op[1]
        }
        return ''
    },
    setStyleValue: function (style, key, value) {
        var s = '';
        if (style == null || style == undefined) style = '';
        var arr = style.split(';');
        var flag = true;
        for (var i = 0; i < arr.length; i++) {
            try {
                if (KingonUI.Core.isNullOrEmpty(arr[i])) continue;
                var op = arr[i].split(':');
                var opk = op[0];
                var opv = op[1];
                try {
                    if (i != 0) s += ';';
                    if (opk.toLowerCase() == key.toLowerCase()) {
                        flag = false;
                        s += opk + ':' + value
                    } else {
                        s += opk + ':' + opv
                    }
                } catch (dd) { }
            } catch (dd) { }
        }
        if (flag) {
            if (s == '') {
                s = key + ':' + value
            } else {
                s += ';' + key + ':' + value
            }
        }
        return s
    },
    getEasyUIOptionsValue: function (data_options, key) {
        var arr = data_options.split(',');
        for (var i = 0; i < arr.length; i++) {
            var op = arr[i].split(':');
            if (op[0].toLowerCase() == key.toLowerCase()) return op[1]
        }
        return ''
    },
    setEasyUIOptionsValue: function (data_options, key, value) {
        var s = '';
        if (data_options == null || data_options == undefined) data_options = '';
        var arr = data_options.split(',');
        var flag = true;
        for (var i = 0; i < arr.length; i++) {
            try {
                if (KingonUI.Core.isNullOrEmpty(arr[i])) continue;
                var op = arr[i].split(':');
                var opk = op[0];
                var opv = op[1];
                try {
                    if (i != 0) s += ',';
                    if (opk.toLowerCase() == key.toLowerCase()) {
                        flag = false;
                        s += opk + ':' + value
                    } else {
                        s += opk + ':' + opv
                    }
                } catch (dd) { }
            } catch (dd) { }
        }
        if (flag) {
            if (s == '') {
                s = key + ':' + value
            } else {
                s += ',' + key + ':' + value
            }
        }
        return s
    },
    getCurQueryStringValue: function (curlocation, name) {
        var items = null;
        try {
            var search = curlocation.search;
            var pattern = new RegExp("[?&]" + name + "\=([^&]+)", "g");
            var matcher = pattern.exec(search);
            if (null != matcher) {
                try {
                    items = decodeURIComponent(decodeURIComponent(matcher[1]))
                } catch (e) {
                    try {
                        items = decodeURIComponent(matcher[1])
                    } catch (e) {
                        items = matcher[1]
                    }
                }
            }
        } catch (dd) { }
        return items
    },
    getLocalHostName: function () {
        return document.location.hostname
    },
    getLocalHostName: function () {
        return document.location.port
    },
    getQueryStringValue: function (name) {
        var items = null;
        try {
            var search = document.location.search;
            var pattern = new RegExp("[?&]" + name + "\=([^&]+)", "g");
            var matcher = pattern.exec(search);
            if (null != matcher) {
                try {
                    items = decodeURIComponent(decodeURIComponent(matcher[1]))
                } catch (e) {
                    try {
                        items = decodeURIComponent(matcher[1])
                    } catch (e) {
                        items = matcher[1]
                    }
                }
            }
        } catch (dd) { }
        return items
    },
    open: function (url, width, height, name) {
        var iWidth = width || 700;
        var iHeight = height || 500;
        var y = (window.screen.availHeight - 30 - iHeight) / 2;
        var x = (window.screen.availWidth - 10 - iWidth) / 2;
        Sys.MainDialog.open({
            url: url,
            top: y,
            left: x,
            width: iWidth,
            height: iHeight,
            showico: false,
            title: name,
            resize: false,
            ismodal: true,
            showclose: true
        })
    },
    isInteger: function (value) {
        return /^([+]?[0-9])|([-]?[0-9])+\d*$/i.test(value)
    },
    isNumber: function (value) {
        return (new RegExp(/^-?(?:\d+|\d{1,3}(?:,\d{3})+)(?:\.\d+)?$/).test(value))
    },
    trim: function (value) {
        return value.replace(/(^\s*)|(\s*$)/g, "")
    },
    isNullOrEmpty: function (value) {
        return !value || value.length == 0 || KingonUI.Core.trim(value).length == 0
    },
    isMail: function (value) {
        return (new RegExp(/^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/).test(KingonUI.Core.trim(value)))
    },
    isPhone: function (value) {
        var v = (new RegExp(/(^([0-9]{3,4}[-])?\d{3,8}(-\d{1,6})?$)|(^\([0-9]{3,4}\)\d{3,8}(\(\d{1,6}\))?$)|(^\d{3,8}$)/).test(value));
        if (!v) {
            v = (new RegExp(/^0?(13|14|15|18)[0-9]{9}$/).test(value))
        }
        return v
    },
    isUrl: function (value) {
        return (new RegExp(/^[a-zA-z]+:\/\/([a-zA-Z0-9\-\.]+)([-\w .\/?%&=:]*)$/).test(value))
    },
    isExternalUrl: function (value) {
        return KingonUI.Core.isUrl(value) && value.indexOf("://" + document.domain) == -1
    },
    replaceAll: function (value, s1, s2) {
        var str = value;
        while (str.indexOf(s1) != -1) {
            str = str.replace(s1, s2)
        }
        return str
    },
    accDiv: function (arg1, arg2) {
        var t1 = 0,
        t2 = 0,
        r1, r2;
        try {
            t1 = arg1.toString().split(".")[1].length
        } catch (e) { }
        try {
            t2 = arg2.toString().split(".")[1].length
        } catch (e) { }
        with (Math) {
            r1 = Number(arg1.toString().replace(".", ""));
            r2 = Number(arg2.toString().replace(".", ""));
            return (r1 / r2) * pow(10, t2 - t1)
        }
    },
    accMul: function (arg1, arg2) {
        var m = 0,
        s1 = arg1.toString(),
        s2 = arg2.toString();
        try {
            m += s1.split(".")[1].length
        } catch (e) { }
        try {
            m += s2.split(".")[1].length
        } catch (e) { }
        return Number(s1.replace(".", "")) * Number(s2.replace(".", "")) / Math.pow(10, m)
    },
    accAdd: function (arg1, arg2) {
        var r1, r2, m, c;
        try {
            r1 = arg1.toString().split(".")[1].length
        } catch (e) {
            r1 = 0
        }
        try {
            r2 = arg2.toString().split(".")[1].length
        } catch (e) {
            r2 = 0
        }
        c = Math.abs(r1 - r2);
        m = Math.pow(10, Math.max(r1, r2));
        if (c > 0) {
            var cm = Math.pow(10, c);
            if (r1 > r2) {
                arg1 = Number(arg1.toString().replace(".", ""));
                arg2 = Number(arg2.toString().replace(".", "")) * cm
            } else {
                arg1 = Number(arg1.toString().replace(".", "")) * cm;
                arg2 = Number(arg2.toString().replace(".", ""))
            }
        } else {
            arg1 = Number(arg1.toString().replace(".", ""));
            arg2 = Number(arg2.toString().replace(".", ""))
        }
        return (arg1 + arg2) / m
    },
    accSub: function (arg1, arg2) {
        var r1, r2, m, n;
        try {
            r1 = arg1.toString().split(".")[1].length
        } catch (e) {
            r1 = 0
        }
        try {
            r2 = arg2.toString().split(".")[1].length
        } catch (e) {
            r2 = 0
        }
        m = Math.pow(10, Math.max(r1, r2));
        n = (r1 >= r2) ? r1 : r2;
        return ((arg1 * m - arg2 * m) / m).toFixed(n)
    },
    intDiv: function (number1, number2) {
        var num1 = Math.round(number1);
        var num2 = Math.round(number2);
        var result = num1 / num2;
        if (result >= 0) {
            result = Math.floor(result)
        } else {
            result = Math.ceil(result)
        }
        return result
    },
    isIdCard: function (value) {
        return /^\d{15}(\d{2}[A-Za-z0-9])?$/i.test(value)
    },
    isIntOrFloat: function (value) {
        return /^\d+(\.\d+)?$/i.test(value)
    },
    isCurrency: function (value) {
        return /^\d+(\.\d+)?$/i.test(value)
    },
    isQQNum: function (value) {
        return /^[1-9]\d{4,9}$/i.test(value)
    },
    isAge: function (value) {
        return /^(?:[1-9][0-9]?|1[01][0-9]|120)$/i.test(value)
    },
    isChinese: function (value) {
        return /^[\Α-\￥]+$/i.test(value)
    },
    isEnglish: function (value) {
        return /^[A-Za-z]+$/i.test(value)
    },
    isFaxNo: function (value) {
        return /^((\(\d{2,3}\))|(\d{3}\-))?(\(0\d{2,3}\)|0\d{2,3}-)?[1-9]\d{6,7}(\-\d{1,4})?$/i.test(value)
    },
    isZipNum: function (value) {
        return /^[1-9]\d{5}$/i.test(value)
    },
    isIp: function (value) {
        return /d+.d+.d+.d+/i.test(value)
    },
    isMsnNum: function (value) {
        return /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/.test(value)
    },
    isIE: function () {
        if (Sys.IE) return true;
        else return false
    },
    getNavigator: function () {
        if (Sys.IE) return 'IE:' + Sys.IE;
        if (Sys.Firefox) return 'FireFox:' + Sys.Firefox;
        if (Sys.Chrome) return 'Chrome:' + Sys.Chrome;
        if (Sys.Opera) return 'Opera:' + Sys.Opera;
        if (Sys.Safari) return 'Safari:' + Sys.Safari;
        if (Sys.QQBrowser) return 'QQ:' + Sys.QQBrowser;
        return ua
    },
    isOfficeFie: function (value) {
        var fvalue = value.toLowerCase();
        if (fvalue.indexOf('.doc') > 0 || fvalue.indexOf('.docx') > 0 || fvalue.indexOf('.xls') > 0 || fvalue.indexOf('.xlsx') > 0 || fvalue.indexOf('.ppt') > 0 || fvalue.indexOf('.pptx') > 0 || fvalue.indexOf('.wps') > 0 || fvalue.indexOf('.et') > 0) return true;
        else return false
    },
    getPager: function (count, size, number, param, instanceName) {
        var pager = '';
        size = size || 15;
        number = number || 1;
        var pageCount = count <= 0 ? 1 : count % size == 0 ? parseInt(count / size) : parseInt(count / size) + 1;
        if (pageCount <= 1) { }
        if (number < 1) {
            number = 1
        } else if (number > pageCount) {
            number = pageCount
        }
        var displaySize = 10;
        pager += "<div>";
        pager += "<span style='margin-right:15px;'>共 " + count.toString() + " 条  每页 <input type='text' id='tnt_count' title='输入数字可改变每页显示条数' class='pagertxt' onchange=\"javascript:" + instanceName + ".loadData(parseInt(this.value)," + number + ");\" value='" + size.toString() + "' /> 条  ";
        pager += "转到 <input type='text' id='paernumbertext' title='输入数字可跳转页' value=\"" + number.toString() + "\" onchange=\"javascript:" + instanceName + ".loadData(" + size + ",parseInt(this.value));\" class='pagertxt'/> 页</span>";
        if (number > 1) {
            pager += "<a class=\"pager\" href=\"javascript:" + instanceName + ".loadData(" + size + "," + (number - 1) + ");\"><span class=\"pagerarrow\">?</span></a>"
        }
        if (number >= parseInt(displaySize / 2) + 3) {
            pager += "<a class=\"pager\" href=\"javascript:" + instanceName + ".loadData(" + size + "," + 1 + ");\">1…</a>"
        } else {
            pager += "<a class=\"" + (1 == number ? "pagercurrent" : "pager") + "\" href=\"javascript:" + instanceName + ".loadData(" + size + "," + 1 + ");\">1</a>"
        }
        var star = number - parseInt(displaySize / 2);
        var end = number + parseInt(displaySize / 2) - 1;
        if (star < 2) {
            end += 2 - star;
            star = 2
        }
        if (end > pageCount - 1) {
            star -= end - (pageCount - 1);
            end = pageCount - 1
        }
        if (star < 2) {
            star = 2
        }
        for (var i = star; i <= end; i++) {
            pager += "<a class=\"" + (i == number ? "pagercurrent" : "pager") + "\" href=\"javascript:" + instanceName + ".loadData(" + size + "," + i + ");\">" + i.toString() + "</a>"
        }
        if (number <= pageCount - parseInt(displaySize / 2)) {
            pager += "<a class=\"pager\" href=\"javascript:" + instanceName + ".loadData(" + size + "," + pageCount + ");\">…" + pageCount.toString() + "</a>"
        } else if (pageCount > 1) {
            pager += "<a class=\"" + (pageCount == number ? "pagercurrent" : "pager") + "\" href=\"javascript:" + instanceName + ".loadData(" + size + "," + pageCount + ");\">" + pageCount.toString() + "</a>"
        }
        if (number < pageCount) {
            pager += "<a class=\"pager\" href=\"javascript:" + instanceName + ".loadData(" + size + "," + (number + 1) + ");\"><span class=\"pagerarrow\">?</span></a>"
        }
        pager += "</div>";
        return pager
    }
};
KingonUI.Hashtable = function () {
    this.items = new Array();
    this.itemsCount = 0;
    this.add = function (key, value) {
        if (!this.containsKey(key)) {
            this.items[key] = value;
            this.itemsCount
        }
    },
    this.get = function (key) {
        if (this.containsKey(key)) return this.items[key];
        else return null
    },
    this.remove = function (key) {
        if (this.containsKey(key)) {
            delete this.items[key];
            this.itemsCount--
        }
    },
    this.containsKey = function (key) {
        return typeof (this.items[key]) != "undefined"
    },
    this.containsValue = function containsValue(value) {
        for (var item in this.items) {
            if (this.items[item] == value) return true
        }
        return false
    },
    this.contains = function (keyOrValue) {
        return this.containsKey(keyOrValue) || this.containsValue(keyOrValue)
    },
    this.clear = function () {
        this.items = new Array();
        itemsCount = 0
    },
    this.size = function () {
        return this.itemsCount
    },
    this.isEmpty = function () {
        return this.size() == 0
    }
};
KingonUI.Xml = {
    getXmlDom: function () {
        var xmldoc;
        if (window.ActiveXObject) {
            xmldoc = new ActiveXObject("Microsoft.XMLDOM")
        } else {
            if (document.implementation && document.implementation.createDocument) {
                xmldoc = document.implementation.createDocument("", "doc", null)
            }
        }
        return xmldoc
    },
    loadXML: function (xml) {
        var xmldoc = KingonUI.Xml.getXmlDom();
        xmldoc.async = false;
        try {
            xmldoc.loadXML(xml)
        } catch (e) {
            xmldoc = new DOMParser().parseFromString(xml, "text/xml")
        }
        return xmldoc
    },
    getElementValue: function (elements) {
        return elements && elements.length > 0 && elements[0].firstChild ? elements[0].firstChild.nodeValue : ""
    }
};
Array.prototype.unique = function () {
    var res = [];
    var json = {};
    for (var i = 0; i < this.length; i++) {
        if (!json[this[i]]) {
            res.push(this[i]);
            json[this[i]] = 1
        }
    }
    return res
};
KingonUI.Window = function () {
    this.opts = {};
    var instance = this;
    this.open = function (options) {
        try {
            var defaults = {
                id: "",
                title: "",
                url: "",
                ico: "",
                showico: true,
                showclose: true,
                left: 0,
                top: 0,
                height: 300,
                width: 600,
                ismodal: true,
                zindex: 8888,
                resize: true,
                worker: null,
                openerid: ""
            };
            this.opts = $.extend(defaults, options);
            if (this.opts.worker == null) {
                this.opts.worker = window
            }
            this.opts.id = this.getID();
            var $worker = $(this.opts.worker);
            if ($worker == null || $worker.size() == 0) {
                throw "父窗口为空!";
                return false
            }
            var $workerBody = $(this.opts.worker.document.body);
            var $workerDocument = $(this.opts.worker.document);
            if ($workerBody == null || $workerBody.size() == 0) {
                throw "父窗口body为空!";
                return false
            }
            if (this.opts.left == 0) {
                this.opts.left = ($worker.width() - this.opts.width) / 2
            }
            if (this.opts.top == 0) {
                this.opts.top = ($worker.height() - this.opts.height) / 2 + $(this.opts.worker.document).scrollTop()
            }
            if (this.opts.ismodal) {
                var $maskdiv = $('<div id="' + this.opts.id + '_mdiv" class="window_maskdiv" style="z-index:' + (this.opts.zindex - 1) + ';"></div>', $workerDocument);
                $maskdiv.width($worker.width()).height(Math.max($workerBody.get(0).clientHeight, $worker.height()));
                $workerBody.append($maskdiv)
            }
            var $maindiv = $('<div id="' + this.opts.id + '" class="window_maindiv" style="left:' + this.opts.left + 'px;top:' + this.opts.top + 'px;width:' + this.opts.width + 'px;height:' + this.opts.height + 'px;z-index:' + this.opts.zindex + ';"></div>', $workerDocument);
            var $titlediv = $('<div id="' + this.opts.id + '_titlediv" class="window_title"></div>', $workerDocument);
            var $bodydiv = $('<div class="window_body"></div>', $workerDocument);
            var $resizediv = null;
            var $titlediv_title = $('<div class="' + (this.opts.showico ? 'window_title_title_ico' : 'window_title_title') + '">' + this.opts.title + '</div>', $workerDocument);
            if (this.opts.showico && this.opts.ico && KingonUI.Core.trim(this.opts.ico).length > 0) {
                $titlediv_title.css({
                    'background-image': 'url(' + this.opts.ico + ')'
                })
            }
            $titlediv_title.bind("dblclick",
            function () {
                instance.close($(this).parent().parent().attr("id"))
            });
            var $titlediv_button = $();
            if (this.opts.showclose) {
                $titlediv_button = $('<div class="window_title_button">&nbsp;</div>', $workerDocument);
                $titlediv_button.bind("mouseover",
                function () {
                    $(this).removeClass().addClass("window_title_button1")
                }).bind("mouseout",
                function () {
                    $(this).removeClass().addClass("window_title_button")
                }).bind("click",
                function () {
                    instance.close($(this).parent().parent().attr("id"))
                })
            }
            $titlediv.append($titlediv_title, $titlediv_button, '<div style="clear:both;"></div>');
            var bodydivHeight = this.opts.height - (this.opts.resize ? 39 : 26);
            $bodydiv.css({
                "height": bodydivHeight + "px"
            });
            if (!KingonUI.Core.isNullOrEmpty(this.opts.url)) {
                var url = this.opts.url;
                if (url.indexOf('?') >= 0) {
                    url += "&wifrid=" + this.opts.id
                } else {
                    url += "?wifrid=" + this.opts.id
                }
                if (!KingonUI.Core.isNullOrEmpty(this.opts.openerid)) {
                    url += "&oifrid=" + this.opts.openerid
                }
                var $iframe = $('<iframe id="' + this.opts.id + '_iframe" scrolling="auto" name="' + this.opts.id + '_iframe" src="' + url + '" frameborder="0" marginheight="0" marginwidth="0" border="0" style="border:none 0;margin:0;padding:0;width:100%;height:' + bodydivHeight + 'px;"></iframe>', $workerDocument);
                if (KingonUI.Core.isNullOrEmpty(this.opts.title)) {
                    $iframe.bind("load",
                    function () {
                        if (!instance.opts.title || KingonUI.Core.trim(instance.opts.title).length == 0) {
                            var title = "";
                            try {
                                title = $("head title", $(this).contents()).html()
                            } catch (e) { }
                            instance.setTitle(title)
                        }
                    })
                }
                $bodydiv.append($iframe)
            }
            $maindiv.append($titlediv, $bodydiv);
            if (this.opts.resize) {
                $resizediv = $('<div class="window_resize"><div class="window_resize_img">&nbsp;</div></div>', $workerDocument);
                $maindiv.append($resizediv)
            }
            $workerBody.append($maindiv);
            var maindiv = $maindiv.get(0);
            var titlediv = $titlediv.get(0);
            var resizediv = $resizediv ? $resizediv.get(0) : null;
            new draging(titlediv,
            function () {
                return {
                    x: maindiv.offsetLeft,
                    y: maindiv.offsetTop
                }
            },
            function (x, y) {
                win = instance.opts.worker || top;
                var iSTop = win.document.body.scrollTop || win.document.documentElement.scrollTop;
                if (x < 0) {
                    x = 0
                } else if (x + maindiv.offsetWidth > win.document.documentElement.clientWidth) {
                    x = win.document.body.clientWidth - maindiv.offsetWidth
                }
                if (y < iSTop) {
                    y = iSTop
                } else if (y + maindiv.offsetHeight > win.document.documentElement.clientHeight + iSTop) {
                    y = win.document.documentElement.clientHeight - maindiv.offsetHeight + iSTop
                }
                maindiv.style.left = x + 'px';
                maindiv.style.top = y + 'px'
            },
            instance.opts.worker);
            if (this.opts.resize) {
                var resizediv = $resizediv.get(0);
                new draging(resizediv,
                function () {
                    g_orgTop = maindiv.offsetTop;
                    g_orgHeight = maindiv.offsetHeight;
                    g_orgLeft = maindiv.offsetLeft;
                    g_orgWidth = maindiv.offsetWidth;
                    return {
                        x: maindiv.offsetWidth,
                        y: maindiv.offsetHeight
                    }
                },
                function (x, y) {
                    this.doBothDrag(x, y, maindiv)
                },
                instance.opts.worker)
            };
            return this.opts.id
        } catch (dd) { }
    };
    this.getOIframe = function (frames, id) {
        for (var i = 0; i < frames.length; i++) {
            if (frames[i].name == id) {
                return frames[i].window
            } else {
                var iwin = this.getOIframe(frames[i], id);
                if (iwin != null) {
                    return iwin
                }
            }
        }
        return null
    };
    this.getIframe = function (win, id) {
        for (var i = 0; i < win.frames.length; i++) {
            if (win.frames[i].name == id) {
                return win
            } else {
                var iwin = this.getIframe(win.frames[i], id);
                if (iwin != null) {
                    return iwin
                }
            }
        }
        return null
    };
    this.getWorkerElement = function (id) {
        try {
            var obj = this.getWorker().document.getElementById(id);
            if (obj) {
                return $(obj)
            }
        } catch (d) { }
        return null
    };
    this.getWorker = function () {
        try {
            var id = KingonUI.Core.getIframeID("wifrid");
            if (!KingonUI.Core.isNullOrEmpty(id)) {
                id = id + '_iframe';
                var iwin = this.getIframe(top, id);
                if (iwin != null) return iwin;
                else return window.top
            }
        } catch (dd) { }
        return window.top
    };
    this.getOpenerElement = function (id) {
        try {
            var obj = this.getOpener().document.getElementById(id);
            if (obj) {
                return $(obj)
            }
        } catch (d) { }
        return null
    };
    this.getOpener = function () {
        try {
            if (Sys.TopFlag) {
                var id = KingonUI.Core.getOIframeID();
                if (!KingonUI.Core.isNullOrEmpty(id)) {
                    id = id + '_iframe';
                    var iwin = this.getOIframe(window.opener.frames, id);
                    if (iwin != null) {
                        return iwin
                    }
                }
                return window.opener.window
            } else {
                var id = KingonUI.Core.getOIframeID();
                if (!KingonUI.Core.isNullOrEmpty(id)) {
                    id = id + '_iframe';
                    var iwin = this.getOIframe(top.frames, id);
                    if (iwin != null) {
                        return iwin
                    }
					else
					{
					     //return parent.frames['idIFrame']
						//alert(parent.document.getElementById("idIFrame").id  );
					}
                }
            }
            return this.getWorker()
        } catch (dd) { }
        return this.getWorker()
    };
    this.getID = function () {
        var id = this.opts.id != null && this.opts.id != undefined && KingonUI.Core.trim(this.opts.id).length > 0 ? this.opts.id : "kw_" + Math.random().toString();
        return KingonUI.Core.replaceAll(id, '.', '')
    };
    this.setTitle = function (title) {
        this.opts.title = title;
        var mainid = this.opts.id;
        var $titlediv = $(">div:first", $("#" + mainid + "_titlediv", $(this.opts.worker.document)));
        if ($titlediv == null || $titlediv.size() == 0) {
            return false
        }
        $titlediv.text(title);
        return true
    };
    this.close = function (id) {
        try {
            if (id == null || KingonUI.Core.trim(id).length == 0) {
                id = KingonUI.Core.getIframeID("wifrid")
            }
            return this.closeWindow(id)
        } catch (dd) { }
    };
    this.closeAll = function () {
        return this.closeWindow()
    };
    this.closeWindow = function (id) {
        var amount = 0;
        try {
            var $maindiv = !id || KingonUI.Core.trim(id).length == 0 ? $("div[id^='kw_']", top.document) : $("#" + id, top.document);
            for (var x = 0; x < $maindiv.size() ; x++) {
                try {
                    CollectGarbage()
                } catch (e) { }
                try {
                    $("#" + $maindiv.eq(x).attr("id") + "_mdiv", top.document).remove();
                    $maindiv.eq(x).find("iframe").remove();
                    $maindiv.eq(x).remove();
                    amount++
                } catch (e) { }
            }
            for (var i = 0; i < top.frames.length; i++) {
                var $maindiv1 = !id || KingonUI.Core.trim(id).length == 0 ? $("div[id^='kw_']", top.frames[i].document) : $("#" + id, top.frames[i].document);
                for (var j = 0; j < $maindiv1.size() ; j++) {
                    try {
                        CollectGarbage()
                    } catch (e) { }
                    try {
                        $("#" + $maindiv1.eq(j).attr("id") + "_mdiv", top.frames[i].document).remove();
                        $maindiv1.eq(j).find("iframe").remove();
                        $maindiv1.eq(j).remove();
                        amount++
                    } catch (e) { }
                }
            }
        } catch (dd) { }
        return amount
    };
    this.resize = function (width, height) {
        if (!width || !height) {
            return
        }
        var $maindiv = $("#" + this.opts.id, $(this.opts.worker.document));
        if ($maindiv == null || $maindiv.size() == 0) {
            return
        }
        $maindiv.css({
            "height": height + "px",
            "width": width + "px"
        });
        var $bodydiv = $(".window_body", $maindiv);
        if ($bodydiv == null || $bodydiv.size() == 0) {
            return
        }
        var bodydivHeight = height - (this.opts.resize ? 39 : 26);
        $bodydiv.css({
            "height": bodydivHeight + "px"
        });
        var $iframe = $bodydiv.children().first();
        if ($iframe && $iframe.size() > 0 && $iframe.get(0).nodeName.toLowerCase() == "iframe") {
            $iframe.css({
                "height": bodydivHeight + "px"
            })
        }
    };
    this.doBothDrag = function (x, y, maindiv) {
        if (x < 110) {
            x = 110
        }
        maindiv.style.width = (x - 8) + 'px';
        if (y < 35) {
            y = 35
        }
        maindiv.style.height = (y - 8) + 'px';
        instance.resize(x - 8, y - 8)
    };
    var draging = function (oElement, fnGetPos, fnOnDrag, win) {
        win = win || window;
        var obj = this;
        this.oElement = oElement;
        this.fnGetPos = fnGetPos;
        this.fnOnDrag = fnOnDrag;
        this.__oStartOffset__ = {
            x: 0,
            y: 0
        };
        this.fnOnMouseUp = function (ev) {
            obj.stopDrag(win.event || ev)
        };
        this.fnOnMouseMove = function (ev) {
            obj.doDrag(win.event || ev)
        };
        this.oElement.onmousedown = function (ev) {
            obj.startDrag(win.event || ev)
        }
    };
    draging.prototype.startDrag = function (oEvent) {
        var oPos = this.fnGetPos();
        var x = oEvent.clientX;
        var y = oEvent.clientY;
        this.__oStartOffset__.x = x - oPos.x;
        this.__oStartOffset__.y = y - oPos.y;
        if (this.oElement.setCapture) {
            this.oElement.setCapture();
            this.oElement.onmouseup = this.fnOnMouseUp;
            this.oElement.onmousemove = this.fnOnMouseMove
        } else {
            document.addEventListener("mouseup", this.fnOnMouseUp, true);
            document.addEventListener("mousemove", this.fnOnMouseMove, true);
            window.captureEvents(Event.MOUSEMOVE | Event.MOUSEUP)
        }
    };
    draging.prototype.stopDrag = function (oEvent) {
        if (this.oElement.releaseCapture) {
            this.oElement.releaseCapture();
            this.oElement.onmouseup = null;
            this.oElement.onmousemove = null
        } else {
            document.removeEventListener("mouseup", this.fnOnMouseUp, true);
            document.removeEventListener("mousemove", this.fnOnMouseMove, true);
            window.releaseEvents(Event.MOUSE_MOVE | Event.MOUSE_UP)
        }
    };
    draging.prototype.doDrag = function (oEvent) {
        var x = oEvent.clientX;
        var y = oEvent.clientY;
        this.fnOnDrag(x - this.__oStartOffset__.x, y - this.__oStartOffset__.y)
    }
};
KingonUI.Menu = function (options) {
    var defaults = {
        srcElement: null,
        id: "",
        clickClose: true
    };
    this.opts = $.extend(defaults, options);
    this.$srcObj = null;
    if (KingonUI.Core.isNullOrEmpty(id) && this.opts.srcElement == null) {
        throw "要添加右键菜单的对象或对象ID为空!";
        return true
    } else {
        this.$srcObj = this.opts.srcElement != null ? $(this.opts.srcElement) : $("#" + this.opts.id);
        if (this.$srcObj == null || this.$srcObj.size() == 0) {
            throw "要添加右键菜单的对象为空!";
            return true
        }
    }
    if (!this.opts.id) {
        this.opts.id = this.$srcObj.attr("id")
    }
    var instance = this;
    var isHide = true;
    var $contextMenuDiv = $('<div id="kcm_' + this.opts.id + '" class="ctxmenu"></div>');
    var $contextMenuTable = $('<table cellpadding="0" cellspacing="0" border="0" ></table>');
    $contextMenuDiv.append($contextMenuTable);
    $contextMenuDiv.bind("mouseout",
    function () {
        isHide = true;
        window.setTimeout(hide, 1)
    }).bind("mouseover",
    function () {
        isHide = false
    });
    $("body").append($contextMenuDiv);
    $contextMenuDiv.hide();
    this.$srcObj.contextmenu(function (e) {
        var $menu = $("#kcm_" + instance.opts.id);
        if ($menu == null || $menu.size() == 0) {
            return false
        }
        var left = e ? e.clientX : event.clientX;
        var top = e ? e.clientY : event.clientY;
        var menuwidth = $menu.width();
        var bodywidth = $("body").width();
        if (left + menuwidth > bodywidth) {
            left = bodywidth - menuwidth - 5
        }
        $menu.css({
            "top": top,
            "left": left
        });
        $menu.focus();
        $menu.show();
        return false
    });
    this.addItem = function (options) {
        var defaults = {
            type: 0,
            ico: "",
            title: "",
            enabled: true,
            onclick: null
        };
        var opts = $.extend(defaults, options);
        if (!opts.title && opts.type == 0) {
            return false
        }
        if (opts.type == 0) {
            var $item = $('<tr type="menu"><td class="ctxmenuimg">' + (opts.ico ? '<img align="absmiddle" src="' + opts.ico + '" />' : '') + '</td><td class="' + (opts.enabled ? 'ctxmenutxt' : 'ctxmenutxt_disabled') + '">' + opts.title + '</td></tr>');
            if (opts.enabled) {
                $item.bind("click",
                function () {
                    if (!opts.enabled) {
                        return
                    }
                    if ($.isFunction(opts.onclick)) {
                        opts.onclick()
                    }
                    if (instance.opts.clickClose) {
                        $contextMenuDiv.hide()
                    }
                })
            }
            $item.bind("mouseover",
            function () {
                isHide = false;
                if (opts.enabled) {
                    $(this).children("td:first").removeClass("ctxmenuimg").addClass("ctxmenuimg1");
                    $(this).children("td:last").removeClass("ctxmenutxt").addClass("ctxmenutxt1")
                }
            }).bind("mouseout",
            function () {
                isHide = true;
                if (opts.enabled) {
                    $(this).children("td:first").removeClass("ctxmenuimg1").addClass("ctxmenuimg");
                    $(this).children("td:last").removeClass("ctxmenutxt1").addClass("ctxmenutxt")
                }
            });
            $contextMenuTable.append($item);
            $item.data("opts", opts)
        } else {
            var $item = $('<tr><td class="ctxmenuimg_disabled">' + (opts.ico ? '<img align="absmiddle" src="' + opts.ico + '" />' : '') + '</td><td style="padding:0 4px 0 0;height:15px;"><div class="ctxmenu_itemsplit"></div></td></tr>');
            $item.bind("mouseover",
            function () {
                isHide = false
            }).bind("mouseout",
            function () {
                isHide = true
            });
            $contextMenuTable.append($item)
        }
    };
    this.setDisabled = function (index, disabled) {
        var $tr = $contextMenuTable.children().children("tr[type]:eq(" + index + ")");
        if ($tr == null || $tr.size() == 0) {
            return false
        }
        if (disabled) {
            var opts = $tr.data("opts");
            $tr.unbind("click").bind("click",
            function () {
                if (!opts.enabled) {
                    return
                }
                if ($.isFunction(opts.onclick)) {
                    opts.onclick()
                }
                if (instance.opts.clickClose) {
                    $contextMenuDiv.hide()
                }
            }).bind("mouseover",
            function () {
                isHide = false;
                $(this).children("td:first").removeClass("ctxmenuimg").addClass("ctxmenuimg1");
                $(this).children("td:last").removeClass("ctxmenutxt").addClass("ctxmenutxt1")
            }).bind("mouseout",
            function () {
                isHide = true;
                $(this).children("td:first").removeClass("ctxmenuimg1").addClass("ctxmenuimg");
                $(this).children("td:last").removeClass("ctxmenutxt1").addClass("ctxmenutxt")
            });
            $tr.children("td:first").removeClass("ctxmenuimg1").addClass("ctxmenuimg");
            $tr.children("td:last").removeClass("ctxmenutxt1").addClass("ctxmenutxt")
        } else {
            $tr.unbind("click").unbind("mouseover").unbind("mouseout").bind("mouseover",
            function () {
                isHide = false
            }).bind("mouseout",
            function () {
                isHide = true
            });
            $tr.children("td:first").removeClass().addClass("ctxmenuimg_disabled");
            $tr.children("td:last").removeClass().addClass("ctxmenutxt_disabled")
        }
    };
    var hide = function () {
        if (isHide) {
            $contextMenuDiv.hide()
        }
    }
};
KingonUI.CommItemInfo = function () {
    this.dbName = '1';
    this.strValue = '1'
};
KingonUI.CommInfo = function () {
    var t = {
        commItemList: []
    };
    this.userToken = KingonUI.Core.GetToken();
    this.hformID = '';
    this.hformIDList = '';
    this.dataSource = '';
    this.tableName = '';
    this.guid = '';
    this.otherTableDataSourceList = '';
    this.otherTableNameList = '';
    this.getJson = function () {
        try {
            t.hformID = this.hformID;
            t.hformIDList = this.hformIDList;
            t.dataSource = this.dataSource;
            t.tableName = this.tableName;
            t.otherTableDataSourceList = this.otherTableDataSourceList;
            t.otherTableNameList = this.otherTableNameList;
            t.guid = this.guid;
            t.userToken = KingonUI.Core.GetToken();
            return JSON.stringify(t)
        } catch (d) { }
        return ''
    };
    this.addCommItem = function (commItemInfo) {
        try {
            var c = {};
            c.dbName = commItemInfo.dbName;
            c.strValue = commItemInfo.strValue;
            t.commItemList.push(c)
        } catch (d) { }
    };
    this.getCommItem = function (dbName) {
        try {
            for (var commItemInfo in t.commItemList) {
                if (commItemInfo.dbName == dbName) {
                    return commItemInfo
                }
            }
            return null
        } catch (d) { }
        return null
    };
    this.delCommItem = function (dbName) {
        try {
            var columnsList = [];
            for (var commItemInfo in t.commItemList) {
                if (commItemInfo.dbName != dbName) {
                    commItemList.push(commItemInfo)
                }
            }
            t.commItemList = columnsList
        } catch (d) { }
    };
    this.repCommItem = function (commItemInfo) {
        try {
            for (var commItemInfo in t.commItemList) {
                if (t.commItemList[i].dbName == commItemInfo.dbName) {
                    t.commItemList[i] = commItemInfo
                }
            }
        } catch (d) { }
    }
};
KingonUI.CommonOperate = function () {
    var t = {
        commItemList: []
    };
    this.userToken = KingonUI.Core.GetToken();
    this.opName = '';
    this.dataSource = '';
    this.tableName = '';
    this.guid = '';
    this.otherTableDataSourceList = '';
    this.otherTableNameList = '';
    this.addCommItem = function (commItemInfo) {
        try {
            var c = {};
            c.dbName = commItemInfo.dbName;
            c.strValue = commItemInfo.strValue;
            t.commItemList.push(c)
        } catch (d) { }
    };
    this.getCommItem = function (dbName) {
        try {
            for (var commItemInfo in t.commItemList) {
                if (commItemInfo.dbName == dbName) {
                    return commItemInfo
                }
            }
            return null
        } catch (d) { }
        return null
    };
    this.delCommItem = function (dbName) {
        try {
            var columnsList = [];
            for (var commItemInfo in t.commItemList) {
                if (commItemInfo.dbName != dbName) {
                    commItemList.push(commItemInfo)
                }
            }
            t.commItemList = columnsList
        } catch (d) { }
    };
    this.repCommItem = function (commItemInfo) {
        try {
            for (var commItemInfo in t.commItemList) {
                if (t.commItemList[i].dbName == commItemInfo.dbName) {
                    t.commItemList[i] = commItemInfo
                }
            }
        } catch (d) { }
    };
    this.getJson = function () {
        try {
            t.dataSource = this.dataSource;
            t.tableName = this.tableName;
            t.otherTableDataSourceList = this.otherTableDataSourceList;
            t.otherTableNameList = this.otherTableNameList;
            t.guid = this.guid;
            t.userToken = KingonUI.Core.GetToken();
            return JSON.stringify(t)
        } catch (d) { }
        return ''
    }
};
KingonUI.CommonTran = function () {
    var t = {
        tranList: []
    };
    this.getJson = function () {
        try {
            return JSON.stringify(t)
        } catch (d) { }
        return ''
    };
    this.clearCommItem = function () {
        try {
            t = {
                tranList: []
            }
        } catch (dd) { }
    };
    this.addCommItem = function (CommonOperate) {
        try {
            t.tranList.push(CommonOperate)
        } catch (dd) { }
    }
};
KingonUI.SearchWhereInfo = function () {
    this.connFlag = false;
    this.dbType = 'string';
    this.dbName = '1';
    this.operate = '=';
    this.strValue = '1'
};
KingonUI.SearchInfo = function () {
    var t = {
        searchWhereList: []
    };
    this.userToken = KingonUI.Core.GetToken();
    this.dataSource = '';
    this.tableName = '';
    this.tablePreKey = '';
    this.strFieldList = '*';
    this.strOrder = 'guid desc';
    this.pageSize = 10;
    this.pageNumber = 1;
    this.footerStr = '';
    this.getJson = function () {
        try {
            t.dataSource = this.dataSource;
            t.tableName = this.tableName;
            t.tablePreKey = this.tablePreKey;
            t.strFieldList = this.strFieldList;
            t.strOrder = this.strOrder;
            t.pageSize = this.pageSize;
            t.pageNumber = this.pageNumber;
            t.userToken = KingonUI.Core.GetToken();
            t.footerStr = this.footerStr;
            return JSON.stringify(t)
        } catch (d) { }
        return ''
    };
    this.addSearchWhere = function (searchWhereInfo) {
        try {
            var c = {};
            c.dbType = searchWhereInfo.dbType;
            c.connFlag = searchWhereInfo.connFlag;
            c.dbName = searchWhereInfo.dbName;
            c.operate = searchWhereInfo.operate;
            c.strValue = searchWhereInfo.strValue;
            t.searchWhereList.push(c)
        } catch (d) { }
    };
    this.addSearchWhereAnd = function () {
        try {
            var c = {};
            c.dbType = '';
            c.connFlag = true;
            c.operate = "and";
            c.dbName = '';
            c.strValue = '';
            t.searchWhereList.push(c)
        } catch (d) { }
    };
    this.addSearchWhereOr = function () {
        try {
            var c = {};
            c.dbType = '';
            c.connFlag = true;
            c.operate = " or ";
            c.dbName = '';
            c.strValue = '';
            t.searchWhereList.push(c)
        } catch (d) { }
    };
    this.addSearchWhereTopKType = function () {
        try {
            var c = {};
            c.dbType = '';
            c.connFlag = true;
            c.operate = "(";
            c.dbName = '';
            c.strValue = '';
            t.searchWhereList.push(c)
        } catch (d) { }
    };
    this.addSearchWhereEndKType = function () {
        try {
            var c = {};
            c.dbType = '';
            c.connFlag = true;
            c.operate = ")";
            c.dbName = '';
            c.strValue = '';
            t.searchWhereList.push(c)
        } catch (d) { }
    }
};
KingonUI.CommonOpAction = function () {
    this.FActionID = '';
    this.FActionName = ''
};
KingonUI.ColumnsInfo = function (dbName, dbType, dbLength) {
    try {
        if (!KingonUI.Core.isInteger(dbLength)) dbLength = 50
    } catch (ddd_) {
        dbLength = 50
    }
    this.dbName = dbName;
    this.dbType = dbType;
    this.dbLength = dbLength;
    this.showName = dbName;
    this.createdbName = dbName;
    this.isPriKey = false;
    this.isNullFlag = false;
    this.isIdentity = false;
    this.dbPrec = dbLength;
    this.dbScale = 0;
    this.controlType = '0';
    this.defaultValue = '0';
    this.ctrlWidth = '';
    this.ctrlHeight = '0';
    this.isRequired = '0';
    this.validType = '0';
    this.submitValid = '0';
    this.validMessage = '';
    this.staticCombox = '';
    this.dynamicCombox = '';
    this.dynamicComboTree = '';
    this.dynamicComboGrid = '';
    this.isReadOnly = '';
    this.isHidden = '';
    this.isSelectPlat = '';
    this.isAutoPlat = '';
    this.IsAutoCalc = '0';
    this.DefaultCalcValue = ''
};
KingonUI.TableInfo = function (dataSource, dbName, viewFlag) {
    var t = {
        columnsList: []
    };
    this.dataSource = dataSource;
    this.dbName = dbName;
    this.showName = dbName;
    this.createdbName = dbName;
    try {
        this.viewFlag = Number(viewFlag)
    } catch (dd) {
        this.viewFlag = viewFlag
    }
    if (this.viewFlag != 1) this.viewFlag = 0;
    this.getColumnsList = function () {
        return t.columnsList
    },
    this.initJson = function (msg) {
        try {
            t = {
                columnsList: []
            };
            var tableInfo = JSON.parse(msg);
            this.dataSource = tableInfo.dataSource;
            this.dbName = tableInfo.dbName;
            this.showName = tableInfo.showName;
            this.createdbName = tableInfo.dbName;
            try {
                this.viewFlag = tableInfo.viewFlag
            } catch (d) {
                this.viewFlag = "0"
            }
            $.each(tableInfo.columnsList,
            function (i, columnsInfo) {
                var c = {};
                c.dbName = columnsInfo.dbName;
                c.dbType = columnsInfo.dbType;
                c.dbLength = columnsInfo.dbLength;
                c.showName = columnsInfo.showName;
                c.createdbName = columnsInfo.createdbName;
                c.isPriKey = columnsInfo.isPriKey;
                c.isNullFlag = columnsInfo.isNullFlag;
                c.isIdentity = columnsInfo.isIdentity;
                c.dbPrec = columnsInfo.dbPrec;
                c.dbScale = columnsInfo.dbScale;
                c.controlType = columnsInfo.controlType;
                c.defaultValue = columnsInfo.defaultValue;
                c.ctrlWidth = columnsInfo.ctrlWidth;
                c.ctrlHeight = columnsInfo.ctrlHeight;
                c.isRequired = columnsInfo.isRequired;
                c.validType = columnsInfo.validType;
                c.submitValid = columnsInfo.submitValid;
                c.validMessage = columnsInfo.validMessage;
                c.staticCombox = columnsInfo.staticCombox;
                c.dynamicCombox = columnsInfo.dynamicCombox;
                c.dynamicComboTree = columnsInfo.dynamicComboTree;
                c.dynamicComboGrid = columnsInfo.dynamicComboGrid;
                c.isReadOnly = columnsInfo.isReadOnly;
                c.isHidden = columnsInfo.isHidden;
                c.isSelectPlat = columnsInfo.isSelectPlat;
                c.isAutoPlat = columnsInfo.isAutoPlat;
                c.IsAutoCalc = columnsInfo.IsAutoCalc;
                c.DefaultCalcValue = columnsInfo.DefaultCalcValue;
                t.columnsList.push(c)
            })
        } catch (d) { }
    };
    this.getJson = function () {
        try {
            t.dataSource = this.dataSource;
            t.dbName = this.dbName;
            t.showName = this.showName;
            t.createdbName = this.dbName;
            t.viewFlag = this.viewFlag;
            return JSON.stringify(t)
        } catch (d) { }
        return ''
    };
    this.addColumn = function (columnsInfo) {
        try {
            this.delColumn(columnsInfo.dbName);
            var c = {};
            c.dbName = columnsInfo.dbName;
            c.dbType = columnsInfo.dbType;
            c.dbLength = columnsInfo.dbLength;
            c.showName = columnsInfo.showName;
            c.createdbName = columnsInfo.createdbName;
            c.isPriKey = columnsInfo.isPriKey;
            c.isNullFlag = columnsInfo.isNullFlag;
            c.isIdentity = columnsInfo.isIdentity;
            c.dbPrec = columnsInfo.dbPrec;
            c.dbScale = columnsInfo.dbScale;
            c.controlType = columnsInfo.controlType;
            c.defaultValue = columnsInfo.defaultValue;
            c.ctrlWidth = columnsInfo.ctrlWidth;
            c.ctrlHeight = columnsInfo.ctrlHeight;
            c.isRequired = columnsInfo.isRequired;
            c.validType = columnsInfo.validType;
            c.submitValid = columnsInfo.submitValid;
            c.validMessage = columnsInfo.validMessage;
            c.staticCombox = columnsInfo.staticCombox;
            c.dynamicCombox = columnsInfo.dynamicCombox;
            c.dynamicComboTree = columnsInfo.dynamicComboTree;
            c.dynamicComboGrid = columnsInfo.dynamicComboGrid;
            c.isReadOnly = columnsInfo.isReadOnly;
            c.isHidden = columnsInfo.isHidden;
            c.isSelectPlat = columnsInfo.isSelectPlat;
            c.isAutoPlat = columnsInfo.isAutoPlat;
            c.IsAutoCalc = columnsInfo.IsAutoCalc;
            c.DefaultCalcValue = columnsInfo.DefaultCalcValue;
            t.columnsList.push(c)
        } catch (d) { }
    };
    this.delColumn = function (dbName) {
        try {
            var columnsList = [];
            $.each(t.columnsList,
            function (i, info) {
                if (info.dbName != dbName) {
                    columnsList.push(info)
                }
            });
            t.columnsList = columnsList
        } catch (d) { }
    };
    this.getColumn = function (dbName) {
        try {
            $.each(t.columnsList,
            function (i, info) {
                if (info.dbName == dbName) {
                    return info
                }
            });
            return null
        } catch (d) { }
        return null
    };
    this.repColumn = function (columnsInfo) {
        try {
            this.addColumn(columnsInfo)
        } catch (d) { }
    }
};
KingonUI.CommAsyncTree = function () {
    var t = {};
    this.HTableID = '';
    this.IDCol = '';
    this.TextCol = '';
    this.PreIDCol = '';
    this.Condiction = '';
    this.TableCharFlag = '';
    this.TopPreIDColValue = '';
    this.PreHTableID = '';
    this.PreTableIDCol = '';
    this.ChildCountFlag = '';
    this.IconCls = '';
    this.OrderFields = '';
    this.TopIconCls = '';
    this.initJson = function (msg) {
        try {
            var commAsyncTree = JSON.parse(msg);
            this.HTableID = commAsyncTree.HTableID;
            this.IDCol = commAsyncTree.IDCol;
            this.TextCol = commAsyncTree.TextCol;
            this.PreIDCol = commAsyncTree.PreIDCol;
            this.Condiction = commAsyncTree.Condiction;
            this.TableCharFlag = commAsyncTree.TableCharFlag;
            this.TopPreIDColValue = commAsyncTree.TopPreIDColValue;
            this.PreHTableID = commAsyncTree.PreHTableID;
            this.PreTableIDCol = commAsyncTree.PreTableIDCol;
            this.ChildCountFlag = commAsyncTree.ChildCountFlag;
            this.IconCls = commAsyncTree.IconCls;
            this.TopIconCls = commAsyncTree.TopIconCls;
            this.OrderFields = commAsyncTree.OrderFields;
        } catch (d) { }
    };
    this.getJson = function () {
        try {
            t.HTableID = this.HTableID;
            t.IDCol = this.IDCol;
            t.TextCol = this.TextCol;
            t.PreIDCol = this.PreIDCol;
            t.Condiction = this.Condiction;
            t.TableCharFlag = this.TableCharFlag;
            t.TopPreIDColValue = this.TopPreIDColValue;
            t.PreHTableID = this.PreHTableID;
            t.PreTableIDCol = this.PreTableIDCol;
            t.ChildCountFlag = this.ChildCountFlag;
            t.IconCls = this.IconCls;
            t.TopIconCls = this.TopIconCls;
            t.OrderFields = this.OrderFields;
            return JSON.stringify(t)
        } catch (d) { }
        return ''
    }
};
KingonUI.CommAsyncTreeList = function () {
    var t = {
        commTreeList: []
    };
    this.initJson = function (msg) {
        try {
            t = {
                commTreeList: []
            };
            var commAsyncTreeList = JSON.parse(msg);
            $.each(commAsyncTreeList.commTreeList,
            function (i, commAsyncTree) {
                var c = {};
                c.HTableID = commAsyncTree.HTableID;
                c.IDCol = commAsyncTree.IDCol;
                c.TextCol = commAsyncTree.TextCol;
                c.PreIDCol = commAsyncTree.PreIDCol;
                c.Condiction = commAsyncTree.Condiction;
                c.TableCharFlag = commAsyncTree.TableCharFlag;
                c.TopPreIDColValue = commAsyncTree.TopPreIDColValue;
                c.PreHTableID = commAsyncTree.PreHTableID;
                c.PreTableIDCol = commAsyncTree.PreTableIDCol;
                c.ChildCountFlag = commAsyncTree.ChildCountFlag;
                c.IconCls = commAsyncTree.IconCls;
                c.TopIconCls = commAsyncTree.TopIconCls;
                c.OrderFields = commAsyncTree.OrderFields;
                t.columnsList.push(c)
            })
        } catch (d) { }
    };
    this.getJson = function () {
        try {
            return JSON.stringify(t)
        } catch (d) { }
        return ''
    };
    this.addTree = function (commAsyncTree) {
        try {
            this.delColumn(commAsyncTree.HTableID);
            var c = {};
            c.HTableID = commAsyncTree.HTableID;
            c.IDCol = commAsyncTree.IDCol;
            c.TextCol = commAsyncTree.TextCol;
            c.PreIDCol = commAsyncTree.PreIDCol;
            c.Condiction = commAsyncTree.Condiction;
            c.TableCharFlag = commAsyncTree.TableCharFlag;
            c.TopPreIDColValue = commAsyncTree.TopPreIDColValue;
            c.PreHTableID = commAsyncTree.PreHTableID;
            c.PreTableIDCol = commAsyncTree.PreTableIDCol;
            c.ChildCountFlag = commAsyncTree.ChildCountFlag;
            c.IconCls = commAsyncTree.IconCls;
            c.TopIconCls = commAsyncTree.TopIconCls;
            c.OrderFields = commAsyncTree.OrderFields;
            t.commTreeList.push(c)
        } catch (d) { }
    };
    this.delColumn = function (hTableID) {
        try {
            var treeList = [];
            $.each(t.commTreeList,
            function (i, info) {
                if (info.HTableID != hTableID) {
                    treeList.push(info)
                }
            });
            t.commTreeList = treeList
        } catch (d) { }
    }
};
KingonUI.UEditorUI = {
    init: function ($editors) {
        $editors.each(function () {
            var id = $(this).attr('id');
            var width = $(this).attr('width') || "100%";
            var height = $(this).attr('height') || "300";
            var readonly = "readonly" == $(this).attr('readonly') || "1" == $(this).attr('readonly') ? true : false;
            UE.getEditor(id, {
                initialFrameWidth: width,
                initialFrameHeight: height,
                readonly: readonly
            })
        })
    },
    getEditor: function ($editors) {
        var id = $editors.attr('id');
        return UE.getEditor(id)
    },
    setSourceContent: function ($editors, content) {
        setTimeout(function () {
            try {
                KingonUI.UEditorUI.getEditor($editors).setContentMy('');
                KingonUI.UEditorUI.getEditor($editors).setContentMy(content)
            } catch (d) { }
        },
        1000)
    },
    setContent: function ($editors, content) {
        KingonUI.UEditorUI.getEditor($editors).setContent(content)
    },
    getContent: function ($editors) {
        var editor = KingonUI.UEditorUI.getEditor($editors);
        return editor.getContent()
    },
    initLimitEditor: function ($editors) {
        var toolbars = [[]];
        KingonUI.UEditorUI.createSEditer($editors, toolbars, false, false, false, false, false, false)
    },
    initSimpleEditor: function ($editors) {
        var toolbars = [['fullscreen', 'source', '|', 'undo', 'redo', 'bold', 'italic', 'underline', 'fontborder', 'strikethrough', 'superscript', 'subscript', ' forecolor', 'backcolor', 'removeformat', 'insertorderedlist', 'insertunorderedlist', 'selectall', 'cleardoc', 'paragraph', 'fontfamily', 'fontsize', 'justifyleft', 'justifycenter', 'justifyright', 'justifyjustify', 'link', 'unlink', 'emotion', 'image', 'video', 'map', 'horizontal', 'print', 'preview', 'drafts', 'formula']];
        KingonUI.UEditorUI.createSEditer($editors, toolbars, false, false, false, true, false, true)
    },
    initSourceEditor: function ($editors) {
        KingonUI.UEditorUI.createSEditer($editors, [['fullscreen']], true, true, false, true, false, false)
    },
    initCommonEditor: function ($editors) {
        KingonUI.UEditorUI.createSEditer($editors, null, false, false, false, true, false, true)
    },
    createSEditer: function ($editors, toolbars, sourceEditorFirst, allowDivTransToP, disabledTableInTable, enableAutoSave, pasteplain, wordCount) {
        var id = $editors.attr('id');
        var width = $editors.attr('width') || "100%";
        var height = $editors.attr('height') || "300";
        var readonly = "readonly" == $editors.attr('readonly') || "1" == $editors.attr('readonly') ? true : false;
        if (toolbars == null || toolbars == undefined) {
            UE.getEditor(id, {
                initialFrameWidth: width,
                initialFrameHeight: height,
                readonly: readonly,
                sourceEditorFirst: sourceEditorFirst,
                allowDivTransToP: allowDivTransToP,
                disabledTableInTable: disabledTableInTable,
                enableAutoSave: enableAutoSave,
                pasteplain: pasteplain,
                wordCount: wordCount
            })
        } else {
            UE.getEditor(id, {
                toolbars: toolbars,
                initialFrameWidth: width,
                initialFrameHeight: height,
                readonly: readonly,
                sourceEditorFirst: sourceEditorFirst,
                allowDivTransToP: allowDivTransToP,
                disabledTableInTable: disabledTableInTable,
                enableAutoSave: enableAutoSave,
                pasteplain: pasteplain,
                wordCount: wordCount
            })
        }
        return UE.getEditor(id)
    }
};
$(function () {
    Sys.PageGuid = KingonUI.Core.getGuid();
    Sys.MainDialog = new KingonUI.Window();
    InitPageInfo();
    try {
        if (PageMode.FlowID > 0) {
            $('#btnCreate').attr('style', 'display:none');
            $('#btnSave').attr('style', 'display:none');
            $('#btnDel').attr('style', 'display:none');
            try {
                var formUrl = '';
                try {
                    formUrl = '/DynaForm/' + PageMode.ModuleID + '/' + PageMode.HFormID + '?op=Edit&guid=' + PageMode.TableGuid
                } catch (d) { }
                $.ajax({
                    type: "POST",
                    url: Sys.getFlowButtonsUrl,
                    dataType: "html",
                    data: {
                        FlowID: PageMode.FlowID,
                        TableID: PageMode.TableID,
                        UserID: KingonUI.Core.GetUserID(),
                        Guid: guid
                    },
                    cache: false,
                    success: function (msg) {
                        try {
                            var CommonPageReturnJSon = JSON.parse(msg);
                            if (CommonPageReturnJSon.Type == "ok") {

                                $('#btnClose').attr("style", "padding: 10px;font-size: 18px;font-weight: bold;");

                                var ModelJSON = JSON.parse(CommonPageReturnJSon.ModelJSON);
                                var CurNode = null;
                                PageMode.FlowNodeList = [];
                                for (var i = 0; i < ModelJSON.length; i++) {
                                    var notetemp = {};
                                    notetemp.ID = ModelJSON[i].ID;
                                    notetemp.NodeName = KingonUI.Core.replaceAll(KingonUI.Core.replaceAll(KingonUI.Core.replaceAll(KingonUI.Core.replaceAll(ModelJSON[i].NodeName, '暂存[', ''), '[', ''), ']', ''), '返回[', '');
                                    PageMode.FlowNodeList.push(notetemp)
                                }
                                for (var i = 0; i < ModelJSON.length; i++) {
                                    if (ModelJSON[i].NodeName.indexOf("暂存[") == 0) {
                                        CurNode = ModelJSON[i];
                                        PageMode.CurNodeID = CurNode.ID;
                                        PageMode.CurNodeName = KingonUI.Core.replaceAll(KingonUI.Core.replaceAll(CurNode.NodeName, '暂存[', ''), ']', '');
                                        break
                                    }
                                }
                                //var $Tspan2 = $('<span>&nbsp;</span>');
                                //var $TShow = $('<a href="#" class="easyui-linkbutton" onclick="ShowFlowList(\'' + PageMode.FlowID + '\',\'' + PageMode.TableID + '\',\'' + PageMode.TableGuid + '\');" id="btnFlowShow">[流程查看]</a>&nbsp;');
                                //$('#btnSave').after($Tspan2).after($TShow);
                                //$('#btnFlowShow').linkbutton();
                                //var MenuStr = '<div id="menuStepWin">';
                                $('#btnFlowShow').linkbutton();
                                var MenuStr = '<div id="menuStepWin" style="width:400px;height:200px;padding:10px">';


                                var havNext = false;
                                var firstData = 0;
                                var l = 5;
                                for (var i = 0; i < ModelJSON.length; i++) {
                                    if (ModelJSON[i].NodeName.indexOf("返回[") != 0) {
                                        if (ModelJSON[i].NodeName.indexOf("暂存[") != 0) {
                                            havNext = true;
                                            if (ModelJSON[i].NodeType == 'end') {
                                                if (firstData == 0) {
                                                    firstData = 1;
                                                }
                                                else
                                                    l = 10;
                                                var $Tspan1 = $('<span>&nbsp;</span>');
                                                var $Nnote1 = $('<a href="#" class="easyui-linkbutton" onclick="NextFlowAuto(\'' + PageMode.FlowID + '\',\'' + PageMode.TableID + '\',\'' + KingonUI.Core.GetUserID() + '\',\'' + PageMode.TableGuid + '\',\'' + CurNode.ID + '\',\'' + ModelJSON[i].ID + '\',\'' + formUrl + '\');" id="btn' + ModelJSON[i].ID + '" >[' + ModelJSON[i].NodeName + ']保存</a>&nbsp;');
                                                MenuStr += '<li  style="padding:' + l + 'px"><a onclick="NextFlowAuto(\'' + PageMode.FlowID + '\',\'' + PageMode.TableID + '\',\'' + KingonUI.Core.GetUserID() + '\',\'' + PageMode.TableGuid + '\',\'' + CurNode.ID + '\',\'' + ModelJSON[i].ID + '\',\'' + formUrl + '\');" data-options="name:\'normal\',FlowID:\'' + PageMode.FlowID + '\',TableID:\'' + PageMode.TableID + '\',UserID:\'' + KingonUI.Core.GetUserID() + '\',TableGuid:\'' + PageMode.TableGuid + '\',CurNodeID:\'' + CurNode.ID + '\',NextNodeID:\'' + ModelJSON[i].ID + '\',formUrl:\'' + formUrl + '\'" id="btn' + ModelJSON[i].ID + '" >提交[' + ModelJSON[i].NodeName + ']</a></li>';
                                                continue;
                                                $('#btnSave').after($Tspan1).after($Nnote1);
                                                $('#btn' + ModelJSON[i].ID).linkbutton()
                                            } else if (ModelJSON[i].NodeType != 'normal') {
                                                if (firstData == 0) {
                                                    firstData = 1;
                                                }
                                                else
                                                    l = 10;
                                                var $Tspan1 = $('<span>&nbsp;</span>');
                                                var $Nnote1 = $('<a href="#" class="easyui-linkbutton" onclick="NextFlowAuto(\'' + PageMode.FlowID + '\',\'' + PageMode.TableID + '\',\'' + KingonUI.Core.GetUserID() + '\',\'' + PageMode.TableGuid + '\',\'' + CurNode.ID + '\',\'' + ModelJSON[i].ID + '\',\'' + formUrl + '\');" id="btn' + ModelJSON[i].ID + '" >提交[' + ModelJSON[i].NodeName + ']</a>&nbsp;');
                                                //MenuStr += '<div onclick="NextFlowAuto(\'' + PageMode.FlowID + '\',\'' + PageMode.TableID + '\',\'' + KingonUI.Core.GetUserID() + '\',\'' + PageMode.TableGuid + '\',\'' + CurNode.ID + '\',\'' + ModelJSON[i].ID + '\',\'' + formUrl + '\');" id="btn' + ModelJSON[i].ID + '" >提交[' + ModelJSON[i].NodeName + ']</div>';
                                                MenuStr += '<li  style="padding:' + l + 'px"><a onclick="NextFlowAuto(\'' + PageMode.FlowID + '\',\'' + PageMode.TableID + '\',\'' + KingonUI.Core.GetUserID() + '\',\'' + PageMode.TableGuid + '\',\'' + CurNode.ID + '\',\'' + ModelJSON[i].ID + '\',\'' + formUrl + '\');" data-options="name:\'normal\',FlowID:\'' + PageMode.FlowID + '\',TableID:\'' + PageMode.TableID + '\',UserID:\'' + KingonUI.Core.GetUserID() + '\',TableGuid:\'' + PageMode.TableGuid + '\',CurNodeID:\'' + CurNode.ID + '\',NextNodeID:\'' + ModelJSON[i].ID + '\',formUrl:\'' + formUrl + '\'" id="btn' + ModelJSON[i].ID + '" >提交[' + ModelJSON[i].NodeName + ']</a></li>';
                                                continue;
                                                $('#btnSave').after($Tspan1).after($Nnote1);
                                                $('#btn' + ModelJSON[i].ID).linkbutton()
                                            } else {
                                                if (firstData == 0) {
                                                    firstData = 1;
                                                }
                                                else
                                                    l = 10;
                                                var $Tspan1 = $('<span>&nbsp;</span>');
                                                var $Nnote1 = $('<a href="#" class="easyui-linkbutton" onclick="NextFlowSave(\'' + PageMode.FlowID + '\',\'' + PageMode.TableID + '\',\'' + KingonUI.Core.GetUserID() + '\',\'' + PageMode.TableGuid + '\',\'' + CurNode.ID + '\',\'' + ModelJSON[i].ID + '\',\'' + formUrl + '\');" id="btn' + ModelJSON[i].ID + '" >提交[' + ModelJSON[i].NodeName + ']</a>&nbsp;');
                                                MenuStr += '<li  style="padding:' + l + 'px"><a onclick="NextFlowSave(\'' + PageMode.FlowID + '\',\'' + PageMode.TableID + '\',\'' + KingonUI.Core.GetUserID() + '\',\'' + PageMode.TableGuid + '\',\'' + CurNode.ID + '\',\'' + ModelJSON[i].ID + '\',\'' + formUrl + '\');" data-options="name:\'normal\',FlowID:\'' + PageMode.FlowID + '\',TableID:\'' + PageMode.TableID + '\',UserID:\'' + KingonUI.Core.GetUserID() + '\',TableGuid:\'' + PageMode.TableGuid + '\',CurNodeID:\'' + CurNode.ID + '\',NextNodeID:\'' + ModelJSON[i].ID + '\',formUrl:\'' + formUrl + '\'" id="btn' + ModelJSON[i].ID + '" >提交[' + ModelJSON[i].NodeName + ']</a></li>';
                                                continue;
                                                $('#btnSave').after($Tspan1).after($Nnote1);
                                                $('#btn' + ModelJSON[i].ID).linkbutton();
                                                $('#btn' + ModelJSON[i].ID).linkbutton()
                                            }
                                        }
                                    }
                                }
                                l = 5;
                                for (var i = 0; i < ModelJSON.length; i++) {
                                    if (ModelJSON[i].NodeName.indexOf("返回[") == 0) {
                                        if (firstData == 0) {
                                            firstData = 1;
                                        }
                                        else
                                            l = 10;
                                        havNext = true;
                                        var $Tspan2 = $('<span>&nbsp;</span>');
                                        var $Nnote2 = $('<a href="#" class="easyui-linkbutton" onclick="PrevFlowSave(\'' + PageMode.FlowID + '\',\'' + PageMode.TableID + '\',\'' + KingonUI.Core.GetUserID() + '\',\'' + PageMode.TableGuid + '\',\'' + CurNode.ID + '\',\'' + ModelJSON[i].ID + '\',\'' + formUrl + '\',\'' + ModelJSON[i].FlowID + '\');" id="btn' + ModelJSON[i].ID + '" >' + ModelJSON[i].NodeName + '</a>&nbsp;');
                                        ModelJSON[i].NodeName = KingonUI.Core.replaceAll(ModelJSON[i].NodeName, '返回', '退回');
                                        MenuStr += '<li style="padding:' + l + 'px"><a onclick="PrevFlowSave(\'' + PageMode.FlowID + '\',\'' + PageMode.TableID + '\',\'' + KingonUI.Core.GetUserID() + '\',\'' + PageMode.TableGuid + '\',\'' + CurNode.ID + '\',\'' + ModelJSON[i].ID + '\',\'' + formUrl + '\',\'' + ModelJSON[i].FlowID + '\');" id="btnb' + ModelJSON[i].ID + '" >' + ModelJSON[i].NodeName + '</a></li>';
                                        continue;
                                        $('#btn' + ModelJSON[i].ID).linkbutton();
                                        $('#btnSave').after($Tspan2).after($Nnote2);
                                    }
                                }
                                MenuStr += '</div>';
                                if (havNext) {
                                    //<a id="btn-edit" href="#" class="easyui-menubutton" data-options="menu:'#mm1',iconCls:'icon-edit'">Edit</a>
                                    //var $Tsave = $('<a href="#" class="easyui-linkbutton" onclick="NextFlowStep(\'' + PageMode.FlowID + '\',\'' + PageMode.TableID + '\',\'' + KingonUI.Core.GetUserID() + '\',\'' + PageMode.TableGuid + '\',\'' + formUrl + '\');" id="btn_FlowNextStep">提交</a>&nbsp;');
                                    var $Tspan2 = $('<span>&nbsp;</span>');
                                    var $Tsave2 = $('<a href="#" style="padding: 10px;font-size: 18px;font-weight: bold;" class="easyui-linkbutton" onclick="NextFlowStepWin(\'' + formUrl + '\')" id="btn_FlowNextStep">[流程提交与查看]</a>&nbsp;');
                                    var $TMenu = $(MenuStr);
                                    $('#btnSave').after($Tspan2).after($Tsave2);
                                    $('#btnSave').parent().parent().after($TMenu);
                                    $('#btn_FlowNextStep').linkbutton();

                                    for (var i = 0; i < ModelJSON.length; i++) {
                                        $('#btn' + ModelJSON[i].ID).linkbutton();
                                        $('#btnb' + ModelJSON[i].ID).linkbutton();
                                    }
                                    $('#menuStepWin').window({
                                        title:'请选择步骤!!!!',
                                        width: 500,
                                        height: 300,
                                        collapsible: false,
                                        minimizable: false,
                                        maximizable: false,
                                        collapsible: false,
                                        modal: true
                                    });
                                    $('#menuStepWin').window('close');
                                }
                                else
                                {
                                    var $Tspan2 = $('<span>&nbsp;</span>');
                                    var $Tsave2 = $('<a href="#" style="padding: 10px;font-size: 18px;font-weight: bold;" class="easyui-linkbutton" onclick="NextFlowStepWin(\'' + formUrl + '\')" id="btn_FlowNextStep">[流程查看]</a>&nbsp;');
                                    var $TMenu = $(MenuStr);
                                    $('#btnSave').after($Tspan2).after($Tsave2);
                                    $('#btnSave').parent().parent().after($TMenu);
                                    $('#btn_FlowNextStep').linkbutton();
                                }
                                if (CurNode != null) {
                                    var $Tspan1 = $('<span>&nbsp;</span>');
                                    var $Tsave = $('<a href="#"  style="padding: 10px;font-size: 18px;font-weight: bold;" class="easyui-linkbutton" onclick="CurFlowSave(\'' + PageMode.FlowID + '\',\'' + PageMode.TableID + '\',\'' + KingonUI.Core.GetUserID() + '\',\'' + PageMode.TableGuid + '\',\'' + CurNode.ID + '\',\'' + formUrl + '\');" id="btn' + CurNode.ID + '">[流程暂存]</a>&nbsp;');
                                    $('#btnSave').after($Tspan1).after($Tsave);
                                    $('#btn' + CurNode.ID).linkbutton()
                                }
                            }
                        } catch (dd) {
                            alert(dd + '这里')
                        }
                    }
                })
            } catch (d) {
                alert(d)
            }
        }
    } catch (d) { }
    setTimeout(function () {
        try {
            $('#cc').layout('resize', {
                width: '100%',
                height: $(window).height()
            })
        } catch (dd) { }
        try {
            KingonUI.Core.each($(".pagination-first"),
            function (n) {
                $(n).parent().parent().attr("title", "第一页")
            })
        } catch (dd) { }
        KingonUI.Core.each($(".pagination-first"),
        function (n) {
            $(n).parent().parent().attr("title", "第一页")
        });
        KingonUI.Core.each($(".pagination-prev"),
        function (n) {
            $(n).parent().parent().attr("title", "上一页")
        });
        KingonUI.Core.each($(".pagination-next"),
        function (n) {
            $(n).parent().parent().attr("title", "下一页")
        });
        KingonUI.Core.each($(".pagination-last"),
        function (n) {
            $(n).parent().parent().attr("title", "最后页")
        });
        KingonUI.Core.each($(".pagination-load"),
        function (n) {
            $(n).parent().parent().attr("title", "刷新")
        });
        KingonUI.Core.each($(".kingon-datetimebox"),
        function (n) {
            try {
                $(n).removeAttr("class");
                $(n).attr("class", "Wdate");
                var dateFrm = $file.attr("dateFmt") || "yyyy-MM-dd HH:mm";

                $(n).attr("onfocus", "WdatePicker({ dateFmt: '" + dateFrm + "' })")
            } catch (ddd) { }
        });
        KingonUI.Core.each($(".kingon-datebox"),
        function (n) {
            try {
                $(n).removeAttr("class");
                $(n).attr("class", "Wdate");
                var dateFrm = $file.attr("dateFmt") || "yyyy-MM-dd";
                $(n).attr("onfocus", "WdatePicker({ dateFmt:  '" + dateFrm + "' })")
            } catch (ddd) { }
        })
    },
    1000);
    setTimeout(function () {
        KingonUI.Core.each($(".easyui-limithtml"),
        function (n) {
            KingonUI.UEditorUI.initLimitEditor($(n))
        });
        KingonUI.Core.each($(".easyui-simplehtml"),
        function (n) {
            KingonUI.UEditorUI.initSimpleEditor($(n))
        });
        KingonUI.Core.each($(".easyui-sourcehtml"),
        function (n) {
            KingonUI.UEditorUI.initSourceEditor($(n))
        });
        KingonUI.Core.each($(".easyui-commonhtml"),
        function (n) {
            KingonUI.UEditorUI.initCommonEditor($(n))
        })
    },
    80);
    setTimeout(function () {
        KingonUI.Core.each($(".easyui-limithtml"),
        function (n) {
            KingonUI.UEditorUI.initLimitEditor($(n))
        });
        KingonUI.Core.each($(".easyui-simplehtml"),
        function (n) {
            KingonUI.UEditorUI.initSimpleEditor($(n))
        });
        KingonUI.Core.each($(".easyui-sourcehtml"),
        function (n) {
            KingonUI.UEditorUI.initSourceEditor($(n))
        });
        KingonUI.Core.each($(".easyui-commonhtml"),
        function (n) {
            KingonUI.UEditorUI.initCommonEditor($(n))
        });
        KingonUI.Core.each($(".easyui-photo"),
        function (n) {
            try {
                $file = $(n);
                var showbutton = "1";
                var id = $file.attr("id") || "";
                var name = $file.attr("name") || "";
                var filewidth = $file.attr("filewidth") || "160";
                var fileheight = $file.attr("fileheight") || "120";
                var value = $file.val();
                var $div = $('<div id="' + id + '_div"></div>');
                var $hide = $('<input type="hidden" id="' + id + '" name="' + name + '" value="" />');
                var $but = $('<input type="button" style="border-left:none;margin:0;" value="拍照" />');
                $file.attr("id", id + "_text");
                $file.attr("name", name + "_text");
                $file.removeClass();
                $file.attr('readonly');
                $file.hide();
                $hide.val(value);
                if (value.length > 0) {
                    try {
                        var ss = '<img id="' + id + '_img" src="' + value + '" alt=""  width="' + filewidth + '" height="' + fileheight + '" />';
                        $div.html(ss)
                    } catch (d) { }
                }
                $but.bind("click",
                function () {
                    try {
                        var val = $(this).prev().prev().prev().val();
                        var url = Sys.OnlineTakePhotoUrl + '?height=' + fileheight + '&width=' + filewidth + '&eid=' + id;
                        top.OpenUrl(KingonUI.Core.getIframeID(), "拍照", url, "", 1, 600, 430, 9900)
                    } catch (d) { }
                });
                if (showbutton == "0") $file.before($hide).before($div);
                else $file.after($but).before($hide).before($div)
            } catch (dd) { }
        });
        KingonUI.Core.each($(".easyui-chart"),
        function (n) {
            try {
                $file = $(n);
                var id = $file.attr("id") || "";
                var name = $file.attr("name") || "";
                var showbutton = $file.attr("showbutton") || "1";
                var filetype = $file.attr("filetype") || "*.jpg";
                var filenumber = $file.attr("filenumber") || "5";
                var filesize = $file.attr("filesize") || "10";
                var filewidth = $file.attr("filewidth") || "200";
                var fileheight = $file.attr("fileheight") || "100";
                var value = $file.val();
                var $div = $('<div id="' + id + '_div"></div>');
                var $hide = $('<input type="hidden" id="' + id + '" name="' + name + '" value="" />');
                var $but = $('<input type="button" style="border-left:none;margin:0;" value="图片管理" />');
                $file.attr("id", id + "_text");
                $file.attr("name", name + "_text");
                $file.removeClass();
                $file.attr('readonly');
                $file.hide();
                $hide.val(value);
                if (value.length > 0) {
                    try {
                        $.ajax({
                            type: "POST",
                            url: Sys.getUpLoaderFileListUrl,
                            dataType: "html",
                            data: {
                                ID: id + "_div",
                                Guid: value
                            },
                            cache: false,
                            success: function (msg) {
                                try {
                                    var CommonPageReturnJSon = JSON.parse(msg);
                                    if (CommonPageReturnJSon.Type == "ok") {
                                        var ModelJSON = JSON.parse(CommonPageReturnJSon.ModelJSON);
                                        $Mfile = $('#' + ModelJSON.ID);
                                        var FileList = JSON.parse(ModelJSON.FileList);
                                        var ss = '';
                                        for (var i = 0; i < FileList.length; i++) {
                                            var dataArray = FileList[i].filemsg.split('|');
                                            if (i == 0) {
                                                ss = '<img id="' + dataArray[0] + '" onclick="KingonUI.Core.dopicZoom(this.id)" src="' + dataArray[1] + '" alt="" btype="0"  bwidth="' + filewidth + '" bheight="' + fileheight + '"  width="' + filewidth + '" height="' + fileheight + '" />'
                                            } else {
                                                ss += '&nbsp;&nbsp;<img id="' + dataArray[0] + '" onclick="KingonUI.Core.dopicZoom(this.id)" src="' + dataArray[1] + '" alt="" btype="0"  bwidth="' + filewidth + '" bheight="' + fileheight + '"  width="' + filewidth + '" height="' + fileheight + '" />'
                                            }
                                        }
                                        $Mfile.html(ss)
                                    }
                                } catch (dd) {
                                    alert(dd)
                                }
                            }
                        })
                    } catch (d) {
                        alert(d)
                    }
                }
                $but.bind("click",
                function () {
                    try {
                        var val = $(this).prev().prev().prev().val();
                        var filetype1 = KingonUI.Core.replaceAll(filetype, ',', ';');
                        var url = Sys.ChartManUrl + '?height=' + fileheight + '&width=' + filewidth + '&size=' + filesize + '&num=' + filenumber + '&type=' + filetype1 + '&val=' + val + '&eid=' + id;
                        top.OpenUrl(KingonUI.Core.getIframeID(), "图片管理", url, "", 1, 600, 430, 9900)
                    } catch (d) {
                        alert(d)
                    }
                });
                if (showbutton == "0") $file.before($hide).before($div);
                else $file.after($but).before($hide).before($div)
            } catch (dd) {
                alert(dd)
            }
        });
        KingonUI.Core.each($(".easyui-files"),
        function (n) {
            try {
                $file = $(n);
                var id = $file.attr("id") || "";
                var name = $file.attr("name") || "";
                var showbutton = $file.attr("showbutton") || "1";
                var filetype = $file.attr("filetype") || ".*";
                var filenumber = $file.attr("filenumber") || "5";
                var filesize = $file.attr("filesize") || "100mb";
                var showdoccontent = $file.attr("showdoccontent") || "1";
                var deletefileflag = $file.attr("deletefileflag") || "1";
                var editdocfileflag = $file.attr("editdocfileflag") || "1";
                var showdoccontent = $file.attr("showdoccontent") || "1";
                var firstshowfileflag = $file.attr("firstshowfileflag") || "1";
                var firstshowdocflag = $file.attr("firstshowdocflag") || "1";
                if (firstshowdocflag == 1)
                    firstshowdocflag = true;
                else
                    firstshowdocflag = false;

                if (firstshowfileflag == 1)
                    firstshowfileflag = true;
                else
                    firstshowfileflag = false;


                if (deletefileflag == 1)
                    deletefileflag = true;
                else
                    deletefileflag = false;

                if (editdocfileflag == 1)
                    editdocfileflag = true;
                else
                    editdocfileflag = false;
                var value = $file.val();
                if (value == '' || value == null)
                {
                    value = KingonUI.Core.getGuid();
                }
                var $hide = $('<input type="hidden" id="' + id + '" name="' + name + '" value="'+value+'" />');
                $file.attr("id", id + "_text");
                $file.attr("name", name + "_text");
                $file.removeClass();
                $file.attr('readonly');
                $hide.val(value);
                $file.hide();
                var $pickfilesid = $('<a id="pickfiles_' + id + '" href="javascript:" style="text-decoration: none; color: #2a586f; display: inline-block; margin-right: 8px;"><i style="width: 16px; height: 16px; background: url(/Content/images/uploadbtn_icon.png); border: none; float: left; margin-top: 6px; margin-right: 4px; background-position: 0 0"></i>[选择文件]</a>');
                var $filelistid = $('<div id="filelist_' + id + '"></div>');
                var $fileslistid = $('<div id="fileslist_' + id + '"></div>');
                if(showdoccontent=='1')
                {
                    var $docfilelistid = $('<div id="docfilelist_' + id + '"></div>');
                    $file.after($hide).after($filelistid).after($docfilelistid).after($fileslistid).after($pickfilesid);
                    KingonUI.Core.Kuploader('', value, 'pickfiles_' + id, 'filelist_' + id, 'fileslist_' + id, 'docfilelist_' + id, filenumber, filesize, filetype, editdocfileflag, deletefileflag, firstshowfileflag, firstshowdocflag, "", "");
                }
                else
                {
                    $file.after($hide).after($filelistid).after($fileslistid).after($pickfilesid);
                    KingonUI.Core.Kuploader('', value, 'pickfiles_' + id, 'filelist_' + id, 'fileslist_' + id, '', filenumber, filesize, filetype, editdocfileflag, deletefileflag, firstshowfileflag, firstshowdocflag, "", "");
                }
                
            } catch (dd) { }
        });

        /*
        KingonUI.Core.each($(".easyui-files"),
        function (n) {
            try {
                $file = $(n);
                var id = $file.attr("id") || "";
                var name = $file.attr("name") || "";
                var showbutton = $file.attr("showbutton") || "1";
                var filetype = $file.attr("filetype") || ".*";
                var filenumber = $file.attr("filenumber") || "5";
                var filesize = $file.attr("filesize") || "10";
                var value = $file.val();



                var $hide = $('<input type="hidden" id="' + id + '" name="' + name + '" value="" />');
                var $but = $('<input type="button" style="border-left:none;margin:0;" value="附件" />');
                var $down = $('<input type="button" style="border-left:none;margin:0;" value="下载" />');
                var $div = $('<div></div>');
                $div.attr("id", id + "_div");
                $file.attr("id", id + "_text");
                $file.attr("name", name + "_text");
                $file.removeClass();
                $file.attr('readonly');
                $hide.val(value);
                if (value.length > 0) {
                    try {
                        $.ajax({
                            type: "POST",
                            url: Sys.getUpLoaderFileListUrl,
                            dataType: "html",
                            data: {
                                ID: id + "_text",
                                Guid: value
                            },
                            cache: false,
                            success: function (msg) {
                                try {
                                    var CommonPageReturnJSon = JSON.parse(msg);
                                    if (CommonPageReturnJSon.Type == "ok") {
                                        var ModelJSON = JSON.parse(CommonPageReturnJSon.ModelJSON);
                                        $Mfile = $('#' + ModelJSON.ID);
                                        var FileList = JSON.parse(ModelJSON.FileList);
                                        var ss = '<table width="100%" border="0" cellspacing="1" cellpadding="0" style="background-color:#C3D7EE; text-align:left; ">';
                                        ss += '<tr style="background-color:#FAFAFA; font-weight:600; color:#666;text-align:center;">';
                                        ss += '<td width="60%" height="25">名称</td>';
                                        ss += '<td width="20%">大小</td>';
                                        ss += '<td width="20%">操作</td>';
                                        ss += '</tr>';
                                        for (var i = 0; i < FileList.length; i++) {
                                            var dataArray = FileList[i].filemsg.split('|');
                                            ss += '<tr style="background-color:#FAFAFA; font-weight:600; color:#666;text-align:center;">';
                                            ss += '<td height="25"><a href="' + dataArray[1] + '" target="_blank">' + dataArray[3] + '</a></td>';
                                            ss += '<td>' + dataArray[2] + '</td>';
                                            if (KingonUI.Core.isOfficeFie(dataArray[3])) {
                                                ss += '<td ><a href="/Ntko/EditOffice?guid=' + dataArray[0] + '" target="_blank">修改</a></td>'
                                            } else {
                                                ss += '<td></td>'
                                            }
                                            ss += '</tr>'
                                        }
                                        ss += '</table>';
                                        $div.html(ss);
                                        $Mfile.val('共' + FileList.length + '个文件')
                                    }
                                } catch (dd) { }
                            }
                        })
                    } catch (d) {
                        $file.val('共0个文件')
                    }
                }
                if (showbutton == "1") {
                    $but.bind("click",
                    function () {
                        var val = $(this).prev().prev().prev().val();
                        var filetype1 = KingonUI.Core.replaceAll(filetype, ',', ';');
                        var url = Sys.FilesManUrl + '?size=' + filesize + '&num=' + filenumber + '&type=' + filetype1 + '&val=' + val + '&eid=' + id;
                        top.OpenUrl(KingonUI.Core.getIframeID(), "附件管理", url, "", 1, 530, 400, 9900)
                    });
                    $down.bind("click",
                    function () {
                        var val = $(this).prev().prev().val();
                        var url = Sys.FilesDownUrl + '?Guid=' + val;
                        top.OpenUrl(KingonUI.Core.getIframeID(), "附件下载", url, "", 1, 530, 400, 9900)
                    });
                    $file.after($div).before($hide).after($but).after($down)
                } else {
                    $file.bind("click",
                    function () {
                        var val = $(this).prev().val();
                        var filetype1 = KingonUI.Core.replaceAll(filetype, ',', ';');
                        var url = Sys.FilesManUrl + '?size=' + filesize + '&num=' + filenumber + '&type=' + filetype1 + '&val=' + val + '&eid=' + id;
                        top.OpenUrl(KingonUI.Core.getIframeID(), "附件管理", url, "", 1, 530, 400, 9900)
                    });
                    $file.after($div).before($hide)
                }
            } catch (dd) { }
        });


        */


        KingonUI.Core.each($(".easyui-org"),
        function (n) {
            $file = $(n);
            var id = $file.attr("id") || "";
            var preid = '';
            try {
                preid = $file.attr("preid") || ""
            } catch (dd) { }
            var name = $file.attr("name") || "";
            var orgtype = $file.attr("orgtype") || "";
            var orgmore = $file.attr("orgmore") || "";
            var showbutton = $file.attr("showbutton") || "1";
            var value = $file.val();
            var $hide = $('<input type="hidden" id="' + id + '" name="' + name + '" value="" />');
            var $but = $('<input type="button" style="border-left:none; margin:0;height:24px;width:32px" value="选择" />');
            $file.attr("id", id + "_text");
            $file.attr("name", name + "_text");
            $file.removeClass();
            $file.attr('readonly');
            $hide.val(value);
            var UrlRand = Math.random().toString();
            if (value.length > 0) {
                try {
                    $.ajax({
                        type: "POST",
                        url: Sys.getOrgNameListUrl,
                        dataType: "html",
                        data: {
                            ID: id + "_text",
                            Guid: value,
                            OrgType: orgtype,
                            UrlRand: UrlRand
                        },
                        cache: false,
                        success: function (msg) {
                            try {
                                var CommonPageReturnJSon = JSON.parse(msg);
                                if (CommonPageReturnJSon.Type == "ok") {
                                    var ModelJSON = JSON.parse(CommonPageReturnJSon.ModelJSON);
                                    $Mfile = $('#' + ModelJSON.ID);
                                    $Mfile.val(ModelJSON.Value)
                                }
                            } catch (dd) { }
                        }
                    })
                } catch (d) { }
            }
            if (showbutton == "0") {
                $file.bind("click",
                function () {
                    var val = $(this).prev().prev().val();
                    if (orgtype == '0') {
                        var url = Sys.SelectDeptUrl + '?val=' + val + '&eid=' + id + '&more=' + orgmore + '&preid=' + preid;
                        top.OpenUrl(KingonUI.Core.getIframeID(), "部门选择", url, "", 1, 680, 430, 9900)
                    } else if (orgtype == '1') {
                        var url = Sys.SelectDeptUserUrl + '?val=' + val + '&eid=' + id + '&more=' + orgmore + '&preid=' + preid;
                        top.OpenUrl(KingonUI.Core.getIframeID(), "选择部门人员", url, "", 1, 680, 430, 9999)
                    } else if (orgtype == '2') {
                        var url = Sys.SelectPostUrl + '?val=' + val + '&eid=' + id + '&more=' + orgmore + '&preid=' + preid;
                        top.OpenUrl(KingonUI.Core.getIframeID(), "选择职务", url, "", 1, 680, 430, 9900)
                    } else if (orgtype == '3') {
                        var url = Sys.SelectDeptUserUrl + '?val=' + val + '&eid=' + id + '&more=' + orgmore + '&preid=' + preid;
                        top.OpenUrl(KingonUI.Core.getIframeID(), "选择职务人员", url, "", 1, 680, 430, 9900)
                    } else if (orgtype == '4') {
                        var url = Sys.SelectRoleUrl + '?val=' + val + '&eid=' + id + '&more=' + orgmore + '&preid=' + preid;
                        top.OpenUrl(KingonUI.Core.getIframeID(), "选择角色", url, "", 1, 680, 430, 9900)
                    } else if (orgtype == '5') {
                        var url = Sys.SelectDeptUserUrl + '?val=' + val + '&eid=' + id + '&more=' + orgmore + '&preid=' + preid;
                        top.OpenUrl(KingonUI.Core.getIframeID(), "选择角色人员", url, "", 1, 680, 430, 9900)
                    } else if (orgtype == '6') {
                        var url = Sys.SelectAreaUrl + '?val=' + val + '&eid=' + id + '&more=' + orgmore + '&preid=' + preid;
                        top.OpenUrl(KingonUI.Core.getIframeID(), "选择区域", url, "", 1, 680, 430, 9900)
                    } else if (orgtype == '7') {
                        var url = Sys.SelectUserUrl + '?val=' + val + '&eid=' + id + '&more=' + orgmore + '&preid=' + preid;
                        top.OpenUrl(KingonUI.Core.getIframeID(), "选择人员", url, "", 1, 680, 430, 9900)
                    }
                })
            } else {
                $but.bind("click",
                function () {
                    var val = $(this).prev().prev().val();
                    if (orgtype == '0') {
                        var url = Sys.SelectDeptUrl + '?val=' + val + '&eid=' + id + '&more=' + orgmore + '&preid=' + preid;
                        top.OpenUrl(KingonUI.Core.getIframeID(), "部门选择", url, "", 1, 680, 430, 9900)
                    } else if (orgtype == '1') {
                        var url = Sys.SelectDeptUserUrl + '?val=' + val + '&eid=' + id + '&more=' + orgmore + '&preid=' + preid;
                        top.OpenUrl(KingonUI.Core.getIframeID(), "选择部门人员", url, "", 1, 680, 430, 9999)
                    } else if (orgtype == '2') {
                        var url = Sys.SelectPostUrl + '?val=' + val + '&eid=' + id + '&more=' + orgmore + '&preid=' + preid;
                        top.OpenUrl(KingonUI.Core.getIframeID(), "选择职务", url, "", 1, 680, 430, 9900)
                    } else if (orgtype == '3') {
                        var url = Sys.SelectDeptUserUrl + '?val=' + val + '&eid=' + id + '&more=' + orgmore + '&preid=' + preid;
                        top.OpenUrl(KingonUI.Core.getIframeID(), "选择职务人员", url, "", 1, 680, 430, 9900)
                    } else if (orgtype == '4') {
                        var url = Sys.SelectRoleUrl + '?val=' + val + '&eid=' + id + '&more=' + orgmore + '&preid=' + preid;
                        top.OpenUrl(KingonUI.Core.getIframeID(), "选择角色", url, "", 1, 680, 430, 9900)
                    } else if (orgtype == '5') {
                        var url = Sys.SelectDeptUserUrl + '?val=' + val + '&eid=' + id + '&more=' + orgmore + '&preid=' + preid;
                        top.OpenUrl(KingonUI.Core.getIframeID(), "选择角色人员", url, "", 1, 680, 430, 9900)
                    } else if (orgtype == '6') {
                        var url = Sys.SelectAreaUrl + '?val=' + val + '&eid=' + id + '&more=' + orgmore + '&preid=' + preid;
                        top.OpenUrl(KingonUI.Core.getIframeID(), "选择区域", url, "", 1, 680, 430, 9900)
                    } else if (orgtype == '7') {
                        var url = Sys.SelectUserUrl + '?val=' + val + '&eid=' + id + '&more=' + orgmore + '&preid=' + preid;
                        top.OpenUrl(KingonUI.Core.getIframeID(), "选择人员", url, "", 1, 680, 430, 9900)
                    }
                })
            }
            $hide.bind("propertychange",
            function () {
                alert("更新了")
            });
            if (showbutton == "0") $file.before($hide);
            else $file.after($but).before($hide)
        })
    },
    2000);
    setInterval(function () {
        try {
            KingonUI.Core.each($("span[class$='tree-icon tree-file icon-nav']"),
            function (n) {
                $(n).attr("class", "tree-icon tree-folder tree-folder-close")
            })
        } catch (dd) { }
        try {
            KingonUI.Core.each($("span[class$='tree-icon tree-file ']"),
            function (n) {
                $(n).attr("class", "tree-icon tree-folder tree-folder-close")
            })
        } catch (dd) { }
        try {
            if (!(PageMode.Page_PNotActionList == undefined || PageMode.Page_PNotActionList == null || PageMode.Page_PNotActionList == 'undefined' || PageMode.Page_PNotActionList == undefined)) {
                if (PageMode.Page_PNotActionList.length > 0) {
                    KingonUI.Core.each($("a"),
                    function (n) {
                        $file = $(n);
                        KingonUI.Core.each($("a"),
                        function (n) {
                            $file = $(n);
                            var oppower = $file.attr("oppower") || "";
                            if (oppower != '') {
                                oppower = oppower.split('|')[0];
                                if (PageMode.Page_PNotActionList.indexOf(oppower) != -1) {
                                    $file.attr('style', 'display:none')
                                }
                            }
                        })
                    })
                }
            }
        } catch (dd) { }
        try {
            if (!(PageMode.Page_PNotActionList == undefined || PageMode.Page_PNotActionList == null || PageMode.Page_PNotActionList == 'undefined' || PageMode.Page_PNotActionList == undefined)) {
                if (PageMode.Page_PNotActionList.length > 0) {
                    KingonUI.Core.each($("a"),
                    function (n) {
                        $file = $(n);
                        var attrs = $file.attributes;
                        for (i = 0; i < attrs.length; i++) {
                            var attr = attrs[i];
                            if (attr.name.toLowerCase() == "oppower") {
                                var oppower = $file.attr(attr.name) || "";
                                if (oppower != '') {
                                    oppower = oppower.split('|')[0];
                                    if (PageMode.Page_PNotActionList.toLowerCase().indexOf(oppower.toLowerCase()) != -1) {
                                        $file.attr('style', 'display:none')
                                    }
                                }
                                break
                            }
                        }
                    })
                }
            }
        } catch (dd) { }
    },
    1000)
});
$.extend($.fn.validatebox.defaults.rules, {
    idcard: {
        validator: function (value) {
            return /^\d{15}(\d{2}[A-Za-z0-9])?$/i.test(value)
        },
        message: '身份证号码格式不正确'
    },
    minLength: {
        validator: function (value, param) {
            return value.length >= param[0]
        },
        message: '请输入至少（2）个字符.'
    },
    length: {
        validator: function (value, param) {
            var len = $.trim(value).length;
            return len >= param[0] && len <= param[1]
        },
        message: "输入内容长度必须介于{0}和{1}之间."
    },
    phone: {
        validator: function (value) {
            return /^((\(\d{2,3}\))|(\d{3}\-))?(\(0\d{2,3}\)|0\d{2,3}-)?[1-9]\d{6,7}(\-\d{1,4})?$/i.test(value)
        },
        message: '格式不正确,请使用下面格式:0771-88888888'
    },
    mobile: {
        validator: function (value) {
            return /^(13|15|18)\d{9}$/i.test(value)
        },
        message: '手机号码格式不正确'
    },
    intOrFloat: {
        validator: function (value) {
            return /^\d+(\.\d+)?$/i.test(value)
        },
        message: '请输入数字，并确保格式正确'
    },
    currency: {
        validator: function (value) {
            return /^\d+(\.\d+)?$/i.test(value)
        },
        message: '货币格式不正确'
    },
    qq: {
        validator: function (value) {
            return /^[1-9]\d{4,9}$/i.test(value)
        },
        message: 'QQ号码格式不正确'
    },
    integer: {
        validator: function (value) {
            return /^([+]?[0-9])|([-]?[0-9])+\d*$/i.test(value)
        },
        message: '请输入整数'
    },
    age: {
        validator: function (value) {
            return /^(?:[1-9][0-9]?|1[01][0-9]|120)$/i.test(value)
        },
        message: '年龄必须是0到120之间的整数'
    },
    chinese: {
        validator: function (value) {
            return /^[\Α-\￥]+$/i.test(value)
        },
        message: '请输入中文'
    },
    english: {
        validator: function (value) {
            return /^[A-Za-z]+$/i.test(value)
        },
        message: '请输入英文'
    },
    unnormal: {
        validator: function (value) {
            return /.+/i.test(value)
        },
        message: '输入值不能为空和包含其他非法字符'
    },
    username: {
        validator: function (value) {
            return /^[a-zA-Z][a-zA-Z0-9_]{5,15}$/i.test(value)
        },
        message: '用户名不合法（字母开头，允许6-16字节，允许字母数字下划线）'
    },
    faxno: {
        validator: function (value) {
            return /^((\(\d{2,3}\))|(\d{3}\-))?(\(0\d{2,3}\)|0\d{2,3}-)?[1-9]\d{6,7}(\-\d{1,4})?$/i.test(value)
        },
        message: '传真号码不正确'
    },
    zip: {
        validator: function (value) {
            return /^[1-9]\d{5}$/i.test(value)
        },
        message: '邮政编码格式不正确'
    },
    ip: {
        validator: function (value) {
            return /d+.d+.d+.d+/i.test(value)
        },
        message: 'IP地址格式不正确'
    },
    name: {
        validator: function (value) {
            return /^[\Α-\￥]+$/i.test(value) | /^\w+[\w\s]+\w+$/i.test(value)
        },
        message: '请输入姓名'
    },
    date: {
        validator: function (value) {
            return /^(?:(?!0000)[0-9]{4}([-]?)(?:(?:0?[1-9]|1[0-2])\1(?:0?[1-9]|1[0-9]|2[0-8])|(?:0?[13-9]|1[0-2])\1(?:29|30)|(?:0?[13578]|1[02])\1(?:31))|(?:[0-9]{2}(?:0[48]|[2468][048]|[13579][26])|(?:0[48]|[2468][048]|[13579][26])00)([-]?)0?2\2(?:29))$/i.test(value)
        },
        message: '清输入合适的日期格式'
    },
    msn: {
        validator: function (value) {
            return /^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/.test(value)
        },
        message: '请输入有效的msn账号(例：abc@hotnail(msn/live).com)'
    },
    same: {
        validator: function (value, param) {
            if ($("#" + param[0]).val() != "" && value != "") {
                return $("#" + param[0]).val() == value
            } else {
                return true
            }
        },
        message: '两次输入的密码不一致！'
    }
});