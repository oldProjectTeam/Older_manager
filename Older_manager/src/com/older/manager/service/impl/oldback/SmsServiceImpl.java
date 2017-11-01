/**
 * 
 */
package com.older.manager.service.impl.oldback;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Sms;
import com.older.manager.bean.SmsExample;
import com.older.manager.mapper.SmsMapper;
import com.older.manager.service.oldback.SmsService;

/**
 * @author ym
 * 
 */
@Service
public class SmsServiceImpl implements SmsService {

	private SmsExample example;

	@Autowired
	SmsMapper smsMapper;

	/**
	 * @Title: findSmsById
	 * @Description: 根据id查询短信
	 * @param: @param id
	 * @param: @return
	 * @throws
	 */
	@Override
	public Sms findSmsById(int id) {
		// TODO Auto-generated method stub
		return smsMapper.selectByPrimaryKey(id);
	}

	/**
	 * @Title: findAllSms
	 * @Description: 查找所有的短信
	 * @param: @return
	 * @throws
	 */
	@Override
	public List<Sms> findAllSms() {
		// TODO Auto-generated method stub
		return smsMapper.selectByExample(null);
	}

	/**
	 * @Title: findAllSmsBySearch
	 * @Description: 根据搜索信息查找短信
	 * @param: @param sender
	 * @param: @param receiverphone
	 * @param: @param receivername
	 * @param: @return
	 * @throws
	 */
	@Override
	public List<Sms> findAllSmsBySearch(String sender, String receiverphone,
			String receivername) {
		example = new SmsExample();
		if (sender != null && !sender.equals("") && (receiverphone.equals("")||receiverphone==null)
				&& (receivername.equals("")||receivername==null)) {
			System.out.println(".............通过5");
			example.createCriteria().andSenderLike("%" + sender + "%");
			return smsMapper.selectByExample(example);
		} else if (receivername != null && !receivername.equals("")
				&& (receiverphone.equals("") ||receiverphone==null)&& (sender.equals("")||sender==null)) {
			System.out.println(".............通过6");
			example.createCriteria().andReceivernameLike(
					"%" + receivername + "%");
			return smsMapper.selectByExample(example);
		} else if (receiverphone != null && !receiverphone.equals("")
				&& (sender.equals("")||sender==null) && (receivername.equals("")||receivername==null)) {
			System.out.println(".............通过7");
			example.createCriteria().andReceiverphoneLike(
					"%" + receiverphone + "%");
			return smsMapper.selectByExample(example);
		} else if ((sender != null && !sender.equals(""))
				&& (receiverphone.equals("")||receiverphone==null)
				&& (receivername != null && !receivername.equals(""))) {
			System.out.println(".............通过2");
			example.createCriteria().andSenderLike("%" + sender + "%")
					.andReceivernameLike("%" + receivername + "%");
			return smsMapper.selectByExample(example);
		} else if ((sender != null && !sender.equals(""))
				&& (receivername.equals("")||receivername==null)
				&& (receiverphone != null && !receiverphone.equals(""))) {
			System.out.println(".............通过1");
			example.createCriteria().andSenderLike("%" + sender + "%")
					.andReceiverphoneLike("%" + receiverphone + "%");
			return smsMapper.selectByExample(example);
		} else if ((receivername != null && !receivername.equals(""))
				&& (sender.equals("")||sender==null)
				&& (receiverphone != null && !receiverphone.equals(""))) {
			System.out.println(".............通过3");
			example.createCriteria()
					.andReceivernameLike("%" + receivername + "%")
					.andReceiverphoneLike("%" + receiverphone + "%");
			return smsMapper.selectByExample(example);
		} else if ((sender != null && !sender.equals(""))
				&& (receiverphone != null && !receiverphone.equals(""))
				&& (receivername != null && !receivername.equals(""))) {
			System.out.println(".............通过4");
			example.createCriteria().andSenderLike("%" + sender + "%")
					.andReceiverphoneLike("%" + receiverphone + "%")
					.andReceivernameLike("%" + receivername + "%");
			return smsMapper.selectByExample(example);
		} else {
			return null;
		}

	}

	/**
	 * @Title: addSms
	 * @Description: 添加短信
	 * @param: @param sms
	 * @param: @return
	 * @throws
	 */
	@Override
	public int addSms(Sms sms) {
		// TODO Auto-generated method stub
		return smsMapper.insertSelective(sms);
	}

	/**
	 * @Title: modifySms
	 * @Description: TODO
	 * @param: @param sms
	 * @param: @return
	 * @throws
	 */
	@Override
	public int modifySms(Sms sms) {
		// TODO Auto-generated method stub
		return smsMapper.updateByPrimaryKeySelective(sms);
	}

	/**
	 * @Title: deleteSmsById
	 * @Description: 根据id删除短信
	 * @param: @param id
	 * @param: @return
	 * @throws
	 */
	@Override
	public int deleteSmsById(int id) {
		// TODO Auto-generated method stub
		return smsMapper.deleteByPrimaryKey(id);
	}

}
