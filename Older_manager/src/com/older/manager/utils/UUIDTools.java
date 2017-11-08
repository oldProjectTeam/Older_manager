package com.older.manager.utils;

import java.util.Calendar;
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
	
	/**
	 * 返回当前时间组成的最多14位字符串，精确到秒
	 * @return
	 */
	public static String getNumber(){
		Calendar date = Calendar.getInstance();
		StringBuffer str=new StringBuffer();
		int year=date.get(Calendar.YEAR);
		int month=date.get(Calendar.MONTH)+1;
		int day=date.get(Calendar.DATE);
		int hou=date.get(Calendar.HOUR);
		int min=date.get(Calendar.MINUTE);
		int second=date.get(Calendar.SECOND);
		 
		str.append(year).append(month).append(day).append(hou).append(min).append(second);
		return str.toString();
	}
}
