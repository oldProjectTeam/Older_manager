package com.older.manager.utils;

/**
 * 随机验证码,6位
 * 
 * @author Administrator
 * 
 */
public class CodeUtils {
	public static String getCode() {
		return (int) ((Math.random() * 9 + 1) * 100000) + "";
	}
}
