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
 * @author ym 上传文件的一个类
 * 
 */
public class SaveFile {

	/**
	 * @Title: saveImg
	 * @Description: 保存图片文件，返回保存的文件的路径
	 * @param: @param file
	 * @param: @param request
	 * @param: @return
	 * @param: @throws IllegalStateException
	 * @param: @throws IOException
	 * @return: String
	 * @throws
	 */
	public static String saveImg(MultipartFile file, HttpServletRequest request)
			throws IllegalStateException, IOException {

		String fileUrl = null;
		if (file != null) {

			String rootPath = request.getSession().getServletContext()
					.getRealPath("upload/img/");
			String originalFileName = file.getOriginalFilename();
			// 创建年月文件夹
			Calendar date = Calendar.getInstance();
			File dateDirs = new File(date.get(Calendar.YEAR) + File.separator
					+ (date.get(Calendar.MONTH) + 1));

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

		}
		;
		return fileUrl;

	}

	public static boolean delete(String fileName,HttpServletRequest request) {
		File file = new File(request.getServletContext()
				.getRealPath(fileName));
		/*request.getServletContext()
		.getRealPath*/
		if (!file.exists()) {
			System.out.println("删除文件失败:" + fileName + "不存在！");
			return false;
		} else {
			if (file.isFile())
				return deleteFile(fileName,request);
			else
				return deleteDirectory(fileName,request);
		}
	}

	public static boolean deleteDirectory(String dir,HttpServletRequest request) {
		// 如果dir不以文件分隔符结尾，自动添加文件分隔符
		if (!dir.endsWith(File.separator))
			dir = dir + File.separator;
		File dirFile = new File(request.getServletContext()
				.getRealPath(dir));
		// 如果dir对应的文件不存在，或者不是一个目录，则退出
		if ((!dirFile.exists()) || (!dirFile.isDirectory())) {
			System.out.println("删除目录失败：" + dir + "不存在！");
			return false;
		}
		boolean flag = true;
		// 删除文件夹中的所有文件包括子目录
		File[] files = dirFile.listFiles();
		for (int i = 0; i < files.length; i++) {
			// 删除子文件
			if (files[i].isFile()) {
				flag = SaveFile.deleteFile(files[i].getAbsolutePath(),request);
				if (!flag)
					break;
			}
			// 删除子目录
			else if (files[i].isDirectory()) {
				flag = SaveFile.deleteDirectory(files[i].getAbsolutePath(),request);
				if (!flag)
					break;
			}
		}
		if (!flag) {
			System.out.println("删除目录失败！");
			return false;
		}
		// 删除当前目录
		if (dirFile.delete()) {
			System.out.println("删除目录" + dir + "成功！");
			return true;
		} else {
			return false;
		}
	}

	public static boolean deleteFile(String fileName,HttpServletRequest request) {
		File file = new File(request.getServletContext()
				.getRealPath(fileName));
		// 如果文件路径所对应的文件存在，并且是一个文件，则直接删除
		if (file.exists() /*&& file.isFile()*/) {
			if (file.delete()) {
				System.out.println("删除单个文件" + fileName + "成功！");
				return true;
			} else {
				System.out.println("删除单个文件" + fileName + "失败！");
				return false;
			}
		} else {
			System.out.println("删除单个文件失败：" + fileName + "不存在！");
			return false;
		}
	}

	public static String saveVideo(MultipartFile file,
			HttpServletRequest request) throws IllegalStateException,
			IOException {

		String fileUrl = null;
		if (file != null) {

			String rootPath = request.getSession().getServletContext()
					.getRealPath("upload/video/");
			String originalFileName = file.getOriginalFilename();

			// 创建年月文件夹
			Calendar date = Calendar.getInstance();
			String NewfileNames = date.get(Calendar.YEAR)
					+ ""
					+ date.get(Calendar.MONTH)
					+ ""
					+ date.get(Calendar.DATE)
					+ ""
					+ date.get(Calendar.HOUR)
					+ ""
					+ date.get(Calendar.MINUTE)
					+ ""
					+ date.get(Calendar.MILLISECOND)
					+ ""
					+ originalFileName.substring(originalFileName
							.lastIndexOf("."));
			File dateDirs = new File(date.get(Calendar.YEAR) + File.separator
					+ (date.get(Calendar.MONTH) + 1));

			File newFile = new File(rootPath + File.separator + dateDirs
					+ File.separator + NewfileNames);

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
			// 完整的视频路径
			fileUrl = "upload/video/" + +date.get(Calendar.YEAR) + "/"
					+ (date.get(Calendar.MONTH) + 1) + "/" + NewfileNames;

		};
		return fileUrl;

	}

}
