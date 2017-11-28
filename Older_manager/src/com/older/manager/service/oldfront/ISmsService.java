package com.older.manager.service.oldfront;

import java.util.List;

import com.older.manager.bean.Sms;

public interface ISmsService {

	/**
	 * 根据老人登录账号 查询老人所有短信记录
	 * @param sms
	 * @return
	 * @throws Exception
	 */
	public List<Sms>findAll(Sms sms)throws Exception;
	
	/**
	 * 根据id查询单条短信信息
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Sms findSms(Integer id)throws Exception;
	
	/**
	 * 删除短信
	 * @param id
	 * @throws Exception
	 */
	public void deleteSms(Integer id)throws Exception;
	
	/**
	 * 清空短信
	 * @param account
	 * @throws Exception
	 */
	public void batchDelSms(String account)throws Exception;
	
	/**
	 * 根据老人登录账号查询短信总数
	 * @param receiverphone
	 * @return
	 * @throws Exception
	 */
	public Integer getCount(String receiverphone)throws Exception;
}
