package com.older.junit.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.Adslist;
import com.older.manager.service.oldback.shop.AdsListService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
/**
 * 广告列表
 * @author 疯癫
 *
 */
public class AdsListServiceImplTest {
	 @Autowired
	 @Qualifier("adsListServiceImpl")
     private AdsListService adsListService;
	 
	 
	 
	 /**
	  * 增加
	  * @throws Exception
	  */
	 @Test
	 public void  testAdd()throws Exception{
		 for (int i = 0; i <15; i++) {
			 Adslist adslist=new Adslist();
			 adslist.setSortname("广告"+i);
			 adslist.setSort(i+1);
			 adslist.setSortphoto("假装有图片"+i);
			 adslist.setSortsize("1920*1080");
			 adslist.setSorthref("www.baidu.com");
			 adslist.setSortjointime(new Date());
			 adslist.setSortstate("显示");
			 adslist.setSortadsid(7);
			 adsListService.addAdsList(adslist);
		}

		 
	 }
}
