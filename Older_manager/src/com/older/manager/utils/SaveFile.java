/**
 * 
 */
package com.older.manager.utils;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author ym
 * 上传文件的一个类
 *
 */
public class SaveFile {
	
	/**
	 * @Title:   saveImg
	 * @Description:  保存图片文件，返回保存的文件的路径
	 * @param:    @param file
	 * @param:    @param request
	 * @param:    @return
	 * @param:    @throws IllegalStateException
	 * @param:    @throws IOException   
	 * @return:   String   
	 * @throws
	 */
	public static String saveImg(MultipartFile file,HttpServletRequest request) throws IllegalStateException, IOException{
		
		String fileUrl = null;
		if (file != null) {

			String rootPath = request.getSession().getServletContext().getRealPath("upload/img/");
			String originalFileName = file.getOriginalFilename();
			// 创建年月文件夹
			Calendar date = Calendar.getInstance();
			File dateDirs = new File(date.get(Calendar.YEAR) + File.separator+ (date.get(Calendar.MONTH) + 1));
			
			File newFile = new File(rootPath + File.separator + dateDirs
					+ File.separator + originalFileName);

			// 判断目标文件所在目录是否存在
			if (!newFile.getParentFile().exists()) {
				// 如果目标文件所在的目录不存在，则创建父目录
				newFile.getParentFile().mkdirs();
				// System.out.println("文件夹创建成功：");
			}
			// 将内存中的数据写入磁盘
			if (newFile.exists()) {
				System.out.println(originalFileName + "已经存在");
			} else {
				file.transferTo(newFile);
			}
			// 完整的图片路径
			fileUrl = "upload/img/" + +date.get(Calendar.YEAR) + "/"
					+ (date.get(Calendar.MONTH) + 1) + "/" + originalFileName;

		};
		return fileUrl;
		
	}

}
