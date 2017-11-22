function setHtmlNative(tablename, rec) {
    try {
        for (var attr in rec) {
            if (attr.substring(0, 1) == '$')
                continue;
            try {
                if (attr == 'ModeListJson') {
                    var TableModel_List = JSON.parse(rec[attr]);
                    for (var attr_name in TableModel_List) {
                        try {
                            InitListName(tablename, attr_name, TableModel_List[attr_name]);
                        }
                        catch (ddd) {
                            alert(ddd);
                        }
                    }

                }
            } catch (d_) {
                alert(d_);
            }
        }
        for (var attr in rec) {
            if (attr.substring(0, 1) == '$')
                continue;
            try {
                if (attr == 'TableInfoJson') {
                }
                else {
                    setColHtml(tablename, attr, rec[attr]);
                    setColHtmlDiv(tablename, attr, rec[attr]);
                }
            } catch (d_) {
                alert(d_);
            }
        }
        for (var attr in rec) {
            if (attr.substring(0, 1) == '$')
                continue;
            try {
                if (attr == 'ModeNameJson') {
                    var TableModel_Name = JSON.parse(rec[attr]);
                    //alert(rec[attr]);
                    for (var attr_name in TableModel_Name) {
                        try {
                            setColHtmlName(tablename, attr_name, TableModel_Name[attr_name]);
                            setColHtmlDivName(tablename, attr_name, TableModel_Name[attr_name]);
                        }
                        catch (ddd) {
                            alert(ddd);
                        }
                    }
                }
            } catch (d_) {
                alert(d_);
            }
        }
    }
    catch (d) {
    }
}
function InitListName(tablename, attr, value) {
    var htmlname = '#h_' + attr;
    if (tablename == '' || tablename == null || tablename == undefined)
        htmlname = '#h_' + attr;
    else
        htmlname = '#h_' + tablename + '_' + attr;
    if ($(htmlname).length != 0) {
        InitListHtml(htmlname, value);
    }
}
function InitListHtml(htmlname, value) {
    var c = $(htmlname).attr('class');
    if (!(c == undefined || c == null || c == 'undefined' || c == '') && c.indexOf('easyui') > -1) {
        try {
            if (c.indexOf('easyui-combobox') > -1) {//下拉框
                $(htmlname).combobox({
                    data: value,
                    valueField: 'id',
                    textField: 'text'
                });
            }
            else if (c.indexOf('easyui-combogrid') > -1) {//下拉框
            }
            else if (c.indexOf('easyui-combotree') > -1) {//下拉框
                $(htmlname).combotree({
                    loadData: value
                });
            }
            else if (c.indexOf('easyui-combo') > -1) {//下拉框
                $(htmlname).combo({
                    data: value,
                    valueField: 'id',
                    textField: 'text'
                });
            }
        } catch (d) {
        }
    } else {
    }
}
function setHtml(tablename, rec) {
    try {
        for (var attr in rec) {
            if (attr.substring(0, 1) == '$')
                continue;
            try {
                var curname = attr;
                attr = attr.toLowerCase();
                if (attr == 'modenamejson') {
                    //alert(rec[attr]);
                    var TableModel_Name = JSON.parse(rec[curname]);
                    for (var attr_name in TableModel_Name) {
                        var curname_name = attr_name;
                        attr_name = attr_name.toLowerCase();
                        setColHtmlName(tablename, attr_name, TableModel_Name[curname_name]);
                        setColHtmlDivName(tablename, attr_name, TableModel_Name[curname_name]);
                    }
                }
                else if (attr == 'tableinfojson') {
                    // alert(rec[attr]);
                }
                else {
                    setColHtml(tablename, attr, rec[curname]);
                    setColHtmlDiv(tablename, attr, rec[curname]);
                }
            } catch (d_) {
                alert(d_);
            }
        }
    }
    catch (d) {
    }
}
function setColHtmlName(tablename, attr, value) {
    var htmlname = '#h_' + attr;
    if (tablename == '' || tablename == null || tablename == undefined)
        htmlname = '#h_' + attr;
    else
        htmlname = '#h_' + tablename + '_' + attr;
    if ($(htmlname).length != 0) {
        setHtmlNameName(htmlname, value);
    }
}
function setColHtmlDivName(tablename, attr, value) {
    var htmlname = '#hm_' + attr;
    if (tablename == '' || tablename == null || tablename == undefined)
        htmlname = '#hm_' + attr;
    else
        htmlname = '#hm_' + tablename + '_' + attr;

    if ($(htmlname).length != 0) {
        setHtmlNameDivName(htmlname, value);
    }
}
function setColHtml(tablename, attr, value) {
    var htmlname = '#h_' + attr;
    if (tablename == '' || tablename == null || tablename == undefined)
        htmlname = '#h_' + attr;
    else
        htmlname = '#h_' + tablename + '_' + attr;
    if ($(htmlname).length != 0) {
        setHtmlName(htmlname, value);
    }
}
function setColHtmlDiv(tablename, attr, value) {
    var htmlname = '#hm_' + attr;
    if (tablename == '' || tablename == null || tablename == undefined)
        htmlname = '#hm_' + attr;
    else
        htmlname = '#hm_' + tablename + '_' + attr;
    if ($(htmlname).length != 0) {

        setHtmlNameDiv(htmlname, value);
    }
}
function setHtmlNameDiv(htmlname, value) {

    var c = $(htmlname).attr('class');
    var ShowType = $(htmlname).attr('ShowType');
    if (!(c == undefined || c == null || c == 'undefined' || c == '') && c.indexOf('easyui-colmacro') > -1) {
        if ('qrcode' == ShowType) {
            var width = $(htmlname).attr('width');
            var height = $(htmlname).attr('height');
            if (width == undefined || width == null || width == 'undefined' || width == '') {
                width = '200';
            }
            if (height == undefined || height == null || height == 'undefined' || height == '') {
                widheightth = '200';
            }
            try {
                $.ajax({
                    type: "POST",
                    url: '/Home/makeQrCode',
                    dataType: "html",
                    data: { Width: width, Height: height, ContentMsg: value },
                    cache: false,
                    success: function (msg) {
                        try {
                            var CommonPageReturnJSon = JSON.parse(msg);
                            if (CommonPageReturnJSon.Type == "ok") {
                                $(htmlname).html('<img  src="' + CommonPageReturnJSon.ModelJSON + '" alt=""  width="' + width + '" height="' + height + '" />');
                            }
                        }
                        catch (dd) {
                        }
                    }
                });
            }
            catch (d) {
            }
        }
        else if ('phone' == ShowType) {
            try {
                $.ajax({
                    type: "POST",
                    url: '/Authed/getUpLoaderFileList',
                    dataType: "html",
                    data: { Guid: value },

                    cache: false,
                    success: function (msg) {
                        try {
                            var CommonPageReturnJSon = JSON.parse(msg);
                            if (CommonPageReturnJSon.Type == "ok") {
                                var ModelJSON = JSON.parse(CommonPageReturnJSon.ModelJSON);
                                var ss = ''
                                for (var i = 0; i < ModelJSON.length; i++) {
                                    var dataArray = ModelJSON[i].filemsg.split('|');
                                    ss += '<img id="' + dataArray[0] + '" src="' + dataArray[1] + '" alt=""  width="' + filewidth + '" height="' + fileheight + '" />';
                                }
                                $(htmlname).html(ss);
                            }
                        }
                        catch (dd) {
                        }
                    }
                });
            }
            catch (d) {
            }
        }
        else if ('files' == ShowType) {
            try {
                $.ajax({
                    type: "POST",
                    url: '/Authed/getUpLoaderFileList',
                    dataType: "html",
                    data: { Guid: value },

                    cache: false,
                    success: function (msg) {
                        try {
                            var CommonPageReturnJSon = JSON.parse(msg);
                            if (CommonPageReturnJSon.Type == "ok") {

                                var ModelJSON = JSON.parse(CommonPageReturnJSon.ModelJSON);

                                var FileList = JSON.parse(ModelJSON.FileList);
                                var ss = '';
                                for (var i = 0; i < FileList.length; i++) {
                                    if (i > 0) {
                                        ss += '<br>';
                                    }
                                    var dataArray = FileList[i].filemsg.split('|');
                                    ss += '<a href="' + dataArray[1] + '" target="_blank">';
                                    ss += '<img src="/Content/Images/ico/doc_stand.png" alt="" class="uploadify-ico" />';
                                    ss += dataArray[3] + '(' + dataArray[2] + ')';
                                    ss += '</a>';
                                }
                                $(htmlname).html(ss);


                            }
                        }
                        catch (dd) {
                            alert(dd);
                        }
                    }
                });
            }
            catch (d) {
                alert(d);
            }
        }
        else if ('html' == ShowType) {
            $(htmlname).html(value);
        }
        else if ('chtml' == ShowType) {

            $(htmlname).html(unescape(value));
        }
        else if ('text' == ShowType) {
            $(htmlname).val(value);
        }
    }
    else {
        alert("没有配置对");
    }
}
function setHtmlName(htmlname, value) {
    var c = $(htmlname).attr('class');
    if (!(c == undefined || c == null || c == 'undefined' || c == '') && c.indexOf('easyui') > -1) {
        try {
            if (c.indexOf('easyui-textbox') > -1) {//录入框
                $(htmlname).textbox('setValue', value);
            }
            else if (c.indexOf('easyui-searchbox') > -1) {//录入查询框
                $(htmlname).searchbox('setValue', value);
            }
            else if (c.indexOf('easyui-combobox') > -1) {//下拉框
                if (KingonUI.Core.isInteger(value)) {
                    $(htmlname).combobox('setValue', value);
                }
                else {
                    if (value.indexOf(',') > 0)
                        $(htmlname).combobox('setValues', value.split(','));
                    else
                        $(htmlname).combobox('setValue', value);
                }
            }
            else if (c.indexOf('easyui-combogrid') > -1) {//下拉框
                if (KingonUI.Core.isInteger(value)) {
                    $(htmlname).combogrid('setValue', value);
                }
                else {
                    if (value.indexOf(',') > 0) {
                        $(htmlname).combogrid('setValues', value.split(','));
                    }
                    else {
                        $(htmlname).combogrid('setValue', value);
                    }
                }
            }
            else if (c.indexOf('easyui-combotree') > -1) {//下拉框
                if (KingonUI.Core.isInteger(value)) {
                    $(htmlname).combotree('setValue', value);
                }
                else {
                    if (value.indexOf(',') > 0)
                        $(htmlname).combotree('setValues', value.split(','));
                    else
                        $(htmlname).combotree('setValue', value);
                }

            }
            else if (c.indexOf('easyui-combo') > -1) {//下拉框
                if (KingonUI.Core.isInteger(value)) {
                    $(htmlname).combo('setValue', value);
                }
                else {
                    if (value.indexOf(',') > 0)
                        $(htmlname).combo('setValues', value.split(','));
                    else
                        $(htmlname).combo('setValue', value);
                }
            }
            else if (c.indexOf('easyui-numberbox') > -1) {//数字录入框

                $(htmlname).numberbox('setValue', value);
            }
            else if (c.indexOf('easyui-numberspinner') > -1) {//数字选择框
                $(htmlname).numberspinner('setValue', value);
            }
            else if (c.indexOf('easyui-datebox') > -1) {//日期选择
                if (value == '1900-01-01 00:00:00') {
                    $(htmlname).datebox('setValue', '');
                } else {
                    try {
                        $(htmlname).datebox('setValue', KingonUI.Core.getDateFromStr(value));

                    }
                    catch (d) {
                        try {
                            $(htmlname).datebox('setValue', value);
                        }
                        catch (dd) {
                        }
                    }
                }
            }
            else if (c.indexOf('easyui-datetimebox') > -1) {//日期选择
                if (value == '1900-01-01 00:00:00') {
                    $(htmlname).datetimebox('setValue', '');
                } else {
                    try {
                        $(htmlname).datetimebox('setValue', KingonUI.Core.getDateFromStr(value));
                    }
                    catch (d) {
                        try {
                            $(htmlname).datetimebox('setValue', value);
                        }
                        catch (dd) {
                        }
                    }
                }
            }
            else if (c.indexOf('easyui-timespinner') > -1) {//日期选择
                if (value == '1900-01-01 00:00:00') {
                    $(htmlname).timespinner('setValue', '');
                } else {
                    try {
                        $(htmlname).timespinner('setValue', value);
                    }
                    catch (d) {
                        try {
                            $(htmlname).timespinner('setValue', KingonUI.Core.getDateFromStr(value));
                        }
                        catch (dd) {
                        }
                    }
                }
            }
            else if (c.indexOf('easyui-datetimespinner') > -1) {//日期选择
                if (value == '1900-01-01 00:00:00') {
                    $(htmlname).datetimespinner('setValue', '');
                } else {
                    try {
                        $(htmlname).datetimespinner('setValue', KingonUI.Core.getDateFromStr(value));
                    }
                    catch (d) {
                        try {
                            $(htmlname).datetimespinner('setValue', value);
                        }
                        catch (dd) {
                        }
                    }
                }
            }
            else if (c.indexOf('easyui-slider') > -1) {//百分比选择框
                $(htmlname).slider('setValue', value);
            }
            else if (c.indexOf('easyui-limithtml') > -1) {//文本编辑框
                try { setTimeout(function () { KingonUI.UEditorUI.setContent($(htmlname), unescape(value)); }, 6000); } catch (d) { alter(d); }
            }
            else if (c.indexOf('easyui-simplehtml') > -1) {//文本编辑框
                try { setTimeout(function () { KingonUI.UEditorUI.setContent($(htmlname), unescape(value)); }, 6000); } catch (d) { alter(d); }
            }

            else if (c.indexOf('easyui-sourcehtml') > -1) {//文本编辑框
                try { setTimeout(function () { KingonUI.UEditorUI.setSourceContent($(htmlname), unescape(value)); }, 6000); } catch (d) { }
            }
            else if (c.indexOf('easyui-commonhtml') > -1) {//文本编辑框
                try { setTimeout(function () { KingonUI.UEditorUI.setContent($(htmlname), unescape(value)); }, 6000); } catch (d) { }
            }
            else {
                $(htmlname).val(value);
            }
        } catch (d) {
        }
    } else {
        try {
            if ($(htmlname).attr('type') == 'checkbox') {
                if (value.indexOf(',') > 0) {
                    var list = value.split(',');
                    $(list).each(function (i, item) {
                        if (item != '') {
                            $('input:checkbox[name="' + htmlname + '"][value="' + item + '"]').attr("checked", true);
                        }
                    });
                }
                else
                    $('input:checkbox[name="' + htmlname + '"][value="' + value + '"]').attr('checked', true);
            }
            else if ($(htmlname).attr('type') == 'radio') {
                $('input:radio[name="' + htmlname + '"][value="' + value + '"]').attr('checked', true);
            }
            else {
                $(htmlname).val(value);
            }
        } catch (d) { }
    }
}
function setHtmlNameDivName(htmlname, value) {
    var c = $(htmlname).attr('class');
    var ShowType = $(htmlname).attr('ShowType');
    if (!(c == undefined || c == null || c == 'undefined' || c == '') && c.indexOf('easyui-colmacro') > -1) {
        if ('html' == ShowType) {
            $(htmlname).html(value);
        }
        else if ('text' == ShowType) {
            $(htmlname).val(value);
        }
    }
}
function setHtmlNameName(htmlname, value) {
    var c = $(htmlname).attr('class');
    if (!(c == undefined || c == null || c == 'undefined' || c == '') && (c.indexOf('easyui') > -1)) {
        try {
            if (c.indexOf('easyui-combobox') > -1) {//下拉框
                $(htmlname).combobox('setText', value);
            }
            else if (c.indexOf('easyui-combogrid') > -1) {//下拉框
                $(htmlname).combogrid('setText', value);
            }
            else if (c.indexOf('easyui-combotree') > -1) {//下拉框
                $(htmlname).combotree('setValue', value);
            }
            else if (c.indexOf('easyui-combo') > -1) {//下拉框
                $(htmlname).combo('setValue', value);
            }
            else if (c.indexOf('easyui-org') > -1) {//组织结构选择构架

            }
        } catch (d) {
            alert(d);
        }
    } else {
        try {
            setTimeout(function () {
                $(htmlname + '_text').val(value);
                //alert(htmlname);
                //alert(value);
            }, 2000);
        }
        catch (dd) {
            alert(dd);
        }
    }
}
function getHtmlName(htmlname) {
    var s;
    var c = $(htmlname).attr('class');
    if (!(c == undefined || c == null || c == 'undefined' || c == '') && c.indexOf('easyui') > -1) {

        try {
            if (c.indexOf('easyui-textbox') > -1) {//录入框
                s = $(htmlname).textbox('getValue');
            }
            else if (c.indexOf('easyui-searchbox') > -1) {//录入查询框
                s = $(htmlname).searchbox('getValue');
            }
            else if (c.indexOf('easyui-combobox') > -1) {//下拉框
                var saar = $(htmlname).combobox('getValues');
                s = saar[0];
                for (var i = 1; i < saar.length; i++) {
                    s = s + ',' + saar[i];
                }
            }
            else if (c.indexOf('easyui-combogrid') > -1) {//下拉框
                var saar = $(htmlname).combogrid('getValues');
                s = saar[0];
                for (var i = 1; i < saar.length; i++) {
                    s = s + ',' + saar[i];
                }
            }
            else if (c.indexOf('easyui-combotree') > -1) {//下拉框
                var saar = $(htmlname).combotree('getValues');
                s = saar[0];
                for (var i = 1; i < saar.length; i++) {
                    s = s + ',' + saar[i];
                }
            }
            else if (c.indexOf('easyui-combo') > -1) {//下拉框
                var saar = $(htmlname).combo('getValues');
                s = saar[0];
                for (var i = 1; i < saar.length; i++) {
                    s = s + ',' + saar[i];
                }
            }
            else if (c.indexOf('easyui-numberbox') > -1) {//数字录入框
                s = $(htmlname).numberbox('getValue');
            }
            else if (c.indexOf('easyui-numberspinner') > -1) {//数字选择框
                s = $(htmlname).numberspinner('getValue');
            }
            else if (c.indexOf('easyui-datebox') > -1) {//日期选择
                s = $(htmlname).datebox('getValue');
            }
            else if (c.indexOf('easyui-datetimebox') > -1) {//日期选择
                s = $(htmlname).datetimebox('getValue');
            }
            else if (c.indexOf('easyui-timespinner') > -1) {//日期选择
                s = $(htmlname).timespinner('getValue');
            }
            else if (c.indexOf('easyui-datetimespinner') > -1) {//日期选择
                s = $(htmlname).datetimespinner('getValue');
            }
            else if (c.indexOf('easyui-slider') > -1) {//百分比选择框
                s = $(htmlname).slider('getValue');
            }
            else if (c.indexOf('easyui-limithtml') > -1) {//文本编辑框
                try {
                    s = KingonUI.UEditorUI.getContent($(htmlname));
                    alert(s);
                    s = escape(s);
                } catch (d) { }
            }
            else if (c.indexOf('easyui-simplehtml') > -1) {//文本编辑框
                try {
                    s = KingonUI.UEditorUI.getContent($(htmlname));
                    s = escape(s);
                } catch (d) { }
            }
            else if (c.indexOf('easyui-sourcehtml') > -1) {//文本编辑框
                try {
                    s = KingonUI.UEditorUI.getContent($(htmlname));
                    s = escape(s);
                } catch (d) { }
            }
            else if (c.indexOf('easyui-commonhtml') > -1) {//文本编辑框
                try {
                    s = KingonUI.UEditorUI.getContent($(htmlname));
                    s = escape(s);
                } catch (d) { }
            }
            else {
                s = $(htmlname).val();
            }
        } catch (d) {
        }
    } else {
        try {
            if ($(htmlname).attr('type') == 'checkbox') {
                $('input:checkbox[name="' + htmlname + '"]').each(function () {
                    if ($(this).is(':checked')) {
                        s += $(this).val() + ',';
                    }
                });
            }
            else if ($(htmlname).attr('type') == 'radio') {
                s = $('input:radio[name="' + htmlname + '"]:checked').val();
            }
            else {
                s = $(htmlname).val();
            }
        }
        catch (d) {
        }
    }
    if (s == 'undefined' || s == undefined || s == null) {
        s = '';
    }
    return s;
}
function getColHtml(tablename, attr) {
    var s;
    var htmlname = '#h_' + attr;
    if (tablename == '' || tablename == null || tablename == undefined)
        htmlname = '#h_' + attr;
    else
        htmlname = '#h_' + tablename + '_' + attr;
    if ($(htmlname).length != 0) {
        s = getHtmlName(htmlname);
    }
    if (s == 'undefined' || s == undefined || s == null) {
        s = '';
    }
    return s;
}
function getColUpdateMsg(tablename, attr, value, colName) {
    var htmlname = '#h_' + attr;
    if (tablename == '' || tablename == null || tablename == undefined)
        htmlname = '#h_' + attr;
    else
        htmlname = '#h_' + tablename + '_' + attr;
    if ($(htmlname).length != 0) {
        return getHtmlColUpdateMsg(htmlname, value, colName);
    }
    return '';
}
function getHtmlColUpdateMsg(htmlname, value, colName) {
    var s = getHtmlName(htmlname);
    if (s == value)
        return '';
    else
        return colName + '由:[' + value + ']变更为:[' + htmlname + ']';
}
function getHtmlUpdateMsg(tablename, rec) {
    var changeMsg = '';
    var num = 0;
    try {
        var TableInfoJson = JSON.parse(rec["TableInfoJson"]);
        for (var attr in rec) {
            if (attr.substring(0, 1) == '$')
                continue;
            try {
                if (attr == 'ModeNameJson') {
                    continue;
                }
                else if (attr == 'TableInfoJson') {
                    continue;
                }
                else {
                    var Col_Name = TableInfoJson[rec[attr]];
                    alert(Col_Name);
                    var msg = getColUpdateMsg(tablename, attr, rec[attr], Col_Name);
                    if (msg != '') {
                        if (changeMsg == '') {
                            num = num + 1;
                            changeMsg = num + '、' + msg;
                        }
                        else {
                            num = num + 1;
                            changeMsg = changeMsg + '\r\n' + num + '、' + msg;
                        }
                    }
                }
            } catch (d_) {
                alert(d_);
            }
        }
    }
    catch (d) {
    }
    return changeMsg;
}
function getHtml(tablename, rec) {
    var s = '';
    var Postdata = 'num=' + Math.random();
    try {
        for (var attr in rec) {
            if (attr.substring(0, 1) == '$')
                continue;
            try {
                attr = attr.toLowerCase();
                s = getColHtml('', attr);
                Postdata += '&' + attr + '=' + escape(s);
            } catch (d_) {
                alert(d_);
            }
        }
    }
    catch (d) {
    }
    return Postdata;
}