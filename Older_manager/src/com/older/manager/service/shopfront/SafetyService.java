package com.older.manager.service.shopfront;

import com.older.manager.bean.Users;

/**
 * 安全设置
 * @author 疯癫
 *
 */
public interface SafetyService {
    /**
     * 通过id查
     * @param id
     * @return
     */
	public Users selectUserByid(Integer id);
	/**
	 * 更新密码
	 * @param users
	 */
	public void updateUser(Users users);
	
}
