package com.older.manager.service;

import com.older.manager.bean.Oldman;
import com.older.manager.bean.Oldmanaccount;

/**
 * 处理用户相关操作
 * 
 * @author Administrator
 * 
 */
public interface IUserService {
	/**
	 * 老人登录
	 * 
	 * @param oldman
	 * @return
	 */
	public Oldmanaccount loginForOldman(Oldmanaccount oldmanaccount);
}
