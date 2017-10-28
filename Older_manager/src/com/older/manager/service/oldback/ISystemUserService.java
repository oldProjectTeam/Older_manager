package com.older.manager.service.oldback;

import com.older.manager.bean.User;

public interface ISystemUserService {

	/**
	 * 管理员登录
	 * @param user
	 * @return
	 */
	User loginForSystemUser(User user);

}
