package com.older.manager.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.Giftexchange;
import com.older.manager.bean.Giftmanagement;
import com.older.manager.bean.Oldman;
import com.older.manager.bean.Oldmanaccount;
import com.older.manager.service.oldback.IGiftexchangeService;

/**
 * 礼品兑换测试用例
 * @author lenovo
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class GiftexchangServiceImplTest {

	@Autowired
	IGiftexchangeService giftexchangeService;
	@Test
	public void testSelectGiftExchangeAndOldmanByCondition() {
		Giftexchange giftexchange=new Giftexchange();
		Oldmanaccount oldmanaccount=new Oldmanaccount();
		Oldman oldman=new Oldman();
		oldman.setName("老人");
		oldmanaccount.setOldman(oldman);
		giftexchange.setOldmanaccount(oldmanaccount);
		/*//2. 
		 * Giftmanagement giftmanagement=new Giftmanagement();
		giftmanagement.setGiftname("大米");
		giftexchange.setGiftmanagement(giftmanagement);*/
		  List<Giftexchange>list=giftexchangeService.selectGiftExchangeAndOldmanByCondition(giftexchange);
		  System.out.println(list.toString());
	}

	@Test
	public void testInsertGiftexchange() {
		Giftexchange giftexchange=new Giftexchange();
		 
		for(int i=23;i<34;i++){
			 giftexchange.setOldmanaccountId(i);
			giftexchange.setGiftmanagementId(i);
			giftexchange.setExchangenum(i);
			giftexchange.setExchangeintegral(i+1);
			giftexchange.setGiftexchange1("兑换成功");
			giftexchangeService.insertGiftexchange(giftexchange);
		}
	}

	@Test
	public void testUpdateGiftexchange() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindGiftexchangeById() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteGiftexchange() {
		fail("Not yet implemented");
	}

	@Test
	public void testBatchDeleteGiftexchange() {
		fail("Not yet implemented");
	}

}
