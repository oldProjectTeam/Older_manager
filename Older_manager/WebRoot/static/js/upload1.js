 

 
//-----------新增模态框处理图片部门开始---------------
 
//校验是否是图片、和预览、重置和隐藏进度条
 function showPic(){
  var pic = $("#photofile").get(0).files[0];
  var regImg=/\.(gif|jpg|jpeg|png|GIF|JPG|PNG)$/;
   if(!regImg.test($("#photofile").val())){
	   alert("图片类型必须是.gif,jpeg,jpg,png中的一种");
	 //清空文件域
	   var file = $("#photofile") ;
	   file.after(file.clone().val(""));      
	   file.remove();
       return false;
   }
  $("#son").css("width" ,"0%");
  $("#imgDiv").hide();
  $("#img").prop("src" , window.URL.createObjectURL(pic));
 }
 
 //上传图片，显示进度条
 function uploadFile(){
  var pic = $("#photofile").get(0).files[0];
  if(pic==undefined){
	  alert("您还没选择上传的文件！");
	  return false;
  }
  //显示进度条
  $("#imgDiv").show();
  var formData = new FormData();
  formData.append("file" , pic);
  /** 
   * 必须false才会避开jQuery对 formdata 的默认处理 
   * XMLHttpRequest会对 formdata 进行正确的处理 
   */
  $.ajax({
	   type: "POST",
	   url: "giftmanagement/upload.action",
	   data: formData ,
	   processData : false, 
	   //必须false才会自动加上正确的Content-Type 
	   contentType : false , 
	   xhr: function(){
	    var xhr = $.ajaxSettings.xhr();
	    if(onprogress && xhr.upload) {
	     	xhr.upload.addEventListener("progress" , onprogress, false);
	     return xhr;
	    }
  	   },
  	 success:function(result){
  		 if(result.code==100){
  			 //返回图片路径创建文本框之前，先判断之前是否已经上传过了，如果是，先删除再创建
  			var isImg=$("#image").val();
		    if(isImg!=undefined&&isImg!=''){//如果图片已上传，那么创建之前将图片删除
		    	$("#image").remove();
		    	removeImg(isImg);
		    }
		     //清空文件域
			 var file = $("#photofile") ;
			 file.after(file.clone().val(""));      
			 file.remove();
			 //存放文件名
			 var inputPath=$("<input type='hidden' name='image' id='image'/>" );
			 inputPath.attr("value",result.extend.fileName);
			 inputPath.appendTo("#tr8");
  		 }else{
  			 $("#son").html("上传失败");
  			 $("#son").css("font-size","0.6em");
  			 $("#son").css("color","red");
  		 }
	 }
  });
 }
 
 /**
  * 侦查附件上传情况 ,这个方法大概0.05-0.1秒执行一次
  */
 function onprogress(evt){
	  var loaded = evt.loaded;     //已经上传大小情况 
	  var tot = evt.total;      //附件总大小 
	  var per = Math.floor(100*loaded/tot);  //已经上传的百分比 
	  $("#son").html(per+"%");
	  $("#son").css("width",per+"%");
	  if($("#son").text()=="100%"){
		  $("#son").html("上传成功");
	  }
 }
//-----------新增模态框处理图片结束---------------
 
//-----------修改模态框处理图片开始---------------
 
//校验是否是图片、和预览、重置和隐藏进度条
 function showPic1(){
  var pic = $("#photofile1").get(0).files[0];
  var regImg=/\.(gif|jpg|jpeg|png|GIF|JPG|PNG)$/;
   if(!regImg.test($("#photofile1").val())){
	   alert("图片类型必须是.gif,jpeg,jpg,png中的一种");
	 //清空文件域
	   var file = $("#photofile1") ;
	   file.after(file.clone().val(""));      
	   file.remove();
       return false;
   }
  $("#son1").css("width" ,"0%");
  $("#imgDiv1").hide();
  $("#img1").prop("src" , window.URL.createObjectURL(pic));
 }
 
 //上传图片，显示进度条
 function uploadFile1(){
  var pic = $("#photofile1").get(0).files[0];
  if(pic==undefined){
	  alert("您还没选择上传的文件！");
	  return false;
  }
  //显示进度条
  $("#imgDiv1").show();
  var formData = new FormData();
  formData.append("file" , pic);
  /** 
   * 必须false才会避开jQuery对 formdata 的默认处理 
   * XMLHttpRequest会对 formdata 进行正确的处理 
   */
  $.ajax({
	   type: "POST",
	   url: "giftmanagement/upload.action",
	   data: formData ,
	   processData : false, 
	   //必须false才会自动加上正确的Content-Type 
	   contentType : false , 
	   xhr: function(){
	    var xhr = $.ajaxSettings.xhr();
	    if(onprogress && xhr.upload) {
	     	xhr.upload.addEventListener("progress" , onprogress1, false);
	     return xhr;
	    }
  	   },
  	 success:function(result){
  		 if(result.code==100){
  			 //返回图片路径创建文本框之前，先判断之前是否已经上传过了，如果是，先删除再创建
  			var isImg=$("#image1").val();
		    if(isImg!=undefined&&isImg!=''){//如果图片已上传，那么创建之前将图片删除
		    	$("#image1").remove();
		    	removeImg(isImg);
		    }
		     //清空文件域
			 var file = $("#photofile1") ;
			 file.after(file.clone().val(""));      
			 file.remove();
			 //存放文件名
			 var inputPath=$("<input type='hidden' name='image' id='image1'/>" );
			 inputPath.attr("value",result.extend.fileName);
			 inputPath.appendTo("#tr10");
  		 }else{
  			 $("#son1").html("上传失败");
  			 $("#son1").css("font-size","0.6em");
  			 $("#son1").css("color","red");
  		 }
	 }
  });
 }
 
 /**
  * 侦查附件上传情况 ,这个方法大概0.05-0.1秒执行一次
  */
 function onprogress1(evt){
	  var loaded = evt.loaded;     //已经上传大小情况 
	  var tot = evt.total;      //附件总大小 
	  var per = Math.floor(100*loaded/tot);  //已经上传的百分比 
	  $("#son1").html( per +"%" );
	  $("#son1").css("width" , per +"%");
	  if($("#son1").text()=="100%"){
		  $("#son1").html("上传成功");
	  }
 }
//-----------修改模态框处理图片结束---------------
 
 