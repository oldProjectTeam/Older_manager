package com.older.manager.service.oldfront;

import com.older.manager.bean.Oldmanaccount;


public interface IOldmanaccountService {

	/**
	 * 老人登录处理方法
	 * @param account：账户名
	 * @param password：密码
	 * @return
	 * @throws Exception
	 */
	public Oldmanaccount olderLogin(String account,String password)throws Exception;
	
	/**
	 * 修改账户信息
	 * @param account
	 * @throws Exception
	 */
	public void updateAccount(Oldmanaccount account)throws Exception;
	
	/**
	 * 获得老人账户信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Oldmanaccount getOldmanaccount(Integer id)throws Exception;
}
