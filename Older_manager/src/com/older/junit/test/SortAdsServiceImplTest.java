package com.older.junit.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.Sortads;
import com.older.manager.service.oldback.shop.SortAdsService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
/**
 * 广告分类管理
 * @author 疯癫
 *
 */
public class SortAdsServiceImplTest {
	@Autowired
	@Qualifier("sortAdsServiceImpl")
   private SortAdsService sortAdsService;
	
	@Test
	public void testAddSortAds()throws Exception{
		for (int i = 0; i <2; i++) {
			Sortads sortads=new Sortads();
			sortads.setSortname("顶部图片"+i);
			sortads.setSortnum(1+i);
			sortads.setSortcontent("夏装"+i);
			sortads.setSortjointime(new Date());
			sortads.setSortstate("启用"+i);
			sortAdsService.addSortAds(sortads);

		}
		
	}
	
	/**
	 * 模糊查询
	 * @throws Exception
	 */
	@Test
	public void selectAll()throws Exception{
		System.out.println("******************"+sortAdsService.selectAllSortAds("", "").size());
	}
}
