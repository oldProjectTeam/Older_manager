package com.older.manager.test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.Giftmanagement;
import com.older.manager.service.oldback.IGiftmanagementService;
import com.older.manager.utils.UUIDTools;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class GiftmanagementServiceImplTest {

	@Autowired
	IGiftmanagementService giftmanagementService;
	@Test
	public void testQueryAllGift() {
		Giftmanagement gm=new Giftmanagement();
		gm.setGiftname("大米1");
		List<Giftmanagement>list=giftmanagementService.queryAllGift(gm);
		for(Giftmanagement g:list)
			System.out.println("Id:"+g.getId()+" 名称："+g.getGiftname());
	}

	@Test
	public void testInsertGift() {
		Giftmanagement g=new Giftmanagement();
		for(int i=1;i<50;i++){
			g.setGiftname("新大米"+i);
			g.setGiftnumber(UUIDTools.getUUId());
			g.setIntegral(i+10);
			giftmanagementService.insertGift(g);
		}
	}

	@Test
	public void testUpdateGift() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindGiftmanagementById() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteGift() {
		fail("Not yet implemented");
	}

	@Test
	public void testBatchDeleteGift() {
		fail("Not yet implemented");
	}

}
