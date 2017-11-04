package com.older.manager.controller.oldback.shop;

import java.io.IOException;
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
}
