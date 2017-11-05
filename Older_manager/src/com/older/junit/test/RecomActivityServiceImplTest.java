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

import com.older.manager.bean.Recomactivity;
import com.older.manager.mapper.RecomactivityMapper;
import com.older.manager.service.oldback.RecomActivityService;

/**
 * @author ym
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class RecomActivityServiceImplTest {

	@Autowired
	RecomActivityService recomActivityService;
	
	
	@Test
	public void addRecomActivity(){
		Recomactivity recomactivity=new Recomactivity();
		recomactivity.setActivityId(8);
		recomactivity.setRecomtime(new Date());
		recomactivity.setRecompeople("小张");
		recomActivityService.addRecomactivity(recomactivity);
	}
	
	@Test
	public void findRecomactivityIncludeActivityByIdTest(){
		System.out.println(recomActivityService.findRecomactivityIncludeActivityById(13));;
	}
}
