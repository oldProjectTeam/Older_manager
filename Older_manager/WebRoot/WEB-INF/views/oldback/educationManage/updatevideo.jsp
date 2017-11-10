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
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!-- 引入jquery -->
<script type="text/javascript" src="${APP_PATH}/static/js/jquery-3.2.1.min.js"></script>
<!-- 引入样式 -->
<link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>

<body style="margin: 15px;">
	<!--路劲导航  -->
	<div class="row">
		<div class="col-md-12">
			<ol class="breadcrumb">
				<li>
					<b>位置：教育管理</b>
				</li>
				<li>
					<b>视频管理</b>
				</li>
				<li class="active">修改视频</li>
			</ol>
		</div>
	</div>
	<!--主体  -->
	<div class="row">
		<div class="col-md-12">
			<form class="form-horizontal" id="VideoForm">
				<div class="table-responsive">
					<table class="table table-bordered table-striped text-center">
						<tbody>
							<tr>
								<input type="hidden" name="id" value="${video.id}" />
								<td>标题 <span style="color:red">*</span></td>
								<td class="col-xs-2"><input type="text" class="form-control" required="required" value="${video.title}"
										name="title" id="title"></td>
								<td>副标题 <span style="color:red">*</span></td>
								<td class="col-xs-2"><input type="text" class="form-control" value="${video.subtitle}" required="required"
										name="subtitle" id="subtitle"></td>
								<td>创作人 <span style="color:red">*</span></td>
								<td class="col-xs-2"><input type="text" class="form-control" name="creators" value="${video.creators}"
										id="creators"></td>
								<td rowspan="1" class="active">视频 <span style="color:red">*</span></td>
								<td rowspan="1" class="col-xs-2"><input type="hidden" id="videopath" name="path" value="${video.path}" />
									<input class="btn btn-default" type="file" id="video" value="${video.path}" onchange="showPic()"></td>
							</tr>
							<tr>
								<td>视频描述</td>
								<td><textarea class="form-control" rows="3"></textarea></td>
								<td>导演</td>
								<td><input type="text" class="form-control" value="${video.director}" name="director"></td>
								<td>制作者</td>
								<td><input type="text" class="form-control" value="${video.producer}" name="producer"></td>

								<td colspan="2" rowspan="2"><video src="${video.path}" controls="controls" class="img-responsive" poster="" />
									您的浏览器不支持 video 标签。 </video></td>
							</tr>
							<tr>
								<td>版权</td>
								<td><input type="text" class="form-control" value="${video.copyright}" name="copyright"></td>
								<td>内容提供商</td>
								<td><input type="text" class="form-control" value="${video.contentprovider}" name="contentprovider"></td>
								<td>创建时间 <span style="color:red">*</span></td>
								<td><input type="date" class="form-control" name="createtime" id="createtime"></td>

							</tr>
							<tr>
								<td>备注</td>
								<td><textarea class="form-control" rows="3" name="remark"></textarea></td>
								<td>长度 <span style="color:red">*</span></td>
								<td><input type="text" class="form-control" required="required" name="lenght" value="${video.lenght}"
										id="lenght"></td>
								<td>帧高度</td>
								<td><input type="text" class="form-control" value="${video.frameheight}" name="frameheight"></td>
								<td colspan="2"><input class="btn btn-success" type="button" value="上传视频" name="addvideo"
										onclick="uploadFile()"> <br>
									<div id="progress" class="progress-bar" style=" margin-top: 10 "></td>
							</tr>
							<tr>
								<td>标记</td>
								<td><input type="text" class="form-control" value="${video.marking}" name="marking"></td>
								<td>数据速率</td>
								<td>
									<div class="form-group">
										<div class="col-sm-8">
											<input type="text" class="form-control" value="${video.daterate}" name="daterate">
										</div>
										<label class="col-sm-1 control-label">kbps</label>
									</div>
								</td>
								<td>总比特率</td>
								<td>
									<div class="form-group">
										<div class="col-sm-8">
											<input type="text" class="form-control" value="${video.totalbitrate}" name="totalbitrate">
										</div>
										<label class="col-sm-1 control-label">kbps</label>
									</div>
								</td>
								<td>帧速率</td>
								<td>
									<div class="form-group">
										<div class="col-sm-7">
											<input type="text" class="form-control" value="${video.framerate}" name="framerate">
										</div>
										<label class="col-sm-4 control-label">帧/秒</label>
									</div>
								</td>
							</tr>

							<tr>
								<td>频道</td>
								<td><input type="text" class="form-control" value="${video.channel}" name="channel"></td>
								<td>音频采样频率</td>
								<td>
									<div class="form-group">
										<div class="col-sm-8">
											<input type="text" class="form-control" value="${video.afsf}" name="afsf">
										</div>
										<label class="col-sm-1 control-label">kHz</label>
									</div>
								</td>
								<td>比特率</td>
								<td>
									<div class="form-group">
										<div class="col-sm-8" name="">
											<input type="text" class="form-control" value="${video.bitrate}" name="bitrate">
										</div>
										<label class="col-sm-1 control-label">kbps</label>
									</div>
								</td>
								<td>帧宽度</td>
								<td><input type="text" class="form-control" value="${video.framewidth}" name="framewidth"></td>
							</tr>
							<tr>
								<td colspan="8"><input type="hidden" name="artists"> <input type="hidden" name="years"> <input
										type="hidden" value="1" name="vcount"> <input type="hidden" name="video2"> <input
										type="hidden" name="video3"> <input type="hidden" class="form-control" name="promulgator">
									<button type="button" class="btn btn-primary" id="saveVideo">更改</button>
									<button type="button" class="btn btn-info" onClick="javascript :history.back(-1);">返回</button></td>
							</tr>
						</tbody>

					</table>
				</div>
			</form>
		</div>
	</div>

	<script type="text/javascript">
        $("#saveVideo").click(

                function() {

                    var subtitle = $('#subtitle').val();
                    var title = $('#title').val();
                    var createtime = $('#createtime').val();
                    var creators = $('#creators').val();
                    var lenght = $('#lenght').val();
                    /* var video = $('#video').val(); */
                    var path = document.getElementById("videopath").value;
                    /* var path =  $('#videopath').val(); */
                    if (/* jQuery.trim(video) == '' ||  */jQuery.trim(title) == ''
                            || jQuery.trim(creators) == '' || jQuery.trim(subtitle) == ''
                            || jQuery.trim(createtime) == '' || jQuery.trim(lenght) == '') {
                        alert("请按照红色*号提示填写资料！");
                    } else if (path.replace(/(^s*)|(s*$)/g, "").length == 0 || path == null
                            || path == 'null') {
                        alert("视频还没有上传成功！");
                    } else {

                        $.ajax({
                            url : "video/updateVideo",
                            data : $("#VideoForm").serialize(),
                            type : "post",
                            success : function(result) {

                                if (result.code == 100) {
                                    alert("更改成功!");
                                    window.history.back();
                                } else {
                                    alert("更改失败!");
                                }
                            }
                        });
                    }

                }

        );

        function showPic() {
            var videoUrl = $("#video").get(0).files[0];
            var regImg = /\.(mp4|webm|ogg)$/;
            if (!regImg.test($("#video").val())) {
                alert("视频目前只支持.mp4,webm,ogg这三种类型.");
                //清空文件域
                var file = $("#video");
                file.after(file.clone().val(""));
                file.remove();
                return false;
            } else {
                if (!getPhotoSize()) {

                } else {
                    $("video").prop("src", window.URL.createObjectURL(videoUrl));
                }

            }
            ;

        };

        function uploadFile() {

            var video = $("#video").get(0).files[0];
            if (video == null) {
                alert("请选择上传的视频再进行上传操作！");
            } else {
                var formData = new FormData();
                formData.append("file", video);

                $.ajax({
                    type : "POST",
                    url : "video/insertVideo",
                    data : formData,
                    processData : false,
                    //必须false才会自动加上正确的Content-Type 
                    contentType : false,
                    xhr : function() {
                        var xhr = $.ajaxSettings.xhr();
                        if (onprogress && xhr.upload) {
                            xhr.upload.addEventListener("progress", onprogress, false);
                            return xhr;
                        }
                    },
                    success : function(result) {

                        if (result.code == 100) {
                            var path = document.getElementById("videopath");
                            path.value = result.extend.path;
                            alert("视频上传成功!");
                        } else {
                            alert("视频上传失败!");
                        }
                    }
                });
            }

        };
        /**
         * 侦查附件上传情况 ,这个方法大概0.05-0.1秒执行一次
         */
        function onprogress(evt) {
            var loaded = evt.loaded; //已经上传大小情况 
            var tot = evt.total; //附件总大小 
            var per = Math.floor(100 * loaded / tot); //已经上传的百分比 
            $("#progress").html(per + "%");
            $("#progress").css("width", per + "%");
        };

        window.onload = function() {
            document.getElementById("createtime").valueAsDate = new Date("${video.createtime}");
        };

        //判断视频大小和格式
        function getPhotoSize() {
            var obj = document.getElementById("video");

            var fileSize = 0;
            var isIE = /msie/i.test(navigator.userAgent) && !window.opera;
            if (isIE && !obj.files) {
                var filePath = obj.value;
                var fileSystem = new ActiveXObject("Scripting.FileSystemObject");
                var file = fileSystem.GetFile(filePath);
                fileSize = file.Size;
            } else {
                fileSize = obj.files[0].size;
            }
            fileSize = Math.round(fileSize / 1024 * 100) / 100; //单位为KB
            if (fileSize >= 300000) {
                alert("单个视频最大为300MB，请重新上传!");
                var file = $("#video");
                file.after(file.clone().val(""));
                file.remove();
                return false;
            } else {
                return true;
            }
        }
    </script>
</body>
</html>
