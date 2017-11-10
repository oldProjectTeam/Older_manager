/**
 * 
 */
package com.older.junit.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.older.manager.bean.Recomactivitydetails;
import com.older.manager.service.oldback.RecomActivityDetailsService;

/**
 * @author ym
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class RecomActivityDetailsServiceImplTest {

	
	@Autowired
	RecomActivityDetailsService recomActivityDetailsService;
	
	@Test
	public void addRecomActivityDetailsTest(){
		Recomactivitydetails recomactivitydetails=new Recomactivitydetails();
		recomactivitydetails.setOldmanId(56);
		recomactivitydetails.setRecomactivityId(1);
		recomactivitydetails.setRecomtime(new Date());
		
		recomActivityDetailsService.addRecomActivityDetails(recomactivitydetails);
	}
	@Test
	public void list(){
		System.out.println("---------------"+recomActivityDetailsService.findAllRecomactivitydetails().size());
	}
	
	@Test
	public void findRecomActivityDetailsTest(){
		System.out.println(recomActivityDetailsService.findRecomactivitydetailsById(14));
	}
	
	@Test
	public void findAllRecomactivitydetailsBySearchTest(){
		System.out.println(recomActivityDetailsService.findAllRecomactivitydetailsBySearch("张三", "", "未推荐"));
	}
	
}
