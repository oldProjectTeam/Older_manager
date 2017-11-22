package com.older.manager.service.oldfront;

import com.older.manager.bean.Oldman;


public interface IOldmanService {

	/**
	 * 更新老人数据
	 * @param oldman
	 * @throws Exception
	 */
	public void notifyOlder(Oldman oldman)throws Exception;
	
	/**
	 * 获取老人信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	 public Oldman getOldman(Integer id)throws Exception;
}
