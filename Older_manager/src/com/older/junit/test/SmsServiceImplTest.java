/**
 * 
 */
package com.older.junit.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.Sms;
import com.older.manager.service.oldback.SmsService;

/**
 * @author ym
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SmsServiceImplTest {

	@Autowired
	SmsService smsService;
	
	@Test
	public void addSmsTest(){
		for (int i = 0; i < 10; i++) {
			Sms sms=new Sms();
			sms.setSender("10086"+i);
			sms.setContent("九九重阳真明媚，一群大雁向南飞；发条短信诉心扉，愿你一生不吃亏，才华时刻能发挥；最后祝你快快乐乐，建健康康，幸幸福福，长命百岁！");
			sms.setSendtime(new Date());
			sms.setReceiverphone("18007831319");
			sms.setReceivername("李四"+i);
			smsService.addSms(sms);
		}
		
	}
	
	@Test
	public void findSmsByIdTest(){
		System.out.println(smsService.findSmsById(3));
	}
	
	@Test
	public void findAllSmsTest(){
		System.out.println(smsService.findAllSms());
	}
	
	@Test
	public void modifySmsTest(){
		Sms sms=new Sms();
		sms.setId(2);
		sms.setContent("今天下午有关于足疗的课程");
		System.out.println(smsService.modifySms(sms));
	}
	
	@Test
	public void deleteSmsByIdTest(){
		System.out.println(smsService.deleteSmsById(10));
	}
	
	@Test
	public void findAllSmsBySearch(){
		System.out.println(smsService.findAllSmsBySearch("","","hah"));
	}
	
}
