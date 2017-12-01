package com.oss.gy.utils;

import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.sign.Credentials;

public class OSSUtils {
	// 设置用户属性, 包括appid, secretId和SecretKey
	public static final long appId = 1252357563;
	public static final String secretId = "AKIDb8B8HIuiAScgrtAbJpMoBNNPEm9kKcnm";
	public static final String secretKey = "zwmZR9f0sRD4kEcs1zlQuCJExUwHRRG8";
	// 设置要操作的bucket
	public static final String bucketName = "gyadmin";

	public static COSClient client = null;

	/**
	 * 创建COSClient实例
	 * 
	 * @return
	 */
	public static COSClient getCOSClientInstance() {
		// 初始化客户端配置
		ClientConfig clientConfig = new ClientConfig();
		// 设置bucket所在的区域,成都
		clientConfig.setRegion("cd");
		// 初始化秘钥信息
		Credentials cred = new Credentials(appId, secretId, secretKey);
		// 初始化cosClient
		client = new COSClient(clientConfig, cred);
		return client;
	}

	/**
	 * 关闭COSClient实例
	 */
	public static void closeCosClient() {
		if (client != null) {
			client.shutdown();
		}
	}
}
