package com.older.manager.utils;

import java.io.File;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.older.manager.bean.OSSJSON;
import com.qcloud.cos.common_utils.CommonFileUtils;
import com.qcloud.cos.meta.InsertOnly;
import com.qcloud.cos.request.CreateFolderRequest;
import com.qcloud.cos.request.DelFileRequest;
import com.qcloud.cos.request.UploadFileRequest;

public class OSSFileUtils {
	/**
	 * 上传图片到oss对象里面
	 * 
	 * @param path
	 *            本地图片地址(覆盖)
	 * @return
	 */
	public static OSSJSON upload(String cosFilePath, String path) {
		byte[] contentBuffer = null;
		try {
			contentBuffer = CommonFileUtils.getFileContent(path).getBytes(
					Charset.forName(("ISO-8859-1")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		UploadFileRequest overWriteFileRequest = new UploadFileRequest(
				OSSUtils.bucketName, cosFilePath, contentBuffer);
		overWriteFileRequest.setInsertOnly(InsertOnly.OVER_WRITE);
		String overWriteFileRet = OSSUtils.getCOSClientInstance().uploadFile(
				overWriteFileRequest);
		OSSUtils.closeCosClient();
		Gson gson = new Gson();
		return gson.fromJson(overWriteFileRet, OSSJSON.class);
	}

	/**
	 * 创建文件夹,根据日期
	 * 
	 * @return
	 */
	public static Map<String, Object> createFolder() {
		Map<String, Object> map = new HashMap<String, Object>();
		CreateFolderRequest createFolderRequest = new CreateFolderRequest(
				OSSUtils.bucketName, folderName());
		String createFolderRet = OSSUtils.getCOSClientInstance().createFolder(
				createFolderRequest);
		Gson gson = new Gson();
		OSSJSON ossjson = gson.fromJson(createFolderRet, OSSJSON.class);
		map.put("ossjson", ossjson);
		return map;
	}

	public static String folderName() {
		// 创建年月文件夹
		Calendar date = Calendar.getInstance();
		String cosFolderPath = "/upload/img/" + date.get(Calendar.YEAR) + "/"
				+ (date.get(Calendar.MONTH) + 1) + "/";
		return cosFolderPath;
	}

	public static OSSJSON deleteFile(String cosFilePath) {
		DelFileRequest delFileRequest = new DelFileRequest(OSSUtils.bucketName,
				cosFilePath);
		String delFileRet = OSSUtils.getCOSClientInstance().delFile(
				delFileRequest);
		OSSUtils.closeCosClient();
		return new Gson().fromJson(delFileRet, OSSJSON.class);
	}
}
