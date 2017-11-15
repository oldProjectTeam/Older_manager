/**
 * 
 */
package com.older.manager.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ym
 * 字符匹配
 */

public class RegexText {

	private static String RULE_EMAIL = "^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$";
	private static String RULE_Mobiles = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0,1,2,5-9])|(177))\\d{8}$";
	private static String RULE_Chinese = "^([\u4E00-\uFA29]|[\uE7C7-\uE7F3])*$";

	/**
	 * @Title:   checkEmaile
	 * @Description:  检测邮箱
	 * @param:    @param email
	 * @param:    @return   
	 * @return:   boolean   
	 * @throws
	 */
	public static boolean checkEmaile(String email) {
		Pattern p = Pattern.compile(RULE_EMAIL);
		Matcher m = p.matcher(email);
		return m.matches();
	}

	/**
	 * @Title:   checkphone
	 * @Description:  检测手机电话
	 * @param:    @param mobiles
	 * @param:    @return   
	 * @return:   boolean   
	 * @throws
	 */
	public static boolean checkphone(String mobiles) {
		Pattern p = Pattern.compile(RULE_Mobiles);
		Matcher m = p.matcher(mobiles);
		return m.matches();
	}

	/**
	 * @Title:   checkTelephone
	 * @Description:  检测固定电话
	 * @param:    @param telephone
	 * @param:    @return   
	 * @return:   boolean   
	 * @throws
	 */
	public static boolean checkTelephone(String telephone) {
		String regex = "^(0\\d{2}-\\d{8}(-\\d{1,4})?)|(0\\d{3}-\\d{7,8}(-\\d{1,4})?)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(telephone);
		return matcher.matches();
	}
	
	/**
	 * @Title:   checkChinese
	 * @Description:  匹配中文
	 * @param:    @param telephone
	 * @param:    @return   
	 * @return:   boolean   
	 * @throws
	 */
	public static boolean checkChinese(String Chinese) {
		Pattern pattern = Pattern.compile(RULE_Chinese);
		Matcher matcher = pattern.matcher(Chinese);
		return matcher.matches();
	}
	
	

}
