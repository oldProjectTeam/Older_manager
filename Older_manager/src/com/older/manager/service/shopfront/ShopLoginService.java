/**
 * 
 */
package com.older.manager.service.shopfront;

import com.older.manager.bean.Users;

/**
 * @author ym
 * @date 2017年11月16日 下午1:54:00
 */
public interface ShopLoginService {

	// 根据用户的身份和密码 进行认证，如果认证通过，返回用户身份信息
	public Users authenticat(String usersacconut, String password)
			throws Exception;

	// 根据用户账号查询用户信息
	public Users findSysUserByUserCode(String usersacconut)
			throws Exception;

}
