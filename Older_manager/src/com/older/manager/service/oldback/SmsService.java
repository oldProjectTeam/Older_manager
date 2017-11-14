/**
 * 
 */
package com.older.manager.service.oldback;

import java.util.List;
import java.util.Map;

import com.older.manager.bean.Sms;

/**
 * @author ym
 *
 */
public interface SmsService {

	
	/**
	 * @Title:   findSmsById
	 * @Description:  通过id查询信息
	 * @param:    @param id
	 * @param:    @return   
	 * @return:   Sms   
	 * @throws
	 */
	public Sms findSmsById(int id);
	
	/**
	 * @Title:   findAllSms
	 * @Description:  查询所有的短信
	 * @param:    @return   
	 * @return:   List<Sms>   
	 * @throws
	 */
	public List<Sms> findAllSms();
	
	/**
	 * @Title:   findAllSmsBySearch
	 * @Description:  通过短信的搜索信息来查询短信
	 * @param:    @param sender
	 * @param:    @param receiverphone
	 * @param:    @param receivername
	 * @param:    @return   
	 * @return:   List<Sms>   
	 * @throws
	 */
	public List<Sms> findAllSmsBySearch(String sender,String receiverphone ,String receivername);
	
	/**
	 * @Title:   addSms
	 * @Description:  添加短信
	 * @param:    @param sms
	 * @param:    @return   
	 * @return:   int   
	 * @throws
	 */
	public int addSms(Sms sms);
	
	/**
	 * @Title:   modifySms
	 * @Description:  修改短信
	 * @param:    @param sms
	 * @param:    @return   
	 * @return:   int   
	 * @throws
	 */
	public int modifySms(Sms sms);
	
	/**
	 * @Title:   deleteSmsById
	 * @Description:  根据id删除短信
	 * @param:    @param id
	 * @param:    @return   
	 * @return:   int   
	 * @throws
	 */
	public int deleteSmsById(int id);

	/**
	 * 发送短信
	 * @param phone
	 * @param content
	 * @return
	 */
	public Map<String, Object> sendMessage(String phone, String content);
	
	
}
