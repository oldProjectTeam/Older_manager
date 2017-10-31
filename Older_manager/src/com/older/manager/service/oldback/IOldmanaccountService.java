package com.older.manager.service.oldback;

import java.util.List;

import com.older.manager.bean.Oldman;
import com.older.manager.bean.Oldmanaccount;

public interface IOldmanaccountService {

	/**
	 * 查询所有不在账户表的老人信息
	 * @param oldman
	 * @return
	 */
	List<Oldman>selectOldManNotAccount(Oldman oldman);
	
	/**
	 * 批量增加老人账户
	 * @param oldmans
	 */
	public void batchInsertAccount(List<Oldman> oldmans);
	
	/**
	 * 查询所有账户信息和关联的老人信息
	 * @param oldmanaccount
	 * @return
	 */
	public List<Oldmanaccount>selectAccountAndOldmanByCondiction(Oldmanaccount oldmanaccount);


	/**
	 * 根据id,删除账户信息
	 * @param id
	 */
	public void deleteAccount(Integer id);
	
	/**
	 * 根据多id批量删除账户信息
	 * @param ids
	 */
	public void batchDeleteAccount(List<Integer> ids);
	
	/**
	 * 密码重置
	 * @param id
	 */
	public void passwordResrt(Integer id);
}
