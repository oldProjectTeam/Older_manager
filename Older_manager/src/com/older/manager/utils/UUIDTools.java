package com.older.manager.utils;

import java.util.UUID;


public class UUIDTools {

	/**
	 * 得到长度为12的唯一编号
	 * @return
	 */
	public static String getUUId(){
		String number=UUID.randomUUID().toString();
		number=number.substring(number.lastIndexOf("-")+1);
		return number;
	}
}
