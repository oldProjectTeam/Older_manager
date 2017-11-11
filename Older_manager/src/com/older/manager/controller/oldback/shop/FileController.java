package com.older.manager.controller.oldback.shop;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.older.manager.utils.FileUtil;
import com.older.manager.utils.Msg;

/**
 * 上传文件，删除文件通用处理controller
 * @author lenovo
 *
 */
@Controller
@RequestMapping("/file")
public class FileController {

	@RequestMapping("/upload.action")
	@ResponseBody
	public Msg upload(MultipartFile file, HttpServletRequest request)
			throws Exception {
		System.out.println("文件名："+file.getOriginalFilename());
		if (file != null) {
			String fileName = file.getOriginalFilename();
			//判断是不是图片
			String extName=fileName.substring(fileName.lastIndexOf(".")+1,fileName.length());
			String regex="(gif|jpg|jpeg|png|GIF|JPG|PNG)";
			if(!Pattern.matches(regex, extName)){
				return Msg.fail();
			}
			fileName =FileUtil.saveFile(file, request);
			// 将文件名包括路径保存到数据并返回
			return Msg.success().add("fileName", fileName);
		}
		return Msg.fail();
	}
	/**
	 * 删除图片
	 * @param isImg
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/checkImg.action")
	@ResponseBody
	public Msg checkImg(String isImg ,HttpServletRequest request) throws Exception{
		
		if(isImg!=null&&!("".equals(isImg))){				
			FileUtil.deleteFile(isImg,request);
			return Msg.success();
		}
		return Msg.fail();
	}
	
	@RequestMapping("/batchUpload")
	@ResponseBody
	public Msg batchUpload(MultipartFile file[], HttpServletRequest request)
			throws Exception {
		 
		if (file != null&&file.length>0) {
			
			//上传成功图片名称字符串
			StringBuffer url=new StringBuffer();
			//上传失败图片名称字符串
			 
			Map<String, String>fail_msg=new HashMap<String, String>();
			for(MultipartFile file2:file){
				String fileName = file2.getOriginalFilename();
				//判断是不是图片
				String extName=fileName.substring(fileName.lastIndexOf(".")+1,fileName.length());
				String regex="(gif|jpg|jpeg|png|GIF|JPG|PNG)";
				if(!Pattern.matches(regex, extName)){
					fail_msg.put(fileName, "不是图片格式");
				}
				try {
					fileName =FileUtil.saveFile(file2, request);
					url.append(fileName).append(",");
				} catch (Exception e) {
					fail_msg.put(fileName,"上传出现异常！");
					 e.printStackTrace();
				}
			}
			// 将文件名包括路径保存到数据并返回
			 
			return Msg.success().add("url", url);
		}
		return Msg.fail();
	}
}
