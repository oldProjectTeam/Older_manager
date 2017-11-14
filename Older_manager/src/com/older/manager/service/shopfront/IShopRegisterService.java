package com.older.manager.service.shopfront;

import java.util.Map;

import com.older.manager.bean.Users;

public interface IShopRegisterService {

	/**
	 * 使用邮箱注册
	 * @param users
	 * @return
	 */
	Map<String, Object> registerOfEmail(Users users);

	/**
	 * 使用手机号注册
	 * @param users
	 * @return
	 */
	Map<String, Object> registerOfPhone(Users users);

	/**
	 * 获取验证码
	 * @return
	 */
	Map<String, Object> getCode(String phone);

}
