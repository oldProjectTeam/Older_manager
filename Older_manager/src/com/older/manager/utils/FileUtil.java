package com.older.manager.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

public class FileUtil {
	/**
	 * 保存文件功能
	 * 
	 * @param orgFile
	 *            要保存的文件
	 * @param savePath
	 *            保存的路径(物理路径)
	 * @param orgFileName
	 *            原文件名
	 * @return
	 * @throws Exception
	 */
	public static String saveFile(File orgFile, String savePath,
			String orgFileName) throws Exception {
		// 生成文件名
		String fileName = UUID.randomUUID().toString();
		// 处理扩展名
		String extName = orgFileName.substring(orgFileName.lastIndexOf("."));
		FileOutputStream os = new FileOutputStream(new File(savePath + fileName
				+ extName));
		FileInputStream is = new FileInputStream(orgFile);
		byte[] data = new byte[1024];
		int length = 0;
		try {
			while ((length = is.read(data)) != -1) {
				os.write(data, 0, length);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (is != null) {
				is.close();
			}
			if (os != null) {
				os.close();
			}
		}
		return fileName + extName;
	}

	public static void deleteFile(String filePath, String fileName)
			throws Exception {
		File file = new File(filePath + fileName);
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
