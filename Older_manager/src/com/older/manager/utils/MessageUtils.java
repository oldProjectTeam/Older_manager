package com.older.manager.utils;

import java.util.HashMap;
import java.util.Map;

public class MessageUtils {
	// 用户名
	private static String Uid = "gyAdmin";

	// 接口安全秘钥
	private static String Key = "539f202177466505240b";

	/**
	 * 发送短信
	 * 
	 * @param phone
	 *            手机号码，多个号码如13800000000,13800000001,13800000002
	 * @param msg
	 *            短信内容
	 * @return
	 */
	public static Map<String, Object> sendMessage(String phone, String msg) {
		HttpClientUtil client = HttpClientUtil.getInstance();
		// UTF发送
		int result = client.sendMsgUtf8(Uid, Key, msg, phone);
		String errorMsg = client.getErrorMsg(result);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", result);
		map.put("errorMsg", errorMsg);
		map.put("msg", msg);
		return map;
	}
}
