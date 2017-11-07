package com.older.manager.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

public class FileUtil {
	/**
	 * 保存文件功能
	 * 
	 *  
	 */
	public static String saveFile(MultipartFile file,HttpServletRequest request) throws Exception {
		if(file==null) return null;
		String rootPath = request.getSession().getServletContext()
				.getRealPath("upload/img/");
		String originalFileName = file.getOriginalFilename();
		String extName=originalFileName.substring(originalFileName.lastIndexOf("."));
		String fileName = UUID.randomUUID().toString();
		// 创建年月文件夹
		Calendar date = Calendar.getInstance();
		File dateDirs = new File(date.get(Calendar.YEAR) + File.separator
				+ (date.get(Calendar.MONTH) + 1));
		File newFile = new File(rootPath + File.separator + dateDirs
				+ File.separator + fileName+extName);
		// 判断目标文件所在目录是否存在
		if (!newFile.getParentFile().exists()) {
			// 如果目标文件所在的目录不存在，则创建父目录
			newFile.getParentFile().mkdirs();
			 System.out.println("文件夹创建成功：");
		}
		file.transferTo(newFile);
		String url="upload/img/"+date.get(Calendar.YEAR) + "/"
				+ (date.get(Calendar.MONTH) + 1) + "/" +fileName+extName;
	   //返回完成的路劲名
		 System.out.println("完成的路径名："+url);
		return url;
	}

	/**
	 * 
	 * @param filePath
	 * @param fileName
	 * @throws Exception
	 */
	public static void deleteFile(String filePath, String fileName)
			throws Exception {
		File file = new File(filePath +File.separator+ fileName);
		if (file.exists()) {
			file.delete();
		}
	}
	
	/**
	 * 
	 * @param filePath
	 * @param 
	 * @throws Exception
	 */
	public static void deleteFile(String fileName,HttpServletRequest request)
			throws Exception {
		String rootPath = request.getSession().getServletContext()
				.getRealPath(fileName);
		File file = new File(rootPath);
		if (file.exists()) {
			file.delete();
		}
	}
	/**
	 * 上传文件
	 * @param file：上传的问价
	 * @param savePath：保存路劲
	 * @param fileName：文件名，包括后缀名
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	public static String uploadFile(MultipartFile file,String savePath,String fileName) throws IllegalStateException, IOException{
		String extName=fileName.substring(fileName.lastIndexOf("."));
		fileName = UUID.randomUUID().toString();
		String path=savePath+File.separator+fileName+extName;
		File newfile=new File(path);
		file.transferTo(newfile);
		return fileName+extName;
	}
}
