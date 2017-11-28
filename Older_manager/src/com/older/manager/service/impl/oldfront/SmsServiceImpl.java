package com.older.manager.service.impl.oldfront;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.Sms;
import com.older.manager.bean.SmsExample;
import com.older.manager.mapper.SmsMapper;
import com.older.manager.service.oldfront.ISmsService;

@Service
public class SmsServiceImpl implements ISmsService {

	@Autowired
	SmsMapper smsMapper;
	@Override
	public List<Sms> findAll(Sms sms) throws Exception {
		SmsExample example=new SmsExample();
		SmsExample.Criteria criteria=example.createCriteria();
		criteria.andReceiverphoneEqualTo(sms.getReceiverphone());
		if(sms!=null){
			if(sms.getSendtime1()!=null&&sms.getSendtime2()!=null){
				criteria.andSendtimeBetween(sms.getSendtime1(), sms.getSendtime2());
			}
		}
		return smsMapper.selectByExample(example);
	}

	@Override
	public Sms findSms(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return smsMapper.selectByPrimaryKey(id);
	}

	@Override
	public void deleteSms(Integer id) throws Exception {
		// TODO Auto-generated method stub
		smsMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void batchDelSms(String account) throws Exception {
		// TODO Auto-generated method stub
		SmsExample example=new SmsExample();
		SmsExample.Criteria criteria=example.createCriteria();
		 criteria.andReceiverphoneEqualTo(account);
		smsMapper.deleteByExample(example);
	}

	@Override
	public Integer getCount(String receiverphone) throws Exception {
		// TODO Auto-generated method stub
		SmsExample example=new SmsExample();
		SmsExample.Criteria criteria=example.createCriteria();
		criteria.andReceiverphoneEqualTo(receiverphone);
		return smsMapper.countByExample(example);
	}

}
